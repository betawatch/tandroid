package aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u0 extends s1 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public u0(int i10, long j10, String str, long j11, String str2) {
        this.a = j10;
        this.b = str;
        this.c = str2;
        this.d = j11;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            u0 u0Var = (u0) ((s1) obj);
            String str2 = u0Var.c;
            if (this.a == u0Var.a && this.b.equals(u0Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == u0Var.d && this.e == u0Var.e) {
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
        return ((hashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.e;
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
        return a1.g.n(this.e, "}", sb2);
    }
}
