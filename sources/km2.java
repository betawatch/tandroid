// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class km2 extends uj5 {
    public final String b;
    public final String c;
    public final String d;

    public km2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || km2.class != obj.getClass()) {
            return false;
        }
        km2 km2Var = (km2) obj;
        return this.c.equals(km2Var.c) && this.b.equals(km2Var.b) && Objects.equals(this.d, km2Var.d);
    }

    public final int hashCode() {
        int j = ir2.j(ir2.j(527, 31, this.b), 31, this.c);
        String str = this.d;
        return j + (str != null ? str.hashCode() : 0);
    }

    @Override // uj5
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
