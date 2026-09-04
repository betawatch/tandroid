package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j6 extends x5 {
    public Object[] d;
    public int e;

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void o(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j3];
    }

    @Override // j$.util.stream.f5, j$.util.stream.j5
    public final void end() {
        int i10 = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j3 = this.e;
        j5 j5Var = this.a;
        j5Var.o(j3);
        if (!this.c) {
            while (i10 < this.e) {
                j5Var.accept((j5) this.d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.e && !j5Var.q()) {
                j5Var.accept((j5) this.d[i10]);
                i10++;
            }
        }
        j5Var.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i10 = this.e;
        this.e = i10 + 1;
        objArr[i10] = obj;
    }
}
