package org.telegram.ui;

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
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gm(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n21((org.telegram.ui.Components.w21) this.c, (org.telegram.ui.Components.yp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 1));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = org.telegram.ui.Components.f41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(org.telegram.ui.Components.f41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.d0(3);
        }
        int i10 = this.b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        dy dyVar = (dy) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        yy yyVar = dyVar.f0;
        ArrayList arrayList = yyVar.R1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        yyVar.R1.add(i10, dialog);
        yyVar.e0[0].q(true);
    }

    private final void d() {
        wy wyVar = (wy) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        xy xyVar = wyVar.g;
        yy yyVar = wyVar.h;
        yyVar.S1 = true;
        yyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        yyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = yyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            xyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = yyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            yyVar.y4(true, true);
            xyVar.x.D();
            xyVar.q(true);
            yyVar.m3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                yyVar.y4(true, true);
                xyVar.q(true);
                yyVar.m3();
            } else {
                if (!yyVar.R1.isEmpty()) {
                    yyVar.R1.remove(0);
                }
                xyVar.x.D();
                xyVar.q(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01b9: MOVE (r10 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:442), block:B:101:0x01b9 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:486:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        UndoView undoView2;
        ?? r92;
        long j10;
        int i10;
        String formatPluralString;
        ArrayList arrayList;
        int size;
        int i11;
        int size2;
        int i12;
        int i13;
        int size3;
        int dp;
        float f7;
        int i14;
        int i15;
        int i16;
        int i17;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i18 = 5;
        int i19 = 4;
        UndoView undoView3 = null;
        r10 = null;
        String str = null;
        UndoView undoView4 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        int i20 = 0;
        switch (this.a) {
            case 0:
                im imVar = (im) this.c;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.d;
                int i21 = this.b;
                imVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                rm rmVar = imVar.a;
                rmVar.Q.j(i21, messageObject.getId(), true, messageObject.getDialogId() == rmVar.Q.L6 ? 1 : 0, true, 0);
                return;
            case 1:
                org.telegram.ui.Wallet.a5.u0(((org.telegram.ui.Components.cl) this.c).getContext(), this.b, (org.telegram.ui.ActionBar.c6) this.d);
                return;
            case 2:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) this.c;
                int i22 = this.b;
                View view = (View) this.d;
                ioVar.V = 0;
                ioVar.U = i22;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ioVar.X((org.telegram.ui.Cells.r8) view, true);
                    return;
                } else {
                    ioVar.r.m(ioVar.I0);
                    return;
                }
            case 3:
                org.telegram.ui.Components.rv rvVar = (org.telegram.ui.Components.rv) this.c;
                a0.h hVar = (a0.h) this.d;
                int i23 = this.b;
                org.telegram.ui.ActionBar.m2 m2Var = rvVar.b1.c;
                if (m2Var instanceof fo) {
                    fo foVar = (fo) m2Var;
                    foVar.T7();
                    undoView2 = foVar.y3;
                } else {
                    if (!(m2Var instanceof ProfileActivity)) {
                        undoView = null;
                        if (undoView == null) {
                            if (hVar.m() == 1) {
                                undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i23), 53);
                                return;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(i23), Integer.valueOf(hVar.m()), null, null);
                                return;
                            }
                        }
                        return;
                    }
                    undoView2 = ((ProfileActivity) m2Var).M;
                }
                undoView = undoView2;
                if (undoView == null) {
                }
            case 4:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) this.c;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.d;
                int i24 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var == null) {
                    return;
                }
                a2Var.setOnCancelListener(new ga(ryVar, i24, 4));
                a2VarArr[0].show();
                return;
            case 5:
                int i25 = this.b;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i25;
                m2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new hg.u(m2Var2, i25, callback, i18));
                return;
            case 6:
                org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) this.c;
                int i26 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                hg.a2 a2Var2 = d40Var.d;
                org.telegram.ui.Components.e40 e40Var = d40Var.w;
                if (i26 != d40Var.n) {
                    return;
                }
                d40Var.h = false;
                TLRPC.Chat chat = e40Var.V;
                org.telegram.ui.Components.wx0 wx0Var = e40Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = a2Var2.h;
                    ArrayList arrayList3 = a2Var2.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i27 = 0; i27 < size4; i27++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i27);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    a2Var2.i();
                }
                int i28 = d40Var.f - 1;
                boolean z10 = wx0Var.getVisibility() == 0;
                d40Var.l();
                if (d40Var.f > i28) {
                    e40Var.K(i28);
                }
                if (d40Var.h || a2Var2.e() || !e40Var.d.S0()) {
                    return;
                }
                wx0Var.e(false, z10);
                return;
            case 7:
                org.telegram.ui.Components.r40 r40Var = (org.telegram.ui.Components.r40) this.c;
                int i29 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = r40Var.O;
                int i30 = r40Var.N;
                if (i29 != r40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r40Var.b0[0] ? "$" : "#");
                sb2.append(r40Var.Y);
                String sb3 = sb2.toString();
                bi.g8 g8Var = r40Var.Q;
                if (g8Var == null || !TextUtils.equals(g8Var.C, sb3)) {
                    r40Var.Q = new bi.g8(i30, null, sb3);
                }
                if (r40Var.Q.i.size() <= 0) {
                    r92 = 1;
                    r40Var.Q.p(4, true);
                } else {
                    r92 = 1;
                }
                r40Var.P = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                r40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject2 = (MessageObject) i2.d.h(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = r40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i30).getInputPeer(messageObject2.messageOwner.peer_id);
                }
                r40Var.U = ConnectionsManager.getInstance(i30).sendRequest(tL_channels_searchPosts, new hg.u(r40Var, i29, sb3, 6));
                return;
            case 8:
                org.telegram.ui.Components.p60 p60Var = (org.telegram.ui.Components.p60) this.c;
                int i31 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (p60Var.m0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i31);
                }
                if (p60Var.B0 && i31 == p60Var.A0) {
                    p60Var.p("camera open submitted: surface=" + i31);
                }
                if (!p60Var.s0) {
                    if (i31 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(p60Var.n0[0].getWidth(), p60Var.n0[0].getHeight());
                    p60Var.t0 = new CameraSession(p60Var.I, p60Var.n0[0], p60Var.o0, 256, true);
                    p60Var.v();
                    org.telegram.ui.Components.b60 b60Var = p60Var.m0;
                    CameraSession cameraSession = p60Var.t0;
                    Handler handler = b60Var.getHandler();
                    if (handler != null) {
                        b60Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(p60Var.t0, surfaceTexture, new org.telegram.ui.Components.r50(p60Var, 1), new org.telegram.ui.Components.r50(p60Var, 2));
                    return;
                }
                if (p60Var.u0) {
                    Camera2Session camera2Session = p60Var.v0[i31];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i31 == 1) {
                    return;
                }
                org.telegram.ui.Components.b60 b60Var2 = p60Var.m0;
                Camera2Session camera2Session2 = p60Var.w0;
                Handler handler2 = b60Var2.getHandler();
                if (handler2 != null) {
                    b60Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                p60Var.w0.open(surfaceTexture);
                return;
            case 9:
                org.telegram.ui.Components.i60 i60Var = (org.telegram.ui.Components.i60) this.c;
                int i32 = this.b;
                org.telegram.ui.Components.e60 e60Var = (org.telegram.ui.Components.e60) this.d;
                org.telegram.ui.Components.p60 p60Var2 = i60Var.H0;
                VideoEditedInfo videoEditedInfo = p60Var2.S;
                int i33 = p60Var2.f;
                org.telegram.ui.Components.c60 c60Var = p60Var2.n;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    p60Var2.S = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (p60Var2.S.needConvert()) {
                    p60Var2.M = null;
                    p60Var2.N = null;
                    p60Var2.O = null;
                    p60Var2.P = null;
                    VideoEditedInfo videoEditedInfo3 = p60Var2.S;
                    long j11 = videoEditedInfo3.estimatedDuration;
                    j10 = 0;
                    double d = j11;
                    i10 = i33;
                    long j12 = videoEditedInfo3.startTime;
                    if (j12 < 0) {
                        j12 = 0;
                    }
                    long j13 = videoEditedInfo3.endTime;
                    if (j13 >= 0) {
                        j11 = j13;
                    }
                    long j14 = j11 - j12;
                    videoEditedInfo3.estimatedDuration = j14;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j14 / d) * p60Var2.Q));
                    VideoEditedInfo videoEditedInfo4 = p60Var2.S;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j15 = videoEditedInfo4.startTime;
                    if (j15 > 0) {
                        videoEditedInfo4.startTime = j15 * 1000;
                    }
                    long j16 = videoEditedInfo4.endTime;
                    if (j16 > 0) {
                        videoEditedInfo4.endTime = j16 * 1000;
                    }
                    FileLoader.getInstance(i10).cancelFileUpload(p60Var2.f0.getAbsolutePath(), false);
                } else {
                    j10 = 0;
                    i10 = i33;
                    p60Var2.S.estimatedSize = Math.max(1L, p60Var2.Q);
                }
                VideoEditedInfo videoEditedInfo5 = p60Var2.S;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = p60Var2.M;
                videoEditedInfo5.encryptedFile = p60Var2.N;
                videoEditedInfo5.key = p60Var2.O;
                videoEditedInfo5.iv = p60Var2.P;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = i60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = p60Var2.S;
                int i34 = 1;
                if (i32 != 1) {
                    i60Var.h(i60Var.a);
                    videoEditedInfo6.estimatedDuration = p60Var2.k0;
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(p60Var2.V), videoEditedInfo6, i60Var.a.getAbsolutePath(), i60Var.A0);
                    return;
                }
                if (c60Var.c()) {
                    Activity parentActivity = c60Var.getParentActivity();
                    long a2 = c60Var.a();
                    org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(i60Var, e60Var, videoEditedInfo6, i34);
                    org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(i60Var, 0);
                    org.telegram.ui.ActionBar.c6 c6Var = p60Var2.Z0;
                    Pattern pattern = org.telegram.ui.Components.g5.a;
                    org.telegram.ui.Components.g5.J(parentActivity, a2, -1L, 0, false, nzVar, f60Var, new org.telegram.ui.Components.e5(c6Var), c6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, i60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (e60Var != null) {
                        photoEntry.ttl = e60Var.c;
                        photoEntry.effectId = e60Var.d;
                    }
                    p60Var2.n.s(photoEntry, videoEditedInfo6, e60Var == null || e60Var.a, e60Var != null ? e60Var.b : 0, 0, false, e60Var != null ? e60Var.e : j10);
                }
                p60Var2.S = null;
                return;
            case 10:
                org.telegram.ui.Components.gk0 gk0Var = (org.telegram.ui.Components.gk0) this.c;
                int i35 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i36 = gk0Var.f;
                TextView textView = gk0Var.b;
                MessageObject messageObject3 = gk0Var.s;
                ImageView imageView = gk0Var.d;
                org.telegram.ui.Components.z9 z9Var = gk0Var.e;
                ArrayList arrayList5 = gk0Var.r;
                ArrayList arrayList6 = gk0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i35) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i35, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i35), i35 == arrayList6.size() ? String.valueOf(i35) : i35 + "/" + arrayList6.size());
                }
                if (gk0Var.getMeasuredWidth() > 0) {
                    gk0Var.v = gk0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject3.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i36).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            z9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            z9Var.setVisibility(0);
                            z9Var.setAlpha(0.0f);
                            z9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i11 = 0;
                            while (i11 < size) {
                                TLRPC.User user = arrayList7.get(i11);
                                int i37 = i11 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject3.messageOwner.from_id;
                                if (peer != null) {
                                    i15 = i37;
                                    if (user2.id != peer.user_id) {
                                        int i38 = 0;
                                        while (true) {
                                            if (i38 < arrayList.size()) {
                                                i14 = size;
                                                int i39 = i38;
                                                if (((org.telegram.ui.Components.fk0) arrayList.get(i38)).b == user2.id) {
                                                    break;
                                                }
                                                i38 = i39 + 1;
                                                size = i14;
                                            } else {
                                                i14 = size;
                                                arrayList.add(new org.telegram.ui.Components.fk0(0, user2));
                                            }
                                        }
                                    } else {
                                        i14 = size;
                                    }
                                } else {
                                    i14 = size;
                                    i15 = i37;
                                }
                                size = i14;
                                i11 = i15;
                            }
                            ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList8.size();
                            i12 = 0;
                            while (i12 < size2) {
                                TLRPC.Chat chat2 = arrayList8.get(i12);
                                i12++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject3.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i40 = i20;
                                    while (true) {
                                        if (i40 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.fk0(0, chat3));
                                        } else if (((org.telegram.ui.Components.fk0) arrayList.get(i40)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i40++;
                                        }
                                    }
                                }
                                i20 = 0;
                            }
                            org.telegram.ui.Components.f10 f10Var = gk0Var.a;
                            org.telegram.ui.Components.n9 n9Var = gk0Var.c;
                            gk0Var.setEnabled(arrayList.size() <= 0);
                            for (i13 = 0; i13 < 3; i13++) {
                                if (i13 < arrayList.size()) {
                                    n9Var.b(i13, ((org.telegram.ui.Components.fk0) arrayList.get(i13)).a, i36);
                                } else {
                                    n9Var.b(i13, null, i36);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f7 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f7 = AndroidUtilities.dp(12.0f);
                                    }
                                    n9Var.setTranslationX(f7);
                                    n9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    n9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    f10Var.animate().alpha(0.0f).setDuration(220L).setListener(new vo(f10Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            n9Var.setTranslationX(f7);
                            n9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            n9Var.animate().alpha(1.0f).setDuration(220L).start();
                            f10Var.animate().alpha(0.0f).setDuration(220L).setListener(new vo(f10Var)).start();
                            return;
                        }
                    }
                }
                arrayList = arrayList5;
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList72 = tL_messages_messageReactionsList.users;
                size = arrayList72.size();
                i11 = 0;
                while (i11 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList82 = tL_messages_messageReactionsList.chats;
                size2 = arrayList82.size();
                i12 = 0;
                while (i12 < size2) {
                }
                org.telegram.ui.Components.f10 f10Var2 = gk0Var.a;
                org.telegram.ui.Components.n9 n9Var2 = gk0Var.c;
                gk0Var.setEnabled(arrayList.size() <= 0);
                while (i13 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                n9Var2.setTranslationX(f7);
                n9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                n9Var2.animate().alpha(1.0f).setDuration(220L).start();
                f10Var2.animate().alpha(0.0f).setDuration(220L).setListener(new vo(f10Var2)).start();
                return;
            case 11:
                org.telegram.ui.Components.er0 er0Var = (org.telegram.ui.Components.er0) this.c;
                int i41 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                org.telegram.ui.Components.cr0 cr0Var = er0Var.e;
                org.telegram.ui.Components.ir0 ir0Var = er0Var.K;
                if (i41 != er0Var.r) {
                    return;
                }
                er0Var.h();
                er0Var.I = false;
                er0Var.v = i41;
                if (er0Var.s != i41) {
                    cr0Var.b();
                }
                org.telegram.ui.Components.kq0 kq0Var = ir0Var.F;
                org.telegram.ui.Components.er0 er0Var2 = ir0Var.M;
                if (kq0Var.getAdapter() != er0Var2) {
                    org.telegram.ui.Components.ir0.G0(ir0Var);
                    er0Var2.l();
                }
                for (int i42 = 0; i42 < arrayList9.size(); i42++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.wq0) arrayList9.get(i42)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i17 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
                        MessagesController.getInstance(i17).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i16 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
                        MessagesController.getInstance(i16).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !er0Var.d.isEmpty() && arrayList9.isEmpty();
                if (er0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.ir0.G0(ir0Var);
                }
                er0Var.d = arrayList9;
                cr0Var.f(arrayList9, null);
                int i43 = er0Var.J;
                if (er0Var.h() != 0 || cr0Var.e() || er0Var.I) {
                    ir0Var.x0.b(i43);
                } else {
                    ir0Var.Q.e(false, true);
                }
                er0Var.l();
                ir0Var.L0(true);
                return;
            case 12:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.xv0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 13:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.c;
                int i44 = this.b;
                org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) this.d;
                xv0Var.e1(i44);
                l80Var.u();
                return;
            case 14:
                org.telegram.ui.Components.xv0 xv0Var2 = (org.telegram.ui.Components.xv0) this.c;
                xv0Var2.S(this.b, (org.telegram.ui.Components.mm0) this.d, false);
                xv0Var2.J1 = null;
                return;
            case 15:
                org.telegram.ui.Components.bu0 bu0Var = (org.telegram.ui.Components.bu0) this.c;
                int i45 = this.b;
                org.telegram.ui.Components.l80 l80Var2 = (org.telegram.ui.Components.l80) this.d;
                bu0Var.d.d1(i45, false);
                l80Var2.u();
                return;
            case 16:
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i46 = this.b;
                if (m2Var3 instanceof fo) {
                    fo foVar2 = (fo) m2Var3;
                    foVar2.T7();
                    undoView3 = foVar2.y3;
                } else if (m2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) m2Var3).M;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar3.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i46), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i46), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 17:
                org.telegram.ui.Components.iv0 iv0Var = (org.telegram.ui.Components.iv0) this.c;
                int i47 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i47 != iv0Var.E) {
                    return;
                }
                iv0Var.y = ConnectionsManager.getInstance(iv0Var.d).sendRequest(tL_messages_search, new bi.u7(iv0Var, i47, i19));
                return;
            case 18:
                org.telegram.ui.Components.iv0 iv0Var2 = (org.telegram.ui.Components.iv0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i48 = this.b;
                ArrayList arrayList10 = iv0Var2.h;
                int i49 = iv0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i48 == iv0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i49).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i49).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i49).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i50 = 0; i50 < messages_messages.messages.size(); i50++) {
                        MessageObject messageObject4 = new MessageObject(i49, messages_messages.messages.get(i50), false, true);
                        if (messageObject4.hasValidGroupId()) {
                            messageObject4.isPrimaryGroupMessage = true;
                        }
                        messageObject4.setQuery(iv0Var2.w);
                        arrayList10.add(messageObject4);
                    }
                    iv0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        iv0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        iv0Var2.s = true;
                    }
                    iv0Var2.G(false);
                    iv0Var2.r = false;
                    iv0Var2.y = -1;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.ww0 ww0Var = (org.telegram.ui.Components.ww0) this.c;
                int i51 = this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                ww0Var.Y0 = false;
                if (!ww0Var.V0 && ww0Var.W0) {
                    ww0Var.C(true);
                    return;
                }
                ww0Var.m0 = ww0Var.f1[0];
                ww0Var.l();
                DownloadController.getInstance(i51).removeLoadingFileObserver(u1Var);
                ww0Var.I();
                ww0Var.x();
                return;
            case 20:
                int i52 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i52).getDatabase();
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
            case 21:
                int i53 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i53).getDatabase();
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
            case 22:
                org.telegram.ui.Components.hy0 hy0Var = (org.telegram.ui.Components.hy0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i54 = this.b;
                org.telegram.ui.ActionBar.m2 m2Var4 = hy0Var.b1.L;
                if (m2Var4 instanceof fo) {
                    fo foVar3 = (fo) m2Var4;
                    foVar3.T7();
                    undoView4 = foVar3.y3;
                } else if (m2Var4 instanceof ProfileActivity) {
                    undoView4 = ((ProfileActivity) m2Var4).M;
                }
                UndoView undoView6 = undoView4;
                if (undoView6 != null) {
                    if (hVar4.m() == 1) {
                        undoView6.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i54), 53);
                        return;
                    } else {
                        undoView6.k(0L, 53, Integer.valueOf(i54), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 23:
                org.telegram.ui.Components.lz0 lz0Var = (org.telegram.ui.Components.lz0) this.c;
                String str3 = (String) this.d;
                int i55 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(lz0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new bi.n8(lz0Var, i55, str3, arrayList11));
                return;
            case 24:
                org.telegram.ui.Components.o21 o21Var = (org.telegram.ui.Components.o21) this.c;
                String str4 = (String) this.d;
                int i56 = this.b;
                org.telegram.ui.Components.m21 m21Var = o21Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        o21Var.d = -1;
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n21(o21Var, o21Var.d, new ArrayList(), new ArrayList(), 0));
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                        break;
                    }
                    int i57 = 0;
                    int i58 = i57 + 1;
                    String[] strArr = new String[i58];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int size5 = m21Var.d.size();
                    for (int i59 = 0; i59 < size5; i59++) {
                        ArrayList arrayList14 = (ArrayList) m21Var.d.get(i59);
                        String i60 = org.telegram.ui.ActionBar.e5.i(((org.telegram.ui.ActionBar.i6) arrayList14.get(0)).f);
                        String lowerCase2 = i60.toLowerCase();
                        int i61 = 0;
                        while (true) {
                            if (i61 < i58) {
                                String str5 = strArr[i61];
                                if (lowerCase2.contains(str5)) {
                                    arrayList12.add(arrayList14);
                                    arrayList13.add(org.telegram.ui.Components.o21.E(i60, str5));
                                } else {
                                    i61++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n21(o21Var, i56, arrayList12, arrayList13, 0));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 25:
                a();
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                d();
                return;
            default:
                n60 n60Var = (n60) this.c;
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = (org.telegram.ui.ActionBar.a2[]) this.d;
                int i62 = this.b;
                org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr2[0];
                if (a2Var3 == null) {
                    return;
                }
                a2Var3.setOnCancelListener(new ga(n60Var, i62, i18));
                a2VarArr2[0].show();
                return;
        }
    }

    public /* synthetic */ gm(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ gm(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
