package le;

import android.graphics.RectF;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class o {
    public final RectF e = new RectF();
    public final n a = new n(0.0f);
    public final n b = new n(0.0f);
    public final n c = new n(0.0f);
    public final n d = new n(0.0f);

    public final boolean a(float f7) {
        return this.d.a(f7) || (this.c.a(f7) || (this.b.a(f7) || this.a.a(f7)));
    }

    public final boolean b(float f7, float f10, float f11, float f12) {
        return this.a.b(f7) || this.b.b(f10) || this.c.b(f11) || this.d.b(f12);
    }

    public final void c(boolean z10) {
        this.a.c(z10);
        this.b.c(z10);
        this.c.c(z10);
        this.d.c(z10);
    }

    public final void d(float f7, float f10, float f11, float f12) {
        this.a.d(f7);
        this.b.d(f10);
        this.c.d(f11);
        this.d.d(f12);
    }

    public final void e(float f7, float f10, float f11, float f12) {
        this.a.c = f7;
        this.b.c = f10;
        this.c.c = f11;
        this.d.c = f12;
    }
}
