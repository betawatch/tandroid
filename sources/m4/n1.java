package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
