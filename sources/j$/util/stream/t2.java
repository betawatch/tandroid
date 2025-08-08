package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class t2 extends p2 {
    private I2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.I2, j$.util.stream.M2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.M2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.M2] */
    @Override // j$.util.stream.X1, j$.util.stream.d2
    public final void n(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new M2();
        } else {
            r0 = new I2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.X1, j$.util.stream.d2
    public final void m() {
        int[] iArr = (int[]) this.c.e();
        Arrays.sort(iArr);
        long length = iArr.length;
        d2 d2Var = this.a;
        d2Var.n(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                d2Var.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (d2Var.q()) {
                    break;
                }
                d2Var.accept(i2);
                i++;
            }
        }
        d2Var.m();
    }

    @Override // j$.util.stream.d2
    public final void accept(int i) {
        this.c.accept(i);
    }
}
