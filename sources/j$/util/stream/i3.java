package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class i3 extends l3 implements j$.util.T {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.z(this, consumer);
    }

    @Override // j$.util.stream.n3
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new i3((j$.util.T) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.l3
    public final Object b() {
        return new u0(1);
    }
}
