package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class u extends c5 {
    public boolean b;
    public final j$.util.e0 c;
    public final /* synthetic */ v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, j5 j5Var) {
        super(j5Var);
        this.d = vVar;
        j5 j5Var2 = this.a;
        Objects.requireNonNull(j5Var2);
        this.c = new j$.util.e0(j5Var2, 1);
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final void o(long j10) {
        this.a.o(-1L);
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) {
        c0 c0Var = (c0) ((j$.time.t) this.d.t).apply(d);
        if (c0Var != null) {
            try {
                boolean z4 = this.b;
                j$.util.e0 e0Var = this.c;
                if (!z4) {
                    c0Var.sequential().forEach(e0Var);
                } else {
                    j$.util.u0 spliterator = c0Var.sequential().spliterator();
                    while (!this.a.q() && spliterator.tryAdvance((DoubleConsumer) e0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    c0Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (c0Var != null) {
            c0Var.close();
        }
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final boolean q() {
        this.b = true;
        return this.a.q();
    }
}
