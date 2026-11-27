// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ag7 {
    public final SparseArray a;
    public px3 b;

    public ag7(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(px3 px3Var, int i, int i2) {
        int a = px3Var.a(i);
        SparseArray sparseArray = this.a;
        ag7 ag7Var = (ag7) sparseArray.get(a);
        if (ag7Var == null) {
            ag7Var = new ag7(1);
            sparseArray.put(px3Var.a(i), ag7Var);
        }
        if (i2 > i) {
            ag7Var.a(px3Var, i + 1, i2);
        } else {
            ag7Var.b = px3Var;
        }
    }
}
