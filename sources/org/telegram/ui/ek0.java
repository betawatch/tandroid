package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ek0 extends View {
    public final Paint a;
    public final Paint b;
    public final org.telegram.ui.Components.c6 c;
    public final org.telegram.ui.Components.m6 d;
    public int e;
    public float f;
    public ValueAnimator h;

    public ek0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        this.c = new org.telegram.ui.Components.c6(this, 0L, 320L, qrVar);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true, false);
        this.d = m6Var;
        this.f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        m6Var.setCallback(this);
        m6Var.k(0.35f, 200L, qrVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = m6Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        m6Var.t(AndroidUtilities.dp(13.3f));
        m6Var.r(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        m6Var.G = AndroidUtilities.dp(64.0f);
        m6Var.b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.e;
        if (i11 != i10) {
            r1 = i11 < i10;
            this.e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.e;
            }
            this.d.q(str, true, true);
            if (r1) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new b3(this, 18));
                this.h.addListener(new org.telegram.ui.Components.v81(this, 27));
                this.h.setInterpolator(new OvershootInterpolator(2.0f));
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return r1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.c.d(this.e > 0 ? 1.0f : 0.0f, false);
        canvas.save();
        float f7 = this.f;
        canvas.scale(f7 * d, f7 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.m6 m6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + m6Var.d();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        m6Var.setBounds(0, 0, getWidth(), getHeight());
        m6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
