package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class CheckBoxSquare extends View {
    public final RectF a;
    public final Bitmap b;
    public final Canvas c;
    public float d;
    public ObjectAnimator e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final boolean r;
    public int s;
    public int v;
    public int w;
    public final org.telegram.ui.ActionBar.f6 x;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.x = f6Var;
        if (org.telegram.ui.ActionBar.j6.p0 == null) {
            org.telegram.ui.ActionBar.j6.P(context);
        }
        boolean z11 = this.r;
        this.s = z11 ? org.telegram.ui.ActionBar.j6.y5 : org.telegram.ui.ActionBar.j6.Y6;
        this.v = z11 ? org.telegram.ui.ActionBar.j6.w5 : org.telegram.ui.ActionBar.j6.W6;
        this.w = z11 ? org.telegram.ui.ActionBar.j6.x5 : org.telegram.ui.ActionBar.j6.X6;
        this.a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
        this.b = createBitmap;
        this.c = new Canvas(createBitmap);
        this.r = z10;
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.h) {
            return;
        }
        this.h = z10;
        if (this.f && z11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
            this.e = ofFloat;
            ofFloat.setDuration(300L);
            this.e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z10 ? 1.0f : 0.0f);
    }

    public float getProgress() {
        return this.d;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        if (getVisibility() != 0) {
            return;
        }
        int i10 = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v03 = org.telegram.ui.ActionBar.j6.v0(this.v, f6Var);
        float f11 = this.d;
        if (f11 <= 0.5f) {
            f10 = f11 / 0.5f;
            org.telegram.ui.ActionBar.j6.p0.setColor(Color.rgb(Color.red(v02) + ((int) ((Color.red(v03) - Color.red(v02)) * f10)), Color.green(v02) + ((int) ((Color.green(v03) - Color.green(v02)) * f10)), Color.blue(v02) + ((int) ((Color.blue(v03) - Color.blue(v02)) * f10))));
            f7 = f10;
        } else {
            org.telegram.ui.ActionBar.j6.p0.setColor(v03);
            f7 = 2.0f - (f11 / 0.5f);
            f10 = 1.0f;
        }
        if (this.n) {
            org.telegram.ui.ActionBar.j6.p0.setColor(org.telegram.ui.ActionBar.j6.v0(this.r ? org.telegram.ui.ActionBar.j6.z5 : org.telegram.ui.ActionBar.j6.Z6, f6Var));
        }
        float dp = AndroidUtilities.dp(1.0f) * f7;
        RectF rectF = this.a;
        rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
        Bitmap bitmap = this.b;
        bitmap.eraseColor(0);
        float dp2 = AndroidUtilities.dp(4.0f);
        float dp3 = AndroidUtilities.dp(4.0f);
        Paint paint = org.telegram.ui.ActionBar.j6.p0;
        Canvas canvas2 = this.c;
        canvas2.drawRoundRect(rectF, dp2, dp3, paint);
        if (f10 != 1.0f) {
            float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
            rectF.set(AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(1.33f) + min, AndroidUtilities.dp(16.66f) - min, AndroidUtilities.dp(16.66f) - min);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.j6.o0.setColor(org.telegram.ui.ActionBar.j6.v0(this.w, f6Var));
            float f12 = 1.0f - f7;
            canvas2.drawLine(AndroidUtilities.dp(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) (AndroidUtilities.dp(7.0f) - (AndroidUtilities.dp(3.0f) * f12)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(3.0f) * f12)), org.telegram.ui.ActionBar.j6.o0);
            canvas2.drawLine((int) AndroidUtilities.dpf2(7.0f), (int) AndroidUtilities.dpf2(13.0f), (int) ((AndroidUtilities.dp(7.0f) * f12) + AndroidUtilities.dpf2(7.0f)), (int) (AndroidUtilities.dpf2(13.0f) - (AndroidUtilities.dp(7.0f) * f12)), org.telegram.ui.ActionBar.j6.o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setDisabled(boolean z10) {
        this.n = z10;
        invalidate();
    }

    public void setProgress(float f7) {
        if (this.d == f7) {
            return;
        }
        this.d = f7;
        invalidate();
    }
}
