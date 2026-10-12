package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 b;
    public final e9.y0 a;

    static {
        qb.c cVar = new qb.c(23);
        cVar.b = e9.y0.t(2, 1, 5);
        b = new s1(cVar);
    }

    public s1(qb.c cVar) {
        this.a = (e9.y0) cVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s1) && this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
