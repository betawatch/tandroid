package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
class P0 extends e {
    protected final b h;
    protected final LongFunction i;
    protected final BinaryOperator j;

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.d;
        if (eVar != null) {
            f((I0) this.j.apply((I0) ((P0) eVar).c(), (I0) ((P0) this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    P0(b bVar, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(bVar, spliterator);
        this.h = bVar;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    P0(P0 p0, Spliterator spliterator) {
        super(p0, spliterator);
        this.h = p0.h;
        this.i = p0.i;
        this.j = p0.j;
    }

    @Override // j$.util.stream.e
    protected e e(Spliterator spliterator) {
        return new P0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final I0 a() {
        A0 a0 = (A0) this.i.apply(this.h.F(this.b));
        this.h.U(this.b, a0);
        return a0.a();
    }
}
