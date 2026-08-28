package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class j0 extends b {
    public final d0 j;
    public final boolean k;

    public j0(d0 d0Var, boolean z10, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.k = z10;
        this.j = d0Var;
    }

    public j0(j0 j0Var, Spliterator spliterator) {
        super(j0Var, spliterator);
        this.k = j0Var.k;
        this.j = j0Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new j0(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return this.j.b;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        t3 t3Var = this.a;
        c8 c8Var = (c8) this.j.d.get();
        t3Var.F0(this.b, c8Var);
        Object obj = c8Var.get();
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
            j0 j0Var = (j0) this.d;
            j0 j0Var2 = null;
            while (true) {
                if (j0Var != j0Var2) {
                    Object i9 = j0Var.i();
                    if (i9 != null && this.j.c.test(i9)) {
                        d(i9);
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
                                while (!atomicReference.compareAndSet(null, i9) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        j0Var2 = j0Var;
                        j0Var = (j0) this.e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
