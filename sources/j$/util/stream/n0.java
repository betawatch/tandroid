package j$.util.stream;

import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class n0 implements f2 {
    public boolean a;
    public boolean b;

    @Override // j$.util.stream.f2
    public /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    @Override // j$.util.stream.f2
    public /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void y(long j) {
    }

    public n0(o0 o0Var) {
        this.b = !o0Var.b;
    }

    @Override // j$.util.stream.f2
    public final boolean C() {
        return this.a;
    }
}
