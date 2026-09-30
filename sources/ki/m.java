package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class m {
    public static final AtomicLong c = new AtomicLong(1);
    public final long a = c.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
