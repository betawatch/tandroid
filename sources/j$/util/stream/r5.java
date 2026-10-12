package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class r5 extends x {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(z zVar, int i10, long j10, long j11) {
        super(zVar, i10);
        this.s = j10;
        this.t = j11;
    }

    @Override // j$.util.stream.a
    public final Spliterator O0(a aVar, Spliterator spliterator) {
        long k02 = aVar.k0(spliterator);
        if (k02 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.u0 u0Var = (j$.util.u0) aVar.H0(spliterator);
            long j10 = this.s;
            return new l7(u0Var, j10, t3.Z(j10, this.t));
        }
        if (v6.ORDERED.m(aVar.m)) {
            return ((e2) new t5(this, aVar, spliterator, new a1(23), this.s, this.t).invoke()).spliterator();
        }
        j$.util.u0 u0Var2 = (j$.util.u0) aVar.H0(spliterator);
        long j11 = this.s;
        long j12 = this.t;
        if (j11 <= k02) {
            long j13 = k02 - j11;
            if (j12 >= 0) {
                j13 = Math.min(j12, j13);
            }
            j12 = j13;
            j11 = 0;
        }
        return new r7(u0Var2, j11, j12);
    }

    @Override // j$.util.stream.a
    public final e2 N0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        long j10;
        long j11;
        long k02 = t3Var.k0(spliterator);
        if (k02 > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar = (a) t3Var;
            while (aVar.l > 0) {
                aVar = aVar.i;
            }
            return t3.b0(t3Var, t3.X(aVar.M0(), spliterator, this.s, this.t), true);
        }
        if (!v6.ORDERED.m(((a) t3Var).m)) {
            j$.util.u0 u0Var = (j$.util.u0) t3Var.H0(spliterator);
            long j12 = this.s;
            long j13 = this.t;
            if (j12 <= k02) {
                long j14 = k02 - j12;
                j10 = j13 >= 0 ? Math.min(j13, j14) : j14;
                j11 = 0;
            } else {
                j10 = j13;
                j11 = j12;
            }
            return t3.b0(this, new r7(u0Var, j11, j10), true);
        }
        return (e2) new t5(this, t3Var, spliterator, intFunction, this.s, this.t).invoke();
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        return new q5(this, j5Var);
    }
}
