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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class CheckBox extends View {
    public static Paint D;
    public static Paint E;
    public static Paint F;
    public static Paint G;
    public int A;
    public int B;
    public String C;
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
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public CheckBox(Context context, int i10) {
        super(context);
        this.v = true;
        this.y = 22;
        if (D == null) {
            D = new Paint(1);
            Paint paint = new Paint(1);
            E = paint;
            paint.setColor(0);
            Paint paint2 = E;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            F = paint3;
            paint3.setColor(0);
            Paint paint4 = F;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            F.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            G = paint5;
            paint5.setColor(-1);
            G.setStyle(style);
        }
        F.setStrokeWidth(AndroidUtilities.dp(28.0f));
        G.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z10) {
        b(z10, false);
    }

    public final void b(boolean z10, boolean z11) {
        if (z10 == this.x) {
            return;
        }
        this.x = z10;
        if (!this.w || !z11) {
            ObjectAnimator objectAnimator = this.s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.s = null;
            }
            setProgress(z10 ? 1.0f : 0.0f);
            return;
        }
        this.v = z10;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addListener(new org.telegram.ui.am(this, 20));
        this.s.setDuration(300L);
        this.s.start();
    }

    public final void c(int i10, int i11) {
        this.B = i10;
        this.a.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i11);
        invalidate();
    }

    public float getProgress() {
        return this.r;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float dp;
        if (getVisibility() != 0 || this.c == null || this.d == null) {
            return;
        }
        if (this.h || this.r != 0.0f) {
            F.setStrokeWidth(AndroidUtilities.dp(this.y + 6));
            this.c.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f10 = this.r;
            float f11 = f10 >= 0.5f ? 1.0f : f10 / 0.5f;
            float f12 = f10 < 0.5f ? 0.0f : (f10 - 0.5f) / 0.5f;
            if (!this.v) {
                f10 = 1.0f - f10;
            }
            if (f10 >= 0.2f) {
                if (f10 < 0.4f) {
                    dp = AndroidUtilities.dp(2.0f) - (((f10 - 0.2f) * AndroidUtilities.dp(2.0f)) / 0.2f);
                }
                if (this.h) {
                    D.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), D);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), G);
                }
                D.setColor(this.B);
                if (this.n) {
                    measuredWidth -= AndroidUtilities.dp(2.0f);
                }
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, D);
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, E);
                canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
                this.d.eraseColor(0);
                if (this.C == null) {
                    this.f.drawText(this.C, (getMeasuredWidth() - ((int) Math.ceil(r2.measureText(r0)))) / 2, AndroidUtilities.dp(this.y == 40 ? 28.0f : 21.0f), this.b);
                } else {
                    Drawable drawable = this.a;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    int i10 = this.A;
                    drawable.setBounds(measuredWidth2, measuredHeight + i10, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i10);
                    drawable.draw(this.f);
                }
                this.f.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), F);
                canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
            }
            dp = (AndroidUtilities.dp(2.0f) * f10) / 0.2f;
            measuredWidth -= dp;
            if (this.h) {
            }
            D.setColor(this.B);
            if (this.n) {
            }
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, D);
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, E);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
            this.d.eraseColor(0);
            if (this.C == null) {
            }
            this.f.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), F);
            canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.x);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.B = i10;
        invalidate();
    }

    public void setCheckColor(int i10) {
        this.a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.A = i10;
    }

    public void setDrawBackground(boolean z10) {
        this.h = z10;
    }

    public void setHasBorder(boolean z10) {
        this.n = z10;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.C = "" + (i10 + 1);
        } else if (this.s == null) {
            this.C = null;
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

    public void setSize(int i10) {
        this.y = i10;
        if (i10 == 40) {
            this.b.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i10) {
        G.setStrokeWidth(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && this.c == null) {
            try {
                int dp = AndroidUtilities.dp(this.y);
                int dp2 = AndroidUtilities.dp(this.y);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.c = Bitmap.createBitmap(dp, dp2, config);
                this.e = new Canvas(this.c);
                this.d = Bitmap.createBitmap(AndroidUtilities.dp(this.y), AndroidUtilities.dp(this.y), config);
                this.f = new Canvas(this.d);
            } catch (Throwable unused) {
            }
        }
    }
}
