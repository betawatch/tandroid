package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class s2 extends o2 {
    private G2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.G2, j$.util.stream.M2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.M2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.M2] */
    @Override // j$.util.stream.W1, j$.util.stream.d2
    public final void n(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new M2();
        } else {
            r0 = new G2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.W1, j$.util.stream.d2
    public final void m() {
        double[] dArr = (double[]) this.c.e();
        Arrays.sort(dArr);
        long length = dArr.length;
        d2 d2Var = this.a;
        d2Var.n(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                d2Var.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (d2Var.q()) {
                    break;
                }
                d2Var.accept(d);
                i++;
            }
        }
        d2Var.m();
    }

    @Override // j$.util.stream.d2, j$.util.function.l
    public final void accept(double d) {
        this.c.accept(d);
    }
}
