package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class p6 extends r6 implements j$.util.a1 {
    public final /* synthetic */ q6 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.r6
    public final void a(int i7, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i7]);
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 b(Object obj, int i7, int i10) {
        return DesugarArrays.c((long[]) obj, i7, i10 + i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(q6 q6Var, int i7, int i10, int i11, int i12) {
        super(q6Var, i7, i10, i11, i12);
        this.g = q6Var;
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 c(int i7, int i10, int i11, int i12) {
        return new p6(this.g, i7, i10, i11, i12);
    }
}
