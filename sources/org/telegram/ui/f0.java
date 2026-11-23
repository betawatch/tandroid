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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) this.c;
        String str = (String) this.d;
        int i7 = this.b;
        org.telegram.ui.Components.a01 a01Var = b01Var.r.s1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                b01Var.d = -1;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.kp0(b01Var, b01Var.d, new ArrayList(), new ArrayList(), 6));
                return;
            }
            int i10 = 0;
            String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
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
            int size = a01Var.d.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) a01Var.d.get(i12);
                String c10 = org.telegram.ui.ActionBar.v4.c(((org.telegram.ui.ActionBar.w6) arrayList3.get(i10)).e);
                String lowerCase2 = c10.toLowerCase();
                int i13 = i10;
                while (true) {
                    if (i13 < i11) {
                        String str2 = strArr[i13];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.b01.E(c10, str2));
                            break;
                        }
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.kp0(b01Var, i7, arrayList, arrayList2, 6));
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
        org.telegram.ui.Components.o40 o40Var;
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
                org.telegram.messenger.mp.u1(i16).f4(tL_chatInviteJoinResultWebView.users, false);
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
                org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i18, tL_inputGroupCallSlug, false, null, null);
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
                org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
                kl klVar = flVar.a;
                klVar.R.l(i21, messageObject.e1(), true, org.telegram.messenger.fj.B0(messageObject.k) == klVar.R.d7 ? 1 : 0, true, 0);
                return;
            case 7:
                org.telegram.ui.Wallet.o6.N0(this.b, ((org.telegram.ui.Components.xk) this.c).getContext(), (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 8:
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) this.c;
                int i22 = this.b;
                View view = (View) this.d;
                qnVar.W = 0;
                qnVar.V = i22;
                if (view instanceof org.telegram.ui.Cells.m8) {
                    qnVar.Z((org.telegram.ui.Cells.m8) view, true);
                    return;
                } else {
                    qnVar.r.g(qnVar.J0);
                    return;
                }
            case 9:
                org.telegram.ui.Components.qu quVar = (org.telegram.ui.Components.qu) this.c;
                a0.h hVar = (a0.h) this.d;
                int i23 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var = quVar.V2.n1;
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
                org.telegram.ui.Components.mx mxVar = (org.telegram.ui.Components.mx) this.c;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
                int i24 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var == null) {
                    return;
                }
                t1Var.setOnCancelListener(new di.z(mxVar, i24, i14));
                t1VarArr[0].show();
                return;
            case 11:
                int i25 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.c;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i25;
                g2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new jg.u(g2Var2, i25, w10Var, i14));
                return;
            case 12:
                org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) this.c;
                int i26 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                jg.z1 z1Var = r20Var.d;
                org.telegram.ui.Components.s20 s20Var = r20Var.x;
                if (i26 != r20Var.n) {
                    return;
                }
                r20Var.h = false;
                TLRPC.Chat chat2 = s20Var.Q1;
                org.telegram.ui.Components.mv0 mv0Var = s20Var.u1;
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
                            hVar2.k(tLObject, org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    z1Var.i();
                }
                int i28 = r20Var.f - 1;
                boolean z10 = mv0Var.getVisibility() == 0;
                r20Var.f();
                if (r20Var.f > i28) {
                    s20Var.P0(i28);
                }
                if (r20Var.h || z1Var.e() || !s20Var.o1.R0()) {
                    return;
                }
                mv0Var.e(false, z10);
                return;
            case 13:
                org.telegram.ui.Components.f30 f30Var = (org.telegram.ui.Components.f30) this.c;
                int i29 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = f30Var.R;
                int i30 = f30Var.Q;
                if (i29 != f30Var.W) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f30Var.e0[0] ? "$" : "#");
                sb2.append(f30Var.b0);
                String sb3 = sb2.toString();
                fi.b6 b6Var = f30Var.T;
                if (b6Var == null || !TextUtils.equals(b6Var.C, sb3)) {
                    f30Var.T = new fi.b6(i30, null, sb3);
                }
                if (f30Var.T.i.size() <= 0) {
                    r92 = 1;
                    f30Var.T.p(4, true);
                } else {
                    r92 = 1;
                }
                f30Var.S = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                f30Var.b0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = f30Var.c0;
                    tL_channels_searchPosts.offset_peer = org.telegram.messenger.mp.u1(i30).o1(fjVar.k.peer_id);
                }
                f30Var.X = ConnectionsManager.getInstance(i30).sendRequest(tL_channels_searchPosts, new jg.u(f30Var, i29, sb3, 6));
                return;
            case 14:
                org.telegram.ui.Components.z40 z40Var = (org.telegram.ui.Components.z40) this.c;
                int i31 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (z40Var.m0 == null) {
                    return;
                }
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("InstantCamera create camera session " + i31);
                }
                if (z40Var.B0 && i31 == z40Var.A0) {
                    z40Var.q("camera open submitted: surface=" + i31);
                }
                if (!z40Var.s0) {
                    if (i31 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(z40Var.n0[0].getWidth(), z40Var.n0[0].getHeight());
                    z40Var.t0 = new CameraSession(z40Var.I, z40Var.n0[0], z40Var.o0, 256, true);
                    z40Var.w();
                    org.telegram.ui.Components.l40 l40Var = z40Var.m0;
                    CameraSession cameraSession = z40Var.t0;
                    Handler handler = l40Var.getHandler();
                    if (handler != null) {
                        l40Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(z40Var.t0, surfaceTexture, new org.telegram.ui.Components.c40(z40Var, 1), new org.telegram.ui.Components.c40(z40Var, 2));
                    return;
                }
                if (z40Var.u0) {
                    Camera2Session camera2Session = z40Var.v0[i31];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i31 == 1) {
                    return;
                }
                org.telegram.ui.Components.l40 l40Var2 = z40Var.m0;
                Camera2Session camera2Session2 = z40Var.w0;
                Handler handler2 = l40Var2.getHandler();
                if (handler2 != null) {
                    l40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                z40Var.w0.open(surfaceTexture);
                return;
            case 15:
                org.telegram.ui.Components.r40 r40Var = (org.telegram.ui.Components.r40) this.c;
                int i32 = this.b;
                org.telegram.ui.Components.o40 o40Var2 = (org.telegram.ui.Components.o40) this.d;
                org.telegram.ui.Components.z40 z40Var2 = r40Var.I0;
                org.telegram.messenger.d20 d20Var = z40Var2.S;
                int i33 = z40Var2.e;
                org.telegram.ui.Components.m40 m40Var = z40Var2.h;
                if (d20Var == null) {
                    org.telegram.messenger.d20 d20Var2 = new org.telegram.messenger.d20();
                    z40Var2.S = d20Var2;
                    d20Var2.a = -1L;
                    d20Var2.b = -1L;
                }
                if (z40Var2.S.c()) {
                    z40Var2.M = null;
                    z40Var2.N = null;
                    z40Var2.O = null;
                    z40Var2.P = null;
                    org.telegram.messenger.d20 d20Var3 = z40Var2.S;
                    long j10 = d20Var3.r;
                    j3 = 0;
                    double d = j10;
                    o40Var = o40Var2;
                    long j11 = d20Var3.a;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = d20Var3.b;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    d20Var3.r = j13;
                    d20Var3.q = Math.max(1L, (long) ((j13 / d) * z40Var2.Q));
                    org.telegram.messenger.d20 d20Var4 = z40Var2.S;
                    d20Var4.m = 1000000;
                    long j14 = d20Var4.a;
                    if (j14 > 0) {
                        d20Var4.a = j14 * 1000;
                    }
                    long j15 = d20Var4.b;
                    if (j15 > 0) {
                        d20Var4.b = j15 * 1000;
                    }
                    org.telegram.messenger.w7.G(i33).b(z40Var2.f0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    o40Var = o40Var2;
                    z40Var2.S.q = Math.max(1L, z40Var2.Q);
                }
                org.telegram.messenger.d20 d20Var5 = z40Var2.S;
                d20Var5.s = true;
                d20Var5.w = z40Var2.M;
                d20Var5.x = z40Var2.N;
                d20Var5.y = z40Var2.O;
                d20Var5.z = z40Var2.P;
                d20Var5.n = 25;
                d20Var5.h = 360;
                d20Var5.k = 360;
                d20Var5.i = 360;
                d20Var5.l = 360;
                d20Var5.o = r40Var.a.getAbsolutePath();
                org.telegram.messenger.d20 d20Var6 = z40Var2.S;
                if (i32 != 1) {
                    r40Var.h(r40Var.a);
                    d20Var6.r = z40Var2.k0;
                    org.telegram.messenger.ks.f(i33).k(org.telegram.messenger.ks.s2, Integer.valueOf(z40Var2.V), d20Var6, r40Var.a.getAbsolutePath(), r40Var.B0);
                    return;
                }
                if (m40Var.c()) {
                    Activity parentActivity = m40Var.getParentActivity();
                    long a10 = m40Var.a();
                    org.telegram.ui.Components.rm rmVar = new org.telegram.ui.Components.rm(r40Var, o40Var, d20Var6, 4);
                    org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(r40Var, 0);
                    org.telegram.ui.ActionBar.i6 i6Var = z40Var2.Z0;
                    Pattern pattern = org.telegram.ui.Components.b5.a;
                    org.telegram.ui.Components.b5.H(parentActivity, a10, -1L, 0, false, rmVar, p40Var, new org.telegram.ui.Components.y4(i6Var), i6Var);
                } else {
                    org.telegram.ui.Components.o40 o40Var3 = o40Var;
                    org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, r40Var.a.getAbsolutePath(), 0, true, 0, 0);
                    if (o40Var3 != null) {
                        efVar.x = o40Var3.c;
                        efVar.y = o40Var3.d;
                    }
                    z40Var2.h.u(efVar, d20Var6, o40Var3 == null || o40Var3.a, o40Var3 != null ? o40Var3.b : 0, 0, false, o40Var3 != null ? o40Var3.e : j3);
                }
                z40Var2.S = null;
                return;
            case 16:
                org.telegram.ui.Components.wh0 wh0Var = (org.telegram.ui.Components.wh0) this.c;
                int i34 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i35 = wh0Var.f;
                TextView textView = wh0Var.b;
                org.telegram.messenger.fj fjVar2 = wh0Var.s;
                ImageView imageView = wh0Var.d;
                org.telegram.ui.Components.p9 p9Var = wh0Var.e;
                ArrayList arrayList5 = wh0Var.r;
                ArrayList arrayList6 = wh0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i34) {
                    G = org.telegram.messenger.gd.G(i34, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.gd.K0(i34, "Reacted"), i34 == arrayList6.size() ? String.valueOf(i34) : i34 + "/" + arrayList6.size());
                }
                if (wh0Var.getMeasuredWidth() > 0) {
                    wh0Var.w = wh0Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = fjVar2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList7 = org.telegram.messenger.ri.d0(i35).h;
                    int size5 = arrayList7.size();
                    int i36 = 0;
                    while (i36 < size5) {
                        Object obj = arrayList7.get(i36);
                        i36++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(tL_availableReaction.center_icon);
                            arrayList = arrayList5;
                            p9Var.k(b10, "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            p9Var.setVisibility(0);
                            p9Var.setAlpha(0.0f);
                            p9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList8 = tL_messages_messageReactionsList.users;
                            size = arrayList8.size();
                            i7 = 0;
                            while (i7 < size) {
                                TLRPC.User user = arrayList8.get(i7);
                                int i37 = i7 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = fjVar2.k.from_id;
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
                                TLRPC.Peer peer2 = fjVar2.k.from_id;
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
                            org.telegram.ui.Components.vz vzVar = wh0Var.a;
                            org.telegram.ui.Components.d9 d9Var = wh0Var.c;
                            wh0Var.setEnabled(arrayList.size() <= 0);
                            for (i11 = 0; i11 < 3; i11++) {
                                if (i11 < arrayList.size()) {
                                    d9Var.b(i11, i35, ((org.telegram.ui.Components.vh0) arrayList.get(i11)).a);
                                } else {
                                    d9Var.b(i11, i35, null);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                L = org.telegram.messenger.g0.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f10 = 0.0f;
                                    if (org.telegram.messenger.gd.a0) {
                                        f10 = org.telegram.messenger.g0.L(12.0f);
                                    }
                                    d9Var.setTranslationX(f10);
                                    d9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    d9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    vzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(vzVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.g0.L(12.0f);
                            }
                            f10 = L;
                            if (org.telegram.messenger.gd.a0) {
                            }
                            d9Var.setTranslationX(f10);
                            d9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            d9Var.animate().alpha(1.0f).setDuration(220L).start();
                            vzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(vzVar)).start();
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
                org.telegram.ui.Components.vz vzVar2 = wh0Var.a;
                org.telegram.ui.Components.d9 d9Var2 = wh0Var.c;
                wh0Var.setEnabled(arrayList.size() <= 0);
                while (i11 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f10 = L;
                if (org.telegram.messenger.gd.a0) {
                }
                d9Var2.setTranslationX(f10);
                d9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                d9Var2.animate().alpha(1.0f).setDuration(220L).start();
                vzVar2.animate().alpha(0.0f).setDuration(220L).setListener(new on(vzVar2)).start();
                return;
            case 17:
                org.telegram.ui.Components.wo0 wo0Var = (org.telegram.ui.Components.wo0) this.c;
                int i40 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                org.telegram.ui.Components.uo0 uo0Var = wo0Var.e;
                org.telegram.ui.Components.zo0 zo0Var = wo0Var.L;
                if (i40 != wo0Var.r) {
                    return;
                }
                wo0Var.b();
                wo0Var.J = false;
                wo0Var.w = i40;
                if (wo0Var.s != i40) {
                    uo0Var.b();
                }
                org.telegram.ui.Components.bo0 bo0Var = zo0Var.B1;
                org.telegram.ui.Components.wo0 wo0Var2 = zo0Var.I1;
                if (bo0Var.getAdapter() != wo0Var2) {
                    org.telegram.ui.Components.zo0.K0(zo0Var);
                    wo0Var2.f();
                }
                for (int i41 = 0; i41 < arrayList10.size(); i41++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.oo0) arrayList10.get(i41)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        org.telegram.messenger.mp.u1(zo0Var.a).e4((TLRPC.User) tLObject2, true, false);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        org.telegram.messenger.mp.u1(zo0Var.a).X3((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !wo0Var.d.isEmpty() && arrayList10.isEmpty();
                if (wo0Var.d.isEmpty()) {
                    arrayList10.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.zo0.K0(zo0Var);
                }
                wo0Var.d = arrayList10;
                uo0Var.f(arrayList10, null);
                int i42 = wo0Var.K;
                if (wo0Var.b() != 0 || uo0Var.e() || wo0Var.J) {
                    zo0Var.t2.b(i42);
                } else {
                    zo0Var.M1.e(false, true);
                }
                wo0Var.f();
                zo0Var.L0(true);
                return;
            case 18:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.it0) this.c).m1, (TL_stories.StoryItem) this.d);
                return;
            case 19:
                org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) this.c;
                it0Var.c0(this.b, (org.telegram.ui.Components.ek0) this.d, false);
                it0Var.N1 = null;
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
                org.telegram.ui.Components.us0 us0Var = (org.telegram.ui.Components.us0) this.c;
                int i44 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i44 != us0Var.F) {
                    return;
                }
                us0Var.E = ConnectionsManager.getInstance(us0Var.d).sendRequest(tL_messages_search, new di.w1(us0Var, i44, 7));
                return;
            case 22:
                org.telegram.ui.Components.us0 us0Var2 = (org.telegram.ui.Components.us0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i45 = this.b;
                ArrayList arrayList11 = us0Var2.h;
                int i46 = us0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i45 == us0Var2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    org.telegram.messenger.mp.u1(i46).f4(messages_messages.users, false);
                    org.telegram.messenger.mp.u1(i46).Z3(messages_messages.chats, false);
                    org.telegram.messenger.tr.a0(i46).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i47 = 0; i47 < messages_messages.messages.size(); i47++) {
                        org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj(i46, messages_messages.messages.get(i47), false, true);
                        if (fjVar3.z2()) {
                            fjVar3.S2 = true;
                        }
                        fjVar3.K5(us0Var2.x, true);
                        arrayList11.add(fjVar3);
                    }
                    us0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        us0Var2.s = arrayList11.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        us0Var2.s = true;
                    }
                    us0Var2.G(false);
                    us0Var2.r = false;
                    us0Var2.E = -1;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.ku0 ku0Var = (org.telegram.ui.Components.ku0) this.c;
                int i48 = this.b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                ku0Var.Z0 = false;
                if (!ku0Var.W0 && ku0Var.X0) {
                    ku0Var.C(true);
                    return;
                }
                ku0Var.n0 = ku0Var.g1[0];
                ku0Var.l();
                org.telegram.messenger.a6.q(i48).v(r1Var);
                ku0Var.I();
                ku0Var.x();
                return;
            case 24:
                int i49 = this.b;
                Integer num = (Integer) this.c;
                org.telegram.messenger.w2 w2Var = (org.telegram.messenger.w2) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = org.telegram.messenger.tr.a0(i49).b;
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
                    SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.tr.a0(i50).b;
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
                org.telegram.ui.Components.vv0 vv0Var = (org.telegram.ui.Components.vv0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i51 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var4 = vv0Var.V2.G1;
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
                org.telegram.ui.Components.zw0 zw0Var = (org.telegram.ui.Components.zw0) this.c;
                String str3 = (String) this.d;
                int i52 = this.b;
                ArrayList arrayList12 = new ArrayList(1);
                org.telegram.messenger.ni niVar = new org.telegram.messenger.ni();
                niVar.a = str3;
                niVar.b = null;
                arrayList12.add(niVar);
                org.telegram.messenger.ri.d0(zw0Var.a).Q(arrayList12, 15, false, false, new org.telegram.ui.Components.kp0(zw0Var, i52, str3, arrayList12, 5));
                return;
            case 28:
                a();
                return;
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.kp0((org.telegram.ui.Components.j01) this.c, (org.telegram.ui.Components.jp) this.d, this.b, org.telegram.messenger.lz.c(org.telegram.messenger.g0.p, R.raw.default_pattern, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(140.0f), -16777216, 1), 7));
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
