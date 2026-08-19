package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class H0 extends d {
    public final a h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (B0) this.j.apply((B0) ((H0) dVar).f, (B0) ((H0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public H0(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public H0(H0 h0, Spliterator spliterator) {
        super(h0, spliterator);
        this.h = h0.h;
        this.i = h0.i;
        this.j = h0.j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new H0(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final B0 a() {
        t0 t0Var = (t0) this.i.apply(this.h.F(this.b));
        this.h.Q(this.b, t0Var);
        return t0Var.a();
    }
}
