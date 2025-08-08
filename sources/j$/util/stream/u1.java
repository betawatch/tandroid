package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class u1 extends t0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    public /* synthetic */ u1(R2 r2, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.t0
    public final N1 d0() {
        switch (this.h) {
            case 0:
                return new v1((Supplier) this.i, (j$.util.function.t0) this.k, (r) this.j);
            case 1:
                return new A1((Supplier) this.i, (j$.util.function.n0) this.k, (r) this.j);
            case 2:
                return new B1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new F1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new J1((Supplier) this.i, (j$.util.function.q0) this.k, (r) this.j);
        }
    }
}
