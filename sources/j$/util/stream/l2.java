package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class l2 extends o2 implements y1 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.S(this, j10, j11);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.P(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void f(Object[] objArr, int i10) {
        t3.M(this, (Double[]) objArr, i10);
    }

    @Override // j$.util.stream.d2
    public final Object newArray(int i10) {
        return new double[i10];
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return new c3(this);
    }

    @Override // j$.util.stream.e2
    public final j$.util.d1 spliterator() {
        return new c3(this);
    }
}
