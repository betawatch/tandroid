package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a(e0 e0Var, int i3) {
        this.a = i3;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        e0 e0Var = this.b;
        switch (i3) {
            case 0:
                gi.l3 l3Var = e0Var.u2;
                if (l3Var != null) {
                    l3Var.f(true);
                    e0Var.u2 = null;
                }
                gi.l3 l3Var2 = new gi.l3(e0Var.getContext(), 1);
                e0Var.u2 = l3Var2;
                l3Var2.t();
                e0Var.u2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                e0Var.u2.s(20.0f);
                gi.l3 l3Var3 = e0Var.u2;
                float L = org.telegram.messenger.g0.L(12.0f);
                float L2 = org.telegram.messenger.g0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                Paint paint = l3Var3.G;
                l3Var3.j0 = L;
                l3Var3.k0 = L2;
                l3Var3.l0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                e0Var.u2.u(org.telegram.messenger.bd.M0(2131755000, null));
                e0Var.u2.o(0.5f, 0.0f);
                gi.l3 l3Var4 = e0Var.u2;
                l3Var4.d = 8000L;
                e0Var.b.addView(l3Var4, b8.mf.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                e0Var.u2.w();
                e0Var.w1();
                break;
            case 1:
                if (!e0Var.D2) {
                    e0Var.w2.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (e0Var.D2) {
                    e0Var.v2.setVisibility(8);
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.g0.K3(e0Var.t2.d);
                break;
            default:
                e0Var.q1(0, 0, false);
                e0Var.dismiss();
                break;
        }
    }
}
