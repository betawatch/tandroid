package c2;

import android.util.SparseArray;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    ((w0) sparseArray.valueAt(i10)).getClass();
                    w0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                t0 t0Var = this.b;
                z0 z0Var = t0Var.i;
                if (z0Var.y == t0Var) {
                    z0Var.p();
                    break;
                }
                break;
        }
    }
}
