// default package

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jgf implements bpd {
    public final WeakReference a;
    public final vef b = new vef(this);

    public jgf(j9f j9fVar) {
        this.a = new WeakReference(j9fVar);
    }

    @Override // bpd
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        j9f j9fVar = (j9f) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || j9fVar == null) {
            return cancel;
        }
        j9fVar.a = null;
        j9fVar.b = null;
        j9fVar.c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof kvd;
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
