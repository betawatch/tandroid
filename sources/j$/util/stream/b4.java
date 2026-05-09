package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class b4 extends e {
    private final b h;
    private final IntFunction i;
    private final boolean j;
    private long k;
    private long l;

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        I0 I;
        e eVar = this.d;
        if (eVar != null) {
            if (this.j) {
                b4 b4Var = (b4) eVar;
                long j = b4Var.l;
                this.l = j;
                if (j == b4Var.k) {
                    this.l = j + ((b4) this.e).l;
                }
            }
            b4 b4Var2 = (b4) eVar;
            long j2 = b4Var2.k;
            b4 b4Var3 = (b4) this.e;
            this.k = j2 + b4Var3.k;
            if (b4Var2.k == 0) {
                I = (I0) b4Var3.c();
            } else if (b4Var3.k == 0) {
                I = (I0) b4Var2.c();
            } else {
                I = w0.I(this.h.H(), (I0) ((b4) this.d).c(), (I0) ((b4) this.e).c());
            }
            I0 i0 = I;
            if (d() && this.j) {
                i0 = i0.h(this.l, i0.count(), this.i);
            }
            f(i0);
        }
        super.onCompletion(countedCompleter);
    }

    b4(b bVar, b bVar2, Spliterator spliterator, IntFunction intFunction) {
        super(bVar2, spliterator);
        this.h = bVar;
        this.i = intFunction;
        this.j = a3.ORDERED.o(bVar2.J());
    }

    b4(b4 b4Var, Spliterator spliterator) {
        super(b4Var, spliterator);
        this.h = b4Var.h;
        this.i = b4Var.i;
        this.j = b4Var.j;
    }

    @Override // j$.util.stream.e
    protected final e e(Spliterator spliterator) {
        return new b4(this, spliterator);
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        boolean d = d();
        A0 M = this.a.M((!d && this.j && a3.SIZED.r(this.h.c)) ? this.h.F(this.b) : -1L, this.i);
        a4 j = ((Z3) this.h).j(M, this.j && !d);
        this.a.U(this.b, j);
        I0 a = M.a();
        this.k = a.count();
        this.l = j.f();
        return a;
    }
}
