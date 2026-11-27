// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
