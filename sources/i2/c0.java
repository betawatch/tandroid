package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class c0 implements a3.y, i1 {
    public a3.y a;
    public c0 b;

    public final void a() {
        c0 c0Var = this.b;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    @Override // a3.y
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.y yVar = this.a;
        if (yVar != null) {
            yVar.b(j3, j10, sVar, mediaFormat);
        }
    }

    @Override // i2.i1
    public final void c(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (a3.y) obj;
        } else if (i10 == 8) {
            this.b = (c0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d() {
        c0 c0Var = this.b;
        if (c0Var != null) {
            c0Var.d();
        }
    }
}
