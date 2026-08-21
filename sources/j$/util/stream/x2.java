package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x2 extends t2 {
    public N2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.N2, j$.util.stream.P2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.P2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.P2] */
    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final void y(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new P2();
        } else {
            r0 = new N2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.b2, j$.util.stream.g2
    public final void x() {
        long[] jArr = (long[]) this.c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        g2 g2Var = this.a;
        g2Var.y(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                g2Var.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (g2Var.C()) {
                    break;
                }
                g2Var.accept(j);
                i++;
            }
        }
        g2Var.x();
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final void accept(long j) {
        this.c.accept(j);
    }
}
