package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class o0 implements g2 {
    public boolean a;
    public boolean b;

    @Override // j$.util.stream.g2
    public /* synthetic */ void accept(double d) {
        r1.a();
        throw null;
    }

    @Override // j$.util.stream.g2
    public /* synthetic */ void accept(int i) {
        r1.k();
        throw null;
    }

    @Override // j$.util.stream.g2
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

    public o0(p0 p0Var) {
        this.b = !p0Var.b;
    }

    @Override // j$.util.stream.g2
    public final boolean C() {
        return this.a;
    }
}
