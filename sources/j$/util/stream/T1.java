package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class T1 extends d {
    public final r1 h;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            M1 m1 = (M1) ((T1) dVar).f;
            m1.n((M1) ((T1) this.e).f);
            this.f = m1;
        }
        super.onCompletion(countedCompleter);
    }

    public T1(r1 r1Var, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.h = r1Var;
    }

    public T1(T1 t1, Spliterator spliterator) {
        super(t1, spliterator);
        this.h = t1.h;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new T1(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        M1 Z = this.h.Z();
        aVar.Q(this.b, Z);
        return Z;
    }
}
