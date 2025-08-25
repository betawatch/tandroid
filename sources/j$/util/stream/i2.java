package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class i2 implements m2 {
    protected final m2 a;

    @Override // j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w0.a();
        throw null;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(int i) {
        w0.k();
        throw null;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(long j) {
        w0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public i2(m2 m2Var) {
        this.a = (m2) Objects.requireNonNull(m2Var);
    }

    @Override // j$.util.stream.m2
    public void l(long j) {
        this.a.l(j);
    }

    @Override // j$.util.stream.m2
    public void k() {
        this.a.k();
    }

    @Override // j$.util.stream.m2
    public boolean n() {
        return this.a.n();
    }
}
