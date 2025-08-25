package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class c4 extends c {
    private final b j;
    private final IntFunction k;
    private final boolean l;
    private long m;
    private boolean n;
    private volatile boolean o;

    @Override // j$.util.stream.c
    protected final void h() {
        this.i = true;
        if (this.l && this.o) {
            f(w0.L(this.j.H()));
        }
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I;
        e eVar = this.d;
        if (eVar != null) {
            this.n = ((c4) eVar).n | ((c4) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                I = w0.L(this.j.H());
            } else {
                if (this.l) {
                    c4 c4Var = (c4) this.d;
                    if (c4Var.n) {
                        this.m = c4Var.m;
                        I = (I0) c4Var.c();
                    }
                }
                c4 c4Var2 = (c4) this.d;
                long j = c4Var2.m;
                c4 c4Var3 = (c4) this.e;
                this.m = j + c4Var3.m;
                if (c4Var2.m == 0) {
                    I = (I0) c4Var3.c();
                } else if (c4Var3.m == 0) {
                    I = (I0) c4Var2.c();
                } else {
                    I = w0.I(this.j.H(), (I0) ((c4) this.d).c(), (I0) ((c4) this.e).c());
                }
            }
            f(I);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    c4(b bVar, b bVar2, Spliterator spliterator, IntFunction intFunction) {
        super(bVar2, spliterator);
        this.j = bVar;
        this.k = intFunction;
        this.l = a3.ORDERED.m(bVar2.J());
    }

    c4(c4 c4Var, Spliterator spliterator) {
        super(c4Var, spliterator);
        this.j = c4Var.j;
        this.k = c4Var.k;
        this.l = c4Var.l;
    }

    @Override // j$.util.stream.e
    protected final e e(Spliterator spliterator) {
        return new c4(this, spliterator);
    }

    @Override // j$.util.stream.c
    protected final Object j() {
        return w0.L(this.j.H());
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        A0 M = this.a.M(-1L, this.k);
        m2 Q = this.j.Q(this.a.J(), M);
        b bVar = this.a;
        boolean A = bVar.A(this.b, bVar.V(Q));
        this.n = A;
        if (A) {
            i();
        }
        I0 a = M.a();
        this.m = a.count();
        return a;
    }
}
