package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class n7 extends o7 implements j$.util.a1 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.q7
    public final Spliterator a(Spliterator spliterator, long j3, long j10, long j11, long j12) {
        return new n7((j$.util.a1) spliterator, j3, j10, j11, j12);
    }

    @Override // j$.util.stream.o7
    public final Object b() {
        return new b2(1);
    }
}
