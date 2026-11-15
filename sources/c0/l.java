package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m9.y;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class l implements y {
    public final WeakReference a;
    public final k b = new k(this);

    public l(i iVar) {
        this.a = new WeakReference(iVar);
    }

    @Override // m9.y
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        i iVar = (i) this.a.get();
        boolean cancel = this.b.cancel(z10);
        if (cancel && iVar != null) {
            iVar.a = null;
            iVar.b = null;
            iVar.c.k(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.b.get(j3, timeUnit);
    }
}
