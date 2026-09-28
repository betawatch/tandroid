package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
