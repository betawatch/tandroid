package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u1 {
    public static final u1 b;
    public final e9.y0 a;

    static {
        a4.l lVar = new a4.l(20);
        lVar.b = e9.y0.t(2, 1, 5);
        b = new u1(lVar);
    }

    public u1(a4.l lVar) {
        this.a = (e9.y0) lVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u1) && this.a.equals(((u1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
