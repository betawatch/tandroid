package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mu0 extends View {
    public final ImageReceiver a;
    public final z8 b;
    public final Paint c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public mu0(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        this.b = new z8((org.telegram.ui.ActionBar.b6) null);
        Paint paint = new Paint(1);
        this.c = paint;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(28.0f));
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
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
        duration.addUpdateListener(new q60(this, 21));
        duration.addListener(new r60(this, 21));
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
        this.a.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f10 = (this.d * 0.1f) + 0.9f;
        canvas.scale(f10, f10);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.m5, false);
        Paint paint = this.c;
        paint.setColor(w02);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
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
        imageReceiver.setImageCoords(strokeWidth2, strokeWidth2, width, height);
        imageReceiver.draw(canvas);
    }

    public void setAvatar(TLObject tLObject) {
        z8 z8Var = this.b;
        z8Var.p(tLObject);
        this.a.setForUserOrChat(tLObject, z8Var);
    }

    public void setHideAvatar(boolean z10) {
        this.e = z10;
        invalidate();
    }
}
