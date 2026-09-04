package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class p8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                p8 p8Var = (p8) dVar;
                long j3 = p8Var.l;
                this.l = j3;
                if (j3 == p8Var.k) {
                    this.l = j3 + ((p8) this.e).l;
                }
            }
            p8 p8Var2 = (p8) dVar;
            long j10 = p8Var2.k;
            p8 p8Var3 = (p8) this.e;
            this.k = j10 + p8Var3.k;
            e2 e02 = p8Var2.k == 0 ? (e2) p8Var3.f : p8Var3.k == 0 ? (e2) p8Var2.f : t3.e0(this.h.M0(), (e2) ((p8) this.d).f, (e2) ((p8) this.e).f);
            if (b() && this.j) {
                e02 = e02.e(this.l, e02.count(), this.i);
            }
            this.f = e02;
        }
        super.onCompletion(countedCompleter);
    }

    public p8(a aVar, t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        super(t3Var, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = v6.ORDERED.m(((a) t3Var).m);
    }

    public p8(p8 p8Var, Spliterator spliterator) {
        super(p8Var, spliterator);
        this.h = p8Var.h;
        this.i = p8Var.i;
        this.j = p8Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new p8(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        long j3;
        boolean b10 = b();
        if (!b10 && this.j) {
            v6 v6Var = v6.SIZED;
            a aVar = this.h;
            int i10 = aVar.j;
            int i11 = v6Var.e;
            if ((i10 & i11) == i11) {
                j3 = aVar.k0(this.b);
                w1 A0 = this.a.A0(j3, this.i);
                o8 h = ((n8) this.h).h(A0, (this.j || b10) ? false : true);
                this.a.F0(this.b, h);
                e2 build = A0.build();
                this.k = build.count();
                this.l = h.s();
                return build;
            }
        }
        j3 = -1;
        w1 A02 = this.a.A0(j3, this.i);
        o8 h10 = ((n8) this.h).h(A02, (this.j || b10) ? false : true);
        this.a.F0(this.b, h10);
        e2 build2 = A02.build();
        this.k = build2.count();
        this.l = h10.s();
        return build2;
    }
}
