package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class F2 extends t2 {
    public Object[] d;
    public int e;

    @Override // j$.util.stream.b2, j$.util.stream.f2
    public final void y(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.b2, j$.util.stream.f2
    public final void x() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        f2 f2Var = this.a;
        f2Var.y(j);
        if (!this.c) {
            while (i < this.e) {
                f2Var.accept((f2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !f2Var.C()) {
                f2Var.accept((f2) this.d[i]);
                i++;
            }
        }
        f2Var.x();
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
