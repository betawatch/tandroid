package c2;

import android.util.SparseArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ s0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((x0) sparseArray.valueAt(i10)).getClass();
                    x0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                t0 t0Var = this.b;
                a1 a1Var = t0Var.i;
                if (a1Var.y == t0Var) {
                    a1Var.p();
                    break;
                }
                break;
        }
    }
}
