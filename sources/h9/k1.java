package h9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
