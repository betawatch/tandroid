package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class s7 extends u7 implements j$.util.x0, IntConsumer {
    public int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.x7
    public final Spliterator b(Spliterator spliterator) {
        return new s7((j$.util.x0) spliterator, this);
    }

    @Override // j$.util.stream.u7
    public final void d(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.f = i9;
    }

    @Override // j$.util.stream.u7
    public final b7 e(int i9) {
        return new z6(i9);
    }
}
