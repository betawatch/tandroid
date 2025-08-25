package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
abstract class c extends e {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected abstract Object j();

    protected c(b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.h = new AtomicReference(null);
    }

    protected c(c cVar, Spliterator spliterator) {
        super(cVar, spliterator);
        this.h = cVar.h;
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = e.g(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        c cVar = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = cVar.i;
            if (!z2) {
                CountedCompleter<?> completer = cVar.getCompleter();
                while (true) {
                    c cVar2 = (c) ((e) completer);
                    if (z2 || cVar2 == null) {
                        break;
                    }
                    z2 = cVar2.i;
                    completer = cVar2.getCompleter();
                }
            }
            if (z2) {
                obj = cVar.j();
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            c cVar3 = (c) cVar.e(trySplit);
            cVar.d = cVar3;
            c cVar4 = (c) cVar.e(spliterator);
            cVar.e = cVar4;
            cVar.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                cVar = cVar3;
                cVar3 = cVar4;
            } else {
                cVar = cVar4;
            }
            z = !z;
            cVar3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = cVar.a();
        cVar.f(obj);
        cVar.tryComplete();
    }

    @Override // j$.util.stream.e
    protected final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    @Override // j$.util.stream.e
    public final Object c() {
        if (d()) {
            Object obj = this.h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    protected void h() {
        this.i = true;
    }

    protected final void i() {
        c cVar = this;
        for (c cVar2 = (c) ((e) getCompleter()); cVar2 != null; cVar2 = (c) ((e) cVar2.getCompleter())) {
            if (cVar2.d == cVar) {
                c cVar3 = (c) cVar2.e;
                if (!cVar3.i) {
                    cVar3.h();
                }
            }
            cVar = cVar2;
        }
    }
}
