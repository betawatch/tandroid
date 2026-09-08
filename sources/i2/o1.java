package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o1 {
    public static final o1 b;
    public final e9.m0 a;

    static {
        a6.i iVar = new a6.i(24);
        iVar.b = e9.m0.u(2, 1, 5);
        b = new o1(iVar);
    }

    public o1(a6.i iVar) {
        this.a = (e9.m0) iVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o1) && this.a.equals(((o1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
