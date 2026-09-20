package i2;

import j$.util.Objects;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
