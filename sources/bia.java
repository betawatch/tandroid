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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bia extends View {
    public final ImageReceiver a;
    public final pb0 b;
    public final Paint c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public bia(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        this.b = new pb0((wjb) null);
        Paint paint = new Paint(1);
        this.c = paint;
        imageReceiver.q0(gl.L(28.0f));
        paint.setStrokeWidth(gl.L(2.0f));
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
        duration.setInterpolator(s33.f);
        duration.addUpdateListener(new x89(this, (byte) 29));
        duration.addListener(new ng9((Object) this, (byte) 17));
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
        int w0 = bkb.w0(null, bkb.l5, false);
        Paint paint = this.c;
        paint.setColor(w0);
        paint.setAlpha((int) (Color.alpha(paint.getColor()) * this.d));
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = gl.P;
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
        pb0 pb0Var = this.b;
        pb0Var.k(tLObject);
        this.a.U(tLObject, pb0Var, null);
    }

    public void setHideAvatar(boolean z) {
        this.e = z;
        invalidate();
    }
}
