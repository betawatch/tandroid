// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class na extends wg0 {
    public final la3 h;
    public final long i;
    public final long j;
    public final long k;
    public final short l;
    public final short m;
    public final float n;
    public final float o;
    public final po5 p;
    public final vgb q;
    public float r;
    public int s;
    public int t;
    public long u;
    public fm6 v;

    public na(t1c t1cVar, int[] iArr, la3 la3Var, long j, long j2, long j3, po5 po5Var) {
        super(0, t1cVar, iArr);
        if (j3 < j) {
            efd.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.h = la3Var;
        this.i = j * 1000;
        this.j = j2 * 1000;
        this.k = j3 * 1000;
        this.l = (short) 1279;
        this.m = (short) 719;
        this.n = 0.7f;
        this.o = 0.75f;
        this.p = po5.q(po5Var);
        this.q = vgb.a;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            mo5 mo5Var = (mo5) arrayList.get(i);
            if (mo5Var != null) {
                mo5Var.c(new ma(j, jArr[i]));
            }
        }
    }

    public static long y(List list) {
        if (!list.isEmpty()) {
            fm6 fm6Var = (fm6) dqe.b(list);
            long j = fm6Var.h;
            if (j != -9223372036854775807L) {
                long j2 = fm6Var.n;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // e74
    public final void b(long j, long j2, long j3, List list, gm6[] gm6VarArr) {
        long y;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.s;
        if (i >= gm6VarArr.length || !gm6VarArr[i].next()) {
            int length = gm6VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    y = y(list);
                    break;
                }
                gm6 gm6Var = gm6VarArr[i2];
                if (gm6Var.next()) {
                    y = gm6Var.g() - gm6Var.a();
                    break;
                }
                i2++;
            }
        } else {
            gm6 gm6Var2 = gm6VarArr[this.s];
            y = gm6Var2.g() - gm6Var2.a();
        }
        long j4 = y;
        long x = x(j4);
        int i3 = this.t;
        if (i3 == 0) {
            this.t = 1;
            this.s = w(elapsedRealtime, 0, x);
            return;
        }
        int i4 = this.s;
        int e = list.isEmpty() ? -1 : e(((fm6) dqe.b(list)).d);
        if (e != -1) {
            i3 = ((fm6) dqe.b(list)).e;
            i4 = e;
        }
        int w = w(elapsedRealtime, 1, x);
        if (w != i4 && !a(i4, elapsedRealtime)) {
            long j5 = this.i;
            if (j3 != -9223372036854775807L) {
                if (j4 != -9223372036854775807L) {
                    j3 -= j4;
                }
                j5 = Math.min((long) (j3 * this.o), j5);
            }
            if ((w < i4 && j2 < j5) || (w > i4 && j2 >= this.j)) {
                w = i4;
            }
        }
        if (w != i4) {
            i3 = 3;
        }
        this.t = i3;
        this.s = w;
    }

    @Override // e74
    public final int d() {
        return this.s;
    }

    @Override // wg0, e74
    public final void enable() {
        this.u = -9223372036854775807L;
        this.v = null;
    }

    @Override // wg0, e74
    public final int k(long j, List list) {
        int i;
        int i2;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.u;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((fm6) dqe.b(list)).equals(this.v))) {
            return list.size();
        }
        this.u = elapsedRealtime;
        this.v = list.isEmpty() ? null : (fm6) dqe.b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long H = gcc.H(((fm6) list.get(size - 1)).h - j, this.r);
        long j3 = this.k;
        if (H >= j3) {
            ko4 ko4Var = this.d[w(elapsedRealtime, -1, x(y(list)))];
            for (int i3 = 0; i3 < size; i3++) {
                fm6 fm6Var = (fm6) list.get(i3);
                ko4 ko4Var2 = fm6Var.d;
                if (gcc.H(fm6Var.h - j, this.r) >= j3 && ko4Var2.k < ko4Var.k && (i = ko4Var2.B) != -1 && i <= this.m && (i2 = ko4Var2.A) != -1 && i2 <= this.l && i < ko4Var.B) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // wg0, e74
    public final void l() {
        this.v = null;
    }

    @Override // e74
    public final int o() {
        return this.t;
    }

    @Override // wg0, e74
    public final void q(float f) {
        this.r = f;
    }

    @Override // e74
    public final Object r() {
        return null;
    }

    public final int w(long j, int i, long j2) {
        ko4[] ko4VarArr;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            ko4VarArr = this.d;
            if (i3 >= i4) {
                break;
            }
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                ko4 ko4Var = ko4VarArr[i3];
                int max = Math.max(ko4Var.A, ko4Var.B);
                if (hashMap.containsKey(Integer.valueOf(max))) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    ko4 ko4Var2 = ko4VarArr[num.intValue()];
                    boolean z = ko4Var2.o;
                    if ((!z || ko4Var.o) && ((!z && ko4Var.o) || ko4Var.k < ko4Var2.k)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i3));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i3));
                    }
                } else {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i3));
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            i3++;
        }
        if (i == 0) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                int intValue = ((Integer) obj).intValue();
                if (ko4VarArr[intValue].o) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            i2 = ((Integer) obj2).intValue();
            ko4 ko4Var3 = ko4VarArr[i2];
            int i7 = ko4Var3.k;
            if (ko4Var3.o || i7 <= j2) {
                break;
            }
        }
        return i2;
    }

    public final long x(long j) {
        long b = (long) (((long) (this.h.b() * this.n)) / this.r);
        po5 po5Var = this.p;
        if (po5Var.isEmpty()) {
            return b;
        }
        int i = 1;
        while (i < po5Var.size() - 1 && ((ma) po5Var.get(i)).a < b) {
            i++;
        }
        ma maVar = (ma) po5Var.get(i - 1);
        ma maVar2 = (ma) po5Var.get(i);
        long j2 = maVar.a;
        float f = (b - j2) / (maVar2.a - j2);
        return maVar.b + ((long) (f * (maVar2.b - r0)));
    }
}
