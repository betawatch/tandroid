package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class L1 implements N1, c2 {
    private long a;
    final /* synthetic */ long b;
    final /* synthetic */ j$.util.function.U c;

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

    L1(long j, j$.util.function.U u) {
        this.b = j;
        this.c = u;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        accept(((L1) n1).a);
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.d2
    public final void accept(long j) {
        this.a = this.c.applyAsLong(this.a, j);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.a);
    }
}
