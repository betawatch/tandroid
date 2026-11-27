// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bg7 {
    public final SparseArray a;
    public px3 b;

    public bg7(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(px3 px3Var, int i, int i2) {
        int a = px3Var.a(i);
        SparseArray sparseArray = this.a;
        bg7 bg7Var = (bg7) sparseArray.get(a);
        if (bg7Var == null) {
            bg7Var = new bg7(1);
            sparseArray.put(px3Var.a(i), bg7Var);
        }
        if (i2 > i) {
            bg7Var.a(px3Var, i + 1, i2);
        } else {
            bg7Var.b = px3Var;
        }
    }
}
