package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.LongFunction;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class M0 extends e {
    protected final b h;
    protected final LongFunction i;
    protected final j$.util.function.f j;

    M0(M0 m0, Spliterator spliterator) {
        super(m0, spliterator);
        this.h = m0.h;
        this.i = m0.i;
        this.j = m0.j;
    }

    M0(b bVar, Spliterator spliterator, LongFunction longFunction, j$.util.function.f fVar) {
        super(bVar, spliterator);
        this.h = bVar;
        this.i = longFunction;
        this.j = fVar;
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        y0 y0Var = (y0) this.i.apply(this.h.l0(this.b));
        this.h.A0(this.b, y0Var);
        return y0Var.b();
    }

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new M0(this, spliterator);
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.d;
        if (eVar != null) {
            e((G0) this.j.apply((G0) ((M0) eVar).b(), (G0) ((M0) this.e).b()));
        }
        super.onCompletion(countedCompleter);
    }
}
