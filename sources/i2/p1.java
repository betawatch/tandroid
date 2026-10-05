package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
