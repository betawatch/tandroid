package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public abstract class g2 implements k2 {
    protected final m2 a;

    @Override // j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w0.a();
        throw null;
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ void accept(long j) {
        w0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.k2
    public final /* synthetic */ void m(Integer num) {
        w0.g(this, num);
    }

    public g2(m2 m2Var) {
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
