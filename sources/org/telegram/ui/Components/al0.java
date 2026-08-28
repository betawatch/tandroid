package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class al0 extends Drawable {
    public final mv e;
    public final mv f;
    public float h;
    public float i;
    public final Rect a = new Rect();
    public final gr b = xs.b;
    public final int c = AndroidUtilities.dp(24.0f);
    public final int d = AndroidUtilities.dp(24.0f);
    public long g = -1;

    public al0() {
        mv mvVar = new mv();
        this.e = mvVar;
        mvVar.c.setColor(-2130706433);
        mv mvVar2 = new mv();
        this.f = mvVar2;
        mvVar2.c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f10);
        int dp = (int) (AndroidUtilities.dp(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = dp;
        int dp2 = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.i));
        rect.bottom = dp2;
        rect.right = bounds.right - rect.left;
        rect.top = dp2 - ((int) (AndroidUtilities.dp(4.0f) * this.i));
        mv mvVar = this.f;
        mvVar.setBounds(rect);
        mvVar.draw(canvas);
        int dp3 = AndroidUtilities.dp(12.0f);
        rect.right = dp3;
        rect.left = dp3;
        int dp4 = AndroidUtilities.dp(8.0f);
        rect.bottom = dp4;
        rect.top = dp4;
        rect.inset(-AndroidUtilities.dp(AndroidUtilities.lerp(10, 11, interpolation)), -AndroidUtilities.dp(AndroidUtilities.lerp(2, 3, interpolation)));
        mv mvVar2 = this.e;
        mvVar2.setBounds(rect);
        mvVar2.setAlpha(AndroidUtilities.lerp(128, 255, interpolation));
        mvVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f10);
        int dp = (int) (AndroidUtilities.dp(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = dp;
        int dp2 = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.i));
        rect.bottom = dp2;
        rect.right = bounds.right - rect.left;
        rect.top = dp2 - ((int) (AndroidUtilities.dp(4.0f) * this.i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, -8, interpolation)));
        mv mvVar = this.f;
        mvVar.setBounds(rect);
        mvVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(1, 2, interpolation)) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(5, 6, interpolation)) * this.i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(6, 4, interpolation)) * this.i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, 8, interpolation)));
        mv mvVar2 = this.e;
        mvVar2.setBounds(rect);
        mvVar2.setAlpha(255);
        mvVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f10);
        int dp = (int) (AndroidUtilities.dp(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = dp;
        int dp2 = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.i));
        rect.bottom = dp2;
        rect.right = bounds.right - rect.left;
        rect.top = dp2 - ((int) (AndroidUtilities.dp(4.0f) * this.i));
        rect.offset(0, AndroidUtilities.dp(-8.0f));
        mv mvVar = this.f;
        mvVar.setBounds(rect);
        mvVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(2.0f) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(6.0f) * this.i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(4.0f) * this.i));
        rect.offset(0, AndroidUtilities.dp(8.0f));
        mv mvVar2 = this.e;
        mvVar2.setBounds(rect);
        mvVar2.setAlpha(AndroidUtilities.lerp(255, 128, interpolation));
        mvVar2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g <= 0) {
            a(canvas, 0.0f);
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.g);
        int i9 = currentTimeMillis - 300;
        if (i9 < 0) {
            a(canvas, 0.0f);
        } else if (i9 < 150) {
            a(canvas, i9 / 150.0f);
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
    public final void setAlpha(int i9) {
    }
}
