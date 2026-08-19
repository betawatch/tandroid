package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w2 extends s2 {
    public M2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.M2, j$.util.stream.O2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.O2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.O2] */
    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final void y(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new O2();
        } else {
            r0 = new M2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.a2, j$.util.stream.f2
    public final void x() {
        long[] jArr = (long[]) this.c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        f2 f2Var = this.a;
        f2Var.y(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                f2Var.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (f2Var.C()) {
                    break;
                }
                f2Var.accept(j);
                i++;
            }
        }
        f2Var.x();
    }

    @Override // j$.util.stream.e2, j$.util.stream.f2
    public final void accept(long j) {
        this.c.accept(j);
    }
}
