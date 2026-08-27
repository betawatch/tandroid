package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import h7.b6;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class s1 extends FrameLayout implements s80 {
    public boolean A;
    public boolean B;
    public kq C;
    public boolean D;
    public boolean E;
    public final y5 F;
    public final y5 G;
    public hp H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public final Paint a;
    public float b;
    public boolean c;
    public final o1 d;
    public final o1 e;
    public final int f;
    public boolean h;
    public float n;
    public final p1 r;
    public ValueAnimator s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h w;
    public boolean x;
    public final ri0 y;

    public s1(Context context, c6 c6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, c6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.A && z10) {
            z10 = true;
        }
        this.A = true;
        o1 o1Var = this.d;
        if (z10 && o1Var.c.f()) {
            o1Var.a();
        }
        o1Var.c(str, z10, true);
        p1 p1Var = this.r;
        p1Var.setContentDescription(str);
        if (this.E) {
            return;
        }
        p1Var.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.Components.s80
    public final boolean b() {
        return this.J;
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.x = z10;
        o1 o1Var = this.e;
        o1Var.c(charSequence, z11, true);
        o1Var.setContentDescription(charSequence);
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
        int i10 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, this.h ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new q1(this, i10));
        this.s.addListener(new r1(this, i10));
        this.s.setDuration(250L);
        this.s.setInterpolator(er.f);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        kq kqVar = this.C;
        o1 o1Var = this.e;
        if (kqVar != null) {
            jq jqVar = kqVar.a;
            if (jqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(jqVar.C - 0.5f) + jqVar.s;
            }
            y5 y5Var = this.F;
            y5Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e9 = (o1Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            y5 y5Var2 = this.G;
            y5Var2.d(e9, false);
            o1Var.setTranslationX(-y5Var.c);
            this.C.setTranslationX(y5Var2.c - y5Var.c);
        } else if (o1Var != null) {
            o1Var.setTranslationX(0.0f);
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
            if (this.D) {
                j2.d().f((-getMeasuredWidth()) * 0.1f * this.b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, j2.d().e());
            } else {
                paint.setAlpha(255);
                float f14 = i10;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.B) {
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
        o1 o1Var = this.e;
        o1Var.setAlpha(f10);
        o1Var.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(12.0f));
        float f11 = 1.0f - this.n;
        p1 p1Var = this.r;
        p1Var.setAlpha(f11);
        p1Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.n);
        p1Var.setVisibility(this.n == 1.0f ? 4 : 0);
        o1Var.setVisibility(this.n == 0.0f ? 4 : 0);
        invalidate();
    }

    public ri0 getIconView() {
        return this.y;
    }

    public j6 getTextView() {
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
        ri0 ri0Var = this.y;
        ri0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.w;
        hVar.g = 2.0f;
        hVar.p = new af.e(this, 2);
        invalidate();
        ri0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.s80
    public void setLoading(boolean z10) {
        if (this.J != z10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            float f10 = this.I;
            this.J = z10;
            int i10 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new u(this, i10));
            this.K.addListener(new x(i10, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(er.h);
            this.K.start();
        }
    }

    public s1(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.v = new Path();
        this.D = true;
        this.F = new y5(this);
        this.G = new y5(this);
        this.I = 0.0f;
        this.f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.w = hVar;
        hVar.n = 1.2f;
        hVar.k = false;
        hVar.m = 4.0f;
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
        o1 o1Var = new o1(this, context, 0);
        this.d = o1Var;
        o1Var.b(0.35f, 350L, er.h);
        o1Var.setGravity(17);
        o1Var.setTextColor(-1);
        o1Var.setTextSize(AndroidUtilities.dp(14.0f));
        o1Var.setTypeface(AndroidUtilities.bold());
        ri0 ri0Var = new ri0(context);
        this.y = ri0Var;
        ri0Var.setColorFilter(-1);
        ri0Var.setVisibility(8);
        p1 p1Var = new p1(this, context, 0);
        this.r = p1Var;
        p1Var.addView(g10, z5.e(-2, -2, 17));
        int k10 = i0.b.k(-1, 120);
        p1Var.setBackground(g6.i0(i10, i10, i10, i10, 0, k10, k10));
        g10.addView(o1Var, z5.q(-2, -2, 16));
        g10.addView(ri0Var, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(p1Var);
        setOutlineProvider(gf.r0.b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            o1 o1Var2 = new o1(this, context, 1);
            this.e = o1Var2;
            o1Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o1Var2.setGravity(17);
            o1Var2.setTextColor(g6.v0(g6.Sh, c6Var));
            o1Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o1Var2.setTypeface(AndroidUtilities.bold());
            o1Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.b.k(-1, 120);
            o1Var2.setBackground(g6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(o1Var2);
            paint.setColor(g6.v0(g6.Oh, c6Var));
            e();
        }
    }
}
