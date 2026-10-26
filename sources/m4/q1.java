package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
