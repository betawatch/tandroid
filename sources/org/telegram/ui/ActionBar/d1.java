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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class d1 extends FrameLayout {
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public boolean I;
    public float[] J;
    public boolean K;
    public LinearGradient L;
    public int M;
    public int N;
    public Matrix O;
    public int P;
    public ValueAnimator Q;
    public boolean R;
    public final p S;
    public PorterDuffColorFilter T;
    public float U;
    public float V;
    public long W;
    public float a;
    public boolean a0;
    public Utilities.Callback2 b;
    public final z0 c;
    public final z0 d;
    public final org.telegram.ui.Components.z5 e;
    public Bitmap f;
    public BitmapShader h;
    public Matrix n;
    public final int[] r;
    public float s;
    public boolean v;
    public boolean w;
    public final f6 x;
    public final Paint y;

    public d1(Context context, f6 f6Var) {
        super(context);
        this.a = 0.5f;
        mr mrVar = mr.h;
        this.e = new org.telegram.ui.Components.z5(1.0f, this, 0L, 320L, mrVar);
        this.r = new int[2];
        this.s = 0.0f;
        Paint paint = new Paint(1);
        this.y = paint;
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new Paint(1);
        Paint paint3 = new Paint(1);
        this.D = paint3;
        Paint paint4 = new Paint(1);
        this.E = paint4;
        Paint paint5 = new Paint(1);
        this.F = paint5;
        this.G = new Paint(1);
        Paint paint6 = new Paint(1);
        this.H = paint6;
        this.K = true;
        this.R = false;
        this.S = new p(this, 3);
        this.x = f6Var;
        setWillNotDraw(false);
        z0 z0Var = new z0(this, 0);
        this.c = z0Var;
        z0Var.setCallback(this);
        z0Var.u(AndroidUtilities.bold());
        z0Var.k(0.3f, 165L, mrVar);
        z0Var.t(AndroidUtilities.dpf2(14.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = z0Var.a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        z0Var.b = LocaleController.isRTL ? 5 : 3;
        z0 z0Var2 = new z0(this, 1);
        this.d = z0Var2;
        z0Var2.setCallback(this);
        z0Var2.u(AndroidUtilities.bold());
        z0Var2.k(0.3f, 165L, mrVar);
        z0Var2.t(AndroidUtilities.dpf2(14.0f));
        TextPaint textPaint2 = z0Var2.a;
        textPaint2.setStyle(style);
        textPaint2.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
        z0Var2.b = LocaleController.isRTL ? 3 : 5;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dpf2(1.33f), 0.0f, AndroidUtilities.dpf2(0.33f), 1056964608);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, -0.4f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.1f);
        paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint2.setColor(j6.v0(j6.G8, f6Var));
        boolean z4 = AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f;
        this.I = z4;
        z0Var.r(z4 ? -1 : -16777216);
        z0Var2.r(this.I ? -1 : -16777216);
        paint4.setColor(j6.l1(0.025f, -16777216));
        paint3.setColor(j6.l1(0.35f, -1));
        paint6.setColor(j6.l1(0.2f, -1));
    }

    public final void a(Canvas canvas) {
        if (this.J == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.J;
            if (i10 >= fArr.length) {
                return;
            }
            float f10 = fArr[i10];
            RectF rectF = AndroidUtilities.rectTmp;
            canvas.drawRect((rectF.width() * f10) + rectF.left, rectF.top, (rectF.width() * f10) + rectF.left + AndroidUtilities.dp(0.66f), rectF.bottom, this.H);
            i10++;
        }
    }

    public final void b(Canvas canvas, boolean z4) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = null;
        if (z4) {
            porterDuffColorFilter = this.T;
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                this.T = porterDuffColorFilter;
            }
        } else {
            porterDuffColorFilter = null;
        }
        z0 z0Var = this.c;
        z0Var.setColorFilter(porterDuffColorFilter);
        z0Var.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var.draw(canvas);
        if (z4 && (porterDuffColorFilter2 = this.T) == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
            this.T = porterDuffColorFilter2;
        }
        z0 z0Var2 = this.d;
        z0Var2.setColorFilter(porterDuffColorFilter2);
        z0Var2.setBounds(AndroidUtilities.dp(20.0f) + getPaddingLeft(), getMeasuredHeight() / 2, (getMeasuredWidth() - getPaddingRight()) - AndroidUtilities.dp(20.0f), getMeasuredHeight() / 2);
        z0Var2.draw(canvas);
    }

    public final void c(float f10, boolean z4) {
        ValueAnimator valueAnimator = this.Q;
        String str = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        float a2 = k7.n.a(f10, 0.0f, 1.0f);
        if (z4) {
            int i10 = 0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, a2);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new x0(this, i10));
            this.Q.addListener(new a1(this, a2, i10));
            this.Q.setInterpolator(mr.h);
            this.Q.setDuration(220L);
            this.Q.start();
        } else {
            this.a = a2;
            invalidate();
        }
        c1 c1Var = (c1) this;
        String str2 = c1Var.c0;
        if (str2 == null) {
            str2 = df.f.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str2 != null) {
            z0 z0Var = this.c;
            if (!TextUtils.equals(z0Var.g, str2)) {
                z0Var.b();
                z0Var.q(str2, true, true);
            }
        }
        if (c1Var.c0 != null) {
            str = df.f.a((a2 * 2.8f) + 0.2f) + "x";
        }
        if (str != null) {
            z0 z0Var2 = this.d;
            if (!TextUtils.equals(z0Var2.g, str)) {
                z0Var2.b();
                z0Var2.q(str, true, true);
            }
        }
        int i11 = j6.sj;
        f6 f6Var = c1Var.x;
        this.G.setColor(i0.a.d(k7.n.a((((a2 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), j6.v0(i11, f6Var), j6.v0(j6.tj, f6Var)));
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
        boolean z4 = this.w;
        Paint paint = this.G;
        if (z4) {
            float d = this.e.d(this.f != null ? 1.0f : 0.0f, false);
            if (d < 1.0f) {
                if (this.O == null || this.P != ((int) rectF.width())) {
                    Matrix matrix = this.O;
                    if (matrix == null) {
                        this.O = new Matrix();
                    } else {
                        matrix.reset();
                    }
                    Matrix matrix2 = this.O;
                    int width = (int) rectF.width();
                    this.P = width;
                    matrix2.postScale(width, 1.0f);
                    this.L.setLocalMatrix(this.O);
                }
                Paint paint2 = this.F;
                paint2.setAlpha((int) ((1.0f - d) * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), paint2);
            }
            if (this.f != null && this.a < 1.0f && d > 0.0f) {
                Paint paint3 = this.C;
                paint3.setAlpha((int) (d * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), paint3);
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), this.D);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), this.E);
            paint.setColor(-1);
        } else {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), this.B);
        }
        a(canvas);
        if (!this.I) {
            b(canvas, false);
        }
        if (this.a < 1.0f) {
            canvas.save();
            canvas.clipRect(getPaddingLeft(), getPaddingTop(), (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.a) + getPaddingLeft(), getHeight() - getPaddingBottom());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(this.s), AndroidUtilities.dp(this.s), paint);
        a(canvas);
        if (!this.I) {
            b(canvas, true);
        }
        if (this.a < 1.0f) {
            canvas.restore();
        }
        if (this.I) {
            b(canvas, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int v02;
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
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
        boolean z10 = this.K;
        f6 f6Var = this.x;
        if (z10) {
            Drawable r02 = j6.r0();
            if (r02 instanceof ColorDrawable) {
                v02 = ((ColorDrawable) r02).getColor();
            } else {
                Pair pair = null;
                Bitmap bitmap = r02 instanceof ec0 ? ((ec0) r02).k : r02 instanceof BitmapDrawable ? ((BitmapDrawable) r02).getBitmap() : null;
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
                    if (this.L == null && this.M == v02 && this.N == i14) {
                        return;
                    }
                    this.M = v02;
                    this.N = i14;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.L = linearGradient;
                    this.F.setShader(linearGradient);
                }
                v02 = j6.l1(0.25f, j6.v0(j6.d6, f6Var));
            }
        } else {
            v02 = j6.v0(j6.d6, f6Var);
            if (!j6.I.q()) {
                v02 = j6.v(v02, j6.l1(0.18f, -16777216));
            }
        }
        i14 = v02;
        if (this.L == null) {
        }
        this.M = v02;
        this.N = i14;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{v02, i14}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.L = linearGradient2;
        this.F.setShader(linearGradient2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.v) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingLeft() + getPaddingRight() + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        boolean z4 = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(256);
        if (this.w && this.f == null && !this.R && z4) {
            this.S.run();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX() - getPaddingLeft();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a0 = true;
            this.U = x10;
            this.V = this.a;
            this.W = System.currentTimeMillis();
            return true;
        }
        if (action == 2 || action == 1) {
            int i10 = 0;
            if (action == 1) {
                this.a0 = false;
                if (System.currentTimeMillis() - this.W < ViewConfiguration.getTapTimeout()) {
                    float paddingLeft = (x10 - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
                    if (this.J != null) {
                        while (true) {
                            float[] fArr = this.J;
                            if (i10 >= fArr.length) {
                                break;
                            }
                            if (Math.abs(paddingLeft - fArr[i10]) < 0.1f) {
                                paddingLeft = this.J[i10];
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
            float max = ((x10 - this.U) / Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight())) + this.V;
            if (this.J != null) {
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.J;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    if (Math.abs(max - fArr2[i11]) < 0.05f) {
                        max = this.J[i11];
                        break;
                    }
                    i11++;
                }
            }
            boolean z4 = !this.a0;
            c(max, false);
            Utilities.Callback2 callback22 = this.b;
            if (callback22 != null) {
                callback22.run(Float.valueOf(this.a), Boolean.valueOf(z4));
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Paint paint = this.B;
        paint.setColor(i10);
        boolean z4 = AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f;
        this.I = z4;
        this.c.r(z4 ? -1 : -16777216);
        this.d.r(this.I ? -1 : -16777216);
    }

    public void setDrawBlur(boolean z4) {
        this.w = z4;
        invalidate();
    }

    public void setDrawShadow(boolean z4) {
        this.v = z4;
        int dp = z4 ? AndroidUtilities.dp(8.0f) : 0;
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
        this.J = fArr;
    }

    public void setTextColor(int i10) {
        this.c.r(i10);
        this.d.r(i10);
    }
}
