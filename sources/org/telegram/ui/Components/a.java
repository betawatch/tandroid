package org.telegram.ui.Components;

import android.graphics.Paint;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ a(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        g0 g0Var = this.b;
        switch (i7) {
            case 0:
                fi.m3 m3Var = g0Var.t2;
                if (m3Var != null) {
                    m3Var.f(true);
                    g0Var.t2 = null;
                }
                fi.m3 m3Var2 = new fi.m3(g0Var.getContext(), 1);
                g0Var.t2 = m3Var2;
                m3Var2.t();
                g0Var.t2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                g0Var.t2.s(20.0f);
                fi.m3 m3Var3 = g0Var.t2;
                float L = org.telegram.messenger.g0.L(12.0f);
                float L2 = org.telegram.messenger.g0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                Paint paint = m3Var3.F;
                m3Var3.i0 = L;
                m3Var3.j0 = L2;
                m3Var3.k0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                g0Var.t2.u(org.telegram.messenger.hd.M0(2131755000, null));
                g0Var.t2.o(0.5f, 0.0f);
                fi.m3 m3Var4 = g0Var.t2;
                m3Var4.d = 8000L;
                g0Var.b.addView(m3Var4, c8.ha.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                g0Var.t2.w();
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
                org.telegram.messenger.g0.K3(g0Var.s2.d);
                break;
            default:
                g0Var.q1(0, 0, false);
                g0Var.dismiss();
                break;
        }
    }
}
