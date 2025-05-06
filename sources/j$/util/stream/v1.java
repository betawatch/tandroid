package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class v1 extends u0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(S2 s2, Object obj, Object obj2, Object obj3, int i) {
        super(s2);
        this.h = i;
        this.i = obj;
        this.k = obj2;
        this.j = obj3;
    }

    @Override // j$.util.stream.u0
    public final O1 d0() {
        switch (this.h) {
            case 0:
                return new w1((Supplier) this.j, (j$.util.function.l0) this.k, (j$.util.function.f) this.i);
            case 1:
                return new B1((Supplier) this.j, (j$.util.function.f0) this.k, (j$.util.function.f) this.i);
            case 2:
                return new C1(this.j, (BiFunction) this.k, (j$.util.function.f) this.i);
            case 3:
                return new G1((Supplier) this.j, (BiConsumer) this.k, (BiConsumer) this.i);
            default:
                return new K1((Supplier) this.j, (j$.util.function.i0) this.k, (j$.util.function.f) this.i);
        }
    }
}
