package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class s6 extends w6 implements j$.util.x0 {
    public final /* synthetic */ t6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(t6 t6Var, int i, int i2, int i3, int i4) {
        super(t6Var, i, i2, i3, i4);
        this.g = t6Var;
    }

    @Override // j$.util.stream.w6
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.w6
    public final j$.util.d1 b(Object obj, int i, int i2) {
        return DesugarArrays.b((int[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.w6
    public final j$.util.d1 c(int i, int i2, int i3, int i4) {
        return new s6(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.time.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.time.a.z(this, consumer);
    }
}
