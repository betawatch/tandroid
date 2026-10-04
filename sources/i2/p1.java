package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 b;
    public final e9.m0 a;

    static {
        a6.m mVar = new a6.m(23);
        mVar.b = e9.m0.u(2, 1, 5);
        b = new p1(mVar);
    }

    public p1(a6.m mVar) {
        this.a = (e9.m0) mVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p1) && this.a.equals(((p1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
