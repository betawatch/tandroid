package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class A1 implements O1, b2 {
    private boolean a;
    private double b;
    final /* synthetic */ j$.util.function.i c;

    A1(j$.util.function.i iVar) {
        this.c = iVar;
    }

    @Override // j$.util.stream.e2, j$.util.function.m
    public final void accept(double d) {
        if (this.a) {
            this.a = false;
        } else {
            d = this.c.applyAsDouble(this.b, d);
        }
        this.b = d;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void accept(int i) {
        u0.k();
        throw null;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void accept(long j) {
        u0.l();
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

    @Override // j$.util.function.Supplier
    public final Object get() {
        return this.a ? j$.util.j.a() : j$.util.j.d(this.b);
    }

    @Override // j$.util.stream.O1
    public final void h(O1 o1) {
        A1 a1 = (A1) o1;
        if (a1.a) {
            return;
        }
        accept(a1.b);
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.e2
    public final void n(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void r(Double d) {
        u0.e(this, d);
    }
}
