package da;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c1 extends g2 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public c1(String str, int i7, String str2, long j3, long j10) {
        this.a = j3;
        this.b = str;
        this.c = str2;
        this.d = j10;
        this.e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            c1 c1Var = (c1) ((g2) obj);
            String str2 = c1Var.c;
            if (this.a == c1Var.a && this.b.equals(c1Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == c1Var.d && this.e == c1Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.a;
        int hashCode = (((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.d;
        return ((hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.e;
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
        return a8.p0.n(this.e, "}", sb2);
    }
}
