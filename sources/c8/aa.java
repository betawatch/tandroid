package c8;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class aa {
    public static j2.m a(p2.m mVar, String str, p2.j jVar, int i7) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = h2.e.g(str, jVar.c);
        long j3 = jVar.a;
        long j10 = jVar.b;
        String a10 = mVar.a();
        if (a10 == null) {
            a10 = h2.e.g(((p2.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = a10;
        a8.ja.k(g10, "The uri must be set.");
        return new j2.m(g10, 1, null, h9.x1.h, j3, j10, str2, i7);
    }
}
