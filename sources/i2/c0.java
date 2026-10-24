package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class c0 implements a3.y, k1 {
    public a3.y a;
    public c0 b;

    public final void a() {
        c0 c0Var = this.b;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    public final void b() {
        c0 c0Var = this.b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // a3.y
    public final void c(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        a3.y yVar = this.a;
        if (yVar != null) {
            yVar.c(j10, j11, wVar, mediaFormat);
        }
    }

    @Override // i2.k1
    public final void d(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (a3.y) obj;
        } else if (i10 == 8) {
            this.b = (c0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
