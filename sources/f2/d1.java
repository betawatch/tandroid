package f2;

import android.util.SparseArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d1 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((c1) sparseArray.valueAt(i10)).a.clear();
            i10++;
        }
    }

    public final c1 b(int i10) {
        SparseArray sparseArray = this.a;
        c1 c1Var = (c1) sparseArray.get(i10);
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1();
        sparseArray.put(i10, c1Var2);
        return c1Var2;
    }
}
