package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 b;
    public final f9.t0 a;

    static {
        rb.c cVar = new rb.c(27);
        cVar.b = f9.t0.t(2, 1, 5);
        b = new s1(cVar);
    }

    public s1(rb.c cVar) {
        this.a = (f9.t0) cVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s1) && this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
