package k2;

import android.os.SystemClock;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class z {
    public Exception a;
    public long b = -9223372036854775807L;
    public long c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
        }
        if (this.b == -9223372036854775807L) {
            synchronized (d0.o0) {
                z10 = d0.q0 > 0;
            }
            if (!z10) {
                this.b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.b;
        if (j3 == -9223372036854775807L || elapsedRealtime < j3) {
            this.c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.a;
        this.a = null;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        throw exc3;
    }
}
