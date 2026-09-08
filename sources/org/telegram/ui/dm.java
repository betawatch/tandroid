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
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dm(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r11((org.telegram.ui.Components.t11) this.c, (org.telegram.ui.Components.kp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.d;
        HashMap hashMap = org.telegram.ui.Components.d31.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(org.telegram.ui.Components.d31.o(messageObject)));
        }
        if (k1Var != null) {
            k1Var.c0(3);
        }
        int i10 = this.b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        yx yxVar = (yx) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        uy uyVar = yxVar.f0;
        ArrayList arrayList = uyVar.R1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        uyVar.R1.add(i10, dialog);
        uyVar.e0[0].q(true);
    }

    private final void e() {
        sy syVar = (sy) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        ty tyVar = syVar.g;
        uy uyVar = syVar.h;
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
            uyVar.A4(true, true);
            tyVar.x.D();
            tyVar.q(true);
            uyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                uyVar.A4(true, true);
                tyVar.q(true);
                uyVar.o3();
            } else {
                if (!uyVar.R1.isEmpty()) {
                    uyVar.R1.remove(0);
                }
                tyVar.x.D();
                tyVar.q(true);
            }
        }
    }

    private final void f() {
        j60 j60Var = (j60) this.c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new ba(j60Var, this.b, 5));
        b2VarArr[0].show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01e0: MOVE (r9 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:481), block:B:116:0x01e0 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0624  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r92;
        long j3;
        String formatPluralString;
        ArrayList arrayList;
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
        int i15;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i16 = 4;
        UndoView undoView = null;
        r9 = null;
        String str = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        UndoView undoView3 = null;
        switch (this.a) {
            case 0:
                fm fmVar = (fm) this.c;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.d;
                int i17 = this.b;
                fmVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                om omVar = fmVar.a;
                omVar.Q.F(i17, messageObject.getId(), messageObject.getDialogId() == omVar.Q.L6 ? 1 : 0, 0, true, true);
                return;
            case 1:
                org.telegram.ui.Components.tn tnVar = (org.telegram.ui.Components.tn) this.c;
                int i18 = this.b;
                View view = (View) this.d;
                tnVar.V = 0;
                tnVar.U = i18;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    tnVar.U((org.telegram.ui.Cells.r8) view, true);
                    return;
                } else {
                    tnVar.r.m(tnVar.I0);
                    return;
                }
            case 2:
                org.telegram.ui.Components.ev evVar = (org.telegram.ui.Components.ev) this.c;
                a0.i iVar = (a0.i) this.d;
                int i19 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = evVar.b1.c;
                if (n2Var instanceof co) {
                    co coVar = (co) n2Var;
                    coVar.Q7();
                    undoView = coVar.y3;
                } else if (n2Var instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) n2Var).M;
                }
                if (undoView != null) {
                    if (iVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i19), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i19), Integer.valueOf(iVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 3:
                org.telegram.ui.Components.gy gyVar = (org.telegram.ui.Components.gy) this.c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                int i20 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new ba(gyVar, i20, i16));
                b2VarArr[0].show();
                return;
            case 4:
                int i21 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i21;
                n2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new hg.u(n2Var2, i21, callback, 5));
                return;
            case 5:
                org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) this.c;
                int i22 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                hg.b2 b2Var2 = q30Var.d;
                org.telegram.ui.Components.r30 r30Var = q30Var.w;
                if (i22 != q30Var.n) {
                    return;
                }
                q30Var.h = false;
                TLRPC.Chat chat = r30Var.V;
                org.telegram.ui.Components.xw0 xw0Var = r30Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.i iVar2 = b2Var2.h;
                    ArrayList arrayList3 = b2Var2.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i23 = 0; i23 < size4; i23++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i23);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            iVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            iVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    b2Var2.i();
                }
                int i24 = q30Var.f - 1;
                boolean z10 = xw0Var.getVisibility() == 0;
                q30Var.l();
                if (q30Var.f > i24) {
                    r30Var.J(i24);
                }
                if (q30Var.h || b2Var2.e() || !r30Var.d.R0()) {
                    return;
                }
                xw0Var.e(false, z10);
                return;
            case 6:
                org.telegram.ui.Components.e40 e40Var = (org.telegram.ui.Components.e40) this.c;
                int i25 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = e40Var.O;
                int i26 = e40Var.N;
                if (i25 != e40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e40Var.b0[0] ? "$" : "#");
                sb2.append(e40Var.Y);
                String sb3 = sb2.toString();
                bi.d8 d8Var = e40Var.Q;
                if (d8Var == null || !TextUtils.equals(d8Var.C, sb3)) {
                    e40Var.Q = new bi.d8(i26, null, sb3);
                }
                if (e40Var.Q.i.size() <= 0) {
                    r92 = 1;
                    e40Var.Q.p(4, true);
                } else {
                    r92 = 1;
                }
                e40Var.P = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                e40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject2 = (MessageObject) i2.g.h(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = e40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i26).getInputPeer(messageObject2.messageOwner.peer_id);
                }
                e40Var.U = ConnectionsManager.getInstance(i26).sendRequest(tL_channels_searchPosts, new hg.u(e40Var, i25, sb3, 6));
                return;
            case 7:
                org.telegram.ui.Components.w50 w50Var = (org.telegram.ui.Components.w50) this.c;
                int i27 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = w50Var.i0;
                if (w50Var.h0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i27);
                }
                if (!w50Var.n0) {
                    if (i27 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    w50Var.o0 = new CameraSession(w50Var.y, sizeArr[0], w50Var.j0, 256, true);
                    w50Var.r();
                    org.telegram.ui.Components.n50 n50Var = w50Var.h0;
                    CameraSession cameraSession = w50Var.o0;
                    Handler handler = n50Var.getHandler();
                    if (handler != null) {
                        n50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(w50Var.o0, surfaceTexture, new org.telegram.ui.Components.d50(w50Var, 1), new org.telegram.ui.Components.d50(w50Var, 2));
                    return;
                }
                if (w50Var.p0) {
                    Camera2Session camera2Session = w50Var.q0[i27];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i27 == 1) {
                    return;
                }
                org.telegram.ui.Components.n50 n50Var2 = w50Var.h0;
                Camera2Session camera2Session2 = w50Var.r0;
                Handler handler2 = n50Var2.getHandler();
                if (handler2 != null) {
                    n50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                w50Var.r0.open(surfaceTexture);
                return;
            case 8:
                org.telegram.ui.Components.v50 v50Var = (org.telegram.ui.Components.v50) this.c;
                int i28 = this.b;
                org.telegram.ui.Components.q50 q50Var = (org.telegram.ui.Components.q50) this.d;
                org.telegram.ui.Components.w50 w50Var2 = v50Var.H0;
                VideoEditedInfo videoEditedInfo = w50Var2.N;
                int i29 = w50Var2.a;
                org.telegram.ui.Components.o50 o50Var = w50Var2.c;
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
                    long j10 = videoEditedInfo3.estimatedDuration;
                    j3 = 0;
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
                    FileLoader.getInstance(i29).cancelFileUpload(w50Var2.a0.getAbsolutePath(), false);
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
                if (i28 != 1) {
                    v50Var.h(v50Var.a);
                    videoEditedInfo6.estimatedDuration = w50Var2.f0;
                    NotificationCenter.getInstance(i29).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(w50Var2.Q), videoEditedInfo6, v50Var.a.getAbsolutePath(), v50Var.A0);
                    return;
                }
                if (o50Var.c()) {
                    Activity parentActivity = o50Var.getParentActivity();
                    long a2 = o50Var.a();
                    int i30 = 0;
                    org.telegram.ui.Components.s50 s50Var = new org.telegram.ui.Components.s50(v50Var, q50Var, videoEditedInfo6, i30);
                    org.telegram.ui.Components.r50 r50Var = new org.telegram.ui.Components.r50(v50Var, i30);
                    org.telegram.ui.ActionBar.f6 f6Var = w50Var2.P0;
                    Pattern pattern = org.telegram.ui.Components.e5.a;
                    org.telegram.ui.Components.e5.K(parentActivity, a2, -1L, 0, false, s50Var, r50Var, new org.telegram.ui.Components.c5(f6Var), f6Var);
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
            case 9:
                org.telegram.ui.Components.fj0 fj0Var = (org.telegram.ui.Components.fj0) this.c;
                int i31 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i32 = fj0Var.f;
                TextView textView = fj0Var.b;
                MessageObject messageObject3 = fj0Var.s;
                ImageView imageView = fj0Var.d;
                org.telegram.ui.Components.x9 x9Var = fj0Var.e;
                ArrayList arrayList5 = fj0Var.r;
                ArrayList arrayList6 = fj0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i31) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i31, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i31), i31 == arrayList6.size() ? String.valueOf(i31) : i31 + "/" + arrayList6.size());
                }
                if (fj0Var.getMeasuredWidth() > 0) {
                    fj0Var.v = fj0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject3.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i32).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            x9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            x9Var.setVisibility(0);
                            x9Var.setAlpha(0.0f);
                            x9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i33 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject3.messageOwner.from_id;
                                int i34 = size;
                                if (peer == null || user2.id == peer.user_id) {
                                    i13 = i33;
                                } else {
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 < arrayList.size()) {
                                            i13 = i33;
                                            if (((org.telegram.ui.Components.ej0) arrayList.get(i35)).b == user2.id) {
                                                break;
                                            }
                                            i35++;
                                            i33 = i13;
                                        } else {
                                            i13 = i33;
                                            arrayList.add(new org.telegram.ui.Components.ej0(0, user2));
                                        }
                                    }
                                }
                                size = i34;
                                i10 = i13;
                            }
                            ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList8.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat2 = arrayList8.get(i11);
                                i11++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject3.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 < arrayList.size()) {
                                            int i37 = i36;
                                            if (((org.telegram.ui.Components.ej0) arrayList.get(i36)).b == (-chat3.id)) {
                                                break;
                                            } else {
                                                i36 = i37 + 1;
                                            }
                                        } else {
                                            arrayList.add(new org.telegram.ui.Components.ej0(0, chat3));
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.t00 t00Var = fj0Var.a;
                            org.telegram.ui.Components.l9 l9Var = fj0Var.c;
                            fj0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    l9Var.b(i12, ((org.telegram.ui.Components.ej0) arrayList.get(i12)).a, i32);
                                } else {
                                    l9Var.b(i12, null, i32);
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
                                    l9Var.setTranslationX(f7);
                                    l9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    l9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new to(t00Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            l9Var.setTranslationX(f7);
                            l9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            l9Var.animate().alpha(1.0f).setDuration(220L).start();
                            t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new to(t00Var)).start();
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
                i10 = 0;
                while (i10 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList82 = tL_messages_messageReactionsList.chats;
                size2 = arrayList82.size();
                i11 = 0;
                while (i11 < size2) {
                }
                org.telegram.ui.Components.t00 t00Var2 = fj0Var.a;
                org.telegram.ui.Components.l9 l9Var2 = fj0Var.c;
                fj0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                l9Var2.setTranslationX(f7);
                l9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                l9Var2.animate().alpha(1.0f).setDuration(220L).start();
                t00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new to(t00Var2)).start();
                return;
            case 10:
                org.telegram.ui.Components.dq0 dq0Var = (org.telegram.ui.Components.dq0) this.c;
                int i38 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                org.telegram.ui.Components.bq0 bq0Var = dq0Var.e;
                org.telegram.ui.Components.hq0 hq0Var = dq0Var.K;
                if (i38 != dq0Var.r) {
                    return;
                }
                dq0Var.h();
                dq0Var.I = false;
                dq0Var.v = i38;
                if (dq0Var.s != i38) {
                    bq0Var.b();
                }
                org.telegram.ui.Components.jp0 jp0Var = hq0Var.F;
                org.telegram.ui.Components.dq0 dq0Var2 = hq0Var.M;
                if (jp0Var.getAdapter() != dq0Var2) {
                    org.telegram.ui.Components.hq0.F0(hq0Var);
                    dq0Var2.l();
                }
                for (int i39 = 0; i39 < arrayList9.size(); i39++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.vp0) arrayList9.get(i39)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i15 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                        MessagesController.getInstance(i15).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i14 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                        MessagesController.getInstance(i14).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !dq0Var.d.isEmpty() && arrayList9.isEmpty();
                if (dq0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (z11) {
                    org.telegram.ui.Components.hq0.F0(hq0Var);
                }
                dq0Var.d = arrayList9;
                bq0Var.f(arrayList9, null);
                int i40 = dq0Var.J;
                if (dq0Var.h() != 0 || bq0Var.e() || dq0Var.I) {
                    hq0Var.x0.b(i40);
                } else {
                    hq0Var.Q.e(false, true);
                }
                dq0Var.l();
                hq0Var.K0(true);
                return;
            case 11:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.xu0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 12:
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) this.c;
                int i41 = this.b;
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.d;
                xu0Var.d1(i41);
                n70Var.u();
                return;
            case 13:
                org.telegram.ui.Components.xu0 xu0Var2 = (org.telegram.ui.Components.xu0) this.c;
                xu0Var2.S(this.b, (org.telegram.ui.Components.ll0) this.d, false);
                xu0Var2.J1 = null;
                return;
            case 14:
                org.telegram.ui.Components.bt0 bt0Var = (org.telegram.ui.Components.bt0) this.c;
                int i42 = this.b;
                org.telegram.ui.Components.n70 n70Var2 = (org.telegram.ui.Components.n70) this.d;
                bt0Var.d.c1(i42, false);
                n70Var2.u();
                return;
            case 15:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.c;
                a0.i iVar3 = (a0.i) this.d;
                int i43 = this.b;
                if (n2Var3 instanceof co) {
                    co coVar2 = (co) n2Var3;
                    coVar2.Q7();
                    undoView3 = coVar2.y3;
                } else if (n2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) n2Var3).M;
                }
                UndoView undoView4 = undoView3;
                if (undoView4 != null) {
                    if (iVar3.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) iVar3.n(0)).id, Integer.valueOf(i43), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i43), Integer.valueOf(iVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 16:
                org.telegram.ui.Components.iu0 iu0Var = (org.telegram.ui.Components.iu0) this.c;
                int i44 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i44 != iu0Var.E) {
                    return;
                }
                iu0Var.y = ConnectionsManager.getInstance(iu0Var.d).sendRequest(tL_messages_search, new bi.p7(iu0Var, i44, i16));
                return;
            case 17:
                org.telegram.ui.Components.iu0 iu0Var2 = (org.telegram.ui.Components.iu0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i45 = this.b;
                ArrayList arrayList10 = iu0Var2.h;
                int i46 = iu0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i45 == iu0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i46).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i46).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i46).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i47 = 0; i47 < messages_messages.messages.size(); i47++) {
                        MessageObject messageObject4 = new MessageObject(i46, messages_messages.messages.get(i47), false, true);
                        if (messageObject4.hasValidGroupId()) {
                            messageObject4.isPrimaryGroupMessage = true;
                        }
                        messageObject4.setQuery(iu0Var2.w);
                        arrayList10.add(messageObject4);
                    }
                    iu0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        iu0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        iu0Var2.s = true;
                    }
                    iu0Var2.G(false);
                    iu0Var2.r = false;
                    iu0Var2.y = -1;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.wv0 wv0Var = (org.telegram.ui.Components.wv0) this.c;
                int i48 = this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                wv0Var.Y0 = false;
                if (!wv0Var.V0 && wv0Var.W0) {
                    wv0Var.A(true);
                    return;
                }
                wv0Var.n0 = wv0Var.f1[0];
                wv0Var.j();
                DownloadController.getInstance(i48).removeLoadingFileObserver(t1Var);
                wv0Var.G();
                wv0Var.v();
                return;
            case 19:
                int i49 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i49).getDatabase();
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
            case 20:
                int i50 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i50).getDatabase();
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
            case 21:
                org.telegram.ui.Components.hx0 hx0Var = (org.telegram.ui.Components.hx0) this.c;
                a0.i iVar4 = (a0.i) this.d;
                int i51 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var4 = hx0Var.b1.L;
                if (n2Var4 instanceof co) {
                    co coVar3 = (co) n2Var4;
                    coVar3.Q7();
                    undoView2 = coVar3.y3;
                } else if (n2Var4 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) n2Var4).M;
                }
                UndoView undoView5 = undoView2;
                if (undoView5 != null) {
                    if (iVar4.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) iVar4.n(0)).id, Integer.valueOf(i51), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i51), Integer.valueOf(iVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 22:
                org.telegram.ui.Components.my0 my0Var = (org.telegram.ui.Components.my0) this.c;
                String str3 = (String) this.d;
                int i52 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(my0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new bi.k8(my0Var, i52, str3, arrayList11));
                return;
            case 23:
                org.telegram.ui.Components.k11 k11Var = (org.telegram.ui.Components.k11) this.c;
                String str4 = (String) this.d;
                int i53 = this.b;
                org.telegram.ui.Components.j11 j11Var = k11Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        k11Var.d = -1;
                        AndroidUtilities.runOnUIThread(new bi.k8(k11Var, k11Var.d, new ArrayList(), new ArrayList(), 29));
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                        break;
                    }
                    int i54 = 0;
                    int i55 = i54 + 1;
                    String[] strArr = new String[i55];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int size5 = j11Var.d.size();
                    for (int i56 = 0; i56 < size5; i56++) {
                        ArrayList arrayList14 = (ArrayList) j11Var.d.get(i56);
                        String i57 = org.telegram.ui.ActionBar.g5.i(((org.telegram.ui.ActionBar.l6) arrayList14.get(0)).f);
                        String lowerCase2 = i57.toLowerCase();
                        int i58 = 0;
                        while (true) {
                            if (i58 < i55) {
                                String str5 = strArr[i58];
                                if (lowerCase2.contains(str5)) {
                                    arrayList12.add(arrayList14);
                                    arrayList13.add(org.telegram.ui.Components.k11.E(i57, str5));
                                } else {
                                    i58++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new bi.k8(k11Var, i53, arrayList12, arrayList13, 29));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
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
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i59 = this.b;
                Pattern pattern2 = LaunchActivity.B1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
                if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
                    if (tL_help_appUpdate.can_not_skip) {
                        launchActivity.I0(i59, tL_help_appUpdate, false);
                    } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                        ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i59);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ dm(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ dm(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
