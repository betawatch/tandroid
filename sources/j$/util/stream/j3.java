package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class j3 extends k3 implements j$.util.J {
    j3(j$.util.J j, long j2, long j3) {
        super(j, j2, j3);
    }

    j3(j$.util.J j, long j2, long j3, long j4, long j5) {
        super(j, j2, j3, j4, j5);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.h(this, consumer);
    }

    @Override // j$.util.stream.m3
    protected final Spliterator b(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new j3((j$.util.J) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.k3
    protected final Object f() {
        return new D0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.n(this, consumer);
    }
}
