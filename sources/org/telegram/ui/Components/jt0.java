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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jt0 extends View {
    public final ImageReceiver a;
    public final v8 b;
    public final Paint c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public jt0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        this.b = new v8((org.telegram.ui.ActionBar.h6) null);
        Paint paint = new Paint(1);
        this.c = paint;
        imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            this.d = z9 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.d, z9 ? 1.0f : 0.0f).setDuration(200L);
        duration.setInterpolator(wq.f);
        duration.addUpdateListener(new c60(this, 20));
        duration.addListener(new e60(this, 22));
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
        float f10 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f10, f10);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.m5, false);
        Paint paint = this.c;
        paint.setColor(x02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (this.e) {
            return;
        }
        float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
        float f11 = 2.0f * strokeWidth2;
        float width = getWidth() - f11;
        float height = getHeight() - f11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(strokeWidth2, strokeWidth2, width, height);
        imageReceiver.h(canvas, null);
    }

    public void setAvatar(TLObject tLObject) {
        v8 v8Var = this.b;
        v8Var.l(tLObject);
        this.a.i0(tLObject, v8Var, null);
    }

    public void setHideAvatar(boolean z9) {
        this.e = z9;
        invalidate();
    }
}
