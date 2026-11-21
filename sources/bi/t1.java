package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.ya;
import di.ab;
import fi.f9;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.z80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        ah.r rVar;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z10 = false;
        z10 = false;
        int i13 = 1;
        switch (i10) {
            case 0:
                e2 e2Var = (e2) obj3;
                LinkedHashMap linkedHashMap = e2Var.a2;
                c2 c2Var = (c2) obj2;
                a2 a2Var = (a2) obj;
                org.telegram.ui.ActionBar.m2 m2Var = e2Var.c;
                o41 G = e2Var.j2.G(i7 - 1);
                if (G != null) {
                    if (G.d != 1 || G.a != 3) {
                        if (c2Var != null) {
                            if (G.H(b2.class)) {
                                e2Var.n1(G.d);
                                break;
                            } else {
                                Object obj4 = G.H;
                                if (obj4 instanceof TLRPC.User) {
                                    e2Var.n1(((TLRPC.User) obj4).id);
                                    break;
                                } else if (obj4 instanceof TLRPC.Chat) {
                                    e2Var.n1(-((TLRPC.Chat) obj4).id);
                                    break;
                                }
                            }
                        } else {
                            Object obj5 = G.H;
                            if (obj5 instanceof TLRPC.User) {
                                if (a2Var == null) {
                                    TLRPC.User user2 = (TLRPC.User) obj5;
                                    org.telegram.messenger.g0.v1(e2Var.q2);
                                    if (e2Var.T1) {
                                        ab abVar = new ab(e2Var.getContext(), e2Var.J0, user2, new n1(e2Var, i13));
                                        if (!org.telegram.messenger.g0.Q1()) {
                                            abVar.a0(e2Var.j1);
                                        }
                                        abVar.show();
                                        break;
                                    } else if (o10.b(user2.id)) {
                                        n10.u(gd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(user2.id)), new lc(m2Var, e2Var.J0), R.raw.error, 36);
                                        break;
                                    } else {
                                        n3 n3Var = new n3(e2Var.getContext(), e2Var.a, user2.id, wg.s.c(wg.s.b(1, e2Var.i2)), new p1(e2Var, false ? 1 : 0));
                                        long j3 = user2.id;
                                        org.telegram.messenger.t1 t1Var = e2Var.U1;
                                        if (t1Var != null && t1Var.a(j3)) {
                                            z10 = true;
                                        }
                                        n3Var.g1(z10);
                                        n3Var.show();
                                        break;
                                    }
                                } else {
                                    TLRPC.User user3 = (TLRPC.User) obj5;
                                    ek0 ek0Var = e2Var.o1;
                                    if (linkedHashMap.remove(Long.valueOf(user3.id)) == null) {
                                        int size = linkedHashMap.size();
                                        e2Var.V1.getClass();
                                        if (size >= 10) {
                                            new lc(m2Var, e2Var.J0).Q(R.raw.chats_infotip, 36, gd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                            try {
                                                m2Var.performHapticFeedback(3, 2);
                                                break;
                                            } catch (Exception unused) {
                                                return;
                                            }
                                        } else {
                                            linkedHashMap.put(Long.valueOf(user3.id), user3);
                                        }
                                    }
                                    boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user3.id));
                                    for (int i14 = 0; i14 < e2Var.j2.E.size(); i14++) {
                                        o41 G2 = e2Var.j2.G(i14);
                                        if (G2 != null && (G2.H instanceof TLRPC.User) && G2.y == user3.id) {
                                            G2.e = containsKey;
                                        }
                                    }
                                    for (int i15 = 0; i15 < ek0Var.getChildCount(); i15++) {
                                        View childAt = ek0Var.getChildAt(i15);
                                        if ((childAt instanceof ah.r) && (user = (rVar = (ah.r) childAt).getUser()) != null && user.id == user3.id) {
                                            rVar.c(containsKey, true);
                                        }
                                    }
                                    hi.e eVar = e2Var.b2;
                                    if (eVar != null) {
                                        eVar.c(linkedHashMap.size(), true);
                                        eVar.setEnabled(!linkedHashMap.isEmpty());
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.ui.Components.c5.l(e2Var.getContext(), gd.N0(2131751226, null), gd.N0(2131751231, null), null, new p1(e2Var, i12), new n1(e2Var, i11), false, false, e2Var.J0).C2();
                        break;
                    }
                }
                break;
            case 1:
                fi.a2 a2Var2 = (fi.a2) obj3;
                fi.m0 m0Var = (fi.m0) view;
                fi.r0 r0Var = m0Var.L;
                a70 G3 = a70.G((ViewGroup) obj2, new fi.b(), view);
                G3.p(15, -1, gd.a0(null, null, 2131748615, gd.x(r0Var.d, true)));
                G3.k();
                G3.c(R.drawable.msg_openprofile, gd.N0(2131747592, null), new di.f2(22, (f9) obj, r0Var), false);
                G3.l(R.drawable.msg_copy, gd.N0(2131751755, null), new di.f2(23, a2Var2, m0Var), !r0Var.e);
                G3.l(R.drawable.msg_delete, gd.N0(2131751586, null), new di.f2(24, a2Var2, r0Var), a2Var2.N == j10.i(a2Var2.O).e() || a2Var2.f());
                G3.a0();
                break;
            case 2:
                hi.u6 u6Var = (hi.u6) obj3;
                x10 x10Var = (x10) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (!(view instanceof org.telegram.ui.Cells.h7)) {
                    o41 G4 = u6Var.l2.G(i7 - 1);
                    if (G4 != null && G4.d == 1) {
                        new hi.u6(u6Var.getContext(), true, u6Var, x10Var, h6Var).show();
                        break;
                    } else if (G4 != null && G4.d == 2) {
                        u6Var.a2.b();
                        break;
                    } else if (G4 != null && G4.d == 3) {
                        u6Var.i1();
                        break;
                    } else if (G4 != null && G4.d == 4) {
                        u6Var.h1();
                        break;
                    }
                } else {
                    fj message = ((org.telegram.ui.Cells.h7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(u6Var.a).v(u6Var);
                        if (u6Var.c2 != null) {
                            org.telegram.messenger.w7.G(u6Var.a).f(u6Var.c2.F0());
                            u6Var.c2 = null;
                        }
                        if (message.y0 || message.z0) {
                            u6Var.b2.a(message);
                            hi.u6 u6Var2 = u6Var.W1;
                            if (u6Var2 != null) {
                                u6Var2.dismiss();
                            }
                            u6Var.dismiss();
                            break;
                        } else {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                u6Var.c2 = message;
                                org.telegram.messenger.a6.q(u6Var.a).a(S0, message, u6Var);
                                org.telegram.messenger.w7.G(u6Var.a).W(message.F0(), message, 1, 0);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                hi.k7 k7Var = (hi.k7) obj3;
                Context context = (Context) obj2;
                hi.v5 v5Var = (hi.v5) obj;
                org.telegram.ui.Cells.l3 l3Var = k7Var.V1;
                org.telegram.ui.Cells.l3 l3Var2 = k7Var.U1;
                o41 G5 = k7Var.T1.G(i7 - 1);
                if (G5 != null) {
                    if (G5.H(hi.i7.class) && (webPage = k7Var.c2) != null && !hi.k7.h1(webPage)) {
                        tg.l2 l2Var = new tg.l2(context, k7Var.a);
                        tg.i0 i0Var = new tg.i0();
                        i0Var.c = l3Var2.d.getText().toString();
                        i0Var.b = k7Var.i2 ? l3Var.d.getText().toString() : null;
                        TLRPC.WebPage webPage2 = k7Var.c2;
                        i0Var.d = webPage2;
                        i0Var.e = k7Var.k2;
                        i0Var.f = k7Var.j2;
                        hi.s6 s6Var = new hi.s6(k7Var, 1);
                        l2Var.H = i0Var;
                        int i16 = (webPage2 == null || (webPage2.photo == null && !fj.K4(webPage2.document))) ? 8 : 0;
                        va0 va0Var = l2Var.y;
                        va0Var.setVisibility(i16);
                        l2Var.f.b(l2Var.a, i0Var, false);
                        l2Var.x.a(!i0Var.f, false);
                        va0Var.a(!i0Var.e, false);
                        l2Var.I = s6Var;
                        l2Var.e.setImageDrawable(new hi.k3(v5Var, 9));
                        l2Var.show();
                        break;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.s8)) {
                        boolean z11 = !k7Var.i2;
                        k7Var.i2 = z11;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                        k7Var.T1.O(true);
                        if (k7Var.i2) {
                            l3Var.requestFocus();
                            break;
                        } else {
                            l3Var2.requestFocus();
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                z80 z80Var = (z80) tVar.f3.get(i7);
                if (z80Var.e && !j10.o()) {
                    g2Var.showDialog(new ug.y0(g2Var, 10, true));
                    break;
                } else if (!ya.a(z80Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context2);
                    pVar.a = i7;
                    tVar.g3.w0(pVar);
                    ya.b(z80Var);
                    int i17 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i18 = 0; i18 < tVar.getChildCount(); i18++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i18);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ks.e().k(ks.S4, 5, z80Var);
                    break;
                }
                break;
        }
    }
}
