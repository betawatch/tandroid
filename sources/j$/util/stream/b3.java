package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class b3 extends S2 implements j$.util.D {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }

    @Override // j$.util.M
    public final boolean p(j$.util.function.l lVar) {
        double d;
        lVar.getClass();
        boolean b = b();
        if (b) {
            G2 g2 = (G2) this.h;
            long j = this.g;
            int w = g2.w(j);
            if (g2.c == 0 && w == 0) {
                d = ((double[]) g2.e)[(int) j];
            } else {
                d = ((double[][]) g2.f)[w][(int) (j - g2.d[w])];
            }
            lVar.accept(d);
        }
        return b;
    }

    @Override // j$.util.stream.S2
    final S2 k(Spliterator spliterator) {
        return new b3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.S2
    final void j() {
        G2 g2 = new G2();
        this.h = g2;
        this.e = this.b.B0(new a3(g2, 0));
        this.f = new a(this, 3);
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final j$.util.D trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final j$.util.M trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.M
    public final void e(j$.util.function.l lVar) {
        if (this.h == null && !this.i) {
            lVar.getClass();
            h();
            a3 a3Var = new a3(lVar, 1);
            this.b.A0(this.d, a3Var);
            this.i = true;
            return;
        }
        while (p(lVar)) {
        }
    }
}
