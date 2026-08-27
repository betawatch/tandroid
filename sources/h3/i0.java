package h3;

import android.media.MediaFormat;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 implements e5.m, d2 {
    public e5.m a;
    public i0 b;

    @Override // e5.m
    public final void a(long j10, long j11, t0 t0Var, MediaFormat mediaFormat) {
        e5.m mVar = this.a;
        if (mVar != null) {
            mVar.a(j10, j11, t0Var, mediaFormat);
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
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (e5.m) obj;
        } else if (i10 == 8) {
            this.b = (i0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }
}
