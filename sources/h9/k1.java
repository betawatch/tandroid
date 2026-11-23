package h9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
