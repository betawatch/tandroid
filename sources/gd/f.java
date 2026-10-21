package gd;

import df.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
