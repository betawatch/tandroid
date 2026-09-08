package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class m1 {
    public static final String b;
    public final e9.m0 a;

    static {
        new m1(new HashSet());
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
    }

    public m1(HashSet hashSet) {
        this.a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            return this.a.equals(((m1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
