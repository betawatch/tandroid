package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pp0 extends Drawable {
    public long a = 0;
    public final float[] b = {0.0f, -0.5f};
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final int f;

    public pp0(Context context, int i10) {
        this.f = i10;
        if (i10 == 4) {
            this.c = i0.a.f(context, R.drawable.filled_extend_location);
            this.d = i0.a.f(context, R.drawable.smallanimationpinleft);
            this.e = i0.a.f(context, R.drawable.smallanimationpinright);
        } else if (i10 == 5) {
            this.c = i0.a.f(context, R.drawable.filled_stop_location);
            this.d = i0.a.f(context, R.drawable.smallanimationpinleft);
            this.e = i0.a.f(context, R.drawable.smallanimationpinright);
        } else if (i10 == 1) {
            this.c = i0.a.f(context, R.drawable.smallanimationpin);
            this.d = i0.a.f(context, R.drawable.smallanimationpinleft);
            this.e = i0.a.f(context, R.drawable.smallanimationpinright);
        } else {
            this.c = i0.a.f(context, R.drawable.animationpin);
            this.d = i0.a.f(context, R.drawable.animationpinleft);
            this.e = i0.a.f(context, R.drawable.animationpinright);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float[] fArr;
        int L;
        int L2;
        int L3;
        int D;
        int i10;
        Drawable drawable = this.c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i11 = 3;
        int i12 = 5;
        int i13 = 1;
        int i14 = this.f;
        int i15 = 4;
        int L4 = (i14 == 4 || i14 == 5) ? org.telegram.messenger.i0.L(24.0f) : i14 == 3 ? org.telegram.messenger.i0.L(44.0f) : i14 == 2 ? org.telegram.messenger.i0.L(32.0f) : i14 == 1 ? org.telegram.messenger.i0.L(30.0f) : org.telegram.messenger.i0.L(120.0f);
        int intrinsicHeight2 = ((getIntrinsicHeight() - L4) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - L4) / 2) + getBounds().left;
        int i16 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i16, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i17 = 0;
        while (true) {
            fArr = this.b;
            if (i17 >= 2) {
                break;
            }
            float f7 = fArr[i17];
            if (f7 >= 0.0f) {
                float f10 = (f7 * 0.5f) + 0.5f;
                if (i14 == i15 || i14 == i12) {
                    int L5 = org.telegram.messenger.i0.L(2.5f * f10);
                    L = org.telegram.messenger.i0.L(f10 * 6.5f);
                    int L6 = org.telegram.messenger.i0.L(fArr[i17] * 6.0f);
                    L2 = (org.telegram.messenger.i0.L(3.0f) + intrinsicWidth2) - L6;
                    L3 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.i0.L(2.0f);
                    D = org.telegram.messenger.z20.D(3.0f, i16, L6);
                    i10 = L5;
                } else if (i14 == i11) {
                    i10 = org.telegram.messenger.i0.L(5.0f * f10);
                    L = org.telegram.messenger.i0.L(f10 * 18.0f);
                    int L7 = org.telegram.messenger.i0.L(fArr[i17] * 15.0f);
                    L2 = (org.telegram.messenger.i0.L(2.0f) + intrinsicWidth2) - L7;
                    L3 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.i0.L(7.0f);
                    D = org.telegram.messenger.z20.D(2.0f, i16, L7);
                } else if (i14 == 2) {
                    i10 = org.telegram.messenger.i0.L(5.0f * f10);
                    L = org.telegram.messenger.i0.L(f10 * 18.0f);
                    int L8 = org.telegram.messenger.i0.L(fArr[i17] * 15.0f);
                    L2 = (org.telegram.messenger.i0.L(2.0f) + intrinsicWidth2) - L8;
                    L3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    D = org.telegram.messenger.z20.D(2.0f, i16, L8);
                } else if (i14 == i13) {
                    int L9 = org.telegram.messenger.i0.L(2.5f * f10);
                    L = org.telegram.messenger.i0.L(f10 * 6.5f);
                    int L10 = org.telegram.messenger.i0.L(fArr[i17] * 6.0f);
                    L2 = (org.telegram.messenger.i0.L(7.0f) + intrinsicWidth2) - L10;
                    L3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    i10 = L9;
                    D = org.telegram.messenger.z20.D(7.0f, i16, L10);
                } else {
                    i10 = org.telegram.messenger.i0.L(5.0f * f10);
                    L = org.telegram.messenger.i0.L(f10 * 18.0f);
                    int L11 = org.telegram.messenger.i0.L(fArr[i17] * 15.0f);
                    L2 = (org.telegram.messenger.i0.L(42.0f) + intrinsicWidth2) - L11;
                    L3 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.i0.L(7.0f);
                    D = org.telegram.messenger.z20.D(42.0f, i16, L11);
                }
                float f11 = fArr[i17];
                int y3 = (int) ((f11 < 0.5f ? f11 / 0.5f : org.telegram.messenger.m5.y(f11, 0.5f, 0.5f, 1.0f)) * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(y3);
                int i18 = L3 - L;
                int i19 = L3 + L;
                drawable2.setBounds(L2 - i10, i18, L2 + i10, i19);
                drawable2.draw(canvas);
                Drawable drawable3 = this.e;
                drawable3.setAlpha(y3);
                drawable3.setBounds(D - i10, i18, D + i10, i19);
                drawable3.draw(canvas);
            }
            i17++;
            i11 = 3;
            i12 = 5;
            i13 = 1;
            i15 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        if (j10 > 16) {
            j10 = 16;
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (fArr[i20] >= 1.0f) {
                fArr[i20] = 0.0f;
            }
            float f12 = (j10 / 1300.0f) + fArr[i20];
            fArr[i20] = f12;
            if (f12 > 1.0f) {
                fArr[i20] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i10 = this.f;
        return (i10 == 4 || i10 == 5) ? org.telegram.messenger.i0.L(42.0f) : i10 == 3 ? org.telegram.messenger.i0.L(100.0f) : i10 == 2 ? org.telegram.messenger.i0.L(74.0f) : i10 == 1 ? org.telegram.messenger.i0.L(40.0f) : org.telegram.messenger.i0.L(180.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i10 = this.f;
        return (i10 == 4 || i10 == 5) ? org.telegram.messenger.i0.L(42.0f) : i10 == 3 ? org.telegram.messenger.i0.L(100.0f) : i10 == 2 ? org.telegram.messenger.i0.L(74.0f) : i10 == 1 ? org.telegram.messenger.i0.L(40.0f) : org.telegram.messenger.i0.L(120.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }
}
