package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j6 extends x5 {
    public Object[] d;
    public int e;

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void o(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j10];
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void end() {
        int i9 = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j10 = this.e;
        j5 j5Var = this.a;
        j5Var.o(j10);
        if (!this.c) {
            while (i9 < this.e) {
                j5Var.accept((j5) this.d[i9]);
                i9++;
            }
        } else {
            while (i9 < this.e && !j5Var.q()) {
                j5Var.accept((j5) this.d[i9]);
                i9++;
            }
        }
        j5Var.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i9 = this.e;
        this.e = i9 + 1;
        objArr[i9] = obj;
    }
}
