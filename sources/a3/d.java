package a3;

import a8.ia;
import android.os.SystemClock;
import e2.m1;
import h2.m0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class d implements u {
    public final m1 a;
    public final int b;
    public final int[] c;
    public final e2.u[] d;
    public final long[] e;
    public int f;

    public d(m1 m1Var, int[] iArr) {
        int i7 = 0;
        ia.p(iArr.length > 0);
        m1Var.getClass();
        this.a = m1Var;
        int length = iArr.length;
        this.b = length;
        this.d = new e2.u[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.d[i10] = m1Var.d[iArr[i10]];
        }
        Arrays.sort(this.d, new c(0));
        this.c = new int[this.b];
        while (true) {
            int i11 = this.b;
            if (i7 >= i11) {
                this.e = new long[i11];
                return;
            } else {
                this.c[i7] = m1Var.a(this.d[i7]);
                i7++;
            }
        }
    }

    @Override // a3.u
    public final boolean a(int i7, long j3) {
        return this.e[i7] > j3;
    }

    @Override // a3.u
    public final int b(e2.u uVar) {
        for (int i7 = 0; i7 < this.b; i7++) {
            if (this.d[i7] == uVar) {
                return i7;
            }
        }
        return -1;
    }

    @Override // a3.u
    public final m1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.a.equals(dVar.a) && Arrays.equals(this.c, dVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.u
    public final e2.u g(int i7) {
        return this.d[i7];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // a3.u
    public final int i(int i7) {
        return this.c[i7];
    }

    @Override // a3.u
    public int j(long j3, List list) {
        return list.size();
    }

    @Override // a3.u
    public final /* synthetic */ boolean k(long j3, y2.f fVar, List list) {
        return false;
    }

    @Override // a3.u
    public final int length() {
        return this.c.length;
    }

    @Override // a3.u
    public final int m() {
        return this.c[d()];
    }

    @Override // a3.u
    public final e2.u n() {
        return this.d[d()];
    }

    @Override // a3.u
    public final boolean p(int i7, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a10 = a(i7, elapsedRealtime);
        int i10 = 0;
        while (i10 < this.b && !a10) {
            a10 = (i10 == i7 || a(i10, elapsedRealtime)) ? false : true;
            i10++;
        }
        if (!a10) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i7] = Math.max(jArr[i7], m0.a(elapsedRealtime, j3));
        return true;
    }

    @Override // a3.u
    public final int u(int i7) {
        for (int i10 = 0; i10 < this.b; i10++) {
            if (this.c[i10] == i7) {
                return i10;
            }
        }
        return -1;
    }

    @Override // a3.u
    public void h() {
    }

    @Override // a3.u
    public void l() {
    }

    @Override // a3.u
    public final /* synthetic */ void s() {
    }

    @Override // a3.u
    public final /* synthetic */ void t() {
    }

    @Override // a3.u
    public final void f(boolean z9) {
    }

    @Override // a3.u
    public void q(float f10) {
    }
}
