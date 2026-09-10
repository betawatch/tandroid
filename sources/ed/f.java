package ed;

import bf.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // ed.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(af.b.a(a2));
        }
        return null;
    }

    @Override // ed.h
    public final char d() {
        return '&';
    }
}
