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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.y80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.oj0
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
                a2 a2Var = (a2) obj3;
                LinkedHashMap linkedHashMap = a2Var.a2;
                y1 y1Var = (y1) obj2;
                w1 w1Var = (w1) obj;
                org.telegram.ui.ActionBar.n2 n2Var = a2Var.c;
                l41 G = a2Var.j2.G(i7 - 1);
                if (G != null) {
                    if (G.d != 1 || G.a != 3) {
                        if (y1Var != null) {
                            if (G.H(x1.class)) {
                                a2Var.n1(G.d);
                                break;
                            } else {
                                Object obj4 = G.H;
                                if (obj4 instanceof TLRPC.User) {
                                    a2Var.n1(((TLRPC.User) obj4).id);
                                    break;
                                } else if (obj4 instanceof TLRPC.Chat) {
                                    a2Var.n1(-((TLRPC.Chat) obj4).id);
                                    break;
                                }
                            }
                        } else {
                            Object obj5 = G.H;
                            if (obj5 instanceof TLRPC.User) {
                                if (w1Var == null) {
                                    TLRPC.User user2 = (TLRPC.User) obj5;
                                    org.telegram.messenger.g0.v1(a2Var.q2);
                                    if (a2Var.T1) {
                                        ab abVar = new ab(a2Var.getContext(), a2Var.J0, user2, new j1(a2Var, i13));
                                        if (!org.telegram.messenger.g0.Q1()) {
                                            abVar.a0(a2Var.j1);
                                        }
                                        abVar.show();
                                        break;
                                    } else if (o10.b(user2.id)) {
                                        n10.u(gd.a0(null, null, 2131743505, org.telegram.messenger.n5.t(user2.id)), new lc(n2Var, a2Var.J0), R.raw.error, 36);
                                        break;
                                    } else {
                                        j3 j3Var = new j3(a2Var.getContext(), a2Var.a, user2.id, wg.s.c(wg.s.b(1, a2Var.i2)), new l1(a2Var, false ? 1 : 0));
                                        long j3 = user2.id;
                                        org.telegram.messenger.t1 t1Var = a2Var.U1;
                                        if (t1Var != null && t1Var.a(j3)) {
                                            z10 = true;
                                        }
                                        j3Var.g1(z10);
                                        j3Var.show();
                                        break;
                                    }
                                } else {
                                    TLRPC.User user3 = (TLRPC.User) obj5;
                                    ck0 ck0Var = a2Var.o1;
                                    if (linkedHashMap.remove(Long.valueOf(user3.id)) == null) {
                                        int size = linkedHashMap.size();
                                        a2Var.V1.getClass();
                                        if (size >= 10) {
                                            new lc(n2Var, a2Var.J0).Q(R.raw.chats_infotip, 36, gd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                            try {
                                                n2Var.performHapticFeedback(3, 2);
                                                break;
                                            } catch (Exception unused) {
                                                return;
                                            }
                                        } else {
                                            linkedHashMap.put(Long.valueOf(user3.id), user3);
                                        }
                                    }
                                    boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user3.id));
                                    for (int i14 = 0; i14 < a2Var.j2.E.size(); i14++) {
                                        l41 G2 = a2Var.j2.G(i14);
                                        if (G2 != null && (G2.H instanceof TLRPC.User) && G2.y == user3.id) {
                                            G2.e = containsKey;
                                        }
                                    }
                                    for (int i15 = 0; i15 < ck0Var.getChildCount(); i15++) {
                                        View childAt = ck0Var.getChildAt(i15);
                                        if ((childAt instanceof ah.r) && (user = (rVar = (ah.r) childAt).getUser()) != null && user.id == user3.id) {
                                            rVar.c(containsKey, true);
                                        }
                                    }
                                    hi.d dVar = a2Var.b2;
                                    if (dVar != null) {
                                        dVar.c(linkedHashMap.size(), true);
                                        dVar.setEnabled(!linkedHashMap.isEmpty());
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.ui.Components.b5.l(a2Var.getContext(), gd.M0(2131751227, null), gd.M0(2131751232, null), null, new l1(a2Var, i12), new j1(a2Var, i11), false, false, a2Var.J0).C2();
                        break;
                    }
                }
                break;
            case 1:
                fi.a2 a2Var2 = (fi.a2) obj3;
                fi.m0 m0Var = (fi.m0) view;
                fi.r0 r0Var = m0Var.L;
                y60 G3 = y60.G((ViewGroup) obj2, new fi.b(), view);
                G3.p(15, -1, gd.a0(null, null, 2131748616, gd.x(r0Var.d, true)));
                G3.k();
                G3.c(R.drawable.msg_openprofile, gd.M0(2131747593, null), new di.w2(20, (f9) obj, r0Var), false);
                G3.l(R.drawable.msg_copy, gd.M0(2131751756, null), new di.w2(21, a2Var2, m0Var), !r0Var.e);
                G3.l(R.drawable.msg_delete, gd.M0(2131751587, null), new di.w2(22, a2Var2, r0Var), a2Var2.N == j10.i(a2Var2.O).e() || a2Var2.f());
                G3.a0();
                break;
            case 2:
                hi.v6 v6Var = (hi.v6) obj3;
                x10 x10Var = (x10) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (!(view instanceof org.telegram.ui.Cells.g7)) {
                    l41 G4 = v6Var.l2.G(i7 - 1);
                    if (G4 != null && G4.d == 1) {
                        new hi.v6(v6Var.getContext(), true, v6Var, x10Var, i6Var).show();
                        break;
                    } else if (G4 != null && G4.d == 2) {
                        v6Var.a2.b();
                        break;
                    } else if (G4 != null && G4.d == 3) {
                        v6Var.i1();
                        break;
                    } else if (G4 != null && G4.d == 4) {
                        v6Var.h1();
                        break;
                    }
                } else {
                    fj message = ((org.telegram.ui.Cells.g7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(v6Var.a).v(v6Var);
                        if (v6Var.c2 != null) {
                            org.telegram.messenger.w7.G(v6Var.a).f(v6Var.c2.F0());
                            v6Var.c2 = null;
                        }
                        if (message.y0 || message.z0) {
                            v6Var.b2.a(message);
                            hi.v6 v6Var2 = v6Var.W1;
                            if (v6Var2 != null) {
                                v6Var2.dismiss();
                            }
                            v6Var.dismiss();
                            break;
                        } else {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                v6Var.c2 = message;
                                org.telegram.messenger.a6.q(v6Var.a).a(S0, message, v6Var);
                                org.telegram.messenger.w7.G(v6Var.a).W(message.F0(), message, 1, 0);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                hi.l7 l7Var = (hi.l7) obj3;
                Context context = (Context) obj2;
                hi.w5 w5Var = (hi.w5) obj;
                org.telegram.ui.Cells.k3 k3Var = l7Var.V1;
                org.telegram.ui.Cells.k3 k3Var2 = l7Var.U1;
                l41 G5 = l7Var.T1.G(i7 - 1);
                if (G5 != null) {
                    if (G5.H(hi.j7.class) && (webPage = l7Var.c2) != null && !hi.l7.h1(webPage)) {
                        tg.k2 k2Var = new tg.k2(context, l7Var.a);
                        tg.h0 h0Var = new tg.h0();
                        h0Var.c = k3Var2.d.getText().toString();
                        h0Var.b = l7Var.i2 ? k3Var.d.getText().toString() : null;
                        TLRPC.WebPage webPage2 = l7Var.c2;
                        h0Var.d = webPage2;
                        h0Var.e = l7Var.k2;
                        h0Var.f = l7Var.j2;
                        hi.t6 t6Var = new hi.t6(l7Var, 1);
                        k2Var.H = h0Var;
                        int i16 = (webPage2 == null || (webPage2.photo == null && !fj.K4(webPage2.document))) ? 8 : 0;
                        ta0 ta0Var = k2Var.y;
                        ta0Var.setVisibility(i16);
                        k2Var.f.b(k2Var.a, h0Var, false);
                        k2Var.x.a(!h0Var.f, false);
                        ta0Var.a(!h0Var.e, false);
                        k2Var.I = t6Var;
                        k2Var.e.setImageDrawable(new hi.l3(w5Var, 9));
                        k2Var.show();
                        break;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                        boolean z11 = !l7Var.i2;
                        l7Var.i2 = z11;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                        l7Var.T1.O(true);
                        if (l7Var.i2) {
                            k3Var.requestFocus();
                            break;
                        } else {
                            k3Var2.requestFocus();
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                y80 y80Var = (y80) tVar.f3.get(i7);
                if (y80Var.e && !j10.o()) {
                    h2Var.showDialog(new ug.z0(h2Var, 10, true));
                    break;
                } else if (!ya.a(y80Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context2);
                    pVar.a = i7;
                    tVar.g3.w0(pVar);
                    ya.b(y80Var);
                    int i17 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i18 = 0; i18 < tVar.getChildCount(); i18++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i18);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ks.e().k(ks.R4, 5, y80Var);
                    break;
                }
                break;
        }
    }
}
