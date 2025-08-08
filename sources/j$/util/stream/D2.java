package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class D2 extends r2 {
    private Object[] d;
    private int e;

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final void n(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.Z1, j$.util.stream.d2
    public final void m() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        d2 d2Var = this.a;
        d2Var.n(j);
        if (!this.c) {
            while (i < this.e) {
                d2Var.r((d2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !d2Var.q()) {
                d2Var.r((d2) this.d[i]);
                i++;
            }
        }
        d2Var.m();
        this.d = null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }
}
