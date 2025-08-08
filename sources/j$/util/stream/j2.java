package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class j2 extends g0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j2(h0 h0Var, int i, long j, long j2) {
        super(h0Var, i, 0);
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
            j$.util.J j4 = (j$.util.J) bVar.C0(spliterator);
            long j5 = this.m;
            return new i3(j4, j5, t0.x(j5, j3));
        }
        if (Q2.ORDERED.i(bVar.p0())) {
            return ((F0) new n2(this, bVar, spliterator, new c0(8), this.m, this.n).invoke()).spliterator();
        }
        j$.util.J j6 = (j$.util.J) bVar.C0(spliterator);
        long j7 = this.m;
        if (j7 <= l0) {
            long j8 = l0 - j7;
            if (j3 >= 0) {
                j8 = Math.min(j3, j8);
            }
            j = j8;
            j2 = 0;
        } else {
            j = j3;
            j2 = j7;
        }
        return new o3(j6, j2, j);
    }

    @Override // j$.util.stream.b
    final F0 t0(b bVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        long l0 = bVar.l0(spliterator);
        if (l0 > 0 && spliterator.hasCharacteristics(16384)) {
            return t0.H(bVar, t0.y(bVar.o0(), spliterator, this.m, this.n), true);
        }
        if (!Q2.ORDERED.i(bVar.p0())) {
            j$.util.J j3 = (j$.util.J) bVar.C0(spliterator);
            long j4 = this.m;
            long j5 = this.n;
            if (j4 <= l0) {
                j = j5 >= 0 ? Math.min(j5, l0 - j4) : l0 - j4;
                j2 = 0;
            } else {
                j = j5;
                j2 = j4;
            }
            return t0.H(this, new o3(j3, j2, j), true);
        }
        return (F0) new n2(this, bVar, spliterator, intFunction, this.m, this.n).invoke();
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        return new i2(this, d2Var);
    }
}
