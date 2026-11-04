package bd;

import gf.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // bd.h
    public final p b() {
        String a10 = a(e);
        if (a10 != null) {
            return f(ff.b.a(a10));
        }
        return null;
    }

    @Override // bd.h
    public final char d() {
        return '&';
    }
}
