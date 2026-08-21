package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class K2 extends O2 implements j$.util.W {
    public final /* synthetic */ L2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.O2
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.O2
    public final j$.util.c0 b(Object obj, int i, int i2) {
        return DesugarArrays.b((int[]) obj, i, i2 + i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(L2 l2, int i, int i2, int i3, int i4) {
        super(l2, i, i2, i3, i4);
        this.g = l2;
    }

    @Override // j$.util.stream.O2
    public final j$.util.c0 c(int i, int i2, int i3, int i4) {
        return new K2(this.g, i, i2, i3, i4);
    }
}
