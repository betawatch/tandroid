package ed;

import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
