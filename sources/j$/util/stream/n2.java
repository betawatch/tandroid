package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class n2 extends w {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x xVar, int i, long j, long j2) {
        super(xVar, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        long F = aVar.F(spliterator);
        long j = this.n;
        if (F > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.T t = (j$.util.T) aVar.S(spliterator);
            long j2 = this.m;
            return new i3(t, j2, q1.A(j2, j));
        }
        if (S2.ORDERED.q(aVar.f)) {
            return ((B0) new p2(this, aVar, spliterator, new Y(23), this.m, this.n).invoke()).spliterator();
        }
        j$.util.T t2 = (j$.util.T) aVar.S(spliterator);
        long j3 = this.m;
        if (j3 <= F) {
            long j4 = F - j3;
            if (j >= 0) {
                j4 = Math.min(j, j4);
            }
            j = j4;
            j3 = 0;
        }
        return new o3(t2, j3, j);
    }

    @Override // j$.util.stream.a
    public final B0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long F = aVar.F(spliterator);
        if (F > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar2 = aVar;
            while (aVar2.e > 0) {
                aVar2 = aVar2.b;
            }
            return q1.C(aVar, q1.y(aVar2.H(), spliterator, this.m, this.n), true);
        }
        if (!S2.ORDERED.q(aVar.f)) {
            j$.util.T t = (j$.util.T) aVar.S(spliterator);
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
            return q1.C(this, new o3(t, j2, j), true);
        }
        return (B0) new p2(this, aVar, spliterator, intFunction, this.m, this.n).invoke();
    }

    @Override // j$.util.stream.a
    public final f2 M(int i, f2 f2Var) {
        return new m2(this, f2Var);
    }
}
