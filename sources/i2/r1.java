package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class r1 {
    public static final r1 b;
    public final e9.y0 a;

    static {
        qb.c cVar = new qb.c(27);
        cVar.b = e9.y0.t(2, 1, 5);
        b = new r1(cVar);
    }

    public r1(qb.c cVar) {
        this.a = (e9.y0) cVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r1) && this.a.equals(((r1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
