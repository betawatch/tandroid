package l2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d0 implements d3.w, m1 {
    public d3.w a;
    public d0 b;

    public final void a() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    @Override // d3.w
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        d3.w wVar = this.a;
        if (wVar != null) {
            wVar.b(j3, j10, uVar, mediaFormat);
        }
    }

    @Override // l2.m1
    public final void c(int i7, Object obj) {
        if (i7 == 7) {
            this.a = (d3.w) obj;
        } else if (i7 == 8) {
            this.b = (d0) obj;
        } else if (i7 == 10000 && obj != null) {
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
