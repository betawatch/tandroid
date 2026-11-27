package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class k6 extends y5 {
    public double[] c;
    public int d;

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        n5 n5Var = this.a;
        n5Var.n(j);
        if (this.b) {
            while (i < this.d && !n5Var.q()) {
                n5Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                n5Var.accept(this.c[i]);
                i++;
            }
        }
        n5Var.end();
        this.c = null;
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.c = new double[(int) j];
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
