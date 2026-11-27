package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class q2 extends r2 implements f2 {
    @Override // j$.util.stream.h2
    public final /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.v(this, j, j2);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        w3.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.s(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.h2
    public final j$.util.d1 spliterator() {
        return new h3(this);
    }

    @Override // j$.util.stream.h2
    public final Spliterator spliterator() {
        return new h3(this);
    }
}
