package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class J0 extends L0 implements x0 {
    @Override // j$.util.stream.B0
    public final /* synthetic */ B0 f(long j, long j2, IntFunction intFunction) {
        return q1.u(this, j, j2);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void forEach(Consumer consumer) {
        q1.r(this, consumer);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        q1.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.A0
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.B0
    public final Spliterator spliterator() {
        return new a1(this);
    }

    @Override // j$.util.stream.B0
    public final j$.util.c0 spliterator() {
        return new a1(this);
    }
}
