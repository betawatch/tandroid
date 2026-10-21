package org.telegram.ui;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i4(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) this.c;
        String str = (String) this.d;
        int i10 = this.b;
        org.telegram.ui.Components.i21 i21Var = j21Var.r.n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                j21Var.d = -1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cz0(j21Var, j21Var.d, new ArrayList(), new ArrayList(), 1));
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i11 = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i11];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = i21Var.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList arrayList3 = (ArrayList) i21Var.d.get(i12);
                String i13 = org.telegram.ui.ActionBar.g5.i(((org.telegram.ui.ActionBar.j6) arrayList3.get(0)).f);
                String lowerCase2 = i13.toLowerCase();
                int i14 = 0;
                while (true) {
                    if (i14 < i11) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.j21.E(i13, str2));
                            break;
                        }
                        i14++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cz0(j21Var, i10, arrayList, arrayList2, 1));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        UndoView undoView2;
        ?? r10;
        org.telegram.ui.Components.a60 a60Var;
        long j10;
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
        int i16;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i17 = 5;
        int i18 = 6;
        UndoView undoView3 = null;
        UndoView undoView4 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        int i19 = 0;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.c;
                int i20 = this.b;
                int[] iArr = (int[]) this.d;
                j4Var.J = i20;
                j4Var.I = iArr;
                j4Var.L.f0();
                return;
            case 1:
                String str = (String) this.c;
                int i21 = this.b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.d2.g(LaunchActivity.H1, i21, tL_inputGroupCallSlug, false, null, null);
                f3VarArr[0].dismiss();
                return;
            case 2:
                ((qn) this.c).Oa((ArrayList) this.d, this.b, false, false);
                return;
            case 3:
                qn qnVar = (qn) this.c;
                int i22 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i23 = 0;
                qnVar.x0.v0(0, i22, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ah(i23, editTextBoldCursor), 100L);
                return;
            case 4:
                ul ulVar = (ul) this.c;
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.d;
                int i24 = this.b;
                ulVar.getClass();
                MessageObject messageObject = w0Var.getMessageObject();
                dm dmVar = ulVar.a;
                dmVar.Q.j(i24, messageObject.getId(), true, messageObject.getDialogId() == dmVar.Q.L6 ? 1 : 0, true, 0);
                return;
            case 5:
                org.telegram.ui.Wallet.o5.E0(((org.telegram.ui.Components.al) this.c).getContext(), this.b, (org.telegram.ui.ActionBar.d6) this.d);
                return;
            case 6:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) this.c;
                int i25 = this.b;
                View view = (View) this.d;
                foVar.V = 0;
                foVar.U = i25;
                if (view instanceof org.telegram.ui.Cells.q8) {
                    foVar.X((org.telegram.ui.Cells.q8) view, true);
                    return;
                } else {
                    foVar.r.m(foVar.I0);
                    return;
                }
            case 7:
                org.telegram.ui.Components.nv nvVar = (org.telegram.ui.Components.nv) this.c;
                a0.h hVar = (a0.h) this.d;
                int i26 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = nvVar.c1.c;
                if (n2Var instanceof qn) {
                    qn qnVar2 = (qn) n2Var;
                    qnVar2.T7();
                    undoView2 = qnVar2.y3;
                } else {
                    if (!(n2Var instanceof ProfileActivity)) {
                        undoView = null;
                        if (undoView == null) {
                            if (hVar.m() == 1) {
                                undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i26), 53);
                                return;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(i26), Integer.valueOf(hVar.m()), null, null);
                                return;
                            }
                        }
                        return;
                    }
                    undoView2 = ((ProfileActivity) n2Var).M;
                }
                undoView = undoView2;
                if (undoView == null) {
                }
            case 8:
                org.telegram.ui.Components.ny nyVar = (org.telegram.ui.Components.ny) this.c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                int i27 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new ai.e0(nyVar, i27, i17));
                b2VarArr[0].show();
                return;
            case 9:
                int i28 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i28;
                n2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new hg.u(n2Var2, i28, callback, i17));
                return;
            case 10:
                org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) this.c;
                int i29 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                hg.a2 a2Var = z30Var.d;
                org.telegram.ui.Components.a40 a40Var = z30Var.w;
                if (i29 != z30Var.n) {
                    return;
                }
                z30Var.h = false;
                TLRPC.Chat chat = a40Var.V;
                org.telegram.ui.Components.tx0 tx0Var = a40Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = a2Var.h;
                    ArrayList arrayList3 = a2Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i30 = 0; i30 < size4; i30++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i30);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    a2Var.i();
                }
                int i31 = z30Var.f - 1;
                boolean z10 = tx0Var.getVisibility() == 0;
                z30Var.l();
                if (z30Var.f > i31) {
                    a40Var.K(i31);
                }
                if (z30Var.h || a2Var.e() || !a40Var.d.S0()) {
                    return;
                }
                tx0Var.e(false, z10);
                return;
            case 11:
                org.telegram.ui.Components.n40 n40Var = (org.telegram.ui.Components.n40) this.c;
                int i32 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = n40Var.O;
                int i33 = n40Var.N;
                if (i32 != n40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(n40Var.b0[0] ? "$" : "#");
                sb2.append(n40Var.Y);
                String sb3 = sb2.toString();
                ci.u6 u6Var = n40Var.Q;
                if (u6Var == null || !TextUtils.equals(u6Var.C, sb3)) {
                    n40Var.Q = new ci.u6(i33, null, sb3);
                }
                if (n40Var.Q.i.size() <= 0) {
                    r10 = 1;
                    n40Var.Q.p(4, true);
                } else {
                    r10 = 1;
                }
                n40Var.P = r10;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r10;
                n40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject2 = (MessageObject) i2.e.h(r10, arrayList4);
                    tL_channels_searchPosts.offset_rate = n40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i33).getInputPeer(messageObject2.messageOwner.peer_id);
                }
                n40Var.U = ConnectionsManager.getInstance(i33).sendRequest(tL_channels_searchPosts, new hg.u(n40Var, i32, sb3, i18));
                return;
            case 12:
                org.telegram.ui.Components.m60 m60Var = (org.telegram.ui.Components.m60) this.c;
                int i34 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (m60Var.m0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i34);
                }
                if (m60Var.B0 && i34 == m60Var.A0) {
                    m60Var.p("camera open submitted: surface=" + i34);
                }
                if (!m60Var.s0) {
                    if (i34 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(m60Var.n0[0].getWidth(), m60Var.n0[0].getHeight());
                    m60Var.t0 = new CameraSession(m60Var.I, m60Var.n0[0], m60Var.o0, 256, true);
                    m60Var.v();
                    org.telegram.ui.Components.x50 x50Var = m60Var.m0;
                    CameraSession cameraSession = m60Var.t0;
                    Handler handler = x50Var.getHandler();
                    if (handler != null) {
                        x50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(m60Var.t0, surfaceTexture, new org.telegram.ui.Components.n50(m60Var, 1), new org.telegram.ui.Components.n50(m60Var, 2));
                    return;
                }
                if (m60Var.u0) {
                    Camera2Session camera2Session = m60Var.v0[i34];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i34 == 1) {
                    return;
                }
                org.telegram.ui.Components.x50 x50Var2 = m60Var.m0;
                Camera2Session camera2Session2 = m60Var.w0;
                Handler handler2 = x50Var2.getHandler();
                if (handler2 != null) {
                    x50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                m60Var.w0.open(surfaceTexture);
                return;
            case 13:
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.c;
                int i35 = this.b;
                org.telegram.ui.Components.a60 a60Var2 = (org.telegram.ui.Components.a60) this.d;
                org.telegram.ui.Components.m60 m60Var2 = f60Var.H0;
                VideoEditedInfo videoEditedInfo = m60Var2.S;
                int i36 = m60Var2.f;
                org.telegram.ui.Components.y50 y50Var = m60Var2.n;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    m60Var2.S = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (m60Var2.S.needConvert()) {
                    m60Var2.M = null;
                    m60Var2.N = null;
                    m60Var2.O = null;
                    m60Var2.P = null;
                    VideoEditedInfo videoEditedInfo3 = m60Var2.S;
                    long j11 = videoEditedInfo3.estimatedDuration;
                    j10 = 0;
                    double d = j11;
                    a60Var = a60Var2;
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
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j14 / d) * m60Var2.Q));
                    VideoEditedInfo videoEditedInfo4 = m60Var2.S;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j15 = videoEditedInfo4.startTime;
                    if (j15 > 0) {
                        videoEditedInfo4.startTime = j15 * 1000;
                    }
                    long j16 = videoEditedInfo4.endTime;
                    if (j16 > 0) {
                        videoEditedInfo4.endTime = j16 * 1000;
                    }
                    FileLoader.getInstance(i36).cancelFileUpload(m60Var2.f0.getAbsolutePath(), false);
                } else {
                    a60Var = a60Var2;
                    j10 = 0;
                    m60Var2.S.estimatedSize = Math.max(1L, m60Var2.Q);
                }
                VideoEditedInfo videoEditedInfo5 = m60Var2.S;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = m60Var2.M;
                videoEditedInfo5.encryptedFile = m60Var2.N;
                videoEditedInfo5.key = m60Var2.O;
                videoEditedInfo5.iv = m60Var2.P;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = f60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = m60Var2.S;
                if (i35 != 1) {
                    f60Var.h(f60Var.a);
                    videoEditedInfo6.estimatedDuration = m60Var2.k0;
                    NotificationCenter.getInstance(i36).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(m60Var2.V), videoEditedInfo6, f60Var.a.getAbsolutePath(), f60Var.A0);
                    return;
                }
                if (y50Var.c()) {
                    Activity parentActivity = y50Var.getParentActivity();
                    long a2 = y50Var.a();
                    org.telegram.ui.Components.ry ryVar = new org.telegram.ui.Components.ry(f60Var, a60Var, videoEditedInfo6, 2);
                    org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(f60Var, 0);
                    org.telegram.ui.ActionBar.d6 d6Var = m60Var2.Z0;
                    Pattern pattern = org.telegram.ui.Components.f5.a;
                    org.telegram.ui.Components.f5.J(parentActivity, a2, -1L, 0, false, ryVar, c60Var, new org.telegram.ui.Components.d5(d6Var), d6Var);
                } else {
                    org.telegram.ui.Components.a60 a60Var3 = a60Var;
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (a60Var3 != null) {
                        photoEntry.ttl = a60Var3.c;
                        photoEntry.effectId = a60Var3.d;
                    }
                    m60Var2.n.s(photoEntry, videoEditedInfo6, a60Var3 == null || a60Var3.a, a60Var3 != null ? a60Var3.b : 0, 0, false, a60Var3 != null ? a60Var3.e : j10);
                }
                m60Var2.S = null;
                return;
            case 14:
                org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) this.c;
                int i37 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i38 = dk0Var.f;
                TextView textView = dk0Var.b;
                MessageObject messageObject3 = dk0Var.s;
                ImageView imageView = dk0Var.d;
                org.telegram.ui.Components.w9 w9Var = dk0Var.e;
                ArrayList arrayList5 = dk0Var.r;
                ArrayList arrayList6 = dk0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i37) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i37, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i37), i37 == arrayList6.size() ? String.valueOf(i37) : i37 + "/" + arrayList6.size());
                }
                if (dk0Var.getMeasuredWidth() > 0) {
                    dk0Var.v = dk0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject3.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i38).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            w9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            w9Var.setVisibility(0);
                            w9Var.setAlpha(0.0f);
                            w9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i39 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject3.messageOwner.from_id;
                                if (peer != null) {
                                    i14 = i39;
                                    if (user2.id != peer.user_id) {
                                        int i40 = 0;
                                        while (true) {
                                            if (i40 < arrayList.size()) {
                                                i13 = size;
                                                int i41 = i40;
                                                if (((org.telegram.ui.Components.ck0) arrayList.get(i40)).b == user2.id) {
                                                    break;
                                                }
                                                i40 = i41 + 1;
                                                size = i13;
                                            } else {
                                                i13 = size;
                                                arrayList.add(new org.telegram.ui.Components.ck0(0, user2));
                                            }
                                        }
                                    } else {
                                        i13 = size;
                                    }
                                } else {
                                    i13 = size;
                                    i14 = i39;
                                }
                                size = i13;
                                i10 = i14;
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
                                    int i42 = i19;
                                    while (true) {
                                        if (i42 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.ck0(0, chat3));
                                        } else if (((org.telegram.ui.Components.ck0) arrayList.get(i42)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i42++;
                                        }
                                    }
                                }
                                i19 = 0;
                            }
                            org.telegram.ui.Components.b10 b10Var = dk0Var.a;
                            org.telegram.ui.Components.k9 k9Var = dk0Var.c;
                            dk0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    k9Var.b(i12, ((org.telegram.ui.Components.ck0) arrayList.get(i12)).a, i38);
                                } else {
                                    k9Var.b(i12, null, i38);
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
                                    k9Var.setTranslationX(f7);
                                    k9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    k9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    b10Var.animate().alpha(0.0f).setDuration(220L).setListener(new fo(b10Var)).start();
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
                            b10Var.animate().alpha(0.0f).setDuration(220L).setListener(new fo(b10Var)).start();
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
                org.telegram.ui.Components.b10 b10Var2 = dk0Var.a;
                org.telegram.ui.Components.k9 k9Var2 = dk0Var.c;
                dk0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                k9Var2.setTranslationX(f7);
                k9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                k9Var2.animate().alpha(1.0f).setDuration(220L).start();
                b10Var2.animate().alpha(0.0f).setDuration(220L).setListener(new fo(b10Var2)).start();
                return;
            case 15:
                org.telegram.ui.Components.br0 br0Var = (org.telegram.ui.Components.br0) this.c;
                int i43 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                org.telegram.ui.Components.zq0 zq0Var = br0Var.e;
                org.telegram.ui.Components.fr0 fr0Var = br0Var.K;
                if (i43 != br0Var.r) {
                    return;
                }
                br0Var.h();
                br0Var.I = false;
                br0Var.v = i43;
                if (br0Var.s != i43) {
                    zq0Var.b();
                }
                org.telegram.ui.Components.hq0 hq0Var = fr0Var.G;
                org.telegram.ui.Components.br0 br0Var2 = fr0Var.N;
                if (hq0Var.getAdapter() != br0Var2) {
                    org.telegram.ui.Components.fr0.J0(fr0Var);
                    br0Var2.l();
                }
                for (int i44 = 0; i44 < arrayList9.size(); i44++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.tq0) arrayList9.get(i44)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i16 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
                        MessagesController.getInstance(i16).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i15 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
                        MessagesController.getInstance(i15).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !br0Var.d.isEmpty() && arrayList9.isEmpty();
                if (br0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.fr0.J0(fr0Var);
                }
                br0Var.d = arrayList9;
                zq0Var.f(arrayList9, null);
                int i45 = br0Var.J;
                if (br0Var.h() != 0 || zq0Var.e() || br0Var.I) {
                    fr0Var.y0.b(i45);
                } else {
                    fr0Var.R.e(false, true);
                }
                br0Var.l();
                fr0Var.M0(true);
                return;
            case 16:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.uv0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 17:
                org.telegram.ui.Components.uv0 uv0Var = (org.telegram.ui.Components.uv0) this.c;
                int i46 = this.b;
                org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) this.d;
                uv0Var.f1(i46);
                i80Var.u();
                return;
            case 18:
                org.telegram.ui.Components.uv0 uv0Var2 = (org.telegram.ui.Components.uv0) this.c;
                uv0Var2.S(this.b, (org.telegram.ui.Components.jm0) this.d, false);
                uv0Var2.J1 = null;
                return;
            case 19:
                org.telegram.ui.Components.yt0 yt0Var = (org.telegram.ui.Components.yt0) this.c;
                int i47 = this.b;
                org.telegram.ui.Components.i80 i80Var2 = (org.telegram.ui.Components.i80) this.d;
                yt0Var.d.e1(i47, false);
                i80Var2.u();
                return;
            case 20:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i48 = this.b;
                if (n2Var3 instanceof qn) {
                    qn qnVar3 = (qn) n2Var3;
                    qnVar3.T7();
                    undoView3 = qnVar3.y3;
                } else if (n2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) n2Var3).M;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar3.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i48), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i48), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                org.telegram.ui.Components.fv0 fv0Var = (org.telegram.ui.Components.fv0) this.c;
                int i49 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i49 != fv0Var.E) {
                    return;
                }
                fv0Var.y = ConnectionsManager.getInstance(fv0Var.d).sendRequest(tL_messages_search, new ai.n2(fv0Var, i49, i18));
                return;
            case 22:
                org.telegram.ui.Components.fv0 fv0Var2 = (org.telegram.ui.Components.fv0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i50 = this.b;
                ArrayList arrayList10 = fv0Var2.h;
                int i51 = fv0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i50 == fv0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i51).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i51).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i51).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i52 = 0; i52 < messages_messages.messages.size(); i52++) {
                        MessageObject messageObject4 = new MessageObject(i51, messages_messages.messages.get(i52), false, true);
                        if (messageObject4.hasValidGroupId()) {
                            messageObject4.isPrimaryGroupMessage = true;
                        }
                        messageObject4.setQuery(fv0Var2.w);
                        arrayList10.add(messageObject4);
                    }
                    fv0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        fv0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        fv0Var2.s = true;
                    }
                    fv0Var2.G(false);
                    fv0Var2.r = false;
                    fv0Var2.y = -1;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) this.c;
                int i53 = this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                tw0Var.Y0 = false;
                if (!tw0Var.V0 && tw0Var.W0) {
                    tw0Var.C(true);
                    return;
                }
                tw0Var.m0 = tw0Var.f1[0];
                tw0Var.l();
                DownloadController.getInstance(i53).removeLoadingFileObserver(u1Var);
                tw0Var.I();
                tw0Var.x();
                return;
            case 24:
                int i54 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i54).getDatabase();
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
            case 25:
                int i55 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i55).getDatabase();
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
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 26:
                org.telegram.ui.Components.dy0 dy0Var = (org.telegram.ui.Components.dy0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i56 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var4 = dy0Var.c1.L;
                if (n2Var4 instanceof qn) {
                    qn qnVar4 = (qn) n2Var4;
                    qnVar4.T7();
                    undoView4 = qnVar4.y3;
                } else if (n2Var4 instanceof ProfileActivity) {
                    undoView4 = ((ProfileActivity) n2Var4).M;
                }
                UndoView undoView6 = undoView4;
                if (undoView6 != null) {
                    if (hVar4.m() == 1) {
                        undoView6.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i56), 53);
                        return;
                    } else {
                        undoView6.k(0L, 53, Integer.valueOf(i56), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 27:
                org.telegram.ui.Components.iz0 iz0Var = (org.telegram.ui.Components.iz0) this.c;
                String str3 = (String) this.d;
                int i57 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(iz0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new org.telegram.ui.Components.cz0(i57, 0, iz0Var, str3, arrayList11));
                return;
            case 28:
                a();
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cz0((org.telegram.ui.Components.r21) this.c, (org.telegram.ui.Components.vp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 2));
                return;
        }
    }

    public /* synthetic */ i4(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ i4(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ i4(j4 j4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 0;
        this.c = j4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
