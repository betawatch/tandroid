package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.za0;
import org.telegram.ui.ba0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        TLRPC.WebPage webPage;
        int i11 = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        int i12 = 1;
        switch (i11) {
            case 0:
                t tVar = (t) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                Context context = (Context) obj2;
                s sVar = (s) view;
                ba0 ba0Var = (ba0) tVar.e3.get(i10);
                if (ba0Var.e && !d20.o()) {
                    k2Var.showDialog(new kg.i1(k2Var, 10, true));
                    break;
                } else if (!w7.j6.a(ba0Var)) {
                    p pVar = new p(context);
                    pVar.a = i10;
                    tVar.f3.w0(pVar);
                    w7.j6.b(ba0Var);
                    int i13 = s.h;
                    sVar.b(true, true);
                    for (int i14 = 0; i14 < tVar.getChildCount(); i14++) {
                        s sVar2 = (s) tVar.getChildAt(i14);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    zs.e().k(zs.P4, 5, ba0Var);
                    break;
                }
                break;
            case 1:
                th.p1 p1Var = (th.p1) obj3;
                th.c0 c0Var = (th.c0) view;
                th.h0 h0Var = c0Var.K;
                z60 F = z60.F((ViewGroup) obj, new th.b(), view);
                F.p(15, -1, cd.a0(null, null, 2131748818, cd.x(h0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, cd.L0(2131747802, null), new rh.o(26, (th.o7) obj2, h0Var), false);
                F.l(R.drawable.msg_copy, cd.L0(2131751767, null), new rh.o(27, p1Var, c0Var), !h0Var.e);
                F.l(R.drawable.msg_delete, cd.L0(2131751599, null), new rh.o(28, p1Var, h0Var), p1Var.M == d20.i(p1Var.N).e() || p1Var.f());
                F.Z();
                break;
            case 2:
                vh.f5 f5Var = (vh.f5) obj3;
                q20 q20Var = (q20) obj;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                if (!(view instanceof k7)) {
                    a51 G = f5Var.h2.G(i10 - 1);
                    if (G != null && G.d == 1) {
                        new vh.f5(f5Var.getContext(), true, f5Var, q20Var, p6Var).show();
                        break;
                    } else if (G != null && G.d == 2) {
                        f5Var.W1.b();
                        break;
                    } else if (G != null && G.d == 3) {
                        f5Var.h1();
                        break;
                    } else if (G != null && G.d == 4) {
                        f5Var.g1();
                        break;
                    }
                } else {
                    jj message = ((k7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.b6.q(f5Var.a).v(f5Var);
                        if (f5Var.Y1 != null) {
                            org.telegram.messenger.b8.G(f5Var.a).f(f5Var.Y1.F0());
                            f5Var.Y1 = null;
                        }
                        if (message.w0 || message.x0) {
                            f5Var.X1.a(message);
                            vh.f5 f5Var2 = f5Var.S1;
                            if (f5Var2 != null) {
                                f5Var2.dismiss();
                            }
                            f5Var.dismiss();
                            break;
                        } else {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                f5Var.Y1 = message;
                                org.telegram.messenger.b6.q(f5Var.a).a(S0, message, f5Var);
                                org.telegram.messenger.b8.G(f5Var.a).X(message.F0(), message, 1, 0);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                vh.t5 t5Var = (vh.t5) obj3;
                Context context2 = (Context) obj2;
                vh.k4 k4Var = (vh.k4) obj;
                m3 m3Var = t5Var.R1;
                m3 m3Var2 = t5Var.Q1;
                a51 G2 = t5Var.P1.G(i10 - 1);
                if (G2 != null) {
                    if (G2.H(vh.r5.class) && (webPage = t5Var.Y1) != null && !vh.t5.g1(webPage)) {
                        jg.d3 d3Var = new jg.d3(context2, t5Var.a);
                        jg.s0 s0Var = new jg.s0();
                        s0Var.c = m3Var2.d.getText().toString();
                        s0Var.b = t5Var.e2 ? m3Var.d.getText().toString() : null;
                        TLRPC.WebPage webPage2 = t5Var.Y1;
                        s0Var.d = webPage2;
                        s0Var.e = t5Var.g2;
                        s0Var.f = t5Var.f2;
                        ph.h1 h1Var = new ph.h1(t5Var, 29);
                        d3Var.G = s0Var;
                        int i15 = (webPage2 == null || (webPage2.photo == null && !jj.K4(webPage2.document))) ? 8 : 0;
                        za0 za0Var = d3Var.y;
                        za0Var.setVisibility(i15);
                        d3Var.f.b(d3Var.a, s0Var, false);
                        d3Var.x.a(!s0Var.f, false);
                        za0Var.a(!s0Var.e, false);
                        d3Var.H = h1Var;
                        d3Var.e.setImageDrawable(new jg.x0(k4Var, i12));
                        d3Var.show();
                        break;
                    } else if (G2.d == 2 && (view instanceof t8)) {
                        boolean z10 = !t5Var.e2;
                        t5Var.e2 = z10;
                        ((t8) view).setChecked(z10);
                        t5Var.P1.O(true);
                        if (t5Var.e2) {
                            m3Var.requestFocus();
                            break;
                        } else {
                            m3Var2.requestFocus();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ o(vh.t5 t5Var, Context context, vh.k4 k4Var) {
        this.a = 3;
        this.b = t5Var;
        this.d = context;
        this.c = k4Var;
    }
}
