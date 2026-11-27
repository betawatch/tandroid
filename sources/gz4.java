// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
