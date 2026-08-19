package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class N3 extends w implements O3 {
    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return S2.ORDERED.q(aVar.f) ? J(aVar, spliterator, new K3(1)).spliterator() : new S3((j$.util.T) aVar.S(spliterator), 0);
    }

    @Override // j$.util.stream.a
    public final B0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (B0) new Q3(this, aVar, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        return new M3(this, f2Var, false);
    }

    @Override // j$.util.stream.O3
    public final P3 j(t0 t0Var, boolean z) {
        return new M3(this, t0Var, z);
    }
}
