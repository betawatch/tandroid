package lh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class bb extends View {
    public final Matrix B;
    public boolean C;
    public final Drawable D;
    public final org.telegram.ui.Components.j6 E;
    public final org.telegram.ui.Components.j6 F;
    public final lq[] G;
    public final Paint H;
    public final k01 I;
    public final org.telegram.ui.Components.z5 J;
    public final org.telegram.ui.Components.z5 K;
    public boolean L;
    public long M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final Path R;
    public final Path S;
    public final Path T;
    public final RectF U;
    public final Path V;
    public float W;
    public final org.telegram.ui.ActionBar.f6 a;
    public float a0;
    public final Paint b;
    public int[] b0;
    public final Paint c;
    public final xd.a c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public float e0;
    public final Paint f;
    public long f0;
    public int g0;
    public final wa h;
    public boolean h0;
    public ValueAnimator i0;
    public final wa n;
    public int r;
    public int s;
    public ValueAnimator v;
    public int w;
    public int x;
    public LinearGradient y;

    public bb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new wa(0, 300);
        this.n = new wa(2, 30);
        this.r = -1135603;
        this.s = -404714;
        this.w = -1135603;
        this.x = -404714;
        this.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.B = new Matrix();
        this.C = true;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.E = j6Var;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, true, false);
        this.F = j6Var2;
        this.G = new lq[1];
        Paint paint = new Paint(1);
        this.H = paint;
        this.I = new k01(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        mr mrVar = mr.h;
        this.J = new org.telegram.ui.Components.z5(this, 0L, 320L, mrVar);
        this.K = new org.telegram.ui.Components.z5(this, 0L, 320L, mrVar);
        this.M = -1L;
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new Path();
        this.S = new Path();
        this.T = new Path();
        this.U = new RectF();
        this.V = new Path();
        this.W = 0.0f;
        this.c0 = new xd.a(this, mrVar, 320L);
        this.a = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.D = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.t(AndroidUtilities.dp(21.0f));
        j6Var.setCallback(this);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.b = 17;
        j6Var2.r(-570425345);
        j6Var2.t(AndroidUtilities.dp(11.0f));
        j6Var2.setCallback(this);
        j6Var2.G = AndroidUtilities.displaySize.x;
        j6Var2.b = 17;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, f10);
        this.i0 = ofFloat;
        ofFloat.addUpdateListener(new dg.o1(this, 17));
        int value = getValue();
        this.i0.addListener(new ab(this, f10, value));
        this.i0.setDuration(320L);
        this.i0.setInterpolator(mr.h);
        this.i0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.j6 j6Var = this.E;
        j6Var.b();
        j6Var.q(ja.V0(false, LocaleController.formatNumber(c(f10), ','), this.G), true, true);
    }

    public final float b(int i10) {
        int i11 = 1;
        while (true) {
            int[] iArr = this.b0;
            if (i11 >= iArr.length) {
                return 1.0f;
            }
            if (i10 <= iArr[i11]) {
                int i12 = i11 - 1;
                int i13 = iArr[i12];
                return (i12 + ((i10 - i13) / (r3 - i13))) / (iArr.length - 1);
            }
            i11++;
        }
    }

    public final int c(float f10) {
        if (f10 <= 0.0f) {
            return this.b0[0];
        }
        if (f10 >= 1.0f) {
            return this.b0[r7.length - 1];
        }
        int[] iArr = this.b0;
        float length = f10 * (iArr.length - 1);
        int i10 = (int) length;
        float f11 = length - i10;
        float f12 = iArr[i10];
        int i11 = i10 + 1;
        if (i11 < iArr.length) {
            i10 = i11;
        }
        return Math.round((f11 * (iArr[i10] - r2)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.z5 z5Var;
        RectF rectF;
        Paint paint;
        float f10;
        int i10;
        Path.Direction direction;
        Paint paint2;
        org.telegram.ui.Components.z5 z5Var2;
        Canvas canvas2;
        int i11;
        float f11;
        super.dispatchDraw(canvas);
        Matrix matrix = this.B;
        matrix.reset();
        RectF rectF2 = this.N;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.y;
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.W, this.r, this.s);
        Path path = this.R;
        path.rewind();
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(12.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF2, dp, dp2, direction2);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, this.r);
        Paint paint4 = this.b;
        paint4.setColor(l1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.O;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path2 = this.S;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        wa waVar = this.h;
        waVar.g(rectF2);
        float f12 = this.W;
        waVar.h = (f12 * 15.0f) + 1.0f;
        waVar.j = (int) (waVar.b.size() * ((f12 * 0.85f) + 0.15f));
        waVar.d();
        canvas.save();
        canvas.clipPath(path);
        waVar.a(canvas, d);
        long j10 = this.M;
        org.telegram.ui.Components.z5 z5Var3 = this.K;
        org.telegram.ui.Components.z5 z5Var4 = this.J;
        k01 k01Var = this.I;
        Paint paint5 = this.H;
        if (j10 == -1 || b((int) j10) >= 1.0f || b((int) this.M) <= 0.0f) {
            z5Var = z5Var3;
            rectF = rectF3;
            paint = paint4;
            f10 = b10;
            i10 = d;
            direction = direction2;
            paint2 = paint5;
            z5Var2 = z5Var4;
            canvas2 = canvas;
        } else {
            float clamp01 = (Utilities.clamp01(b((int) this.M)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            float e = z5Var4.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - clamp01) < ((float) AndroidUtilities.dp(14.0f)));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), z5Var3.e(Math.abs((rectF3.right - ((float) AndroidUtilities.dp(10.0f))) - clamp01) < ((float) AndroidUtilities.dp(12.0f))));
            float f13 = (clamp01 + k01Var.c) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (clamp01 - lerp) - k01Var.c : clamp01 + lerp;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.j6.l1(0.6f, d));
            z5Var = z5Var3;
            paint = paint4;
            rectF = rectF3;
            f10 = b10;
            i10 = d;
            z5Var2 = z5Var4;
            canvas.drawLine(clamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e), clamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e), paint5);
            direction = direction2;
            paint2 = paint5;
            this.I.c(f13, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        waVar.a(canvas2, -1);
        long j11 = this.M;
        if (j11 == -1 || b((int) j11) >= 1.0f || b((int) this.M) <= 0.0f) {
            i11 = i10;
        } else {
            float dp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.M)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            float e6 = z5Var2.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - dp3) < ((float) AndroidUtilities.dp(14.0f)));
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), z5Var.e(Math.abs((rectF.right - ((float) AndroidUtilities.dp(10.0f))) - dp3) < ((float) AndroidUtilities.dp(12.0f))));
            float f14 = (k01Var.c + dp3) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF2.right ? (dp3 - lerp2) - k01Var.c : lerp2 + dp3;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, this.a)));
            i11 = i10;
            canvas2.drawLine(dp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e6), dp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e6), paint2);
            this.I.c(f14, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        }
        canvas2.restore();
        invalidate();
        if (this.L) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d10 = i0.a.d(0.5f, paint.getColor(), this.s);
            Paint paint6 = this.d;
            paint6.setColor(d10);
            Path path3 = this.T;
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
        RectF rectF4 = this.P;
        rectF4.set(dp4, centerY2, dp5, dp6);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.e);
        float dp7 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f15 = f10;
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f15), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f15), Math.min(Utilities.clamp01(f15 / dp7), Utilities.clamp01((1.0f - f15) / dp7)));
        org.telegram.ui.Components.j6 j6Var = this.F;
        float d11 = j6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.j6 j6Var2 = this.E;
        float max = Math.max(d11, j6Var2.d() + AndroidUtilities.dp(50.0f));
        float dp8 = AndroidUtilities.dp(44.0f);
        float clamp = Utilities.clamp(lerp3 - (max / 2.0f), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp9 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.U;
        rectF5.set(clamp, (rectF2.top - AndroidUtilities.dp(21.0f)) - dp8, max + clamp, dp9);
        float height2 = rectF5.height();
        float f16 = height2 / 2.0f;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.W - this.a0, 1.0f, -1.0f) * 60.0f;
        float dp10 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.V;
        path4.rewind();
        float f17 = rectF5.left;
        float f18 = rectF5.top;
        RectF rectF6 = this.Q;
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
        wa waVar2 = this.n;
        waVar2.g(rectF7);
        waVar2.h = (this.W * 15.0f) + 1.0f;
        waVar2.d();
        canvas2.save();
        waVar2.a(canvas2, i11);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp10);
        if (Math.abs(this.W - this.a0) > 0.001f) {
            this.a0 = AndroidUtilities.lerp(this.a0, this.W, 0.1f);
            invalidate();
        }
        this.f.setShader(this.y);
        canvas2.drawPath(path4, this.f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-clamp5, clamp2, dp10);
        waVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f26 = 1.0f - (this.c0.e * 0.15f);
        canvas2.scale(f26, f26, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.D.setBounds((int) ((rectF5.centerX() - (j6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (j6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.C) {
            this.D.draw(canvas2);
        }
        j6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        j6Var2.draw(canvas2);
        canvas2.restore();
        j6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        j6Var.w = (int) (this.c0.e * 255.0f);
        j6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d0 = motionEvent.getX();
            this.e0 = motionEvent.getY();
            this.g0 = motionEvent.getPointerId(0);
            this.f0 = System.currentTimeMillis();
            this.h0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
            float x10 = motionEvent.getX() - this.d0;
            float y10 = motionEvent.getY() - this.e0;
            if (!this.h0 && Math.abs(x10) > Math.abs(y10 * 1.5f) && Math.abs(x10) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.h0 = true;
                ValueAnimator valueAnimator = this.i0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.h0) {
                int value = getValue();
                this.W = Utilities.clamp01((x10 / (getWidth() * 1.0f)) + this.W);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.j6 j6Var = this.E;
                    j6Var.b();
                    j6Var.q(ja.V0(false, LocaleController.formatNumber(getValue(), ','), this.G), true, true);
                }
                this.d0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.h0 && motionEvent.getPointerId(0) == this.g0 && k7.n6.a(this.d0, this.e0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && System.currentTimeMillis() - this.f0 <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.N;
                    float clamp01 = Utilities.clamp01((x12 - rectF.left) / rectF.width());
                    long j10 = this.M;
                    if (j10 > 0 && Math.abs(b((int) j10) - clamp01) < 0.035f) {
                        clamp01 = Utilities.clamp01(b((int) this.M));
                    }
                    a(clamp01);
                }
            }
            this.h0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z4) {
        if (this.w == i10 && this.x == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (!z4) {
            this.w = i10;
            this.r = i10;
            this.x = i11;
            this.s = i11;
            this.y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
            return;
        }
        int i12 = this.r;
        int i13 = this.s;
        this.w = i10;
        this.x = i11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ya(this, i12, i10, i13, i11, 0));
        this.v.addListener(new za(this, i12, i10, i13, i11));
        this.v.setInterpolator(mr.h);
        this.v.setDuration(420L);
        this.v.start();
    }

    public final void g(String str) {
        this.c0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.j6 j6Var = this.F;
        j6Var.b();
        j6Var.q(str, true, true);
    }

    public float getProgress() {
        return this.W;
    }

    public int getValue() {
        return c(this.W);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        this.N.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(135.0f), measuredWidth - r5, AndroidUtilities.dp(24.0f) + r0);
        this.c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.M = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.I.r(str);
    }

    public void setValue(int i10) {
        float b10 = b(i10);
        this.W = b10;
        this.a0 = b10;
        org.telegram.ui.Components.j6 j6Var = this.E;
        j6Var.b();
        j6Var.q(ja.V0(false, LocaleController.formatNumber(getValue(), ','), this.G), true, true);
    }

    public void setValueAnimated(int i10) {
        if (i10 == getValue()) {
            return;
        }
        a(b(i10));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }
}
