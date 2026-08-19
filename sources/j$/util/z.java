package j$.util;

/* loaded from: classes2.dex */
public final class z {
    public static final z c = new z();
    public final boolean a;
    public final double b;

    public z() {
        this.a = false;
        this.b = Double.NaN;
    }

    public z(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        boolean z = this.a;
        return (z && zVar.a) ? Double.compare(this.b, zVar.b) == 0 : z == zVar.a;
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
