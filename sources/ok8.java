// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ok8 extends FrameLayout implements ka6 {
    public final fe1 E;
    public boolean F;
    public final e29 G;
    public boolean H;
    public boolean I;
    public ey2 J;
    public boolean K;
    public boolean L;
    public final mm M;
    public final mm N;
    public di2 O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint a;
    public final boolean b;
    public final vnb c;
    public float d;
    public boolean e;
    public final mk8 f;
    public final mk8 h;
    public final int n;
    public boolean r;
    public float s;
    public final nk8 w;
    public ValueAnimator x;
    public final Path y;

    public ok8(int i, vnb vnbVar, Context context, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.K = true;
        this.M = new mm(this);
        this.N = new mm(this);
        this.P = 0.0f;
        this.n = i;
        fe1 fe1Var = new fe1();
        this.E = fe1Var;
        fe1Var.n = 1.2f;
        fe1Var.k = false;
        fe1Var.m = 4.0f;
        LinearLayout j = uh9.j(context, 0);
        mk8 mk8Var = new mk8(this, context, (byte) 0);
        this.f = mk8Var;
        mk8Var.b(0.35f, 350L, k43.h);
        mk8Var.setGravity(17);
        mk8Var.setTextColor(-1);
        mk8Var.setTextSize(hl.L(14.0f));
        mk8Var.setTypeface(hl.o());
        e29 e29Var = new e29(context);
        this.G = e29Var;
        e29Var.setColorFilter(-1);
        e29Var.setVisibility(8);
        nk8 nk8Var = new nk8(this, context);
        this.w = nk8Var;
        nk8Var.addView(j, tre.e(-2, -2, 17));
        int o = vm2.o(-1, jn7.E1);
        nk8Var.setBackground(aob.i0(i, i, i, i, 0, o, o));
        j.addView(mk8Var, tre.r(-2, -2, 16));
        j.addView(e29Var, tre.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(nk8Var);
        setOutlineProvider(yhc.b);
        byte b = 1;
        setClipToOutline(true);
        iye.b(this, 0.02f, 1.2f);
        if (z) {
            mk8 mk8Var2 = new mk8(this, context, b);
            this.h = mk8Var2;
            mk8Var2.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
            mk8Var2.setGravity(17);
            yob.U(mk8Var2, aob.Ji, vnbVar);
            mk8Var2.setTextSize(hl.L(14.0f));
            mk8Var2.setTypeface(hl.o());
            mk8Var2.getDrawable().K = true;
            int L = hl.L(8.0f);
            int o2 = vm2.o(-1, jn7.E1);
            mk8Var2.setBackground(aob.i0(L, L, L, L, 0, o2, o2));
            addView(mk8Var2);
            paint.setColor(aob.v0(aob.Fi, vnbVar));
            this.b = true;
            this.c = vnbVar;
            e();
        }
    }

    @Override // ka6
    public final boolean a() {
        return this.Q;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z) {
        if (!this.H && z) {
            z = true;
        }
        this.H = true;
        mk8 mk8Var = this.f;
        if (z && mk8Var.c.h()) {
            mk8Var.a();
        }
        mk8Var.c(str, z, true);
        nk8 nk8Var = this.w;
        nk8Var.setContentDescription(str);
        if (this.L) {
            return;
        }
        nk8Var.setOnClickListener(onClickListener);
    }

    public final void c(CharSequence charSequence, boolean z, boolean z2) {
        this.r = true;
        this.F = z;
        mk8 mk8Var = this.h;
        mk8Var.c(charSequence, z2, true);
        mk8Var.setContentDescription(charSequence);
        d(z2);
    }

    public final void d(boolean z) {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.x.cancel();
        }
        if (!z) {
            this.s = this.r ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.r ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new ce0(this, (byte) 10));
        this.x.addListener(new n88(this, (byte) 16));
        this.x.setDuration(250L);
        this.x.setInterpolator(k43.f);
        this.x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L;
        ey2 ey2Var = this.J;
        mk8 mk8Var = this.h;
        if (ey2Var != null) {
            dy2 dy2Var = ey2Var.a;
            if (dy2Var.h == 0) {
                L = 0;
            } else {
                L = hl.L(11.0f) + dy2Var.s;
            }
            float L2 = ((L * 0.85f) + hl.L(3.0f)) / 2.0f;
            mm mmVar = this.M;
            mmVar.e(false, L2);
            float e = (mk8Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + hl.L(3.0f);
            mm mmVar2 = this.N;
            mmVar2.e(false, e);
            mk8Var.setTranslationX(-mmVar.c);
            this.J.setTranslationX(mmVar2.c - mmVar.c);
        } else if (mk8Var != null) {
            mk8Var.setTranslationX(0.0f);
        }
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f = this.s;
        vnb vnbVar = this.c;
        boolean z = this.b;
        int i = this.n;
        Paint paint = this.a;
        if (f != 1.0f || !this.F) {
            boolean z2 = this.e;
            float f2 = this.d;
            if (z2) {
                float f3 = f2 + 0.016f;
                this.d = f3;
                if (f3 > 3.0f) {
                    this.e = false;
                }
            } else {
                float f4 = f2 - 0.016f;
                this.d = f4;
                if (f4 < 1.0f) {
                    this.e = true;
                }
            }
            if (this.K) {
                bl8.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f5 = i;
                canvas.drawRoundRect(rectF, f5, f5, bl8.d().e());
            } else {
                if (z) {
                    paint.setColor(aob.v0(aob.Fi, vnbVar));
                }
                paint.setAlpha(jn7.d4);
                float f6 = i;
                canvas.drawRoundRect(rectF, f6, f6, paint);
            }
            invalidate();
        }
        boolean z3 = f11.a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            fe1 fe1Var = this.E;
            fe1Var.f = measuredWidth;
            fe1Var.a(i, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.F) {
            if (z) {
                paint.setColor(aob.v0(aob.Fi, vnbVar));
            }
            paint.setAlpha((int) (this.s * 255.0f));
            if (this.s != 1.0f) {
                Path path = this.y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f7 = i;
                canvas.drawRoundRect(rectF, f7, f7, paint);
                canvas.restore();
            } else {
                float f8 = i;
                canvas.drawRoundRect(rectF, f8, f8, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f = this.s;
        mk8 mk8Var = this.h;
        mk8Var.setAlpha(f);
        mk8Var.setTranslationY((1.0f - this.s) * hl.L(12.0f));
        float f2 = 1.0f - this.s;
        nk8 nk8Var = this.w;
        nk8Var.setAlpha(f2);
        nk8Var.setTranslationY((-hl.L(12.0f)) * this.s);
        nk8Var.setVisibility(this.s == 1.0f ? 4 : 0);
        mk8Var.setVisibility(this.s == 0.0f ? 4 : 0);
        invalidate();
    }

    public e29 getIconView() {
        return this.G;
    }

    public in getTextView() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.w.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.w.setEnabled(z);
    }

    public void setFlickerDisabled(boolean z) {
        this.I = z;
        invalidate();
    }

    public void setIcon(int i) {
        e29 e29Var = this.G;
        e29Var.f(i, 24, 24, null);
        fe1 fe1Var = this.E;
        fe1Var.g = 2.0f;
        fe1Var.p = new x38(this, (byte) 29);
        invalidate();
        e29Var.setVisibility(0);
    }

    @Override // ka6
    public void setLoading(boolean z) {
        if (this.Q != z) {
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f = this.P;
            this.Q = z;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new pv7(this, (byte) 12));
            this.R.addListener(new gf4((byte) 24, this, z));
            this.R.setDuration(320L);
            this.R.setInterpolator(k43.h);
            this.R.start();
        }
    }

    public ok8(vnb vnbVar, Context context, boolean z) {
        this(hl.L(8.0f), vnbVar, context, z);
    }
}
