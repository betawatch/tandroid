// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k49 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ((j49) sparseArray.valueAt(i)).a.clear();
            i++;
        }
    }

    public final j49 b(int i) {
        SparseArray sparseArray = this.a;
        j49 j49Var = (j49) sparseArray.get(i);
        if (j49Var != null) {
            return j49Var;
        }
        j49 j49Var2 = new j49();
        sparseArray.put(i, j49Var2);
        return j49Var2;
    }
}
