package j$.util.stream;

import j$.util.function.IntConsumer$-CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class q1 extends t1 implements l5 {
    @Override // j$.util.stream.t1, j$.util.stream.n5
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void o(Integer num) {
        w3.g(this, num);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Integer) obj);
    }
}
