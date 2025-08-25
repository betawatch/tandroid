package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class P implements G3, H3 {
    private final boolean a;

    public /* synthetic */ void accept(double d) {
        w0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        w0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ boolean n() {
        return false;
    }

    protected P(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.G3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return a3.r;
    }

    public final void e(b bVar, Spliterator spliterator) {
        if (this.a) {
            new Q(bVar, spliterator, this).invoke();
        } else {
            new S(bVar, spliterator, bVar.V(this)).invoke();
        }
    }
}
