package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class h1 {
    public static final String b;
    public final e9.m0 a;

    static {
        new h1(new HashSet());
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
    }

    public h1(HashSet hashSet) {
        this.a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            return this.a.equals(((h1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
