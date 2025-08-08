package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class P implements v3, w3 {
    private final boolean a;

    public /* synthetic */ void accept(double d) {
        t0.b();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        t0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        t0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void n(long j) {
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    protected P(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.v3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return Q2.r;
    }

    @Override // j$.util.stream.v3
    public final Object c(b bVar, Spliterator spliterator) {
        if (this.a) {
            new Q(bVar, spliterator, this).invoke();
            return null;
        }
        new S(bVar, spliterator, bVar.B0(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.v3
    public final Object a(b bVar, Spliterator spliterator) {
        bVar.f0(spliterator, bVar.B0(this));
        return null;
    }
}
