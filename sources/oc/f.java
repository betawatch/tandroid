package oc;

import java.util.regex.Pattern;
import le.p;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // oc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(ke.b.a(a2));
        }
        return null;
    }

    @Override // oc.h
    public final char d() {
        return '&';
    }
}
