package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class u2 extends q2 {
    private K2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.K2, j$.util.stream.M2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.M2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.M2] */
    @Override // j$.util.stream.Y1, j$.util.stream.d2
    public final void n(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new M2();
        } else {
            r0 = new K2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.d2
    public final void m() {
        long[] jArr = (long[]) this.c.e();
        Arrays.sort(jArr);
        long length = jArr.length;
        d2 d2Var = this.a;
        d2Var.n(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                d2Var.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (d2Var.q()) {
                    break;
                }
                d2Var.accept(j);
                i++;
            }
        }
        d2Var.m();
    }

    @Override // j$.util.stream.d2
    public final void accept(long j) {
        this.c.accept(j);
    }
}
