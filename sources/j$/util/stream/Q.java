package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class Q implements w3, x3 {
    private final boolean a;

    protected Q(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.w3
    public final Object a(b bVar, Spliterator spliterator) {
        bVar.getClass();
        bVar.h0(spliterator, bVar.D0(this));
        return null;
    }

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

    @Override // j$.util.stream.w3
    public final Object c(b bVar, Spliterator spliterator) {
        (this.a ? new S(bVar, spliterator, this) : new T(bVar, spliterator, bVar.D0(this))).invoke();
        return null;
    }

    @Override // j$.util.stream.w3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return R2.r;
    }

    @Override // j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void n(long j) {
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }
}
