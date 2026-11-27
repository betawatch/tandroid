// default package

import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class he9 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof ge9) {
            return ((ge9) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof he9) {
            return ur5.a(this.a, ((he9) obj).a);
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
        if (obj instanceof ge9) {
            return ((ge9) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
