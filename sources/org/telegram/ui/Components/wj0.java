package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wj0 extends Drawable {
    public final zu e;
    public final zu f;
    public float h;
    public float i;
    public final Rect a = new Rect();
    public final wq b = js.b;
    public final int c = org.telegram.messenger.g0.L(24.0f);
    public final int d = org.telegram.messenger.g0.L(24.0f);
    public long g = -1;

    public wj0() {
        zu zuVar = new zu(1, (byte) 0);
        this.e = zuVar;
        zuVar.c.setColor(-2130706433);
        zu zuVar2 = new zu(1, (byte) 0);
        this.f = zuVar2;
        zuVar2.c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f10);
        int L = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (org.telegram.messenger.g0.L(4.0f) * this.i));
        zu zuVar = this.f;
        zuVar.setBounds(rect);
        zuVar.draw(canvas);
        int L3 = org.telegram.messenger.g0.L(12.0f);
        rect.right = L3;
        rect.left = L3;
        int L4 = org.telegram.messenger.g0.L(8.0f);
        rect.bottom = L4;
        rect.top = L4;
        rect.inset(-org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 10, 11)), -org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 2, 3)));
        zu zuVar2 = this.e;
        zuVar2.setBounds(rect);
        zuVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 128, org.telegram.messenger.qs.e4));
        zuVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f10);
        int L = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (org.telegram.messenger.g0.L(4.0f) * this.i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, -8)));
        zu zuVar = this.f;
        zuVar.setBounds(rect);
        zuVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 1, 2)) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 5, 6)) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 6, 4)) * this.i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, 8)));
        zu zuVar2 = this.e;
        zuVar2.setBounds(rect);
        zuVar2.setAlpha(org.telegram.messenger.qs.e4);
        zuVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f10);
        int L = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (org.telegram.messenger.g0.L(4.0f) * this.i));
        rect.offset(0, org.telegram.messenger.g0.L(-8.0f));
        zu zuVar = this.f;
        zuVar.setBounds(rect);
        zuVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(2.0f) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(6.0f) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(4.0f) * this.i));
        rect.offset(0, org.telegram.messenger.g0.L(8.0f));
        zu zuVar2 = this.e;
        zuVar2.setBounds(rect);
        zuVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, org.telegram.messenger.qs.e4, 128));
        zuVar2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g <= 0) {
            a(canvas, 0.0f);
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.g);
        int i7 = currentTimeMillis - 300;
        if (i7 < 0) {
            a(canvas, 0.0f);
        } else if (i7 < 150) {
            a(canvas, i7 / 150.0f);
        } else {
            int i10 = currentTimeMillis - 750;
            if (i10 < 0) {
                a(canvas, 1.0f);
            } else if (i10 < 200) {
                b(canvas, i10 / 200.0f);
            } else {
                int i11 = currentTimeMillis - 1250;
                if (i11 < 0) {
                    b(canvas, 1.0f);
                } else if (i11 < 150) {
                    c(canvas, i11 / 150.0f);
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
    public final void setAlpha(int i7) {
    }
}
