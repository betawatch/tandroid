package b7;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h implements Serializable {
    public final Object a;

    public h(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return b.h(this.a, ((h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return android.support.v4.media.a.o("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
