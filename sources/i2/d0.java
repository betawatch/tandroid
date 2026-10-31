package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 implements a3.y, o1 {
    public a3.y a;
    public d0 b;

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        a3.y yVar = this.a;
        if (yVar != null) {
            yVar.a(j10, j11, xVar, mediaFormat);
        }
    }

    public final void b() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final void c() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // i2.o1
    public final void d(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (a3.y) obj;
        } else if (i10 == 8) {
            this.b = (d0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
