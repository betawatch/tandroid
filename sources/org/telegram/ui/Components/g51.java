package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g51 extends mw0 {
    public final int a = UserConfig.selectedAccount;
    public boolean b = false;
    public final float[] c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] e = {0.0f, 0.0f, 0.0f};
    public long f = 0;
    public boolean g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean i;
    public final Paint j;

    public g51(boolean z4) {
        if (z4) {
            this.j = new Paint(1);
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void b(int i10) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void c(boolean z4) {
        this.b = z4;
    }

    @Override // org.telegram.ui.Components.mw0
    public final void d() {
        this.f = System.currentTimeMillis();
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int dp;
        int i10;
        int i11 = getBounds().left;
        if (this.b) {
            dp = AndroidUtilities.dp(8.5f);
            i10 = getBounds().top;
        } else {
            dp = AndroidUtilities.dp(9.3f);
            i10 = getBounds().top;
        }
        int i12 = dp + i10;
        Paint paint = this.j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.c2;
            paint.setAlpha(255);
        }
        float dp2 = AndroidUtilities.dp(3.0f) + i11;
        float f10 = i12;
        float[] fArr = this.c;
        canvas.drawCircle(dp2, f10, fArr[0] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + i11, f10, fArr[1] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(15.0f) + i11, f10, fArr[2] * AndroidUtilities.density, paint);
        f();
    }

    @Override // org.telegram.ui.Components.mw0
    public final void e() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.e[i10] = 0.0f;
            this.c[i10] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.g = false;
    }

    public final void f() {
        if (this.g) {
            if (NotificationCenter.getInstance(this.a).isAnimationInProgress() && !this.i) {
                AndroidUtilities.runOnUIThread(new nq0(this, 26), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f;
            this.f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                float[] fArr = this.e;
                float f10 = fArr[i10] + j10;
                fArr[i10] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i10];
                float[] fArr3 = this.c;
                if (f11 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 <= 320.0f) {
                        fArr3[i10] = decelerateInterpolator.getInterpolation(f11 / 320.0f) + 1.33f;
                    } else if (f11 <= 640.0f) {
                        fArr3[i10] = (1.0f - decelerateInterpolator.getInterpolation((f11 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f11 >= 800.0f) {
                        fArr[i10] = 0.0f;
                        fArr2[i10] = 0.0f;
                        fArr3[i10] = 1.33f;
                    } else {
                        fArr3[i10] = 1.33f;
                    }
                } else {
                    fArr3[i10] = 1.33f;
                }
            }
            a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }
}
