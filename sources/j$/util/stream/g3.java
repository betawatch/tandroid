package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class g3 extends j3 implements j$.util.D {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }

    @Override // j$.util.stream.l3
    protected final Spliterator b(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new g3((j$.util.D) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.j3
    protected final Object f() {
        return new y0(1);
    }
}
