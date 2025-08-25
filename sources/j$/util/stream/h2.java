package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class h2 implements l2 {
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.l2
    public final /* synthetic */ void j(Long l) {
        w0.i(this, l);
    }

    public h2(m2 m2Var) {
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
