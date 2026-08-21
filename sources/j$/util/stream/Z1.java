package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public abstract class Z1 implements d2 {
    public final g2 a;

    @Override // j$.util.stream.d2
    public final /* synthetic */ void E(Double d) {
        r1.e(this, d);
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        E((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    public Z1(g2 g2Var) {
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
