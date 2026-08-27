package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a6 extends w5 {
    public q6 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.q6, j$.util.stream.s6] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.s6] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.s6] */
    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void o(long j10) {
        ?? r02;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j10 <= 0) {
            r02 = new s6();
        } else {
            r02 = new q6((int) j10);
        }
        this.c = r02;
    }

    @Override // j$.util.stream.e5, j$.util.stream.j5
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        j5 j5Var = this.a;
        j5Var.o(length);
        int i10 = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i10 < length2) {
                j5Var.accept(jArr[i10]);
                i10++;
            }
        } else {
            int length3 = jArr.length;
            while (i10 < length3) {
                long j10 = jArr[i10];
                if (j5Var.q()) {
                    break;
                }
                j5Var.accept(j10);
                i10++;
            }
        }
        j5Var.end();
    }

    @Override // j$.util.stream.i5, j$.util.stream.j5
    public final void accept(long j10) {
        this.c.accept(j10);
    }
}
