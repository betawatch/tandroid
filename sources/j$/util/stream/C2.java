package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class C2 extends y2 {
    private R2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.R2, j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.V2] */
    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final void l(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new V2();
        } else {
            r0 = new R2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.g2, j$.util.stream.m2
    public final void k() {
        int[] iArr = (int[]) this.c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        m2 m2Var = this.a;
        m2Var.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                m2Var.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (m2Var.n()) {
                    break;
                }
                m2Var.accept(i2);
                i++;
            }
        }
        m2Var.k();
    }

    @Override // j$.util.stream.k2, j$.util.stream.m2
    public final void accept(int i) {
        this.c.accept(i);
    }
}
