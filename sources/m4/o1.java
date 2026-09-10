package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o1 {
    public static final String b;
    public final e9.m0 a;

    static {
        new o1(new HashSet());
        String str = e2.d0.a;
        b = Integer.toString(0, 36);
    }

    public o1(HashSet hashSet) {
        this.a = e9.m0.v(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o1) {
            return this.a.equals(((o1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
