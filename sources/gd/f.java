package gd;

import df.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // gd.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(cf.b.a(a2));
        }
        return null;
    }

    @Override // gd.h
    public final char d() {
        return '&';
    }
}
