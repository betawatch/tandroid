package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pg0 extends mw0 {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.g6 i;

    public pg0(org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this.h = z4;
        this.i = g6Var;
    }

    @Override // org.telegram.ui.Components.mw0
    public final void c(boolean z4) {
        this.a = z4;
    }

    @Override // org.telegram.ui.Components.mw0
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
        boolean z4 = this.h;
        int v02 = org.telegram.ui.ActionBar.k6.v0(z4 ? org.telegram.ui.ActionBar.k6.p9 : org.telegram.ui.ActionBar.k6.pa, this.i);
        Paint paint = this.b;
        paint.setColor(v02);
        RectF rectF = this.f;
        rectF.set(0.0f, i10, dp, i10 + dp);
        float f10 = this.g;
        int c3 = (int) (f10 < 0.5f ? org.telegram.ui.b.c(f10, 0.5f, 1.0f, 35.0f) : ((f10 - 0.5f) * 35.0f) / 0.5f);
        for (int i11 = 0; i11 < 3; i11++) {
            float dp3 = AndroidUtilities.dp(9.2f) + (AndroidUtilities.dp(5.0f) * i11);
            float dp4 = AndroidUtilities.dp(5.0f);
            float f11 = this.g;
            float f12 = dp3 - (dp4 * f11);
            if (i11 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f11 * 255.0f) / 0.5f)));
            } else if (i11 != 0) {
                paint.setAlpha(255);
            } else if (f11 > 0.5f) {
                paint.setAlpha((int) ((1.0f - ((f11 - 0.5f) / 0.5f)) * 255.0f));
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(f12, (dp / 2) + i10, AndroidUtilities.dp(1.2f), paint);
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, c3, 360 - (c3 * 2), true, paint);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, z4 ? org.telegram.ui.ActionBar.k6.d6 : org.telegram.ui.ActionBar.k6.s8, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i10) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override // org.telegram.ui.Components.mw0
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (NotificationCenter.getInstance(this.c).isAnimationInProgress()) {
                AndroidUtilities.runOnUIThread(new ec0(this, 13), 100L);
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
            float f10 = (j10 / 300.0f) + this.g;
            this.g = f10;
            if (f10 > 1.0f) {
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

    @Override // org.telegram.ui.Components.mw0
    public final void b(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
