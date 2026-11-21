package c8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class ca {
    public static j2.m a(p2.m mVar, String str, p2.j jVar, int i7) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = h2.e.g(str, jVar.c);
        long j3 = jVar.a;
        long j10 = jVar.b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = h2.e.g(((p2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = b10;
        a8.la.k(g10, "The uri must be set.");
        return new j2.m(g10, 1, null, h9.y1.h, j3, j10, str2, i7);
    }
}
