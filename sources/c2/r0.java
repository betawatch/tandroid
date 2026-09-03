package c2;

import android.util.SparseArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
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
                s0 s0Var = this.b;
                y0 y0Var = s0Var.i;
                if (y0Var.y == s0Var) {
                    y0Var.p();
                    break;
                }
                break;
        }
    }
}
