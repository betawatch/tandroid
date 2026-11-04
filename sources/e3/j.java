package e3;

import g2.n0;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements b0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // e3.b0
    public final boolean d() {
        return true;
    }

    @Override // e3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // e3.b0
    public final a0 f(long j10) {
        long[] jArr = this.e;
        int f10 = n0.f(jArr, j10, true);
        long j11 = jArr[f10];
        long[] jArr2 = this.c;
        c0 c0Var = new c0(j11, jArr2[f10]);
        if (j11 >= j10 || f10 == this.a - 1) {
            return new a0(c0Var, c0Var);
        }
        int i3 = f10 + 1;
        return new a0(c0Var, new c0(jArr[i3], jArr2[i3]));
    }

    @Override // e3.b0
    public final long h() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
