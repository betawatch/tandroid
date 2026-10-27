package a8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class vd {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri g7 = e2.e.g(str, jVar.c);
        long j10 = jVar.a;
        long j11 = jVar.b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.e.g(((m2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = b10;
        yb.l(g7, "The uri must be set.");
        return new g2.m(g7, 1, null, f9.x1.h, j10, j11, str2, i10);
    }
}
