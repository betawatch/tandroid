package g9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u0 extends v1 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public u0(Double d, int i9, boolean z10, int i10, long j10, long j11) {
        this.a = d;
        this.b = i9;
        this.c = z10;
        this.d = i10;
        this.e = j10;
        this.f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.a;
            if (d != null ? d.equals(((u0) v1Var).a) : ((u0) v1Var).a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.b == u0Var.b && this.c == u0Var.c && this.d == u0Var.d && this.e == u0Var.e && this.f == u0Var.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j10 = this.e;
        long j11 = this.f;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.b);
        sb2.append(", proximityOn=");
        sb2.append(this.c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return aa.d.q(sb2, this.f, "}");
    }
}
