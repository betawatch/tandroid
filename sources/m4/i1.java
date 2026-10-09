package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i1 {
    public static final String b;
    public final e9.m0 a;

    static {
        new i1(new HashSet());
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
    }

    public i1(HashSet hashSet) {
        this.a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            return this.a.equals(((i1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
