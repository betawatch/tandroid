package h9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
