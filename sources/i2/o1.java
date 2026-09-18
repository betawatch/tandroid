package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class o1 {
    public static final o1 b;
    public final e9.m0 a;

    static {
        a4.m mVar = new a4.m(19);
        mVar.b = e9.m0.u(2, 1, 5);
        b = new o1(mVar);
    }

    public o1(a4.m mVar) {
        this.a = (e9.m0) mVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o1) && this.a.equals(((o1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
