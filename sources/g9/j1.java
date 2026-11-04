package g9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 implements f9.t, Serializable {
    public final int a;

    public j1() {
        o.g(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // f9.t
    public final Object get() {
        return new ArrayList(this.a);
    }
}
