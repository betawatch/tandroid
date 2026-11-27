// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class gz4 {
    public static final gz4 b = new gz4(Float.POSITIVE_INFINITY);
    public final float a;

    public gz4(float f) {
        if (Float.isNaN(f) || f < 0.0f) {
            lq5.j("epsY must be >= 0");
            throw null;
        }
        this.a = f;
    }
}
