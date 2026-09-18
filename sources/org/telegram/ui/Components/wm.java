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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wm(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = f31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(f31.o(messageObject)));
        }
        if (k1Var != null) {
            k1Var.d0(3);
        }
        int i10 = this.b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.wy wyVar = ayVar.f0;
        ArrayList arrayList = wyVar.R1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        wyVar.R1.add(i10, dialog);
        wyVar.e0[0].q(true);
    }

    private final void c() {
        org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.vy vyVar = uyVar.g;
        org.telegram.ui.wy wyVar = uyVar.h;
        wyVar.S1 = true;
        wyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        wyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = wyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            vyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = wyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            wyVar.A4(true, true);
            vyVar.x.D();
            vyVar.q(true);
            wyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                wyVar.A4(true, true);
                vyVar.q(true);
                wyVar.o3();
            } else {
                if (!wyVar.R1.isEmpty()) {
                    wyVar.R1.remove(0);
                }
                vyVar.x.D();
                vyVar.q(true);
            }
        }
    }

    private final void e() {
        org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) this.c;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var == null) {
            return;
        }
        c2Var.setOnCancelListener(new org.telegram.ui.da(k60Var, this.b, 5));
        c2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.B1;
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x011b, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x023b: MOVE (r13 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:572), block:B:111:0x023b */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x066d  */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        ?? r82;
        long j3;
        String formatPluralString;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        int size3;
        int dp;
        float f7;
        int i13;
        int i14;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i15 = 4;
        UndoView undoView2 = null;
        r13 = null;
        String str = null;
        UndoView undoView3 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        switch (this.a) {
            case 0:
                un unVar = (un) this.c;
                int i16 = this.b;
                View view = (View) this.d;
                unVar.V = 0;
                unVar.U = i16;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    unVar.U((org.telegram.ui.Cells.r8) view, true);
                    return;
                } else {
                    unVar.r.m(unVar.I0);
                    return;
                }
            case 1:
                fv fvVar = (fv) this.c;
                a0.i iVar = (a0.i) this.d;
                int i17 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = fvVar.b1.c;
                if (o2Var instanceof org.telegram.ui.bo) {
                    org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var;
                    boVar.Q7();
                    undoView = boVar.y3;
                } else {
                    undoView = o2Var instanceof ProfileActivity ? ((ProfileActivity) o2Var).M : null;
                }
                if (undoView != null) {
                    if (iVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i17), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i17), Integer.valueOf(iVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 2:
                fy fyVar = (fy) this.c;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                int i18 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var == null) {
                    return;
                }
                c2Var.setOnCancelListener(new org.telegram.ui.da(fyVar, i18, 4));
                c2VarArr[0].show();
                return;
            case 3:
                int i19 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i19;
                o2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new gg.u(o2Var2, i19, callback, 5));
                return;
            case 4:
                q30 q30Var = (q30) this.c;
                int i20 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                gg.c2 c2Var2 = q30Var.d;
                r30 r30Var = q30Var.w;
                if (i20 != q30Var.n) {
                    return;
                }
                q30Var.h = false;
                TLRPC.Chat chat = r30Var.V;
                zw0 zw0Var = r30Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.i iVar2 = c2Var2.h;
                    ArrayList arrayList2 = c2Var2.g;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int size4 = arrayList.size();
                    for (int i21 = 0; i21 < size4; i21++) {
                        TLObject tLObject = (TLObject) arrayList.get(i21);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            iVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            iVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    c2Var2.i();
                }
                int i22 = q30Var.f - 1;
                boolean z10 = zw0Var.getVisibility() == 0;
                q30Var.l();
                if (q30Var.f > i22) {
                    r30Var.J(i22);
                }
                if (q30Var.h || c2Var2.e() || !r30Var.d.T0()) {
                    return;
                }
                zw0Var.e(false, z10);
                return;
            case 5:
                e40 e40Var = (e40) this.c;
                int i23 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = e40Var.O;
                int i24 = e40Var.N;
                if (i23 != e40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e40Var.b0[0] ? "$" : "#");
                sb2.append(e40Var.Y);
                String sb3 = sb2.toString();
                ai.v8 v8Var = e40Var.Q;
                if (v8Var == null || !TextUtils.equals(v8Var.C, sb3)) {
                    e40Var.Q = new ai.v8(i24, null, sb3);
                }
                if (e40Var.Q.i.size() <= 0) {
                    r82 = 1;
                    e40Var.Q.p(4, true);
                } else {
                    r82 = 1;
                }
                e40Var.P = r82;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r82;
                e40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList3.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) hg.k0.h(r82, arrayList3);
                    tL_channels_searchPosts.offset_rate = e40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i24).getInputPeer(messageObject.messageOwner.peer_id);
                }
                e40Var.U = ConnectionsManager.getInstance(i24).sendRequest(tL_channels_searchPosts, new gg.u(e40Var, i23, sb3, 6));
                return;
            case 6:
                w50 w50Var = (w50) this.c;
                int i25 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = w50Var.i0;
                if (w50Var.h0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i25);
                }
                if (!w50Var.n0) {
                    if (i25 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    w50Var.o0 = new CameraSession(w50Var.y, sizeArr[0], w50Var.j0, 256, true);
                    w50Var.r();
                    n50 n50Var = w50Var.h0;
                    CameraSession cameraSession = w50Var.o0;
                    Handler handler = n50Var.getHandler();
                    if (handler != null) {
                        n50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(w50Var.o0, surfaceTexture, new d50(w50Var, 1), new d50(w50Var, 2));
                    return;
                }
                if (w50Var.p0) {
                    Camera2Session camera2Session = w50Var.q0[i25];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i25 == 1) {
                    return;
                }
                n50 n50Var2 = w50Var.h0;
                Camera2Session camera2Session2 = w50Var.r0;
                Handler handler2 = n50Var2.getHandler();
                if (handler2 != null) {
                    n50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                w50Var.r0.open(surfaceTexture);
                return;
            case 7:
                v50 v50Var = (v50) this.c;
                int i26 = this.b;
                q50 q50Var = (q50) this.d;
                w50 w50Var2 = v50Var.H0;
                VideoEditedInfo videoEditedInfo = w50Var2.N;
                int i27 = w50Var2.a;
                o50 o50Var = w50Var2.c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    w50Var2.N = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (w50Var2.N.needConvert()) {
                    w50Var2.H = null;
                    w50Var2.I = null;
                    w50Var2.J = null;
                    w50Var2.K = null;
                    VideoEditedInfo videoEditedInfo3 = w50Var2.N;
                    j3 = 0;
                    long j10 = videoEditedInfo3.estimatedDuration;
                    double d = j10;
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
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * w50Var2.L));
                    VideoEditedInfo videoEditedInfo4 = w50Var2.N;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i27).cancelFileUpload(w50Var2.a0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    w50Var2.N.estimatedSize = Math.max(1L, w50Var2.L);
                }
                VideoEditedInfo videoEditedInfo5 = w50Var2.N;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = w50Var2.H;
                videoEditedInfo5.encryptedFile = w50Var2.I;
                videoEditedInfo5.key = w50Var2.J;
                videoEditedInfo5.iv = w50Var2.K;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = v50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = w50Var2.N;
                if (i26 != 1) {
                    v50Var.h(v50Var.a);
                    videoEditedInfo6.estimatedDuration = w50Var2.f0;
                    NotificationCenter.getInstance(i27).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(w50Var2.Q), videoEditedInfo6, v50Var.a.getAbsolutePath(), v50Var.A0);
                    return;
                }
                if (o50Var.c()) {
                    Activity parentActivity = o50Var.getParentActivity();
                    long a2 = o50Var.a();
                    int i28 = 0;
                    s50 s50Var = new s50(v50Var, q50Var, videoEditedInfo6, i28);
                    r50 r50Var = new r50(v50Var, i28);
                    org.telegram.ui.ActionBar.f6 f6Var = w50Var2.P0;
                    Pattern pattern = c5.a;
                    c5.K(parentActivity, a2, -1L, 0, false, s50Var, r50Var, new a5(f6Var), f6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (q50Var != null) {
                        photoEntry.ttl = q50Var.c;
                        photoEntry.effectId = q50Var.d;
                    }
                    w50Var2.c.q(photoEntry, videoEditedInfo6, q50Var == null || q50Var.a, q50Var != null ? q50Var.b : 0, 0, false, q50Var != null ? q50Var.e : j3);
                }
                w50Var2.N = null;
                return;
            case 8:
                gj0 gj0Var = (gj0) this.c;
                int i29 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i30 = gj0Var.f;
                TextView textView = gj0Var.b;
                MessageObject messageObject2 = gj0Var.s;
                ImageView imageView = gj0Var.d;
                u9 u9Var = gj0Var.e;
                ArrayList arrayList4 = gj0Var.r;
                ArrayList arrayList5 = gj0Var.n;
                if (arrayList5.isEmpty() || arrayList5.size() < i29) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i29, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i29), i29 == arrayList5.size() ? String.valueOf(i29) : i29 + "/" + arrayList5.size());
                }
                if (gj0Var.getMeasuredWidth() > 0) {
                    gj0Var.v = gj0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject2.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i30).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            u9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            u9Var.setVisibility(0);
                            u9Var.setAlpha(0.0f);
                            u9Var.animate().alpha(1.0f).start();
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
                                            if (((fj0) arrayList4.get(i32)).b == user2.id) {
                                                break;
                                            } else {
                                                i32 = i33 + 1;
                                            }
                                        } else {
                                            arrayList4.add(new fj0(0, user2));
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
                                            arrayList4.add(new fj0(0, chat3));
                                        } else if (((fj0) arrayList4.get(i34)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                            }
                            t00 t00Var = gj0Var.a;
                            i9 i9Var = gj0Var.c;
                            gj0Var.setEnabled(arrayList4.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList4.size()) {
                                    i9Var.b(i12, ((fj0) arrayList4.get(i12)).a, i30);
                                } else {
                                    i9Var.b(i12, null, i30);
                                }
                            }
                            size3 = arrayList4.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f7 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f7 = AndroidUtilities.dp(12.0f);
                                    }
                                    i9Var.setTranslationX(f7);
                                    i9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    i9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new aa(t00Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            i9Var.setTranslationX(f7);
                            i9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            i9Var.animate().alpha(1.0f).setDuration(220L).start();
                            t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new aa(t00Var)).start();
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
                t00 t00Var2 = gj0Var.a;
                i9 i9Var2 = gj0Var.c;
                gj0Var.setEnabled(arrayList4.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList4.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                i9Var2.setTranslationX(f7);
                i9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                i9Var2.animate().alpha(1.0f).setDuration(220L).start();
                t00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new aa(t00Var2)).start();
                return;
            case 9:
                eq0 eq0Var = (eq0) this.c;
                int i35 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                cq0 cq0Var = eq0Var.e;
                iq0 iq0Var = eq0Var.K;
                if (i35 != eq0Var.r) {
                    return;
                }
                eq0Var.h();
                eq0Var.I = false;
                eq0Var.v = i35;
                if (eq0Var.s != i35) {
                    cq0Var.b();
                }
                kp0 kp0Var = iq0Var.F;
                eq0 eq0Var2 = iq0Var.M;
                if (kp0Var.getAdapter() != eq0Var2) {
                    iq0.F0(iq0Var);
                    eq0Var2.l();
                }
                for (int i36 = 0; i36 < arrayList8.size(); i36++) {
                    TLObject tLObject2 = ((wp0) arrayList8.get(i36)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i14 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
                        MessagesController.getInstance(i14).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i13 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
                        MessagesController.getInstance(i13).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !eq0Var.d.isEmpty() && arrayList8.isEmpty();
                if (eq0Var.d.isEmpty()) {
                    arrayList8.isEmpty();
                }
                if (z11) {
                    iq0.F0(iq0Var);
                }
                eq0Var.d = arrayList8;
                cq0Var.f(arrayList8, null);
                int i37 = eq0Var.J;
                if (eq0Var.h() != 0 || cq0Var.e() || eq0Var.I) {
                    iq0Var.x0.b(i37);
                } else {
                    iq0Var.Q.e(false, true);
                }
                eq0Var.l();
                iq0Var.K0(true);
                return;
            case 10:
                r0.getStoriesController().c(this.b, ((zu0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 11:
                zu0 zu0Var = (zu0) this.c;
                int i38 = this.b;
                n70 n70Var = (n70) this.d;
                zu0Var.d1(i38);
                n70Var.u();
                return;
            case 12:
                zu0 zu0Var2 = (zu0) this.c;
                zu0Var2.S(this.b, (ml0) this.d, false);
                zu0Var2.J1 = null;
                return;
            case 13:
                dt0 dt0Var = (dt0) this.c;
                int i39 = this.b;
                n70 n70Var2 = (n70) this.d;
                dt0Var.d.c1(i39, false);
                n70Var2.u();
                return;
            case 14:
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.c;
                a0.i iVar3 = (a0.i) this.d;
                int i40 = this.b;
                if (o2Var3 instanceof org.telegram.ui.bo) {
                    org.telegram.ui.bo boVar2 = (org.telegram.ui.bo) o2Var3;
                    boVar2.Q7();
                    undoView2 = boVar2.y3;
                } else if (o2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) o2Var3).M;
                }
                if (undoView2 != null) {
                    if (iVar3.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) iVar3.n(0)).id, Integer.valueOf(i40), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i40), Integer.valueOf(iVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 15:
                ku0 ku0Var = (ku0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != ku0Var.E) {
                    return;
                }
                ku0Var.y = ConnectionsManager.getInstance(ku0Var.d).sendRequest(tL_messages_search, new ai.g8(ku0Var, i41, i15));
                return;
            case 16:
                ku0 ku0Var2 = (ku0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList9 = ku0Var2.h;
                int i43 = ku0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == ku0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i43).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i43).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i43).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        MessageObject messageObject3 = new MessageObject(i43, messages_messages.messages.get(i44), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(ku0Var2.w);
                        arrayList9.add(messageObject3);
                    }
                    ku0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        ku0Var2.s = arrayList9.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        ku0Var2.s = true;
                    }
                    ku0Var2.G(false);
                    ku0Var2.r = false;
                    ku0Var2.y = -1;
                    return;
                }
                return;
            case 17:
                yv0 yv0Var = (yv0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                yv0Var.Y0 = false;
                if (!yv0Var.V0 && yv0Var.W0) {
                    yv0Var.C(true);
                    return;
                }
                yv0Var.m0 = yv0Var.f1[0];
                yv0Var.l();
                DownloadController.getInstance(i45).removeLoadingFileObserver(t1Var);
                yv0Var.I();
                yv0Var.x();
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
                } catch (Exception e) {
                    FileLog.e(e);
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
                                    callback2.run(Long.valueOf(r4.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e7) {
                                e = e7;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor4 = sQLiteCursor2;
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor4 != null) {
                    }
                    throw th;
                }
                break;
            case 20:
                jx0 jx0Var = (jx0) this.c;
                a0.i iVar4 = (a0.i) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var4 = jx0Var.b1.L;
                if (o2Var4 instanceof org.telegram.ui.bo) {
                    org.telegram.ui.bo boVar3 = (org.telegram.ui.bo) o2Var4;
                    boVar3.Q7();
                    undoView3 = boVar3.y3;
                } else if (o2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) o2Var4).M;
                }
                if (undoView3 != null) {
                    if (iVar4.m() == 1) {
                        undoView3.m(((TLRPC.Dialog) iVar4.n(0)).id, Integer.valueOf(i48), 53);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i48), Integer.valueOf(iVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                oy0 oy0Var = (oy0) this.c;
                String str3 = (String) this.d;
                int i49 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList10 = new ArrayList<>(1);
                arrayList10.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(oy0Var.a).fillWithAnimatedEmoji(arrayList10, 15, false, false, false, new ai.c9(oy0Var, i49, str3, arrayList10));
                return;
            case 22:
                m11 m11Var = (m11) this.c;
                String str4 = (String) this.d;
                int i50 = this.b;
                l11 l11Var = m11Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        m11Var.d = -1;
                        AndroidUtilities.runOnUIThread(new ai.c9(m11Var, m11Var.d, new ArrayList(), new ArrayList(), 29));
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
                    int size5 = l11Var.d.size();
                    for (int i53 = 0; i53 < size5; i53++) {
                        ArrayList arrayList13 = (ArrayList) l11Var.d.get(i53);
                        String i54 = org.telegram.ui.ActionBar.h5.i(((org.telegram.ui.ActionBar.l6) arrayList13.get(0)).f);
                        String lowerCase2 = i54.toLowerCase();
                        int i55 = 0;
                        while (true) {
                            if (i55 < i52) {
                                String str5 = strArr[i55];
                                if (lowerCase2.contains(str5)) {
                                    arrayList11.add(arrayList13);
                                    arrayList12.add(m11.E(i54, str5));
                                } else {
                                    i55++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.c9(m11Var, i50, arrayList11, arrayList12, 29));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 23:
                AndroidUtilities.runOnUIThread(new t11((v11) this.c, (lp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
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
                org.telegram.ui.ni niVar = (org.telegram.ui.ni) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i56 = this.b;
                if (tLObject4 instanceof TLRPC.User) {
                    niVar.a = (TLRPC.User) tLObject4;
                    MessagesController.getInstance(i56).putUser(niVar.a, false);
                }
                t00 t00Var3 = niVar.c;
                c90 c90Var = niVar.b;
                niVar.setEnabled(niVar.a != null);
                TLRPC.User user3 = niVar.a;
                if (user3 != null) {
                    c90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user3)), new ai.j(niVar, user3.id, 26)));
                }
                c90Var.animate().alpha(1.0f).setDuration(220L).start();
                t00Var3.animate().alpha(0.0f).setDuration(220L).setListener(new aa(t00Var3)).start();
                return;
        }
    }

    public /* synthetic */ wm(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ wm(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
