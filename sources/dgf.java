// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class dgf {
    public static final dgf c;
    public static final dgf d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (lgf.d) {
            d = null;
            c = null;
        } else {
            d = new dgf(false, null);
            c = new dgf(true, null);
        }
    }

    public dgf(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
