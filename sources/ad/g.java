package ad;

import java.io.Serializable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.i.a(this.a, ((g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof f) {
            return ((f) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
