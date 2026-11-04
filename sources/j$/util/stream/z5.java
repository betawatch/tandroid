package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z5 extends v5 {
    public o6 c;

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void o(long j10) {
        o6 o6Var;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            o6Var = new o6();
        } else {
            o6Var = new o6((int) j10);
        }
        this.c = o6Var;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        j5 j5Var = this.a;
        j5Var.o(length);
        int i3 = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i3 < length2) {
                j5Var.accept(iArr[i3]);
                i3++;
            }
        } else {
            int length3 = iArr.length;
            while (i3 < length3) {
                int i10 = iArr[i3];
                if (j5Var.q()) {
                    break;
                }
                j5Var.accept(i10);
                i3++;
            }
        }
        j5Var.end();
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i3) {
        this.c.accept(i3);
    }
}
