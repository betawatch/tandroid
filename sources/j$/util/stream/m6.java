package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class m6 extends a6 {
    public long[] c;
    public int d;

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
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

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.c = new long[(int) j];
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
