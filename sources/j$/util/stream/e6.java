package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class e6 extends a6 {
    public v6 c;

    @Override // j$.util.stream.m5, j$.util.stream.n5
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        n5 n5Var = this.a;
        n5Var.n(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (n5Var.q()) {
                    break;
                }
                n5Var.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                n5Var.accept(jArr[i]);
                i++;
            }
        }
        n5Var.end();
    }

    @Override // j$.util.stream.i5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new v6((int) j) : new v6();
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
