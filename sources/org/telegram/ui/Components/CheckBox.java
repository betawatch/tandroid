package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class CheckBox extends View {
    public static Paint H;
    public static Paint I;
    public static Paint J;
    public static Paint K;
    public int D;
    public int E;
    public int F;
    public String G;
    public final Drawable a;
    public final TextPaint b;
    public Bitmap c;
    public Bitmap d;
    public Canvas e;
    public Canvas f;
    public boolean h;
    public boolean n;
    public float r;
    public ObjectAnimator s;
    public boolean w;
    public boolean x;
    public boolean y;

    public CheckBox(Context context, int i7) {
        super(context);
        this.w = true;
        this.D = 22;
        if (H == null) {
            H = new Paint(1);
            Paint paint = new Paint(1);
            I = paint;
            paint.setColor(0);
            Paint paint2 = I;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            J = paint3;
            paint3.setColor(0);
            Paint paint4 = J;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            J.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            K = paint5;
            paint5.setColor(-1);
            K.setStyle(style);
        }
        J.setStrokeWidth(org.telegram.messenger.g0.L(28.0f));
        K.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.a = context.getResources().getDrawable(i7).mutate();
    }

    public final void a(boolean z9) {
        b(z9, false);
    }

    public final void b(boolean z9, boolean z10) {
        if (z9 == this.y) {
            return;
        }
        this.y = z9;
        if (!this.x || !z10) {
            ObjectAnimator objectAnimator = this.s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.s = null;
            }
            setProgress(z9 ? 1.0f : 0.0f);
            return;
        }
        this.w = z9;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z9 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addListener(new z5(this, 18));
        this.s.setDuration(300L);
        this.s.start();
    }

    public final void c(int i7, int i10) {
        this.F = i7;
        this.a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i10);
        invalidate();
    }

    public float getProgress() {
        return this.r;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float L;
        if (getVisibility() != 0 || this.c == null || this.d == null) {
            return;
        }
        if (this.h || this.r != 0.0f) {
            J.setStrokeWidth(org.telegram.messenger.g0.L(this.D + 6));
            this.c.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f10 = this.r;
            float f11 = f10 >= 0.5f ? 1.0f : f10 / 0.5f;
            float f12 = f10 < 0.5f ? 0.0f : (f10 - 0.5f) / 0.5f;
            if (!this.w) {
                f10 = 1.0f - f10;
            }
            if (f10 >= 0.2f) {
                if (f10 < 0.4f) {
                    L = org.telegram.messenger.g0.L(2.0f) - (((f10 - 0.2f) * org.telegram.messenger.g0.L(2.0f)) / 0.2f);
                }
                if (this.h) {
                    H.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - org.telegram.messenger.g0.L(1.0f), H);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - org.telegram.messenger.g0.L(1.0f), K);
                }
                H.setColor(this.F);
                if (this.n) {
                    measuredWidth -= org.telegram.messenger.g0.L(2.0f);
                }
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, H);
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, I);
                canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
                this.d.eraseColor(0);
                if (this.G == null) {
                    this.f.drawText(this.G, (getMeasuredWidth() - ((int) Math.ceil(r2.measureText(r0)))) / 2, org.telegram.messenger.g0.L(this.D == 40 ? 28.0f : 21.0f), this.b);
                } else {
                    Drawable drawable = this.a;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    int i7 = this.E;
                    drawable.setBounds(measuredWidth2, measuredHeight + i7, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i7);
                    drawable.draw(this.f);
                }
                this.f.drawCircle((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth()) / 2), J);
                canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
            }
            L = (org.telegram.messenger.g0.L(2.0f) * f10) / 0.2f;
            measuredWidth -= L;
            if (this.h) {
            }
            H.setColor(this.F);
            if (this.n) {
            }
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, H);
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, I);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
            this.d.eraseColor(0);
            if (this.G == null) {
            }
            this.f.drawCircle((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth()) / 2), J);
            canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.y);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.F = i7;
        invalidate();
    }

    public void setCheckColor(int i7) {
        this.a.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i7);
        invalidate();
    }

    public void setCheckOffset(int i7) {
        this.E = i7;
    }

    public void setDrawBackground(boolean z9) {
        this.h = z9;
    }

    public void setHasBorder(boolean z9) {
        this.n = z9;
    }

    public void setNum(int i7) {
        if (i7 >= 0) {
            this.G = "" + (i7 + 1);
        } else if (this.s == null) {
            this.G = null;
        }
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.r == f10) {
            return;
        }
        this.r = f10;
        invalidate();
    }

    public void setSize(int i7) {
        this.D = i7;
        if (i7 == 40) {
            this.b.setTextSize(org.telegram.messenger.g0.L(24.0f));
        }
    }

    public void setStrokeWidth(int i7) {
        K.setStrokeWidth(i7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0 && this.c == null) {
            try {
                int L = org.telegram.messenger.g0.L(this.D);
                int L2 = org.telegram.messenger.g0.L(this.D);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.c = Bitmap.createBitmap(L, L2, config);
                this.e = new Canvas(this.c);
                this.d = Bitmap.createBitmap(org.telegram.messenger.g0.L(this.D), org.telegram.messenger.g0.L(this.D), config);
                this.f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
