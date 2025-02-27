package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class i3 extends k3 implements j$.util.G {
    i3(j$.util.G g, long j, long j2) {
        super(g, j, j2);
    }

    i3(j$.util.G g, long j, long j2, long j3, long j4) {
        super(g, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.f(this, consumer);
    }

    @Override // j$.util.stream.m3
    protected final Spliterator b(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new i3((j$.util.G) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.k3
    protected final Object f() {
        return new A0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.m(this, consumer);
    }
}
