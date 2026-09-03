package f2;

import android.util.SparseArray;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b1 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((a1) sparseArray.valueAt(i10)).a.clear();
            i10++;
        }
    }

    public final a1 b(int i10) {
        SparseArray sparseArray = this.a;
        a1 a1Var = (a1) sparseArray.get(i10);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1();
        sparseArray.put(i10, a1Var2);
        return a1Var2;
    }
}
