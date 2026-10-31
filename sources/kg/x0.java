package kg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.m5;
import org.telegram.messenger.v2;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t5;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class x0 extends FrameLayout implements s80 {
    public final org.telegram.ui.Components.voip.g D;
    public boolean E;
    public final ei0 F;
    public boolean G;
    public boolean H;
    public lq I;
    public boolean J;
    public boolean K;
    public final t5 L;
    public final t5 M;
    public kp N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint a;
    public final boolean b;
    public final p6 c;
    public float d;
    public boolean e;
    public final w0 f;
    public final w0 h;
    public final int n;
    public boolean r;
    public float s;
    public final jg.l0 w;
    public ValueAnimator x;
    public final Path y;

    public x0(Context context, p6 p6Var, boolean z10) {
        this(org.telegram.messenger.i0.L(8.0f), context, p6Var, z10);
    }

    @Override // org.telegram.ui.Components.s80
    public final boolean a() {
        return this.P;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.G && z10) {
            z10 = true;
        }
        this.G = true;
        w0 w0Var = this.f;
        if (z10 && w0Var.c.h()) {
            w0Var.a();
        }
        w0Var.c(str, z10, true);
        jg.l0 l0Var = this.w;
        l0Var.setContentDescription(str);
        if (this.K) {
            return;
        }
        l0Var.setOnClickListener(onClickListener);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.r = true;
        this.E = z10;
        w0 w0Var = this.h;
        w0Var.c(charSequence, z11, true);
        w0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.x.cancel();
        }
        if (!z10) {
            this.s = this.r ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, this.r ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new bg.o(this, 2));
        this.x.addListener(new bg.e(this, 7));
        this.x.setDuration(250L);
        this.x.setInterpolator(gr.f);
        this.x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L;
        lq lqVar = this.I;
        w0 w0Var = this.h;
        if (lqVar != null) {
            kq kqVar = lqVar.a;
            if (kqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(kqVar.C - 0.5f) + kqVar.s;
            }
            t5 t5Var = this.L;
            t5Var.e(false, ((L * 0.85f) + org.telegram.messenger.i0.L(3.0f)) / 2.0f);
            float e = (w0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(3.0f);
            t5 t5Var2 = this.M;
            t5Var2.e(false, e);
            w0Var.setTranslationX(-t5Var.c);
            this.I.setTranslationX(t5Var2.c - t5Var.c);
        } else if (w0Var != null) {
            w0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.s;
        p6 p6Var = this.c;
        boolean z10 = this.b;
        int i10 = this.n;
        Paint paint = this.a;
        if (f7 != 1.0f || !this.E) {
            if (this.e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.e = true;
                }
            }
            if (this.J) {
                ea.f.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, ea.f.d().e());
            } else {
                if (z10) {
                    paint.setColor(t6.w0(t6.Ci, p6Var));
                }
                paint.setAlpha(zs.e4);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        boolean z11 = v2.a;
        if (!this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.g gVar = this.D;
            gVar.f = measuredWidth;
            gVar.a(i10, canvas, rectF, null);
        }
        if (this.s != 0.0f && this.E) {
            if (z10) {
                paint.setColor(t6.w0(t6.Ci, p6Var));
            }
            paint.setAlpha((int) (this.s * 255.0f));
            if (this.s != 1.0f) {
                Path path = this.y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f14 = i10;
                canvas.drawRoundRect(rectF, f14, f14, paint);
                canvas.restore();
            } else {
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        float f7 = this.s;
        w0 w0Var = this.h;
        w0Var.setAlpha(f7);
        w0Var.setTranslationY((1.0f - this.s) * org.telegram.messenger.i0.L(12.0f));
        float f10 = 1.0f - this.s;
        jg.l0 l0Var = this.w;
        l0Var.setAlpha(f10);
        l0Var.setTranslationY((-org.telegram.messenger.i0.L(12.0f)) * this.s);
        l0Var.setVisibility(this.s == 1.0f ? 4 : 0);
        w0Var.setVisibility(this.s == 0.0f ? 4 : 0);
        invalidate();
    }

    public ei0 getIconView() {
        return this.F;
    }

    public f6 getTextView() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.w.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.H = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        ei0 ei0Var = this.F;
        ei0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.g gVar = this.D;
        gVar.g = 2.0f;
        gVar.p = new gg.c(this, 23);
        invalidate();
        ei0Var.setVisibility(0);
    }

    @Override // org.telegram.ui.Components.s80
    public void setLoading(boolean z10) {
        if (this.P != z10) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            float f7 = this.O;
            this.P = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new bg.k(this, 10));
            this.Q.addListener(new eg.m(3, this, z10));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(gr.h);
            this.Q.start();
        }
    }

    public x0(int i10, Context context, p6 p6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.y = new Path();
        this.J = true;
        this.L = new t5(this);
        this.M = new t5(this);
        this.O = 0.0f;
        this.n = i10;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.D = gVar;
        gVar.n = 1.2f;
        gVar.k = false;
        gVar.m = 4.0f;
        LinearLayout f7 = m5.f(context, 0);
        w0 w0Var = new w0(this, context, 0);
        this.f = w0Var;
        w0Var.b(0.35f, 350L, gr.h);
        w0Var.setGravity(17);
        w0Var.setTextColor(-1);
        w0Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        w0Var.setTypeface(org.telegram.messenger.i0.o());
        ei0 ei0Var = new ei0(context);
        this.F = ei0Var;
        ei0Var.setColorFilter(-1);
        ei0Var.setVisibility(8);
        jg.l0 l0Var = new jg.l0(this, context, 4);
        this.w = l0Var;
        l0Var.addView(f7, b6.e(-2, -2, 17));
        int o10 = i0.b.o(-1, 120);
        l0Var.setBackground(t6.k0(i10, i10, i10, i10, 0, o10, o10));
        f7.addView(w0Var, b6.r(-2, -2, 16));
        f7.addView(ei0Var, b6.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(l0Var);
        setOutlineProvider(rf.e0.b);
        setClipToOutline(true);
        e6.b(this, 0.02f, 1.2f);
        if (z10) {
            w0 w0Var2 = new w0(this, context, 1);
            this.h = w0Var2;
            w0Var2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            w0Var2.setGravity(17);
            a7.Z(w0Var2, t6.Gi, p6Var);
            w0Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
            w0Var2.setTypeface(org.telegram.messenger.i0.o());
            w0Var2.getDrawable().J = true;
            int L = org.telegram.messenger.i0.L(8.0f);
            int o11 = i0.b.o(-1, 120);
            w0Var2.setBackground(t6.k0(L, L, L, L, 0, o11, o11));
            addView(w0Var2);
            paint.setColor(t6.w0(t6.Ci, p6Var));
            this.b = true;
            this.c = p6Var;
            e();
        }
    }
}
