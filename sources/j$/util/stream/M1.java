package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class M1 implements O1, d2 {
    private long a;
    final /* synthetic */ long b;
    final /* synthetic */ j$.util.function.O c;

    M1(long j, j$.util.function.O o) {
        this.b = j;
        this.c = o;
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
        this.a = this.c.applyAsLong(this.a, j);
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

    @Override // j$.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.a);
    }

    @Override // j$.util.stream.O1
    public final void h(O1 o1) {
        accept(((M1) o1).a);
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
        this.a = this.b;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }
}
