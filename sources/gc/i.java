package gc;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends Exception {
    public final g a;

    public i(String str) {
        super(str);
        this.a = g.f;
    }

    public final g a() {
        return this.a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.a = g.n;
    }
}
