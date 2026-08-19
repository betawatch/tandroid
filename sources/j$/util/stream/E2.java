package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class E2 extends s2 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final void y(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }

    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final void x() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        f2 f2Var = this.a;
        f2Var.y(j);
        if (!this.b) {
            while (i < this.d) {
                f2Var.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !f2Var.C()) {
                f2Var.accept(this.c[i]);
                i++;
            }
        }
        f2Var.x();
        this.c = null;
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }
}
