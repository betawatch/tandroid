// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class b44 extends wp5 {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // wp5
    public final yi6 b() {
        String a = a(e);
        if (a != null) {
            return e(di5.a(a));
        }
        return null;
    }

    @Override // wp5
    public final char c() {
        return '&';
    }
}
