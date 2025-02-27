package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import org.telegram.messenger.LiteMode;

/* loaded from: classes2.dex */
final class k2 extends g0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k2(b bVar, int i, long j, long j2) {
        super(bVar, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.b
    final F0 v0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        long j;
        long j2;
        long n0 = bVar.n0(spliterator);
        if (n0 > 0 && spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            return t0.H(bVar, t0.y(bVar.q0(), spliterator, this.m, this.n), true);
        }
        if (R2.ORDERED.d(bVar.r0())) {
            return (F0) new o2(this, bVar, spliterator, intFunction, this.m, this.n).invoke();
        }
        j$.util.J j3 = (j$.util.J) bVar.E0(spliterator);
        long j4 = this.m;
        long j5 = this.n;
        if (j4 <= n0) {
            j = j5 >= 0 ? Math.min(j5, n0 - j4) : n0 - j4;
            j2 = 0;
        } else {
            j = j5;
            j2 = j4;
        }
        return t0.H(this, new p3(j3, j2, j), true);
    }

    @Override // j$.util.stream.b
    final Spliterator w0(b bVar, Spliterator spliterator) {
        long j;
        long j2;
        long n0 = bVar.n0(spliterator);
        long j3 = this.n;
        if (n0 > 0 && spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            j$.util.J j4 = (j$.util.J) bVar.E0(spliterator);
            long j5 = this.m;
            return new j3(j4, j5, t0.x(j5, j3));
        }
        if (R2.ORDERED.d(bVar.r0())) {
            return ((F0) new o2(this, bVar, spliterator, new Q1(4), this.m, this.n).invoke()).spliterator();
        }
        j$.util.J j6 = (j$.util.J) bVar.E0(spliterator);
        long j7 = this.m;
        if (j7 <= n0) {
            long j8 = n0 - j7;
            if (j3 >= 0) {
                j8 = Math.min(j3, j8);
            }
            j = j8;
            j2 = 0;
        } else {
            j = j3;
            j2 = j7;
        }
        return new p3(j6, j2, j);
    }

    @Override // j$.util.stream.b
    final e2 y0(int i, e2 e2Var) {
        return new j2(this, e2Var);
    }
}
