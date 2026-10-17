package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class q1 {
    public static final q1 b;
    public final e9.y0 a;

    static {
        a6.m mVar = new a6.m(27);
        mVar.b = e9.y0.t(2, 1, 5);
        b = new q1(mVar);
    }

    public q1(a6.m mVar) {
        this.a = (e9.y0) mVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q1) && this.a.equals(((q1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
