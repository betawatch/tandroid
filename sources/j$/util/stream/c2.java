package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class c2 implements g2 {
    public final g2 a;

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(double d) {
        r1.a();
        throw null;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(int i) {
        r1.k();
        throw null;
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void accept(long j) {
        r1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public c2(g2 g2Var) {
        this.a = (g2) Objects.requireNonNull(g2Var);
    }

    @Override // j$.util.stream.g2
    public void y(long j) {
        this.a.y(j);
    }

    @Override // j$.util.stream.g2
    public void x() {
        this.a.x();
    }

    @Override // j$.util.stream.g2
    public boolean C() {
        return this.a.C();
    }
}
