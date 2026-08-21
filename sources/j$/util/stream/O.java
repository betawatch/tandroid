package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class O implements y3, z3 {
    public final boolean a;

    @Override // j$.util.stream.g2
    public final /* synthetic */ boolean C() {
        return false;
    }

    public /* synthetic */ void accept(double d) {
        r1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        r1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        r1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void y(long j) {
    }

    public O(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.y3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return S2.r;
    }

    public final void e(a aVar, Spliterator spliterator) {
        if (this.a) {
            new P(aVar, spliterator, this).invoke();
        } else {
            new Q(aVar, spliterator, aVar.R(this)).invoke();
        }
    }
}
