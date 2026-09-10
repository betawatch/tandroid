package le;

import android.graphics.RectF;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n {
    public final RectF e = new RectF();
    public final m a = new m(0.0f);
    public final m b = new m(0.0f);
    public final m c = new m(0.0f);
    public final m d = new m(0.0f);

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
