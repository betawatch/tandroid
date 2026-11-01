package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class q1 {
    public static final String b;
    public final e9.y0 a;

    static {
        new q1(new HashSet());
        String str = e2.l0.a;
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
