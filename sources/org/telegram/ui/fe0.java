package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public /* synthetic */ fe0(je0 je0Var, int i7) {
        this.a = i7;
        this.b = je0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri.f fVar;
        qh.b[] bVarArr;
        int i7 = this.a;
        je0 je0Var = this.b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = je0Var.S) != null) {
                    fVar.c.d = 0L;
                    je0Var.T.c.d = 0L;
                    je0Var.i0();
                    break;
                }
                break;
            case 1:
                je0.g0(je0Var);
                break;
            case 2:
                je0Var.getClass();
                i9.l0(je0Var);
                break;
            case 3:
                je0.h0(je0Var);
                break;
            case 4:
                je0.f0(je0Var);
                break;
            case 5:
                org.telegram.messenger.g0.E2(je0Var.P);
                break;
            case 6:
                je0Var.getClass();
                new ah0(je0Var.getParentActivity(), je0Var).show();
                break;
            case 7:
                je0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                je0Var.presentFragment(new i9(bundle));
                break;
            default:
                if (je0Var.getParentActivity() != null && (bVarArr = je0Var.K) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (je0Var.b.getWidth() - ((bVarArr[4].getX() + je0Var.F.getX()) + r0.getWidth()))) / org.telegram.messenger.g0.p;
                    fi.m3 m3Var = new fi.m3(je0Var.getParentActivity(), 3);
                    je0Var.P = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-je0Var.L));
                    je0Var.P.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    je0Var.P.r(false);
                    je0Var.P.k(true);
                    je0Var.P.u(org.telegram.messenger.hd.M0(2131744302, null));
                    je0Var.P.o(1.0f, (-width) + 7.33f);
                    je0Var.b.addView(je0Var.P, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.m3 m3Var2 = je0Var.P;
                    m3Var2.q0 = new fe0(je0Var, 5);
                    m3Var2.d = 8000L;
                    m3Var2.w();
                    org.telegram.ui.Components.z20.r.b();
                    break;
                }
                break;
        }
    }
}
