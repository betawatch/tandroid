package gg;

import org.telegram.ui.k10;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ w(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                k10 k10Var = i0Var.A0;
                if (k10Var != null) {
                    ((sv) k10Var).i(false, null, i0Var.y0, i0Var.z0);
                    break;
                }
                break;
            default:
                i0 i0Var2 = this.b;
                i0Var2.getClass();
                i0Var2.c = f0.d;
                i0Var2.I.clear();
                int i10 = i0Var2.F0;
                if (i10 >= 0 && i10 < i0Var2.h()) {
                    i0Var2.m(i0Var2.F0);
                }
                i0Var2.Q();
                break;
        }
    }
}
