package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jm0 extends FrameLayout {
    public boolean E;
    public int F;
    public float G;
    public im0 H;
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

    public jm0(Context context) {
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
        d(paint, 0.2f);
        d(paint2, 0.6f);
        d(f50Var, 1.0f);
        paint3.setColor(-1);
        paint4.setColor(-1);
        setWillNotDraw(false);
    }

    public static float b(float f7, float f10) {
        float abs = Math.abs(f7 - f10);
        return Math.min(abs, 1.0f - abs);
    }

    public static float c(float f7, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f7));
    }

    public static void d(Paint paint, float f7) {
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
        e(startHandleProgress, f10, canvas, paint);
        e(getEndHandleProgress(), f10, canvas, paint);
        e(this.x, this.r, canvas, this.d);
    }

    public final void e(float f7, float f10, Canvas canvas, Paint paint) {
        double radians = Math.toRadians((f7 * 360.0f) - 90.0f);
        RectF rectF = this.f;
        float width = rectF.width() * 0.5f;
        canvas.drawCircle((((float) Math.cos(radians)) * width) + rectF.centerX(), (((float) Math.sin(radians)) * width) + rectF.centerY(), f10, paint);
    }

    public final void f(boolean z10) {
        im0 im0Var = this.H;
        if (im0Var != null) {
            float f7 = this.v;
            float f10 = this.w;
            a60 a60Var = ((w50) im0Var).a;
            ki.h0 h0Var = a60Var.J;
            ki.g0 g0Var = a60Var.K;
            if (h0Var == null || g0Var == null || g0Var.a != 5) {
                return;
            }
            float f11 = g0Var.d;
            long j3 = (long) (f7 * f11);
            long j10 = (long) (f10 * f11);
            if (h0Var.v(j3, j10)) {
                VideoEditedInfo videoEditedInfo = a60Var.N;
                if (videoEditedInfo != null) {
                    videoEditedInfo.startTime = j3;
                    videoEditedInfo.endTime = j10;
                }
                float max = Math.max(1L, g0Var.b);
                a60Var.c(j3 / max, j10 / max);
                if (!z10) {
                    j3 = Math.max(j3, j10 - 100);
                }
                h0Var.s(j3);
            }
        }
    }

    public final void g(float f7, float f10) {
        float c10 = c(f7, 0.0f, this.s);
        this.v = c10;
        float c11 = c(f10, c10, this.s);
        this.w = c11;
        this.x = c(this.x, this.v, c11);
        invalidate();
    }

    public Paint getPaint() {
        return this.e;
    }

    public final void h(float f7) {
        float min = Math.min(this.s, 0.016666668f);
        int i10 = this.F;
        if (i10 == 1) {
            float c10 = c(f7, 0.0f, this.w - min);
            this.v = c10;
            this.x = c10;
            f(true);
        } else if (i10 == 2) {
            float c11 = c(f7, this.v + min, this.s);
            this.w = c11;
            this.x = c11;
            f(false);
        }
        invalidate();
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
            h(a(degrees));
            return true;
        }
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return true;
        }
        h(a(degrees));
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
        float c10 = c(f7, this.v, this.w);
        if (this.x == c10) {
            return;
        }
        this.x = c10;
        invalidate();
    }

    public void setProgress(float f7) {
        float c10 = c(f7, 0.0f, 1.0f);
        if (this.s == c10) {
            return;
        }
        this.s = c10;
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

    public void setTrimListener(im0 im0Var) {
        this.H = im0Var;
    }
}
