package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class i5 implements m5 {
    public final n5 a;

    public i5(n5 n5Var) {
        this.a = (n5) Objects.requireNonNull(n5Var);
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.n5
    public void n(long j) {
        this.a.n(j);
    }

    @Override // j$.util.stream.n5
    public boolean q() {
        return this.a.q();
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void x(Long l) {
        w3.i(this, l);
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        x((Long) obj);
    }
}
