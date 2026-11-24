// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gj1 {
    public static final fj1 b = new fj1();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof gj1) {
            return this.a.equals(((gj1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof ej1) {
            return ((ej1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
