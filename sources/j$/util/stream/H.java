package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class H extends b {
    public final B j;
    public final boolean k;

    public H(B b, boolean z, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.k = z;
        this.j = b;
    }

    public H(H h, Spliterator spliterator) {
        super(h, spliterator);
        this.k = h.k;
        this.j = h.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new H(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return this.j.b;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        z3 z3Var = (z3) this.j.d.get();
        aVar.Q(this.b, z3Var);
        Object obj = z3Var.get();
        if (this.k) {
            if (obj != null) {
                d dVar = this;
                while (dVar != null) {
                    d dVar2 = (d) dVar.getCompleter();
                    if (dVar2 != null && dVar2.d != dVar) {
                        g();
                        return obj;
                    }
                    dVar = dVar2;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            H h = (H) this.d;
            H h2 = null;
            while (true) {
                if (h != h2) {
                    Object i = h.i();
                    if (i != null && this.j.c.test(i)) {
                        d(i);
                        d dVar = this;
                        while (true) {
                            if (dVar != null) {
                                d dVar2 = (d) dVar.getCompleter();
                                if (dVar2 != null && dVar2.d != dVar) {
                                    g();
                                    break;
                                }
                                dVar = dVar2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, i) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        h2 = h;
                        h = (H) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
