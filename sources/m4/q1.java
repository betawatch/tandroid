package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class q1 {
    public static final String b;
    public final e9.y0 a;

    static {
        new q1(new HashSet());
        String str = e2.m0.a;
        b = Integer.toString(0, 36);
    }

    public q1(HashSet hashSet) {
        this.a = e9.y0.u(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1) {
            return this.a.equals(((q1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
