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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
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

    public CheckBox(Context context, int i3) {
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
        K.setStrokeWidth(org.telegram.messenger.g0.L(28.0f));
        L.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.a = context.getResources().getDrawable(i3).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.y) {
            return;
        }
        this.y = z10;
        if (!this.x || !z11) {
            ObjectAnimator objectAnimator = this.s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.s = null;
            }
            setProgress(z10 ? 1.0f : 0.0f);
            return;
        }
        this.w = z10;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addListener(new x5(this, 18));
        this.s.setDuration(300L);
        this.s.start();
    }

    public final void c(int i3, int i10) {
        this.G = i3;
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
        float L2;
        if (getVisibility() != 0 || this.c == null || this.d == null) {
            return;
        }
        if (this.h || this.r != 0.0f) {
            K.setStrokeWidth(org.telegram.messenger.g0.L(this.E + 6));
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
                    L2 = org.telegram.messenger.g0.L(2.0f) - (((f10 - 0.2f) * org.telegram.messenger.g0.L(2.0f)) / 0.2f);
                }
                if (this.h) {
                    I.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - org.telegram.messenger.g0.L(1.0f), I);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - org.telegram.messenger.g0.L(1.0f), L);
                }
                I.setColor(this.G);
                if (this.n) {
                    measuredWidth -= org.telegram.messenger.g0.L(2.0f);
                }
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, I);
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, J);
                canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
                this.d.eraseColor(0);
                if (this.H == null) {
                    this.f.drawText(this.H, (getMeasuredWidth() - ((int) Math.ceil(r2.measureText(r0)))) / 2, org.telegram.messenger.g0.L(this.E == 40 ? 28.0f : 21.0f), this.b);
                } else {
                    Drawable drawable = this.a;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    int i3 = this.F;
                    drawable.setBounds(measuredWidth2, measuredHeight + i3, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i3);
                    drawable.draw(this.f);
                }
                this.f.drawCircle((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth()) / 2), K);
                canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
            }
            L2 = (org.telegram.messenger.g0.L(2.0f) * f10) / 0.2f;
            measuredWidth -= L2;
            if (this.h) {
            }
            I.setColor(this.G);
            if (this.n) {
            }
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, I);
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, J);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
            this.d.eraseColor(0);
            if (this.H == null) {
            }
            this.f.drawCircle((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(2.5f), org.telegram.messenger.g0.L(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((org.telegram.messenger.g0.L(6.0f) + getMeasuredWidth()) / 2), K);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        this.G = i3;
        invalidate();
    }

    public void setCheckColor(int i3) {
        this.a.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i3);
        invalidate();
    }

    public void setCheckOffset(int i3) {
        this.F = i3;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.n = z10;
    }

    public void setNum(int i3) {
        if (i3 >= 0) {
            this.H = "" + (i3 + 1);
        } else if (this.s == null) {
            this.H = null;
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

    public void setSize(int i3) {
        this.E = i3;
        if (i3 == 40) {
            this.b.setTextSize(org.telegram.messenger.g0.L(24.0f));
        }
    }

    public void setStrokeWidth(int i3) {
        L.setStrokeWidth(i3);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 0 && this.c == null) {
            try {
                int L2 = org.telegram.messenger.g0.L(this.E);
                int L3 = org.telegram.messenger.g0.L(this.E);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.c = Bitmap.createBitmap(L2, L3, config);
                this.e = new Canvas(this.c);
                this.d = Bitmap.createBitmap(org.telegram.messenger.g0.L(this.E), org.telegram.messenger.g0.L(this.E), config);
                this.f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
