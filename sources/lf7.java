// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lf7 extends fs5 {
    public final long e;
    public final ArrayList f;
    public final ArrayList g;

    public lf7(int i, long j) {
        super(i, (byte) 1);
        this.e = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override // fs5
    public final String toString() {
        return fs5.e(this.b) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }

    public final lf7 u(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            lf7 lf7Var = (lf7) arrayList.get(i2);
            if (lf7Var.b == i) {
                return lf7Var;
            }
        }
        return null;
    }

    public final mf7 v(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mf7 mf7Var = (mf7) arrayList.get(i2);
            if (mf7Var.b == i) {
                return mf7Var;
            }
        }
        return null;
    }
}
