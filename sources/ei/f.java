package ei;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public abstract class f extends Drawable {
    public final Rect a = new Rect();
    public s b = r.f();
    public int c = at.e4;
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

    public abstract void f(int i10);

    public abstract void g(s sVar);

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    public final void i(float f7, float f10) {
        if (this.d == f7 && this.e == f10) {
            return;
        }
        this.d = f7;
        this.e = f10;
        h();
    }

    public abstract boolean j();

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.c != i10) {
            this.c = i10;
            f(i10);
        }
    }

    public abstract void updateColors();

    public void h() {
    }
}
