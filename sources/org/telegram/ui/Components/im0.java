package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class im0 extends FrameLayout {
    public boolean E;
    public int F;
    public float G;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final f50 e;
    public final RectF f;
    public final float h;
    public final float n;
    public final float r;
    public float s;
    public float v;
    public float w;
    public float x;
    public boolean y;

    public im0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        Paint paint4 = new Paint(1);
        this.d = paint4;
        f50 f50Var = new f50(this, 1);
        this.e = f50Var;
        this.f = new RectF();
        this.h = AndroidUtilities.dp(3.0f);
        this.n = AndroidUtilities.dp(5.0f);
        this.r = AndroidUtilities.dp(3.0f);
        c(paint, 0.2f);
        c(paint2, 0.6f);
        c(f50Var, 1.0f);
        paint3.setColor(-1);
        paint4.setColor(-1);
        setWillNotDraw(false);
    }

    public static float b(float f7, float f10) {
        float abs = Math.abs(f7 - f10);
        return Math.min(abs, 1.0f - abs);
    }

    public static void c(Paint paint, float f7) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f7 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    private float getEndHandleProgress() {
        if (b(this.v, this.w) >= 0.006f) {
            return this.w;
        }
        float f7 = this.w + 0.008f;
        return f7 < 0.0f ? f7 + 1.0f : f7 > 1.0f ? f7 - 1.0f : f7;
    }

    private float getStartHandleProgress() {
        if (b(this.v, this.w) >= 0.006f) {
            return this.v;
        }
        float f7 = this.v - 0.008f;
        return f7 < 0.0f ? f7 + 1.0f : f7 > 1.0f ? f7 - 1.0f : f7;
    }

    public final float a(float f7) {
        float f10 = f7 + this.G;
        float f11 = this.F == 1 ? this.v : this.w;
        return f10 - f11 > 0.5f ? f10 - 1.0f : f11 - f10 > 0.5f ? f10 + 1.0f : f10;
    }

    public final void d(float f7, float f10, Canvas canvas, Paint paint) {
        double radians = Math.toRadians((f7 * 360.0f) - 90.0f);
        RectF rectF = this.f;
        float width = rectF.width() * 0.5f;
        canvas.drawCircle((((float) Math.cos(radians)) * width) + rectF.centerX(), (((float) Math.sin(radians)) * width) + rectF.centerY(), f10, paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.h * 0.5f;
        float f10 = this.n;
        float f11 = f7 + f10;
        RectF rectF = this.f;
        rectF.set(f11, f11, getWidth() - f11, getHeight() - f11);
        canvas.drawOval(rectF, this.a);
        boolean z10 = this.y;
        f50 f50Var = this.e;
        if (!z10) {
            canvas.drawArc(rectF, -90.0f, this.s * 360.0f, false, f50Var);
            return;
        }
        canvas.drawArc(rectF, -90.0f, this.s * 360.0f, false, this.b);
        float f12 = this.v;
        canvas.drawArc(rectF, (-90.0f) + (f12 * 360.0f), (this.w - f12) * 360.0f, false, f50Var);
        if (this.E) {
            return;
        }
        float startHandleProgress = getStartHandleProgress();
        Paint paint = this.c;
        d(startHandleProgress, f10, canvas, paint);
        d(getEndHandleProgress(), f10, canvas, paint);
        d(this.x, this.r, canvas, this.d);
    }

    public final void e(float f7) {
        float min = Math.min(this.s, 0.016666668f);
        int i10 = this.F;
        if (i10 == 1) {
            float max = Math.max(0.0f, Math.min(this.w - min, f7));
            this.v = max;
            this.x = max;
        } else if (i10 == 2) {
            float max2 = Math.max(this.v + min, Math.min(this.s, f7));
            this.w = max2;
            this.x = max2;
        }
        invalidate();
    }

    public Paint getPaint() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.y || this.E) {
            return false;
        }
        float degrees = (float) ((((Math.toDegrees(Math.atan2(motionEvent.getY() - (getHeight() * 0.5f), motionEvent.getX() - (getWidth() * 0.5f))) + 90.0d) + 360.0d) % 360.0d) / 360.0d);
        if (motionEvent.getActionMasked() == 0) {
            int i10 = b(degrees, getStartHandleProgress()) <= b(degrees, getEndHandleProgress()) ? 1 : 2;
            this.F = i10;
            float f7 = (i10 == 1 ? this.v : this.w) - degrees;
            if (f7 > 0.5f) {
                f7 -= 1.0f;
            } else if (f7 < -0.5f) {
                f7 += 1.0f;
            }
            this.G = f7;
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (motionEvent.getActionMasked() == 2) {
            e(a(degrees));
            return true;
        }
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return true;
        }
        e(a(degrees));
        this.F = 0;
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    public void setLoading(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        invalidate();
    }

    public void setPlaybackProgress(float f7) {
        float max = Math.max(this.v, Math.min(this.w, f7));
        if (this.x == max) {
            return;
        }
        this.x = max;
        invalidate();
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.s == max) {
            return;
        }
        this.s = max;
        invalidate();
    }

    public void setTrimEnabled(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        this.F = 0;
        if (z10) {
            this.v = 0.0f;
            this.w = this.s;
            this.x = 0.0f;
        }
        invalidate();
    }

    public void setTrimListener(hm0 hm0Var) {
    }
}
