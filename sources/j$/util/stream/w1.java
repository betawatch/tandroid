package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class w1 extends P1 implements O1, d2 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ j$.util.function.l0 c;
    final /* synthetic */ j$.util.function.f d;

    w1(Supplier supplier, j$.util.function.l0 l0Var, j$.util.function.f fVar) {
        this.b = supplier;
        this.c = l0Var;
        this.d = fVar;
    }

    @Override // j$.util.stream.e2, j$.util.function.m
    public final /* synthetic */ void accept(double d) {
        u0.b();
        throw null;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void accept(int i) {
        u0.k();
        throw null;
    }

    @Override // j$.util.stream.e2
    public final void accept(long j) {
        this.c.accept(this.a, j);
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

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }

    @Override // j$.util.stream.O1
    public final void h(O1 o1) {
        this.a = this.d.apply(this.a, ((w1) o1).a);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void j(Long l) {
        u0.i(this, l);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.e2
    public final void n(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }
}
