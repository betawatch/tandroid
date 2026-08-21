package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class G2 extends u2 {
    public Object[] d;
    public int e;

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final void y(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.c2, j$.util.stream.g2
    public final void x() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        g2 g2Var = this.a;
        g2Var.y(j);
        if (!this.c) {
            while (i < this.e) {
                g2Var.accept((g2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !g2Var.C()) {
                g2Var.accept((g2) this.d[i]);
                i++;
            }
        }
        g2Var.x();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }
}
