package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import c8.j9;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.rc;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class w0 extends FrameLayout implements a6 {
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public boolean L;
    public float[] M;
    public boolean N;
    public LinearGradient O;
    public int P;
    public int Q;
    public Matrix R;
    public int S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public float a;
    public final l2.w a0;
    public v10 b;
    public PorterDuffColorFilter b0;
    public final s0 c;
    public float c0;
    public final s0 d;
    public float d0;
    public final org.telegram.ui.Components.w5 e;
    public long e0;
    public Bitmap f;
    public boolean f0;
    public BitmapShader h;
    public Matrix n;
    public final int[] r;
    public float s;
    public boolean w;
    public boolean x;
    public final f6 y;

    public w0(Context context, f6 f6Var) {
        super(context);
        this.a = 0.5f;
        xq xqVar = xq.h;
        this.e = new org.telegram.ui.Components.w5(1.0f, this, 0L, 320L, xqVar);
        this.r = new int[2];
        this.s = 0.0f;
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new Paint(1);
        Paint paint3 = new Paint(1);
        this.G = paint3;
        Paint paint4 = new Paint(1);
        this.H = paint4;
        Paint paint5 = new Paint(1);
        this.I = paint5;
        this.J = new Paint(1);
        Paint paint6 = new Paint(1);
        this.K = paint6;
        this.N = true;
        this.W = false;
        this.a0 = new l2.w(this, 18);
        this.y = f6Var;
        setWillNotDraw(false);
        s0 s0Var = new s0(this, 0);
        this.c = s0Var;
        s0Var.setCallback(this);
        s0Var.x(org.telegram.messenger.g0.o());
        s0Var.n(0.3f, 165L, xqVar);
        s0Var.w(org.telegram.messenger.g0.N(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = s0Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        s0Var.b = hd.a0 ? 5 : 3;
        s0 s0Var2 = new s0(this, 1);
        this.d = s0Var2;
        s0Var2.setCallback(this);
        s0Var2.x(org.telegram.messenger.g0.o());
        s0Var2.n(0.3f, 165L, xqVar);
        s0Var2.w(org.telegram.messenger.g0.N(14.0f));
        TextPaint textPaint2 = s0Var2.a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        s0Var2.b = hd.a0 ? 3 : 5;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.N(1.33f), 0.0f, org.telegram.messenger.g0.N(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, -0.4f);
        org.telegram.messenger.g0.h(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int w02 = k6.w0(k6.G8, f6Var);
        this.U = w02;
        paint2.setColor(w02);
        boolean z9 = org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f;
        this.L = z9;
        s0Var.u(z9 ? -1 : -16777216);
        s0Var2.u(this.L ? -1 : -16777216);
        paint4.setColor(k6.r1(0.025f, -16777216));
        paint3.setColor(k6.r1(0.35f, -1));
        paint6.setColor(k6.r1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.M == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            float[] fArr = this.M;
            if (i7 >= fArr.length) {
                return;
            }
            float f10 = fArr[i7];
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + org.telegram.messenger.g0.L(0.66f), rectF.bottom, this.K);
            i7++;
        }
    }

    public final void b(Canvas canvas, boolean z9) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z9) {
            porterDuffColorFilter = this.b0;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.b0 = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        s0 s0Var = this.c;
        s0Var.setColorFilter(porterDuffColorFilter);
        s0Var.setBounds(org.telegram.messenger.g0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() / 2);
        s0Var.draw(canvas);
        if (z9 && (porterDuffColorFilter2 = this.b0) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.b0 = porterDuffColorFilter2;
        }
        s0 s0Var2 = this.d;
        s0Var2.setColorFilter(porterDuffColorFilter2);
        s0Var2.setBounds(org.telegram.messenger.g0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() / 2);
        s0Var2.draw(canvas);
    }

    public abstract int c(float f10);

    public final void d(boolean z9, float f10) {
        ValueAnimator valueAnimator = this.T;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        float a10 = j9.a(f10, 0.0f, 1.0f);
        if (z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, a10);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new fi.v3(this, 10));
            this.T.addListener(new t0(this, a10, 0));
            this.T.setInterpolator(xq.h);
            this.T.setDuration(220L);
            this.T.start();
        } else {
            this.a = a10;
            invalidate();
        }
        v0 v0Var = (v0) this;
        String str2 = v0Var.h0;
        if (str2 == null) {
            str2 = du0.a((a10 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            s0 s0Var = this.c;
            if (!TextUtils.equals(s0Var.i, str2)) {
                s0Var.a();
                s0Var.t(str2, true, true);
            }
        }
        if (v0Var.h0 != null) {
            str = du0.a((2.8f * a10) + 0.2f) + "x";
        }
        if (str != null) {
            s0 s0Var2 = this.d;
            if (!TextUtils.equals(s0Var2.i, str)) {
                s0Var2.a();
                s0Var2.t(str, true, true);
            }
        }
        this.J.setColor(c(a10));
    }

    public float getValue() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.w) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.D);
        }
        boolean z9 = this.x;
        Paint paint = this.J;
        if (z9) {
            float e10 = this.e.e(false, this.f != null ? 1.0f : 0.0f);
            if (e10 < 1.0f) {
                if (this.R == null || this.S != ((int) rectF.width())) {
                    Matrix matrix = this.R;
                    if (matrix == null) {
                        this.R = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.R;
                    int width = (int) rectF.width();
                    this.S = width;
                    matrix2.postScale(width, 1.0f);
                    this.O.setLocalMatrix(this.R);
                }
                Paint paint2 = this.I;
                paint2.setAlpha((int) ((1.0f - e10) * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), paint2);
            }
            if (this.f != null && this.a < 1.0f && e10 > 0.0f) {
                Paint paint3 = this.F;
                paint3.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), paint3);
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.G);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.H);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.E);
        }
        a(canvas);
        if (!this.L) {
            b(canvas, false);
        }
        if (this.a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), paint);
        a(canvas);
        if (!this.L) {
            b(canvas, true);
        }
        if (this.a < 1.0f) {
            canvas.restore();
        }
        if (this.L) {
            b(canvas, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int w02;
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        int[] iArr = this.r;
        getLocationOnScreen(iArr);
        Matrix matrix = this.n;
        if (matrix != null) {
            matrix.reset();
            this.n.postScale(8.0f, 8.0f);
            this.n.postTranslate(-iArr[0], -iArr[1]);
            BitmapShader bitmapShader = this.h;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.n);
                invalidate();
            }
        }
        boolean z10 = this.N;
        f6 f6Var = this.y;
        if (z10) {
            Drawable s02 = k6.s0();
            if (s02 instanceof ColorDrawable) {
                w02 = ((ColorDrawable) s02).getColor();
            } else {
                Pair pair = null;
                Bitmap bitmap = s02 instanceof qa0 ? ((qa0) s02).k : s02 instanceof BitmapDrawable ? ((BitmapDrawable) s02).getBitmap() : null;
                if (bitmap != null) {
                    int i14 = iArr[0];
                    Point point = org.telegram.messenger.g0.q;
                    float f10 = i14 / point.x;
                    int width = (int) (f10 * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + i14) / point.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - org.telegram.messenger.g0.m) - k.getCurrentActionBarHeight()) / point.y) * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && measuredWidth >= 0 && measuredWidth < bitmap.getWidth() && currentActionBarHeight >= 0 && currentActionBarHeight < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, currentActionBarHeight)), Integer.valueOf(bitmap.getPixel(measuredWidth, currentActionBarHeight)));
                    }
                }
                if (pair != null) {
                    w02 = ((Integer) pair.first).intValue();
                    i13 = ((Integer) pair.second).intValue();
                    if (this.O == null && this.P == w02 && this.Q == i13) {
                        return;
                    }
                    this.P = w02;
                    this.Q = i13;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.O = linearGradient;
                    this.I.setShader(linearGradient);
                }
                w02 = k6.r1(0.25f, k6.w0(k6.d6, f6Var));
            }
        } else {
            w02 = k6.w0(k6.d6, f6Var);
            if (!k6.I.q()) {
                w02 = k6.w(w02, k6.r1(0.18f, -16777216));
            }
        }
        i13 = w02;
        if (this.O == null) {
        }
        this.P = w02;
        this.Q = i13;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.O = linearGradient2;
        this.I.setShader(linearGradient2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.w) {
            i7 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
        boolean z9 = iz.o() >= 2 && rc.e(256);
        if (this.x && this.f == null && !this.W && z9) {
            this.a0.run();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f0 = true;
            this.c0 = x10;
            this.d0 = this.a;
            this.e0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i7 = 0;
            if (action == 1) {
                this.f0 = false;
                if (System.currentTimeMillis() - this.e0 < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.M != null) {
                        while (true) {
                            float[] fArr = this.M;
                            if (i7 >= fArr.length) {
                                break;
                            }
                            if (Math.abs(paddingLeft - fArr[i7]) < 0.1f) {
                                paddingLeft = this.M[i7];
                                break;
                            }
                            i7++;
                        }
                    }
                    v10 v10Var = this.b;
                    if (v10Var != null) {
                        v10Var.a(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.c0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.d0;
            if (this.M != null) {
                int i10 = 0;
                while (true) {
                    float[] fArr2 = this.M;
                    if (i10 >= fArr2.length) {
                        break;
                    }
                    if (Math.abs(max - fArr2[i10]) < 0.05f) {
                        max = this.M[i10];
                        break;
                    }
                    i10++;
                }
            }
            boolean z9 = !this.f0;
            d(false, max);
            v10 v10Var2 = this.b;
            if (v10Var2 != null) {
                v10Var2.a(Float.valueOf(this.a), Boolean.valueOf(z9));
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Paint paint = this.E;
        paint.setColor(i7);
        boolean z9 = org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f;
        this.L = z9;
        this.c.u(z9 ? -1 : -16777216);
        this.d.u(this.L ? -1 : -16777216);
    }

    public void setDrawBlur(boolean z9) {
        this.x = z9;
        invalidate();
    }

    public void setDrawShadow(boolean z9) {
        this.w = z9;
        int L = z9 ? org.telegram.messenger.g0.L(8.0f) : 0;
        setPadding(L, L, L, L);
        invalidate();
    }

    public void setOnValueChange(v10 v10Var) {
        this.b = v10Var;
    }

    public void setRoundRadiusDp(float f10) {
        this.s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.M = fArr;
    }

    public void setTextColor(int i7) {
        this.V = true;
        this.c.u(i7);
        this.d.u(i7);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int w02;
        Paint paint = this.E;
        if (paint != null) {
            try {
                if (paint.getColor() == this.U && (w02 = k6.w0(k6.G8, this.y)) != this.U) {
                    this.U = w02;
                    paint.setColor(w02);
                    boolean z9 = org.telegram.messenger.g0.B(w02) <= 0.721f;
                    this.L = z9;
                    if (!this.V) {
                        s0 s0Var = this.c;
                        if (s0Var != null) {
                            s0Var.u(z9 ? -1 : -16777216);
                        }
                        s0 s0Var2 = this.d;
                        if (s0Var2 != null) {
                            s0Var2.u(this.L ? -1 : -16777216);
                        }
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        Paint paint2 = this.J;
        if (paint2 != null) {
            paint2.setColor(c(this.a));
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
