package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import j$.util.function.IntConsumer$-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class h5 implements l5 {
    public final n5 a;

    public h5(n5 n5Var) {
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

    @Override // j$.util.stream.l5
    public final /* synthetic */ void o(Integer num) {
        w3.g(this, num);
    }

    @Override // j$.util.stream.n5
    public boolean q() {
        return this.a.q();
    }

    @Override // j$.util.stream.n5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Integer) obj);
    }
}
