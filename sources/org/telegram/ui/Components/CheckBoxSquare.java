package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
    public int w;
    public int x;
    public final org.telegram.ui.ActionBar.f6 y;

    public CheckBoxSquare(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.y = f6Var;
        if (org.telegram.ui.ActionBar.k6.p0 == null) {
            org.telegram.ui.ActionBar.k6.R(context);
        }
        boolean z10 = this.r;
        this.s = z10 ? org.telegram.ui.ActionBar.k6.y5 : org.telegram.ui.ActionBar.k6.Y6;
        this.w = z10 ? org.telegram.ui.ActionBar.k6.w5 : org.telegram.ui.ActionBar.k6.W6;
        this.x = z10 ? org.telegram.ui.ActionBar.k6.x5 : org.telegram.ui.ActionBar.k6.X6;
        this.a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), Bitmap.Config.ARGB_4444);
        this.b = createBitmap;
        this.c = new Canvas(createBitmap);
        this.r = z9;
    }

    public final void a(boolean z9, boolean z10) {
        if (z9 == this.h) {
            return;
        }
        this.h = z9;
        if (this.f && z10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z9 ? 1.0f : 0.0f);
            this.e = ofFloat;
            ofFloat.setDuration(300L);
            this.e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z9 ? 1.0f : 0.0f);
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
        float f10;
        float f11;
        if (getVisibility() != 0) {
            return;
        }
        int i7 = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = this.y;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(this.w, f6Var);
        float f12 = this.d;
        if (f12 <= 0.5f) {
            f11 = f12 / 0.5f;
            org.telegram.ui.ActionBar.k6.p0.setColor(Color.rgb(Color.red(w02) + ((int) ((Color.red(w03) - Color.red(w02)) * f11)), Color.green(w02) + ((int) ((Color.green(w03) - Color.green(w02)) * f11)), Color.blue(w02) + ((int) ((Color.blue(w03) - Color.blue(w02)) * f11))));
            f10 = f11;
        } else {
            org.telegram.ui.ActionBar.k6.p0.setColor(w03);
            f10 = 2.0f - (f12 / 0.5f);
            f11 = 1.0f;
        }
        if (this.n) {
            org.telegram.ui.ActionBar.k6.p0.setColor(org.telegram.ui.ActionBar.k6.w0(this.r ? org.telegram.ui.ActionBar.k6.z5 : org.telegram.ui.ActionBar.k6.Z6, f6Var));
        }
        float L = org.telegram.messenger.g0.L(1.0f) * f10;
        RectF rectF = this.a;
        rectF.set(L, L, org.telegram.messenger.g0.L(18.0f) - L, org.telegram.messenger.g0.L(18.0f) - L);
        Bitmap bitmap = this.b;
        bitmap.eraseColor(0);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        float L3 = org.telegram.messenger.g0.L(4.0f);
        Paint paint = org.telegram.ui.ActionBar.k6.p0;
        Canvas canvas2 = this.c;
        canvas2.drawRoundRect(rectF, L2, L3, paint);
        if (f11 != 1.0f) {
            float min = Math.min(org.telegram.messenger.g0.L(7.0f), (org.telegram.messenger.g0.L(7.0f) * f11) + L);
            rectF.set(org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(1.33f) + min, org.telegram.messenger.g0.L(16.66f) - min, org.telegram.messenger.g0.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.n0);
        }
        if (this.d > 0.5f) {
            org.telegram.ui.ActionBar.k6.o0.setColor(org.telegram.ui.ActionBar.k6.w0(this.x, f6Var));
            float f13 = 1.0f - f10;
            canvas2.drawLine(org.telegram.messenger.g0.L(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) (org.telegram.messenger.g0.L(7.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(3.0f) * f13)), org.telegram.ui.ActionBar.k6.o0);
            canvas2.drawLine((int) org.telegram.messenger.g0.N(7.0f), (int) org.telegram.messenger.g0.N(13.0f), (int) ((org.telegram.messenger.g0.L(7.0f) * f13) + org.telegram.messenger.g0.N(7.0f)), (int) (org.telegram.messenger.g0.N(13.0f) - (org.telegram.messenger.g0.L(7.0f) * f13)), org.telegram.ui.ActionBar.k6.o0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    public void setDisabled(boolean z9) {
        this.n = z9;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        invalidate();
    }
}
