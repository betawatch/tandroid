package li;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public abstract class e extends Drawable {
    public q a = p.f();
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
        if (this.b != i10) {
            this.b = i10;
            f(i10);
        }
    }

    public void f(int i10) {
    }

    public void g(q qVar) {
    }

    public void h() {
    }
}
