package c4;

import a8.ia;
import h2.m0;
import h9.g0;
import h9.i0;
import h9.o1;
import h9.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements d {
    public static final h9.n c = new h9.n(new a3.l(28), o1.b);
    public final i0 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(t1 t1Var) {
        long j3;
        int i7 = t1Var.d;
        long j10 = -9223372036854775807L;
        int i10 = 0;
        if (i7 == 1) {
            g0 listIterator = t1Var.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i10 < 4 && listIterator.hasNext()) {
                    sb2.append(", ");
                    sb2.append(listIterator.next());
                    i10++;
                }
                if (listIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            a aVar = (a) next;
            long j11 = aVar.b;
            i0 i0Var = aVar.a;
            long j12 = aVar.c;
            long j13 = j11 == -9223372036854775807L ? 0L : j11;
            if (j12 == -9223372036854775807L) {
                this.a = i0.u(i0Var);
                this.b = new long[]{j13};
                return;
            } else {
                g0 g0Var = i0.b;
                this.a = i0.v(i0Var, t1.e);
                this.b = new long[]{j13, j12 + j13};
                return;
            }
        }
        long[] jArr = new long[i7 * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        t1 w10 = i0.w(c, t1Var);
        int i11 = 0;
        while (i10 < w10.d) {
            a aVar2 = (a) w10.get(i10);
            long j14 = aVar2.b;
            long j15 = aVar2.c;
            i0 i0Var2 = aVar2.a;
            j14 = j14 == j10 ? 0L : j14;
            long j16 = j14 + j15;
            if (i11 != 0) {
                int i12 = i11 - 1;
                long j17 = this.b[i12];
                if (j17 >= j14) {
                    if (j17 == j14 && ((i0) arrayList.get(i12)).isEmpty()) {
                        arrayList.set(i12, i0Var2);
                        j3 = j10;
                    } else {
                        j3 = j10;
                        h2.a.l("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i12] = j14;
                        arrayList.set(i12, i0Var2);
                    }
                    if (j15 == j3) {
                        this.b[i11] = j16;
                        arrayList.add(t1.e);
                        i11++;
                    }
                    i10++;
                    j10 = j3;
                }
            }
            j3 = j10;
            this.b[i11] = j14;
            arrayList.add(i0Var2);
            i11++;
            if (j15 == j3) {
            }
            i10++;
            j10 = j3;
        }
        this.a = i0.q(arrayList);
    }

    @Override // c4.d
    public final int d(long j3) {
        int b10 = m0.b(this.b, j3, false);
        if (b10 < this.a.size()) {
            return b10;
        }
        return -1;
    }

    @Override // c4.d
    public final long k(int i7) {
        ia.f(i7 < this.a.size());
        return this.b[i7];
    }

    @Override // c4.d
    public final List s(long j3) {
        int f10 = m0.f(this.b, j3, false);
        if (f10 != -1) {
            return (i0) this.a.get(f10);
        }
        g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // c4.d
    public final int y() {
        return this.a.size();
    }
}
