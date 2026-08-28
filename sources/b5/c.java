package b5;

import android.os.SystemClock;
import d5.f0;
import h3.t0;
import j4.i1;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c implements t {
    public final i1 a;
    public final int b;
    public final int[] c;
    public final t0[] d;
    public final long[] e;
    public int f;

    public c(i1 i1Var, int[] iArr) {
        int i9 = 0;
        d5.a.i(iArr.length > 0);
        i1Var.getClass();
        this.a = i1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new t0[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.d[i10] = i1Var.d[iArr[i10]];
        }
        Arrays.sort(this.d, new a5.e(2));
        this.c = new int[this.b];
        while (true) {
            int i11 = this.b;
            if (i9 >= i11) {
                this.e = new long[i11];
                return;
            } else {
                this.c[i9] = i1Var.a(this.d[i9]);
                i9++;
            }
        }
    }

    @Override // b5.t
    public final int a(t0 t0Var) {
        for (int i9 = 0; i9 < this.b; i9++) {
            if (this.d[i9] == t0Var) {
                return i9;
            }
        }
        return -1;
    }

    @Override // b5.t
    public final i1 b() {
        return this.a;
    }

    @Override // b5.t
    public final /* synthetic */ boolean c(long j10, l4.e eVar, List list) {
        return false;
    }

    @Override // b5.t
    public final boolean e(int i9, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean f10 = f(i9, elapsedRealtime);
        int i10 = 0;
        while (i10 < this.b && !f10) {
            f10 = (i10 == i9 || f(i10, elapsedRealtime)) ? false : true;
            i10++;
        }
        if (!f10) {
            return false;
        }
        long[] jArr = this.e;
        long j11 = jArr[i9];
        int i11 = f0.a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i9] = Math.max(j11, j12);
        return true;
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

    @Override // b5.t
    public final boolean f(int i9, long j10) {
        return this.e[i9] > j10;
    }

    @Override // b5.t
    public final t0 h(int i9) {
        return this.d[i9];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // b5.t
    public final int j(int i9) {
        return this.c[i9];
    }

    @Override // b5.t
    public int k(long j10, List list) {
        return list.size();
    }

    @Override // b5.t
    public final int length() {
        return this.c.length;
    }

    @Override // b5.t
    public final int n() {
        return this.c[d()];
    }

    @Override // b5.t
    public final t0 o() {
        return this.d[d()];
    }

    @Override // b5.t
    public final int u(int i9) {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.c[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    @Override // b5.t
    public void i() {
    }

    @Override // b5.t
    public void l() {
    }

    @Override // b5.t
    public final /* synthetic */ void s() {
    }

    @Override // b5.t
    public final /* synthetic */ void t() {
    }

    @Override // b5.t
    public final /* synthetic */ void g(boolean z10) {
    }

    @Override // b5.t
    public void q(float f10) {
    }
}
