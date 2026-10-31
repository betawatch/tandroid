package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lu0 extends View {
    public final ImageReceiver a;
    public final r8 b;
    public final Paint c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public lu0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        this.b = new r8((org.telegram.ui.ActionBar.p6) null);
        Paint paint = new Paint(1);
        this.c = paint;
        imageReceiver.J0(org.telegram.messenger.i0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f).setDuration(200L);
        duration.setInterpolator(gr.f);
        duration.addUpdateListener(new r60(this, 21));
        duration.addListener(new t60(this, 22));
        duration.start();
        this.f = duration;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.d == 1.0f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f7 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f7, f7);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.m5, false);
        Paint paint = this.c;
        paint.setColor(x02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (this.e) {
            return;
        }
        float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
        float f10 = 2.0f * strokeWidth2;
        float width = getWidth() - f10;
        float height = getHeight() - f10;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(strokeWidth2, strokeWidth2, width, height);
        imageReceiver.h(canvas, null);
    }

    public void setAvatar(TLObject tLObject) {
        r8 r8Var = this.b;
        r8Var.l(tLObject);
        this.a.i0(tLObject, r8Var, null);
    }

    public void setHideAvatar(boolean z10) {
        this.e = z10;
        invalidate();
    }
}
