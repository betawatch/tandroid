package oi;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public abstract class e extends Drawable {
    public final Rect a = new Rect();
    public r b = q.f();
    public int c = qs.e4;
    public float d;
    public float e;

    public abstract void a();

    public void b(Rect rect) {
        rect.set(getBounds());
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public abstract boolean e();

    public abstract void f(int i7);

    public abstract void g(r rVar);

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    public final void i(float f10, float f11) {
        if (this.d == f10 && this.e == f11) {
            return;
        }
        this.d = f10;
        this.e = f11;
        h();
    }

    public abstract boolean j();

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.c != i7) {
            this.c = i7;
            f(i7);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
