package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class J2 extends x2 {
    private double[] c;
    private int d;

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
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

    @Override // j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }
}
