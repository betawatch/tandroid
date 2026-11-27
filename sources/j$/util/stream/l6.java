package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class l6 extends z5 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
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

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.c = new int[(int) j];
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
