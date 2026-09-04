package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class y5 extends u5 {
    public m6 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.m6, j$.util.stream.s6] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.s6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.s6] */
    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final void o(long j3) {
        ?? r02;
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j3 <= 0) {
            r02 = new s6();
        } else {
            r02 = new m6((int) j3);
        }
        this.c = r02;
    }

    @Override // j$.util.stream.c5, j$.util.stream.j5
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        j5 j5Var = this.a;
        j5Var.o(length);
        int i10 = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i10 < length2) {
                j5Var.accept(dArr[i10]);
                i10++;
            }
        } else {
            int length3 = dArr.length;
            while (i10 < length3) {
                double d = dArr[i10];
                if (j5Var.q()) {
                    break;
                }
                j5Var.accept(d);
                i10++;
            }
        }
        j5Var.end();
    }

    @Override // j$.util.stream.g5, j$.util.stream.j5
    public final void accept(double d) {
        this.c.accept(d);
    }
}
