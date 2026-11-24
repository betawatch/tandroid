// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ij2 {
    public final String a;
    public final String b;

    public ij2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ij2)) {
            return false;
        }
        ij2 ij2Var = (ij2) obj;
        return this.a.equals(ij2Var.a) && this.b.equals(ij2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
