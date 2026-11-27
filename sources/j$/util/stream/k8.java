package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class k8 extends d5 implements q8 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(f5 f5Var, int i, Predicate predicate, byte b) {
        super(f5Var, i);
        this.l = b;
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                return (h2) new t8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (h2) new s8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        byte b = 12;
        switch (this.l) {
            case 0:
                return b7.ORDERED.n(aVar.f) ? J(aVar, spliterator, new d1(b)).spliterator() : new x8(aVar.S(spliterator), this.m, (byte) 1);
            default:
                return b7.ORDERED.n(aVar.f) ? J(aVar, spliterator, new d1(b)).spliterator() : new x8(aVar.S(spliterator), this.m, (byte) 0);
        }
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new m(this, n5Var);
            default:
                return new l8(this, n5Var, false);
        }
    }

    @Override // j$.util.stream.q8
    public final r8 g(z1 z1Var, boolean z) {
        return new l8(this, z1Var, z);
    }
}
