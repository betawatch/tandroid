// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m69 {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public final void a() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ((l69) sparseArray.valueAt(i)).a.clear();
            i++;
        }
    }

    public final l69 b(int i) {
        SparseArray sparseArray = this.a;
        l69 l69Var = (l69) sparseArray.get(i);
        if (l69Var != null) {
            return l69Var;
        }
        l69 l69Var2 = new l69();
        sparseArray.put(i, l69Var2);
        return l69Var2;
    }
}
