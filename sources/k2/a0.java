package k2;

import android.os.SystemClock;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class a0 {
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
            synchronized (f0.o0) {
                z10 = f0.q0 > 0;
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
