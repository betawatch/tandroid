package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class u0 implements d9.j, Serializable {
    public final int a;

    public u0() {
        q.e(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // d9.j
    public final Object get() {
        return new ArrayList(this.a);
    }
}
