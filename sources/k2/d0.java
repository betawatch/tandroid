package k2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 implements c3.w, l1 {
    public c3.w a;
    public d0 b;

    @Override // c3.w
    public final void a(long j10, long j11, d2.v vVar, MediaFormat mediaFormat) {
        c3.w wVar = this.a;
        if (wVar != null) {
            wVar.a(j10, j11, vVar, mediaFormat);
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

    @Override // k2.l1
    public final void d(int i3, Object obj) {
        if (i3 == 7) {
            this.a = (c3.w) obj;
        } else if (i3 == 8) {
            this.b = (d0) obj;
        } else if (i3 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
