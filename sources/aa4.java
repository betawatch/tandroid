// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class aa4 implements io4 {
    @Override // io4
    public final void a() {
        ea4.b = SystemClock.elapsedRealtime();
    }

    @Override // io4
    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = ea4.b;
        if (j != 0 && elapsedRealtime - j > 300000) {
            ea4.c = elapsedRealtime;
        }
        ea4.b = 0L;
    }
}
