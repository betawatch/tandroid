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
import b8.be;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.lc;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class v0 extends FrameLayout implements z5 {
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public float[] N;
    public boolean O;
    public LinearGradient P;
    public int Q;
    public int R;
    public Matrix S;
    public int T;
    public ValueAnimator U;
    public int V;
    public boolean W;
    public float a;
    public boolean a0;
    public n10 b;
    public final lg.n b0;
    public final r0 c;
    public PorterDuffColorFilter c0;
    public final r0 d;
    public float d0;
    public final org.telegram.ui.Components.u5 e;
    public float e0;
    public Bitmap f;
    public long f0;
    public boolean g0;
    public BitmapShader h;
    public Matrix n;
    public final int[] r;
    public float s;
    public boolean w;
    public boolean x;
    public final e6 y;

    public v0(Context context, e6 e6Var) {
        super(context);
        this.a = 0.5f;
        xq xqVar = xq.h;
        this.e = new org.telegram.ui.Components.u5(1.0f, this, 0L, 320L, xqVar);
        this.r = new int[2];
        this.s = 0.0f;
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Paint(1);
        Paint paint3 = new Paint(1);
        this.H = paint3;
        Paint paint4 = new Paint(1);
        this.I = paint4;
        Paint paint5 = new Paint(1);
        this.J = paint5;
        this.K = new Paint(1);
        Paint paint6 = new Paint(1);
        this.L = paint6;
        this.O = true;
        this.a0 = false;
        this.b0 = new lg.n(this, 21);
        this.y = e6Var;
        setWillNotDraw(false);
        r0 r0Var = new r0(this, 0);
        this.c = r0Var;
        r0Var.setCallback(this);
        r0Var.x(org.telegram.messenger.g0.o());
        r0Var.n(0.3f, 165L, xqVar);
        r0Var.w(org.telegram.messenger.g0.N(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = r0Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        r0Var.b = bd.a0 ? 5 : 3;
        r0 r0Var2 = new r0(this, 1);
        this.d = r0Var2;
        r0Var2.setCallback(this);
        r0Var2.x(org.telegram.messenger.g0.o());
        r0Var2.n(0.3f, 165L, xqVar);
        r0Var2.w(org.telegram.messenger.g0.N(14.0f));
        TextPaint textPaint2 = r0Var2.a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(org.telegram.messenger.g0.N(0.3f));
        r0Var2.b = bd.a0 ? 3 : 5;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.N(1.33f), 0.0f, org.telegram.messenger.g0.N(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, -0.4f);
        org.telegram.messenger.g0.h(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        int w02 = k6.w0(k6.G8, e6Var);
        this.V = w02;
        paint2.setColor(w02);
        boolean z10 = org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f;
        this.M = z10;
        r0Var.u(z10 ? -1 : -16777216);
        r0Var2.u(this.M ? -1 : -16777216);
        paint4.setColor(k6.r1(0.025f, -16777216));
        paint3.setColor(k6.r1(0.35f, -1));
        paint6.setColor(k6.r1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.N == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            float[] fArr = this.N;
            if (i3 >= fArr.length) {
                return;
            }
            float f10 = fArr[i3];
            RectF rectF = org.telegram.messenger.g0.P;
            canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + org.telegram.messenger.g0.L(0.66f), rectF.bottom, this.L);
            i3++;
        }
    }

    public final void b(Canvas canvas, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z10) {
            porterDuffColorFilter = this.c0;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.c0 = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        r0 r0Var = this.c;
        r0Var.setColorFilter(porterDuffColorFilter);
        r0Var.setBounds(org.telegram.messenger.g0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() / 2);
        r0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.c0) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.c0 = porterDuffColorFilter2;
        }
        r0 r0Var2 = this.d;
        r0Var2.setColorFilter(porterDuffColorFilter2);
        r0Var2.setBounds(org.telegram.messenger.g0.L(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() / 2);
        r0Var2.draw(canvas);
    }

    public abstract int c(float f10);

    public final void d(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.U;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        float a10 = be.a(f10, 0.0f, 1.0f);
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, a10);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new gi.j3(this, 11));
            this.U.addListener(new s0(this, a10, 0));
            this.U.setInterpolator(xq.h);
            this.U.setDuration(220L);
            this.U.start();
        } else {
            this.a = a10;
            invalidate();
        }
        u0 u0Var = (u0) this;
        String str2 = u0Var.i0;
        if (str2 == null) {
            str2 = cu0.a((a10 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            r0 r0Var = this.c;
            if (!TextUtils.equals(r0Var.i, str2)) {
                r0Var.a();
                r0Var.t(str2, true, true);
            }
        }
        if (u0Var.i0 != null) {
            str = cu0.a((2.8f * a10) + 0.2f) + "x";
        }
        if (str != null) {
            r0 r0Var2 = this.d;
            if (!TextUtils.equals(r0Var2.i, str)) {
                r0Var2.a();
                r0Var2.t(str, true, true);
            }
        }
        this.K.setColor(c(a10));
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
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.E);
        }
        boolean z10 = this.x;
        Paint paint = this.K;
        if (z10) {
            float e10 = this.e.e(false, this.f != null ? 1.0f : 0.0f);
            if (e10 < 1.0f) {
                if (this.S == null || this.T != ((int) rectF.width())) {
                    Matrix matrix = this.S;
                    if (matrix == null) {
                        this.S = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.S;
                    int width = (int) rectF.width();
                    this.T = width;
                    matrix2.postScale(width, 1.0f);
                    this.P.setLocalMatrix(this.S);
                }
                Paint paint2 = this.J;
                paint2.setAlpha((int) ((1.0f - e10) * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), paint2);
            }
            if (this.f != null && this.a < 1.0f && e10 > 0.0f) {
                Paint paint3 = this.G;
                paint3.setAlpha((int) (e10 * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), paint3);
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.H);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.I);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), this.F);
        }
        a(canvas);
        if (!this.M) {
            b(canvas, false);
        }
        if (this.a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(this.s), org.telegram.messenger.g0.L(this.s), paint);
        a(canvas);
        if (!this.M) {
            b(canvas, true);
        }
        if (this.a < 1.0f) {
            canvas.restore();
        }
        if (this.M) {
            b(canvas, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int w02;
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
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
        boolean z11 = this.O;
        e6 e6Var = this.y;
        if (z11) {
            Drawable s02 = k6.s0();
            if (s02 instanceof ColorDrawable) {
                w02 = ((ColorDrawable) s02).getColor();
            } else {
                Pair pair = null;
                Bitmap bitmap = s02 instanceof la0 ? ((la0) s02).k : s02 instanceof BitmapDrawable ? ((BitmapDrawable) s02).getBitmap() : null;
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
                    if (this.P == null && this.Q == w02 && this.R == i13) {
                        return;
                    }
                    this.Q = w02;
                    this.R = i13;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.P = linearGradient;
                    this.J.setShader(linearGradient);
                }
                w02 = k6.r1(0.25f, k6.w0(k6.d6, e6Var));
            }
        } else {
            w02 = k6.w0(k6.d6, e6Var);
            if (!k6.I.q()) {
                w02 = k6.w(w02, k6.r1(0.18f, -16777216));
            }
        }
        i13 = w02;
        if (this.P == null) {
        }
        this.Q = w02;
        this.R = i13;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{w02, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.P = linearGradient2;
        this.J.setShader(linearGradient2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.w) {
            i3 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
        boolean z10 = az.o() >= 2 && lc.e(256);
        if (this.x && this.f == null && !this.a0 && z10) {
            this.b0.run();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g0 = true;
            this.d0 = x10;
            this.e0 = this.a;
            this.f0 = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i3 = 0;
            if (action == 1) {
                this.g0 = false;
                if (System.currentTimeMillis() - this.f0 < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.N != null) {
                        while (true) {
                            float[] fArr = this.N;
                            if (i3 >= fArr.length) {
                                break;
                            }
                            if (Math.abs(paddingLeft - fArr[i3]) < 0.1f) {
                                paddingLeft = this.N[i3];
                                break;
                            }
                            i3++;
                        }
                    }
                    n10 n10Var = this.b;
                    if (n10Var != null) {
                        n10Var.a(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x10 - this.d0) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.e0;
            if (this.N != null) {
                int i10 = 0;
                while (true) {
                    float[] fArr2 = this.N;
                    if (i10 >= fArr2.length) {
                        break;
                    }
                    if (Math.abs(max - fArr2[i10]) < 0.05f) {
                        max = this.N[i10];
                        break;
                    }
                    i10++;
                }
            }
            boolean z10 = !this.g0;
            d(false, max);
            n10 n10Var2 = this.b;
            if (n10Var2 != null) {
                n10Var2.a(Float.valueOf(this.a), Boolean.valueOf(z10));
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        Paint paint = this.F;
        paint.setColor(i3);
        boolean z10 = org.telegram.messenger.g0.B(paint.getColor()) <= 0.721f;
        this.M = z10;
        this.c.u(z10 ? -1 : -16777216);
        this.d.u(this.M ? -1 : -16777216);
    }

    public void setDrawBlur(boolean z10) {
        this.x = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        this.w = z10;
        int L = z10 ? org.telegram.messenger.g0.L(8.0f) : 0;
        setPadding(L, L, L, L);
        invalidate();
    }

    public void setOnValueChange(n10 n10Var) {
        this.b = n10Var;
    }

    public void setRoundRadiusDp(float f10) {
        this.s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.N = fArr;
    }

    public void setTextColor(int i3) {
        this.W = true;
        this.c.u(i3);
        this.d.u(i3);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        Paint paint = this.F;
        if (paint != null) {
            try {
                if (paint.getColor() == this.V && (w02 = k6.w0(k6.G8, this.y)) != this.V) {
                    this.V = w02;
                    paint.setColor(w02);
                    boolean z10 = org.telegram.messenger.g0.B(w02) <= 0.721f;
                    this.M = z10;
                    if (!this.W) {
                        r0 r0Var = this.c;
                        if (r0Var != null) {
                            r0Var.u(z10 ? -1 : -16777216);
                        }
                        r0 r0Var2 = this.d;
                        if (r0Var2 != null) {
                            r0Var2.u(this.M ? -1 : -16777216);
                        }
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        Paint paint2 = this.K;
        if (paint2 != null) {
            paint2.setColor(c(this.a));
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
