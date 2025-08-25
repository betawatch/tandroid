package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class Z1 extends e {
    private final w0 h;

    @Override // j$.util.stream.e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e eVar = this.d;
        if (eVar != null) {
            S1 s1 = (S1) ((Z1) eVar).c();
            s1.g((S1) ((Z1) this.e).c());
            f(s1);
        }
        super.onCompletion(countedCompleter);
    }

    Z1(w0 w0Var, b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.h = w0Var;
    }

    Z1(Z1 z1, Spliterator spliterator) {
        super(z1, spliterator);
        this.h = z1.h;
    }

    @Override // j$.util.stream.e
    protected final e e(Spliterator spliterator) {
        return new Z1(this, spliterator);
    }

    @Override // j$.util.stream.e
    protected final Object a() {
        b bVar = this.a;
        S1 e0 = this.h.e0();
        bVar.U(this.b, e0);
        return e0;
    }
}
