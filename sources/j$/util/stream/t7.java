package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class t7 extends u7 implements j$.util.a1, LongConsumer {
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.x7
    public final Spliterator b(Spliterator spliterator) {
        return new t7((j$.util.a1) spliterator, this);
    }

    @Override // j$.util.stream.u7
    public final void d(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f = j10;
    }

    @Override // j$.util.stream.u7
    public final b7 e(int i9) {
        return new a7(i9);
    }
}
