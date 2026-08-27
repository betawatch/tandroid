package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class k2 extends d {
    public final t3 h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (e2) this.j.apply((e2) ((k2) dVar).f, (e2) ((k2) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public k2(t3 t3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(t3Var, spliterator);
        this.h = t3Var;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public k2(k2 k2Var, Spliterator spliterator) {
        super(k2Var, spliterator);
        this.h = k2Var.h;
        this.i = k2Var.i;
        this.j = k2Var.j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new k2(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final e2 a() {
        w1 w1Var = (w1) this.i.apply(this.h.k0(this.b));
        this.h.F0(this.b, w1Var);
        return w1Var.build();
    }
}
