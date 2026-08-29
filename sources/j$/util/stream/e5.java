package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class e5 implements i5 {
    public final j5 a;

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        t3.J();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        x((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void x(Long l10) {
        t3.H(this, l10);
    }

    public e5(j5 j5Var) {
        this.a = (j5) Objects.requireNonNull(j5Var);
    }

    @Override // j$.util.stream.j5
    public void o(long j10) {
        this.a.o(j10);
    }

    @Override // j$.util.stream.j5
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.j5
    public boolean q() {
        return this.a.q();
    }
}
