package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e31 extends View {
    public float a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public boolean e;
    public int f;
    public final RectF h;

    public e31(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.e = true;
        this.f = 0;
        this.h = new RectF();
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.P9, false));
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.e) {
            float dp = AndroidUtilities.dp(((this.f == 0 ? this.a : 1.0f) * 26.0f) + 6.0f);
            float width = getWidth();
            float height = getHeight();
            RectF rectF = this.h;
            rectF.set(0.0f, 0.0f, width, height);
            canvas2.drawRoundRect(rectF, dp, dp, this.b);
        }
        int i10 = this.f;
        Paint paint = this.c;
        if (i10 == 0) {
            float max = (Math.max(0.4f, this.a) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float z4 = (org.telegram.ui.b.z(21.0f, 2, getWidth()) * max) + AndroidUtilities.dp(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(AndroidUtilities.dp(21.0f), height2, z4, height2, paint);
                double dp2 = AndroidUtilities.dp(9.0f) * max;
                float cos = (float) (z4 - (Math.cos(0.7853981633974483d) * dp2));
                float sin = (float) (Math.sin(0.7853981633974483d) * dp2);
                canvas2 = canvas;
                canvas2.drawLine(z4, height2, cos, height2 - sin, paint);
                canvas2.drawLine(z4, height2, cos, height2 + sin, paint);
            } else {
                canvas2 = canvas;
            }
        } else if (i10 == 1) {
            float dp3 = AndroidUtilities.dp(21.0f);
            float width2 = getWidth() - AndroidUtilities.dp(21.0f);
            float height3 = getHeight() / 2.0f;
            canvas2.save();
            canvas2.translate((-AndroidUtilities.dp(2.0f)) * this.a, 0.0f);
            canvas2.rotate(this.a * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(dp3 + ((width2 - dp3) * this.a), height3, width2, height3, paint);
            int dp4 = AndroidUtilities.dp((this.a * (-1.0f)) + 9.0f);
            int dp5 = AndroidUtilities.dp((this.a * 7.0f) + 9.0f);
            double d = width2;
            double d10 = dp4;
            double d11 = height3;
            canvas.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d10)), (float) ((Math.sin(0.7853981633974483d) * d10) + d11), paint);
            double d12 = dp5;
            canvas2 = canvas;
            canvas2.drawLine(width2, height3, (float) (d - (Math.cos(0.7853981633974483d) * d12)), (float) (d11 - (Math.sin(0.7853981633974483d) * d12)), paint);
            canvas.restore();
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.d.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.d.draw(canvas2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.b.setColor(i10);
        invalidate();
    }

    public void setColor(int i10) {
        this.c.setColor(i10);
        invalidate();
    }

    public void setDrawBackground(boolean z4) {
        this.e = z4;
    }

    public void setProgress(float f10) {
        this.a = f10;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.d = drawable;
        invalidate();
    }

    public void setTransformType(int i10) {
        this.f = i10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Drawable drawable2 = this.d;
        return drawable2 != null && drawable == drawable2;
    }
}
