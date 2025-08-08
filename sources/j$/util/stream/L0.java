package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BinaryOperator;
import j$.util.function.LongFunction;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class L0 extends e {
    protected final b h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.d;
        if (eVar != null) {
            e((F0) this.j.apply((F0) ((L0) eVar).b(), (F0) ((L0) this.e).b()));
        }
        super.onCompletion(countedCompleter);
    }

    L0(b bVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(bVar, spliterator);
        this.h = bVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    L0(L0 l0, Spliterator spliterator) {
        super(l0, spliterator);
        this.h = l0.h;
        this.i = l0.i;
        this.j = l0.j;
    }

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new L0(this, spliterator);
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        x0 x0Var = (x0) this.i.apply(this.h.l0(this.b));
        this.h.A0(this.b, x0Var);
        return x0Var.b();
    }
}
