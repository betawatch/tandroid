// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fwc implements ewc {
    public final g84 a;
    public final x1c b;
    public final go9 c;
    public final ko4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public fwc(g84 g84Var, x1c x1cVar, go9 go9Var, String str, int i) {
        this.a = g84Var;
        this.b = x1cVar;
        this.c = go9Var;
        int i2 = go9Var.a;
        int i3 = go9Var.b;
        int i4 = (go9Var.d * i2) / 8;
        int i5 = go9Var.c;
        if (i5 != i4) {
            throw hy7.a("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = i3 * i4;
        int i7 = i6 << 3;
        int max = Math.max(i4, i6 / 10);
        this.e = max;
        jo4 jo4Var = new jo4();
        jo4Var.r = eg7.n("audio/wav");
        jo4Var.s = eg7.n(str);
        jo4Var.i = i7;
        jo4Var.j = i7;
        jo4Var.t = max;
        jo4Var.M = i2;
        int i8 = go9Var.e;
        jo4Var.N = i8 == 0 ? -1 : i8 << 2;
        jo4Var.O = i3;
        jo4Var.P = i;
        this.d = new ko4(jo4Var);
    }

    @Override // ewc
    public final boolean a(cb3 cb3Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int f = this.b.f(cb3Var, (int) Math.min(i2 - i, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        go9 go9Var = this.c;
        int i3 = go9Var.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = go9Var.b;
            String str = gcc.a;
            long b0 = j3 + gcc.b0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(b0, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // ewc
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // ewc
    public final void c(int i, long j) {
        iwc iwcVar = new iwc(this.c, 1, i, j);
        this.a.m0(iwcVar);
        ko4 ko4Var = this.d;
        x1c x1cVar = this.b;
        x1cVar.g(ko4Var);
        x1cVar.d(iwcVar.e);
    }
}
