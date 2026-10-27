package oi;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class e extends Drawable {
    public r a = q.f();
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

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.b != i10) {
            this.b = i10;
            f(i10);
        }
    }

    public abstract void updateColors();

    public void f(int i10) {
    }

    public void g(r rVar) {
    }

    public void h() {
    }
}
