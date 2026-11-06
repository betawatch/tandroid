package n2;

import android.os.SystemClock;
import java.io.Serializable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p0 {
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;
    public Serializable c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L && q0.c0.get() <= 0) {
            this.a = 200 + elapsedRealtime;
        }
        long j3 = this.a;
        if (j3 == -9223372036854775807L || elapsedRealtime < j3) {
            this.b = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }
}
