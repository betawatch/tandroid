package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class b2 implements f2 {
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

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public b2(f2 f2Var) {
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
