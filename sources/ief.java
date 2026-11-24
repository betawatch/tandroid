// default package

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ief implements ymd {
    public final WeakReference a;
    public final ucf b = new ucf(this);

    public ief(h7f h7fVar) {
        this.a = new WeakReference(h7fVar);
    }

    @Override // ymd
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        h7f h7fVar = (h7f) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || h7fVar == null) {
            return cancel;
        }
        h7fVar.a = null;
        h7fVar.b = null;
        h7fVar.c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof htd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
