package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
