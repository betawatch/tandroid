package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public abstract class f2 implements j2 {
    protected final m2 a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.j2
    public final /* synthetic */ void p(Double d) {
        w0.e(this, d);
    }

    public f2(m2 m2Var) {
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
