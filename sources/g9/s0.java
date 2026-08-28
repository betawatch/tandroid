package g9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 extends q1 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public s0(long j10, String str, String str2, long j11, int i9) {
        this.a = j10;
        this.b = str;
        this.c = str2;
        this.d = j11;
        this.e = i9;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            s0 s0Var = (s0) ((q1) obj);
            String str2 = s0Var.c;
            if (this.a == s0Var.a && this.b.equals(s0Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == s0Var.d && this.e == s0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.d;
        return this.e ^ ((hashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.a);
        sb2.append(", symbol=");
        sb2.append(this.b);
        sb2.append(", file=");
        sb2.append(this.c);
        sb2.append(", offset=");
        sb2.append(this.d);
        sb2.append(", importance=");
        return aa.d.l(this.e, "}", sb2);
    }
}
