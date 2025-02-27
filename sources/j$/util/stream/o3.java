package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class o3 extends q3 implements j$.util.G, j$.util.function.E {
    int e;

    o3(j$.util.G g, long j, long j2) {
        super(g, j, j2);
    }

    o3(j$.util.G g, o3 o3Var) {
        super(g, o3Var);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.f(this, consumer);
    }

    @Override // j$.util.function.E
    public final void accept(int i) {
        this.e = i;
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.m(this, consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator u(Spliterator spliterator) {
        return new o3((j$.util.G) spliterator, this);
    }

    @Override // j$.util.stream.q3
    protected final void w(Object obj) {
        ((j$.util.function.E) obj).accept(this.e);
    }

    @Override // j$.util.stream.q3
    protected final X2 x() {
        return new V2();
    }
}
