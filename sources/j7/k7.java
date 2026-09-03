package j7;

import android.os.SystemClock;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class k7 {
    public static g5.g0 a(f5.c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int p10 = cVar.p();
        int i10 = 0;
        for (int i11 = 0; i11 < p10; i11++) {
            if (cVar.o(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new g5.g0(1, 0, p10, i10);
    }
}
