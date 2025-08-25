package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class M2 extends A2 {
    private Object[] d;
    private int e;

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.i2, j$.util.stream.m2
    public final void k() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        m2 m2Var = this.a;
        m2Var.l(j);
        if (!this.c) {
            while (i < this.e) {
                m2Var.accept((m2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !m2Var.n()) {
                m2Var.accept((m2) this.d[i]);
                i++;
            }
        }
        m2Var.k();
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
