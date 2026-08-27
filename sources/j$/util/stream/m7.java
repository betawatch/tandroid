package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class m7 extends o7 implements j$.util.x0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.q7
    public final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new m7((j$.util.x0) spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.o7
    public final Object b() {
        return new z1(1);
    }
}
