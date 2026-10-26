package hd;

import ef.p;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
