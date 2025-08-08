package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class N0 extends P0 implements B0 {
    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        t0.r(this, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 t(long j, long j2, IntFunction intFunction) {
        return t0.u(this, j, j2);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        t0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.E0
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.F0
    public final j$.util.M spliterator() {
        return new e1(this);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return new e1(this);
    }
}
