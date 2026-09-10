package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qg0 extends ww0 {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 i;

    public qg0(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = z10;
        this.i = f6Var;
    }

    @Override // org.telegram.ui.Components.ww0
    public final void c(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.ww0
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
        int v02 = org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.p9 : org.telegram.ui.ActionBar.j6.pa, this.i);
        Paint paint = this.b;
        paint.setColor(v02);
        RectF rectF = this.f;
        rectF.set(0.0f, i10, dp, i10 + dp);
        float f7 = this.g;
        int u10 = (int) (f7 < 0.5f ? org.telegram.messenger.em.u(f7, 0.5f, 1.0f, 35.0f) : ((f7 - 0.5f) * 35.0f) / 0.5f);
        for (int i11 = 0; i11 < 3; i11++) {
            float dp3 = AndroidUtilities.dp(9.2f) + (AndroidUtilities.dp(5.0f) * i11);
            float dp4 = AndroidUtilities.dp(5.0f);
            float f10 = this.g;
            float f11 = dp3 - (dp4 * f10);
            if (i11 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f10 * 255.0f) / 0.5f)));
            } else if (i11 != 0) {
                paint.setAlpha(255);
            } else if (f10 > 0.5f) {
                paint.setAlpha((int) ((1.0f - ((f10 - 0.5f) / 0.5f)) * 255.0f));
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(f11, (dp / 2) + i10, AndroidUtilities.dp(1.2f), paint);
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, u10, 360 - (u10 * 2), true, paint);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, z10 ? org.telegram.ui.ActionBar.j6.d6 : org.telegram.ui.ActionBar.j6.s8, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i10) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override // org.telegram.ui.Components.ww0
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (NotificationCenter.getInstance(this.c).isAnimationInProgress()) {
                AndroidUtilities.runOnUIThread(new kc0(this, 13), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            if (this.g >= 1.0f) {
                this.g = 0.0f;
            }
            float f7 = (j3 / 300.0f) + this.g;
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

    @Override // org.telegram.ui.Components.ww0
    public final void b(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
