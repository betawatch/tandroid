package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class B {
    private static final B c = new B();
    private final boolean a;
    private final double b;

    private B() {
        this.a = false;
        this.b = Double.NaN;
    }

    public static B a() {
        return c;
    }

    private B(double d) {
        this.a = true;
        this.b = d;
    }

    public static B d(double d) {
        return new B(d);
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
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        boolean z = this.a;
        if (z && b.a) {
            if (Double.compare(this.b, b.b) == 0) {
                return true;
            }
        } else if (z == b.a) {
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
