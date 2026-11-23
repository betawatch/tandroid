package di;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.pv;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.tq0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bn;
import org.telegram.ui.f50;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements org.telegram.ui.ActionBar.q1, bi.j1, rj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t1(f6 f6Var, long j3, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, long[] jArr, bi.e2 e2Var) {
        this.a = 0;
        this.b = f6Var;
        this.c = j3;
        this.d = stargiftdepositpayloadArr;
        this.e = jArr;
        this.f = e2Var;
    }

    @Override // bi.j1
    public void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.b;
        bi.k1 k1Var = (bi.k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        cg.b bVar = (cg.b) this.f;
        if (k1Var.G1) {
            return;
        }
        f6Var.g2.setLoading(true);
        if (!k1Var.G1) {
            k1Var.G1 = true;
            k1Var.C1.g(true);
        }
        y8 x10 = y8.x(f6Var.a, bVar);
        long j3 = this.c;
        x10.H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new r1(f6Var, k1Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10));
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(final float f10, final float f11, int i7, View view) {
        boolean z10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j3;
        int i10 = i7;
        final jt0 jt0Var = (jt0) this.b;
        kq0 kq0Var = (kq0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f;
        ur0 ur0Var = jt0Var.T;
        us0 us0Var = jt0Var.U;
        vr0 vr0Var = jt0Var.d0;
        vs0 vs0Var = jt0Var.V;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
        int i11 = kq0Var.F;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.ra) {
                if (!vr0Var.e.isEmpty()) {
                    i10 = ((Integer) vr0Var.e.get(i10)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = vr0Var.d.participants.participants.get(i10);
                if (i10 < 0 || i10 >= vr0Var.d.participants.participants.size()) {
                    return;
                }
                jt0Var.U0(chatParticipant, false, view);
                return;
            }
            v4.i0 adapter = kq0Var.h.getAdapter();
            bs0 bs0Var = jt0Var.m0;
            if (adapter == bs0Var) {
                TLObject E = bs0Var.E(i10);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = gj.B1(((TLRPC.ChannelParticipant) E).peer);
                } else if (!(E instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                }
                if (j3 == 0 || j3 == g2Var.getUserConfig().e()) {
                    return;
                }
                g2Var.presentFragment(new ProfileActivity(a8.p0.j(j3, "user_id"), null));
                return;
            }
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.y4)) {
            Bundle bundle = new Bundle();
            bundle.putLongArray("result", new long[]{jt0Var.S.F()});
            f50 f50Var = new f50(bundle);
            f50Var.Z = new sq0(jt0Var);
            g2Var.presentFragment(f50Var);
            return;
        }
        if (i11 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", chat.id);
            if (g2Var.getMessagesController().E(bundle2, g2Var, null, null)) {
                if (!chat.forum) {
                    g2Var.presentFragment(new bn(bundle2));
                    return;
                } else {
                    HashSet hashSet = y91.s1;
                    g2Var.presentFragment(y91.I0(g2Var.getMessagesController(), g2Var.getMessagesStorage(), bundle2));
                    return;
                }
            }
            return;
        }
        if (i11 == 1 && (view instanceof org.telegram.ui.Cells.i7)) {
            jt0Var.S0(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), kq0Var.F);
            return;
        }
        if (i11 == 3 && (view instanceof org.telegram.ui.Cells.l7)) {
            jt0Var.S0(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), kq0Var.F);
            return;
        }
        if ((i11 == 2 || i11 == 4) && (view instanceof org.telegram.ui.Cells.h7)) {
            jt0Var.S0(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), kq0Var.F);
            return;
        }
        if (i11 == 5 && (view instanceof org.telegram.ui.Cells.i2)) {
            jt0Var.S0(i10, view, (gj) ((org.telegram.ui.Cells.i2) view).getParentObject(), kq0Var.F);
            return;
        }
        if (i11 == 0 && (view instanceof org.telegram.ui.Cells.p7)) {
            final org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            gj messageObject = p7Var.getMessageObject();
            if (messageObject != null && messageObject.p4()) {
                if (g2Var == null) {
                    return;
                }
                final int currentAccount = g2Var.getCurrentAccount();
                final np u12 = np.u1(currentAccount);
                final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
                t1Var.r(200L);
                u12.T0(new y10() { // from class: org.telegram.ui.Components.op0
                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                        org.telegram.ui.ActionBar.g2 g2Var2 = jt0.this.y1;
                        t1Var.c(200L);
                        final org.telegram.messenger.np npVar = u12;
                        final boolean z11 = ((org.telegram.messenger.h0) npVar.A7.m.b).c && !TextUtils.isEmpty(npVar.x6);
                        boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                        final boolean[] zArr = new boolean[1];
                        final Context context2 = context;
                        FrameLayout frameLayout = new FrameLayout(context2);
                        if (z11) {
                            zArr[0] = true;
                        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, context2, g2Var2 == null ? null : g2Var2.getResourceProvider());
                            d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                            d2Var.e(org.telegram.messenger.hd.N0(2131748289, null), "", zArr[0], false, false);
                            d2Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                            frameLayout.addView(d2Var, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                            d2Var.setOnClickListener(new g1(6, zArr));
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, g2Var2 == null ? null : g2Var2.getResourceProvider());
                        String N0 = org.telegram.messenger.hd.N0(2131748280, null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                        t1Var2.S = N0;
                        t1Var2.U = org.telegram.messenger.hd.N0(z12 ? 2131748282 : 2131748283, null);
                        alertDialog$Builder.o(frameLayout);
                        t1Var2.H = 9;
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(z12 ? 2131748281 : 2131752577, null), null);
                        if (!z12) {
                            String N02 = org.telegram.messenger.hd.N0(2131748288, null);
                            final org.telegram.ui.Cells.p7 p7Var2 = p7Var;
                            final float f12 = f10;
                            final float f13 = f11;
                            final int i12 = currentAccount;
                            alertDialog$Builder.k(N02, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.Components.zp0
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i13) {
                                    TL_account.contentSettings contentsettings2;
                                    v60 v60Var = new v60(f12, f13, 1, org.telegram.ui.Cells.p7.this);
                                    if (!zArr[0]) {
                                        v60Var.a(Boolean.FALSE);
                                        return;
                                    }
                                    if (!z11 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                        v60Var.a(Boolean.TRUE);
                                    } else {
                                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                        ThemeActivity.H0(i12, context2, new rh(9, npVar, v60Var), T == null ? null : T.getResourceProvider());
                                    }
                                }
                            });
                        }
                        if (g2Var2 == null || g2Var2.getContext() == null) {
                            alertDialog$Builder.p();
                        } else {
                            g2Var2.showDialog(t1Var2);
                        }
                    }
                });
                return;
            }
            gj gjVar = p7Var.n;
            if (gjVar != null && gjVar.t2() && p7Var.j0 == 0.0f && !p7Var.n.P0) {
                p7Var.n(f10, f11);
                return;
            } else {
                if (messageObject != null) {
                    jt0Var.S0(i10, view, messageObject, kq0Var.F);
                    return;
                }
                return;
            }
        }
        if (jt0.z0(i11) && (view instanceof org.telegram.ui.Cells.p7)) {
            gj messageObject2 = ((org.telegram.ui.Cells.p7) view).getMessageObject();
            if (messageObject2 != null) {
                jt0Var.S0(i10, view, messageObject2, kq0Var.F);
                return;
            }
            return;
        }
        int i12 = kq0Var.F;
        if (i12 == 10) {
            if (((view instanceof org.telegram.ui.Cells.h6) || f11 < org.telegram.messenger.g0.L(60.0f)) && i10 >= 0 && i10 < ur0Var.d.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) ur0Var.d.get(i10);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                g2Var.presentFragment(new bn(bundle3));
                return;
            }
            return;
        }
        if (i12 != 11) {
            if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r1)) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                gj messageObject3 = r1Var.getMessageObject();
                kq0Var.h.C0();
                int currentAccount2 = g2Var.getCurrentAccount();
                np messagesController = g2Var.getMessagesController();
                long j10 = this.c;
                TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j10));
                a70 G = a70.G(kq0Var, h6Var, r1Var);
                G.f0 = true;
                G.W(messageObject3.P3() ? 5 : 3);
                G.c(R.drawable.msg_message, hd.N0(2131754877, null), new bi.q2(jt0Var, j10, messageObject3, 25), false);
                if (messageObject3.D == 17) {
                    TLRPC.MessageMedia n1 = gj.n1(messageObject3.k);
                    if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                        z10 = ((TLRPC.TL_messageMediaPoll) n1).poll.closed;
                        if (!z10) {
                            if (messageObject3.C()) {
                                G.c(R.drawable.msg_unvote, hd.N0(2131743579, null), new pp0(jt0Var, h6Var, currentAccount2, messageObject3), false);
                            }
                            if (!gj.l3(messageObject3.k) && ((messageObject3.N3() && (!org.telegram.messenger.v3.T(O0) || O0.megagroup)) || (org.telegram.messenger.v3.T(O0) && !O0.megagroup && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                                G.c(R.drawable.msg_pollstop, hd.N0(messageObject3.c4() ? 2131744583 : 2131744588, null), new pp0(jt0Var, h6Var, messageObject3, currentAccount2), false);
                            }
                        }
                        G.a0();
                        return;
                    }
                }
                z10 = false;
                if (!z10) {
                }
                G.a0();
                return;
            }
            return;
        }
        if (kq0Var.h.getAdapter() != vs0Var) {
            if (jt0Var.F1) {
                if (us0Var.w.E == 0) {
                    us0Var.E(view);
                    return;
                }
                return;
            }
            Bundle bundle4 = new Bundle();
            if (i10 < 0 || i10 >= us0Var.f.size()) {
                return;
            }
            pv pvVar = (pv) us0Var.f.get(i10);
            bundle4.putLong("user_id", g2Var.getUserConfig().e());
            bundle4.putInt("chatMode", 3);
            bn bnVar = new bn(bundle4);
            bnVar.s4 = pvVar.a;
            g2Var.presentFragment(bnVar);
            return;
        }
        if (i10 < 0) {
            return;
        }
        ArrayList arrayList = vs0Var.e;
        ArrayList arrayList2 = vs0Var.f;
        if (i10 < arrayList.size()) {
            pv pvVar2 = (pv) arrayList.get(i10);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", g2Var.getUserConfig().e());
            bundle5.putInt("chatMode", 3);
            bn bnVar2 = new bn(bundle5);
            bnVar2.s4 = pvVar2.a;
            g2Var.presentFragment(bnVar2);
            return;
        }
        int size = i10 - arrayList.size();
        if (size < arrayList2.size()) {
            gj gjVar2 = (gj) arrayList2.get(size);
            Bundle bundle6 = new Bundle();
            bundle6.putLong("user_id", g2Var.getUserConfig().e());
            bundle6.putInt("message_id", gjVar2.e1());
            tq0 tq0Var = new tq0(jt0Var, bundle6, size);
            tq0Var.d8 = gjVar2.e1();
            g2Var.presentFragment(tq0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.d;
                long[] jArr = (long[]) this.e;
                bi.e2 e2Var = (bi.e2) this.f;
                f6Var.getClass();
                f6Var.v1(this.c, stargiftdepositpayloadArr[0], jArr[0], t1Var.h(i7, true, true), e2Var);
                break;
            case 1:
            default:
                a21 a21Var = (a21) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                me meVar = (me) this.f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j3 = this.c;
                    if (i10 >= size) {
                        a21Var.l0.addAll(hashSet);
                        a21Var.q();
                        org.telegram.ui.Components.lc.b0(a21Var.s).U(hd.K0(hashSet.size(), "TopicsDeleted"), false, new j2(a21Var, hashSet, arrayList, j3, 17), new fm0(a21Var, arrayList, meVar, 13)).j();
                        t1Var.dismiss();
                        break;
                    } else {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j3 == ((Integer) obj).intValue()) {
                            a21Var.n(0L, false);
                        }
                    }
                }
            case 2:
                bn.f1((bn) this.b, (TLRPC.TL_game) this.d, (gj) this.e, (String) this.f, this.c);
                break;
        }
    }

    public /* synthetic */ t1(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.b = (gs) obj;
        this.d = callback;
        this.e = obj2;
        this.c = j3;
        this.f = obj3;
    }

    public /* synthetic */ t1(bn bnVar, TLRPC.TL_game tL_game, gj gjVar, String str, long j3) {
        this.a = 2;
        this.b = bnVar;
        this.d = tL_game;
        this.e = gjVar;
        this.f = str;
        this.c = j3;
    }

    public /* synthetic */ t1(a21 a21Var, ArrayList arrayList, long j3, HashSet hashSet, me meVar) {
        this.a = 4;
        this.b = a21Var;
        this.d = arrayList;
        this.c = j3;
        this.e = hashSet;
        this.f = meVar;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
