package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class z1 implements N1, a2 {
    private boolean a;
    private double b;
    final /* synthetic */ j$.util.function.h c;

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(int i) {
        t0.k();
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
        r((Double) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.a2
    public final /* synthetic */ void r(Double d) {
        t0.e(this, d);
    }

    z1(j$.util.function.h hVar) {
        this.c = hVar;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        z1 z1Var = (z1) n1;
        if (z1Var.a) {
            return;
        }
        accept(z1Var.b);
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.d2, j$.util.function.l
    public final void accept(double d) {
        if (this.a) {
            this.a = false;
            this.b = d;
        } else {
            this.b = this.c.applyAsDouble(this.b, d);
        }
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.j.a() : j$.util.j.d(this.b);
    }
}
