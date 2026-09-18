package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class u0 implements d9.i, Serializable {
    public final int a;

    public u0() {
        q.e(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // d9.i
    public final Object get() {
        return new ArrayList(this.a);
    }
}
