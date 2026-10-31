package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class al0 extends Drawable {
    public final lv e;
    public final lv f;
    public float h;
    public float i;
    public final Rect a = new Rect();
    public final gr b = vs.b;
    public final int c = org.telegram.messenger.i0.L(24.0f);
    public final int d = org.telegram.messenger.i0.L(24.0f);
    public long g = -1;

    public al0() {
        lv lvVar = new lv(1, (byte) 0);
        this.e = lvVar;
        lvVar.c.setColor(-2130706433);
        lv lvVar2 = new lv(1, (byte) 0);
        this.f = lvVar2;
        lvVar2.c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f7);
        int L = (int) (org.telegram.messenger.i0.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (org.telegram.messenger.i0.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (org.telegram.messenger.i0.L(4.0f) * this.i));
        lv lvVar = this.f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        int L3 = org.telegram.messenger.i0.L(12.0f);
        rect.right = L3;
        rect.left = L3;
        int L4 = org.telegram.messenger.i0.L(8.0f);
        rect.bottom = L4;
        rect.top = L4;
        rect.inset(-org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 10, 11)), -org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 2, 3)));
        lv lvVar2 = this.e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(org.telegram.messenger.i0.W1(interpolation, 128, org.telegram.messenger.zs.e4));
        lvVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f7);
        int L = (int) (org.telegram.messenger.i0.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (org.telegram.messenger.i0.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (org.telegram.messenger.i0.L(4.0f) * this.i));
        rect.offset(0, org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 0, -8)));
        lv lvVar = this.f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.i0.N(org.telegram.messenger.i0.W1(interpolation, 1, 2)) * this.h);
        int N = (int) (org.telegram.messenger.i0.N(org.telegram.messenger.i0.W1(interpolation, 5, 6)) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.i0.N(org.telegram.messenger.i0.W1(interpolation, 6, 4)) * this.i));
        rect.offset(0, org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 0, 8)));
        lv lvVar2 = this.e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(org.telegram.messenger.zs.e4);
        lvVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f7);
        int L = (int) (org.telegram.messenger.i0.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (org.telegram.messenger.i0.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (org.telegram.messenger.i0.L(4.0f) * this.i));
        rect.offset(0, org.telegram.messenger.i0.L(-8.0f));
        lv lvVar = this.f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.i0.N(2.0f) * this.h);
        int N = (int) (org.telegram.messenger.i0.N(6.0f) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.i0.N(4.0f) * this.i));
        rect.offset(0, org.telegram.messenger.i0.L(8.0f));
        lv lvVar2 = this.e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(org.telegram.messenger.i0.W1(interpolation, org.telegram.messenger.zs.e4, 128));
        lvVar2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g <= 0) {
            a(canvas, 0.0f);
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.g);
        int i10 = currentTimeMillis - 300;
        if (i10 < 0) {
            a(canvas, 0.0f);
        } else if (i10 < 150) {
            a(canvas, i10 / 150.0f);
        } else {
            int i11 = currentTimeMillis - 750;
            if (i11 < 0) {
                a(canvas, 1.0f);
            } else if (i11 < 200) {
                b(canvas, i11 / 200.0f);
            } else {
                int i12 = currentTimeMillis - 1250;
                if (i12 < 0) {
                    b(canvas, 1.0f);
                } else if (i12 < 150) {
                    c(canvas, i12 / 150.0f);
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
    public final void setAlpha(int i10) {
    }
}
