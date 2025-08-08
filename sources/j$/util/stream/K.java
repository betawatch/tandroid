package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class K extends c {
    private final E j;

    K(E e, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.j = e;
    }

    K(K k, Spliterator spliterator) {
        super(k, spliterator);
        this.j = k.j;
    }

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new K(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object i() {
        return this.j.b;
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        b bVar = this.a;
        w3 w3Var = (w3) this.j.d.get();
        bVar.A0(this.b, w3Var);
        Object obj = w3Var.get();
        if (!this.j.a) {
            if (obj != null) {
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        e eVar = this;
        while (true) {
            if (eVar != null) {
                e eVar2 = (e) eVar.getCompleter();
                if (eVar2 != null && eVar2.d != eVar) {
                    h();
                    break;
                }
                eVar = eVar2;
            } else {
                AtomicReference atomicReference2 = this.h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.j.a) {
            K k = (K) this.d;
            K k2 = null;
            while (true) {
                if (k != k2) {
                    Object b = k.b();
                    if (b != null && this.j.c.test(b)) {
                        e(b);
                        e eVar = this;
                        while (true) {
                            if (eVar != null) {
                                e eVar2 = (e) eVar.getCompleter();
                                if (eVar2 != null && eVar2.d != eVar) {
                                    h();
                                    break;
                                }
                                eVar = eVar2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, b) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        k2 = k;
                        k = (K) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
