// default package

import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
