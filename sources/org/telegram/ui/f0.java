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
import org.telegram.messenger.beta.R;
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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(int i7, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.c01 c01Var = (org.telegram.ui.Components.c01) this.c;
        String str = (String) this.d;
        int i7 = this.b;
        org.telegram.ui.Components.b01 b01Var = c01Var.r.s1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                c01Var.d = -1;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.lp0(c01Var, c01Var.d, new ArrayList(), new ArrayList(), 6));
                return;
            }
            int i10 = 0;
            String T0 = org.telegram.messenger.hd.E0().T0(lowerCase, true, false);
            if (lowerCase.equals(T0) || T0.length() == 0) {
                T0 = null;
            }
            int i11 = (T0 != null ? 1 : 0) + 1;
            String[] strArr = new String[i11];
            strArr[0] = lowerCase;
            if (T0 != null) {
                strArr[1] = T0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = b01Var.d.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) b01Var.d.get(i12);
                String c10 = org.telegram.ui.ActionBar.v4.c(((org.telegram.ui.ActionBar.v6) arrayList3.get(i10)).e);
                String lowerCase2 = c10.toLowerCase();
                int i13 = i10;
                while (true) {
                    if (i13 < i11) {
                        String str2 = strArr[i13];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.c01.E(c10, str2));
                            break;
                        }
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.lp0(c01Var, i7, arrayList, arrayList2, 6));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        ?? r92;
        long j3;
        org.telegram.ui.Components.r40 r40Var;
        String G;
        ArrayList arrayList;
        int size;
        int i7;
        int size2;
        int i10;
        int i11;
        int size3;
        int L;
        float f10;
        int i12;
        int i13;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i14 = 5;
        UndoView undoView2 = null;
        UndoView undoView3 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                int i15 = this.b;
                vf.b bVar = (vf.b) this.d;
                if (g4Var.J0 == i15 && g4Var.H0 != 0) {
                    ConnectionsManager.getInstance(g4Var.Y).cancelRequest(g4Var.H0, false);
                    g4Var.H0 = 0;
                }
                if (g4Var.O0 == bVar) {
                    g4Var.O0 = null;
                    return;
                }
                return;
            case 1:
                int i16 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.messenger.np.u1(i16).f4(tL_chatInviteJoinResultWebView.users, false);
                org.telegram.messenger.l2.b(i16).c(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 2:
                e4 e4Var = (e4) this.c;
                int i17 = this.b;
                int[] iArr = (int[]) this.d;
                e4Var.L = i17;
                e4Var.K = iArr;
                e4Var.N.d0();
                return;
            case 3:
                String str = (String) this.c;
                int i18 = this.b;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, i18, tL_inputGroupCallSlug, false, null, null);
                w2VarArr[0].dismiss();
                return;
            case 4:
                ((bn) this.c).nb(this.b, (ArrayList) this.d, false, false);
                return;
            case 5:
                bn bnVar = (bn) this.c;
                int i19 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i20 = 0;
                bnVar.A0.w0(0, i19, null);
                if (!org.telegram.messenger.g0.I3(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                org.telegram.messenger.g0.h3(new qg(editTextBoldCursor, i20), 100L);
                return;
            case 6:
                fl flVar = (fl) this.c;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.d;
                int i21 = this.b;
                flVar.getClass();
                org.telegram.messenger.gj messageObject = v0Var.getMessageObject();
                kl klVar = flVar.a;
                klVar.R.l(i21, messageObject.e1(), true, org.telegram.messenger.gj.B0(messageObject.k) == klVar.R.d7 ? 1 : 0, true, 0);
                return;
            case 7:
                org.telegram.ui.Wallet.n6.N0(this.b, ((org.telegram.ui.Components.zk) this.c).getContext(), (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 8:
                org.telegram.ui.Components.tn tnVar = (org.telegram.ui.Components.tn) this.c;
                int i22 = this.b;
                View view = (View) this.d;
                tnVar.W = 0;
                tnVar.V = i22;
                if (view instanceof org.telegram.ui.Cells.n8) {
                    tnVar.Z((org.telegram.ui.Cells.n8) view, true);
                    return;
                } else {
                    tnVar.r.g(tnVar.J0);
                    return;
                }
            case 9:
                org.telegram.ui.Components.tu tuVar = (org.telegram.ui.Components.tu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i23 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var = tuVar.V2.n1;
                if (g2Var instanceof bn) {
                    bn bnVar2 = (bn) g2Var;
                    bnVar2.h8();
                    undoView = bnVar2.N3;
                } else {
                    undoView = g2Var instanceof ProfileActivity ? ((ProfileActivity) g2Var).M : null;
                }
                if (undoView != null) {
                    if (hVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i23), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i23), Integer.valueOf(hVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 10:
                org.telegram.ui.Components.px pxVar = (org.telegram.ui.Components.px) this.c;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
                int i24 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var == null) {
                    return;
                }
                t1Var.setOnCancelListener(new di.z(pxVar, i24, i14));
                t1VarArr[0].show();
                return;
            case 11:
                int i25 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.c;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i25;
                g2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new jg.u(g2Var2, i25, y10Var, i14));
                return;
            case 12:
                org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) this.c;
                int i26 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                jg.z1 z1Var = u20Var.d;
                org.telegram.ui.Components.v20 v20Var = u20Var.x;
                if (i26 != u20Var.n) {
                    return;
                }
                u20Var.h = false;
                TLRPC.Chat chat2 = v20Var.Q1;
                org.telegram.ui.Components.nv0 nv0Var = v20Var.u1;
                if (!org.telegram.messenger.v3.T(chat2)) {
                    a0.h hVar2 = z1Var.h;
                    ArrayList arrayList3 = z1Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i27 = 0; i27 < size4; i27++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i27);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    z1Var.i();
                }
                int i28 = u20Var.f - 1;
                boolean z10 = nv0Var.getVisibility() == 0;
                u20Var.f();
                if (u20Var.f > i28) {
                    v20Var.P0(i28);
                }
                if (u20Var.h || z1Var.e() || !v20Var.o1.R0()) {
                    return;
                }
                nv0Var.e(false, z10);
                return;
            case 13:
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.c;
                int i29 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = i30Var.R;
                int i30 = i30Var.Q;
                if (i29 != i30Var.W) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i30Var.e0[0] ? "$" : "#");
                sb2.append(i30Var.b0);
                String sb3 = sb2.toString();
                fi.b6 b6Var = i30Var.T;
                if (b6Var == null || !TextUtils.equals(b6Var.C, sb3)) {
                    i30Var.T = new fi.b6(i30, null, sb3);
                }
                if (i30Var.T.i.size() <= 0) {
                    r92 = 1;
                    i30Var.T.p(4, true);
                } else {
                    r92 = 1;
                }
                i30Var.S = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                i30Var.b0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = i30Var.c0;
                    tL_channels_searchPosts.offset_peer = org.telegram.messenger.np.u1(i30).o1(gjVar.k.peer_id);
                }
                i30Var.X = ConnectionsManager.getInstance(i30).sendRequest(tL_channels_searchPosts, new jg.u(i30Var, i29, sb3, 6));
                return;
            case 14:
                org.telegram.ui.Components.c50 c50Var = (org.telegram.ui.Components.c50) this.c;
                int i31 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (c50Var.m0 == null) {
                    return;
                }
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("InstantCamera create camera session " + i31);
                }
                if (c50Var.B0 && i31 == c50Var.A0) {
                    c50Var.q("camera open submitted: surface=" + i31);
                }
                if (!c50Var.s0) {
                    if (i31 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(c50Var.n0[0].getWidth(), c50Var.n0[0].getHeight());
                    c50Var.t0 = new CameraSession(c50Var.I, c50Var.n0[0], c50Var.o0, 256, true);
                    c50Var.w();
                    org.telegram.ui.Components.o40 o40Var = c50Var.m0;
                    CameraSession cameraSession = c50Var.t0;
                    Handler handler = o40Var.getHandler();
                    if (handler != null) {
                        o40Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(c50Var.t0, surfaceTexture, new org.telegram.ui.Components.f40(c50Var, 1), new org.telegram.ui.Components.f40(c50Var, 2));
                    return;
                }
                if (c50Var.u0) {
                    Camera2Session camera2Session = c50Var.v0[i31];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i31 == 1) {
                    return;
                }
                org.telegram.ui.Components.o40 o40Var2 = c50Var.m0;
                Camera2Session camera2Session2 = c50Var.w0;
                Handler handler2 = o40Var2.getHandler();
                if (handler2 != null) {
                    o40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                c50Var.w0.open(surfaceTexture);
                return;
            case 15:
                org.telegram.ui.Components.u40 u40Var = (org.telegram.ui.Components.u40) this.c;
                int i32 = this.b;
                org.telegram.ui.Components.r40 r40Var2 = (org.telegram.ui.Components.r40) this.d;
                org.telegram.ui.Components.c50 c50Var2 = u40Var.I0;
                org.telegram.messenger.f20 f20Var = c50Var2.S;
                int i33 = c50Var2.e;
                org.telegram.ui.Components.p40 p40Var = c50Var2.h;
                if (f20Var == null) {
                    org.telegram.messenger.f20 f20Var2 = new org.telegram.messenger.f20();
                    c50Var2.S = f20Var2;
                    f20Var2.a = -1L;
                    f20Var2.b = -1L;
                }
                if (c50Var2.S.c()) {
                    c50Var2.M = null;
                    c50Var2.N = null;
                    c50Var2.O = null;
                    c50Var2.P = null;
                    org.telegram.messenger.f20 f20Var3 = c50Var2.S;
                    long j10 = f20Var3.r;
                    j3 = 0;
                    double d = j10;
                    r40Var = r40Var2;
                    long j11 = f20Var3.a;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = f20Var3.b;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    f20Var3.r = j13;
                    f20Var3.q = Math.max(1L, (long) ((j13 / d) * c50Var2.Q));
                    org.telegram.messenger.f20 f20Var4 = c50Var2.S;
                    f20Var4.m = 1000000;
                    long j14 = f20Var4.a;
                    if (j14 > 0) {
                        f20Var4.a = j14 * 1000;
                    }
                    long j15 = f20Var4.b;
                    if (j15 > 0) {
                        f20Var4.b = j15 * 1000;
                    }
                    org.telegram.messenger.w7.G(i33).b(c50Var2.f0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    r40Var = r40Var2;
                    c50Var2.S.q = Math.max(1L, c50Var2.Q);
                }
                org.telegram.messenger.f20 f20Var5 = c50Var2.S;
                f20Var5.s = true;
                f20Var5.w = c50Var2.M;
                f20Var5.x = c50Var2.N;
                f20Var5.y = c50Var2.O;
                f20Var5.z = c50Var2.P;
                f20Var5.n = 25;
                f20Var5.h = 360;
                f20Var5.k = 360;
                f20Var5.i = 360;
                f20Var5.l = 360;
                f20Var5.o = u40Var.a.getAbsolutePath();
                org.telegram.messenger.f20 f20Var6 = c50Var2.S;
                if (i32 != 1) {
                    u40Var.h(u40Var.a);
                    f20Var6.r = c50Var2.k0;
                    org.telegram.messenger.ls.f(i33).k(org.telegram.messenger.ls.s2, Integer.valueOf(c50Var2.V), f20Var6, u40Var.a.getAbsolutePath(), u40Var.B0);
                    return;
                }
                if (p40Var.c()) {
                    Activity parentActivity = p40Var.getParentActivity();
                    long a10 = p40Var.a();
                    org.telegram.ui.Components.tm tmVar = new org.telegram.ui.Components.tm(u40Var, r40Var, f20Var6, 4);
                    org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(u40Var, 0);
                    org.telegram.ui.ActionBar.h6 h6Var = c50Var2.Z0;
                    Pattern pattern = org.telegram.ui.Components.c5.a;
                    org.telegram.ui.Components.c5.H(parentActivity, a10, -1L, 0, false, tmVar, s40Var, new org.telegram.ui.Components.z4(h6Var), h6Var);
                } else {
                    org.telegram.ui.Components.r40 r40Var3 = r40Var;
                    org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, u40Var.a.getAbsolutePath(), 0, true, 0, 0);
                    if (r40Var3 != null) {
                        ffVar.x = r40Var3.c;
                        ffVar.y = r40Var3.d;
                    }
                    c50Var2.h.u(ffVar, f20Var6, r40Var3 == null || r40Var3.a, r40Var3 != null ? r40Var3.b : 0, 0, false, r40Var3 != null ? r40Var3.e : j3);
                }
                c50Var2.S = null;
                return;
            case 16:
                org.telegram.ui.Components.wh0 wh0Var = (org.telegram.ui.Components.wh0) this.c;
                int i34 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i35 = wh0Var.f;
                TextView textView = wh0Var.b;
                org.telegram.messenger.gj gjVar2 = wh0Var.s;
                ImageView imageView = wh0Var.d;
                org.telegram.ui.Components.q9 q9Var = wh0Var.e;
                ArrayList arrayList5 = wh0Var.r;
                ArrayList arrayList6 = wh0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i34) {
                    G = org.telegram.messenger.hd.G(i34, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.hd.K0(i34, "Reacted"), i34 == arrayList6.size() ? String.valueOf(i34) : i34 + "/" + arrayList6.size());
                }
                if (wh0Var.getMeasuredWidth() > 0) {
                    wh0Var.w = wh0Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = gjVar2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList7 = org.telegram.messenger.si.d0(i35).h;
                    int size5 = arrayList7.size();
                    int i36 = 0;
                    while (i36 < size5) {
                        Object obj = arrayList7.get(i36);
                        i36++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(tL_availableReaction.center_icon);
                            arrayList = arrayList5;
                            q9Var.k(b10, "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            q9Var.setVisibility(0);
                            q9Var.setAlpha(0.0f);
                            q9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList8 = tL_messages_messageReactionsList.users;
                            size = arrayList8.size();
                            i7 = 0;
                            while (i7 < size) {
                                TLRPC.User user = arrayList8.get(i7);
                                int i37 = i7 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = gjVar2.k.from_id;
                                if (peer == null || user2.id == peer.user_id) {
                                    i12 = size;
                                    i13 = i37;
                                } else {
                                    int i38 = 0;
                                    while (true) {
                                        if (i38 < arrayList.size()) {
                                            i12 = size;
                                            i13 = i37;
                                            if (((org.telegram.ui.Components.vh0) arrayList.get(i38)).b == user2.id) {
                                                break;
                                            }
                                            i38++;
                                            size = i12;
                                            i37 = i13;
                                        } else {
                                            i12 = size;
                                            i13 = i37;
                                            arrayList.add(new org.telegram.ui.Components.vh0(0, user2));
                                        }
                                    }
                                }
                                size = i12;
                                i7 = i13;
                            }
                            ArrayList<TLRPC.Chat> arrayList9 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList9.size();
                            i10 = 0;
                            while (i10 < size2) {
                                TLRPC.Chat chat3 = arrayList9.get(i10);
                                i10++;
                                TLRPC.Chat chat4 = chat3;
                                TLRPC.Peer peer2 = gjVar2.k.from_id;
                                if (peer2 != null && chat4.id != peer2.user_id) {
                                    int i39 = 0;
                                    while (true) {
                                        if (i39 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.vh0(0, chat4));
                                        } else if (((org.telegram.ui.Components.vh0) arrayList.get(i39)).b == (-chat4.id)) {
                                            break;
                                        } else {
                                            i39++;
                                        }
                                    }
                                }
                            }
                            org.telegram.ui.Components.yz yzVar = wh0Var.a;
                            org.telegram.ui.Components.e9 e9Var = wh0Var.c;
                            wh0Var.setEnabled(arrayList.size() <= 0);
                            for (i11 = 0; i11 < 3; i11++) {
                                if (i11 < arrayList.size()) {
                                    e9Var.b(i11, i35, ((org.telegram.ui.Components.vh0) arrayList.get(i11)).a);
                                } else {
                                    e9Var.b(i11, i35, null);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                L = org.telegram.messenger.g0.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (org.telegram.messenger.hd.a0) {
                                        f10 = org.telegram.messenger.g0.L(12.0f);
                                    }
                                    e9Var.setTranslationX(f10);
                                    e9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    e9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    yzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(yzVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            f10 = L;
                            if (org.telegram.messenger.hd.a0) {
                            }
                            e9Var.setTranslationX(f10);
                            e9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            e9Var.animate().alpha(1.0f).setDuration(220L).start();
                            yzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(yzVar)).start();
                            return;
                        }
                    }
                }
                arrayList = arrayList5;
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList82 = tL_messages_messageReactionsList.users;
                size = arrayList82.size();
                i7 = 0;
                while (i7 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList92 = tL_messages_messageReactionsList.chats;
                size2 = arrayList92.size();
                i10 = 0;
                while (i10 < size2) {
                }
                org.telegram.ui.Components.yz yzVar2 = wh0Var.a;
                org.telegram.ui.Components.e9 e9Var2 = wh0Var.c;
                wh0Var.setEnabled(arrayList.size() <= 0);
                while (i11 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = L;
                if (org.telegram.messenger.hd.a0) {
                }
                e9Var2.setTranslationX(f10);
                e9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                e9Var2.animate().alpha(1.0f).setDuration(220L).start();
                yzVar2.animate().alpha(0.0f).setDuration(220L).setListener(new on(yzVar2)).start();
                return;
            case 17:
                org.telegram.ui.Components.xo0 xo0Var = (org.telegram.ui.Components.xo0) this.c;
                int i40 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                org.telegram.ui.Components.vo0 vo0Var = xo0Var.e;
                org.telegram.ui.Components.ap0 ap0Var = xo0Var.L;
                if (i40 != xo0Var.r) {
                    return;
                }
                xo0Var.b();
                xo0Var.J = false;
                xo0Var.w = i40;
                if (xo0Var.s != i40) {
                    vo0Var.b();
                }
                org.telegram.ui.Components.co0 co0Var = ap0Var.B1;
                org.telegram.ui.Components.xo0 xo0Var2 = ap0Var.I1;
                if (co0Var.getAdapter() != xo0Var2) {
                    org.telegram.ui.Components.ap0.K0(ap0Var);
                    xo0Var2.f();
                }
                for (int i41 = 0; i41 < arrayList10.size(); i41++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.po0) arrayList10.get(i41)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        org.telegram.messenger.np.u1(ap0Var.a).e4((TLRPC.User) tLObject2, true, false);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        org.telegram.messenger.np.u1(ap0Var.a).X3((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !xo0Var.d.isEmpty() && arrayList10.isEmpty();
                if (xo0Var.d.isEmpty()) {
                    arrayList10.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.ap0.K0(ap0Var);
                }
                xo0Var.d = arrayList10;
                vo0Var.f(arrayList10, null);
                int i42 = xo0Var.K;
                if (xo0Var.b() != 0 || vo0Var.e() || xo0Var.J) {
                    ap0Var.t2.b(i42);
                } else {
                    ap0Var.M1.e(false, true);
                }
                xo0Var.f();
                ap0Var.L0(true);
                return;
            case 18:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.jt0) this.c).m1, (TL_stories.StoryItem) this.d);
                return;
            case 19:
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) this.c;
                jt0Var.c0(this.b, (org.telegram.ui.Components.ek0) this.d, false);
                jt0Var.N1 = null;
                return;
            case 20:
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i43 = this.b;
                if (g2Var3 instanceof bn) {
                    bn bnVar3 = (bn) g2Var3;
                    bnVar3.h8();
                    undoView2 = bnVar3.N3;
                } else if (g2Var3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) g2Var3).M;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    if (hVar3.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i43), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i43), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                org.telegram.ui.Components.vs0 vs0Var = (org.telegram.ui.Components.vs0) this.c;
                int i44 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i44 != vs0Var.F) {
                    return;
                }
                vs0Var.E = ConnectionsManager.getInstance(vs0Var.d).sendRequest(tL_messages_search, new di.w1(vs0Var, i44, 7));
                return;
            case 22:
                org.telegram.ui.Components.vs0 vs0Var2 = (org.telegram.ui.Components.vs0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i45 = this.b;
                ArrayList arrayList11 = vs0Var2.h;
                int i46 = vs0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i45 == vs0Var2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    org.telegram.messenger.np.u1(i46).f4(messages_messages.users, false);
                    org.telegram.messenger.np.u1(i46).Z3(messages_messages.chats, false);
                    org.telegram.messenger.ur.a0(i46).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i47 = 0; i47 < messages_messages.messages.size(); i47++) {
                        org.telegram.messenger.gj gjVar3 = new org.telegram.messenger.gj(i46, messages_messages.messages.get(i47), false, true);
                        if (gjVar3.z2()) {
                            gjVar3.S2 = true;
                        }
                        gjVar3.K5(vs0Var2.x, true);
                        arrayList11.add(gjVar3);
                    }
                    vs0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        vs0Var2.s = arrayList11.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        vs0Var2.s = true;
                    }
                    vs0Var2.G(false);
                    vs0Var2.r = false;
                    vs0Var2.E = -1;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.lu0 lu0Var = (org.telegram.ui.Components.lu0) this.c;
                int i48 = this.b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                lu0Var.Z0 = false;
                if (!lu0Var.W0 && lu0Var.X0) {
                    lu0Var.C(true);
                    return;
                }
                lu0Var.n0 = lu0Var.g1[0];
                lu0Var.l();
                org.telegram.messenger.a6.q(i48).v(r1Var);
                lu0Var.I();
                lu0Var.x();
                return;
            case 24:
                int i49 = this.b;
                Integer num = (Integer) this.c;
                org.telegram.messenger.w2 w2Var = (org.telegram.messenger.w2) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = org.telegram.messenger.ur.a0(i49).b;
                        if (sQLiteDatabase != null) {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    w2Var.a(Long.valueOf(r4.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    w2Var.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e10) {
                                e = e10;
                                org.telegram.messenger.a8.g(e, true);
                                w2Var.a(0L, null);
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
                        sQLiteCursor3 = num;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 25:
                int i50 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num2 = (Integer) this.d;
                try {
                    SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.ur.a0(i50).b;
                    if (sQLiteDatabase2 != null) {
                        if (tL_messages_emojiGroups == null) {
                            sQLiteDatabase2.executeFast("DELETE FROM emoji_groups WHERE type = " + num2).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = sQLiteDatabase2.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num2.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 26:
                org.telegram.ui.Components.wv0 wv0Var = (org.telegram.ui.Components.wv0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i51 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var4 = wv0Var.V2.G1;
                if (g2Var4 instanceof bn) {
                    bn bnVar4 = (bn) g2Var4;
                    bnVar4.h8();
                    undoView3 = bnVar4.N3;
                } else if (g2Var4 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) g2Var4).M;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar4.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i51), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i51), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 27:
                org.telegram.ui.Components.ax0 ax0Var = (org.telegram.ui.Components.ax0) this.c;
                String str3 = (String) this.d;
                int i52 = this.b;
                ArrayList arrayList12 = new ArrayList(1);
                org.telegram.messenger.oi oiVar = new org.telegram.messenger.oi();
                oiVar.a = str3;
                oiVar.b = null;
                arrayList12.add(oiVar);
                org.telegram.messenger.si.d0(ax0Var.a).Q(arrayList12, 15, false, false, new org.telegram.ui.Components.lp0(ax0Var, i52, str3, arrayList12, 5));
                return;
            case 28:
                a();
                return;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.lp0((org.telegram.ui.Components.k01) this.c, (org.telegram.ui.Components.mp) this.d, this.b, org.telegram.messenger.nz.c(org.telegram.messenger.g0.p, R.raw.default_pattern, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(140.0f), -16777216, 1), 7));
                return;
        }
    }

    public /* synthetic */ f0(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ f0(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }

    public /* synthetic */ f0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.a = 2;
        this.c = e4Var;
        this.b = i7;
        this.d = iArr2;
    }
}
