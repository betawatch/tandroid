package h7;

import android.os.SystemClock;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class x6 {
    public static com.google.android.exoplayer2.upstream.j0 a(d5.r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.e(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new com.google.android.exoplayer2.upstream.j0(1, 0, length, i10);
    }
}
