// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class de3 {
    public static final de3 c = new de3(new ie7(18));
    public static final String d;
    public static final String e;
    public final int a = 0;
    public final int b = 0;

    static {
        String str = g8c.a;
        d = "1";
        e = "2";
    }

    public de3(ie7 ie7Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de3)) {
            return false;
        }
        de3 de3Var = (de3) obj;
        return this.a == de3Var.a && this.b == de3Var.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
