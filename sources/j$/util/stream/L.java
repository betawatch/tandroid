package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class L extends c {
    private final F j;

    L(F f, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.j = f;
    }

    L(L l, Spliterator spliterator) {
        super(l, spliterator);
        this.j = l.j;
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        b bVar = this.a;
        x3 x3Var = (x3) this.j.d.get();
        bVar.B0(this.b, x3Var);
        Object obj = x3Var.get();
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

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new L(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object i() {
        return this.j.b;
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.j.a) {
            L l = (L) this.d;
            L l2 = null;
            while (true) {
                if (l != l2) {
                    Object b = l.b();
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
                        l2 = l;
                        l = (L) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
