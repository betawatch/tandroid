package k9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u0 extends v1 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public u0(Double d, int i10, boolean z4, int i11, long j10, long j11) {
        this.a = d;
        this.b = i10;
        this.c = z4;
        this.d = i11;
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
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return android.support.v4.media.a.q(sb, this.f, "}");
    }
}
