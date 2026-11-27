// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
