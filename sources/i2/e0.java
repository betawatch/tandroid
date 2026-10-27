package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e0 implements a3.y, m1 {
    public a3.y a;
    public e0 b;

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        a3.y yVar = this.a;
        if (yVar != null) {
            yVar.a(j10, j11, xVar, mediaFormat);
        }
    }

    public final void b() {
        e0 e0Var = this.b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // i2.m1
    public final void c(int i10, Object obj) {
        if (i10 == 7) {
            this.a = (a3.y) obj;
        } else if (i10 == 8) {
            this.b = (e0) obj;
        } else if (i10 == 10000 && obj != null) {
            throw new ClassCastException();
        }
    }

    public final void d() {
        e0 e0Var = this.b;
        if (e0Var != null) {
            e0Var.d();
        }
    }
}
