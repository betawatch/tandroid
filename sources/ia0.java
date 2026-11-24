// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ia0 extends kj9 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public ia0(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            fvc.f("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            fvc.f("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            fvc.f("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kj9)) {
            return false;
        }
        ia0 ia0Var = (ia0) ((kj9) obj);
        return this.b.equals(ia0Var.b) && this.c.equals(ia0Var.c) && this.d.equals(ia0Var.d) && this.e.equals(ia0Var.e) && this.f == ia0Var.f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return ls6.p(sb, this.f, "}");
    }
}
