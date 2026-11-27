// default package

import android.graphics.RectF;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class bdc {
    public final RectF e = new RectF();
    public final adc a = new adc(0.0f);
    public final adc b = new adc(0.0f);
    public final adc c = new adc(0.0f);
    public final adc d = new adc(0.0f);

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
