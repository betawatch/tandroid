package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class q0 implements e2 {
    boolean a;
    boolean b;

    q0(r0 r0Var) {
        boolean z;
        z = r0Var.b;
        this.b = !z;
    }

    @Override // j$.util.stream.e2, j$.util.function.m
    public /* synthetic */ void accept(double d) {
        u0.b();
        throw null;
    }

    @Override // j$.util.stream.e2
    public /* synthetic */ void accept(int i) {
        u0.k();
        throw null;
    }

    @Override // j$.util.stream.e2
    public /* synthetic */ void accept(long j) {
        u0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void n(long j) {
    }

    @Override // j$.util.stream.e2
    public final boolean q() {
        return this.a;
    }
}
