package g9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 extends p1 {
    public final String a;
    public final String b;
    public final long c;

    public q0(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.a.equals(q0Var.a) && this.b.equals(q0Var.b) && this.c == q0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j10 = this.c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.a);
        sb2.append(", code=");
        sb2.append(this.b);
        sb2.append(", address=");
        return aa.d.q(sb2, this.c, "}");
    }
}
