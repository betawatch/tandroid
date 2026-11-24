package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class y2 extends a3 implements f2 {
    @Override // j$.util.stream.a3, j$.util.stream.h2
    public final g2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.g2
    public final Object b() {
        return w3.f;
    }

    @Override // j$.util.stream.a3, j$.util.stream.h2
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

    @Override // j$.util.stream.h2
    public final j$.util.d1 spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.h2
    public final Spliterator spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.a3, j$.util.stream.h2
    public final h2 a(int i) {
        throw new IndexOutOfBoundsException();
    }
}
