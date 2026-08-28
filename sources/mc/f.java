package mc;

import ie.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // mc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(he.b.a(a2));
        }
        return null;
    }

    @Override // mc.h
    public final char d() {
        return '&';
    }
}
