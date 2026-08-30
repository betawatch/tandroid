package c0;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k implements v8.a {
    public final WeakReference a;
    public final j b = new j(this);

    public k(i iVar) {
        this.a = new WeakReference(iVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        i iVar = (i) this.a.get();
        boolean cancel = this.b.cancel(z4);
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
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.b.get(j10, timeUnit);
    }
}
