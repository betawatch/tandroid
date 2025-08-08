package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class A1 extends O1 implements N1, a2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ j$.util.function.n0 c;
    final /* synthetic */ r d;

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

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        Object obj = this.a;
        this.d.b.accept(obj, ((A1) n1).a);
        this.a = obj;
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.d2, j$.util.function.l
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    A1(Supplier supplier, j$.util.function.n0 n0Var, r rVar) {
        this.b = supplier;
        this.c = n0Var;
        this.d = rVar;
    }
}
