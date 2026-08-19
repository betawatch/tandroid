package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class S1 extends d {
    public final q1 h;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            L1 l1 = (L1) ((S1) dVar).f;
            l1.n((L1) ((S1) this.e).f);
            this.f = l1;
        }
        super.onCompletion(countedCompleter);
    }

    public S1(q1 q1Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = q1Var;
    }

    public S1(S1 s1, Spliterator spliterator) {
        super(s1, spliterator);
        this.h = s1.h;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new S1(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        L1 Y = this.h.Y();
        aVar.Q(this.b, Y);
        return Y;
    }
}
