package gg;

import org.telegram.ui.q10;
import org.telegram.ui.yv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                q10 q10Var = i0Var.A0;
                if (q10Var != null) {
                    ((yv) q10Var).i(false, null, i0Var.y0, i0Var.z0);
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
