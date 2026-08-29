package i9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o0 extends n1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public o0(String str, long j10, long j11, String str2) {
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
        if (obj instanceof n1) {
            o0 o0Var = (o0) ((n1) obj);
            String str2 = o0Var.d;
            if (this.a == o0Var.a && this.b == o0Var.b && this.c.equals(o0Var.c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
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
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.a);
        sb2.append(", size=");
        sb2.append(this.b);
        sb2.append(", name=");
        sb2.append(this.c);
        sb2.append(", uuid=");
        return a4.w.q(sb2, this.d, "}");
    }
}
