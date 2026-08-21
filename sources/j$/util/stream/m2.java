package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class m2 extends f0 {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(g0 g0Var, int i, long j, long j2) {
        super(g0Var, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        long F = aVar.F(spliterator);
        long j = this.n;
        if (F > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.Z z = (j$.util.Z) aVar.S(spliterator);
            long j2 = this.m;
            return new k3(z, j2, r1.A(j2, j));
        }
        if (S2.ORDERED.q(aVar.f)) {
            return ((C0) new q2(this, aVar, spliterator, new Z(22), this.m, this.n).invoke()).spliterator();
        }
        j$.util.Z z2 = (j$.util.Z) aVar.S(spliterator);
        long j3 = this.m;
        if (j3 <= F) {
            long j4 = F - j3;
            if (j >= 0) {
                j4 = Math.min(j, j4);
            }
            j = j4;
            j3 = 0;
        }
        return new q3(z2, j3, j);
    }

    @Override // j$.util.stream.a
    public final C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long F = aVar.F(spliterator);
        if (F <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (!S2.ORDERED.q(aVar.f)) {
                j$.util.Z z = (j$.util.Z) aVar.S(spliterator);
                long j3 = this.m;
                long j4 = this.n;
                if (j3 <= F) {
                    long j5 = F - j3;
                    j = j4 >= 0 ? Math.min(j4, j5) : j5;
                    j2 = 0;
                } else {
                    j = j4;
                    j2 = j3;
                }
                return r1.E(this, new q3(z, j2, j), true);
            }
            return (C0) new q2(this, aVar, spliterator, intFunction, this.m, this.n).invoke();
        }
        a aVar2 = aVar;
        while (aVar2.e > 0) {
            aVar2 = aVar2.b;
        }
        return r1.E(aVar, r1.y(aVar2.H(), spliterator, this.m, this.n), true);
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        return new l2(this, g2Var);
    }
}
