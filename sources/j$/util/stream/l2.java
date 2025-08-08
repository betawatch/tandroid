package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class l2 extends z {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l2(A a, int i, long j, long j2) {
        super(a, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.b
    final Spliterator u0(b bVar, Spliterator spliterator) {
        long j;
        long j2;
        long l0 = bVar.l0(spliterator);
        long j3 = this.n;
        if (l0 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.D d = (j$.util.D) bVar.C0(spliterator);
            long j4 = this.m;
            return new g3(d, j4, t0.x(j4, j3));
        }
        if (Q2.ORDERED.i(bVar.p0())) {
            return ((F0) new n2(this, bVar, spliterator, new c0(9), this.m, this.n).invoke()).spliterator();
        }
        j$.util.D d2 = (j$.util.D) bVar.C0(spliterator);
        long j5 = this.m;
        if (j5 <= l0) {
            long j6 = l0 - j5;
            if (j3 >= 0) {
                j6 = Math.min(j3, j6);
            }
            j = j6;
            j2 = 0;
        } else {
            j = j3;
            j2 = j5;
        }
        return new m3(d2, j2, j);
    }

    @Override // j$.util.stream.b
    final F0 t0(b bVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long l0 = bVar.l0(spliterator);
        if (l0 > 0 && spliterator.hasCharacteristics(16384)) {
            return t0.F(bVar, t0.y(bVar.o0(), spliterator, this.m, this.n), true);
        }
        if (!Q2.ORDERED.i(bVar.p0())) {
            j$.util.D d = (j$.util.D) bVar.C0(spliterator);
            long j3 = this.m;
            long j4 = this.n;
            if (j3 <= l0) {
                j = j4 >= 0 ? Math.min(j4, l0 - j3) : l0 - j3;
                j2 = 0;
            } else {
                j = j4;
                j2 = j3;
            }
            return t0.F(this, new m3(d, j2, j), true);
        }
        return (F0) new n2(this, bVar, spliterator, intFunction, this.m, this.n).invoke();
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        return new k2(this, d2Var);
    }
}
