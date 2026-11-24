// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ah2 implements fv9 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public ah2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // fv9
    public final boolean c() {
        return true;
    }

    @Override // fv9
    public final boolean d() {
        return false;
    }

    @Override // fv9
    public final ev9 f(long j) {
        long[] jArr = this.e;
        int f = g8c.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        hv9 hv9Var = new hv9(j2, jArr2[f]);
        if (j2 >= j || f == this.a - 1) {
            return new ev9(hv9Var, hv9Var);
        }
        int i = f + 1;
        return new ev9(hv9Var, new hv9(jArr[i], jArr2[i]));
    }

    @Override // fv9
    public final long h() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
