package b5;

import android.os.SystemClock;
import d5.g0;
import h3.t0;
import j4.i1;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c implements s {
    public final i1 a;
    public final int b;
    public final int[] c;
    public final t0[] d;
    public final long[] e;
    public int f;

    public c(i1 i1Var, int[] iArr) {
        int i10 = 0;
        d5.a.i(iArr.length > 0);
        i1Var.getClass();
        this.a = i1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new t0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = i1Var.d[iArr[i11]];
        }
        Arrays.sort(this.d, new a5.f(3));
        this.c = new int[this.b];
        while (true) {
            int i12 = this.b;
            if (i10 >= i12) {
                this.e = new long[i12];
                return;
            } else {
                this.c[i10] = i1Var.a(this.d[i10]);
                i10++;
            }
        }
    }

    @Override // b5.s
    public final int a(t0 t0Var) {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.d[i10] == t0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // b5.s
    public final i1 b() {
        return this.a;
    }

    @Override // b5.s
    public final /* synthetic */ boolean c(long j10, l4.e eVar, List list) {
        return false;
    }

    @Override // b5.s
    public final boolean e(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean f10 = f(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.b && !f10) {
            f10 = (i11 == i10 || f(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!f10) {
            return false;
        }
        long[] jArr = this.e;
        long j11 = jArr[i10];
        int i12 = g0.a;
        long j12 = elapsedRealtime + j10;
        if (((j10 ^ j12) & (elapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
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

    @Override // b5.s
    public final boolean f(int i10, long j10) {
        return this.e[i10] > j10;
    }

    @Override // b5.s
    public final t0 h(int i10) {
        return this.d[i10];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // b5.s
    public final int j(int i10) {
        return this.c[i10];
    }

    @Override // b5.s
    public int k(long j10, List list) {
        return list.size();
    }

    @Override // b5.s
    public final int length() {
        return this.c.length;
    }

    @Override // b5.s
    public final int n() {
        return this.c[d()];
    }

    @Override // b5.s
    public final t0 o() {
        return this.d[d()];
    }

    @Override // b5.s
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.b; i11++) {
            if (this.c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // b5.s
    public void i() {
    }

    @Override // b5.s
    public void l() {
    }

    @Override // b5.s
    public final /* synthetic */ void s() {
    }

    @Override // b5.s
    public final /* synthetic */ void t() {
    }

    @Override // b5.s
    public final /* synthetic */ void g(boolean z10) {
    }

    @Override // b5.s
    public void q(float f10) {
    }
}
