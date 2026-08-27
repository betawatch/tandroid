package nc;

import java.util.regex.Pattern;
import je.p;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // nc.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(ie.b.a(a2));
        }
        return null;
    }

    @Override // nc.h
    public final char d() {
        return '&';
    }
}
