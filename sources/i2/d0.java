package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class d0 implements a3.y, j1 {
    public a3.y a;
    public d0 b;

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.y yVar = this.a;
        if (yVar != null) {
            yVar.a(j3, j10, sVar, mediaFormat);
        }
    }

    public final void b() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // i2.j1
    public final void c(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (a3.y) obj;
        } else if (i10 == 8) {
            this.b = (d0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.d();
        }
    }
}
