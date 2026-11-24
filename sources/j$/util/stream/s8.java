package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class s8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    public s8(a aVar, a aVar2, Spliterator spliterator, IntFunction intFunction) {
        super(aVar2, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = b7.ORDERED.n(aVar2.f);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        long j;
        boolean b = b();
        if (!b && this.j) {
            b7 b7Var = b7.SIZED;
            a aVar = this.h;
            int i = aVar.c;
            int i2 = b7Var.e;
            if ((i & i2) == i2) {
                j = aVar.F(this.b);
                z1 I = this.a.I(j, this.i);
                r8 g = ((q8) this.h).g(I, (this.j || b) ? false : true);
                this.a.Q(this.b, g);
                h2 build = I.build();
                this.k = build.count();
                this.l = g.v();
                return build;
            }
        }
        j = -1;
        z1 I2 = this.a.I(j, this.i);
        r8 g2 = ((q8) this.h).g(I2, (this.j || b) ? false : true);
        this.a.Q(this.b, g2);
        h2 build2 = I2.build();
        this.k = build2.count();
        this.l = g2.v();
        return build2;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new s8(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                s8 s8Var = (s8) dVar;
                long j = s8Var.l;
                this.l = j;
                if (j == s8Var.k) {
                    this.l = j + ((s8) this.e).l;
                }
            }
            s8 s8Var2 = (s8) dVar;
            long j2 = s8Var2.k;
            s8 s8Var3 = (s8) this.e;
            this.k = j2 + s8Var3.k;
            h2 E = s8Var2.k == 0 ? (h2) s8Var3.f : s8Var3.k == 0 ? (h2) s8Var2.f : w3.E(this.h.H(), (h2) ((s8) this.d).f, (h2) ((s8) this.e).f);
            if (b() && this.j) {
                E = E.e(this.l, E.count(), this.i);
            }
            this.f = E;
        }
        super.onCompletion(countedCompleter);
    }

    public s8(s8 s8Var, Spliterator spliterator) {
        super(s8Var, spliterator);
        this.h = s8Var.h;
        this.i = s8Var.i;
        this.j = s8Var.j;
    }
}
