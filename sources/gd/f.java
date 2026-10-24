package gd;

import df.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
