package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public abstract class t1 implements n5 {
    public boolean a;
    public boolean b;

    public t1(u1 u1Var) {
        this.b = !u1Var.b;
    }

    @Override // j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return this.a;
    }

    @Override // j$.util.stream.n5
    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.n5
    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}
