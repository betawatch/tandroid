package m9;

import com.google.android.gms.internal.play_billing.s0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w implements y {
    public static final w b = new w(null);
    public static final s0 c = new s0(w.class, 1);
    public final Object a;

    public w(Object obj) {
        this.a = obj;
    }

    @Override // m9.y
    public final void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
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
