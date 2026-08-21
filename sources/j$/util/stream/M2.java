package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class M2 extends O2 implements j$.util.Z {
    public final /* synthetic */ N2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.O2
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.O2
    public final j$.util.c0 b(Object obj, int i, int i2) {
        return DesugarArrays.c((long[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(N2 n2, int i, int i2, int i3, int i4) {
        super(n2, i, i2, i3, i4);
        this.g = n2;
    }

    @Override // j$.util.stream.O2
    public final j$.util.c0 c(int i, int i2, int i3, int i4) {
        return new M2(this.g, i, i2, i3, i4);
    }
}
