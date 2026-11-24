package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
