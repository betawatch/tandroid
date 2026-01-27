package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class s3 extends t3 implements j$.util.c0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.T.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.T.h(this, consumer);
    }

    @Override // j$.util.stream.v3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new s3((j$.util.c0) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.t3
    protected final Object b() {
        return new F0(1);
    }
}
