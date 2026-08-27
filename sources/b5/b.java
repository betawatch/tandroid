package b5;

import android.os.SystemClock;
import d5.b0;
import d5.g0;
import h3.t0;
import j4.i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends c {
    public final com.google.android.exoplayer2.upstream.f g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final p8.z o;
    public final b0 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public l4.k u;

    public b(i1 i1Var, int[] iArr, com.google.android.exoplayer2.upstream.f fVar, long j10, long j11, long j12, p8.z zVar) {
        super(i1Var, iArr);
        if (j12 < j10) {
            d5.a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
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
        this.o = p8.z.u(zVar);
        this.p = b0.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p8.w wVar = (p8.w) arrayList.get(i10);
            if (wVar != null) {
                wVar.a(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            l4.k kVar = (l4.k) p8.l.g(list);
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

    @Override // b5.s
    public final int d() {
        return this.r;
    }

    @Override // b5.c, b5.s
    public final void i() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // b5.c, b5.s
    public final int k(long j10, List list) {
        int i10;
        int i11;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((l4.k) p8.l.g(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (l4.k) p8.l.g(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x8 = g0.x(((l4.k) list.get(size - 1)).h - j10, this.q);
        long j12 = this.j;
        if (x8 >= j12) {
            x(list);
            t0 t0Var = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                l4.k kVar = (l4.k) list.get(i12);
                t0 t0Var2 = kVar.d;
                if (g0.x(kVar.h - j10, this.q) >= j12 && t0Var2.n < t0Var.n && (i10 = t0Var2.H) != -1 && i10 <= this.l && (i11 = t0Var2.G) != -1 && i11 <= this.k && i10 < t0Var.H) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // b5.c, b5.s
    public final void l() {
        this.u = null;
    }

    @Override // b5.s
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long x8;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.r;
        if (i10 >= lVarArr.length || !lVarArr[i10].next()) {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    x8 = x(list);
                    break;
                }
                l4.l lVar = lVarArr[i11];
                if (lVar.next()) {
                    x8 = lVar.i() - lVar.g();
                    break;
                }
                i11++;
            }
        } else {
            l4.l lVar2 = lVarArr[this.r];
            x8 = lVar2.i() - lVar2.g();
        }
        int i12 = this.s;
        if (i12 == 0) {
            this.s = 1;
            this.r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.r;
        int a2 = list.isEmpty() ? -1 : a(((l4.k) p8.l.g(list)).d);
        if (a2 != -1) {
            i12 = ((l4.k) p8.l.g(list)).e;
            i13 = a2;
        }
        int w10 = w(1, elapsedRealtime);
        if (!f(i13, elapsedRealtime)) {
            t0[] t0VarArr = this.d;
            t0 t0Var = t0VarArr[i13];
            t0 t0Var2 = t0VarArr[w10];
            long j13 = this.h;
            if (j12 != -9223372036854775807L) {
                j13 = Math.min((long) ((x8 != -9223372036854775807L ? j12 - x8 : j12) * this.n), j13);
            }
            int i14 = t0Var2.n;
            int i15 = t0Var.n;
            if ((i14 > i15 && j11 < j13) || (i14 < i15 && j11 >= this.i)) {
                w10 = i13;
            }
        }
        if (w10 != i13) {
            i12 = 3;
        }
        this.s = i12;
        this.r = w10;
    }

    @Override // b5.s
    public final int p() {
        return this.s;
    }

    @Override // b5.c, b5.s
    public final void q(float f10) {
        this.q = f10;
    }

    @Override // b5.s
    public final Object r() {
        return null;
    }

    public final int w(int i10, long j10) {
        long j11;
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.g;
        synchronized (uVar) {
            j11 = uVar.l;
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
            if (j10 == Long.MIN_VALUE || !f(i13, j10)) {
                t0 t0Var = this.d[i13];
                int max = Math.max(t0Var.G, t0Var.H);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    t0 t0Var2 = this.d[num.intValue()];
                    boolean z10 = t0Var2.v;
                    if ((!z10 || t0Var.v) && ((!z10 && t0Var.v) || t0Var.n < t0Var2.n)) {
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
            t0 t0Var3 = this.d[i12];
            int i16 = t0Var3.n;
            if (t0Var3.v || i16 <= j13) {
                break;
            }
        }
        return i12;
    }
}
