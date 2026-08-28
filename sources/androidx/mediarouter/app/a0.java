package androidx.mediarouter.app;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 {
    public final Object a;
    public final int b;

    public a0(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else {
            if (!(obj instanceof c2.a0)) {
                throw new IllegalArgumentException();
            }
            this.b = 2;
        }
    }
}
