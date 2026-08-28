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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o71 extends View {
    public final View A;
    public int[] B;
    public final org.telegram.ui.Cells.c2 C;
    public final Paint D;
    public float E;
    public final org.telegram.ui.ActionBar.b6 a;
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

    public o71(Context context, boolean z10, View view, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.B = new int[4];
        this.C = new org.telegram.ui.Cells.c2(this);
        this.D = new Paint(1);
        this.a = b6Var;
        this.r = new RectF();
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Bitmap.Config.ARGB_4444);
            this.w = createBitmap;
            this.v = new Canvas(createBitmap);
        }
        this.A = view;
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

    private void setProgress(float f10) {
        if (this.x == f10) {
            return;
        }
        this.x = f10;
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == this.s) {
            return;
        }
        this.s = z10;
        if (z11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.C, z10 ? 1.0f : 0.0f);
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

    public final void b(int i9, int i10) {
        if (this.B == null) {
            this.B = new int[4];
        }
        this.B[i9] = i10;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.r;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        View view = this.A;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        org.telegram.ui.ActionBar.f6.s(this, view, b6Var);
        float measuredHeight2 = getMeasuredHeight() / 2;
        float measuredHeight3 = getMeasuredHeight() / 2;
        Paint O = b6Var != null ? b6Var.O("paintChatActionBackground") : null;
        if (O == null) {
            O = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight2, measuredHeight3, O);
        if (b6Var == null ? org.telegram.ui.ActionBar.f6.a1() : b6Var.t0()) {
            float measuredHeight4 = getMeasuredHeight() / 2;
            float measuredHeight5 = getMeasuredHeight() / 2;
            Paint O2 = b6Var != null ? b6Var.O("paintChatActionBackgroundDarken") : null;
            if (O2 == null) {
                O2 = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight4, measuredHeight5, O2);
        }
        if (this.E > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.D);
        }
        int i9 = org.telegram.ui.ActionBar.f6.ic;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        TextPaint textPaint = this.d;
        textPaint.setColor(v02);
        int y10 = org.telegram.messenger.ll.y(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f, AndroidUtilities.dp(28.0f) + y10, AndroidUtilities.dp(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(y10, AndroidUtilities.dp(7.0f));
        Bitmap bitmap = this.w;
        int i10 = 0;
        Paint paint = this.e;
        if (bitmap != null) {
            float f12 = this.x;
            if (f12 <= 0.5f) {
                f10 = f12 / 0.5f;
                f11 = f10;
            } else {
                f10 = 2.0f - (f12 / 0.5f);
                f11 = 1.0f;
            }
            float dp = AndroidUtilities.dp(1.0f) * f10;
            rectF.set(dp, dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp);
            bitmap.eraseColor(0);
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            float width = rectF.width() / 2.0f;
            float height = rectF.height() / 2.0f;
            Canvas canvas3 = this.v;
            canvas3.drawRoundRect(rectF, width, height, paint);
            if (f11 != 1.0f) {
                float min = Math.min(AndroidUtilities.dp(7.0f), (AndroidUtilities.dp(7.0f) * f11) + dp);
                rectF.set(AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(2.0f) + min, AndroidUtilities.dp(16.0f) - min, AndroidUtilities.dp(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.b);
            }
            if (this.x > 0.5f) {
                float f13 = 1.0f - f10;
                Paint paint2 = this.c;
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) (AndroidUtilities.dp(7.3f) - (AndroidUtilities.dp(2.5f) * f13)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(2.5f) * f13)), paint2);
                canvas3.drawLine(AndroidUtilities.dp(7.3f), AndroidUtilities.dp(13.0f), (int) ((AndroidUtilities.dp(6.0f) * f13) + AndroidUtilities.dp(7.3f)), (int) (AndroidUtilities.dp(13.0f) - (AndroidUtilities.dp(6.0f) * f13)), paint2);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            int[] iArr = this.B;
            if (iArr[3] != 0) {
                while (i10 < 4) {
                    paint.setColor(this.B[i10]);
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, (i10 * 90) - 90, 90.0f, true, paint);
                    i10++;
                    rectF = rectF2;
                    canvas2 = canvas;
                }
            } else {
                RectF rectF3 = rectF;
                if (iArr[2] != 0) {
                    while (i10 < 3) {
                        paint.setColor(this.B[i10]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i10 * 120) - 90, 120.0f, true, paint);
                        rectF3 = rectF4;
                        i10++;
                    }
                } else if (iArr[1] != 0) {
                    while (i10 < 2) {
                        paint.setColor(this.B[i10]);
                        RectF rectF5 = rectF3;
                        canvas.drawArc(rectF5, (i10 * 180) - 90, 180.0f, true, paint);
                        i10++;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(org.telegram.messenger.ll.C(56.0f, this.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
    }

    public void setDimAmount(float f10) {
        this.E = f10;
        this.D.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        invalidate();
    }
}
