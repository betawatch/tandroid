package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class q6 extends w6 implements j$.util.u0 {
    public final /* synthetic */ r6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(r6 r6Var, int i, int i2, int i3, int i4) {
        super(r6Var, i, i2, i3, i4);
        this.g = r6Var;
    }

    @Override // j$.util.stream.w6
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.w6
    public final j$.util.d1 c(int i, int i2, int i3, int i4) {
        return new q6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.y(this, consumer);
    }
}
