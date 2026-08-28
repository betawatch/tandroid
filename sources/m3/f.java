package m3;

import d5.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements t {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public f(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
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

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.t
    public final s h(long j10) {
        long[] jArr = this.e;
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.c;
        u uVar = new u(j11, jArr2[e10]);
        if (j11 >= j10 || e10 == this.a - 1) {
            return new s(uVar, uVar);
        }
        int i9 = e10 + 1;
        return new s(uVar, new u(jArr[i9], jArr2[i9]));
    }

    @Override // m3.t
    public final long i() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
