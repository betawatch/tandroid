// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class f90 extends tz2 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public f90(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tz2) {
            tz2 tz2Var = (tz2) obj;
            Double d = this.a;
            if (d != null ? d.equals(((f90) tz2Var).a) : ((f90) tz2Var).a == null) {
                f90 f90Var = (f90) tz2Var;
                if (this.b == f90Var.b && this.c == f90Var.c && this.d == f90Var.d && this.e == f90Var.e && this.f == f90Var.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
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
        return qu6.p(sb, this.f, "}");
    }
}
