package gh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class gb extends View {
    public final Matrix A;
    public boolean B;
    public final Drawable C;
    public final org.telegram.ui.Components.i6 D;
    public final org.telegram.ui.Components.i6 E;
    public final eq[] F;
    public final Paint G;
    public final nz0 H;
    public final org.telegram.ui.Components.y5 I;
    public final org.telegram.ui.Components.y5 J;
    public boolean K;
    public long L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final Path Q;
    public final Path R;
    public final Path S;
    public final RectF T;
    public final Path U;
    public float V;
    public float W;
    public final org.telegram.ui.ActionBar.b6 a;
    public int[] a0;
    public final Paint b;
    public final td.a b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public long e0;
    public final Paint f;
    public int f0;
    public boolean g0;
    public final bb h;
    public ValueAnimator h0;
    public final bb n;
    public int r;
    public int s;
    public ValueAnimator v;
    public int w;
    public int x;
    public LinearGradient y;

    public gb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new bb(0, 300);
        this.n = new bb(2, 30);
        this.r = -1135603;
        this.s = -404714;
        this.w = -1135603;
        this.x = -404714;
        this.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = new Matrix();
        this.B = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.D = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
        this.E = i6Var2;
        this.F = new eq[1];
        Paint paint = new Paint(1);
        this.G = paint;
        this.H = new nz0(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        gr grVar = gr.h;
        this.I = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.J = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.L = -1L;
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new Path();
        this.R = new Path();
        this.S = new Path();
        this.T = new RectF();
        this.U = new Path();
        this.V = 0.0f;
        this.b0 = new td.a(this, grVar, 320L);
        this.a = b6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.C = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.t(AndroidUtilities.dp(21.0f));
        i6Var.setCallback(this);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.b = 17;
        i6Var2.r(-570425345);
        i6Var2.t(AndroidUtilities.dp(11.0f));
        i6Var2.setCallback(this);
        i6Var2.G = AndroidUtilities.displaySize.x;
        i6Var2.b = 17;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, f10);
        this.h0 = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 8));
        int value = getValue();
        this.h0.addListener(new fb(this, f10, value));
        this.h0.setDuration(320L);
        this.h0.setInterpolator(gr.h);
        this.h0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.b();
        i6Var.q(oa.V0(false, LocaleController.formatNumber(c(f10), ','), this.F), true, true);
    }

    public final float b(int i9) {
        int i10 = 1;
        while (true) {
            int[] iArr = this.a0;
            if (i10 >= iArr.length) {
                return 1.0f;
            }
            if (i9 <= iArr[i10]) {
                int i11 = i10 - 1;
                int i12 = iArr[i11];
                return (i11 + ((i9 - i12) / (r3 - i12))) / (iArr.length - 1);
            }
            i10++;
        }
    }

    public final int c(float f10) {
        if (f10 <= 0.0f) {
            return this.a0[0];
        }
        if (f10 >= 1.0f) {
            return this.a0[r7.length - 1];
        }
        int[] iArr = this.a0;
        float length = f10 * (iArr.length - 1);
        int i9 = (int) length;
        float f11 = length - i9;
        float f12 = iArr[i9];
        int i10 = i9 + 1;
        if (i10 < iArr.length) {
            i9 = i10;
        }
        return Math.round((f11 * (iArr[i9] - r2)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.y5 y5Var;
        RectF rectF;
        Paint paint;
        float f10;
        int i9;
        Path.Direction direction;
        Paint paint2;
        org.telegram.ui.Components.y5 y5Var2;
        Canvas canvas2;
        int i10;
        float f11;
        super.dispatchDraw(canvas);
        Matrix matrix = this.A;
        matrix.reset();
        RectF rectF2 = this.M;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.y;
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.V, this.r, this.s);
        Path path = this.Q;
        path.rewind();
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(12.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF2, dp, dp2, direction2);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, this.r);
        Paint paint4 = this.b;
        paint4.setColor(l1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.N;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path2 = this.R;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        bb bbVar = this.h;
        bbVar.g(rectF2);
        float f12 = this.V;
        bbVar.h = (f12 * 15.0f) + 1.0f;
        bbVar.j = (int) (bbVar.b.size() * ((f12 * 0.85f) + 0.15f));
        bbVar.d();
        canvas.save();
        canvas.clipPath(path);
        bbVar.a(canvas, d);
        long j10 = this.L;
        org.telegram.ui.Components.y5 y5Var3 = this.J;
        org.telegram.ui.Components.y5 y5Var4 = this.I;
        nz0 nz0Var = this.H;
        Paint paint5 = this.G;
        if (j10 == -1 || b((int) j10) >= 1.0f || b((int) this.L) <= 0.0f) {
            y5Var = y5Var3;
            rectF = rectF3;
            paint = paint4;
            f10 = b10;
            i9 = d;
            direction = direction2;
            paint2 = paint5;
            y5Var2 = y5Var4;
            canvas2 = canvas;
        } else {
            float clamp01 = (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            float e10 = y5Var4.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - clamp01) < ((float) AndroidUtilities.dp(14.0f)));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), y5Var3.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - clamp01) < ((float) AndroidUtilities.dp(12.0f))));
            float f13 = (clamp01 + nz0Var.c) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (clamp01 - lerp) - nz0Var.c : clamp01 + lerp;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.f6.l1(0.6f, d));
            y5Var = y5Var3;
            paint = paint4;
            rectF = rectF3;
            f10 = b10;
            i9 = d;
            y5Var2 = y5Var4;
            canvas.drawLine(clamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e10), clamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e10), paint5);
            direction = direction2;
            paint2 = paint5;
            this.H.c(f13, rectF2.centerY(), 0.6f, i9, canvas);
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        bbVar.a(canvas2, -1);
        long j11 = this.L;
        if (j11 == -1 || b((int) j11) >= 1.0f || b((int) this.L) <= 0.0f) {
            i10 = i9;
        } else {
            float dp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.L)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            float e11 = y5Var2.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - dp3) < ((float) AndroidUtilities.dp(14.0f)));
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), y5Var.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - dp3) < ((float) AndroidUtilities.dp(12.0f))));
            float f14 = (nz0Var.c + dp3) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (dp3 - lerp2) - nz0Var.c : lerp2 + dp3;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.f6.l1(0.4f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, this.a)));
            i10 = i9;
            canvas2.drawLine(dp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e11), dp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e11), paint2);
            this.H.c(f14, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        }
        canvas2.restore();
        invalidate();
        if (this.K) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d9 = i0.a.d(0.5f, paint.getColor(), this.s);
            Paint paint6 = this.d;
            paint6.setColor(d9);
            Path path3 = this.S;
            path3.rewind();
            f11 = 0.5f;
            Path.Direction direction3 = direction;
            path3.addRoundRect(height - AndroidUtilities.dp(1.0f), centerY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + height, centerY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            path3.addRoundRect(height - AndroidUtilities.dp(6.0f), centerY - AndroidUtilities.dp(1.0f), height + AndroidUtilities.dp(6.0f), centerY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            canvas2.drawPath(path3, paint6);
        } else {
            f11 = 0.5f;
        }
        float dp4 = (rectF.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f);
        float centerY2 = rectF.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f);
        float dp5 = rectF.right - AndroidUtilities.dp(4.0f);
        float dp6 = (AndroidUtilities.dp(16.0f) / 2.0f) + rectF.centerY();
        RectF rectF4 = this.O;
        rectF4.set(dp4, centerY2, dp5, dp6);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.e);
        float dp7 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f15 = f10;
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f15), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f15), Math.min(Utilities.clamp01(f15 / dp7), Utilities.clamp01((1.0f - f15) / dp7)));
        org.telegram.ui.Components.i6 i6Var = this.E;
        float d10 = i6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.i6 i6Var2 = this.D;
        float max = Math.max(d10, i6Var2.d() + AndroidUtilities.dp(50.0f));
        float dp8 = AndroidUtilities.dp(44.0f);
        float clamp = Utilities.clamp(lerp3 - (max / 2.0f), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp9 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.T;
        rectF5.set(clamp, (rectF2.top - AndroidUtilities.dp(21.0f)) - dp8, max + clamp, dp9);
        float height2 = rectF5.height();
        float f16 = height2 / 2.0f;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.V - this.W, 1.0f, -1.0f) * 60.0f;
        float dp10 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.U;
        path4.rewind();
        float f17 = rectF5.left;
        float f18 = rectF5.top;
        RectF rectF6 = this.P;
        rectF6.set(f17, f18, f17 + height2, f18 + height2);
        path4.arcTo(rectF6, -180.0f, 90.0f);
        float f19 = rectF5.right;
        float f20 = rectF5.top;
        rectF6.set(f19 - height2, f20, f19, f20 + height2);
        path4.arcTo(rectF6, -90.0f, 90.0f);
        float f21 = rectF5.right;
        float f22 = rectF5.bottom;
        rectF6.set(f21 - height2, f22 - height2, f21, f22);
        path4.arcTo(rectF6, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp4 - rectF6.centerX()) / f16)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
        float f23 = 0.7f * height2;
        if (clamp3 < rectF5.right - f23) {
            path4.lineTo(clamp4, rectF5.bottom);
            path4.lineTo(clamp2 + 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
        }
        path4.lineTo(clamp2, rectF5.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
        if (clamp4 > rectF5.left + f23) {
            path4.lineTo(clamp2 - 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
            path4.lineTo(clamp3, rectF5.bottom);
        }
        float f24 = rectF5.left;
        float f25 = rectF5.bottom;
        rectF6.set(f24, f25 - height2, f24 + height2, f25);
        float clamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp3 - rectF6.left) / f16)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
        path4.arcTo(rectF6, clamp6, 180.0f - clamp6);
        path4.lineTo(rectF5.left, rectF5.bottom);
        path4.close();
        RectF rectF7 = AndroidUtilities.rectTmp;
        rectF7.set(rectF5);
        rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
        bb bbVar2 = this.n;
        bbVar2.g(rectF7);
        bbVar2.h = (this.V * 15.0f) + 1.0f;
        bbVar2.d();
        canvas2.save();
        bbVar2.a(canvas2, i10);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp10);
        if (Math.abs(this.V - this.W) > 0.001f) {
            this.W = AndroidUtilities.lerp(this.W, this.V, 0.1f);
            invalidate();
        }
        this.f.setShader(this.y);
        canvas2.drawPath(path4, this.f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-clamp5, clamp2, dp10);
        bbVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f26 = 1.0f - (this.b0.e * 0.15f);
        canvas2.scale(f26, f26, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.C.setBounds((int) ((rectF5.centerX() - (i6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (i6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.B) {
            this.C.draw(canvas2);
        }
        i6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        i6Var2.draw(canvas2);
        canvas2.restore();
        i6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        i6Var.w = (int) (this.b0.e * 255.0f);
        i6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.c0 = motionEvent.getX();
            this.d0 = motionEvent.getY();
            this.f0 = motionEvent.getPointerId(0);
            this.e0 = System.currentTimeMillis();
            this.g0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f0) {
            float x10 = motionEvent.getX() - this.c0;
            float y10 = motionEvent.getY() - this.d0;
            if (!this.g0 && Math.abs(x10) > Math.abs(y10 * 1.5f) && Math.abs(x10) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.g0 = true;
                ValueAnimator valueAnimator = this.h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.g0) {
                int value = getValue();
                this.V = Utilities.clamp01((x10 / (getWidth() * 1.0f)) + this.V);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.i6 i6Var = this.D;
                    i6Var.b();
                    i6Var.q(oa.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
                }
                this.c0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.g0 && motionEvent.getPointerId(0) == this.f0 && g7.w.a(this.c0, this.d0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && System.currentTimeMillis() - this.e0 <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.M;
                    float clamp01 = Utilities.clamp01((x12 - rectF.left) / rectF.width());
                    long j10 = this.L;
                    if (j10 > 0 && Math.abs(b((int) j10) - clamp01) < 0.035f) {
                        clamp01 = Utilities.clamp01(b((int) this.L));
                    }
                    a(clamp01);
                }
            }
            this.g0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i9);

    public final void f(int i9, int i10, boolean z10) {
        if (this.w == i9 && this.x == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (!z10) {
            this.w = i9;
            this.r = i9;
            this.x = i10;
            this.s = i10;
            this.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
            return;
        }
        int i11 = this.r;
        int i12 = this.s;
        this.w = i9;
        this.x = i10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new db(this, i11, i9, i12, i10, 0));
        this.v.addListener(new eb(this, i11, i9, i12, i10));
        this.v.setInterpolator(gr.h);
        this.v.setDuration(420L);
        this.v.start();
    }

    public final void g(String str) {
        this.b0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.i6 i6Var = this.E;
        i6Var.b();
        i6Var.q(str, true, true);
    }

    public float getProgress() {
        return this.V;
    }

    public int getValue() {
        return c(this.V);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        this.M.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(135.0f), measuredWidth - r5, AndroidUtilities.dp(24.0f) + r0);
        this.c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.L = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.H.r(str);
    }

    public void setValue(int i9) {
        float b10 = b(i9);
        this.V = b10;
        this.W = b10;
        org.telegram.ui.Components.i6 i6Var = this.D;
        i6Var.b();
        i6Var.q(oa.V0(false, LocaleController.formatNumber(getValue(), ','), this.F), true, true);
    }

    public void setValueAnimated(int i9) {
        if (i9 == getValue()) {
            return;
        }
        a(b(i9));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.D || super.verifyDrawable(drawable);
    }
}
