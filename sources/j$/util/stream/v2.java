package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v2 extends r2 {
    public K2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.K2, j$.util.stream.O2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.O2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.O2] */
    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final void y(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new O2();
        } else {
            r0 = new K2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.f2
    public final void x() {
        int[] iArr = (int[]) this.c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        f2 f2Var = this.a;
        f2Var.y(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                f2Var.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (f2Var.C()) {
                    break;
                }
                f2Var.accept(i2);
                i++;
            }
        }
        f2Var.x();
    }

    @Override // j$.util.stream.d2, j$.util.stream.f2
    public final void accept(int i) {
        this.c.accept(i);
    }
}
