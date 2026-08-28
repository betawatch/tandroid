package j$.util.stream;

import j$.util.DesugarArrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class n6 extends r6 implements j$.util.x0 {
    public final /* synthetic */ o6 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.r6
    public final void a(int i9, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i9]);
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 b(Object obj, int i9, int i10) {
        return DesugarArrays.b((int[]) obj, i9, i10 + i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, int i9, int i10, int i11, int i12) {
        super(o6Var, i9, i10, i11, i12);
        this.g = o6Var;
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 c(int i9, int i10, int i11, int i12) {
        return new n6(this.g, i9, i10, i11, i12);
    }
}
