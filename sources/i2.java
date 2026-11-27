// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class i2 {
    public static final i2 c;
    public static final i2 d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (u2.d) {
            d = null;
            c = null;
        } else {
            d = new i2(false, null);
            c = new i2(true, null);
        }
    }

    public i2(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
