package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u2 extends q2 {
    public I2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.I2, j$.util.stream.O2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.O2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.O2] */
    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final void y(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new O2();
        } else {
            r0 = new I2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.f2
    public final void x() {
        double[] dArr = (double[]) this.c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        f2 f2Var = this.a;
        f2Var.y(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                f2Var.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (f2Var.C()) {
                    break;
                }
                f2Var.accept(d);
                i++;
            }
        }
        f2Var.x();
    }

    @Override // j$.util.stream.c2, j$.util.stream.f2
    public final void accept(double d) {
        this.c.accept(d);
    }
}
