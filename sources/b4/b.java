package b4;

import b8.zb;
import g2.n0;
import g9.g0;
import g9.i0;
import g9.n1;
import g9.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements d {
    public static final g9.n c = new g9.n(new a3.j(9), n1.b);
    public final i0 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(s1 s1Var) {
        long j10;
        int i3 = s1Var.d;
        long j11 = -9223372036854775807L;
        int i10 = 0;
        if (i3 == 1) {
            g0 listIterator = s1Var.listIterator(0);
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
            long j12 = aVar.b;
            i0 i0Var = aVar.a;
            long j13 = aVar.c;
            long j14 = j12 == -9223372036854775807L ? 0L : j12;
            if (j13 == -9223372036854775807L) {
                this.a = i0.u(i0Var);
                this.b = new long[]{j14};
                return;
            } else {
                g0 g0Var = i0.b;
                this.a = i0.v(i0Var, s1.e);
                this.b = new long[]{j14, j13 + j14};
                return;
            }
        }
        long[] jArr = new long[i3 * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        s1 w10 = i0.w(c, s1Var);
        int i11 = 0;
        while (i10 < w10.d) {
            a aVar2 = (a) w10.get(i10);
            long j15 = aVar2.b;
            long j16 = aVar2.c;
            i0 i0Var2 = aVar2.a;
            j15 = j15 == j11 ? 0L : j15;
            long j17 = j15 + j16;
            if (i11 != 0) {
                int i12 = i11 - 1;
                long j18 = this.b[i12];
                if (j18 >= j15) {
                    if (j18 == j15 && ((i0) arrayList.get(i12)).isEmpty()) {
                        arrayList.set(i12, i0Var2);
                        j10 = j11;
                    } else {
                        j10 = j11;
                        g2.a.l("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i12] = j15;
                        arrayList.set(i12, i0Var2);
                    }
                    if (j16 == j10) {
                        this.b[i11] = j17;
                        arrayList.add(s1.e);
                        i11++;
                    }
                    i10++;
                    j11 = j10;
                }
            }
            j10 = j11;
            this.b[i11] = j15;
            arrayList.add(i0Var2);
            i11++;
            if (j16 == j10) {
            }
            i10++;
            j11 = j10;
        }
        this.a = i0.q(arrayList);
    }

    @Override // b4.d
    public final int d(long j10) {
        int b10 = n0.b(this.b, j10, false);
        if (b10 < this.a.size()) {
            return b10;
        }
        return -1;
    }

    @Override // b4.d
    public final long h(int i3) {
        zb.f(i3 < this.a.size());
        return this.b[i3];
    }

    @Override // b4.d
    public final List p(long j10) {
        int f10 = n0.f(this.b, j10, false);
        if (f10 != -1) {
            return (i0) this.a.get(f10);
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // b4.d
    public final int t() {
        return this.a.size();
    }
}
