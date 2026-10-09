package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 b;
    public final e9.m0 a;

    static {
        a6.i iVar = new a6.i(25, false);
        iVar.b = e9.m0.u(2, 1, 5);
        b = new p1(iVar);
    }

    public p1(a6.i iVar) {
        this.a = (e9.m0) iVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p1) && this.a.equals(((p1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
