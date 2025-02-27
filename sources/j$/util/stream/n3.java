package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class n3 extends q3 implements j$.util.D, j$.util.function.m {
    double e;

    n3(j$.util.D d, long j, long j2) {
        super(d, j, j2);
    }

    n3(j$.util.D d, n3 n3Var) {
        super(d, n3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.function.m
    public final void accept(double d) {
        this.e = d;
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator u(Spliterator spliterator) {
        return new n3((j$.util.D) spliterator, this);
    }

    @Override // j$.util.stream.q3
    protected final void w(Object obj) {
        ((j$.util.function.m) obj).accept(this.e);
    }

    @Override // j$.util.stream.q3
    protected final X2 x() {
        return new U2();
    }
}
