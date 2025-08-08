package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
final class F1 extends O1 implements N1 {
    final /* synthetic */ Supplier b;
    final /* synthetic */ BiConsumer c;
    final /* synthetic */ BiConsumer d;

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

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.N1
    public final void h(N1 n1) {
        this.d.accept(this.a, ((F1) n1).a);
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        this.c.accept(this.a, obj);
    }

    F1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = biConsumer2;
    }
}
