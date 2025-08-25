package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class D2 extends z2 {
    private T2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.T2, j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.V2] */
    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final void l(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new V2();
        } else {
            r0 = new T2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.h2, j$.util.stream.m2
    public final void k() {
        long[] jArr = (long[]) this.c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        m2 m2Var = this.a;
        m2Var.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                m2Var.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (m2Var.n()) {
                    break;
                }
                m2Var.accept(j);
                i++;
            }
        }
        m2Var.k();
    }

    @Override // j$.util.stream.l2, j$.util.stream.m2
    public final void accept(long j) {
        this.c.accept(j);
    }
}
