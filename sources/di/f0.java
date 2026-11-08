package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.ua;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.x31;
import org.telegram.ui.w80;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        TLRPC.WebPage webPage;
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z9 = true;
        switch (i10) {
            case 0:
                g2 g2Var = (g2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.K;
                k60 F = k60.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, id.a0(null, null, 2131748809, id.x(s0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, id.M0(2131747787, null), new bi.a4(27, (p9) obj, s0Var), false);
                F.l(R.drawable.msg_copy, id.M0(2131751767, null), new bi.a4(28, g2Var, n0Var), !s0Var.e);
                if (g2Var.M != p10.i(g2Var.N).e() && !g2Var.f()) {
                    z9 = false;
                }
                F.l(R.drawable.msg_delete, id.M0(2131751599, null), new bi.a4(29, g2Var, s0Var), z9);
                F.Z();
                break;
            case 1:
                fi.w6 w6Var = (fi.w6) obj3;
                c20 c20Var = (c20) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (!(view instanceof org.telegram.ui.Cells.g7)) {
                    x31 G = w6Var.h2.G(i7 - 1);
                    if (G != null && G.d == 1) {
                        new fi.w6(w6Var.getContext(), true, w6Var, c20Var, f6Var).show();
                        break;
                    } else if (G != null && G.d == 2) {
                        w6Var.W1.b();
                        break;
                    } else if (G != null && G.d == 3) {
                        w6Var.h1();
                        break;
                    } else if (G != null && G.d == 4) {
                        w6Var.g1();
                        break;
                    }
                } else {
                    ij message = ((org.telegram.ui.Cells.g7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.z5.q(w6Var.a).v(w6Var);
                        if (w6Var.Y1 != null) {
                            org.telegram.messenger.w7.G(w6Var.a).f(w6Var.Y1.F0());
                            w6Var.Y1 = null;
                        }
                        if (message.w0 || message.x0) {
                            w6Var.X1.a(message);
                            fi.w6 w6Var2 = w6Var.S1;
                            if (w6Var2 != null) {
                                w6Var2.dismiss();
                            }
                            w6Var.dismiss();
                            break;
                        } else {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                w6Var.Y1 = message;
                                org.telegram.messenger.z5.q(w6Var.a).a(S0, message, w6Var);
                                org.telegram.messenger.w7.G(w6Var.a).W(message.F0(), message, 1, 0);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                fi.m7 m7Var = (fi.m7) obj3;
                Context context = (Context) obj2;
                fi.y5 y5Var = (fi.y5) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.R1;
                org.telegram.ui.Cells.k3 k3Var2 = m7Var.Q1;
                x31 G2 = m7Var.P1.G(i7 - 1);
                if (G2 != null) {
                    if (G2.H(fi.k7.class) && (webPage = m7Var.Y1) != null && !fi.m7.g1(webPage)) {
                        tg.i2 i2Var = new tg.i2(context, m7Var.a);
                        tg.h0 h0Var = new tg.h0();
                        h0Var.c = k3Var2.d.getText().toString();
                        h0Var.b = m7Var.e2 ? k3Var.d.getText().toString() : null;
                        TLRPC.WebPage webPage2 = m7Var.Y1;
                        h0Var.d = webPage2;
                        h0Var.e = m7Var.g2;
                        h0Var.f = m7Var.f2;
                        ai.i iVar = new ai.i(m7Var, 26);
                        i2Var.G = h0Var;
                        int i11 = (webPage2 == null || (webPage2.photo == null && !ij.L4(webPage2.document))) ? 8 : 0;
                        ha0 ha0Var = i2Var.y;
                        ha0Var.setVisibility(i11);
                        i2Var.f.b(i2Var.a, h0Var, false);
                        i2Var.x.a(!h0Var.f, false);
                        ha0Var.a(!h0Var.e, false);
                        i2Var.H = iVar;
                        i2Var.e.setImageDrawable(new fi.l3(y5Var, 9));
                        i2Var.show();
                        break;
                    } else if (G2.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                        boolean z10 = !m7Var.e2;
                        m7Var.e2 = z10;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        m7Var.P1.O(true);
                        if (m7Var.e2) {
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
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                w80 w80Var = (w80) tVar.e3.get(i7);
                if (w80Var.e && !p10.o()) {
                    f2Var.showDialog(new ug.w0(f2Var, 10, true));
                    break;
                } else if (!ua.a(w80Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context2);
                    pVar.a = i7;
                    tVar.f3.w0(pVar);
                    ua.b(w80Var);
                    int i12 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    qs.e().k(qs.P4, 5, w80Var);
                    break;
                }
                break;
        }
    }
}
