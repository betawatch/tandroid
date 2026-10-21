package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
