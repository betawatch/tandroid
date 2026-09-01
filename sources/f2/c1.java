package f2;

import android.util.SparseArray;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
