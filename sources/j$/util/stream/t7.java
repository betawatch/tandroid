package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class t7 extends u7 implements j$.util.a1 {
    @Override // j$.util.stream.w7
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new t7((j$.util.a1) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.u7
    public final Object b() {
        return new e2((byte) 1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.A(this, consumer);
    }
}
