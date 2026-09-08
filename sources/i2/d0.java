package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d0 implements a3.y, i1 {
    public a3.y a;
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

    @Override // a3.y
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.y yVar = this.a;
        if (yVar != null) {
            yVar.c(j3, j10, sVar, mediaFormat);
        }
    }

    @Override // i2.i1
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
