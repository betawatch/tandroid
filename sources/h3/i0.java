package h3;

import android.media.MediaFormat;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 implements e5.n, d2 {
    public e5.n a;
    public i0 b;

    @Override // e5.n
    public final void a(long j10, long j11, t0 t0Var, MediaFormat mediaFormat) {
        e5.n nVar = this.a;
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

    @Override // h3.d2
    public final void handleMessage(int i9, Object obj) {
        if (i9 == 7) {
            this.a = (e5.n) obj;
        } else if (i9 == 8) {
            this.b = (i0) obj;
        } else if (i9 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
