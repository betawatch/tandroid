package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class Z1 implements d2 {
    protected final d2 a;

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

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(long j) {
        t0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    public Z1(d2 d2Var) {
        d2Var.getClass();
        this.a = d2Var;
    }

    @Override // j$.util.stream.d2
    public void n(long j) {
        this.a.n(j);
    }

    @Override // j$.util.stream.d2
    public void m() {
        this.a.m();
    }

    @Override // j$.util.stream.d2
    public boolean q() {
        return this.a.q();
    }
}
