package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public abstract class Z1 implements d2 {
    public final f2 a;

    @Override // j$.util.stream.d2
    public final /* synthetic */ void A(Integer num) {
        q1.g(this, num);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        A((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    public Z1(f2 f2Var) {
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
