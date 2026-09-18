package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class n1 {
    public static final String b;
    public final e9.m0 a;

    static {
        new n1(new HashSet());
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
    }

    public n1(HashSet hashSet) {
        this.a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return this.a.equals(((n1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
