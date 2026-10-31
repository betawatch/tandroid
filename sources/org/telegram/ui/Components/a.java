package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ a(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        g0 g0Var = this.b;
        switch (i10) {
            case 0:
                vh.p2 p2Var = g0Var.t2;
                if (p2Var != null) {
                    p2Var.e(true);
                    g0Var.t2 = null;
                }
                vh.p2 p2Var2 = new vh.p2(g0Var.getContext(), 1);
                g0Var.t2 = p2Var2;
                p2Var2.r();
                g0Var.t2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                g0Var.t2.q(20.0f);
                vh.p2 p2Var3 = g0Var.t2;
                float L = org.telegram.messenger.i0.L(12.0f);
                float L2 = org.telegram.messenger.i0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.25f, -16777216);
                Paint paint = p2Var3.F;
                p2Var3.i0 = L;
                p2Var3.j0 = L2;
                p2Var3.k0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                g0Var.t2.s(org.telegram.messenger.cd.L0(2131755000, null));
                g0Var.t2.l(0.5f, 0.0f);
                vh.p2 p2Var4 = g0Var.t2;
                p2Var4.d = 8000L;
                g0Var.b.addView(p2Var4, w7.b6.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                g0Var.t2.u();
                g0Var.w1();
                break;
            case 1:
                if (!g0Var.C2) {
                    g0Var.v2.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (g0Var.C2) {
                    g0Var.u2.setVisibility(8);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.i0.J3(g0Var.s2.d);
                break;
            default:
                g0Var.q1(0, 0, false);
                g0Var.dismiss();
                break;
        }
    }
}
