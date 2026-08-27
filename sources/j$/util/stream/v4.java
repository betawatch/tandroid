package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class v4 extends d {
    public final t3 h;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            o4 o4Var = (o4) ((v4) dVar).f;
            o4Var.u((o4) ((v4) this.e).f);
            this.f = o4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public v4(t3 t3Var, t3 t3Var2, Spliterator spliterator) {
        super(t3Var2, spliterator);
        this.h = t3Var;
    }

    public v4(v4 v4Var, Spliterator spliterator) {
        super(v4Var, spliterator);
        this.h = v4Var.h;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new v4(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        t3 t3Var = this.a;
        o4 D0 = this.h.D0();
        t3Var.F0(this.b, D0);
        return D0;
    }
}
