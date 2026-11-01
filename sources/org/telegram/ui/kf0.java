package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of0 b;

    public /* synthetic */ kf0(of0 of0Var, int i10) {
        this.a = i10;
        this.b = of0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hi.f fVar;
        gh.b[] bVarArr;
        int i10 = this.a;
        of0 of0Var = this.b;
        switch (i10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = of0Var.S) != null) {
                    fVar.c.d = 0L;
                    of0Var.T.c.d = 0L;
                    of0Var.i0();
                    break;
                }
                break;
            case 1:
                of0.f0(of0Var);
                break;
            case 2:
                of0Var.getClass();
                j9.l0(of0Var);
                break;
            case 3:
                of0.h0(of0Var);
                break;
            case 4:
                of0.e0(of0Var);
                break;
            case 5:
                of0Var.getClass();
                new ei0(of0Var.getParentActivity(), of0Var).show();
                break;
            case 6:
                of0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                of0Var.presentFragment(new j9(bundle));
                break;
            case 7:
                if (of0Var.getParentActivity() != null && (bVarArr = of0Var.K) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (of0Var.b.getWidth() - ((bVarArr[4].getX() + of0Var.F.getX()) + r0.getWidth()))) / org.telegram.messenger.i0.p;
                    vh.p2 p2Var = new vh.p2(of0Var.getParentActivity(), 3);
                    of0Var.P = p2Var;
                    p2Var.setTranslationY(org.telegram.messenger.i0.L(4.0f) + (-of0Var.L));
                    of0Var.P.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                    of0Var.P.p(false);
                    of0Var.P.i(true);
                    of0Var.P.s(org.telegram.messenger.dd.L0(2131744327, null));
                    of0Var.P.l(1.0f, (-width) + 7.33f);
                    of0Var.b.addView(of0Var.P, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    vh.p2 p2Var2 = of0Var.P;
                    p2Var2.l0 = new kf0(of0Var, 8);
                    p2Var2.d = 8000L;
                    p2Var2.u();
                    org.telegram.ui.Components.r30.r.b();
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.E2(of0Var.P);
                break;
        }
    }
}
