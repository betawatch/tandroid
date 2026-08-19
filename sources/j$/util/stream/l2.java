package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class l2 extends e0 {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(f0 f0Var, int i, long j, long j2) {
        super(f0Var, i, 0);
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
            return new k3(z, j2, q1.A(j2, j));
        }
        if (S2.ORDERED.q(aVar.f)) {
            return ((B0) new p2(this, aVar, spliterator, new Y(22), this.m, this.n).invoke()).spliterator();
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
    public final B0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
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
                return q1.E(this, new q3(z, j2, j), true);
            }
            return (B0) new p2(this, aVar, spliterator, intFunction, this.m, this.n).invoke();
        }
        a aVar2 = aVar;
        while (aVar2.e > 0) {
            aVar2 = aVar2.b;
        }
        return q1.E(aVar, q1.y(aVar2.H(), spliterator, this.m, this.n), true);
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        return new k2(this, f2Var);
    }
}
