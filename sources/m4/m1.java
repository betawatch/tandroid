package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
