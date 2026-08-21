package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class L0 extends M0 implements A0 {
    @Override // j$.util.stream.C0
    public final /* synthetic */ C0 f(long j, long j2, IntFunction intFunction) {
        return r1.v(this, j, j2);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void forEach(Consumer consumer) {
        r1.s(this, consumer);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ void g(Object[] objArr, int i) {
        r1.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.B0
    public final Object c(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.C0
    public final Spliterator spliterator() {
        return new c1(this);
    }

    @Override // j$.util.stream.C0
    public final j$.util.c0 spliterator() {
        return new c1(this);
    }
}
