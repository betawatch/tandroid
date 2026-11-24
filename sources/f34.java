// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f34 extends tn5 {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override // tn5
    public final tg6 b() {
        String a = a(e);
        if (a != null) {
            return e(bg5.a(a));
        }
        return null;
    }

    @Override // tn5
    public final char c() {
        return '&';
    }
}
