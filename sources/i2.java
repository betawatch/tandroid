// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
