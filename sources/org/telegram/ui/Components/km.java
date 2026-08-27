package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ km(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.d;
        HashMap hashMap = k21.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(k21.o(messageObject)));
        }
        if (j1Var != null) {
            j1Var.i0(3);
        }
        int i10 = this.b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        org.telegram.ui.kx kxVar = (org.telegram.ui.kx) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.gy gyVar = kxVar.b0;
        ArrayList arrayList = gyVar.N1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        gyVar.N1.add(i10, dialog);
        gyVar.a0[0].q(true);
    }

    private final void c() {
        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.fy fyVar = eyVar.g;
        org.telegram.ui.gy gyVar = eyVar.h;
        gyVar.O1 = true;
        gyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        gyVar.O1 = false;
        ArrayList<TLRPC.Dialog> dialogs = gyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            fyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = gyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            gyVar.A4(true, true);
            fyVar.x.D();
            fyVar.q(true);
            gyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                gyVar.A4(true, true);
                fyVar.q(true);
                gyVar.o3();
            } else {
                if (!gyVar.N1.isEmpty()) {
                    gyVar.N1.remove(0);
                }
                fyVar.x.D();
                fyVar.q(true);
            }
        }
    }

    private final void e() {
        org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) this.c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new hh.x(s50Var, this.b, 6));
        b2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.x1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.b;
            if (z10) {
                launchActivity.I0(i10, tL_help_appUpdate, false);
            } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i10);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:490:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        UndoView undoView2;
        ?? r92;
        e50 e50Var;
        String formatPluralString;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        int size3;
        int dp;
        float f10;
        int i13;
        int i14;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i15 = 5;
        int i16 = 6;
        UndoView undoView3 = null;
        r15 = null;
        String str = null;
        UndoView undoView4 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        switch (this.a) {
            case 0:
                in inVar = (in) this.c;
                int i17 = this.b;
                View view = (View) this.d;
                inVar.R = 0;
                inVar.Q = i17;
                if (view instanceof org.telegram.ui.Cells.l8) {
                    inVar.U((org.telegram.ui.Cells.l8) view, true);
                    return;
                } else {
                    inVar.r.m(inVar.E0);
                    return;
                }
            case 1:
                pu puVar = (pu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i18 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = puVar.X0.c;
                if (n2Var instanceof org.telegram.ui.rn) {
                    org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
                    rnVar.Q7();
                    undoView2 = rnVar.u3;
                } else {
                    if (!(n2Var instanceof ProfileActivity)) {
                        undoView = null;
                        if (undoView == null) {
                            if (hVar.m() == 1) {
                                undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i18), 53);
                                return;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(i18), Integer.valueOf(hVar.m()), null, null);
                                return;
                            }
                        }
                        return;
                    }
                    undoView2 = ((ProfileActivity) n2Var).I;
                }
                undoView = undoView2;
                if (undoView == null) {
                }
            case 2:
                sx sxVar = (sx) this.c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                int i19 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new hh.x(sxVar, i19, i15));
                b2VarArr[0].show();
                return;
            case 3:
                int i20 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i20;
                n2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new cg.m0(n2Var2, i20, callback, i15));
                return;
            case 4:
                f30 f30Var = (f30) this.c;
                int i21 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                pf.j1 j1Var = f30Var.d;
                g30 g30Var = f30Var.w;
                if (i21 != f30Var.n) {
                    return;
                }
                f30Var.h = false;
                TLRPC.Chat chat = g30Var.R;
                iw0 iw0Var = g30Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = j1Var.h;
                    ArrayList arrayList2 = j1Var.g;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int size4 = arrayList.size();
                    for (int i22 = 0; i22 < size4; i22++) {
                        TLObject tLObject = (TLObject) arrayList.get(i22);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    j1Var.i();
                }
                int i23 = f30Var.f - 1;
                boolean z10 = iw0Var.getVisibility() == 0;
                f30Var.l();
                if (f30Var.f > i23) {
                    g30Var.J(i23);
                }
                if (f30Var.h || j1Var.e() || !g30Var.d.S0()) {
                    return;
                }
                iw0Var.e(false, z10);
                return;
            case 5:
                t30 t30Var = (t30) this.c;
                int i24 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = t30Var.K;
                int i25 = t30Var.J;
                if (i24 != t30Var.P) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t30Var.X[0] ? "$" : "#");
                sb2.append(t30Var.U);
                String sb3 = sb2.toString();
                jh.d6 d6Var = t30Var.M;
                if (d6Var == null || !TextUtils.equals(d6Var.C, sb3)) {
                    t30Var.M = new jh.d6(i25, null, sb3);
                }
                if (t30Var.M.i.size() <= 0) {
                    r92 = 1;
                    t30Var.M.p(4, true);
                } else {
                    r92 = 1;
                }
                t30Var.L = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                t30Var.U = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList3.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) i0.a.i(r92, arrayList3);
                    tL_channels_searchPosts.offset_rate = t30Var.V;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i25).getInputPeer(messageObject.messageOwner.peer_id);
                }
                t30Var.Q = ConnectionsManager.getInstance(i25).sendRequest(tL_channels_searchPosts, new cg.m0(t30Var, i24, sb3, i16));
                return;
            case 6:
                k50 k50Var = (k50) this.c;
                int i26 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = k50Var.e0;
                if (k50Var.d0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i26);
                }
                if (!k50Var.j0) {
                    if (i26 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    k50Var.k0 = new CameraSession(k50Var.y, sizeArr[0], k50Var.f0, 256, true);
                    k50Var.r();
                    b50 b50Var = k50Var.d0;
                    CameraSession cameraSession = k50Var.k0;
                    Handler handler = b50Var.getHandler();
                    if (handler != null) {
                        b50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(k50Var.k0, surfaceTexture, new s40(k50Var, 1), new s40(k50Var, 2));
                    return;
                }
                if (k50Var.l0) {
                    Camera2Session camera2Session = k50Var.m0[i26];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i26 == 1) {
                    return;
                }
                b50 b50Var2 = k50Var.d0;
                Camera2Session camera2Session2 = k50Var.n0;
                Handler handler2 = b50Var2.getHandler();
                if (handler2 != null) {
                    b50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                k50Var.n0.open(surfaceTexture);
                return;
            case 7:
                j50 j50Var = (j50) this.c;
                int i27 = this.b;
                e50 e50Var2 = (e50) this.d;
                k50 k50Var2 = j50Var.D0;
                VideoEditedInfo videoEditedInfo = k50Var2.J;
                int i28 = k50Var2.a;
                c50 c50Var = k50Var2.c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    k50Var2.J = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (k50Var2.J.needConvert()) {
                    k50Var2.D = null;
                    k50Var2.E = null;
                    k50Var2.F = null;
                    k50Var2.G = null;
                    VideoEditedInfo videoEditedInfo3 = k50Var2.J;
                    long j10 = videoEditedInfo3.estimatedDuration;
                    double d = j10;
                    e50Var = e50Var2;
                    long j11 = videoEditedInfo3.startTime;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = videoEditedInfo3.endTime;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    videoEditedInfo3.estimatedDuration = j13;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * k50Var2.H));
                    VideoEditedInfo videoEditedInfo4 = k50Var2.J;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i28).cancelFileUpload(k50Var2.T.getAbsolutePath(), false);
                } else {
                    e50Var = e50Var2;
                    k50Var2.J.estimatedSize = Math.max(1L, k50Var2.H);
                }
                VideoEditedInfo videoEditedInfo5 = k50Var2.J;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = k50Var2.D;
                videoEditedInfo5.encryptedFile = k50Var2.E;
                videoEditedInfo5.key = k50Var2.F;
                videoEditedInfo5.iv = k50Var2.G;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = j50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = k50Var2.J;
                if (i27 != 1) {
                    j50Var.h(j50Var.a);
                    videoEditedInfo6.estimatedDuration = k50Var2.b0;
                    NotificationCenter.getInstance(i28).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(k50Var2.M), videoEditedInfo6, j50Var.a.getAbsolutePath(), j50Var.w0);
                    return;
                }
                if (c50Var.c()) {
                    Activity parentActivity = c50Var.getParentActivity();
                    long a2 = c50Var.a();
                    ag.l0 l0Var = new ag.l0(j50Var, e50Var, videoEditedInfo6, 29);
                    g50 g50Var = new g50(j50Var, 0);
                    org.telegram.ui.ActionBar.c6 c6Var = k50Var2.L0;
                    Pattern pattern = y4.a;
                    y4.K(parentActivity, a2, -1L, 0, false, l0Var, g50Var, new w4(c6Var), c6Var);
                } else {
                    e50 e50Var3 = e50Var;
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, j50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (e50Var3 != null) {
                        photoEntry.ttl = e50Var3.c;
                        photoEntry.effectId = e50Var3.d;
                    }
                    k50Var2.c.s(photoEntry, videoEditedInfo6, e50Var3 == null || e50Var3.a, e50Var3 != null ? e50Var3.b : 0, 0, false, e50Var3 != null ? e50Var3.e : 0L);
                }
                k50Var2.J = null;
                return;
            case 8:
                wi0 wi0Var = (wi0) this.c;
                int i29 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i30 = wi0Var.f;
                TextView textView = wi0Var.b;
                MessageObject messageObject2 = wi0Var.s;
                ImageView imageView = wi0Var.d;
                n9 n9Var = wi0Var.e;
                ArrayList arrayList4 = wi0Var.r;
                ArrayList arrayList5 = wi0Var.n;
                if (arrayList5.isEmpty() || arrayList5.size() < i29) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i29, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i29), i29 == arrayList5.size() ? String.valueOf(i29) : i29 + "/" + arrayList5.size());
                }
                if (wi0Var.getMeasuredWidth() > 0) {
                    wi0Var.v = wi0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject2.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i30).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            n9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            n9Var.setVisibility(0);
                            n9Var.setAlpha(0.0f);
                            n9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList6 = tL_messages_messageReactionsList.users;
                            size = arrayList6.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList6.get(i10);
                                i10++;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject2.messageOwner.from_id;
                                int i31 = size;
                                if (peer != null && user2.id != peer.user_id) {
                                    int i32 = 0;
                                    while (true) {
                                        if (i32 < arrayList4.size()) {
                                            int i33 = i32;
                                            if (((vi0) arrayList4.get(i32)).b == user2.id) {
                                                break;
                                            } else {
                                                i32 = i33 + 1;
                                            }
                                        } else {
                                            arrayList4.add(new vi0(0, user2));
                                        }
                                    }
                                }
                                size = i31;
                            }
                            ArrayList<TLRPC.Chat> arrayList7 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList7.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat2 = arrayList7.get(i11);
                                i11++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject2.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 >= arrayList4.size()) {
                                            arrayList4.add(new vi0(0, chat3));
                                        } else if (((vi0) arrayList4.get(i34)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                            }
                            h00 h00Var = wi0Var.a;
                            b9 b9Var = wi0Var.c;
                            wi0Var.setEnabled(arrayList4.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList4.size()) {
                                    b9Var.b(i12, ((vi0) arrayList4.get(i12)).a, i30);
                                } else {
                                    b9Var.b(i12, null, i30);
                                }
                            }
                            size3 = arrayList4.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f10 = AndroidUtilities.dp(12.0f);
                                    }
                                    b9Var.setTranslationX(f10);
                                    b9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    b9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    h00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.go(h00Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f10 = dp;
                            if (LocaleController.isRTL) {
                            }
                            b9Var.setTranslationX(f10);
                            b9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            b9Var.animate().alpha(1.0f).setDuration(220L).start();
                            h00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.go(h00Var)).start();
                            return;
                        }
                    }
                }
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList62 = tL_messages_messageReactionsList.users;
                size = arrayList62.size();
                i10 = 0;
                while (i10 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList72 = tL_messages_messageReactionsList.chats;
                size2 = arrayList72.size();
                i11 = 0;
                while (i11 < size2) {
                }
                h00 h00Var2 = wi0Var.a;
                b9 b9Var2 = wi0Var.c;
                wi0Var.setEnabled(arrayList4.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList4.size();
                if (size3 != 1) {
                }
                f10 = dp;
                if (LocaleController.isRTL) {
                }
                b9Var2.setTranslationX(f10);
                b9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                b9Var2.animate().alpha(1.0f).setDuration(220L).start();
                h00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.go(h00Var2)).start();
                return;
            case 9:
                op0 op0Var = (op0) this.c;
                int i35 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                mp0 mp0Var = op0Var.e;
                sp0 sp0Var = op0Var.G;
                if (i35 != op0Var.r) {
                    return;
                }
                op0Var.h();
                op0Var.E = false;
                op0Var.v = i35;
                if (op0Var.s != i35) {
                    mp0Var.b();
                }
                so0 so0Var = sp0Var.B;
                op0 op0Var2 = sp0Var.I;
                if (so0Var.getAdapter() != op0Var2) {
                    sp0.F0(sp0Var);
                    op0Var2.l();
                }
                for (int i36 = 0; i36 < arrayList8.size(); i36++) {
                    TLObject tLObject2 = ((fp0) arrayList8.get(i36)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i14 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                        MessagesController.getInstance(i14).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i13 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                        MessagesController.getInstance(i13).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !op0Var.d.isEmpty() && arrayList8.isEmpty();
                if (op0Var.d.isEmpty()) {
                    arrayList8.isEmpty();
                }
                if (z11) {
                    sp0.F0(sp0Var);
                }
                op0Var.d = arrayList8;
                mp0Var.f(arrayList8, null);
                int i37 = op0Var.F;
                if (op0Var.h() != 0 || mp0Var.e() || op0Var.E) {
                    sp0Var.t0.b(i37);
                } else {
                    sp0Var.M.e(false, true);
                }
                op0Var.l();
                sp0Var.K0(true);
                return;
            case 10:
                r0.getStoriesController().c(this.b, ((hu0) this.c).f1, (TL_stories.StoryItem) this.d);
                return;
            case 11:
                hu0 hu0Var = (hu0) this.c;
                int i38 = this.b;
                b70 b70Var = (b70) this.d;
                hu0Var.d1(i38);
                b70Var.u();
                return;
            case 12:
                hu0 hu0Var2 = (hu0) this.c;
                hu0Var2.S(this.b, (zk0) this.d, false);
                hu0Var2.F1 = null;
                return;
            case 13:
                ks0 ks0Var = (ks0) this.c;
                int i39 = this.b;
                b70 b70Var2 = (b70) this.d;
                ks0Var.d.c1(i39, false);
                b70Var2.u();
                return;
            case 14:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i40 = this.b;
                if (n2Var3 instanceof org.telegram.ui.rn) {
                    org.telegram.ui.rn rnVar2 = (org.telegram.ui.rn) n2Var3;
                    rnVar2.Q7();
                    undoView3 = rnVar2.u3;
                } else if (n2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) n2Var3).I;
                }
                if (undoView3 != null) {
                    if (hVar3.m() == 1) {
                        undoView3.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i40), 53);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i40), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 15:
                st0 st0Var = (st0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != st0Var.A) {
                    return;
                }
                st0Var.y = ConnectionsManager.getInstance(st0Var.d).sendRequest(tL_messages_search, new hh.u1(st0Var, i41, i16));
                return;
            case 16:
                st0 st0Var2 = (st0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList9 = st0Var2.h;
                int i43 = st0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == st0Var2.A) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i43).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i43).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i43).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        MessageObject messageObject3 = new MessageObject(i43, messages_messages.messages.get(i44), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(st0Var2.w);
                        arrayList9.add(messageObject3);
                    }
                    st0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        st0Var2.s = arrayList9.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        st0Var2.s = true;
                    }
                    st0Var2.G(false);
                    st0Var2.r = false;
                    st0Var2.y = -1;
                    return;
                }
                return;
            case 17:
                hv0 hv0Var = (hv0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                hv0Var.U0 = false;
                if (!hv0Var.R0 && hv0Var.S0) {
                    hv0Var.A(true);
                    return;
                }
                hv0Var.j0 = hv0Var.b1[0];
                hv0Var.j();
                DownloadController.getInstance(i45).removeLoadingFileObserver(s1Var);
                hv0Var.G();
                hv0Var.v();
                return;
            case 18:
                int i46 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i46).getDatabase();
                    if (database != null) {
                        if (tL_messages_emojiGroups == null) {
                            database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 19:
                int i47 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i47).getDatabase();
                        if (database2 != null) {
                            sQLiteCursor = database2.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num2);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    callback2.run(Long.valueOf(r5.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e10) {
                                e = e10;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor3 = num2;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 20:
                rw0 rw0Var = (rw0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var4 = rw0Var.X0.H;
                if (n2Var4 instanceof org.telegram.ui.rn) {
                    org.telegram.ui.rn rnVar3 = (org.telegram.ui.rn) n2Var4;
                    rnVar3.Q7();
                    undoView4 = rnVar3.u3;
                } else if (n2Var4 instanceof ProfileActivity) {
                    undoView4 = ((ProfileActivity) n2Var4).I;
                }
                if (undoView4 != null) {
                    if (hVar4.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i48), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i48), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                wx0 wx0Var = (wx0) this.c;
                String str3 = (String) this.d;
                int i49 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList10 = new ArrayList<>(1);
                arrayList10.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(wx0Var.a).fillWithAnimatedEmoji(arrayList10, 15, false, false, false, new ag.k0(wx0Var, i49, str3, arrayList10));
                return;
            case 22:
                t01 t01Var = (t01) this.c;
                String str4 = (String) this.d;
                int i50 = this.b;
                s01 s01Var = t01Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        t01Var.d = -1;
                        AndroidUtilities.runOnUIThread(new ag.k0(t01Var, t01Var.d, new ArrayList(), new ArrayList(), 28));
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                        break;
                    }
                    int i51 = 0;
                    int i52 = i51 + 1;
                    String[] strArr = new String[i52];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    int size5 = s01Var.d.size();
                    for (int i53 = 0; i53 < size5; i53++) {
                        ArrayList arrayList13 = (ArrayList) s01Var.d.get(i53);
                        String i54 = org.telegram.ui.ActionBar.e5.i(((org.telegram.ui.ActionBar.i6) arrayList13.get(0)).f);
                        String lowerCase2 = i54.toLowerCase();
                        int i55 = 0;
                        while (true) {
                            if (i55 < i52) {
                                String str5 = strArr[i55];
                                if (lowerCase2.contains(str5)) {
                                    arrayList11.add(arrayList13);
                                    arrayList12.add(t01.E(i54, str5));
                                } else {
                                    i55++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ag.k0(t01Var, i50, arrayList11, arrayList12, 28));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 23:
                AndroidUtilities.runOnUIThread(new ag.k0((b11) this.c, (zo) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 29));
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                org.telegram.ui.ci ciVar = (org.telegram.ui.ci) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i56 = this.b;
                if (tLObject4 instanceof TLRPC.User) {
                    ciVar.a = (TLRPC.User) tLObject4;
                    MessagesController.getInstance(i56).putUser(ciVar.a, false);
                }
                h00 h00Var3 = ciVar.c;
                p80 p80Var = ciVar.b;
                ciVar.setEnabled(ciVar.a != null);
                TLRPC.User user3 = ciVar.a;
                if (user3 != null) {
                    p80Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user3)), new cg.b2(ciVar, user3.id, 28)));
                }
                p80Var.animate().alpha(1.0f).setDuration(220L).start();
                h00Var3.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.go(h00Var3)).start();
                return;
        }
    }

    public /* synthetic */ km(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ km(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
