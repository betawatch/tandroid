package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public abstract class x4 extends s4 implements r4 {
    public long b;

    public /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}
