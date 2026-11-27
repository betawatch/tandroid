// default package

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class i9a {
    public static final i9a b = new i9a(new HashSet());
    public static final String c;
    public final bp5 a;

    static {
        String str = gcc.a;
        c = "0";
    }

    public i9a(HashSet hashSet) {
        this.a = bp5.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i9a) {
            return this.a.equals(((i9a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
