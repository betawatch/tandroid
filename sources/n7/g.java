package n7;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class g implements Serializable {
    public final Object a;

    public g(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return a.h(this.a, ((g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return a4.a.q("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
