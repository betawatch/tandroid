package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import org.telegram.messenger.LiteMode;

/* loaded from: classes2.dex */
final class g2 extends V1 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g2(b bVar, int i, long j, long j2) {
        super(bVar, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.b
    final G0 t0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        long j;
        long j2;
        long l0 = bVar.l0(spliterator);
        if (l0 > 0 && spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            return u0.E(bVar, u0.y(bVar.o0(), spliterator, this.m, this.n), true, intFunction);
        }
        if (R2.ORDERED.d(bVar.p0())) {
            return (G0) new o2(this, bVar, spliterator, intFunction, this.m, this.n).invoke();
        }
        Spliterator C0 = bVar.C0(spliterator);
        long j3 = this.m;
        long j4 = this.n;
        if (j3 <= l0) {
            long j5 = l0 - j3;
            if (j4 >= 0) {
                j5 = Math.min(j4, j5);
            }
            j = j5;
            j2 = 0;
        } else {
            j = j4;
            j2 = j3;
        }
        return u0.E(this, new r3(C0, j2, j), true, intFunction);
    }

    @Override // j$.util.stream.b
    final Spliterator u0(b bVar, Spliterator spliterator) {
        long j;
        long j2;
        long l0 = bVar.l0(spliterator);
        long j3 = this.n;
        if (l0 > 0 && spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            Spliterator C0 = bVar.C0(spliterator);
            long j4 = this.m;
            return new l3(C0, j4, u0.x(j4, j3));
        }
        if (R2.ORDERED.d(bVar.p0())) {
            return ((G0) new o2(this, bVar, spliterator, new d0(6), this.m, this.n).invoke()).spliterator();
        }
        Spliterator C02 = bVar.C0(spliterator);
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
        return new r3(C02, j2, j);
    }

    @Override // j$.util.stream.b
    final e2 w0(int i, e2 e2Var) {
        return new f2(this, e2Var);
    }
}
