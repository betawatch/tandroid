package c2;

import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i9) {
        this.a = i9;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((w0) sparseArray.valueAt(i9)).getClass();
                    w0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                s0 s0Var = this.b;
                z0 z0Var = s0Var.i;
                if (z0Var.y == s0Var) {
                    z0Var.p();
                    break;
                }
                break;
        }
    }
}
