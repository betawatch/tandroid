package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class Z0 extends c1 implements E0 {
    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        w0.r(this, consumer);
    }

    @Override // j$.util.stream.c1, j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return w0.u(this, j, j2);
    }

    @Override // j$.util.stream.c1, j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.c1, j$.util.stream.I0
    public final H0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        w0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.I0
    public final j$.util.f0 spliterator() {
        return Spliterators.c();
    }

    @Override // j$.util.stream.H0
    public final Object d() {
        int[] iArr;
        iArr = w0.e;
        return iArr;
    }
}
