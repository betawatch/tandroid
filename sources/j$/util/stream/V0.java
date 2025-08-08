package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class V0 extends Y0 implements B0 {
    @Override // j$.util.stream.F0
    public final /* synthetic */ void forEach(Consumer consumer) {
        t0.r(this, consumer);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.F0
    public final /* synthetic */ F0 t(long j, long j2, IntFunction intFunction) {
        return t0.u(this, j, j2);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.F0
    public final /* bridge */ /* synthetic */ F0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.F0
    public final E0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        t0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.F0
    public final j$.util.M spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.E0
    public final Object e() {
        int[] iArr;
        iArr = t0.e;
        return iArr;
    }
}
