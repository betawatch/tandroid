package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class eq0 extends Drawable {
    public long a = 0;
    public final float[] b = {0.0f, -0.5f};
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final int f;

    public eq0(Context context, int i10) {
        this.f = i10;
        if (i10 == 4) {
            this.c = context.getResources().getDrawable(R.drawable.filled_extend_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i10 == 5) {
            this.c = context.getResources().getDrawable(R.drawable.filled_stop_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i10 == 1) {
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
        int C;
        int i10;
        Drawable drawable = this.c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i11 = 3;
        int i12 = 5;
        int i13 = 1;
        int i14 = this.f;
        int i15 = 4;
        int dp4 = (i14 == 4 || i14 == 5) ? AndroidUtilities.dp(24.0f) : i14 == 3 ? AndroidUtilities.dp(44.0f) : i14 == 2 ? AndroidUtilities.dp(32.0f) : i14 == 1 ? AndroidUtilities.dp(30.0f) : AndroidUtilities.dp(120.0f);
        int intrinsicHeight2 = ((getIntrinsicHeight() - dp4) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - dp4) / 2) + getBounds().left;
        int i16 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i16, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i17 = 0;
        while (true) {
            fArr = this.b;
            if (i17 >= 2) {
                break;
            }
            float f9 = fArr[i17];
            if (f9 >= 0.0f) {
                float f10 = (f9 * 0.5f) + 0.5f;
                if (i14 == i15 || i14 == i12) {
                    int dp5 = AndroidUtilities.dp(2.5f * f10);
                    dp = AndroidUtilities.dp(f10 * 6.5f);
                    int dp6 = AndroidUtilities.dp(fArr[i17] * 6.0f);
                    dp2 = (AndroidUtilities.dp(3.0f) + intrinsicWidth2) - dp6;
                    dp3 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(2.0f);
                    C = org.telegram.ui.b.C(3.0f, i16, dp6);
                    i10 = dp5;
                } else if (i14 == i11) {
                    i10 = AndroidUtilities.dp(5.0f * f10);
                    dp = AndroidUtilities.dp(f10 * 18.0f);
                    int dp7 = AndroidUtilities.dp(fArr[i17] * 15.0f);
                    dp2 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp7;
                    dp3 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    C = org.telegram.ui.b.C(2.0f, i16, dp7);
                } else if (i14 == 2) {
                    i10 = AndroidUtilities.dp(5.0f * f10);
                    dp = AndroidUtilities.dp(f10 * 18.0f);
                    int dp8 = AndroidUtilities.dp(fArr[i17] * 15.0f);
                    dp2 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp8;
                    dp3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    C = org.telegram.ui.b.C(2.0f, i16, dp8);
                } else if (i14 == i13) {
                    int dp9 = AndroidUtilities.dp(2.5f * f10);
                    dp = AndroidUtilities.dp(f10 * 6.5f);
                    int dp10 = AndroidUtilities.dp(fArr[i17] * 6.0f);
                    dp2 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - dp10;
                    dp3 = (intrinsicHeight / 2) + intrinsicHeight2;
                    i10 = dp9;
                    C = org.telegram.ui.b.C(7.0f, i16, dp10);
                } else {
                    i10 = AndroidUtilities.dp(5.0f * f10);
                    dp = AndroidUtilities.dp(f10 * 18.0f);
                    int dp11 = AndroidUtilities.dp(fArr[i17] * 15.0f);
                    dp2 = (AndroidUtilities.dp(42.0f) + intrinsicWidth2) - dp11;
                    dp3 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    C = org.telegram.ui.b.C(42.0f, i16, dp11);
                }
                float f11 = fArr[i17];
                int a2 = (int) ((f11 < 0.5f ? f11 / 0.5f : org.telegram.messenger.x3.a(f11, 0.5f, 0.5f, 1.0f)) * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(a2);
                int i18 = dp3 - dp;
                int i19 = dp3 + dp;
                drawable2.setBounds(dp2 - i10, i18, dp2 + i10, i19);
                drawable2.draw(canvas);
                Drawable drawable3 = this.e;
                drawable3.setAlpha(a2);
                drawable3.setBounds(C - i10, i18, C + i10, i19);
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
        return (i10 == 4 || i10 == 5) ? AndroidUtilities.dp(42.0f) : i10 == 3 ? AndroidUtilities.dp(100.0f) : i10 == 2 ? AndroidUtilities.dp(74.0f) : i10 == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(180.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i10 = this.f;
        return (i10 == 4 || i10 == 5) ? AndroidUtilities.dp(42.0f) : i10 == 3 ? AndroidUtilities.dp(100.0f) : i10 == 2 ? AndroidUtilities.dp(74.0f) : i10 == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(120.0f);
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
