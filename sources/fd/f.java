package fd;

import cf.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // fd.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(bf.b.a(a2));
        }
        return null;
    }

    @Override // fd.h
    public final char d() {
        return '&';
    }
}
