package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class L2 extends z2 {
    private long[] c;
    private int d;

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final void k() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        m2 m2Var = this.a;
        m2Var.l(j);
        if (!this.b) {
            while (i < this.d) {
                m2Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !m2Var.n()) {
                m2Var.accept(this.c[i]);
                i++;
            }
        }
        m2Var.k();
        this.c = null;
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }
}
