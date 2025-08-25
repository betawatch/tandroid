package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class B2 extends x2 {
    private P2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.P2, j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.V2] */
    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final void l(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new V2();
        } else {
            r0 = new P2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.f2, j$.util.stream.m2
    public final void k() {
        double[] dArr = (double[]) this.c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        m2 m2Var = this.a;
        m2Var.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                m2Var.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (m2Var.n()) {
                    break;
                }
                m2Var.accept(d);
                i++;
            }
        }
        m2Var.k();
    }

    @Override // j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(d);
    }
}
