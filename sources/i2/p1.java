package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 b;
    public final e9.m0 a;

    static {
        a4.m mVar = new a4.m(19);
        mVar.b = e9.m0.u(2, 1, 5);
        b = new p1(mVar);
    }

    public p1(a4.m mVar) {
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
