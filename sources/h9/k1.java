package h9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class k1 implements g9.u, Serializable {
    public final int a;

    public k1() {
        o.g(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // g9.u
    public final Object get() {
        return new ArrayList(this.a);
    }
}
