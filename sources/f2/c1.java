package f2;

import android.util.SparseArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c1 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((b1) sparseArray.valueAt(i10)).a.clear();
            i10++;
        }
    }

    public final b1 b(int i10) {
        SparseArray sparseArray = this.a;
        b1 b1Var = (b1) sparseArray.get(i10);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1();
        sparseArray.put(i10, b1Var2);
        return b1Var2;
    }
}
