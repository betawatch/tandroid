package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o1 implements d9.t, Serializable {
    public final int a;

    public o1() {
        s.f(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // d9.t
    public final Object get() {
        return new ArrayList(this.a);
    }
}
