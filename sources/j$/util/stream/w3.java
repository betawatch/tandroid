package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class w3 extends z3 implements j$.util.W, DoubleConsumer {
    double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.T.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.T.f(this, consumer);
    }

    @Override // j$.util.stream.C3
    protected final Spliterator c(Spliterator spliterator) {
        return new w3((j$.util.W) spliterator, this);
    }

    @Override // j$.util.stream.z3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    @Override // j$.util.stream.z3
    protected final g3 h(int i) {
        return new d3(i);
    }
}
