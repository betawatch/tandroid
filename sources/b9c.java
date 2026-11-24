// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b9c {
    public final RectF e = new RectF();
    public final a9c a = new a9c(0.0f);
    public final a9c b = new a9c(0.0f);
    public final a9c c = new a9c(0.0f);
    public final a9c d = new a9c(0.0f);

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
