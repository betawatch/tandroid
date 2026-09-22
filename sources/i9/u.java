package i9;

import com.google.android.gms.internal.play_billing.s0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class u implements w {
    public static final u b = new u(null);
    public static final s0 c = new s0(u.class, 1);
    public final Object a;

    public u(Object obj) {
        this.a = obj;
    }

    @Override // i9.w
    public final void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a;
    }
}
