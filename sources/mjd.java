// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class mjd implements Serializable {
    public final Object a;

    public mjd(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mjd) {
            return y4f.a(this.a, ((mjd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return qd4.y("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
