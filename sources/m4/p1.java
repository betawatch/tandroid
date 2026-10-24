package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class p1 {
    public static final String b;
    public final e9.y0 a;

    static {
        new p1(new HashSet());
        String str = e2.m0.a;
        b = Integer.toString(0, 36);
    }

    public p1(HashSet hashSet) {
        this.a = e9.y0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p1) {
            return this.a.equals(((p1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
