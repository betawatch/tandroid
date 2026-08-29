package j3;

import android.media.MediaFormat;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 implements g5.n, d2 {
    public g5.n a;
    public i0 b;

    @Override // g5.n
    public final void a(long j10, long j11, t0 t0Var, MediaFormat mediaFormat) {
        g5.n nVar = this.a;
        if (nVar != null) {
            nVar.a(j10, j11, t0Var, mediaFormat);
        }
    }

    public final void b() {
        i0 i0Var = this.b;
        if (i0Var != null) {
            i0Var.b();
        }
    }

    public final void c() {
        i0 i0Var = this.b;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override // j3.d2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (g5.n) obj;
        } else if (i10 == 8) {
            this.b = (i0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
