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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xm(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = d31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(d31.o(messageObject)));
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
        org.telegram.ui.vx vxVar = (org.telegram.ui.vx) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ry ryVar = vxVar.f0;
        ArrayList arrayList = ryVar.R1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        ryVar.R1.add(i10, dialog);
        ryVar.e0[0].q(true);
    }

    private final void c() {
        org.telegram.ui.py pyVar = (org.telegram.ui.py) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.qy qyVar = pyVar.g;
        org.telegram.ui.ry ryVar = pyVar.h;
        ryVar.S1 = true;
        ryVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        ryVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = ryVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            qyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = ryVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            ryVar.A4(true, true);
            qyVar.x.D();
            qyVar.q(true);
            ryVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                ryVar.A4(true, true);
                qyVar.q(true);
                ryVar.o3();
            } else {
                if (!ryVar.R1.isEmpty()) {
                    ryVar.R1.remove(0);
                }
                qyVar.x.D();
                qyVar.q(true);
            }
        }
    }

    private final void e() {
        org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) this.c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new org.telegram.ui.ba(f60Var, this.b, 5));
        b2VarArr[0].show();
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
                vn vnVar = (vn) this.c;
                int i16 = this.b;
                View view = (View) this.d;
                vnVar.V = 0;
                vnVar.U = i16;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    vnVar.U((org.telegram.ui.Cells.s8) view, true);
                    return;
                } else {
                    vnVar.r.m(vnVar.I0);
                    return;
                }
            case 1:
                gv gvVar = (gv) this.c;
                a0.i iVar = (a0.i) this.d;
                int i17 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = gvVar.b1.c;
                if (n2Var instanceof org.telegram.ui.xn) {
                    org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var;
                    xnVar.Q7();
                    undoView = xnVar.y3;
                } else {
                    undoView = n2Var instanceof ProfileActivity ? ((ProfileActivity) n2Var).M : null;
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
                gy gyVar = (gy) this.c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                int i18 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new org.telegram.ui.ba(gyVar, i18, 4));
                b2VarArr[0].show();
                return;
            case 3:
                int i19 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i19;
                n2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new gg.u(n2Var2, i19, callback, 5));
                return;
            case 4:
                r30 r30Var = (r30) this.c;
                int i20 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                gg.c2 c2Var = r30Var.d;
                s30 s30Var = r30Var.w;
                if (i20 != r30Var.n) {
                    return;
                }
                r30Var.h = false;
                TLRPC.Chat chat = s30Var.V;
                xw0 xw0Var = s30Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.i iVar2 = c2Var.h;
                    ArrayList arrayList2 = c2Var.g;
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
                    c2Var.i();
                }
                int i22 = r30Var.f - 1;
                boolean z10 = xw0Var.getVisibility() == 0;
                r30Var.l();
                if (r30Var.f > i22) {
                    s30Var.J(i22);
                }
                if (r30Var.h || c2Var.e() || !s30Var.d.S0()) {
                    return;
                }
                xw0Var.e(false, z10);
                return;
            case 5:
                f40 f40Var = (f40) this.c;
                int i23 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = f40Var.O;
                int i24 = f40Var.N;
                if (i23 != f40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f40Var.b0[0] ? "$" : "#");
                sb2.append(f40Var.Y);
                String sb3 = sb2.toString();
                ai.v8 v8Var = f40Var.Q;
                if (v8Var == null || !TextUtils.equals(v8Var.C, sb3)) {
                    f40Var.Q = new ai.v8(i24, null, sb3);
                }
                if (f40Var.Q.i.size() <= 0) {
                    r82 = 1;
                    f40Var.Q.p(4, true);
                } else {
                    r82 = 1;
                }
                f40Var.P = r82;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r82;
                f40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList3.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) hg.c.h(r82, arrayList3);
                    tL_channels_searchPosts.offset_rate = f40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i24).getInputPeer(messageObject.messageOwner.peer_id);
                }
                f40Var.U = ConnectionsManager.getInstance(i24).sendRequest(tL_channels_searchPosts, new gg.u(f40Var, i23, sb3, 6));
                return;
            case 6:
                x50 x50Var = (x50) this.c;
                int i25 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = x50Var.i0;
                if (x50Var.h0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i25);
                }
                if (!x50Var.n0) {
                    if (i25 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    x50Var.o0 = new CameraSession(x50Var.y, sizeArr[0], x50Var.j0, 256, true);
                    x50Var.r();
                    o50 o50Var = x50Var.h0;
                    CameraSession cameraSession = x50Var.o0;
                    Handler handler = o50Var.getHandler();
                    if (handler != null) {
                        o50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(x50Var.o0, surfaceTexture, new e50(x50Var, 1), new e50(x50Var, 2));
                    return;
                }
                if (x50Var.p0) {
                    Camera2Session camera2Session = x50Var.q0[i25];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i25 == 1) {
                    return;
                }
                o50 o50Var2 = x50Var.h0;
                Camera2Session camera2Session2 = x50Var.r0;
                Handler handler2 = o50Var2.getHandler();
                if (handler2 != null) {
                    o50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                x50Var.r0.open(surfaceTexture);
                return;
            case 7:
                w50 w50Var = (w50) this.c;
                int i26 = this.b;
                r50 r50Var = (r50) this.d;
                x50 x50Var2 = w50Var.H0;
                VideoEditedInfo videoEditedInfo = x50Var2.N;
                int i27 = x50Var2.a;
                p50 p50Var = x50Var2.c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    x50Var2.N = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (x50Var2.N.needConvert()) {
                    x50Var2.H = null;
                    x50Var2.I = null;
                    x50Var2.J = null;
                    x50Var2.K = null;
                    VideoEditedInfo videoEditedInfo3 = x50Var2.N;
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
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * x50Var2.L));
                    VideoEditedInfo videoEditedInfo4 = x50Var2.N;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i27).cancelFileUpload(x50Var2.a0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    x50Var2.N.estimatedSize = Math.max(1L, x50Var2.L);
                }
                VideoEditedInfo videoEditedInfo5 = x50Var2.N;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = x50Var2.H;
                videoEditedInfo5.encryptedFile = x50Var2.I;
                videoEditedInfo5.key = x50Var2.J;
                videoEditedInfo5.iv = x50Var2.K;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = w50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = x50Var2.N;
                if (i26 != 1) {
                    w50Var.h(w50Var.a);
                    videoEditedInfo6.estimatedDuration = x50Var2.f0;
                    NotificationCenter.getInstance(i27).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(x50Var2.Q), videoEditedInfo6, w50Var.a.getAbsolutePath(), w50Var.A0);
                    return;
                }
                if (p50Var.c()) {
                    Activity parentActivity = p50Var.getParentActivity();
                    long a2 = p50Var.a();
                    int i28 = 0;
                    t50 t50Var = new t50(w50Var, r50Var, videoEditedInfo6, i28);
                    s50 s50Var = new s50(w50Var, i28);
                    org.telegram.ui.ActionBar.d6 d6Var = x50Var2.P0;
                    Pattern pattern = e5.a;
                    e5.K(parentActivity, a2, -1L, 0, false, t50Var, s50Var, new c5(d6Var), d6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (r50Var != null) {
                        photoEntry.ttl = r50Var.c;
                        photoEntry.effectId = r50Var.d;
                    }
                    x50Var2.c.q(photoEntry, videoEditedInfo6, r50Var == null || r50Var.a, r50Var != null ? r50Var.b : 0, 0, false, r50Var != null ? r50Var.e : j3);
                }
                x50Var2.N = null;
                return;
            case 8:
                gj0 gj0Var = (gj0) this.c;
                int i29 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i30 = gj0Var.f;
                TextView textView = gj0Var.b;
                MessageObject messageObject2 = gj0Var.s;
                ImageView imageView = gj0Var.d;
                w9 w9Var = gj0Var.e;
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
                            w9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            w9Var.setVisibility(0);
                            w9Var.setAlpha(0.0f);
                            w9Var.animate().alpha(1.0f).start();
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
                            u00 u00Var = gj0Var.a;
                            k9 k9Var = gj0Var.c;
                            gj0Var.setEnabled(arrayList4.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList4.size()) {
                                    k9Var.b(i12, ((fj0) arrayList4.get(i12)).a, i30);
                                } else {
                                    k9Var.b(i12, null, i30);
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
                                    k9Var.setTranslationX(f7);
                                    k9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    k9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    u00Var.animate().alpha(0.0f).setDuration(220L).setListener(new ca(u00Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            k9Var.setTranslationX(f7);
                            k9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            k9Var.animate().alpha(1.0f).setDuration(220L).start();
                            u00Var.animate().alpha(0.0f).setDuration(220L).setListener(new ca(u00Var)).start();
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
                u00 u00Var2 = gj0Var.a;
                k9 k9Var2 = gj0Var.c;
                gj0Var.setEnabled(arrayList4.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList4.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                k9Var2.setTranslationX(f7);
                k9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                k9Var2.animate().alpha(1.0f).setDuration(220L).start();
                u00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new ca(u00Var2)).start();
                return;
            case 9:
                dq0 dq0Var = (dq0) this.c;
                int i35 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                bq0 bq0Var = dq0Var.e;
                hq0 hq0Var = dq0Var.K;
                if (i35 != dq0Var.r) {
                    return;
                }
                dq0Var.h();
                dq0Var.I = false;
                dq0Var.v = i35;
                if (dq0Var.s != i35) {
                    bq0Var.b();
                }
                jp0 jp0Var = hq0Var.F;
                dq0 dq0Var2 = hq0Var.M;
                if (jp0Var.getAdapter() != dq0Var2) {
                    hq0.F0(hq0Var);
                    dq0Var2.l();
                }
                for (int i36 = 0; i36 < arrayList8.size(); i36++) {
                    TLObject tLObject2 = ((vp0) arrayList8.get(i36)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i14 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                        MessagesController.getInstance(i14).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i13 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                        MessagesController.getInstance(i13).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !dq0Var.d.isEmpty() && arrayList8.isEmpty();
                if (dq0Var.d.isEmpty()) {
                    arrayList8.isEmpty();
                }
                if (z11) {
                    hq0.F0(hq0Var);
                }
                dq0Var.d = arrayList8;
                bq0Var.f(arrayList8, null);
                int i37 = dq0Var.J;
                if (dq0Var.h() != 0 || bq0Var.e() || dq0Var.I) {
                    hq0Var.x0.b(i37);
                } else {
                    hq0Var.Q.e(false, true);
                }
                dq0Var.l();
                hq0Var.K0(true);
                return;
            case 10:
                r0.getStoriesController().c(this.b, ((yu0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 11:
                yu0 yu0Var = (yu0) this.c;
                int i38 = this.b;
                o70 o70Var = (o70) this.d;
                yu0Var.d1(i38);
                o70Var.u();
                return;
            case 12:
                yu0 yu0Var2 = (yu0) this.c;
                yu0Var2.S(this.b, (ml0) this.d, false);
                yu0Var2.J1 = null;
                return;
            case 13:
                ct0 ct0Var = (ct0) this.c;
                int i39 = this.b;
                o70 o70Var2 = (o70) this.d;
                ct0Var.d.c1(i39, false);
                o70Var2.u();
                return;
            case 14:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.c;
                a0.i iVar3 = (a0.i) this.d;
                int i40 = this.b;
                if (n2Var3 instanceof org.telegram.ui.xn) {
                    org.telegram.ui.xn xnVar2 = (org.telegram.ui.xn) n2Var3;
                    xnVar2.Q7();
                    undoView2 = xnVar2.y3;
                } else if (n2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) n2Var3).M;
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
                ju0 ju0Var = (ju0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != ju0Var.E) {
                    return;
                }
                ju0Var.y = ConnectionsManager.getInstance(ju0Var.d).sendRequest(tL_messages_search, new ai.i8(ju0Var, i41, i15));
                return;
            case 16:
                ju0 ju0Var2 = (ju0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList9 = ju0Var2.h;
                int i43 = ju0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == ju0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i43).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i43).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i43).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        MessageObject messageObject3 = new MessageObject(i43, messages_messages.messages.get(i44), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(ju0Var2.w);
                        arrayList9.add(messageObject3);
                    }
                    ju0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        ju0Var2.s = arrayList9.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        ju0Var2.s = true;
                    }
                    ju0Var2.G(false);
                    ju0Var2.r = false;
                    ju0Var2.y = -1;
                    return;
                }
                return;
            case 17:
                xv0 xv0Var = (xv0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                xv0Var.Y0 = false;
                if (!xv0Var.V0 && xv0Var.W0) {
                    xv0Var.C(true);
                    return;
                }
                xv0Var.m0 = xv0Var.f1[0];
                xv0Var.l();
                DownloadController.getInstance(i45).removeLoadingFileObserver(t1Var);
                xv0Var.I();
                xv0Var.x();
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
                hx0 hx0Var = (hx0) this.c;
                a0.i iVar4 = (a0.i) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var4 = hx0Var.b1.L;
                if (n2Var4 instanceof org.telegram.ui.xn) {
                    org.telegram.ui.xn xnVar3 = (org.telegram.ui.xn) n2Var4;
                    xnVar3.Q7();
                    undoView3 = xnVar3.y3;
                } else if (n2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) n2Var4).M;
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
                my0 my0Var = (my0) this.c;
                String str3 = (String) this.d;
                int i49 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList10 = new ArrayList<>(1);
                arrayList10.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(my0Var.a).fillWithAnimatedEmoji(arrayList10, 15, false, false, false, new ai.c9(my0Var, i49, str3, arrayList10));
                return;
            case 22:
                k11 k11Var = (k11) this.c;
                String str4 = (String) this.d;
                int i50 = this.b;
                j11 j11Var = k11Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        k11Var.d = -1;
                        AndroidUtilities.runOnUIThread(new ai.c9(k11Var, k11Var.d, new ArrayList(), new ArrayList(), 29));
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
                    int size5 = j11Var.d.size();
                    for (int i53 = 0; i53 < size5; i53++) {
                        ArrayList arrayList13 = (ArrayList) j11Var.d.get(i53);
                        String i54 = org.telegram.ui.ActionBar.f5.i(((org.telegram.ui.ActionBar.j6) arrayList13.get(0)).f);
                        String lowerCase2 = i54.toLowerCase();
                        int i55 = 0;
                        while (true) {
                            if (i55 < i52) {
                                String str5 = strArr[i55];
                                if (lowerCase2.contains(str5)) {
                                    arrayList11.add(arrayList13);
                                    arrayList12.add(k11.E(i54, str5));
                                } else {
                                    i55++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.c9(k11Var, i50, arrayList11, arrayList12, 29));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 23:
                AndroidUtilities.runOnUIThread(new r11((t11) this.c, (mp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
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
                org.telegram.ui.ji jiVar = (org.telegram.ui.ji) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i56 = this.b;
                if (tLObject4 instanceof TLRPC.User) {
                    jiVar.a = (TLRPC.User) tLObject4;
                    MessagesController.getInstance(i56).putUser(jiVar.a, false);
                }
                u00 u00Var3 = jiVar.c;
                d90 d90Var = jiVar.b;
                jiVar.setEnabled(jiVar.a != null);
                TLRPC.User user3 = jiVar.a;
                if (user3 != null) {
                    d90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user3)), new ai.j(jiVar, user3.id, 26)));
                }
                d90Var.animate().alpha(1.0f).setDuration(220L).start();
                u00Var3.animate().alpha(0.0f).setDuration(220L).setListener(new ca(u00Var3)).start();
                return;
        }
    }

    public /* synthetic */ xm(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ xm(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
