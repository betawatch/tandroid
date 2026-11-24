// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class hj8 {
    public final String a;
    public final String b;
    public final int c;

    public hj8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hj8)) {
            return false;
        }
        hj8 hj8Var = (hj8) obj;
        return this.a.equals(hj8Var.a) && this.b.equals(hj8Var.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
