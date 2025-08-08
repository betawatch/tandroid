package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class j {
    private static final j c = new j();
    private final boolean a;
    private final double b;

    private j() {
        this.a = false;
        this.b = Double.NaN;
    }

    public static j a() {
        return c;
    }

    private j(double d) {
        this.a = true;
        this.b = d;
    }

    public static j d(double d) {
        return new j(d);
    }

    public final double b() {
        if (!this.a) {
            throw new NoSuchElementException("No value present");
        }
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        boolean z = this.a;
        if (z && jVar.a) {
            if (Double.compare(this.b, jVar.b) == 0) {
                return true;
            }
        } else if (z == jVar.a) {
            return true;
        }
        return false;
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
