package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class R1 extends M1 implements L1 {
    public long b;

    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    public /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.f2
    public final void y(long j) {
        this.b = 0L;
    }
}
