package j9;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class a {
    public static final a c;
    public static final a d;
    public final boolean a;
    public final Throwable b;

    static {
        if (o.d) {
            d = null;
            c = null;
        } else {
            d = new a(null, false);
            c = new a(null, true);
        }
    }

    public a(Throwable th2, boolean z10) {
        this.a = z10;
        this.b = th2;
    }
}
