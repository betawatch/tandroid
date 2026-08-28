package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class u4 extends p4 implements o4 {
    public long b;

    public /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    public /* synthetic */ void accept(int i9) {
        t3.J();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        t3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        this.b = 0L;
    }
}
