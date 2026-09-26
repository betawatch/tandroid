package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
