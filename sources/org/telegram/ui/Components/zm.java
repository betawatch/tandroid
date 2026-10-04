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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zm(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = c41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(c41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.e0(3);
        }
        int i10 = this.b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        org.telegram.ui.wx wxVar = (org.telegram.ui.wx) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.uy uyVar = wxVar.f0;
        ArrayList arrayList = uyVar.R1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        uyVar.R1.add(i10, dialog);
        uyVar.e0[0].q(true);
    }

    private final void c() {
        org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ty tyVar = syVar.g;
        org.telegram.ui.uy uyVar = syVar.h;
        uyVar.S1 = true;
        uyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        uyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = uyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            tyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = uyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            uyVar.J4(true, true);
            tyVar.x.D();
            tyVar.q(true);
            uyVar.x3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                uyVar.J4(true, true);
                tyVar.q(true);
                uyVar.x3();
            } else {
                if (!uyVar.R1.isEmpty()) {
                    uyVar.R1.remove(0);
                }
                tyVar.x.D();
                tyVar.q(true);
            }
        }
    }

    private final void e() {
        org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) this.c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new org.telegram.ui.da(h60Var, this.b, 5));
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
                xn xnVar = (xn) this.c;
                int i16 = this.b;
                View view = (View) this.d;
                xnVar.V = 0;
                xnVar.U = i16;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    xnVar.S((org.telegram.ui.Cells.r8) view, true);
                    return;
                } else {
                    xnVar.r.m(xnVar.I0);
                    return;
                }
            case 1:
                jv jvVar = (jv) this.c;
                a0.i iVar = (a0.i) this.d;
                int i17 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = jvVar.X0.c;
                if (n2Var instanceof org.telegram.ui.yn) {
                    org.telegram.ui.yn ynVar = (org.telegram.ui.yn) n2Var;
                    ynVar.Q7();
                    undoView = ynVar.w3;
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
                jy jyVar = (jy) this.c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                int i18 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new org.telegram.ui.da(jyVar, i18, 4));
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
                u30 u30Var = (u30) this.c;
                int i20 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                gg.c2 c2Var = u30Var.d;
                v30 v30Var = u30Var.w;
                if (i20 != u30Var.n) {
                    return;
                }
                u30Var.h = false;
                TLRPC.Chat chat = v30Var.V;
                tx0 tx0Var = v30Var.s;
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
                int i22 = u30Var.f - 1;
                boolean z10 = tx0Var.getVisibility() == 0;
                u30Var.l();
                if (u30Var.f > i22) {
                    v30Var.H(i22);
                }
                if (u30Var.h || c2Var.e() || !v30Var.d.T0()) {
                    return;
                }
                tx0Var.e(false, z10);
                return;
            case 5:
                i40 i40Var = (i40) this.c;
                int i23 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = i40Var.O;
                int i24 = i40Var.N;
                if (i23 != i40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i40Var.b0[0] ? "$" : "#");
                sb2.append(i40Var.Y);
                String sb3 = sb2.toString();
                ai.v8 v8Var = i40Var.Q;
                if (v8Var == null || !TextUtils.equals(v8Var.C, sb3)) {
                    i40Var.Q = new ai.v8(i24, null, sb3);
                }
                if (i40Var.Q.i.size() <= 0) {
                    r82 = 1;
                    i40Var.Q.p(4, true);
                } else {
                    r82 = 1;
                }
                i40Var.P = r82;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r82;
                i40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList3.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) hg.k0.g(r82, arrayList3);
                    tL_channels_searchPosts.offset_rate = i40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i24).getInputPeer(messageObject.messageOwner.peer_id);
                }
                i40Var.U = ConnectionsManager.getInstance(i24).sendRequest(tL_channels_searchPosts, new gg.u(i40Var, i23, sb3, 6));
                return;
            case 6:
                f60 f60Var = (f60) this.c;
                int i25 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = f60Var.n0;
                if (f60Var.m0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i25);
                }
                if (!f60Var.s0) {
                    if (i25 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    f60Var.t0 = new CameraSession(f60Var.I, sizeArr[0], f60Var.o0, 256, true);
                    f60Var.u();
                    q50 q50Var = f60Var.m0;
                    CameraSession cameraSession = f60Var.t0;
                    Handler handler = q50Var.getHandler();
                    if (handler != null) {
                        q50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(f60Var.t0, surfaceTexture, new h50(f60Var, 1), new h50(f60Var, 2));
                    return;
                }
                if (f60Var.u0) {
                    Camera2Session camera2Session = f60Var.v0[i25];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i25 == 1) {
                    return;
                }
                q50 q50Var2 = f60Var.m0;
                Camera2Session camera2Session2 = f60Var.w0;
                Handler handler2 = q50Var2.getHandler();
                if (handler2 != null) {
                    q50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                f60Var.w0.open(surfaceTexture);
                return;
            case 7:
                y50 y50Var = (y50) this.c;
                int i26 = this.b;
                t50 t50Var = (t50) this.d;
                f60 f60Var2 = y50Var.H0;
                VideoEditedInfo videoEditedInfo = f60Var2.S;
                int i27 = f60Var2.f;
                r50 r50Var = f60Var2.n;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    f60Var2.S = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (f60Var2.S.needConvert()) {
                    f60Var2.M = null;
                    f60Var2.N = null;
                    f60Var2.O = null;
                    f60Var2.P = null;
                    VideoEditedInfo videoEditedInfo3 = f60Var2.S;
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
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * f60Var2.Q));
                    VideoEditedInfo videoEditedInfo4 = f60Var2.S;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i27).cancelFileUpload(f60Var2.f0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    f60Var2.S.estimatedSize = Math.max(1L, f60Var2.Q);
                }
                VideoEditedInfo videoEditedInfo5 = f60Var2.S;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = f60Var2.M;
                videoEditedInfo5.encryptedFile = f60Var2.N;
                videoEditedInfo5.key = f60Var2.O;
                videoEditedInfo5.iv = f60Var2.P;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = y50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = f60Var2.S;
                if (i26 != 1) {
                    y50Var.h(y50Var.a);
                    videoEditedInfo6.estimatedDuration = f60Var2.k0;
                    NotificationCenter.getInstance(i27).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(f60Var2.V), videoEditedInfo6, y50Var.a.getAbsolutePath(), y50Var.A0);
                    return;
                }
                if (r50Var.c()) {
                    Activity parentActivity = r50Var.getParentActivity();
                    long a2 = r50Var.a();
                    int i28 = 0;
                    v50 v50Var = new v50(y50Var, t50Var, videoEditedInfo6, i28);
                    u50 u50Var = new u50(y50Var, i28);
                    org.telegram.ui.ActionBar.d6 d6Var = f60Var2.U0;
                    Pattern pattern = e5.a;
                    e5.K(parentActivity, a2, -1L, 0, false, v50Var, u50Var, new c5(d6Var), d6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (t50Var != null) {
                        photoEntry.ttl = t50Var.c;
                        photoEntry.effectId = t50Var.d;
                    }
                    f60Var2.n.q(photoEntry, videoEditedInfo6, t50Var == null || t50Var.a, t50Var != null ? t50Var.b : 0, 0, false, t50Var != null ? t50Var.e : j3);
                }
                f60Var2.S = null;
                return;
            case 8:
                sj0 sj0Var = (sj0) this.c;
                int i29 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i30 = sj0Var.f;
                TextView textView = sj0Var.b;
                MessageObject messageObject2 = sj0Var.s;
                ImageView imageView = sj0Var.d;
                w9 w9Var = sj0Var.e;
                ArrayList arrayList4 = sj0Var.r;
                ArrayList arrayList5 = sj0Var.n;
                if (arrayList5.isEmpty() || arrayList5.size() < i29) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i29, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i29), i29 == arrayList5.size() ? String.valueOf(i29) : i29 + "/" + arrayList5.size());
                }
                if (sj0Var.getMeasuredWidth() > 0) {
                    sj0Var.v = sj0Var.getMeasuredWidth();
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
                                            if (((rj0) arrayList4.get(i32)).b == user2.id) {
                                                break;
                                            } else {
                                                i32 = i33 + 1;
                                            }
                                        } else {
                                            arrayList4.add(new rj0(0, user2));
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
                                            arrayList4.add(new rj0(0, chat3));
                                        } else if (((rj0) arrayList4.get(i34)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                            }
                            w00 w00Var = sj0Var.a;
                            k9 k9Var = sj0Var.c;
                            sj0Var.setEnabled(arrayList4.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList4.size()) {
                                    k9Var.b(i12, ((rj0) arrayList4.get(i12)).a, i30);
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
                                    w00Var.animate().alpha(0.0f).setDuration(220L).setListener(new da(w00Var)).start();
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
                            w00Var.animate().alpha(0.0f).setDuration(220L).setListener(new da(w00Var)).start();
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
                w00 w00Var2 = sj0Var.a;
                k9 k9Var2 = sj0Var.c;
                sj0Var.setEnabled(arrayList4.size() <= 0);
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
                w00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new da(w00Var2)).start();
                return;
            case 9:
                vq0 vq0Var = (vq0) this.c;
                int i35 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                tq0 tq0Var = vq0Var.e;
                zq0 zq0Var = vq0Var.K;
                if (i35 != vq0Var.r) {
                    return;
                }
                vq0Var.h();
                vq0Var.I = false;
                vq0Var.v = i35;
                if (vq0Var.s != i35) {
                    tq0Var.b();
                }
                aq0 aq0Var = zq0Var.F;
                vq0 vq0Var2 = zq0Var.M;
                if (aq0Var.getAdapter() != vq0Var2) {
                    zq0.s0(zq0Var);
                    vq0Var2.l();
                }
                for (int i36 = 0; i36 < arrayList8.size(); i36++) {
                    TLObject tLObject2 = ((nq0) arrayList8.get(i36)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i14 = ((org.telegram.ui.ActionBar.f3) zq0Var).currentAccount;
                        MessagesController.getInstance(i14).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i13 = ((org.telegram.ui.ActionBar.f3) zq0Var).currentAccount;
                        MessagesController.getInstance(i13).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !vq0Var.d.isEmpty() && arrayList8.isEmpty();
                if (vq0Var.d.isEmpty()) {
                    arrayList8.isEmpty();
                }
                if (z11) {
                    zq0.s0(zq0Var);
                }
                vq0Var.d = arrayList8;
                tq0Var.f(arrayList8, null);
                int i37 = vq0Var.J;
                if (vq0Var.h() != 0 || tq0Var.e() || vq0Var.I) {
                    zq0Var.x0.b(i37);
                } else {
                    zq0Var.Q.e(false, true);
                }
                vq0Var.l();
                zq0Var.H0(true);
                return;
            case 10:
                r0.getStoriesController().c(this.b, ((pv0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 11:
                pv0 pv0Var = (pv0) this.c;
                int i38 = this.b;
                b80 b80Var = (b80) this.d;
                pv0Var.d1(i38);
                b80Var.u();
                return;
            case 12:
                pv0 pv0Var2 = (pv0) this.c;
                pv0Var2.S(this.b, (zl0) this.d, false);
                pv0Var2.J1 = null;
                return;
            case 13:
                tt0 tt0Var = (tt0) this.c;
                int i39 = this.b;
                b80 b80Var2 = (b80) this.d;
                tt0Var.d.c1(i39, false);
                b80Var2.u();
                return;
            case 14:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.c;
                a0.i iVar3 = (a0.i) this.d;
                int i40 = this.b;
                if (n2Var3 instanceof org.telegram.ui.yn) {
                    org.telegram.ui.yn ynVar2 = (org.telegram.ui.yn) n2Var3;
                    ynVar2.Q7();
                    undoView2 = ynVar2.w3;
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
                av0 av0Var = (av0) this.c;
                int i41 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i41 != av0Var.E) {
                    return;
                }
                av0Var.y = ConnectionsManager.getInstance(av0Var.d).sendRequest(tL_messages_search, new ai.i8(av0Var, i41, i15));
                return;
            case 16:
                av0 av0Var2 = (av0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i42 = this.b;
                ArrayList arrayList9 = av0Var2.h;
                int i43 = av0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i42 == av0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i43).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i43).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i43).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i44 = 0; i44 < messages_messages.messages.size(); i44++) {
                        MessageObject messageObject3 = new MessageObject(i43, messages_messages.messages.get(i44), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(av0Var2.w);
                        arrayList9.add(messageObject3);
                    }
                    av0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        av0Var2.s = arrayList9.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        av0Var2.s = true;
                    }
                    av0Var2.G(false);
                    av0Var2.r = false;
                    av0Var2.y = -1;
                    return;
                }
                return;
            case 17:
                tw0 tw0Var = (tw0) this.c;
                int i45 = this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                tw0Var.Y0 = false;
                if (!tw0Var.V0 && tw0Var.W0) {
                    tw0Var.C(true);
                    return;
                }
                tw0Var.m0 = tw0Var.f1[0];
                tw0Var.l();
                DownloadController.getInstance(i45).removeLoadingFileObserver(u1Var);
                tw0Var.I();
                tw0Var.x();
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor4 != null) {
                    }
                    throw th;
                }
                break;
            case 20:
                dy0 dy0Var = (dy0) this.c;
                a0.i iVar4 = (a0.i) this.d;
                int i48 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var4 = dy0Var.X0.L;
                if (n2Var4 instanceof org.telegram.ui.yn) {
                    org.telegram.ui.yn ynVar3 = (org.telegram.ui.yn) n2Var4;
                    ynVar3.Q7();
                    undoView3 = ynVar3.w3;
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
                iz0 iz0Var = (iz0) this.c;
                String str3 = (String) this.d;
                int i49 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList10 = new ArrayList<>(1);
                arrayList10.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(iz0Var.a).fillWithAnimatedEmoji(arrayList10, 15, false, false, false, new ai.c9(iz0Var, i49, str3, arrayList10));
                return;
            case 22:
                j21 j21Var = (j21) this.c;
                String str4 = (String) this.d;
                int i50 = this.b;
                i21 i21Var = j21Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        j21Var.d = -1;
                        AndroidUtilities.runOnUIThread(new ai.c9(j21Var, j21Var.d, new ArrayList(), new ArrayList(), 29));
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
                    int size5 = i21Var.d.size();
                    for (int i53 = 0; i53 < size5; i53++) {
                        ArrayList arrayList13 = (ArrayList) i21Var.d.get(i53);
                        String i54 = org.telegram.ui.ActionBar.f5.i(((org.telegram.ui.ActionBar.k6) arrayList13.get(0)).f);
                        String lowerCase2 = i54.toLowerCase();
                        int i55 = 0;
                        while (true) {
                            if (i55 < i52) {
                                String str5 = strArr[i55];
                                if (lowerCase2.contains(str5)) {
                                    arrayList11.add(arrayList13);
                                    arrayList12.add(j21.E(i54, str5));
                                } else {
                                    i55++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.c9(j21Var, i50, arrayList11, arrayList12, 29));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 23:
                AndroidUtilities.runOnUIThread(new q21((s21) this.c, (op) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
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
                org.telegram.ui.ki kiVar = (org.telegram.ui.ki) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                int i56 = this.b;
                if (tLObject4 instanceof TLRPC.User) {
                    kiVar.a = (TLRPC.User) tLObject4;
                    MessagesController.getInstance(i56).putUser(kiVar.a, false);
                }
                w00 w00Var3 = kiVar.c;
                q90 q90Var = kiVar.b;
                kiVar.setEnabled(kiVar.a != null);
                TLRPC.User user3 = kiVar.a;
                if (user3 != null) {
                    q90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user3)), new ai.j(kiVar, user3.id, 26)));
                }
                q90Var.animate().alpha(1.0f).setDuration(220L).start();
                w00Var3.animate().alpha(0.0f).setDuration(220L).setListener(new da(w00Var3)).start();
                return;
        }
    }

    public /* synthetic */ zm(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ zm(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
