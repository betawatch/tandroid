package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
