// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mr9 {
    public static final mr9 b;
    public final ym5 a;

    static {
        v39 v39Var = new v39((byte) 6);
        v39Var.b = ym5.p(2, 1, 5);
        b = new mr9(v39Var);
    }

    public mr9(v39 v39Var) {
        this.a = (ym5) v39Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mr9) && this.a.equals(((mr9) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
