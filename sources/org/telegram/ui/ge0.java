package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ ge0(le0 le0Var, int i7) {
        this.a = i7;
        this.b = le0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ui.f fVar;
        qh.b[] bVarArr;
        int i7 = this.a;
        le0 le0Var = this.b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = le0Var.T) != null) {
                    fVar.c.d = 0L;
                    le0Var.U.c.d = 0L;
                    le0Var.i0();
                    break;
                }
                break;
            case 1:
                le0.f0(le0Var);
                break;
            case 2:
                le0Var.getClass();
                i9.l0(le0Var);
                break;
            case 3:
                le0.h0(le0Var);
                break;
            case 4:
                le0.e0(le0Var);
                break;
            case 5:
                le0Var.getClass();
                new eh0(le0Var.getParentActivity(), le0Var).show();
                break;
            case 6:
                le0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                le0Var.presentFragment(new i9(bundle));
                break;
            case 7:
                if (le0Var.getParentActivity() != null && (bVarArr = le0Var.L) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (le0Var.b.getWidth() - ((bVarArr[4].getX() + le0Var.G.getX()) + r0.getWidth()))) / org.telegram.messenger.g0.p;
                    hi.m3 m3Var = new hi.m3(le0Var.getParentActivity(), 3);
                    le0Var.Q = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-le0Var.M));
                    le0Var.Q.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    le0Var.Q.r(false);
                    le0Var.Q.k(true);
                    le0Var.Q.v(org.telegram.messenger.gd.M0(2131744066, null));
                    le0Var.Q.o(1.0f, (-width) + 7.33f);
                    le0Var.b.addView(le0Var.Q, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    hi.m3 m3Var2 = le0Var.Q;
                    m3Var2.r0 = new ge0(le0Var, 8);
                    m3Var2.d = 8000L;
                    m3Var2.x();
                    org.telegram.ui.Components.k30.r.b();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.E2(le0Var.Q);
                break;
        }
    }
}
