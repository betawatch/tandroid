package m3;

import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r implements t {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public r(long j10, long[] jArr, long[] jArr2) {
        d5.a.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i9 = length + 1;
            long[] jArr3 = new long[i9];
            this.a = jArr3;
            long[] jArr4 = new long[i9];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j10;
    }

    @Override // m3.t
    public final boolean e() {
        return this.d;
    }

    @Override // m3.t
    public final s h(long j10) {
        if (!this.d) {
            u uVar = u.c;
            return new s(uVar, uVar);
        }
        long[] jArr = this.b;
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.a;
        u uVar2 = new u(j11, jArr2[e10]);
        if (j11 == j10 || e10 == jArr.length - 1) {
            return new s(uVar2, uVar2);
        }
        int i9 = e10 + 1;
        return new s(uVar2, new u(jArr[i9], jArr2[i9]));
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
