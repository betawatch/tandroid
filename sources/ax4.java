// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ax4 {
    public static final ax4 b = new ax4(Float.POSITIVE_INFINITY);
    public final float a;

    public ax4(float f) {
        if (Float.isNaN(f) || f < 0.0f) {
            w26.j("epsY must be >= 0");
            throw null;
        }
        this.a = f;
    }
}
