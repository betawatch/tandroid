package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.Serializable;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rm(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.d;
        HashMap hashMap = t21.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(t21.o(messageObject)));
        }
        if (j1Var != null) {
            j1Var.c0(3);
        }
        int i10 = this.b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        org.telegram.ui.jx jxVar = (org.telegram.ui.jx) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.fy fyVar = jxVar.b0;
        ArrayList arrayList = fyVar.N1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        fyVar.N1.add(i10, dialog);
        fyVar.a0[0].q(true);
    }

    private final void c() {
        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ey eyVar = dyVar.g;
        org.telegram.ui.fy fyVar = dyVar.h;
        fyVar.O1 = true;
        fyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        fyVar.O1 = false;
        ArrayList<TLRPC.Dialog> dialogs = fyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            eyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = fyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            fyVar.A4(true, true);
            eyVar.x.D();
            eyVar.q(true);
            fyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                fyVar.A4(true, true);
                eyVar.q(true);
                fyVar.o3();
            } else {
                if (!fyVar.N1.isEmpty()) {
                    fyVar.N1.remove(0);
                }
                eyVar.x.D();
                eyVar.q(true);
            }
        }
    }

    private final void e() {
        org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var == null) {
            return;
        }
        c2Var.setOnCancelListener(new jh.w(r50Var, this.b, 6));
        c2VarArr[0].show();
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0683  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        ?? r9;
        int i10;
        int i11;
        String formatPluralString;
        int size;
        int i12;
        int size2;
        int i13;
        int i14;
        int size3;
        int dp;
        float f9;
        TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList;
        int i15;
        int i16;
        int i17;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i18 = 5;
        UndoView undoView2 = null;
        r14 = null;
        String str = null;
        UndoView undoView3 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        switch (this.a) {
            case 0:
                on onVar = (on) this.c;
                int i19 = this.b;
                View view = (View) this.d;
                onVar.R = 0;
                onVar.Q = i19;
                if (view instanceof org.telegram.ui.Cells.m8) {
                    onVar.U((org.telegram.ui.Cells.m8) view, true);
                    return;
                } else {
                    onVar.r.m(onVar.E0);
                    return;
                }
            case 1:
                wu wuVar = (wu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i20 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = wuVar.X0.c;
                if (o2Var instanceof org.telegram.ui.tn) {
                    org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
                    tnVar.Q7();
                    undoView = tnVar.u3;
                } else {
                    undoView = o2Var instanceof ProfileActivity ? ((ProfileActivity) o2Var).I : null;
                }
                if (undoView != null) {
                    if (hVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i20), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i20), Integer.valueOf(hVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 2:
                zx zxVar = (zx) this.c;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                int i21 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var == null) {
                    return;
                }
                c2Var.setOnCancelListener(new jh.w(zxVar, i21, i18));
                c2VarArr[0].show();
                return;
            case 3:
                int i22 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i22;
                o2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new eg.m0(o2Var2, i22, callback, i18));
                return;
            case 4:
                o30 o30Var = (o30) this.c;
                int i23 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                rf.k1 k1Var = o30Var.d;
                p30 p30Var = o30Var.w;
                if (i23 != o30Var.n) {
                    return;
                }
                o30Var.h = false;
                TLRPC.Chat chat = p30Var.R;
                qw0 qw0Var = p30Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = k1Var.h;
                    ArrayList arrayList2 = k1Var.g;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int size4 = arrayList.size();
                    for (int i24 = 0; i24 < size4; i24++) {
                        TLObject tLObject = (TLObject) arrayList.get(i24);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    k1Var.i();
                }
                int i25 = o30Var.f - 1;
                boolean z10 = qw0Var.getVisibility() == 0;
                o30Var.l();
                if (o30Var.f > i25) {
                    p30Var.I(i25);
                }
                if (o30Var.h || k1Var.e() || !p30Var.d.S0()) {
                    return;
                }
                qw0Var.e(false, z10);
                return;
            case 5:
                c40 c40Var = (c40) this.c;
                int i26 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = c40Var.K;
                int i27 = c40Var.J;
                if (i26 != c40Var.P) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c40Var.X[0] ? "$" : "#");
                sb2.append(c40Var.U);
                String sb3 = sb2.toString();
                lh.e6 e6Var = c40Var.M;
                if (e6Var == null || !TextUtils.equals(e6Var.C, sb3)) {
                    c40Var.M = new lh.e6(i27, null, sb3);
                }
                if (c40Var.M.i.size() <= 0) {
                    r9 = 1;
                    c40Var.M.p(4, true);
                } else {
                    r9 = 1;
                }
                c40Var.L = r9;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r9;
                c40Var.U = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList3.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) j7.l1.i(r9, arrayList3);
                    tL_channels_searchPosts.offset_rate = c40Var.V;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i27).getInputPeer(messageObject.messageOwner.peer_id);
                }
                c40Var.Q = ConnectionsManager.getInstance(i27).sendRequest(tL_channels_searchPosts, new eg.m0(c40Var, i26, sb3, 6));
                return;
            case 6:
                s50 s50Var = (s50) this.c;
                int i28 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = s50Var.e0;
                if (s50Var.d0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i28);
                }
                if (!s50Var.j0) {
                    if (i28 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    s50Var.k0 = new CameraSession(s50Var.y, sizeArr[0], s50Var.f0, 256, true);
                    s50Var.r();
                    k50 k50Var = s50Var.d0;
                    CameraSession cameraSession = s50Var.k0;
                    Handler handler = k50Var.getHandler();
                    if (handler != null) {
                        k50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(s50Var.k0, surfaceTexture, new b50(s50Var, 1), new b50(s50Var, 2));
                    return;
                }
                if (s50Var.l0) {
                    Camera2Session camera2Session = s50Var.m0[i28];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i28 == 1) {
                    return;
                }
                k50 k50Var2 = s50Var.d0;
                Camera2Session camera2Session2 = s50Var.n0;
                Handler handler2 = k50Var2.getHandler();
                if (handler2 != null) {
                    k50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                s50Var.n0.open(surfaceTexture);
                return;
            case 7:
                r50 r50Var = (r50) this.c;
                int i29 = this.b;
                n50 n50Var = (n50) this.d;
                s50 s50Var2 = r50Var.D0;
                VideoEditedInfo videoEditedInfo = s50Var2.J;
                int i30 = s50Var2.a;
                l50 l50Var = s50Var2.c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    s50Var2.J = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (s50Var2.J.needConvert()) {
                    s50Var2.D = null;
                    s50Var2.E = null;
                    s50Var2.F = null;
                    s50Var2.G = null;
                    VideoEditedInfo videoEditedInfo3 = s50Var2.J;
                    long j10 = videoEditedInfo3.estimatedDuration;
                    double d = j10;
                    i11 = i30;
                    long j11 = videoEditedInfo3.startTime;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    i10 = i29;
                    long j12 = videoEditedInfo3.endTime;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    videoEditedInfo3.estimatedDuration = j13;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * s50Var2.H));
                    VideoEditedInfo videoEditedInfo4 = s50Var2.J;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i11).cancelFileUpload(s50Var2.T.getAbsolutePath(), false);
                } else {
                    i10 = i29;
                    i11 = i30;
                    s50Var2.J.estimatedSize = Math.max(1L, s50Var2.H);
                }
                VideoEditedInfo videoEditedInfo5 = s50Var2.J;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = s50Var2.D;
                videoEditedInfo5.encryptedFile = s50Var2.E;
                videoEditedInfo5.key = s50Var2.F;
                videoEditedInfo5.iv = s50Var2.G;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = r50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = s50Var2.J;
                if (i10 != 1) {
                    r50Var.h(r50Var.a);
                    videoEditedInfo6.estimatedDuration = s50Var2.b0;
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(s50Var2.M), videoEditedInfo6, r50Var.a.getAbsolutePath(), r50Var.w0);
                    return;
                }
                if (l50Var.c()) {
                    Activity parentActivity = l50Var.getParentActivity();
                    long a2 = l50Var.a();
                    androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(r50Var, n50Var, videoEditedInfo6, 27);
                    o50 o50Var = new o50(r50Var, 0);
                    org.telegram.ui.ActionBar.c6 c6Var = s50Var2.L0;
                    Pattern pattern = c5.a;
                    c5.K(parentActivity, a2, -1L, 0, false, aVar, o50Var, new a5(c6Var), c6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, r50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (n50Var != null) {
                        photoEntry.ttl = n50Var.c;
                        photoEntry.effectId = n50Var.d;
                    }
                    s50Var2.c.r(photoEntry, videoEditedInfo6, n50Var == null || n50Var.a, n50Var != null ? n50Var.b : 0, 0, false, n50Var != null ? n50Var.e : 0L);
                }
                s50Var2.J = null;
                return;
            case 8:
                fj0 fj0Var = (fj0) this.c;
                int i31 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList2 = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i32 = fj0Var.f;
                TextView textView = fj0Var.b;
                MessageObject messageObject2 = fj0Var.s;
                ImageView imageView = fj0Var.d;
                t9 t9Var = fj0Var.e;
                ArrayList arrayList4 = fj0Var.r;
                ArrayList arrayList5 = fj0Var.n;
                if (arrayList5.isEmpty() || arrayList5.size() < i31) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i31, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i31), i31 == arrayList5.size() ? String.valueOf(i31) : i31 + "/" + arrayList5.size());
                }
                if (fj0Var.getMeasuredWidth() > 0) {
                    fj0Var.v = fj0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject2.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList2.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i32).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList2.reactions.get(0).reaction)) {
                            t9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            t9Var.setVisibility(0);
                            t9Var.setAlpha(0.0f);
                            t9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList6 = tL_messages_messageReactionsList2.users;
                            size = arrayList6.size();
                            i12 = 0;
                            while (i12 < size) {
                                TLRPC.User user = arrayList6.get(i12);
                                i12++;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject2.messageOwner.from_id;
                                if (peer != null) {
                                    i15 = size;
                                    if (user2.id != peer.user_id) {
                                        int i33 = 0;
                                        while (true) {
                                            if (i33 < arrayList4.size()) {
                                                tL_messages_messageReactionsList = tL_messages_messageReactionsList2;
                                                if (((ej0) arrayList4.get(i33)).b == user2.id) {
                                                    break;
                                                }
                                                i33++;
                                                tL_messages_messageReactionsList2 = tL_messages_messageReactionsList;
                                            } else {
                                                tL_messages_messageReactionsList = tL_messages_messageReactionsList2;
                                                arrayList4.add(new ej0(0, user2));
                                            }
                                        }
                                    } else {
                                        tL_messages_messageReactionsList = tL_messages_messageReactionsList2;
                                    }
                                } else {
                                    tL_messages_messageReactionsList = tL_messages_messageReactionsList2;
                                    i15 = size;
                                }
                                tL_messages_messageReactionsList2 = tL_messages_messageReactionsList;
                                size = i15;
                            }
                            ArrayList<TLRPC.Chat> arrayList7 = tL_messages_messageReactionsList2.chats;
                            size2 = arrayList7.size();
                            i13 = 0;
                            while (i13 < size2) {
                                TLRPC.Chat chat2 = arrayList7.get(i13);
                                i13++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject2.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 >= arrayList4.size()) {
                                            arrayList4.add(new ej0(0, chat3));
                                        } else if (((ej0) arrayList4.get(i34)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                            }
                            p00 p00Var = fj0Var.a;
                            h9 h9Var = fj0Var.c;
                            fj0Var.setEnabled(arrayList4.size() <= 0);
                            for (i14 = 0; i14 < 3; i14++) {
                                if (i14 < arrayList4.size()) {
                                    h9Var.b(i14, ((ej0) arrayList4.get(i14)).a, i32);
                                } else {
                                    h9Var.b(i14, null, i32);
                                }
                            }
                            size3 = arrayList4.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f9 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f9 = AndroidUtilities.dp(12.0f);
                                    }
                                    h9Var.setTranslationX(f9);
                                    h9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    h9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    p00Var.animate().alpha(0.0f).setDuration(220L).setListener(new z9(p00Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f9 = dp;
                            if (LocaleController.isRTL) {
                            }
                            h9Var.setTranslationX(f9);
                            h9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            h9Var.animate().alpha(1.0f).setDuration(220L).start();
                            p00Var.animate().alpha(0.0f).setDuration(220L).setListener(new z9(p00Var)).start();
                            return;
                        }
                    }
                }
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList62 = tL_messages_messageReactionsList2.users;
                size = arrayList62.size();
                i12 = 0;
                while (i12 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList72 = tL_messages_messageReactionsList2.chats;
                size2 = arrayList72.size();
                i13 = 0;
                while (i13 < size2) {
                }
                p00 p00Var2 = fj0Var.a;
                h9 h9Var2 = fj0Var.c;
                fj0Var.setEnabled(arrayList4.size() <= 0);
                while (i14 < 3) {
                }
                size3 = arrayList4.size();
                if (size3 != 1) {
                }
                f9 = dp;
                if (LocaleController.isRTL) {
                }
                h9Var2.setTranslationX(f9);
                h9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                h9Var2.animate().alpha(1.0f).setDuration(220L).start();
                p00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new z9(p00Var2)).start();
                return;
            case 9:
                zp0 zp0Var = (zp0) this.c;
                int i35 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                xp0 xp0Var = zp0Var.e;
                dq0 dq0Var = zp0Var.G;
                if (i35 != zp0Var.r) {
                    return;
                }
                zp0Var.h();
                zp0Var.E = false;
                zp0Var.v = i35;
                if (zp0Var.s != i35) {
                    xp0Var.b();
                }
                dp0 dp0Var = dq0Var.B;
                zp0 zp0Var2 = dq0Var.I;
                if (dp0Var.getAdapter() != zp0Var2) {
                    dq0.F0(dq0Var);
                    zp0Var2.l();
                }
                for (int i36 = 0; i36 < arrayList8.size(); i36++) {
                    TLObject tLObject2 = ((qp0) arrayList8.get(i36)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i17 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                        MessagesController.getInstance(i17).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i16 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                        MessagesController.getInstance(i16).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !zp0Var.d.isEmpty() && arrayList8.isEmpty();
                if (zp0Var.d.isEmpty()) {
                    arrayList8.isEmpty();
                }
                if (z11) {
                    dq0.F0(dq0Var);
                }
                zp0Var.d = arrayList8;
                xp0Var.f(arrayList8, null);
                int i37 = zp0Var.F;
                if (zp0Var.h() != 0 || xp0Var.e() || zp0Var.E) {
                    dq0Var.t0.b(i37);
                } else {
                    dq0Var.M.e(false, true);
                }
                zp0Var.l();
                dq0Var.K0(true);
                return;
            case 10:
                r0.getStoriesController().c(this.b, ((qu0) this.c).f1, (TL_stories.StoryItem) this.d);
                return;
            case 11:
                qu0 qu0Var = (qu0) this.c;
                int i38 = this.b;
                j70 j70Var = (j70) this.d;
                qu0Var.d1(i38);
                j70Var.u();
                return;
            case 12:
                qu0 qu0Var2 = (qu0) this.c;
                qu0Var2.S(this.b, (jl0) this.d, false);
                qu0Var2.F1 = null;
                return;
            case 13:
                ts0 ts0Var = (ts0) this.c;
                int i39 = this.b;
                j70 j70Var2 = (j70) this.d;
                ts0Var.d.c1(i39, false);
                j70Var2.u();
                return;
            case 14:
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i40 = this.b;
                if (o2Var3 instanceof org.telegram.ui.tn) {
                    org.telegram.ui.tn tnVar2 = (org.telegram.ui.tn) o2Var3;
                    tnVar2.Q7();
                    undoView2 = tnVar2.u3;
                } else if (o2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) o2Var3).I;
                }
                if (undoView2 != null) {
                    if (hVar3.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i40), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i40), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 15:
                bu0 bu0Var = (bu0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != bu0Var.A) {
                    return;
                }
                bu0Var.y = ConnectionsManager.getInstance(bu0Var.d).sendRequest(tL_messages_search, new jh.s1(bu0Var, i41, i18));
                return;
            case 16:
                bu0 bu0Var2 = (bu0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList9 = bu0Var2.h;
                int i43 = bu0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == bu0Var2.A) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i43).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i43).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i43).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        MessageObject messageObject3 = new MessageObject(i43, messages_messages.messages.get(i44), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(bu0Var2.w);
                        arrayList9.add(messageObject3);
                    }
                    bu0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        bu0Var2.s = arrayList9.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        bu0Var2.s = true;
                    }
                    bu0Var2.G(false);
                    bu0Var2.r = false;
                    bu0Var2.y = -1;
                    return;
                }
                return;
            case 17:
                pv0 pv0Var = (pv0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                pv0Var.U0 = false;
                if (!pv0Var.R0 && pv0Var.S0) {
                    pv0Var.A(true);
                    return;
                }
                pv0Var.j0 = pv0Var.b1[0];
                pv0Var.j();
                DownloadController.getInstance(i45).removeLoadingFileObserver(s1Var);
                pv0Var.G();
                pv0Var.v();
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                                    callback2.run(Long.valueOf(r3.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e11) {
                                e = e11;
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
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor3 = num2;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 20:
                ax0 ax0Var = (ax0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var4 = ax0Var.X0.H;
                if (o2Var4 instanceof org.telegram.ui.tn) {
                    org.telegram.ui.tn tnVar3 = (org.telegram.ui.tn) o2Var4;
                    tnVar3.Q7();
                    undoView3 = tnVar3.u3;
                } else if (o2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) o2Var4).I;
                }
                if (undoView3 != null) {
                    if (hVar4.m() == 1) {
                        undoView3.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i48), 53);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i48), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                fy0 fy0Var = (fy0) this.c;
                String str3 = (String) this.d;
                int i49 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList10 = new ArrayList<>(1);
                arrayList10.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(fy0Var.a).fillWithAnimatedEmoji(arrayList10, 15, false, false, false, new ag.z1(fy0Var, i49, str3, arrayList10, 27));
                return;
            case 22:
                d11 d11Var = (d11) this.c;
                String str4 = (String) this.d;
                int i50 = this.b;
                c11 c11Var = d11Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        d11Var.d = -1;
                        AndroidUtilities.runOnUIThread(new ag.z1((Object) d11Var, d11Var.d, new ArrayList(), (Serializable) new ArrayList(), 28));
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
                    int size5 = c11Var.d.size();
                    for (int i53 = 0; i53 < size5; i53++) {
                        ArrayList arrayList13 = (ArrayList) c11Var.d.get(i53);
                        String i54 = org.telegram.ui.ActionBar.e5.i(((org.telegram.ui.ActionBar.i6) arrayList13.get(0)).f);
                        String lowerCase2 = i54.toLowerCase();
                        int i55 = 0;
                        while (true) {
                            if (i55 < i52) {
                                String str5 = strArr[i55];
                                if (lowerCase2.contains(str5)) {
                                    arrayList11.add(arrayList13);
                                    arrayList12.add(d11.E(i54, str5));
                                } else {
                                    i55++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ag.z1((Object) d11Var, i50, arrayList11, (Serializable) arrayList12, 28));
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 23:
                AndroidUtilities.runOnUIThread(new ag.z1((l11) this.c, (fp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 29));
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
                org.telegram.ui.di diVar = (org.telegram.ui.di) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i56 = this.b;
                if (tLObject4 instanceof TLRPC.User) {
                    diVar.a = (TLRPC.User) tLObject4;
                    MessagesController.getInstance(i56).putUser(diVar.a, false);
                }
                p00 p00Var3 = diVar.c;
                y80 y80Var = diVar.b;
                diVar.setEnabled(diVar.a != null);
                TLRPC.User user3 = diVar.a;
                if (user3 != null) {
                    y80Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user3)), new eg.z1(diVar, user3.id, 26)));
                }
                y80Var.animate().alpha(1.0f).setDuration(220L).start();
                p00Var3.animate().alpha(0.0f).setDuration(220L).setListener(new z9(p00Var3)).start();
                return;
        }
    }

    public /* synthetic */ rm(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ rm(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
