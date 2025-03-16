package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import org.telegram.messenger.LiteMode;

/* loaded from: classes2.dex */
final class m2 extends z {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m2(b bVar, int i, long j, long j2) {
        super(bVar, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.b
    final F0 u0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        long j;
        long j2;
        long m0 = bVar.m0(spliterator);
        if (m0 > 0 && spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            return t0.F(bVar, t0.y(bVar.p0(), spliterator, this.m, this.n), true);
        }
        if (R2.ORDERED.d(bVar.q0())) {
            return (F0) new o2(this, bVar, spliterator, intFunction, this.m, this.n).invoke();
        }
        j$.util.D d = (j$.util.D) bVar.D0(spliterator);
        long j3 = this.m;
        long j4 = this.n;
        if (j3 <= m0) {
            j = j4 >= 0 ? Math.min(j4, m0 - j3) : m0 - j3;
            j2 = 0;
        } else {
            j = j4;
            j2 = j3;
        }
        return t0.F(this, new n3(d, j2, j), true);
    }

    @Override // j$.util.stream.b
    final Spliterator v0(b bVar, Spliterator spliterator) {
        long j;
        long j2;
        long m0 = bVar.m0(spliterator);
        long j3 = this.n;
        if (m0 > 0 && spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            j$.util.D d = (j$.util.D) bVar.D0(spliterator);
            long j4 = this.m;
            return new h3(d, j4, t0.x(j4, j3));
        }
        if (R2.ORDERED.d(bVar.q0())) {
            return ((F0) new o2(this, bVar, spliterator, new Q1(5), this.m, this.n).invoke()).spliterator();
        }
        j$.util.D d2 = (j$.util.D) bVar.D0(spliterator);
        long j5 = this.m;
        if (j5 <= m0) {
            long j6 = m0 - j5;
            if (j3 >= 0) {
                j6 = Math.min(j3, j6);
            }
            j = j6;
            j2 = 0;
        } else {
            j = j3;
            j2 = j5;
        }
        return new n3(d2, j2, j);
    }

    @Override // j$.util.stream.b
    final e2 x0(int i, e2 e2Var) {
        return new l2(this, e2Var);
    }
}
