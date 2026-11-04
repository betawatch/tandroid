package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class po0 extends Drawable {
    public long a = 0;
    public final float[] b = {0.0f, -0.5f};
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final int f;

    public po0(Context context, int i3) {
        this.f = i3;
        if (i3 == 4) {
            this.c = k2.p1.g(context, R.drawable.filled_extend_location);
            this.d = k2.p1.g(context, R.drawable.smallanimationpinleft);
            this.e = k2.p1.g(context, R.drawable.smallanimationpinright);
        } else if (i3 == 5) {
            this.c = k2.p1.g(context, R.drawable.filled_stop_location);
            this.d = k2.p1.g(context, R.drawable.smallanimationpinleft);
            this.e = k2.p1.g(context, R.drawable.smallanimationpinright);
        } else if (i3 == 1) {
            this.c = k2.p1.g(context, R.drawable.smallanimationpin);
            this.d = k2.p1.g(context, R.drawable.smallanimationpinleft);
            this.e = k2.p1.g(context, R.drawable.smallanimationpinright);
        } else {
            this.c = k2.p1.g(context, R.drawable.animationpin);
            this.d = k2.p1.g(context, R.drawable.animationpinleft);
            this.e = k2.p1.g(context, R.drawable.animationpinright);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float[] fArr;
        int L;
        int L2;
        int L3;
        int D;
        int i3;
        Drawable drawable = this.c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i10 = 3;
        int i11 = 5;
        int i12 = 1;
        int i13 = this.f;
        int i14 = 4;
        int L4 = (i13 == 4 || i13 == 5) ? org.telegram.messenger.g0.L(24.0f) : i13 == 3 ? org.telegram.messenger.g0.L(44.0f) : i13 == 2 ? org.telegram.messenger.g0.L(32.0f) : i13 == 1 ? org.telegram.messenger.g0.L(30.0f) : org.telegram.messenger.g0.L(120.0f);
        int intrinsicHeight2 = ((getIntrinsicHeight() - L4) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - L4) / 2) + getBounds().left;
        int i15 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i15, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i16 = 0;
        while (true) {
            fArr = this.b;
            if (i16 >= 2) {
                break;
            }
            float f10 = fArr[i16];
            if (f10 >= 0.0f) {
                float f11 = (f10 * 0.5f) + 0.5f;
                if (i13 == i14 || i13 == i11) {
                    int L5 = org.telegram.messenger.g0.L(2.5f * f11);
                    L = org.telegram.messenger.g0.L(f11 * 6.5f);
                    int L6 = org.telegram.messenger.g0.L(fArr[i16] * 6.0f);
                    L2 = (org.telegram.messenger.g0.L(3.0f) + intrinsicWidth2) - L6;
                    L3 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(2.0f);
                    D = org.telegram.messenger.camera.q.D(3.0f, i15, L6);
                    i3 = L5;
                } else if (i13 == i10) {
                    i3 = org.telegram.messenger.g0.L(5.0f * f11);
                    L = org.telegram.messenger.g0.L(f11 * 18.0f);
                    int L7 = org.telegram.messenger.g0.L(fArr[i16] * 15.0f);
                    L2 = (org.telegram.messenger.g0.L(2.0f) + intrinsicWidth2) - L7;
                    L3 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(7.0f);
                    D = org.telegram.messenger.camera.q.D(2.0f, i15, L7);
                } else if (i13 == 2) {
                    i3 = org.telegram.messenger.g0.L(5.0f * f11);
                    L = org.telegram.messenger.g0.L(f11 * 18.0f);
                    int L8 = org.telegram.messenger.g0.L(fArr[i16] * 15.0f);
                    L2 = (org.telegram.messenger.g0.L(2.0f) + intrinsicWidth2) - L8;
                    L3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    D = org.telegram.messenger.camera.q.D(2.0f, i15, L8);
                } else if (i13 == i12) {
                    int L9 = org.telegram.messenger.g0.L(2.5f * f11);
                    L = org.telegram.messenger.g0.L(f11 * 6.5f);
                    int L10 = org.telegram.messenger.g0.L(fArr[i16] * 6.0f);
                    L2 = (org.telegram.messenger.g0.L(7.0f) + intrinsicWidth2) - L10;
                    L3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    i3 = L9;
                    D = org.telegram.messenger.camera.q.D(7.0f, i15, L10);
                } else {
                    i3 = org.telegram.messenger.g0.L(5.0f * f11);
                    L = org.telegram.messenger.g0.L(f11 * 18.0f);
                    int L11 = org.telegram.messenger.g0.L(fArr[i16] * 15.0f);
                    L2 = (org.telegram.messenger.g0.L(42.0f) + intrinsicWidth2) - L11;
                    L3 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(7.0f);
                    D = org.telegram.messenger.camera.q.D(42.0f, i15, L11);
                }
                float f12 = fArr[i16];
                int y9 = (int) ((f12 < 0.5f ? f12 / 0.5f : org.telegram.messenger.k5.y(f12, 0.5f, 0.5f, 1.0f)) * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(y9);
                int i17 = L3 - L;
                int i18 = L3 + L;
                drawable2.setBounds(L2 - i3, i17, L2 + i3, i18);
                drawable2.draw(canvas);
                Drawable drawable3 = this.e;
                drawable3.setAlpha(y9);
                drawable3.setBounds(D - i3, i17, D + i3, i18);
                drawable3.draw(canvas);
            }
            i16++;
            i10 = 3;
            i11 = 5;
            i12 = 1;
            i14 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        if (j10 > 16) {
            j10 = 16;
        }
        for (int i19 = 0; i19 < 2; i19++) {
            if (fArr[i19] >= 1.0f) {
                fArr[i19] = 0.0f;
            }
            float f13 = (j10 / 1300.0f) + fArr[i19];
            fArr[i19] = f13;
            if (f13 > 1.0f) {
                fArr[i19] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i3 = this.f;
        return (i3 == 4 || i3 == 5) ? org.telegram.messenger.g0.L(42.0f) : i3 == 3 ? org.telegram.messenger.g0.L(100.0f) : i3 == 2 ? org.telegram.messenger.g0.L(74.0f) : i3 == 1 ? org.telegram.messenger.g0.L(40.0f) : org.telegram.messenger.g0.L(180.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i3 = this.f;
        return (i3 == 4 || i3 == 5) ? org.telegram.messenger.g0.L(42.0f) : i3 == 3 ? org.telegram.messenger.g0.L(100.0f) : i3 == 2 ? org.telegram.messenger.g0.L(74.0f) : i3 == 1 ? org.telegram.messenger.g0.L(40.0f) : org.telegram.messenger.g0.L(120.0f);
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
    public final void setAlpha(int i3) {
    }
}
