package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class h3 extends k3 implements j$.util.D {
    h3(j$.util.D d, long j, long j2) {
        super(d, j, j2);
    }

    h3(j$.util.D d, long j, long j2, long j3, long j4) {
        super(d, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.stream.m3
    protected final Spliterator b(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new h3((j$.util.D) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.k3
    protected final Object f() {
        return new y0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }
}
