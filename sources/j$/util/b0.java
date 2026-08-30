package j$.util;

/* loaded from: classes2.dex */
public final class b0 {
    public static final b0 c = new b0();
    public final boolean a;
    public final double b;

    public b0() {
        this.a = false;
        this.b = Double.NaN;
    }

    public b0(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        boolean z4 = b0Var.a;
        boolean z10 = this.a;
        return (z10 && z4) ? Double.compare(this.b, b0Var.b) == 0 : z10 == z4;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalDouble[" + this.b + "]";
        }
        return "OptionalDouble.empty";
    }
}
