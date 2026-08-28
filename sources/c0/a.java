package c0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public static final a c;
    public static final a d;
    public final boolean a;
    public final Throwable b;

    static {
        if (h.d) {
            d = null;
            c = null;
        } else {
            d = new a(null, false);
            c = new a(null, true);
        }
    }

    public a(Throwable th, boolean z10) {
        this.a = z10;
        this.b = th;
    }
}
