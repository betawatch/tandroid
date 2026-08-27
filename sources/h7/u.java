package h7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class u {
    public static com.google.android.exoplayer2.upstream.q a(n4.m mVar, String str, n4.j jVar, int i10) {
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
        return new com.google.android.exoplayer2.upstream.q(H, 1, null, map, j10, j11, str2, i10);
    }
}
