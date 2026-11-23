package l2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class a0 implements d3.v, i1 {
    public d3.v a;
    public a0 b;

    @Override // d3.v
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        d3.v vVar = this.a;
        if (vVar != null) {
            vVar.a(j3, j10, uVar, mediaFormat);
        }
    }

    public final void b() {
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // l2.i1
    public final void c(int i7, Object obj) {
        if (i7 == 7) {
            this.a = (d3.v) obj;
        } else if (i7 == 8) {
            this.b = (a0) obj;
        } else if (i7 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d() {
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.d();
        }
    }
}
