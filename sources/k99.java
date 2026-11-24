// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k99 extends Drawable {
    public final ck3 e;
    public final ck3 f;
    public float h;
    public float i;
    public final Rect a = new Rect();
    public final d53 b = vt3.b;
    public final int c = gm.L(24.0f);
    public final int d = gm.L(24.0f);
    public long g = -1;

    public k99() {
        ck3 ck3Var = new ck3((byte) 2);
        this.e = ck3Var;
        ck3Var.b.setColor(-2130706433);
        ck3 ck3Var2 = new ck3((byte) 2);
        this.f = ck3Var2;
        ck3Var2.b.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        int L = (int) (gm.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (gm.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (gm.L(4.0f) * this.i));
        ck3 ck3Var = this.f;
        ck3Var.setBounds(rect);
        ck3Var.draw(canvas);
        int L3 = gm.L(12.0f);
        rect.right = L3;
        rect.left = L3;
        int L4 = gm.L(8.0f);
        rect.bottom = L4;
        rect.top = L4;
        rect.inset(-gm.L(gm.U1(interpolation, 10, 11)), -gm.L(gm.U1(interpolation, 2, 3)));
        ck3 ck3Var2 = this.e;
        ck3Var2.setBounds(rect);
        ck3Var2.setAlpha(gm.U1(interpolation, 128, nm7.d4));
        ck3Var2.draw(canvas);
    }

    public final void b(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        int L = (int) (gm.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (gm.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (gm.L(4.0f) * this.i));
        rect.offset(0, gm.L(gm.U1(interpolation, 0, -8)));
        ck3 ck3Var = this.f;
        ck3Var.setBounds(rect);
        ck3Var.draw(canvas);
        rect.left = (int) (gm.N(gm.U1(interpolation, 1, 2)) * this.h);
        int N = (int) (gm.N(gm.U1(interpolation, 5, 6)) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (gm.N(gm.U1(interpolation, 6, 4)) * this.i));
        rect.offset(0, gm.L(gm.U1(interpolation, 0, 8)));
        ck3 ck3Var2 = this.e;
        ck3Var2.setBounds(rect);
        ck3Var2.setAlpha(nm7.d4);
        ck3Var2.draw(canvas);
    }

    public final void c(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        int L = (int) (gm.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (gm.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (gm.L(4.0f) * this.i));
        rect.offset(0, gm.L(-8.0f));
        ck3 ck3Var = this.f;
        ck3Var.setBounds(rect);
        ck3Var.draw(canvas);
        rect.left = (int) (gm.N(2.0f) * this.h);
        int N = (int) (gm.N(6.0f) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (gm.N(4.0f) * this.i));
        rect.offset(0, gm.L(8.0f));
        ck3 ck3Var2 = this.e;
        ck3Var2.setBounds(rect);
        ck3Var2.setAlpha(gm.U1(interpolation, nm7.d4, 128));
        ck3Var2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g <= 0) {
            a(canvas, 0.0f);
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.g);
        int i = currentTimeMillis - 300;
        if (i < 0) {
            a(canvas, 0.0f);
        } else if (i < 150) {
            a(canvas, i / 150.0f);
        } else {
            int i2 = currentTimeMillis - 750;
            if (i2 < 0) {
                a(canvas, 1.0f);
            } else if (i2 < 200) {
                b(canvas, i2 / 200.0f);
            } else {
                int i3 = currentTimeMillis - 1250;
                if (i3 < 0) {
                    b(canvas, 1.0f);
                } else if (i3 < 150) {
                    c(canvas, i3 / 150.0f);
                } else {
                    c(canvas, 1.0f);
                    if (currentTimeMillis - 1400 >= 100) {
                        this.g = System.currentTimeMillis();
                    }
                }
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.c;
        this.i = rect.height() / this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
