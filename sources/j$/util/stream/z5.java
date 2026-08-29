package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z5 extends v5 {
    public o6 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.o6, j$.util.stream.s6] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.s6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.s6] */
    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void o(long j10) {
        ?? r02;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            r02 = new s6();
        } else {
            r02 = new o6((int) j10);
        }
        this.c = r02;
    }

    @Override // j$.util.stream.d5, j$.util.stream.j5
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        j5 j5Var = this.a;
        j5Var.o(length);
        int i10 = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i10 < length2) {
                j5Var.accept(iArr[i10]);
                i10++;
            }
        } else {
            int length3 = iArr.length;
            while (i10 < length3) {
                int i11 = iArr[i10];
                if (j5Var.q()) {
                    break;
                }
                j5Var.accept(i11);
                i10++;
            }
        }
        j5Var.end();
    }

    @Override // j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i10) {
        this.c.accept(i10);
    }
}
