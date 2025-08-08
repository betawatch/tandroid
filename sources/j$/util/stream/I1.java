package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class I1 implements N1, b2 {
    private boolean a;
    private int b;
    final /* synthetic */ j$.util.function.C c;

    @Override // j$.util.stream.d2, j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        t0.b();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(long j) {
        t0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        o((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void o(Integer num) {
        t0.g(this, num);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    I1(j$.util.function.C c) {
        this.c = c;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        I1 i1 = (I1) n1;
        if (i1.a) {
            return;
        }
        accept(i1.b);
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.d2
    public final void accept(int i) {
        if (this.a) {
            this.a = false;
            this.b = i;
        } else {
            this.b = this.c.applyAsInt(this.b, i);
        }
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.k.a() : j$.util.k.d(this.b);
    }
}
