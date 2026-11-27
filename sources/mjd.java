// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
