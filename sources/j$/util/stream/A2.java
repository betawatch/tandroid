package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class A2 extends o2 {
    private double[] c;
    private int d;

    @Override // j$.util.stream.W1, j$.util.stream.d2
    public final void n(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }

    @Override // j$.util.stream.W1, j$.util.stream.d2
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

    @Override // j$.util.stream.d2, j$.util.function.l
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }
}
