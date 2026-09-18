package n7;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        return a4.a.p("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
