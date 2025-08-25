package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class R0 extends T0 implements E0 {
    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        w0.r(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return w0.u(this, j, j2);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        w0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.H0
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return new i1(this);
    }

    @Override // j$.util.stream.I0
    public final j$.util.e0 spliterator() {
        return new i1(this);
    }
}
