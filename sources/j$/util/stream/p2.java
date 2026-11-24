package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class p2 extends r2 implements d2 {
    @Override // j$.util.stream.h2
    public final /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.u(this, j, j2);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void f(Object[] objArr, int i) {
        w3.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.h2
    public final /* synthetic */ void forEach(Consumer consumer) {
        w3.r(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.h2
    public final j$.util.d1 spliterator() {
        return new g3(this);
    }

    @Override // j$.util.stream.h2
    public final Spliterator spliterator() {
        return new g3(this);
    }
}
