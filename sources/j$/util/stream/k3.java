package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class k3 extends l3 implements j$.util.Z {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.stream.n3
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new k3((j$.util.Z) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.l3
    public final Object b() {
        return new y0(1);
    }
}
