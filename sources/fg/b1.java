package fg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import eg.u2;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class b1 extends FrameLayout implements j90 {
    public boolean B;
    public boolean C;
    public wq D;
    public boolean E;
    public boolean F;
    public final z5 G;
    public final z5 H;
    public tp I;
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
    public final eg.s2 r;
    public ValueAnimator s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h w;
    public boolean x;
    public final lj0 y;

    public b1(Context context, g6 g6Var, boolean z4) {
        this(AndroidUtilities.dp(8.0f), context, g6Var, z4);
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
        eg.s2 s2Var = this.r;
        s2Var.setContentDescription(str);
        if (this.F) {
            return;
        }
        s2Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.j90
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
        ofFloat.addUpdateListener(new f2.d0(this, 1));
        this.s.addListener(new dg.l0(this, 3));
        this.s.setDuration(250L);
        this.s.setInterpolator(pr.f);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        wq wqVar = this.D;
        a1 a1Var = this.e;
        if (wqVar != null) {
            vq vqVar = wqVar.a;
            if (vqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(vqVar.C - 0.5f) + vqVar.s;
            }
            z5 z5Var = this.G;
            z5Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e6 = (a1Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            z5 z5Var2 = this.H;
            z5Var2.d(e6, false);
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
                q1.d().f((-getMeasuredWidth()) * 0.1f * this.b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, q1.d().e());
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
        eg.s2 s2Var = this.r;
        s2Var.setAlpha(f11);
        s2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.n);
        s2Var.setVisibility(this.n == 1.0f ? 4 : 0);
        a1Var.setVisibility(this.n == 0.0f ? 4 : 0);
        invalidate();
    }

    public lj0 getIconView() {
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
        lj0 lj0Var = this.y;
        lj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.w;
        hVar.g = 2.0f;
        hVar.p = new eh.m(this, 5);
        invalidate();
        lj0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.j90
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
            ofFloat.addUpdateListener(new eg.m1(this, 7));
            this.L.addListener(new u2(2, this, z4));
            this.L.setDuration(320L);
            this.L.setInterpolator(pr.h);
            this.L.start();
        }
    }

    public b1(int i10, Context context, g6 g6Var, boolean z4) {
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
        a1Var.b(0.35f, 350L, pr.h);
        a1Var.setGravity(17);
        a1Var.setTextColor(-1);
        a1Var.setTextSize(AndroidUtilities.dp(14.0f));
        a1Var.setTypeface(AndroidUtilities.bold());
        lj0 lj0Var = new lj0(context);
        this.y = lj0Var;
        lj0Var.setColorFilter(-1);
        lj0Var.setVisibility(8);
        eg.s2 s2Var = new eg.s2(this, context, 3);
        this.r = s2Var;
        s2Var.addView(f10, c6.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        s2Var.setBackground(org.telegram.ui.ActionBar.k6.i0(i10, i10, i10, i10, 0, k10, k10));
        f10.addView(a1Var, c6.q(-2, -2, 16));
        f10.addView(lj0Var, c6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(s2Var);
        setOutlineProvider(lf.q0.b);
        setClipToOutline(true);
        e6.b(this, 0.02f, 1.2f);
        if (z4) {
            a1 a1Var2 = new a1(this, context, 1);
            this.e = a1Var2;
            a1Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            a1Var2.setGravity(17);
            a1Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
            a1Var2.setTextSize(AndroidUtilities.dp(14.0f));
            a1Var2.setTypeface(AndroidUtilities.bold());
            a1Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            a1Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(a1Var2);
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
            e();
        }
    }
}
