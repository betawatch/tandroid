package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d0 implements a3.x, i1 {
    public a3.x a;
    public d0 b;

    public final void a() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    public final void b() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // a3.x
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.x xVar = this.a;
        if (xVar != null) {
            xVar.c(j3, j10, sVar, mediaFormat);
        }
    }

    @Override // i2.i1
    public final void d(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (a3.x) obj;
        } else if (i10 == 8) {
            this.b = (d0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
