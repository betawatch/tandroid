package n2;

import android.os.SystemClock;
import java.io.Serializable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class q0 {
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;
    public Serializable c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L && r0.c0.get() <= 0) {
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
