package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
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
    public final wjb y;

    public CheckBoxSquare(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.y = wjbVar;
        if (bkb.o0 == null) {
            bkb.Q(context);
        }
        boolean z2 = this.r;
        this.s = z2 ? bkb.x5 : bkb.X6;
        this.w = z2 ? bkb.v5 : bkb.V6;
        this.x = z2 ? bkb.w5 : bkb.W6;
        this.a = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(gl.L(18.0f), gl.L(18.0f), Bitmap.Config.ARGB_4444);
        this.b = createBitmap;
        this.c = new Canvas(createBitmap);
        this.r = z;
    }

    public final void a(boolean z, boolean z2) {
        if (z == this.h) {
            return;
        }
        this.h = z;
        if (this.f && z2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
            this.e = ofFloat;
            ofFloat.setDuration(300L);
            this.e.start();
            return;
        }
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setProgress(z ? 1.0f : 0.0f);
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
        float f;
        float f2;
        if (getVisibility() != 0) {
            return;
        }
        int i = this.s;
        wjb wjbVar = this.y;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(this.w, wjbVar);
        float f3 = this.d;
        if (f3 <= 0.5f) {
            f2 = f3 / 0.5f;
            bkb.o0.setColor(Color.rgb(Color.red(v0) + ((int) ((Color.red(v02) - Color.red(v0)) * f2)), Color.green(v0) + ((int) ((Color.green(v02) - Color.green(v0)) * f2)), Color.blue(v0) + ((int) ((Color.blue(v02) - Color.blue(v0)) * f2))));
            f = f2;
        } else {
            bkb.o0.setColor(v02);
            f = 2.0f - (f3 / 0.5f);
            f2 = 1.0f;
        }
        if (this.n) {
            bkb.o0.setColor(bkb.v0(this.r ? bkb.y5 : bkb.Y6, wjbVar));
        }
        float L = gl.L(1.0f) * f;
        RectF rectF = this.a;
        rectF.set(L, L, gl.L(18.0f) - L, gl.L(18.0f) - L);
        Bitmap bitmap = this.b;
        bitmap.eraseColor(0);
        float L2 = gl.L(4.0f);
        float L3 = gl.L(4.0f);
        Paint paint = bkb.o0;
        Canvas canvas2 = this.c;
        canvas2.drawRoundRect(rectF, L2, L3, paint);
        if (f2 != 1.0f) {
            float min = Math.min(gl.L(7.0f), (gl.L(7.0f) * f2) + L);
            rectF.set(gl.L(1.33f) + min, gl.L(1.33f) + min, gl.L(16.66f) - min, gl.L(16.66f) - min);
            canvas2.drawRoundRect(rectF, gl.L(3.0f), gl.L(3.0f), bkb.m0);
        }
        if (this.d > 0.5f) {
            bkb.n0.setColor(bkb.v0(this.x, wjbVar));
            float f4 = 1.0f - f;
            canvas2.drawLine(gl.L(7.0f), (int) gl.N(13.0f), (int) (gl.L(7.0f) - (gl.L(3.0f) * f4)), (int) (gl.N(13.0f) - (gl.L(3.0f) * f4)), bkb.n0);
            canvas2.drawLine((int) gl.N(7.0f), (int) gl.N(13.0f), (int) ((gl.L(7.0f) * f4) + gl.N(7.0f)), (int) (gl.N(13.0f) - (gl.L(7.0f) * f4)), bkb.n0);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setDisabled(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.d == f) {
            return;
        }
        this.d = f;
        invalidate();
    }
}
