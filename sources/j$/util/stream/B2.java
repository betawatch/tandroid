package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class B2 extends p2 {
    private int[] c;
    private int d;

    @Override // j$.util.stream.X1, j$.util.stream.d2
    public final void n(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // j$.util.stream.X1, j$.util.stream.d2
    public final void m() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        d2 d2Var = this.a;
        d2Var.n(j);
        if (!this.b) {
            while (i < this.d) {
                d2Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !d2Var.q()) {
                d2Var.accept(this.c[i]);
                i++;
            }
        }
        d2Var.m();
        this.c = null;
    }

    @Override // j$.util.stream.d2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
