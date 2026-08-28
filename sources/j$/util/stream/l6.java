package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class l6 extends r6 implements j$.util.u0 {
    public final /* synthetic */ m6 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.r6
    public final void a(int i9, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i9]);
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 b(Object obj, int i9, int i10) {
        double[] dArr = (double[]) obj;
        int i11 = i10 + i9;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i9, i11);
        return new j$.util.k1(dArr, i9, i11, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m6 m6Var, int i9, int i10, int i11, int i12) {
        super(m6Var, i9, i10, i11, i12);
        this.g = m6Var;
    }

    @Override // j$.util.stream.r6
    public final j$.util.d1 c(int i9, int i10, int i11, int i12) {
        return new l6(this.g, i9, i10, i11, i12);
    }
}
