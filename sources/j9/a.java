package j9;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
