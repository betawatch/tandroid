package n2;

import android.os.SystemClock;
import java.io.Serializable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
