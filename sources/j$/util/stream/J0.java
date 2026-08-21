package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class J0 extends M0 implements w0 {
    @Override // j$.util.stream.C0
    public final /* synthetic */ C0 f(long j, long j2, IntFunction intFunction) {
        return r1.t(this, j, j2);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        r1.q(this, consumer);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        r1.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.B0
    public final Object c(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.C0
    public final Spliterator spliterator() {
        return new a1(this);
    }

    @Override // j$.util.stream.C0
    public final j$.util.c0 spliterator() {
        return new a1(this);
    }
}
