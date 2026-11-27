// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
