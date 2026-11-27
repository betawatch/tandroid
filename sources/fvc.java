// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fvc extends View {
    public ObjectAnimator E;
    public final View F;
    public int[] G;
    public final w10 H;
    public final Paint I;
    public float J;
    public final vnb a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public final Paint e;
    public String f;
    public int h;
    public int n;
    public final RectF r;
    public boolean s;
    public final Canvas w;
    public final Bitmap x;
    public float y;

    public fvc(Context context, boolean z, View view, vnb vnbVar) {
        super(context);
        this.G = new int[4];
        this.H = new w10(this);
        this.I = new Paint(1);
        this.a = vnbVar;
        this.r = new RectF();
        if (z) {
            Bitmap createBitmap = Bitmap.createBitmap(hl.L(18.0f), hl.L(18.0f), Bitmap.Config.ARGB_4444);
            this.x = createBitmap;
            this.w = new Canvas(createBitmap);
        }
        this.F = view;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        textPaint.setTextSize(hl.L(14.0f));
        textPaint.setTypeface(hl.o());
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
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

    private void setProgress(float f) {
        if (this.y == f) {
            return;
        }
        this.y = f;
        invalidate();
    }

    public final void a(boolean z, boolean z2) {
        if (z == this.s) {
            return;
        }
        this.s = z;
        if (z2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.H, z ? 1.0f : 0.0f);
            this.E = ofFloat;
            ofFloat.setDuration(300L);
            this.E.start();
            return;
        }
        ObjectAnimator objectAnimator = this.E;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.y = z ? 1.0f : 0.0f;
        invalidate();
    }

    public final void b(int i, int i2) {
        int[] iArr = this.G;
        if (iArr == null) {
            iArr = new int[4];
            this.G = iArr;
        }
        iArr[i] = i2;
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.r;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        View view = this.F;
        vnb vnbVar = this.a;
        aob.s(this, view, vnbVar);
        float measuredHeight2 = getMeasuredHeight() / 2;
        float measuredHeight3 = getMeasuredHeight() / 2;
        Paint d = vnbVar != null ? vnbVar.d("paintChatActionBackground") : null;
        if (d == null) {
            d = aob.T0("paintChatActionBackground");
        }
        canvas2.drawRoundRect(rectF, measuredHeight2, measuredHeight3, d);
        if (vnbVar == null ? aob.b1() : vnbVar.g()) {
            float measuredHeight4 = getMeasuredHeight() / 2;
            float measuredHeight5 = getMeasuredHeight() / 2;
            Paint d2 = vnbVar != null ? vnbVar.d("paintChatActionBackgroundDarken") : null;
            if (d2 == null) {
                d2 = aob.T0("paintChatActionBackgroundDarken");
            }
            canvas2.drawRoundRect(rectF, measuredHeight4, measuredHeight5, d2);
        }
        if (this.J > 0.0f) {
            canvas2.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, this.I);
        }
        int i = aob.Zc;
        int v0 = aob.v0(i, vnbVar);
        TextPaint textPaint = this.d;
        textPaint.setColor(v0);
        int D = ik8.D(28.0f, getMeasuredWidth() - this.h, 2);
        canvas2.drawText(this.f, hl.L(28.0f) + D, hl.L(21.0f), textPaint);
        canvas2.save();
        canvas2.translate(D, hl.L(7.0f));
        Bitmap bitmap = this.x;
        int i2 = 0;
        Paint paint = this.e;
        if (bitmap != null) {
            float f2 = this.y;
            float f3 = f2 / 0.5f;
            if (f2 <= 0.5f) {
                f = f3;
            } else {
                f3 = 2.0f - f3;
                f = 1.0f;
            }
            float L = hl.L(1.0f) * f3;
            rectF.set(L, L, hl.L(18.0f) - L, hl.L(18.0f) - L);
            bitmap.eraseColor(0);
            paint.setColor(aob.v0(i, vnbVar));
            float width = rectF.width() / 2.0f;
            float height = rectF.height() / 2.0f;
            Canvas canvas3 = this.w;
            canvas3.drawRoundRect(rectF, width, height, paint);
            if (f != 1.0f) {
                float min = Math.min(hl.L(7.0f), (hl.L(7.0f) * f) + L);
                rectF.set(hl.L(2.0f) + min, hl.L(2.0f) + min, hl.L(16.0f) - min, hl.L(16.0f) - min);
                canvas3.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.b);
            }
            if (this.y > 0.5f) {
                float f4 = 1.0f - f3;
                Paint paint2 = this.c;
                canvas3.drawLine(hl.L(7.3f), hl.L(13.0f), (int) (hl.L(7.3f) - (hl.L(2.5f) * f4)), (int) (hl.L(13.0f) - (hl.L(2.5f) * f4)), paint2);
                canvas3.drawLine(hl.L(7.3f), hl.L(13.0f), (int) ((hl.L(6.0f) * f4) + hl.L(7.3f)), (int) (hl.L(13.0f) - (hl.L(6.0f) * f4)), paint2);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        } else {
            rectF.set(0.0f, 0.0f, hl.L(18.0f), hl.L(18.0f));
            int[] iArr = this.G;
            if (iArr[3] != 0) {
                while (i2 < 4) {
                    paint.setColor(this.G[i2]);
                    RectF rectF2 = rectF;
                    canvas2.drawArc(rectF2, (i2 * 90) - 90, 90.0f, true, paint);
                    i2++;
                    rectF = rectF2;
                    canvas2 = canvas;
                }
            } else {
                RectF rectF3 = rectF;
                if (iArr[2] != 0) {
                    while (i2 < 3) {
                        paint.setColor(this.G[i2]);
                        RectF rectF4 = rectF3;
                        canvas.drawArc(rectF4, (i2 * jn7.E1) - 90, 120.0f, true, paint);
                        rectF3 = rectF4;
                        i2++;
                    }
                } else if (iArr[1] != 0) {
                    while (i2 < 2) {
                        paint.setColor(this.G[i2]);
                        RectF rectF5 = rectF3;
                        canvas.drawArc(rectF5, (i2 * jn7.J2) - 90, 180.0f, true, paint);
                        i2++;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(ik8.E(56.0f, this.n, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), TLObject.FLAG_30));
    }

    public void setDimAmount(float f) {
        this.J = f;
        this.I.setColor(vm2.o(-16777216, (int) (f * 255.0f)));
        invalidate();
    }
}
