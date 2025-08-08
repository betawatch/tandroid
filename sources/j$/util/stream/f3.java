package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class f3 extends S2 implements j$.util.J {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.n(this, consumer);
    }

    @Override // j$.util.M
    /* renamed from: i */
    public final boolean p(j$.util.function.Y y) {
        long j;
        y.getClass();
        boolean b = b();
        if (b) {
            K2 k2 = (K2) this.h;
            long j2 = this.g;
            int w = k2.w(j2);
            if (k2.c == 0 && w == 0) {
                j = ((long[]) k2.e)[(int) j2];
            } else {
                j = ((long[][]) k2.f)[w][(int) (j2 - k2.d[w])];
            }
            y.accept(j);
        }
        return b;
    }

    @Override // j$.util.stream.S2
    final S2 k(Spliterator spliterator) {
        return new f3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.S2
    final void j() {
        K2 k2 = new K2();
        this.h = k2;
        this.e = this.b.B0(new e3(k2, 0));
        this.f = new a(this, 5);
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final j$.util.J trySplit() {
        return (j$.util.J) super.trySplit();
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final j$.util.M trySplit() {
        return (j$.util.J) super.trySplit();
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.J) super.trySplit();
    }

    @Override // j$.util.M
    /* renamed from: d */
    public final void e(j$.util.function.Y y) {
        if (this.h == null && !this.i) {
            y.getClass();
            h();
            e3 e3Var = new e3(y, 1);
            this.b.A0(this.d, e3Var);
            this.i = true;
            return;
        }
        while (p(y)) {
        }
    }
}
