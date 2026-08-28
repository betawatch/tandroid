package b5;

import android.os.SystemClock;
import d5.f0;
import h3.t0;
import j4.i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final o8.z o;
    public final d5.a0 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public l4.k u;

    public b(i1 i1Var, int[] iArr, com.google.android.exoplayer2.upstream.f fVar, long j10, long j11, long j12, o8.z zVar) {
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
        this.o = o8.z.u(zVar);
        this.p = d5.a0.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            o8.w wVar = (o8.w) arrayList.get(i9);
            if (wVar != null) {
                wVar.a(new a(j10, jArr[i9]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            l4.k kVar = (l4.k) o8.l.g(list);
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

    @Override // b5.t
    public final int d() {
        return this.r;
    }

    @Override // b5.c, b5.t
    public final void i() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // b5.c, b5.t
    public final int k(long j10, List list) {
        int i9;
        int i10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((l4.k) o8.l.g(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (l4.k) o8.l.g(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x10 = f0.x(((l4.k) list.get(size - 1)).h - j10, this.q);
        long j12 = this.j;
        if (x10 >= j12) {
            x(list);
            t0 t0Var = this.d[w(-1, elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                l4.k kVar = (l4.k) list.get(i11);
                t0 t0Var2 = kVar.d;
                if (f0.x(kVar.h - j10, this.q) >= j12 && t0Var2.n < t0Var.n && (i9 = t0Var2.H) != -1 && i9 <= this.l && (i10 = t0Var2.G) != -1 && i10 <= this.k && i9 < t0Var.H) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // b5.c, b5.t
    public final void l() {
        this.u = null;
    }

    @Override // b5.t
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long x10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = this.r;
        if (i9 >= lVarArr.length || !lVarArr[i9].next()) {
            int length = lVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    x10 = x(list);
                    break;
                }
                l4.l lVar = lVarArr[i10];
                if (lVar.next()) {
                    x10 = lVar.p() - lVar.c();
                    break;
                }
                i10++;
            }
        } else {
            l4.l lVar2 = lVarArr[this.r];
            x10 = lVar2.p() - lVar2.c();
        }
        int i11 = this.s;
        if (i11 == 0) {
            this.s = 1;
            this.r = w(0, elapsedRealtime);
            return;
        }
        int i12 = this.r;
        int a2 = list.isEmpty() ? -1 : a(((l4.k) o8.l.g(list)).d);
        if (a2 != -1) {
            i11 = ((l4.k) o8.l.g(list)).e;
            i12 = a2;
        }
        int w8 = w(1, elapsedRealtime);
        if (!f(i12, elapsedRealtime)) {
            t0[] t0VarArr = this.d;
            t0 t0Var = t0VarArr[i12];
            t0 t0Var2 = t0VarArr[w8];
            long j13 = this.h;
            if (j12 != -9223372036854775807L) {
                j13 = Math.min((long) ((x10 != -9223372036854775807L ? j12 - x10 : j12) * this.n), j13);
            }
            int i13 = t0Var2.n;
            int i14 = t0Var.n;
            if ((i13 > i14 && j11 < j13) || (i13 < i14 && j11 >= this.i)) {
                w8 = i12;
            }
        }
        if (w8 != i12) {
            i11 = 3;
        }
        this.s = i11;
        this.r = w8;
    }

    @Override // b5.t
    public final int p() {
        return this.s;
    }

    @Override // b5.c, b5.t
    public final void q(float f10) {
        this.q = f10;
    }

    @Override // b5.t
    public final Object r() {
        return null;
    }

    public final int w(int i9, long j10) {
        long j11;
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.g;
        synchronized (uVar) {
            j11 = uVar.l;
        }
        long j12 = (long) (j11 * this.m);
        this.g.getClass();
        long j13 = (long) (j12 / this.q);
        if (!this.o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.o.size() - 1 && ((a) this.o.get(i10)).a < j13) {
                i10++;
            }
            a aVar = (a) this.o.get(i10 - 1);
            a aVar2 = (a) this.o.get(i10);
            long j14 = aVar.a;
            long j15 = aVar.b;
            j13 = j15 + ((long) (((j13 - j14) / (aVar2.a - j14)) * (aVar2.b - j15)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < this.b; i12++) {
            if (j10 == Long.MIN_VALUE || !f(i12, j10)) {
                t0 t0Var = this.d[i12];
                int max = Math.max(t0Var.G, t0Var.H);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    t0 t0Var2 = this.d[num.intValue()];
                    boolean z10 = t0Var2.v;
                    if ((!z10 || t0Var.v) && ((!z10 && t0Var.v) || t0Var.n < t0Var2.n)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i12));
                    }
                } else {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                    arrayList.add(Integer.valueOf(i12));
                }
            }
        }
        if (i9 == 0) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                int intValue = ((Integer) obj).intValue();
                if (this.d[intValue].v) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            i11 = ((Integer) obj2).intValue();
            t0 t0Var3 = this.d[i11];
            int i15 = t0Var3.n;
            if (t0Var3.v || i15 <= j13) {
                break;
            }
        }
        return i11;
    }
}
