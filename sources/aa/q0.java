package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q0 extends p1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public q0(String str, long j10, long j11, String str2) {
        this.a = j10;
        this.b = j11;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            String str2 = q0Var.d;
            if (this.a == q0Var.a && this.b == q0Var.b && this.c.equals(q0Var.c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        long j11 = this.b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.a);
        sb2.append(", size=");
        sb2.append(this.b);
        sb2.append(", name=");
        sb2.append(this.c);
        sb2.append(", uuid=");
        return a1.g.s(sb2, this.d, "}");
    }
}
