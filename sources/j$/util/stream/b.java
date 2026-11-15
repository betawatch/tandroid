package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class b extends d {
    public final AtomicReference h;
    public volatile boolean i;

    public abstract Object h();

    public b(t3 t3Var, Spliterator spliterator) {
        super(t3Var, spliterator);
        this.h = new AtomicReference(null);
    }

    public b(b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.h = bVar.h;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j3 = this.c;
        if (j3 == 0) {
            j3 = d.e(estimateSize);
            this.c = j3;
        }
        AtomicReference atomicReference = this.h;
        boolean z10 = false;
        b bVar = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z11 = bVar.i;
            if (!z11) {
                CountedCompleter<?> completer = bVar.getCompleter();
                while (true) {
                    b bVar2 = (b) ((d) completer);
                    if (z11 || bVar2 == null) {
                        break;
                    }
                    z11 = bVar2.i;
                    completer = bVar2.getCompleter();
                }
            }
            if (z11) {
                obj = bVar.h();
                break;
            }
            if (estimateSize <= j3 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            b bVar3 = (b) bVar.c(trySplit);
            bVar.d = bVar3;
            b bVar4 = (b) bVar.c(spliterator);
            bVar.e = bVar4;
            bVar.setPendingCount(1);
            if (z10) {
                spliterator = trySplit;
                bVar = bVar3;
                bVar3 = bVar4;
            } else {
                bVar = bVar4;
            }
            z10 = !z10;
            bVar3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = bVar.a();
        bVar.d(obj);
        bVar.tryComplete();
    }

    @Override // j$.util.stream.d
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.h.get();
            return obj == null ? h() : obj;
        }
        return this.f;
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        b bVar = this;
        for (b bVar2 = (b) ((d) getCompleter()); bVar2 != null; bVar2 = (b) ((d) bVar2.getCompleter())) {
            if (bVar2.d == bVar) {
                b bVar3 = (b) bVar2.e;
                if (!bVar3.i) {
                    bVar3.f();
                }
            }
            bVar = bVar2;
        }
    }
}
