package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class D1 extends t0 {
    final /* synthetic */ j$.util.function.f h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D1(S2 s2, j$.util.function.f fVar, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(s2);
        this.h = fVar;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.t0, j$.util.stream.w3
    public final int d() {
        if (this.k.characteristics().contains(h.UNORDERED)) {
            return R2.r;
        }
        return 0;
    }

    @Override // j$.util.stream.t0
    public final N1 d0() {
        return new E1(this.j, this.i, this.h);
    }
}
