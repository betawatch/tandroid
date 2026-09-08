package hg;

import org.telegram.ui.o10;
import org.telegram.ui.xv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                o10 o10Var = i0Var.A0;
                if (o10Var != null) {
                    ((xv) o10Var).i(false, null, i0Var.y0, i0Var.z0);
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
