package i7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class x5 {
    public static com.google.android.exoplayer2.upstream.q a(p4.m mVar, String str, p4.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri H = f5.a.H(str, jVar.c);
        long j10 = jVar.a;
        long j11 = jVar.b;
        String a2 = mVar.a();
        if (a2 == null) {
            a2 = f5.a.H(((p4.b) mVar.b.get(0)).a, jVar.c).toString();
        }
        String str2 = a2;
        f5.a.k(H, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(H, 1, null, map, j10, j11, str2, i10);
    }
}
