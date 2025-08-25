package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class K2 extends y2 {
    private int[] c;
    private int d;

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
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

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
