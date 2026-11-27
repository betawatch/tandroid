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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class CheckBox extends View {
    public static Paint I;
    public static Paint J;
    public static Paint K;
    public static Paint L;
    public int E;
    public int F;
    public int G;
    public String H;
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

    public CheckBox(Context context, int i) {
        super(context);
        this.w = true;
        this.E = 22;
        if (I == null) {
            I = new Paint(1);
            Paint paint = new Paint(1);
            J = paint;
            paint.setColor(0);
            Paint paint2 = J;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            K = paint3;
            paint3.setColor(0);
            Paint paint4 = K;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            K.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            L = paint5;
            paint5.setColor(-1);
            L.setStyle(style);
        }
        K.setStrokeWidth(hl.L(28.0f));
        L.setStrokeWidth(hl.L(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(hl.L(18.0f));
        textPaint.setTypeface(hl.o());
        this.a = context.getResources().getDrawable(i).mutate();
    }

    public final void a(boolean z) {
        b(z, false);
    }

    public final void b(boolean z, boolean z2) {
        if (z == this.y) {
            return;
        }
        this.y = z;
        if (!this.x || !z2) {
            ObjectAnimator objectAnimator = this.s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.s = null;
            }
            setProgress(z ? 1.0f : 0.0f);
            return;
        }
        this.w = z;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addListener(new jb1((Object) this, (byte) 27));
        this.s.setDuration(300L);
        this.s.start();
    }

    public final void c(int i, int i2) {
        this.G = i;
        this.a.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i2);
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float L2;
        if (getVisibility() != 0 || this.c == null || this.d == null) {
            return;
        }
        if (this.h || this.r != 0.0f) {
            K.setStrokeWidth(hl.L(this.E + 6));
            this.c.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f = this.r;
            float f2 = f >= 0.5f ? 1.0f : f / 0.5f;
            float f3 = f < 0.5f ? 0.0f : (f - 0.5f) / 0.5f;
            if (!this.w) {
                f = 1.0f - f;
            }
            if (f >= 0.2f) {
                if (f < 0.4f) {
                    L2 = hl.L(2.0f) - (((f - 0.2f) * hl.L(2.0f)) / 0.2f);
                }
                if (this.h) {
                    I.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - hl.L(1.0f), I);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - hl.L(1.0f), L);
                }
                I.setColor(this.G);
                if (this.n) {
                    measuredWidth -= hl.L(2.0f);
                }
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, I);
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f2) * measuredWidth, J);
                canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
                this.d.eraseColor(0);
                if (this.H == null) {
                    this.f.drawText(this.H, (getMeasuredWidth() - ((int) Math.ceil(r2.measureText(r0)))) / 2, hl.L(this.E == 40 ? 28.0f : 21.0f), this.b);
                } else {
                    Drawable drawable = this.a;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    int i = this.F;
                    drawable.setBounds(measuredWidth2, measuredHeight + i, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i);
                    drawable.draw(this.f);
                }
                this.f.drawCircle((getMeasuredWidth() / 2) - hl.L(2.5f), hl.L(4.0f) + (getMeasuredHeight() / 2), (1.0f - f3) * ((hl.L(6.0f) + getMeasuredWidth()) / 2), K);
                canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
            }
            L2 = (hl.L(2.0f) * f) / 0.2f;
            measuredWidth -= L2;
            if (this.h) {
            }
            I.setColor(this.G);
            if (this.n) {
            }
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, I);
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f2) * measuredWidth, J);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
            this.d.eraseColor(0);
            if (this.H == null) {
            }
            this.f.drawCircle((getMeasuredWidth() / 2) - hl.L(2.5f), hl.L(4.0f) + (getMeasuredHeight() / 2), (1.0f - f3) * ((hl.L(6.0f) + getMeasuredWidth()) / 2), K);
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.G = i;
        invalidate();
    }

    public void setCheckColor(int i) {
        this.a.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i);
        invalidate();
    }

    public void setCheckOffset(int i) {
        this.F = i;
    }

    public void setDrawBackground(boolean z) {
        this.h = z;
    }

    public void setHasBorder(boolean z) {
        this.n = z;
    }

    public void setNum(int i) {
        if (i >= 0) {
            this.H = String.valueOf(i + 1);
        } else if (this.s == null) {
            this.H = null;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.r == f) {
            return;
        }
        this.r = f;
        invalidate();
    }

    public void setSize(int i) {
        this.E = i;
        if (i == 40) {
            this.b.setTextSize(hl.L(24.0f));
        }
    }

    public void setStrokeWidth(int i) {
        L.setStrokeWidth(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.c == null) {
            try {
                int L2 = hl.L(this.E);
                int L3 = hl.L(this.E);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.c = Bitmap.createBitmap(L2, L3, config);
                this.e = new Canvas(this.c);
                this.d = Bitmap.createBitmap(hl.L(this.E), hl.L(this.E), config);
                this.f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
