package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class p3 extends q3 implements j$.util.J, j$.util.function.T {
    long e;

    p3(j$.util.J j, long j2, long j3) {
        super(j, j2, j3);
    }

    p3(j$.util.J j, p3 p3Var) {
        super(j, p3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.h(this, consumer);
    }

    @Override // j$.util.function.T
    public final void accept(long j) {
        this.e = j;
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.n(this, consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator u(Spliterator spliterator) {
        return new p3((j$.util.J) spliterator, this);
    }

    @Override // j$.util.stream.q3
    protected final void w(Object obj) {
        ((j$.util.function.T) obj).accept(this.e);
    }

    @Override // j$.util.stream.q3
    protected final X2 x() {
        return new W2();
    }
}
