package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bg.x2;
import bg.z2;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class d1 extends FrameLayout implements b90 {
    public boolean A;
    public boolean B;
    public qq C;
    public boolean D;
    public boolean E;
    public final d6 F;
    public final d6 G;
    public np H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public final Paint a;
    public float b;
    public boolean c;
    public final b1 d;
    public final b1 e;
    public final int f;
    public boolean h;
    public float n;
    public final x2 r;
    public ValueAnimator s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h w;
    public boolean x;
    public final aj0 y;

    public d1(Context context, c6 c6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, c6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.A && z10) {
            z10 = true;
        }
        this.A = true;
        b1 b1Var = this.d;
        if (z10 && b1Var.c.f()) {
            b1Var.a();
        }
        b1Var.c(str, z10, true);
        x2 x2Var = this.r;
        x2Var.setContentDescription(str);
        if (this.E) {
            return;
        }
        x2Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.b90
    public final boolean b() {
        return this.J;
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.x = z10;
        b1 b1Var = this.e;
        b1Var.c(charSequence, z11, true);
        b1Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        if (!z10) {
            this.n = this.h ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, this.h ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new c1(this, 0));
        this.s.addListener(new ag.m0(this, 3));
        this.s.setDuration(250L);
        this.s.setInterpolator(jr.f);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        qq qqVar = this.C;
        b1 b1Var = this.e;
        if (qqVar != null) {
            pq pqVar = qqVar.a;
            if (pqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(pqVar.C - 0.5f) + pqVar.s;
            }
            d6 d6Var = this.F;
            d6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e10 = (b1Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            d6 d6Var2 = this.G;
            d6Var2.d(e10, false);
            b1Var.setTranslationX(-d6Var.c);
            this.C.setTranslationX(d6Var2.c - d6Var.c);
        } else if (b1Var != null) {
            b1Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f9 = this.n;
        Paint paint = this.a;
        int i10 = this.f;
        if (f9 != 1.0f || !this.x) {
            if (this.c) {
                float f10 = this.b + 0.016f;
                this.b = f10;
                if (f10 > 3.0f) {
                    this.c = false;
                }
            } else {
                float f11 = this.b - 0.016f;
                this.b = f11;
                if (f11 < 1.0f) {
                    this.c = true;
                }
            }
            if (this.D) {
                s1.d().f((-getMeasuredWidth()) * 0.1f * this.b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, s1.d().e());
            } else {
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.B) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.w;
            hVar.f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.n;
        if (f14 != 0.0f && this.x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            } else {
                float f16 = i10;
                canvas.drawRoundRect(rectF, f16, f16, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f9 = this.n;
        b1 b1Var = this.e;
        b1Var.setAlpha(f9);
        b1Var.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(12.0f));
        float f10 = 1.0f - this.n;
        x2 x2Var = this.r;
        x2Var.setAlpha(f10);
        x2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.n);
        x2Var.setVisibility(this.n == 1.0f ? 4 : 0);
        b1Var.setVisibility(this.n == 0.0f ? 4 : 0);
        invalidate();
    }

    public aj0 getIconView() {
        return this.y;
    }

    public o6 getTextView() {
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
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.B = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        aj0 aj0Var = this.y;
        aj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.w;
        hVar.g = 2.0f;
        hVar.p = new a4.g(this, 27);
        invalidate();
        aj0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.b90
    public void setLoading(boolean z10) {
        if (this.J != z10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            float f9 = this.I;
            this.J = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, z10 ? 1.0f : 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bg.q1(this, 7));
            this.K.addListener(new z2(2, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(jr.h);
            this.K.start();
        }
    }

    public d1(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.v = new Path();
        this.D = true;
        this.F = new d6(this);
        this.G = new d6(this);
        this.I = 0.0f;
        this.f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.w = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
        LinearLayout g10 = x3.g(context, 0);
        b1 b1Var = new b1(this, context, 0);
        this.d = b1Var;
        b1Var.b(0.35f, 350L, jr.h);
        b1Var.setGravity(17);
        b1Var.setTextColor(-1);
        b1Var.setTextSize(AndroidUtilities.dp(14.0f));
        b1Var.setTypeface(AndroidUtilities.bold());
        aj0 aj0Var = new aj0(context);
        this.y = aj0Var;
        aj0Var.setColorFilter(-1);
        aj0Var.setVisibility(8);
        x2 x2Var = new x2(this, context, 3);
        this.r = x2Var;
        x2Var.addView(g10, f6.e(-2, -2, 17));
        int k9 = i0.a.k(-1, 120);
        x2Var.setBackground(g6.i0(i10, i10, i10, i10, 0, k9, k9));
        g10.addView(b1Var, f6.q(-2, -2, 16));
        g10.addView(aj0Var, f6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(x2Var);
        setOutlineProvider(jf.q0.b);
        setClipToOutline(true);
        h6.b(this, 0.02f, 1.2f);
        if (z10) {
            b1 b1Var2 = new b1(this, context, 1);
            this.e = b1Var2;
            b1Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            b1Var2.setGravity(17);
            b1Var2.setTextColor(g6.v0(g6.Sh, c6Var));
            b1Var2.setTextSize(AndroidUtilities.dp(14.0f));
            b1Var2.setTypeface(AndroidUtilities.bold());
            b1Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(-1, 120);
            b1Var2.setBackground(g6.i0(dp, dp, dp, dp, 0, k10, k10));
            addView(b1Var2);
            paint.setColor(g6.v0(g6.Oh, c6Var));
            e();
        }
    }
}
