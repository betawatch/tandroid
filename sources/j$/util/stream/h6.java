package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h6 extends v5 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void o(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j3];
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.c, 0, this.d);
        long j3 = this.d;
        j5 j5Var = this.a;
        j5Var.o(j3);
        if (!this.b) {
            while (i10 < this.d) {
                j5Var.accept(this.c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.d && !j5Var.q()) {
                j5Var.accept(this.c[i10]);
                i10++;
            }
        }
        j5Var.end();
        this.c = null;
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i10) {
        int[] iArr = this.c;
        int i11 = this.d;
        this.d = i11 + 1;
        iArr[i11] = i10;
    }
}
