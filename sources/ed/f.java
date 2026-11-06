package ed;

import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // ed.h
    public final p b() {
        String a10 = a(e);
        if (a10 != null) {
            return f(jf.b.a(a10));
        }
        return null;
    }

    @Override // ed.h
    public final char d() {
        return '&';
    }
}
