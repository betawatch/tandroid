package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class c3 extends T2 implements j$.util.D {
    c3(b bVar, Spliterator spliterator, boolean z) {
        super(bVar, spliterator, z);
    }

    c3(b bVar, Supplier supplier, boolean z) {
        super(bVar, supplier, z);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.M
    public final void e(j$.util.function.m mVar) {
        if (this.h != null || this.i) {
            while (p(mVar)) {
            }
            return;
        }
        mVar.getClass();
        h();
        b3 b3Var = new b3(mVar, 1);
        this.b.C0(this.d, b3Var);
        this.i = true;
    }

    @Override // j$.util.stream.T2
    final void j() {
        H2 h2 = new H2();
        this.h = h2;
        this.e = this.b.D0(new b3(h2, 0));
        this.f = new a(this, 3);
    }

    @Override // j$.util.stream.T2
    final T2 k(Spliterator spliterator) {
        return new c3(this.b, spliterator, this.a);
    }

    @Override // j$.util.M
    public final boolean p(j$.util.function.m mVar) {
        mVar.getClass();
        boolean b = b();
        if (b) {
            H2 h2 = (H2) this.h;
            long j = this.g;
            int w = h2.w(j);
            mVar.accept((h2.c == 0 && w == 0) ? ((double[]) h2.e)[(int) j] : ((double[][]) h2.f)[w][(int) (j - h2.d[w])]);
        }
        return b;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }

    @Override // j$.util.stream.T2, j$.util.Spliterator
    public final j$.util.D trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.stream.T2, j$.util.Spliterator
    public final j$.util.M trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.stream.T2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.D) super.trySplit();
    }
}
