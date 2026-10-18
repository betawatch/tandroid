package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
