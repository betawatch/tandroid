package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public abstract class b extends d {
    public final AtomicReference h;
    public volatile boolean i;

    public b(a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = d.e(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = this.i;
            if (!z2) {
                CountedCompleter<?> completer = this.getCompleter();
                while (true) {
                    b bVar = (b) ((d) completer);
                    if (z2 || bVar == null) {
                        break;
                    }
                    z2 = bVar.i;
                    completer = bVar.getCompleter();
                }
            }
            if (z2) {
                obj = this.h();
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            b bVar2 = (b) this.c(trySplit);
            this.d = bVar2;
            b bVar3 = (b) this.c(spliterator);
            this.e = bVar3;
            this.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                this = bVar2;
                bVar2 = bVar3;
            } else {
                this = bVar3;
            }
            z = !z;
            bVar2.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = this.a();
        this.d(obj);
        this.tryComplete();
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

    public void f() {
        this.i = true;
    }

    public final void g() {
        CountedCompleter<?> completer = getCompleter();
        while (true) {
            b bVar = (b) ((d) completer);
            b bVar2 = this;
            this = bVar;
            if (this == null) {
                return;
            }
            if (this.d == bVar2) {
                b bVar3 = (b) this.e;
                if (!bVar3.i) {
                    bVar3.f();
                }
            }
            completer = this.getCompleter();
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public abstract Object h();

    public final Object i() {
        if (!b()) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? h() : obj;
    }

    public b(b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.h = bVar.h;
    }
}
