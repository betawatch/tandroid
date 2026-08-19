package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class t extends Y1 {
    public boolean b;
    public final j$.util.C c;
    public final /* synthetic */ u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, f2 f2Var) {
        super(f2Var);
        this.d = uVar;
        f2 f2Var2 = this.a;
        Objects.requireNonNull(f2Var2);
        this.c = new j$.util.C(f2Var2, 1);
    }

    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final void y(long j) {
        this.a.y(-1L);
    }

    @Override // j$.util.stream.c2, j$.util.stream.f2
    public final void accept(double d) {
        A a = (A) ((j$.time.t) this.d.n).apply(d);
        if (a != null) {
            try {
                boolean z = this.b;
                j$.util.C c = this.c;
                if (!z) {
                    a.sequential().forEach(c);
                } else {
                    j$.util.T spliterator = a.sequential().spliterator();
                    while (!this.a.C() && spliterator.tryAdvance((DoubleConsumer) c)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (a != null) {
            a.close();
        }
    }

    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final boolean C() {
        this.b = true;
        return this.a.C();
    }
}
