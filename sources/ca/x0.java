package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x0 extends d2 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public x0(String str, String str2, long j10, long j11) {
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
        if (obj instanceof d2) {
            x0 x0Var = (x0) ((d2) obj);
            String str2 = x0Var.d;
            if (this.a == x0Var.a && this.b == x0Var.b && this.c.equals(x0Var.c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
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
