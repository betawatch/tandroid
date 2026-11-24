// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
