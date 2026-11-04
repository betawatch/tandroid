package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import b8.uf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        TLRPC.WebPage webPage;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z10 = true;
        z10 = true;
        int i12 = 0;
        switch (i10) {
            case 0:
                k2 k2Var = (k2) obj3;
                p0 p0Var = (p0) view;
                u0 u0Var = p0Var.L;
                f60 F = f60.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, bd.a0(null, null, 2131748816, bd.x(u0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, bd.M0(2131747794, null), new b0(i12, (r9) obj, u0Var), false);
                F.l(R.drawable.msg_copy, bd.M0(2131751767, null), new b0(true ? 1 : 0, k2Var, p0Var), !u0Var.e);
                if (k2Var.N != h10.i(k2Var.O).e() && !k2Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, bd.M0(2131751599, null), new b0(i11, k2Var, u0Var), z10);
                F.Z();
                break;
            case 1:
                gi.x6 x6Var = (gi.x6) obj3;
                u10 u10Var = (u10) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (!(view instanceof org.telegram.ui.Cells.f7)) {
                    r31 G = x6Var.i2.G(i3 - 1);
                    if (G != null && G.d == 1) {
                        new gi.x6(x6Var.getContext(), true, x6Var, u10Var, e6Var).show();
                        break;
                    } else if (G != null && G.d == 2) {
                        x6Var.X1.b();
                        break;
                    } else if (G != null && G.d == 3) {
                        x6Var.h1();
                        break;
                    } else if (G != null && G.d == 4) {
                        x6Var.g1();
                        break;
                    }
                } else {
                    zi message = ((org.telegram.ui.Cells.f7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.z5.q(x6Var.a).v(x6Var);
                        if (x6Var.Z1 != null) {
                            org.telegram.messenger.w7.G(x6Var.a).f(x6Var.Z1.F0());
                            x6Var.Z1 = null;
                        }
                        if (message.w0 || message.x0) {
                            x6Var.Y1.a(message);
                            gi.x6 x6Var2 = x6Var.T1;
                            if (x6Var2 != null) {
                                x6Var2.dismiss();
                            }
                            x6Var.dismiss();
                            break;
                        } else {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                x6Var.Z1 = message;
                                org.telegram.messenger.z5.q(x6Var.a).a(S0, message, x6Var);
                                org.telegram.messenger.w7.G(x6Var.a).X(message.F0(), message, 1, 0);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                gi.m7 m7Var = (gi.m7) obj3;
                Context context = (Context) obj2;
                gi.y5 y5Var = (gi.y5) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.S1;
                org.telegram.ui.Cells.k3 k3Var2 = m7Var.R1;
                r31 G2 = m7Var.Q1.G(i3 - 1);
                if (G2 != null) {
                    if (G2.H(gi.k7.class) && (webPage = m7Var.Z1) != null && !gi.m7.g1(webPage)) {
                        ug.j2 j2Var = new ug.j2(context, m7Var.a);
                        ug.g0 g0Var = new ug.g0();
                        g0Var.c = k3Var2.d.getText().toString();
                        g0Var.b = m7Var.f2 ? k3Var.d.getText().toString() : null;
                        TLRPC.WebPage webPage2 = m7Var.Z1;
                        g0Var.d = webPage2;
                        g0Var.e = m7Var.h2;
                        g0Var.f = m7Var.g2;
                        ai.v2 v2Var = new ai.v2(m7Var, 29);
                        j2Var.H = g0Var;
                        int i13 = (webPage2 == null || (webPage2.photo == null && !zi.L4(webPage2.document))) ? 8 : 0;
                        ca0 ca0Var = j2Var.y;
                        ca0Var.setVisibility(i13);
                        j2Var.f.b(j2Var.a, g0Var, false);
                        j2Var.x.a(!g0Var.f, false);
                        ca0Var.a(!g0Var.e, false);
                        j2Var.I = v2Var;
                        j2Var.e.setImageDrawable(new gi.k3(y5Var, 9));
                        j2Var.show();
                        break;
                    } else if (G2.d == 2 && (view instanceof org.telegram.ui.Cells.q8)) {
                        boolean z11 = !m7Var.f2;
                        m7Var.f2 = z11;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        m7Var.Q1.O(true);
                        if (m7Var.f2) {
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
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                t80 t80Var = (t80) tVar.f3.get(i3);
                if (t80Var.e && !h10.o()) {
                    d2Var.showDialog(new vg.v0(d2Var, 10, true));
                    break;
                } else if (!uf.a(t80Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context2);
                    pVar.a = i3;
                    tVar.g3.w0(pVar);
                    uf.b(t80Var);
                    int i14 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i15 = 0; i15 < tVar.getChildCount(); i15++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i15);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    hs.e().k(hs.P4, 5, t80Var);
                    break;
                }
                break;
        }
    }
}
