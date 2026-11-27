// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
