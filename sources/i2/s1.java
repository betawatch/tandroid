package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 b;
    public final e9.y0 a;

    static {
        a6.m mVar = new a6.m(22);
        mVar.b = e9.y0.t(2, 1, 5);
        b = new s1(mVar);
    }

    public s1(a6.m mVar) {
        this.a = (e9.y0) mVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s1) && this.a.equals(((s1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
