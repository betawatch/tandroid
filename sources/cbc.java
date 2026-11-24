// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cbc {
    public final RectF e = new RectF();
    public final bbc a = new bbc(0.0f);
    public final bbc b = new bbc(0.0f);
    public final bbc c = new bbc(0.0f);
    public final bbc d = new bbc(0.0f);

    public final boolean a(float f) {
        return this.d.a(f) || (this.c.a(f) || (this.b.a(f) || this.a.a(f)));
    }

    public final boolean b(float f, float f2, float f3, float f4) {
        return this.a.b(f) || this.b.b(f2) || this.c.b(f3) || this.d.b(f4);
    }

    public final void c(boolean z) {
        this.a.c(z);
        this.b.c(z);
        this.c.c(z);
        this.d.c(z);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.a.d(f);
        this.b.d(f2);
        this.c.d(f3);
        this.d.d(f4);
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.a.c = f;
        this.b.c = f2;
        this.c.c = f3;
        this.d.c = f4;
    }
}
