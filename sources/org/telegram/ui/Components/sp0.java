package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sp0 extends Drawable {
    public long a = 0;
    public final float[] b = {0.0f, -0.5f};
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final int f;

    public sp0(Context context, int i9) {
        this.f = i9;
        if (i9 == 4) {
            this.c = context.getResources().getDrawable(R.drawable.filled_extend_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i9 == 5) {
            this.c = context.getResources().getDrawable(R.drawable.filled_stop_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i9 == 1) {
            this.c = context.getResources().getDrawable(R.drawable.smallanimationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else {
            this.c = context.getResources().getDrawable(R.drawable.animationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.animationpinright).mutate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float[] fArr;
        int dp;
        int dp2;
        int dp3;
        int D;
        int i9;
        Drawable drawable = this.c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i10 = 3;
        int i11 = 5;
        int i12 = 1;
        int i13 = this.f;
        int i14 = 4;
        int dp4 = (i13 == 4 || i13 == 5) ? AndroidUtilities.dp(24.0f) : i13 == 3 ? AndroidUtilities.dp(44.0f) : i13 == 2 ? AndroidUtilities.dp(32.0f) : i13 == 1 ? AndroidUtilities.dp(30.0f) : AndroidUtilities.dp(120.0f);
        int intrinsicHeight2 = ((getIntrinsicHeight() - dp4) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - dp4) / 2) + getBounds().left;
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
                    int dp5 = AndroidUtilities.dp(2.5f * f11);
                    dp = AndroidUtilities.dp(f11 * 6.5f);
                    int dp6 = AndroidUtilities.dp(fArr[i16] * 6.0f);
                    dp2 = (AndroidUtilities.dp(3.0f) + intrinsicWidth2) - dp6;
                    dp3 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(2.0f);
                    D = org.telegram.messenger.ll.D(3.0f, i15, dp6);
                    i9 = dp5;
                } else if (i13 == i10) {
                    i9 = AndroidUtilities.dp(5.0f * f11);
                    dp = AndroidUtilities.dp(f11 * 18.0f);
                    int dp7 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                    dp2 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp7;
                    dp3 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    D = org.telegram.messenger.ll.D(2.0f, i15, dp7);
                } else if (i13 == 2) {
                    i9 = AndroidUtilities.dp(5.0f * f11);
                    dp = AndroidUtilities.dp(f11 * 18.0f);
                    int dp8 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                    dp2 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp8;
                    dp3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    D = org.telegram.messenger.ll.D(2.0f, i15, dp8);
                } else if (i13 == i12) {
                    int dp9 = AndroidUtilities.dp(2.5f * f11);
                    dp = AndroidUtilities.dp(f11 * 6.5f);
                    int dp10 = AndroidUtilities.dp(fArr[i16] * 6.0f);
                    dp2 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - dp10;
                    dp3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    i9 = dp9;
                    D = org.telegram.messenger.ll.D(7.0f, i15, dp10);
                } else {
                    i9 = AndroidUtilities.dp(5.0f * f11);
                    dp = AndroidUtilities.dp(f11 * 18.0f);
                    int dp11 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                    dp2 = (AndroidUtilities.dp(42.0f) + intrinsicWidth2) - dp11;
                    dp3 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    D = org.telegram.messenger.ll.D(42.0f, i15, dp11);
                }
                float f12 = fArr[i16];
                int a2 = (int) ((f12 < 0.5f ? f12 / 0.5f : org.telegram.messenger.l0.a(f12, 0.5f, 0.5f, 1.0f)) * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(a2);
                int i17 = dp3 - dp;
                int i18 = dp3 + dp;
                drawable2.setBounds(dp2 - i9, i17, dp2 + i9, i18);
                drawable2.draw(canvas);
                Drawable drawable3 = this.e;
                drawable3.setAlpha(a2);
                drawable3.setBounds(D - i9, i17, D + i9, i18);
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
        int i9 = this.f;
        return (i9 == 4 || i9 == 5) ? AndroidUtilities.dp(42.0f) : i9 == 3 ? AndroidUtilities.dp(100.0f) : i9 == 2 ? AndroidUtilities.dp(74.0f) : i9 == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(180.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i9 = this.f;
        return (i9 == 4 || i9 == 5) ? AndroidUtilities.dp(42.0f) : i9 == 3 ? AndroidUtilities.dp(100.0f) : i9 == 2 ? AndroidUtilities.dp(74.0f) : i9 == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(120.0f);
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
    public final void setAlpha(int i9) {
    }
}
