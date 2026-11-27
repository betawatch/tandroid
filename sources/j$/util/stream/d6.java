package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class d6 extends z5 {
    public t6 c;

    @Override // j$.util.stream.l5, j$.util.stream.n5
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        n5 n5Var = this.a;
        n5Var.n(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (n5Var.q()) {
                    break;
                }
                n5Var.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                n5Var.accept(iArr[i]);
                i++;
            }
        }
        n5Var.end();
    }

    @Override // j$.util.stream.h5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new t6((int) j) : new t6();
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
