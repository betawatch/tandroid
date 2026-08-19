package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class a2 implements e2 {
    public final f2 a;

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void s(Long l) {
        q1.i(this, l);
    }

    public a2(f2 f2Var) {
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
