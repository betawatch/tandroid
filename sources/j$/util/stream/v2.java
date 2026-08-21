package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v2 extends r2 {
    public J2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.J2, j$.util.stream.P2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.P2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.P2] */
    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final void y(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new P2();
        } else {
            r0 = new J2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.g2
    public final void x() {
        double[] dArr = (double[]) this.c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        g2 g2Var = this.a;
        g2Var.y(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                g2Var.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (g2Var.C()) {
                    break;
                }
                g2Var.accept(d);
                i++;
            }
        }
        g2Var.x();
    }

    @Override // j$.util.stream.d2, j$.util.stream.g2
    public final void accept(double d) {
        this.c.accept(d);
    }
}
