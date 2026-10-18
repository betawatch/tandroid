package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o1 implements d9.u, Serializable {
    public final int a;

    public o1() {
        s.f(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // d9.u
    public final Object get() {
        return new ArrayList(this.a);
    }
}
