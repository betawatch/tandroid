package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class c6 extends y5 {
    public r6 c;

    @Override // j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        n5 n5Var = this.a;
        n5Var.n(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (n5Var.q()) {
                    break;
                }
                n5Var.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                n5Var.accept(dArr[i]);
                i++;
            }
        }
        n5Var.end();
    }

    @Override // j$.util.stream.g5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new r6((int) j) : new r6();
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
