package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fh0 extends sx0 {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.u6 i;

    public fh0(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this.h = z10;
        this.i = u6Var;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void c(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int dp2 = ((AndroidUtilities.dp(18.0f) - dp) / 2) + getBounds().top;
        if (!this.a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i10 = dp2;
        boolean z10 = this.h;
        int w02 = org.telegram.ui.ActionBar.y6.w0(z10 ? org.telegram.ui.ActionBar.y6.p9 : org.telegram.ui.ActionBar.y6.pa, this.i);
        Paint paint = this.b;
        paint.setColor(w02);
        RectF rectF = this.f;
        rectF.set(0.0f, i10, dp, i10 + dp);
        float f7 = this.g;
        float f10 = 0.5f;
        int y3 = (int) (f7 < 0.5f ? org.telegram.messenger.wh.y(f7, 0.5f, 1.0f, 35.0f) : ((f7 - 0.5f) * 35.0f) / 0.5f);
        int i11 = 0;
        while (i11 < 3) {
            float dp3 = AndroidUtilities.dp(9.2f) + (AndroidUtilities.dp(5.0f) * i11);
            float dp4 = AndroidUtilities.dp(5.0f);
            float f11 = f10;
            float f12 = this.g;
            float f13 = dp3 - (dp4 * f12);
            if (i11 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f12 * 255.0f) / f11)));
            } else if (i11 != 0) {
                paint.setAlpha(255);
            } else if (f12 > f11) {
                paint.setAlpha((int) ((1.0f - ((f12 - f11) / f11)) * 255.0f));
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(f13, (dp / 2) + i10, AndroidUtilities.dp(1.2f), paint);
            i11++;
            f10 = f11;
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, y3, 360 - (y3 * 2), true, paint);
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, z10 ? org.telegram.ui.ActionBar.y6.d6 : org.telegram.ui.ActionBar.y6.s8, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i10) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override // org.telegram.ui.Components.sx0
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (NotificationCenter.getInstance(this.c).isAnimationInProgress()) {
                AndroidUtilities.runOnUIThread(new xa0(this, 15), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            if (this.g >= 1.0f) {
                this.g = 0.0f;
            }
            float f7 = (j10 / 300.0f) + this.g;
            this.g = f7;
            if (f7 > 1.0f) {
                this.g = 1.0f;
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
        return AndroidUtilities.dp(20.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void b(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
