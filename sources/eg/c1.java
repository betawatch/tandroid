package eg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import dg.w2;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class c1 extends FrameLayout implements h90 {
    public boolean B;
    public boolean C;
    public uq D;
    public boolean E;
    public boolean F;
    public final z5 G;
    public final z5 H;
    public rp I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public final Paint a;
    public float b;
    public boolean c;
    public final a1 d;
    public final a1 e;
    public final int f;
    public boolean h;
    public float n;
    public final dg.u2 r;
    public ValueAnimator s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h w;
    public boolean x;
    public final jj0 y;

    public c1(Context context, f6 f6Var, boolean z4) {
        this(AndroidUtilities.dp(8.0f), context, f6Var, z4);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z4) {
        if (!this.B && z4) {
            z4 = true;
        }
        this.B = true;
        a1 a1Var = this.d;
        if (z4 && a1Var.c.f()) {
            a1Var.a();
        }
        a1Var.c(str, z4, true);
        dg.u2 u2Var = this.r;
        u2Var.setContentDescription(str);
        if (this.F) {
            return;
        }
        u2Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.h90
    public final boolean b() {
        return this.K;
    }

    public final void c(CharSequence charSequence, boolean z4, boolean z10) {
        this.h = true;
        this.x = z4;
        a1 a1Var = this.e;
        a1Var.c(charSequence, z10, true);
        a1Var.setContentDescription(charSequence);
        d(z10);
    }

    public final void d(boolean z4) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        if (!z4) {
            this.n = this.h ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, this.h ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new b1(this, 0));
        this.s.addListener(new cg.l0(this, 3));
        this.s.setDuration(250L);
        this.s.setInterpolator(nr.f);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        uq uqVar = this.D;
        a1 a1Var = this.e;
        if (uqVar != null) {
            tq tqVar = uqVar.a;
            if (tqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(tqVar.C - 0.5f) + tqVar.s;
            }
            z5 z5Var = this.G;
            z5Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (a1Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            z5 z5Var2 = this.H;
            z5Var2.d(e, false);
            a1Var.setTranslationX(-z5Var.c);
            this.D.setTranslationX(z5Var2.c - z5Var.c);
        } else if (a1Var != null) {
            a1Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.n;
        Paint paint = this.a;
        int i10 = this.f;
        if (f10 != 1.0f || !this.x) {
            if (this.c) {
                float f11 = this.b + 0.016f;
                this.b = f11;
                if (f11 > 3.0f) {
                    this.c = false;
                }
            } else {
                float f12 = this.b - 0.016f;
                this.b = f12;
                if (f12 < 1.0f) {
                    this.c = true;
                }
            }
            if (this.E) {
                r1.d().f((-getMeasuredWidth()) * 0.1f * this.b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, r1.d().e());
            } else {
                paint.setAlpha(255);
                float f14 = i10;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.C) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.w;
            hVar.f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f15 = this.n;
        if (f15 != 0.0f && this.x) {
            paint.setAlpha((int) (f15 * 255.0f));
            if (this.n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f16 = i10;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            } else {
                float f17 = i10;
                canvas.drawRoundRect(rectF, f17, f17, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f10 = this.n;
        a1 a1Var = this.e;
        a1Var.setAlpha(f10);
        a1Var.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(12.0f));
        float f11 = 1.0f - this.n;
        dg.u2 u2Var = this.r;
        u2Var.setAlpha(f11);
        u2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.n);
        u2Var.setVisibility(this.n == 1.0f ? 4 : 0);
        a1Var.setVisibility(this.n == 0.0f ? 4 : 0);
        invalidate();
    }

    public jj0 getIconView() {
        return this.y;
    }

    public k6 getTextView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.r.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.r.setEnabled(z4);
    }

    public void setFlickerDisabled(boolean z4) {
        this.C = z4;
        invalidate();
    }

    public void setIcon(int i10) {
        jj0 jj0Var = this.y;
        jj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.w;
        hVar.g = 2.0f;
        hVar.p = new ef.e(this, 2);
        invalidate();
        jj0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.h90
    public void setLoading(boolean z4) {
        if (this.K != z4) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            float f10 = this.J;
            this.K = z4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new dg.o1(this, 7));
            this.L.addListener(new w2(2, this, z4));
            this.L.setDuration(320L);
            this.L.setInterpolator(nr.h);
            this.L.start();
        }
    }

    public c1(int i10, Context context, f6 f6Var, boolean z4) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.v = new Path();
        this.E = true;
        this.G = new z5(this);
        this.H = new z5(this);
        this.J = 0.0f;
        this.f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.w = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
        LinearLayout f10 = y3.f(context, 0);
        a1 a1Var = new a1(this, context, 0);
        this.d = a1Var;
        a1Var.b(0.35f, 350L, nr.h);
        a1Var.setGravity(17);
        a1Var.setTextColor(-1);
        a1Var.setTextSize(AndroidUtilities.dp(14.0f));
        a1Var.setTypeface(AndroidUtilities.bold());
        jj0 jj0Var = new jj0(context);
        this.y = jj0Var;
        jj0Var.setColorFilter(-1);
        jj0Var.setVisibility(8);
        dg.u2 u2Var = new dg.u2(this, context, 3);
        this.r = u2Var;
        u2Var.addView(f10, b6.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        u2Var.setBackground(j6.i0(i10, i10, i10, i10, 0, k10, k10));
        f10.addView(a1Var, b6.q(-2, -2, 16));
        f10.addView(jj0Var, b6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(u2Var);
        setOutlineProvider(lf.q0.b);
        setClipToOutline(true);
        d6.b(this, 0.02f, 1.2f);
        if (z4) {
            a1 a1Var2 = new a1(this, context, 1);
            this.e = a1Var2;
            a1Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            a1Var2.setGravity(17);
            a1Var2.setTextColor(j6.v0(j6.Sh, f6Var));
            a1Var2.setTextSize(AndroidUtilities.dp(14.0f));
            a1Var2.setTypeface(AndroidUtilities.bold());
            a1Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            a1Var2.setBackground(j6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(a1Var2);
            paint.setColor(j6.v0(j6.Oh, f6Var));
            e();
        }
    }
}
