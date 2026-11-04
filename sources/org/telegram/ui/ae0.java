package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ee0 b;

    public /* synthetic */ ae0(ee0 ee0Var, int i3) {
        this.a = i3;
        this.b = ee0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        si.f fVar;
        rh.b[] bVarArr;
        int i3 = this.a;
        ee0 ee0Var = this.b;
        switch (i3) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = ee0Var.T) != null) {
                    fVar.c.d = 0L;
                    ee0Var.U.c.d = 0L;
                    ee0Var.i0();
                    break;
                }
                break;
            case 1:
                ee0.g0(ee0Var);
                break;
            case 2:
                ee0Var.getClass();
                h9.l0(ee0Var);
                break;
            case 3:
                ee0.h0(ee0Var);
                break;
            case 4:
                ee0.f0(ee0Var);
                break;
            case 5:
                org.telegram.messenger.g0.E2(ee0Var.Q);
                break;
            case 6:
                ee0Var.getClass();
                new vg0(ee0Var.getParentActivity(), ee0Var).show();
                break;
            case 7:
                ee0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ee0Var.presentFragment(new h9(bundle));
                break;
            default:
                if (ee0Var.getParentActivity() != null && (bVarArr = ee0Var.L) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (ee0Var.b.getWidth() - ((bVarArr[4].getX() + ee0Var.G.getX()) + r0.getWidth()))) / org.telegram.messenger.g0.p;
                    gi.l3 l3Var = new gi.l3(ee0Var.getParentActivity(), 3);
                    ee0Var.Q = l3Var;
                    l3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-ee0Var.M));
                    ee0Var.Q.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    ee0Var.Q.r(false);
                    ee0Var.Q.k(true);
                    ee0Var.Q.u(org.telegram.messenger.bd.M0(2131744311, null));
                    ee0Var.Q.o(1.0f, (-width) + 7.33f);
                    ee0Var.b.addView(ee0Var.Q, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    gi.l3 l3Var2 = ee0Var.Q;
                    l3Var2.r0 = new ae0(ee0Var, 5);
                    l3Var2.d = 8000L;
                    l3Var2.w();
                    org.telegram.ui.Components.v20.r.b();
                    break;
                }
                break;
        }
    }
}
