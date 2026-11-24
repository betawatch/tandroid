// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
