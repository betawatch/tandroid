package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public abstract class Y1 implements c2 {
    public final f2 a;

    @Override // j$.util.stream.c2
    public final /* synthetic */ void E(Double d) {
        q1.e(this, d);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        q1.l();
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

    public Y1(f2 f2Var) {
        this.a = (f2) Objects.requireNonNull(f2Var);
    }

    @Override // j$.util.stream.f2
    public void y(long j) {
        this.a.y(j);
    }

    @Override // j$.util.stream.f2
    public void x() {
        this.a.x();
    }

    @Override // j$.util.stream.f2
    public boolean C() {
        return this.a.C();
    }
}
