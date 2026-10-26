package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class w0 extends x1 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public w0(Double d, int i10, boolean z10, int i11, long j10, long j11) {
        this.a = d;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = j10;
        this.f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            Double d = this.a;
            if (d != null ? d.equals(((w0) x1Var).a) : ((w0) x1Var).a == null) {
                w0 w0Var = (w0) x1Var;
                if (this.b == w0Var.b && this.c == w0Var.c && this.d == w0Var.d && this.e == w0Var.e && this.f == w0Var.f) {
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
        return a1.g.r(sb2, this.f, "}");
    }
}
