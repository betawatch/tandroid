package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class Q1 extends e {
    private final u0 h;

    Q1(Q1 q1, Spliterator spliterator) {
        super(q1, spliterator);
        this.h = q1.h;
    }

    Q1(u0 u0Var, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.h = u0Var;
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        b bVar = this.a;
        O1 d0 = this.h.d0();
        bVar.A0(this.b, d0);
        return d0;
    }

    @Override // j$.util.stream.e
    protected final e d(Spliterator spliterator) {
        return new Q1(this, spliterator);
    }

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.d;
        if (eVar != null) {
            O1 o1 = (O1) ((Q1) eVar).b();
            o1.h((O1) ((Q1) this.e).b());
            e(o1);
        }
        super.onCompletion(countedCompleter);
    }
}
