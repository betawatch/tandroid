package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class n6 extends b6 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        n5 n5Var = this.a;
        n5Var.n(j);
        if (this.c) {
            while (i < this.e && !n5Var.q()) {
                n5Var.accept((n5) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                n5Var.accept((n5) this.d[i]);
                i++;
            }
        }
        n5Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void n(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
        } else {
            j$.time.g.c("Stream size exceeds max array size");
        }
    }
}
