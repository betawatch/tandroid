package f2;

import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f1 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i9 >= sparseArray.size()) {
                return;
            }
            ((e1) sparseArray.valueAt(i9)).a.clear();
            i9++;
        }
    }

    public final e1 b(int i9) {
        SparseArray sparseArray = this.a;
        e1 e1Var = (e1) sparseArray.get(i9);
        if (e1Var != null) {
            return e1Var;
        }
        e1 e1Var2 = new e1();
        sparseArray.put(i9, e1Var2);
        return e1Var2;
    }
}
