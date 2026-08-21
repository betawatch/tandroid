package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class I0 extends d {
    public final a h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (C0) this.j.apply((C0) ((I0) dVar).f, (C0) ((I0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public I0(a aVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(aVar, spliterator);
        this.h = aVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public I0(I0 i0, Spliterator spliterator) {
        super(i0, spliterator);
        this.h = i0.h;
        this.i = i0.i;
        this.j = i0.j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new I0(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C0 a() {
        u0 u0Var = (u0) this.i.apply(this.h.F(this.b));
        this.h.Q(this.b, u0Var);
        return u0Var.a();
    }
}
