package ed;

import java.util.regex.Pattern;
import kf.p;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
