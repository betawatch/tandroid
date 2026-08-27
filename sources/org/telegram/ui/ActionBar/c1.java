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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nb0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class c1 extends FrameLayout {
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public boolean H;
    public float[] I;
    public boolean J;
    public LinearGradient K;
    public int L;
    public int M;
    public Matrix N;
    public int O;
    public ValueAnimator P;
    public boolean Q;
    public final p R;
    public PorterDuffColorFilter S;
    public float T;
    public float U;
    public long V;
    public boolean W;
    public float a;
    public Utilities.Callback2 b;
    public final y0 c;
    public final y0 d;
    public final org.telegram.ui.Components.y5 e;
    public Bitmap f;
    public BitmapShader h;
    public Matrix n;
    public final int[] r;
    public float s;
    public boolean v;
    public boolean w;
    public final c6 x;
    public final Paint y;

    public c1(Context context, c6 c6Var) {
        super(context);
        this.a = 0.5f;
        er erVar = er.h;
        this.e = new org.telegram.ui.Components.y5(1.0f, this, 0L, 320L, erVar);
        this.r = new int[2];
        this.s = 0.0f;
        Paint paint = new Paint(1);
        this.y = paint;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Paint(1);
        Paint paint3 = new Paint(1);
        this.C = paint3;
        Paint paint4 = new Paint(1);
        this.D = paint4;
        Paint paint5 = new Paint(1);
        this.E = paint5;
        this.F = new Paint(1);
        Paint paint6 = new Paint(1);
        this.G = paint6;
        this.J = true;
        this.Q = false;
        this.R = new p(this, 3);
        this.x = c6Var;
        setWillNotDraw(false);
        y0 y0Var = new y0(this, 0);
        this.c = y0Var;
        y0Var.setCallback(this);
        y0Var.u(AndroidUtilities.bold());
        y0Var.k(0.3f, 165L, erVar);
        y0Var.t(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = y0Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        y0Var.b = LocaleController.isRTL ? 5 : 3;
        y0 y0Var2 = new y0(this, 1);
        this.d = y0Var2;
        y0Var2.setCallback(this);
        y0Var2.u(AndroidUtilities.bold());
        y0Var2.k(0.3f, 165L, erVar);
        y0Var2.t(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = y0Var2.a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        y0Var2.b = LocaleController.isRTL ? 3 : 5;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint2.setColor(g6.v0(g6.G8, c6Var));
        boolean z10 = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.H = z10;
        y0Var.r(z10 ? -1 : -16777216);
        y0Var2.r(this.H ? -1 : -16777216);
        paint4.setColor(g6.l1(0.025f, -16777216));
        paint3.setColor(g6.l1(0.35f, -1));
        paint6.setColor(g6.l1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.I == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i10 >= fArr.length) {
                return;
            }
            float f10 = fArr[i10];
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + AndroidUtilities.dp(0.66f), rectF.bottom, this.G);
            i10++;
        }
    }

    public final void b(Canvas canvas, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z10) {
            porterDuffColorFilter = this.S;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.S = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        y0 y0Var = this.c;
        y0Var.setColorFilter(porterDuffColorFilter);
        y0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        y0Var.draw(canvas);
        if (z10 && (porterDuffColorFilter2 = this.S) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.S = porterDuffColorFilter2;
        }
        y0 y0Var2 = this.d;
        y0Var2.setColorFilter(porterDuffColorFilter2);
        y0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        y0Var2.draw(canvas);
    }

    public final void c(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.P;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P = null;
        }
        float a2 = h7.n.a(f10, 0.0f, 1.0f);
        if (z10) {
            int i10 = 0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, a2);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new w0(this, i10));
            this.P.addListener(new z0(this, a2, i10));
            this.P.setInterpolator(er.h);
            this.P.setDuration(220L);
            this.P.start();
        } else {
            this.a = a2;
            invalidate();
        }
        b1 b1Var = (b1) this;
        String str2 = b1Var.b0;
        if (str2 == null) {
            str2 = af.g.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            y0 y0Var = this.c;
            if (!TextUtils.equals(y0Var.g, str2)) {
                y0Var.b();
                y0Var.q(str2, true, true);
            }
        }
        if (b1Var.b0 != null) {
            str = af.g.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            y0 y0Var2 = this.d;
            if (!TextUtils.equals(y0Var2.g, str)) {
                y0Var2.b();
                y0Var2.q(str, true, true);
            }
        }
        int i11 = g6.sj;
        c6 c6Var = b1Var.x;
        this.F.setColor(i0.b.d(h7.n.a((((a2 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), g6.v0(i11, c6Var), g6.v0(g6.tj, c6Var)));
    }

    public float getValue() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.v) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), this.y);
        }
        boolean z10 = this.w;
        Paint paint = this.F;
        if (z10) {
            float d = this.e.d(this.f != null ? 1.0f : 0.0f, false);
            if (d < 1.0f) {
                if (this.N == null || this.O != ((int) rectF.width())) {
                    Matrix matrix = this.N;
                    if (matrix == null) {
                        this.N = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.N;
                    int width = (int) rectF.width();
                    this.O = width;
                    matrix2.postScale(width, 1.0f);
                    this.K.setLocalMatrix(this.N);
                }
                Paint paint2 = this.E;
                paint2.setAlpha((int) ((1.0f - d) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), paint2);
            }
            if (this.f != null && this.a < 1.0f && d > 0.0f) {
                Paint paint3 = this.B;
                paint3.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), this.C);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), this.D);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), this.A);
        }
        a(canvas);
        if (!this.H) {
            b(canvas, false);
        }
        if (this.a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), paint);
        a(canvas);
        if (!this.H) {
            b(canvas, true);
        }
        if (this.a < 1.0f) {
            canvas.restore();
        }
        if (this.H) {
            b(canvas, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int v02;
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
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
        boolean z11 = this.J;
        c6 c6Var = this.x;
        if (z11) {
            Drawable r02 = g6.r0();
            if (r02 instanceof ColorDrawable) {
                v02 = ((ColorDrawable) r02).getColor();
            } else {
                Pair pair = null;
                Bitmap bitmap = r02 instanceof nb0 ? ((nb0) r02).k : r02 instanceof BitmapDrawable ? ((BitmapDrawable) r02).getBitmap() : null;
                if (bitmap != null) {
                    float f10 = iArr[0] / AndroidUtilities.displaySize.x;
                    int width = (int) (f10 * bitmap.getWidth());
                    int measuredWidth = (int) (((getMeasuredWidth() + r13) / AndroidUtilities.displaySize.x) * bitmap.getWidth());
                    int currentActionBarHeight = (int) ((((iArr[1] - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight()) / AndroidUtilities.displaySize.y) * bitmap.getHeight());
                    if (width >= 0 && width < bitmap.getWidth() && measuredWidth >= 0 && measuredWidth < bitmap.getWidth() && currentActionBarHeight >= 0 && currentActionBarHeight < bitmap.getHeight()) {
                        pair = new Pair(Integer.valueOf(bitmap.getPixel(width, currentActionBarHeight)), Integer.valueOf(bitmap.getPixel(measuredWidth, currentActionBarHeight)));
                    }
                }
                if (pair != null) {
                    v02 = ((Integer) pair.first).intValue();
                    i14 = ((Integer) pair.second).intValue();
                    if (this.K == null && this.L == v02 && this.M == i14) {
                        return;
                    }
                    this.L = v02;
                    this.M = i14;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.K = linearGradient;
                    this.E.setShader(linearGradient);
                }
                v02 = g6.l1(0.25f, g6.v0(g6.d6, c6Var));
            }
        } else {
            v02 = g6.v0(g6.d6, c6Var);
            if (!g6.I.q()) {
                v02 = g6.v(v02, g6.l1(0.18f, -16777216));
            }
        }
        i14 = v02;
        if (this.K == null) {
        }
        this.L = v02;
        this.M = i14;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.K = linearGradient2;
        this.E.setShader(linearGradient2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.v) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        boolean z10 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256);
        if (this.w && this.f == null && !this.Q && z10) {
            this.R.run();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.W = true;
            this.T = x8;
            this.U = this.a;
            this.V = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i10 = 0;
            if (action == 1) {
                this.W = false;
                if (System.currentTimeMillis() - this.V < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x8 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.I != null) {
                        while (true) {
                            float[] fArr = this.I;
                            if (i10 >= fArr.length) {
                                break;
                            }
                            if (Math.abs(paddingLeft - fArr[i10]) < 0.1f) {
                                paddingLeft = this.I[i10];
                                break;
                            }
                            i10++;
                        }
                    }
                    Utilities.Callback2 callback2 = this.b;
                    if (callback2 != null) {
                        callback2.run(Float.valueOf(paddingLeft), Boolean.TRUE);
                        return true;
                    }
                }
            }
            float max = ((x8 - this.T) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.U;
            if (this.I != null) {
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.I;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    if (Math.abs(max - fArr2[i11]) < 0.05f) {
                        max = this.I[i11];
                        break;
                    }
                    i11++;
                }
            }
            boolean z10 = !this.W;
            c(max, false);
            Utilities.Callback2 callback22 = this.b;
            if (callback22 != null) {
                callback22.run(Float.valueOf(this.a), Boolean.valueOf(z10));
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Paint paint = this.A;
        paint.setColor(i10);
        boolean z10 = AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f;
        this.H = z10;
        this.c.r(z10 ? -1 : -16777216);
        this.d.r(this.H ? -1 : -16777216);
    }

    public void setDrawBlur(boolean z10) {
        this.w = z10;
        invalidate();
    }

    public void setDrawShadow(boolean z10) {
        this.v = z10;
        int dp = z10 ? AndroidUtilities.dp(8.0f) : 0;
        setPadding(dp, dp, dp, dp);
        invalidate();
    }

    public void setOnValueChange(Utilities.Callback2<Float, Boolean> callback2) {
        this.b = callback2;
    }

    public void setRoundRadiusDp(float f10) {
        this.s = f10;
        invalidate();
    }

    public void setStops(float[] fArr) {
        this.I = fArr;
    }

    public void setTextColor(int i10) {
        this.c.r(i10);
        this.d.r(i10);
    }
}
