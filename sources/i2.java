// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
