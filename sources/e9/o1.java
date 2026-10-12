package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
