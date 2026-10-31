package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf0 b;

    public /* synthetic */ kf0(pf0 pf0Var, int i10) {
        this.a = i10;
        this.b = pf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gh.b[] bVarArr;
        int i10 = this.a;
        pf0 pf0Var = this.b;
        switch (i10) {
            case 0:
                if (Build.VERSION.SDK_INT < 31) {
                    pf0Var.getClass();
                    break;
                } else {
                    hi.f fVar = pf0Var.S;
                    if (fVar != null) {
                        fVar.c.d = 0L;
                        pf0Var.h0();
                        break;
                    }
                }
                break;
            case 1:
                pf0.e0(pf0Var);
                break;
            case 2:
                pf0Var.getClass();
                j9.k0(pf0Var);
                break;
            case 3:
                pf0.g0(pf0Var);
                break;
            case 4:
                pf0.d0(pf0Var);
                break;
            case 5:
                pf0Var.getClass();
                new gi0(pf0Var.getParentActivity(), pf0Var).show();
                break;
            case 6:
                pf0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                pf0Var.presentFragment(new j9(bundle));
                break;
            case 7:
                if (pf0Var.getParentActivity() != null && (bVarArr = pf0Var.K) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (pf0Var.b.getWidth() - ((bVarArr[4].getX() + pf0Var.F.getX()) + r0.getWidth()))) / org.telegram.messenger.i0.p;
                    vh.p2 p2Var = new vh.p2(pf0Var.getParentActivity(), 3);
                    pf0Var.P = p2Var;
                    p2Var.setTranslationY(org.telegram.messenger.i0.L(4.0f) + (-pf0Var.L));
                    pf0Var.P.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                    pf0Var.P.p(false);
                    pf0Var.P.i(true);
                    pf0Var.P.s(org.telegram.messenger.cd.L0(2131744327, null));
                    pf0Var.P.l(1.0f, (-width) + 7.33f);
                    pf0Var.b.addView(pf0Var.P, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    vh.p2 p2Var2 = pf0Var.P;
                    p2Var2.l0 = new kf0(pf0Var, 8);
                    p2Var2.d = 8000L;
                    p2Var2.u();
                    org.telegram.ui.Components.r30.r.b();
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.E2(pf0Var.P);
                break;
        }
    }
}
