package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
