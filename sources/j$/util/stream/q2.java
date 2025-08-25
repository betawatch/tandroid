package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class q2 extends Z {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(a0 a0Var, int i, long j, long j2) {
        super(a0Var, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.b
    final Spliterator O(b bVar, Spliterator spliterator) {
        long j;
        long j2;
        long F = bVar.F(spliterator);
        long j3 = this.n;
        if (F > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.Y y = (j$.util.Y) bVar.W(spliterator);
            long j4 = this.m;
            return new r3(y, j4, w0.B(j4, j3));
        }
        if (a3.ORDERED.m(bVar.J())) {
            return ((I0) new w2(this, bVar, spliterator, new c0(10), this.m, this.n).invoke()).spliterator();
        }
        j$.util.Y y2 = (j$.util.Y) bVar.W(spliterator);
        long j5 = this.m;
        if (j5 <= F) {
            long j6 = F - j5;
            if (j3 >= 0) {
                j6 = Math.min(j3, j6);
            }
            j = j6;
            j2 = 0;
        } else {
            j = j3;
            j2 = j5;
        }
        return new x3(y2, j2, j);
    }

    @Override // j$.util.stream.b
    final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long F = bVar.F(spliterator);
        if (F > 0 && spliterator.hasCharacteristics(16384)) {
            return w0.G(bVar, w0.C(bVar.I(), spliterator, this.m, this.n), true);
        }
        if (!a3.ORDERED.m(bVar.J())) {
            j$.util.Y y = (j$.util.Y) bVar.W(spliterator);
            long j3 = this.m;
            long j4 = this.n;
            if (j3 <= F) {
                j = j4 >= 0 ? Math.min(j4, F - j3) : F - j3;
                j2 = 0;
            } else {
                j = j4;
                j2 = j3;
            }
            return w0.G(this, new x3(y, j2, j), true);
        }
        return (I0) new w2(this, bVar, spliterator, intFunction, this.m, this.n).invoke();
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        return new p2(this, m2Var);
    }
}
