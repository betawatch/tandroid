package d5;

import android.os.SystemClock;
import f5.d0;
import j3.t0;
import java.util.Arrays;
import java.util.List;
import l4.j1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c implements r {
    public final j1 a;
    public final int b;
    public final int[] c;
    public final t0[] d;
    public final long[] e;
    public int f;

    public c(j1 j1Var, int[] iArr) {
        int i10 = 0;
        f5.a.i(iArr.length > 0);
        j1Var.getClass();
        this.a = j1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new t0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = j1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new c5.e(5));
        this.c = new int[this.b];
        while (true) {
            int i12 = this.b;
            if (i10 >= i12) {
                this.e = new long[i12];
                return;
            } else {
                this.c[i10] = j1Var.a(this.d[i10]);
                i10++;
            }
        }
    }

    @Override // d5.r
    public final j1 a() {
        return this.a;
    }

    @Override // d5.r
    public final boolean d(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean e10 = e(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.b && !e10) {
            e10 = (i11 == i10 || e(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!e10) {
            return false;
        }
        long[] jArr = this.e;
        long j11 = jArr[i10];
        int i12 = d0.a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override // d5.r
    public final boolean e(int i10, long j10) {
        return this.e[i10] > j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.a == cVar.a && Arrays.equals(this.c, cVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // d5.r
    public final t0 g(int i10) {
        return this.d[i10];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // d5.r
    public final int i(int i10) {
        return this.c[i10];
    }

    @Override // d5.r
    public int j(long j10, List list) {
        return list.size();
    }

    @Override // d5.r
    public final int l() {
        return this.c[c()];
    }

    @Override // d5.r
    public final int length() {
        return this.c.length;
    }

    @Override // d5.r
    public final int m(t0 t0Var) {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.d[i10] == t0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // d5.r
    public final t0 n() {
        return this.d[c()];
    }

    @Override // d5.r
    public final /* synthetic */ boolean p(long j10, n4.e eVar, List list) {
        return false;
    }

    @Override // d5.r
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.b; i11++) {
            if (this.c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // d5.r
    public void h() {
    }

    @Override // d5.r
    public void k() {
    }

    @Override // d5.r
    public final /* synthetic */ void s() {
    }

    @Override // d5.r
    public final /* synthetic */ void t() {
    }

    @Override // d5.r
    public final /* synthetic */ void f(boolean z10) {
    }

    @Override // d5.r
    public void q(float f9) {
    }
}
