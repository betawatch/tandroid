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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class CheckBox extends View {
    public static Paint E;
    public static Paint F;
    public static Paint G;
    public static Paint H;
    public int B;
    public int C;
    public String D;
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
        if (E == null) {
            E = new Paint(1);
            Paint paint = new Paint(1);
            F = paint;
            paint.setColor(0);
            Paint paint2 = F;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint(1);
            G = paint3;
            paint3.setColor(0);
            Paint paint4 = G;
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            G.setXfermode(new PorterDuffXfermode(mode));
            Paint paint5 = new Paint(1);
            H = paint5;
            paint5.setColor(-1);
            H.setStyle(style);
        }
        G.setStrokeWidth(AndroidUtilities.dp(28.0f));
        H.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.a = context.getResources().getDrawable(i10).mutate();
    }

    public final void a(boolean z4) {
        b(z4, false);
    }

    public final void b(boolean z4, boolean z10) {
        if (z4 == this.x) {
            return;
        }
        this.x = z4;
        if (!this.w || !z10) {
            ObjectAnimator objectAnimator = this.s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.s = null;
            }
            setProgress(z4 ? 1.0f : 0.0f);
            return;
        }
        this.v = z4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z4 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addListener(new a9(this, 11));
        this.s.setDuration(300L);
        this.s.start();
    }

    public final void c(int i10, int i11) {
        this.C = i10;
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
            G.setStrokeWidth(AndroidUtilities.dp(this.y + 6));
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
                    E.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), E);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), H);
                }
                E.setColor(this.C);
                if (this.n) {
                    measuredWidth -= AndroidUtilities.dp(2.0f);
                }
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, E);
                this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, F);
                canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
                this.d.eraseColor(0);
                if (this.D == null) {
                    this.f.drawText(this.D, (getMeasuredWidth() - ((int) Math.ceil(r2.measureText(r0)))) / 2, AndroidUtilities.dp(this.y == 40 ? 28.0f : 21.0f), this.b);
                } else {
                    Drawable drawable = this.a;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int measuredWidth2 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    int i10 = this.B;
                    drawable.setBounds(measuredWidth2, measuredHeight + i10, intrinsicWidth + measuredWidth2, measuredHeight + intrinsicHeight + i10);
                    drawable.draw(this.f);
                }
                this.f.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), G);
                canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
            }
            dp = (AndroidUtilities.dp(2.0f) * f10) / 0.2f;
            measuredWidth -= dp;
            if (this.h) {
            }
            E.setColor(this.C);
            if (this.n) {
            }
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, E);
            this.e.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f11) * measuredWidth, F);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, (Paint) null);
            this.d.eraseColor(0);
            if (this.D == null) {
            }
            this.f.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f12) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), G);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.C = i10;
        invalidate();
    }

    public void setCheckColor(int i10) {
        this.a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        this.b.setColor(i10);
        invalidate();
    }

    public void setCheckOffset(int i10) {
        this.B = i10;
    }

    public void setDrawBackground(boolean z4) {
        this.h = z4;
    }

    public void setHasBorder(boolean z4) {
        this.n = z4;
    }

    public void setNum(int i10) {
        if (i10 >= 0) {
            this.D = "" + (i10 + 1);
        } else if (this.s == null) {
            this.D = null;
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
        H.setStrokeWidth(i10);
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
