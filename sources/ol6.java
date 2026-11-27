// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ol6 {
    public static final ol6 j = new ol6(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final ol6 k = new ol6(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final ol6 l = new ol6(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final ol6 m = new ol6(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;

    public ol6(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d5;
        this.b = d6;
        this.c = d7;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d8;
        this.i = d9;
    }

    public static ol6 a(ByteBuffer byteBuffer) {
        double d = zpe.d(byteBuffer);
        double d2 = zpe.d(byteBuffer);
        double c = zpe.c(byteBuffer);
        return new ol6(d, d2, zpe.d(byteBuffer), zpe.d(byteBuffer), c, zpe.c(byteBuffer), zpe.c(byteBuffer), zpe.d(byteBuffer), zpe.d(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        aqe.b(byteBuffer, this.d);
        aqe.b(byteBuffer, this.e);
        aqe.a(byteBuffer, this.a);
        aqe.b(byteBuffer, this.f);
        aqe.b(byteBuffer, this.g);
        aqe.a(byteBuffer, this.b);
        aqe.b(byteBuffer, this.h);
        aqe.b(byteBuffer, this.i);
        aqe.a(byteBuffer, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol6.class != obj.getClass()) {
            return false;
        }
        ol6 ol6Var = (ol6) obj;
        return Double.compare(ol6Var.d, this.d) == 0 && Double.compare(ol6Var.e, this.e) == 0 && Double.compare(ol6Var.f, this.f) == 0 && Double.compare(ol6Var.g, this.g) == 0 && Double.compare(ol6Var.h, this.h) == 0 && Double.compare(ol6Var.i, this.i) == 0 && Double.compare(ol6Var.a, this.a) == 0 && Double.compare(ol6Var.b, this.b) == 0 && Double.compare(ol6Var.c, this.c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        int i5 = (i4 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        int i7 = (i6 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (i7 * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.a + ", v=" + this.b + ", w=" + this.c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f + ", d=" + this.g + ", tx=" + this.h + ", ty=" + this.i + '}';
    }
}
