package m3;

import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.a = jArr3;
            long[] jArr4 = new long[i10];
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
        int e9 = g0.e(jArr, j10, true);
        long j11 = jArr[e9];
        long[] jArr2 = this.a;
        u uVar2 = new u(j11, jArr2[e9]);
        if (j11 == j10 || e9 == jArr.length - 1) {
            return new s(uVar2, uVar2);
        }
        int i10 = e9 + 1;
        return new s(uVar2, new u(jArr[i10], jArr2[i10]));
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
