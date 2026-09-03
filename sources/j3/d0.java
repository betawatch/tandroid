package j3;

import android.media.MediaFormat;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d0 implements i5.n, b2 {
    public i5.n a;
    public d0 b;

    @Override // i5.n
    public final void a(long j10, long j11, n0 n0Var, MediaFormat mediaFormat) {
        i5.n nVar = this.a;
        if (nVar != null) {
            nVar.a(j10, j11, n0Var, mediaFormat);
        }
    }

    @Override // j3.b2
    public final void b(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (i5.n) obj;
        } else if (i10 == 8) {
            this.b = (d0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void c() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    public final void d() {
        d0 d0Var = this.b;
        if (d0Var != null) {
            d0Var.d();
        }
    }
}
