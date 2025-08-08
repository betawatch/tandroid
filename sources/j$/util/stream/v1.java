package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class v1 extends O1 implements N1, c2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ j$.util.function.t0 c;
    final /* synthetic */ r d;

    @Override // j$.util.stream.d2, j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        t0.b();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(int i) {
        t0.k();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        j((Long) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // j$.util.stream.c2
    public final /* synthetic */ void j(Long l) {
        t0.i(this, l);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        Object obj = this.a;
        this.d.b.accept(obj, ((v1) n1).a);
        this.a = obj;
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.d2
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    v1(Supplier supplier, j$.util.function.t0 t0Var, r rVar) {
        this.b = supplier;
        this.c = t0Var;
        this.d = rVar;
    }
}
