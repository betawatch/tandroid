package l2;

import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o1 {
    public static final o1 b;
    public final h9.t0 a;

    static {
        ia.d dVar = new ia.d(7);
        dVar.b = h9.t0.p(2, 1, 5);
        b = new o1(dVar);
    }

    public o1(ia.d dVar) {
        this.a = (h9.t0) dVar.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o1) && this.a.equals(((o1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
