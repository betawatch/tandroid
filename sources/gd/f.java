package gd;

import df.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
