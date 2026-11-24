// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
