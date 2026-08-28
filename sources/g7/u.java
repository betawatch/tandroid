package g7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u {
    public static com.google.android.exoplayer2.upstream.q a(n4.m mVar, String str, n4.j jVar, int i9) {
        Map map = Collections.EMPTY_MAP;
        Uri H = d5.a.H(str, jVar.c);
        long j10 = jVar.a;
        long j11 = jVar.b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = d5.a.H(((n4.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = b10;
        d5.a.k(H, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(H, 1, null, map, j10, j11, str2, i9);
    }
}
