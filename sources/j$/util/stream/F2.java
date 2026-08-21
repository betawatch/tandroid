package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class F2 extends t2 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final void y(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final void x() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        g2 g2Var = this.a;
        g2Var.y(j);
        if (!this.b) {
            while (i < this.d) {
                g2Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !g2Var.C()) {
                g2Var.accept(this.c[i]);
                i++;
            }
        }
        g2Var.x();
        this.c = null;
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }
}
