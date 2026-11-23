package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.za;
import di.ab;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.y80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
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
                f2 f2Var = (f2) obj3;
                LinkedHashMap linkedHashMap = f2Var.a2;
                d2 d2Var = (d2) obj2;
                b2 b2Var = (b2) obj;
                org.telegram.ui.ActionBar.m2 m2Var = f2Var.c;
                n41 G = f2Var.j2.G(i7 - 1);
                if (G != null) {
                    if (G.d != 1 || G.a != 3) {
                        if (d2Var != null) {
                            if (G.H(c2.class)) {
                                f2Var.n1(G.d);
                                break;
                            } else {
                                Object obj4 = G.H;
                                if (obj4 instanceof TLRPC.User) {
                                    f2Var.n1(((TLRPC.User) obj4).id);
                                    break;
                                } else if (obj4 instanceof TLRPC.Chat) {
                                    f2Var.n1(-((TLRPC.Chat) obj4).id);
                                    break;
                                }
                            }
                        } else {
                            Object obj5 = G.H;
                            if (obj5 instanceof TLRPC.User) {
                                if (b2Var == null) {
                                    TLRPC.User user2 = (TLRPC.User) obj5;
                                    org.telegram.messenger.g0.v1(f2Var.q2);
                                    if (f2Var.T1) {
                                        ab abVar = new ab(f2Var.getContext(), f2Var.J0, user2, new n1(f2Var, i13));
                                        if (!org.telegram.messenger.g0.Q1()) {
                                            abVar.a0(f2Var.j1);
                                        }
                                        abVar.show();
                                        break;
                                    } else if (n10.b(user2.id)) {
                                        m10.u(gd.a0(null, null, 2131743495, org.telegram.messenger.n5.t(user2.id)), new kc(m2Var, f2Var.J0), R.raw.error, 36);
                                        break;
                                    } else {
                                        p3 p3Var = new p3(f2Var.getContext(), f2Var.a, user2.id, wg.r.c(wg.r.b(1, f2Var.i2)), new p1(f2Var, false ? 1 : 0));
                                        long j3 = user2.id;
                                        org.telegram.messenger.t1 t1Var = f2Var.U1;
                                        if (t1Var != null && t1Var.a(j3)) {
                                            z10 = true;
                                        }
                                        p3Var.g1(z10);
                                        p3Var.show();
                                        break;
                                    }
                                } else {
                                    TLRPC.User user3 = (TLRPC.User) obj5;
                                    ek0 ek0Var = f2Var.o1;
                                    if (linkedHashMap.remove(Long.valueOf(user3.id)) == null) {
                                        int size = linkedHashMap.size();
                                        f2Var.V1.getClass();
                                        if (size >= 10) {
                                            new kc(m2Var, f2Var.J0).Q(R.raw.chats_infotip, 36, gd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
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
                                    for (int i14 = 0; i14 < f2Var.j2.E.size(); i14++) {
                                        n41 G2 = f2Var.j2.G(i14);
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
                                    hi.e eVar = f2Var.b2;
                                    if (eVar != null) {
                                        eVar.c(linkedHashMap.size(), true);
                                        eVar.setEnabled(!linkedHashMap.isEmpty());
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.ui.Components.b5.l(f2Var.getContext(), gd.N0(2131751226, null), gd.N0(2131751231, null), null, new p1(f2Var, i12), new n1(f2Var, i11), false, false, f2Var.J0).D0();
                        break;
                    }
                }
                break;
            case 1:
                fi.a2 a2Var = (fi.a2) obj3;
                fi.m0 m0Var = (fi.m0) view;
                fi.r0 r0Var = m0Var.L;
                x60 G3 = x60.G((ViewGroup) obj2, new fi.b(), view);
                G3.p(15, -1, gd.a0(null, null, 2131748615, gd.x(r0Var.d, true)));
                G3.k();
                G3.c(R.drawable.msg_openprofile, gd.N0(2131747592, null), new di.f2(22, (fi.f9) obj, r0Var), false);
                G3.l(R.drawable.msg_copy, gd.N0(2131751755, null), new di.f2(23, a2Var, m0Var), !r0Var.e);
                G3.l(R.drawable.msg_delete, gd.N0(2131751586, null), new di.f2(24, a2Var, r0Var), a2Var.N == i10.i(a2Var.O).e() || a2Var.f());
                G3.a0();
                break;
            case 2:
                hi.e7 e7Var = (hi.e7) obj3;
                w10 w10Var = (w10) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (!(view instanceof org.telegram.ui.Cells.g7)) {
                    n41 G4 = e7Var.l2.G(i7 - 1);
                    if (G4 != null && G4.d == 1) {
                        new hi.e7(e7Var.getContext(), true, e7Var, w10Var, i6Var).show();
                        break;
                    } else if (G4 != null && G4.d == 2) {
                        e7Var.a2.b();
                        break;
                    } else if (G4 != null && G4.d == 3) {
                        e7Var.i1();
                        break;
                    } else if (G4 != null && G4.d == 4) {
                        e7Var.h1();
                        break;
                    }
                } else {
                    fj message = ((org.telegram.ui.Cells.g7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(e7Var.a).v(e7Var);
                        if (e7Var.c2 != null) {
                            org.telegram.messenger.w7.G(e7Var.a).f(e7Var.c2.F0());
                            e7Var.c2 = null;
                        }
                        if (message.y0 || message.z0) {
                            e7Var.b2.a(message);
                            hi.e7 e7Var2 = e7Var.W1;
                            if (e7Var2 != null) {
                                e7Var2.dismiss();
                            }
                            e7Var.dismiss();
                            break;
                        } else {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                e7Var.c2 = message;
                                org.telegram.messenger.a6.q(e7Var.a).a(S0, message, e7Var);
                                org.telegram.messenger.w7.G(e7Var.a).W(message.F0(), message, 1, 0);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                hi.f8 f8Var = (hi.f8) obj3;
                Context context = (Context) obj2;
                hi.f6 f6Var = (hi.f6) obj;
                org.telegram.ui.Cells.l3 l3Var = f8Var.V1;
                org.telegram.ui.Cells.l3 l3Var2 = f8Var.U1;
                n41 G5 = f8Var.T1.G(i7 - 1);
                if (G5 != null) {
                    if (G5.H(hi.d8.class) && (webPage = f8Var.c2) != null && !hi.f8.h1(webPage)) {
                        tg.o2 o2Var = new tg.o2(context, f8Var.a);
                        tg.m0 m0Var2 = new tg.m0();
                        m0Var2.c = l3Var2.d.getText().toString();
                        m0Var2.b = f8Var.i2 ? l3Var.d.getText().toString() : null;
                        TLRPC.WebPage webPage2 = f8Var.c2;
                        m0Var2.d = webPage2;
                        m0Var2.e = f8Var.k2;
                        m0Var2.f = f8Var.j2;
                        hi.c7 c7Var = new hi.c7(f8Var, 1);
                        o2Var.H = m0Var2;
                        int i16 = (webPage2 == null || (webPage2.photo == null && !fj.K4(webPage2.document))) ? 8 : 0;
                        sa0 sa0Var = o2Var.y;
                        sa0Var.setVisibility(i16);
                        o2Var.f.b(o2Var.a, m0Var2, false);
                        o2Var.x.a(!m0Var2.f, false);
                        sa0Var.a(!m0Var2.e, false);
                        o2Var.I = c7Var;
                        o2Var.e.setImageDrawable(new hi.t3(f6Var, 9));
                        o2Var.show();
                        break;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                        boolean z11 = !f8Var.i2;
                        f8Var.i2 = z11;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                        f8Var.T1.O(true);
                        if (f8Var.i2) {
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
                y80 y80Var = (y80) tVar.f3.get(i7);
                if (y80Var.e && !i10.o()) {
                    g2Var.showDialog(new ug.y0(g2Var, 10, true));
                    break;
                } else if (!za.a(y80Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context2);
                    pVar.a = i7;
                    tVar.g3.w0(pVar);
                    za.b(y80Var);
                    int i17 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i18 = 0; i18 < tVar.getChildCount(); i18++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i18);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ks.e().k(ks.S4, 5, y80Var);
                    break;
                }
                break;
        }
    }
}
