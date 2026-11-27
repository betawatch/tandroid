package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class u6 extends w6 implements j$.util.a1 {
    public final /* synthetic */ v6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(v6 v6Var, int i, int i2, int i3, int i4) {
        super(v6Var, i, i2, i3, i4);
        this.g = v6Var;
    }

    @Override // j$.util.stream.w6
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.w6
    public final j$.util.d1 b(Object obj, int i, int i2) {
        return DesugarArrays.c((long[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.w6
    public final j$.util.d1 c(int i, int i2, int i3, int i4) {
        return new u6(this.g, i, i2, i3, i4);
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
