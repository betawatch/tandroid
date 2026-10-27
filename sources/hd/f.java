package hd;

import ef.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // hd.h
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            return f(df.b.a(a2));
        }
        return null;
    }

    @Override // hd.h
    public final char d() {
        return '&';
    }
}
