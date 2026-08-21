package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w2 extends s2 {
    public L2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.L2, j$.util.stream.P2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.P2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.P2] */
    @Override // j$.util.stream.a2, j$.util.stream.g2
    public final void y(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new P2();
        } else {
            r0 = new L2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.a2, j$.util.stream.g2
    public final void x() {
        int[] iArr = (int[]) this.c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        g2 g2Var = this.a;
        g2Var.y(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                g2Var.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (g2Var.C()) {
                    break;
                }
                g2Var.accept(i2);
                i++;
            }
        }
        g2Var.x();
    }

    @Override // j$.util.stream.e2, j$.util.stream.g2
    public final void accept(int i) {
        this.c.accept(i);
    }
}
