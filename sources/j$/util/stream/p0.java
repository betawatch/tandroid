package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class p0 implements b8, c8 {
    public final boolean a;

    public /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
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
    public final /* synthetic */ void o(long j10) {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    public p0(boolean z4) {
        this.a = z4;
    }

    @Override // j$.util.stream.b8
    public final int v() {
        if (this.a) {
            return 0;
        }
        return v6.r;
    }

    public final void a(t3 t3Var, Spliterator spliterator) {
        if (this.a) {
            new q0(t3Var, spliterator, this).invoke();
        } else {
            new r0(t3Var, spliterator, t3Var.G0(this)).invoke();
        }
    }
}
