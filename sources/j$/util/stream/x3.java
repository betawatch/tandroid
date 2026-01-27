package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class x3 extends z3 implements j$.util.Z, IntConsumer {
    int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.T.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.T.g(this, consumer);
    }

    @Override // j$.util.stream.C3
    protected final Spliterator c(Spliterator spliterator) {
        return new x3((j$.util.Z) spliterator, this);
    }

    @Override // j$.util.stream.z3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    @Override // j$.util.stream.z3
    protected final g3 h(int i) {
        return new e3(i);
    }
}
