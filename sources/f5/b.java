package f5;

import android.os.SystemClock;
import h5.d0;
import h5.y;
import j3.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o4.s0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends c {
    public final g5.f g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final s8.v o;
    public final y p;
    public float q;
    public int r;
    public int s;
    public long t;
    public q4.k u;

    public b(s0 s0Var, int[] iArr, g5.f fVar, long j10, long j11, long j12, s8.v vVar) {
        super(s0Var, iArr);
        if (j12 < j10) {
            h5.a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.g = fVar;
        this.h = j10 * 1000;
        this.i = j11 * 1000;
        this.j = j12 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = s8.v.t(vVar);
        this.p = y.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            s8.s sVar = (s8.s) arrayList.get(i10);
            if (sVar != null) {
                sVar.b(new a(j10, jArr[i10]));
            }
        }
    }

    public static long y(List list) {
        if (!list.isEmpty()) {
            q4.k kVar = (q4.k) s8.l.h(list);
            long j10 = kVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = kVar.n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // f5.c
    public final void a() {
        this.u = null;
    }

    @Override // f5.c
    public final void b() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // f5.c
    public final int c(long j10, List list) {
        int i10;
        int i11;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((q4.k) s8.l.h(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (q4.k) s8.l.h(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long y10 = d0.y(((q4.k) list.get(size - 1)).h - j10, this.q);
        long j12 = this.j;
        if (y10 >= j12) {
            y(list);
            n0 n0Var = this.d[x(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                q4.k kVar = (q4.k) list.get(i12);
                n0 n0Var2 = kVar.d;
                if (d0.y(kVar.h - j10, this.q) >= j12 && n0Var2.n < n0Var.n && (i10 = n0Var2.I) != -1 && i10 <= this.l && (i11 = n0Var2.H) != -1 && i11 <= this.k && i10 < n0Var.I) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // f5.c
    public final int h() {
        return this.r;
    }

    @Override // f5.c
    public final Object j() {
        return null;
    }

    @Override // f5.c
    public final int k() {
        return this.s;
    }

    @Override // f5.c
    public final void s(float f10) {
        this.q = f10;
    }

    @Override // f5.c
    public final void v(long j10, long j11, long j12, List list, q4.l[] lVarArr) {
        long y10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.r;
        if (i10 >= lVarArr.length || !lVarArr[i10].next()) {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    y10 = y(list);
                    break;
                }
                q4.l lVar = lVarArr[i11];
                if (lVar.next()) {
                    y10 = lVar.a1() - lVar.n0();
                    break;
                }
                i11++;
            }
        } else {
            q4.l lVar2 = lVarArr[this.r];
            y10 = lVar2.a1() - lVar2.n0();
        }
        int i12 = this.s;
        if (i12 == 0) {
            this.s = 1;
            this.r = x(0, elapsedRealtime);
            return;
        }
        int i13 = this.r;
        int n10 = list.isEmpty() ? -1 : n(((q4.k) s8.l.h(list)).d);
        if (n10 != -1) {
            i12 = ((q4.k) s8.l.h(list)).e;
            i13 = n10;
        }
        int x10 = x(1, elapsedRealtime);
        if (x10 != i13 && !o(i13, elapsedRealtime)) {
            n0[] n0VarArr = this.d;
            n0 n0Var = n0VarArr[i13];
            n0 n0Var2 = n0VarArr[x10];
            long j13 = this.h;
            if (j12 != -9223372036854775807L) {
                j13 = Math.min((long) ((y10 != -9223372036854775807L ? j12 - y10 : j12) * this.n), j13);
            }
            int i14 = n0Var2.n;
            int i15 = n0Var.n;
            if ((i14 > i15 && j11 < j13) || (i14 < i15 && j11 >= this.i)) {
                x10 = i13;
            }
        }
        if (x10 != i13) {
            i12 = 3;
        }
        this.s = i12;
        this.r = x10;
    }

    public final int x(int i10, long j10) {
        long j11;
        g5.s sVar = (g5.s) this.g;
        synchronized (sVar) {
            j11 = sVar.l;
        }
        long j12 = (long) (j11 * this.m);
        this.g.getClass();
        long j13 = (long) (j12 / this.q);
        if (!this.o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.o.size() - 1 && ((a) this.o.get(i11)).a < j13) {
                i11++;
            }
            a aVar = (a) this.o.get(i11 - 1);
            a aVar2 = (a) this.o.get(i11);
            long j14 = aVar.a;
            long j15 = aVar.b;
            j13 = j15 + ((long) (((j13 - j14) / (aVar2.a - j14)) * (aVar2.b - j15)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.b; i13++) {
            if (j10 == Long.MIN_VALUE || !o(i13, j10)) {
                n0 n0Var = this.d[i13];
                int max = Math.max(n0Var.H, n0Var.I);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    n0 n0Var2 = this.d[num.intValue()];
                    boolean z4 = n0Var2.v;
                    if ((!z4 || n0Var.v) && ((!z4 && n0Var.v) || n0Var.n < n0Var2.n)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i13));
                    }
                } else {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                }
            }
        }
        if (i10 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (this.d[intValue].v) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i12 = ((Integer) obj2).intValue();
            n0 n0Var3 = this.d[i12];
            int i16 = n0Var3.n;
            if (n0Var3.v || i16 <= j13) {
                break;
            }
        }
        return i12;
    }
}
