package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ he0(le0 le0Var, int i7) {
        this.a = i7;
        this.b = le0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri.f fVar;
        qh.b[] bVarArr;
        int i7 = this.a;
        le0 le0Var = this.b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = le0Var.S) != null) {
                    fVar.c.d = 0L;
                    le0Var.T.c.d = 0L;
                    le0Var.i0();
                    break;
                }
                break;
            case 1:
                le0.g0(le0Var);
                break;
            case 2:
                le0Var.getClass();
                i9.l0(le0Var);
                break;
            case 3:
                le0.h0(le0Var);
                break;
            case 4:
                le0.f0(le0Var);
                break;
            case 5:
                org.telegram.messenger.g0.E2(le0Var.P);
                break;
            case 6:
                le0Var.getClass();
                new ch0(le0Var.getParentActivity(), le0Var).show();
                break;
            case 7:
                le0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                le0Var.presentFragment(new i9(bundle));
                break;
            default:
                if (le0Var.getParentActivity() != null && (bVarArr = le0Var.K) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (le0Var.b.getWidth() - ((bVarArr[4].getX() + le0Var.F.getX()) + r0.getWidth()))) / org.telegram.messenger.g0.p;
                    fi.m3 m3Var = new fi.m3(le0Var.getParentActivity(), 3);
                    le0Var.P = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-le0Var.L));
                    le0Var.P.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    le0Var.P.r(false);
                    le0Var.P.k(true);
                    le0Var.P.u(org.telegram.messenger.id.M0(2131744301, null));
                    le0Var.P.o(1.0f, (-width) + 7.33f);
                    le0Var.b.addView(le0Var.P, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.m3 m3Var2 = le0Var.P;
                    m3Var2.q0 = new he0(le0Var, 5);
                    m3Var2.d = 8000L;
                    m3Var2.w();
                    org.telegram.ui.Components.a30.r.b();
                    break;
                }
                break;
        }
    }
}
