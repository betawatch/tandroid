package i2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class c0 implements a3.y, i1 {
    public a3.y a;
    public c0 b;

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        a3.y yVar = this.a;
        if (yVar != null) {
            yVar.a(j3, j10, sVar, mediaFormat);
        }
    }

    public final void b() {
        c0 c0Var = this.b;
        if (c0Var != null) {
            c0Var.b();
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
