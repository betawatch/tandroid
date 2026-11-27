// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
