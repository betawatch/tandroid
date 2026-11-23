package l2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b0 implements d3.v, j1 {
    public d3.v a;
    public b0 b;

    @Override // d3.v
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        d3.v vVar = this.a;
        if (vVar != null) {
            vVar.a(j3, j10, uVar, mediaFormat);
        }
    }

    public final void b() {
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // l2.j1
    public final void c(int i7, Object obj) {
        if (i7 == 7) {
            this.a = (d3.v) obj;
        } else if (i7 == 8) {
            this.b = (b0) obj;
        } else if (i7 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d() {
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.d();
        }
    }
}
