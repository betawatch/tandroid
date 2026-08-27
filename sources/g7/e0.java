package g7;

import android.os.SystemClock;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class e0 {
    public static com.google.android.exoplayer2.upstream.j0 a(b5.s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (sVar.f(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new com.google.android.exoplayer2.upstream.j0(1, 0, length, i10);
    }
}
