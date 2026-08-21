package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class S1 extends N1 implements M1 {
    public long b;

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
    public final void y(long j) {
        this.b = 0L;
    }
}
