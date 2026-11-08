package ed;

import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
