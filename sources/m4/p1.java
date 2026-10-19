package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
