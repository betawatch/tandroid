package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class o1 {
    public static final o1 b;
    public final e9.m0 a;

    static {
        android.support.v4.media.c cVar = new android.support.v4.media.c(18);
        cVar.b = e9.m0.u(2, 1, 5);
        b = new o1(cVar);
    }

    public o1(android.support.v4.media.c cVar) {
        this.a = (e9.m0) cVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o1) && this.a.equals(((o1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
