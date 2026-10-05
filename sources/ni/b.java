package ni;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
