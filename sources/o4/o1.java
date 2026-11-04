package o4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o1 {
    public static final String b;
    public final g9.t0 a;

    static {
        new o1(new HashSet());
        String str = g2.n0.a;
        b = Integer.toString(0, 36);
    }

    public o1(HashSet hashSet) {
        this.a = g9.t0.q(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o1) {
            return this.a.equals(((o1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
