package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class H1 implements N1, b2 {
    private int a;
    final /* synthetic */ int b;
    final /* synthetic */ j$.util.function.C c;

    @Override // j$.util.stream.d2, j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        t0.b();
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
        o((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.b2
    public final /* synthetic */ void o(Integer num) {
        t0.g(this, num);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    H1(int i, j$.util.function.C c) {
        this.b = i;
        this.c = c;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        accept(((H1) n1).a);
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.d2
    public final void accept(int i) {
        this.a = this.c.applyAsInt(this.a, i);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }
}
