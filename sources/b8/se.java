package b8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class se {
    public static i2.n a(o2.m mVar, String str, o2.j jVar, int i3) {
        Map map = Collections.EMPTY_MAP;
        Uri g7 = g2.f.g(str, jVar.c);
        long j10 = jVar.a;
        long j11 = jVar.b;
        String a10 = mVar.a();
        if (a10 == null) {
            a10 = g2.f.g(((o2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = a10;
        zb.k(g7, "The uri must be set.");
        return new i2.n(g7, 1, null, g9.x1.h, j10, j11, str2, i3);
    }
}
