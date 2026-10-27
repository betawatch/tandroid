package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q1 {
    public static final String b;
    public final f9.t0 a;

    static {
        new q1(new HashSet());
        String str = e2.n0.a;
        b = Integer.toString(0, 36);
    }

    public q1(HashSet hashSet) {
        this.a = f9.t0.u(hashSet);
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
