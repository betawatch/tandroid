// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dka extends View {
    public final ImageReceiver a;
    public final pc0 b;
    public final Paint c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public dka(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        this.b = new pc0((ylb) null);
        Paint paint = new Paint(1);
        this.c = paint;
        imageReceiver.q0(gm.L(28.0f));
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            this.d = z ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.d, z ? 1.0f : 0.0f).setDuration(200L);
        duration.setInterpolator(d53.f);
        duration.addUpdateListener(new rha(this, (byte) 1));
        duration.addListener(new c39((Object) this, (byte) 19));
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
        this.a.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        float f = (this.d * 0.1f) + 0.9f;
        canvas.scale(f, f);
        int w0 = cmb.w0(null, cmb.l5, false);
        Paint paint = this.c;
        paint.setColor(w0);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = gm.P;
        rectF.set(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth);
        canvas.drawArc(rectF, -90.0f, this.d * 360.0f, false, paint);
        canvas.restore();
        if (this.e) {
            return;
        }
        float strokeWidth2 = paint.getStrokeWidth() * 2.5f * this.d;
        float f2 = 2.0f * strokeWidth2;
        float width = getWidth() - f2;
        float height = getHeight() - f2;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(strokeWidth2, strokeWidth2, width, height);
        imageReceiver.h(canvas, null);
    }

    public void setAvatar(TLObject tLObject) {
        pc0 pc0Var = this.b;
        pc0Var.k(tLObject);
        this.a.U(tLObject, pc0Var, null);
    }

    public void setHideAvatar(boolean z) {
        this.e = z;
        invalidate();
    }
}
