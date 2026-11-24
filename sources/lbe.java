// default package

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class lbe {
    public static u63 a(i89 i89Var, String str, az8 az8Var, int i) {
        Map map = Collections.EMPTY_MAP;
        Uri d = jxe.d(str, az8Var.c);
        long j = az8Var.a;
        long j2 = az8Var.b;
        String a = i89Var.a();
        if (a == null) {
            a = jxe.d(((wg0) i89Var.b.get(0)).a, az8Var.c).toString();
        }
        String str2 = a;
        gre.l(d, "The uri must be set.");
        return new u63(d, 1, null, b69.h, j, j2, str2, i);
    }
}
