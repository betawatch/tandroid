package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class g3 extends T2 implements j$.util.J {
    g3(b bVar, Spliterator spliterator, boolean z) {
        super(bVar, spliterator, z);
    }

    g3(b bVar, Supplier supplier, boolean z) {
        super(bVar, supplier, z);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.h(this, consumer);
    }

    @Override // j$.util.M
    /* renamed from: d */
    public final void e(j$.util.function.T t) {
        if (this.h != null || this.i) {
            while (p(t)) {
            }
            return;
        }
        t.getClass();
        h();
        f3 f3Var = new f3(t, 1);
        this.b.C0(this.d, f3Var);
        this.i = true;
    }

    @Override // j$.util.M
    /* renamed from: i */
    public final boolean p(j$.util.function.T t) {
        t.getClass();
        boolean b = b();
        if (b) {
            L2 l2 = (L2) this.h;
            long j = this.g;
            int w = l2.w(j);
            t.accept((l2.c == 0 && w == 0) ? ((long[]) l2.e)[(int) j] : ((long[][]) l2.f)[w][(int) (j - l2.d[w])]);
        }
        return b;
    }

    @Override // j$.util.stream.T2
    final void j() {
        L2 l2 = new L2();
        this.h = l2;
        this.e = this.b.D0(new f3(l2, 0));
        this.f = new a(this, 5);
    }

    @Override // j$.util.stream.T2
    final T2 k(Spliterator spliterator) {
        return new g3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.n(this, consumer);
    }

    @Override // j$.util.stream.T2, j$.util.Spliterator
    public final j$.util.J trySplit() {
        return (j$.util.J) super.trySplit();
    }

    @Override // j$.util.stream.T2, j$.util.Spliterator
    public final j$.util.M trySplit() {
        return (j$.util.J) super.trySplit();
    }

    @Override // j$.util.stream.T2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.J) super.trySplit();
    }
}
