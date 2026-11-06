package a3;

import android.os.SystemClock;
import e2.m1;
import h2.g0;
import h2.m0;
import h9.f0;
import h9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends d {
    public final b3.d g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final i0 o;
    public final g0 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public y2.l u;

    public b(m1 m1Var, int[] iArr, b3.d dVar, long j3, long j10, long j11, i0 i0Var) {
        super(m1Var, iArr);
        if (j11 < j3) {
            h2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j3;
        }
        this.g = dVar;
        this.h = j3 * 1000;
        this.i = j10 * 1000;
        this.j = j11 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = i0.q(i0Var);
        this.p = g0.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j10 : jArr) {
            j3 += j10;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            f0 f0Var = (f0) arrayList.get(i7);
            if (f0Var != null) {
                f0Var.c(new a(j3, jArr[i7]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            y2.l lVar = (y2.l) h9.o.n(list);
            long j3 = lVar.h;
            if (j3 != -9223372036854775807L) {
                long j10 = lVar.n;
                if (j10 != -9223372036854775807L) {
                    return j10 - j3;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // a3.u
    public final int d() {
        return this.r;
    }

    @Override // a3.u
    public final void e(long j3, long j10, long j11, List list, y2.m[] mVarArr) {
        long x10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = this.r;
        if (i7 >= mVarArr.length || !mVarArr[i7].next()) {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    x10 = x(list);
                    break;
                }
                y2.m mVar = mVarArr[i10];
                if (mVar.next()) {
                    x10 = mVar.E() - mVar.w();
                    break;
                }
                i10++;
            }
        } else {
            y2.m mVar2 = mVarArr[this.r];
            x10 = mVar2.E() - mVar2.w();
        }
        int i11 = this.s;
        if (i11 == 0) {
            this.s = 1;
            this.r = w(0, elapsedRealtime);
            return;
        }
        int i12 = this.r;
        int b10 = list.isEmpty() ? -1 : b(((y2.l) h9.o.n(list)).d);
        if (b10 != -1) {
            i11 = ((y2.l) h9.o.n(list)).e;
            i12 = b10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i12 && !a(i12, elapsedRealtime)) {
            e2.u[] uVarArr = this.d;
            e2.u uVar = uVarArr[i12];
            e2.u uVar2 = uVarArr[w10];
            long j12 = this.h;
            if (j11 != -9223372036854775807L) {
                j12 = Math.min((long) ((x10 != -9223372036854775807L ? j11 - x10 : j11) * this.n), j12);
            }
            int i13 = uVar2.j;
            int i14 = uVar.j;
            if ((i13 > i14 && j10 < j12) || (i13 < i14 && j10 >= this.i)) {
                w10 = i12;
            }
        }
        if (w10 != i12) {
            i11 = 3;
        }
        this.s = i11;
        this.r = w10;
    }

    @Override // a3.d, a3.u
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // a3.d, a3.u
    public final int j(long j3, List list) {
        int i7;
        int i10;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((y2.l) h9.o.n(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (y2.l) h9.o.n(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = m0.F(((y2.l) list.get(size - 1)).h - j3, this.q);
        long j11 = this.j;
        if (F >= j11) {
            x(list);
            e2.u uVar = this.d[w(-1, elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                y2.l lVar = (y2.l) list.get(i11);
                e2.u uVar2 = lVar.d;
                if (m0.F(lVar.h - j3, this.q) >= j11 && uVar2.j < uVar.j && (i7 = uVar2.A) != -1 && i7 <= this.l && (i10 = uVar2.z) != -1 && i10 <= this.k && i7 < uVar.A) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // a3.d, a3.u
    public final void l() {
        this.u = null;
    }

    @Override // a3.u
    public final int o() {
        return this.s;
    }

    @Override // a3.d, a3.u
    public final void q(float f10) {
        this.q = f10;
    }

    @Override // a3.u
    public final Object r() {
        return null;
    }

    public final int w(int i7, long j3) {
        e2.u[] uVarArr;
        b3.d dVar = this.g;
        long a10 = (long) (((b3.g) dVar).a() * this.m);
        dVar.getClass();
        long j10 = (long) (a10 / this.q);
        i0 i0Var = this.o;
        if (!i0Var.isEmpty()) {
            int i10 = 1;
            while (i10 < i0Var.size() - 1 && ((a) i0Var.get(i10)).a < j10) {
                i10++;
            }
            a aVar = (a) i0Var.get(i10 - 1);
            a aVar2 = (a) i0Var.get(i10);
            long j11 = aVar.a;
            long j12 = aVar.b;
            j10 = ((long) (((j10 - j11) / (aVar2.a - j11)) * (aVar2.b - j12))) + j12;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.b;
            uVarArr = this.d;
            if (i12 >= i13) {
                break;
            }
            if (j3 == Long.MIN_VALUE || !a(i12, j3)) {
                e2.u uVar = uVarArr[i12];
                int max = Math.max(uVar.z, uVar.A);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    e2.u uVar2 = uVarArr[num.intValue()];
                    boolean z9 = uVar2.n;
                    if ((!z9 || uVar.n) && ((!z9 && uVar.n) || uVar.j < uVar2.j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i12));
                    }
                } else {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                    arrayList.add(Integer.valueOf(i12));
                }
            }
            i12++;
        }
        if (i7 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (uVarArr[intValue].n) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i11 = ((Integer) obj2).intValue();
            e2.u uVar3 = uVarArr[i11];
            int i16 = uVar3.j;
            if (uVar3.n || i16 <= j10) {
                break;
            }
        }
        return i11;
    }
}
