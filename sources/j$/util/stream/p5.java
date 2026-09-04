package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class p5 extends g1 {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(i1 i1Var, int i10, long j3, long j10) {
        super(i1Var, i10);
        this.s = j3;
        this.t = j10;
    }

    @Override // j$.util.stream.a
    public final Spliterator O0(a aVar, Spliterator spliterator) {
        long k02 = aVar.k0(spliterator);
        if (k02 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.a1 a1Var = (j$.util.a1) aVar.H0(spliterator);
            long j3 = this.s;
            return new n7(a1Var, j3, t3.Z(j3, this.t));
        }
        if (v6.ORDERED.m(aVar.m)) {
            return ((e2) new t5(this, aVar, spliterator, new a1(22), this.s, this.t).invoke()).spliterator();
        }
        j$.util.a1 a1Var2 = (j$.util.a1) aVar.H0(spliterator);
        long j10 = this.s;
        long j11 = this.t;
        if (j10 <= k02) {
            long j12 = k02 - j10;
            if (j11 >= 0) {
                j12 = Math.min(j11, j12);
            }
            j11 = j12;
            j10 = 0;
        }
        return new t7(a1Var2, j10, j11);
    }

    @Override // j$.util.stream.a
    public final e2 N0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        long j3;
        long j10;
        long k02 = t3Var.k0(spliterator);
        if (k02 > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar = (a) t3Var;
            while (aVar.l > 0) {
                aVar = aVar.i;
            }
            return t3.d0(t3Var, t3.X(aVar.M0(), spliterator, this.s, this.t), true);
        }
        if (!v6.ORDERED.m(((a) t3Var).m)) {
            j$.util.a1 a1Var = (j$.util.a1) t3Var.H0(spliterator);
            long j11 = this.s;
            long j12 = this.t;
            if (j11 <= k02) {
                long j13 = k02 - j11;
                j3 = j12 >= 0 ? Math.min(j12, j13) : j13;
                j10 = 0;
            } else {
                j3 = j12;
                j10 = j11;
            }
            return t3.d0(this, new t7(a1Var, j10, j3), true);
        }
        return (e2) new t5(this, t3Var, spliterator, intFunction, this.s, this.t).invoke();
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        return new o5(this, j5Var);
    }
}
