package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w91 extends View {
    public final View E;
    public int[] F;
    public final org.telegram.ui.Cells.b2 G;
    public final Paint H;
    public float I;
    public final org.telegram.ui.ActionBar.u6 a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public final Paint e;
    public String f;
    public int h;
    public int n;
    public final RectF r;
    public boolean s;
    public final Canvas v;
    public final Bitmap w;
    public float x;
    public ObjectAnimator y;

    public w91(Context context, boolean z10, View view, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.F = new int[4];
        this.G = new org.telegram.ui.Cells.b2(this);
        this.H = new Paint(1);
        this.a = u6Var;
        this.r = new RectF();
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
            this.w = createBitmap;
            this.v = new Canvas(createBitmap);
        }
        this.E = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(0);
        paint.setStrokeCap(Paint.Cap.ROUND);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.e = new Paint(1);
    }

    private void setProgress(float f7) {
        if (this.x == f7) {
            return;
        }
        this.x = f7;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.s) {
            return;
        }
        this.s = z10;
        if (z11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.G, z10 ? 1.0f : 0.0f);
            this.y = ofFloat;
            ofFloat.setDuration(300L);
            this.y.start();
            return;
        }
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.x = z10 ? 1.0f : 0.0f;
        invalidate();
    }

    public final void b(int i10, int i11) {
        if (this.F == null) {
            this.F = new int[4];
        }
        this.F[i10] = i11;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2 = canvas;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.r;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        View view = this.E;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        org.telegram.ui.ActionBar.y6.s(this, view, u6Var);
        float measuredHeight2 = getMeasuredHeight() / 2;
        float measuredHeight3 = getMeasuredHeight() / 2;
        Paint d = u6Var != null ? u6Var.d("paintChatActionBackground") : null;
        if (d == null) {
            d = org.telegram.ui.ActionBar.y6.U0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight2, measuredHeight3, d);
        if (u6Var == null ? org.telegram.ui.ActionBar.y6.c1() : u6Var.f()) {
            float measuredHeight4 = getMeasuredHeight() / 2;
            float measuredHeight5 = getMeasuredHeight() / 2;
            Paint d10 = u6Var != null ? u6Var.d("paintChatActionBackgroundDarken") : null;
            if (d10 == null) {
                d10 = org.telegram.ui.ActionBar.y6.U0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight4, measuredHeight5, d10);
        }
        if (this.I > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.H);
        }
        int i10 = org.telegram.ui.ActionBar.y6.ic;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(w02);
        int B = org.telegram.messenger.wh.B(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f, AndroidUtilities.dp(28.0f) + B, AndroidUtilities.dp(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(B, AndroidUtilities.dp(7.0f));
        Bitmap bitmap = this.w;
        int i11 = 0;
        Paint paint = this.e;
        if (bitmap != null) {
            float f11 = this.x;
            if (f11 <= 0.5f) {
                f7 = f11 / 0.5f;
                f10 = f7;
            } else {
                f7 = 2.0f - (f11 / 0.5f);
                f10 = 1.0f;
            }
            float dp = AndroidUtilities.dp(1.0f) * f7;
            rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
            bitmap.eraseColor(0);
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            float width = rectF.width() / 2.0f;
            float height = rectF.height() / 2.0f;
            Canvas canvas3 = this.v;
            canvas3.drawRoundRect(rectF, width, height, paint);
            if (f10 != 1.0f) {
                float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f10) + dp);
                rectF.set(AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(16.0f) - min, AndroidUtilities.dp(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.b);
            }
            if (this.x > 0.5f) {
                float f12 = 1.0f - f7;
                Paint paint2 = this.c;
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) (AndroidUtilities.dp(7.3f) - (AndroidUtilities.dp(2.5f) * f12)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(2.5f) * f12)), paint2);
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) ((AndroidUtilities.dp(6.0f) * f12) + AndroidUtilities.dp(7.3f)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(6.0f) * f12)), paint2);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            int[] iArr = this.F;
            if (iArr[3] != 0) {
                while (i11 < 4) {
                    paint.setColor(this.F[i11]);
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, (i11 * 90) - 90, 90.0f, true, paint);
                    i11++;
                    rectF = rectF2;
                    canvas2 = canvas;
                }
            } else {
                RectF rectF3 = rectF;
                if (iArr[2] != 0) {
                    while (i11 < 3) {
                        paint.setColor(this.F[i11]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i11 * 120) - 90, 120.0f, true, paint);
                        rectF3 = rectF4;
                        i11++;
                    }
                } else if (iArr[1] != 0) {
                    while (i11 < 2) {
                        paint.setColor(this.F[i11]);
                        RectF rectF5 = rectF3;
                        canvas.drawArc(rectF5, (i11 * 180) - 90, 180.0f, true, paint);
                        i11++;
                        rectF3 = rectF5;
                    }
                } else {
                    canvas2 = canvas;
                    paint.setColor(iArr[0]);
                    canvas2.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.height() / 2.0f, paint);
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(org.telegram.messenger.wh.D(56.0f, this.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setDimAmount(float f7) {
        this.I = f7;
        this.H.setColor(i0.a.o(-16777216, (int) (f7 * 255.0f)));
        invalidate();
    }
}
