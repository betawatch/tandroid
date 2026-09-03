package dg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v1 {
    public double a;
    public double b;

    public v1(double d, double d10) {
        this.a = d;
        this.b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
