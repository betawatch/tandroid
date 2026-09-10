package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n1 {
    public static final n1 b;
    public final e9.m0 a;

    static {
        xa.c cVar = new xa.c(26);
        cVar.b = e9.m0.u(2, 1, 5);
        b = new n1(cVar);
    }

    public n1(xa.c cVar) {
        this.a = (e9.m0) cVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n1) && this.a.equals(((n1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
