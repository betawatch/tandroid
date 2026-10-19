package oi;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class b {
    public static final b c = new b(Float.POSITIVE_INFINITY);
    public final float a;
    public final float b;

    public b(float f7) {
        if (Float.isNaN(Float.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("epsX must be >= 0");
        }
        if (Float.isNaN(f7) || f7 < 0.0f) {
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        this.a = Float.POSITIVE_INFINITY;
        this.b = f7;
    }
}
