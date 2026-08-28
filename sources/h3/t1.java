package h3;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class t1 extends IOException {
    public final boolean a;
    public final int b;

    public t1(String str, Throwable th, boolean z10, int i9) {
        super(str, th);
        this.a = z10;
        this.b = i9;
    }

    public static t1 a(String str, Exception exc) {
        return new t1(str, exc, true, 1);
    }

    public static t1 b(String str, Exception exc) {
        return new t1(str, exc, true, 4);
    }

    public static t1 c(String str) {
        return new t1(str, null, false, 1);
    }
}
