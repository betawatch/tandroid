package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i6 extends w5 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void o(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j3];
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void end() {
        int i7 = 0;
        Arrays.sort(this.c, 0, this.d);
        long j3 = this.d;
        j5 j5Var = this.a;
        j5Var.o(j3);
        if (!this.b) {
            while (i7 < this.d) {
                j5Var.accept(this.c[i7]);
                i7++;
            }
        } else {
            while (i7 < this.d && !j5Var.q()) {
                j5Var.accept(this.c[i7]);
                i7++;
            }
        }
        j5Var.end();
        this.c = null;
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j3) {
        long[] jArr = this.c;
        int i7 = this.d;
        this.d = i7 + 1;
        jArr[i7] = j3;
    }
}
