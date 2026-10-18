package n7;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        return a1.g.p("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
