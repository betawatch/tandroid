package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class C1 extends P1 implements O1 {
    final /* synthetic */ Object b;
    final /* synthetic */ BiFunction c;
    final /* synthetic */ j$.util.function.f d;

    C1(Object obj, BiFunction biFunction, j$.util.function.f fVar) {
        this.b = obj;
        this.c = biFunction;
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
    public final /* synthetic */ void accept(long j) {
        u0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.O1
    public final void h(O1 o1) {
        this.a = this.d.apply(this.a, ((C1) o1).a);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.e2
    public final void n(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }
}
