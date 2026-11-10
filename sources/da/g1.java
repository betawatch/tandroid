package da;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g1 extends l2 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public g1(Double d, int i7, boolean z9, int i10, long j3, long j10) {
        this.a = d;
        this.b = i7;
        this.c = z9;
        this.d = i10;
        this.e = j3;
        this.f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            Double d = this.a;
            if (d != null ? d.equals(((g1) l2Var).a) : ((g1) l2Var).a == null) {
                g1 g1Var = (g1) l2Var;
                if (this.b == g1Var.b && this.c == g1Var.c && this.d == g1Var.d && this.e == g1Var.e && this.f == g1Var.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j3 = this.e;
        long j10 = this.f;
        return ((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
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
        return a8.p0.r(sb2, this.f, "}");
    }
}
