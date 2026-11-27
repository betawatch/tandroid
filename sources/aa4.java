// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
