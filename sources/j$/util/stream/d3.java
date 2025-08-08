package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class d3 extends S2 implements j$.util.G {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.m(this, consumer);
    }

    @Override // j$.util.M
    /* renamed from: g */
    public final boolean p(j$.util.function.G g) {
        int i;
        g.getClass();
        boolean b = b();
        if (b) {
            I2 i2 = (I2) this.h;
            long j = this.g;
            int w = i2.w(j);
            if (i2.c == 0 && w == 0) {
                i = ((int[]) i2.e)[(int) j];
            } else {
                i = ((int[][]) i2.f)[w][(int) (j - i2.d[w])];
            }
            g.accept(i);
        }
        return b;
    }

    @Override // j$.util.stream.S2
    final S2 k(Spliterator spliterator) {
        return new d3(this.b, spliterator, this.a);
    }

    @Override // j$.util.stream.S2
    final void j() {
        I2 i2 = new I2();
        this.h = i2;
        this.e = this.b.B0(new c3(i2, 0));
        this.f = new a(this, 4);
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final j$.util.G trySplit() {
        return (j$.util.G) super.trySplit();
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final j$.util.M trySplit() {
        return (j$.util.G) super.trySplit();
    }

    @Override // j$.util.stream.S2, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.G) super.trySplit();
    }

    @Override // j$.util.M
    /* renamed from: c */
    public final void e(j$.util.function.G g) {
        if (this.h == null && !this.i) {
            g.getClass();
            h();
            c3 c3Var = new c3(g, 1);
            this.b.A0(this.d, c3Var);
            this.i = true;
            return;
        }
        while (p(g)) {
        }
    }
}
