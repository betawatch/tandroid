package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class K extends c {
    private final E j;
    private final boolean k;

    K(E e, boolean z, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.k = z;
        this.j = e;
    }

    K(K k, Spliterator spliterator) {
        super(k, spliterator);
        this.k = k.k;
        this.j = k.j;
    }

    @Override // j$.util.stream.e
    protected final e e(Spliterator spliterator) {
        return new K(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        b bVar = this.a;
        H3 h3 = (H3) this.j.d.get();
        bVar.U(this.b, h3);
        Object obj = h3.get();
        if (!this.k) {
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
                    i();
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
        if (this.k) {
            K k = (K) this.d;
            K k2 = null;
            while (true) {
                if (k != k2) {
                    Object c = k.c();
                    if (c != null && this.j.c.test(c)) {
                        f(c);
                        e eVar = this;
                        while (true) {
                            if (eVar != null) {
                                e eVar2 = (e) eVar.getCompleter();
                                if (eVar2 != null && eVar2.d != eVar) {
                                    i();
                                    break;
                                }
                                eVar = eVar2;
                            } else {
                                AtomicReference atomicReference = this.h;
                                while (!atomicReference.compareAndSet(null, c) && atomicReference.get() == null) {
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
