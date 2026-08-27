package c2;

import android.util.SparseArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ q0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((v0) sparseArray.valueAt(i10)).getClass();
                    v0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                r0 r0Var = this.b;
                y0 y0Var = r0Var.i;
                if (y0Var.y == r0Var) {
                    y0Var.p();
                    break;
                }
                break;
        }
    }
}
