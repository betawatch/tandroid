// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class cz4 {
    public static final cz4 b = new cz4(Float.POSITIVE_INFINITY);
    public final float a;

    public cz4(float f) {
        if (Float.isNaN(f) || f < 0.0f) {
            u36.j("epsY must be >= 0");
            throw null;
        }
        this.a = f;
    }
}
