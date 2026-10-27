package f9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j1 implements e9.t, Serializable {
    public final int a;

    public j1() {
        o.f(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // e9.t
    public final Object get() {
        return new ArrayList(this.a);
    }
}
