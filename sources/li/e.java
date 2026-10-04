package li;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public abstract class e extends Drawable {
    public n a = m.f();
    public int b = 255;
    public float c;
    public float d;

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

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b;
    }

    public final void i(float f7, float f10) {
        if (this.c == f7 && this.d == f10) {
            return;
        }
        this.c = f7;
        this.d = f10;
        h();
    }

    public abstract boolean j();

    public abstract void k();

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.b;
        if (i11 != i10) {
            this.b = i10;
            f(i11, i10);
        }
    }

    public void g(n nVar) {
    }

    public void h() {
    }

    public void f(int i10, int i11) {
    }
}
