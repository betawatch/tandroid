package h9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class k1 implements g9.t, Serializable {
    public final int a;

    public k1() {
        o.g(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // g9.t
    public final Object get() {
        return new ArrayList(this.a);
    }
}
