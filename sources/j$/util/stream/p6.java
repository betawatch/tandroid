package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class p6 extends r6 implements j$.util.a1 {
    public final /* synthetic */ q6 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.r6
    public final void a(int i9, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i9]);
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 b(Object obj, int i9, int i10) {
        return DesugarArrays.c((long[]) obj, i9, i10 + i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(q6 q6Var, int i9, int i10, int i11, int i12) {
        super(q6Var, i9, i10, i11, i12);
        this.g = q6Var;
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 c(int i9, int i10, int i11, int i12) {
        return new p6(this.g, i9, i10, i11, i12);
    }
}
