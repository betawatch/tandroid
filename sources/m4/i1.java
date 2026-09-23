package m4;

import j$.util.Objects;
import java.util.HashSet;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
