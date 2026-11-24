package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class LimitPreviewView extends LinearLayout implements tjb {
    public static final /* synthetic */ int p0 = 0;
    public ViewGroup E;
    public mh8 F;
    public int G;
    public boolean H;
    public boolean I;
    public final jo0 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final hn O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final wjb T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float a;
    public boolean a0;
    public int b;
    public int b0;
    public int c;
    public float c0;
    public boolean d;
    public boolean d0;
    public final o16 e;
    public boolean e0;
    public boolean f;
    public p16 f0;
    public final oi3 g0;
    public float h;
    public final oi3 h0;
    public boolean i0;
    public ValueAnimator j0;
    public boolean k0;
    public Runnable l0;
    public boolean m0;
    public int n;
    public int n0;
    public boolean o0;
    public final int r;
    public float s;
    public final hn w;
    public final TextView x;
    public float y;

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, wjb wjbVar) {
        super(context);
        this.s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.e0 = true;
        this.n0 = -1;
        this.T = wjbVar;
        this.a = moe.a(f, 0.1f, 0.9f);
        this.r = i;
        this.b = i2;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, gl.L(16.0f), 0, 0);
            o16 o16Var = new o16(this, context);
            this.e = o16Var;
            j(i2, false);
            o16Var.setPadding(gl.L(19.0f), gl.L(6.0f), gl.L(19.0f), gl.L(14.0f));
            addView(o16Var, nme.p(-2, -2, 0.0f, 3));
        }
        oi3 oi3Var = new oi3(this, context, true);
        this.g0 = oi3Var;
        hn hnVar = new hn(context, false, false, false);
        this.O = hnVar;
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.o());
        hnVar.setText(k96.M0(2131748789, null));
        hnVar.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(gl.o());
        textView.setText(String.format("%d", Integer.valueOf(i3)));
        textView.setGravity(16);
        zkb.X(textView, bkb.F6, wjbVar);
        if (k96.a0) {
            oi3Var.addView(hnVar, nme.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var.addView(textView, nme.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            oi3Var.addView(hnVar, nme.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var.addView(textView, nme.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        oi3 oi3Var2 = new oi3(this, context, false);
        this.h0 = oi3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131748787, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        hn hnVar2 = new hn(context, false, false, false);
        this.w = hnVar2;
        hnVar2.setTextSize(gl.L(14.0f));
        hnVar2.setTypeface(gl.o());
        hnVar2.setText(String.format("%d", Integer.valueOf(i3)));
        hnVar2.setGravity(21);
        setPremiumCountColor(true);
        if (k96.a0) {
            oi3Var2.addView(textView2, nme.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var2.addView(hnVar2, nme.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            oi3Var2.addView(textView2, nme.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            oi3Var2.addView(hnVar2, nme.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        jo0 jo0Var = new jo0(this, context, wjbVar);
        this.J = jo0Var;
        jo0Var.addView(oi3Var, nme.c(30.0f, -1));
        jo0Var.addView(oi3Var2, nme.c(30.0f, -1));
        addView(jo0Var, nme.q(-1, 30, 0.0f, 0, 14, i != 0 ? 12 : 0, 14, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f) {
        this.n = f >= 1.0f ? this.J.getMeasuredWidth() : 0;
        float L = gl.L(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 << 1)) * f) + L;
        o16 o16Var = this.e;
        o16Var.setTranslationX(Utilities.i(max - (o16Var.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - o16Var.getMeasuredWidth(), L));
        if (o16Var.s != f) {
            o16Var.s = f;
            o16Var.w = true;
            o16Var.invalidate();
        }
        o16Var.setPivotX(o16Var.getMeasuredWidth() * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTextColor(boolean z) {
        this.o0 = !z;
        this.O.setTextColor(z ? -1 : bkb.v0(bkb.F6, this.T));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiumCountColor(boolean z) {
        this.m0 = !z;
        this.w.setTextColor(z ? -1 : bkb.v0(bkb.F6, this.T));
    }

    private void setRatingPaintColorKey(int i) {
        this.n0 = i;
        this.L.setColor(bkb.v0(i, this.T));
    }

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z;
        gl.r(this.l0);
        this.l0 = null;
        int i = bkb.Ei;
        setRatingPaintColorKey(i);
        this.M = false;
        int i2 = tl_starsRating.level;
        int i3 = tl_starsRating2.level;
        jo0 jo0Var = this.J;
        hn hnVar = this.w;
        hn hnVar2 = this.O;
        final byte b = 1;
        if (i2 == i3) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                hnVar2.setText("");
                hnVar.setText(k96.M0(2131744936, null));
                setRatingPaintColorKey(bkb.mk);
                this.M = true;
                z = false;
            } else {
                z = false;
                if (tl_starsRating2.next_level_stars == 0) {
                    this.a = 1.0f;
                    hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(i3 - 1)));
                    hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j = tl_starsRating2.current_level_stars;
                    this.a = moe.a((r10 - j) / (r5 - j), 0.0f, 1.0f);
                    hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating2.level)));
                    hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.U = true;
            boolean z2 = z;
            this.V = z2;
            this.W = z2;
            this.b0 = this.n;
            jo0Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i3 > i2) {
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.a = 1.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.b0 = this.n;
            jo0Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = hnVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            hnVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(s33Var).start();
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final byte b2 = 0;
            Runnable runnable = new Runnable(this) { // from class: k16
                public final /* synthetic */ LimitPreviewView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    TL_stars.Tl_starsRating tl_starsRating3 = tl_starsRating2;
                    LimitPreviewView limitPreviewView = this.b;
                    switch (b3) {
                        case 0:
                            int i4 = LimitPreviewView.p0;
                            limitPreviewView.f(tl_starsRating3);
                            break;
                        default:
                            int i5 = LimitPreviewView.p0;
                            limitPreviewView.g(tl_starsRating3);
                            break;
                    }
                }
            };
            this.l0 = runnable;
            gl.e3(runnable, 600L);
            return;
        }
        if (i3 < i2) {
            setRatingPaintColorKey(i);
            this.M = false;
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.a = 0.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.b0 = this.n;
            jo0Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = hnVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            s33 s33Var2 = s33.h;
            duration2.setInterpolator(s33Var2).start();
            hnVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(s33Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) { // from class: k16
                public final /* synthetic */ LimitPreviewView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    TL_stars.Tl_starsRating tl_starsRating3 = tl_starsRating2;
                    LimitPreviewView limitPreviewView = this.b;
                    switch (b3) {
                        case 0:
                            int i4 = LimitPreviewView.p0;
                            limitPreviewView.f(tl_starsRating3);
                            break;
                        default:
                            int i5 = LimitPreviewView.p0;
                            limitPreviewView.g(tl_starsRating3);
                            break;
                    }
                }
            };
            this.l0 = runnable2;
            gl.e3(runnable2, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.F == null) {
            boolean z = this.f;
            float f = this.h;
            if (z) {
                float f2 = f + 0.016f;
                this.h = f2;
                if (f2 > 3.0f) {
                    this.f = false;
                }
            } else {
                float f3 = f - 0.016f;
                this.h = f3;
                if (f3 < 1.0f) {
                    this.f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        return this.f0 != null;
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z;
        this.l0 = null;
        if (isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.M = false;
            setRatingPaintColorKey(bkb.Ei);
            long j = tl_starsRating.stars;
            hn hnVar = this.w;
            hn hnVar2 = this.O;
            if (j <= 0) {
                this.a = 0.0f;
                hnVar2.setText("");
                hnVar.setText(k96.M0(2131744936, null));
                setRatingPaintColorKey(bkb.mk);
                this.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j2 = tl_starsRating.current_level_stars;
                    z = false;
                    this.a = moe.a((j - j2) / (r14 - j2), 0.0f, 1.0f);
                    hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
                    hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level + 1)));
                    setArrowX(0.0f);
                    o16 o16Var = this.e;
                    o16Var.setScaleX(0.6f);
                    o16Var.setScaleY(0.6f);
                    o16Var.setAlpha(0.0f);
                    this.U = true;
                    this.V = true;
                    this.W = z;
                    this.b0 = this.n;
                    this.J.requestLayout();
                    requestLayout();
                    ViewPropertyAnimator duration = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    s33 s33Var = s33.h;
                    duration.setInterpolator(s33Var).start();
                    hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var).start();
                    setPremiumCountColor(this.M);
                    setDefaultTextColor(true);
                    i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                this.a = 1.0f;
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level - 1)));
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
            }
            z = false;
            setArrowX(0.0f);
            o16 o16Var2 = this.e;
            o16Var2.setScaleX(0.6f);
            o16Var2.setScaleY(0.6f);
            o16Var2.setAlpha(0.0f);
            this.U = true;
            this.V = true;
            this.W = z;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            s33 s33Var2 = s33.h;
            duration2.setInterpolator(s33Var2).start();
            hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public final void g(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z;
        this.l0 = null;
        if (isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.M = false;
            setRatingPaintColorKey(bkb.Ei);
            long j = tl_starsRating.stars;
            hn hnVar = this.w;
            hn hnVar2 = this.O;
            if (j <= 0) {
                this.a = 0.5f;
                hnVar2.setText("");
                hnVar.setText(k96.M0(2131744936, null));
                setRatingPaintColorKey(bkb.mk);
                this.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j2 = tl_starsRating.current_level_stars;
                    z = false;
                    this.a = moe.a((j - j2) / (r14 - j2), 0.0f, 1.0f);
                    hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
                    hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level + 1)));
                    setArrowX(1.0f);
                    o16 o16Var = this.e;
                    o16Var.setScaleX(0.6f);
                    o16Var.setScaleY(0.6f);
                    o16Var.setAlpha(0.0f);
                    this.U = true;
                    this.V = true;
                    this.W = z;
                    this.b0 = this.n;
                    this.J.requestLayout();
                    requestLayout();
                    ViewPropertyAnimator duration = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    s33 s33Var = s33.h;
                    duration.setInterpolator(s33Var).start();
                    hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var).start();
                    setPremiumCountColor(this.M);
                    setDefaultTextColor(true);
                    i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                this.a = 1.0f;
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level - 1)));
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
            }
            z = false;
            setArrowX(1.0f);
            o16 o16Var2 = this.e;
            o16Var2.setScaleX(0.6f);
            o16Var2.setScaleY(0.6f);
            o16Var2.setAlpha(0.0f);
            this.U = true;
            this.V = true;
            this.W = z;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            s33 s33Var2 = s33.h;
            duration2.setInterpolator(s33Var2).start();
            hnVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(s33Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public final void h(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.boosts;
        hn hnVar = this.O;
        hn hnVar2 = this.w;
        if ((i2 == i3 && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            hnVar.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            hnVar2.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = moe.a((i3 - i2) / (i - i2), 0.0f, 1.0f);
            hnVar.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level)));
            hnVar2.setText(k96.a0("BoostsLevel", null, 2131753157, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) hnVar2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        j(tL_premium_boostsStatus.boosts, false);
        this.Q = true;
    }

    public final void i(int i, int i2) {
        boolean z = false;
        if (i < 0) {
            j(i, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new cm2(this.r, 0), 0, 1, 0);
        byte b = 2;
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i > 1200 ? k96.S(null, i) : k96.E(i, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i2 > 1200 ? k96.S(null, i2) : k96.E(i2, ',')));
        spannableStringBuilder.setSpan(new rk(b, kk7.z2, z), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        o16 o16Var = this.e;
        o16Var.f = spannableStringBuilder;
        o16Var.requestLayout();
    }

    public final void j(int i, boolean z) {
        cm2 cm2Var;
        byte b = 0;
        if (i < 0) {
            cm2Var = new cm2(R.drawable.warning_sign, 0);
        } else {
            cm2Var = new cm2(this.r, 0);
            float f = this.s;
            cm2Var.I = f;
            cm2Var.J = f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b2 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(cm2Var, 0, 1, 0);
        if (i >= 0 || !this.i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) k96.E(i, ','));
        }
        o16 o16Var = this.e;
        if (z) {
            SpannableStringBuilder spannableStringBuilder2 = o16Var.f;
            o16Var.f = spannableStringBuilder;
            TextPaint textPaint = o16Var.c;
            ArrayList arrayList = o16Var.h;
            if (o16Var.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(o16Var.f);
                int length = o16Var.f.length() - 1;
                int i2 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt != o16Var.f.charAt(length) && Character.isDigit(o16Var.f.charAt(length))) {
                        n16 n16Var = new n16();
                        arrayList.add(n16Var);
                        n16Var.e = o16Var.d.getSecondaryHorizontal(length);
                        n16Var.a = true;
                        if (i2 >= 1) {
                            i2 = 0;
                        }
                        int i3 = i2 + 1;
                        String valueOf = String.valueOf(charAt);
                        int i4 = (int) o16Var.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        StaticLayout staticLayout = new StaticLayout(valueOf, textPaint, i4, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = n16Var.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout(String.valueOf(o16Var.f.charAt(length)), textPaint, (int) o16Var.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new lx2(b2), length, length + 1, 0);
                        i2 = i3;
                    }
                    length--;
                }
                o16Var.n = new StaticLayout(spannableStringBuilder3, textPaint, gl.L(12.0f) + ((int) o16Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    o16Var.r = true;
                    n16 n16Var2 = (n16) arrayList.get(i5);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n16Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new l16(o16Var, n16Var2, b));
                    n16Var2.f.addListener(new m16(o16Var, n16Var2, b2));
                    n16Var2.f.setInterpolator(s33.g);
                    n16Var2.f.setDuration(250L);
                    n16Var2.f.setStartDelay(((arrayList.size() - 1) - i5) * 60);
                    n16Var2.f.start();
                }
            }
        } else {
            o16Var.f = spannableStringBuilder;
        }
        o16Var.requestLayout();
    }

    public final void k(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(bkb.Ei);
        this.a = gl.x1(j, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(k96.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = k96.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        hn hnVar = this.w;
        hnVar.setText(H);
        ((FrameLayout.LayoutParams) hnVar.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        j((int) j, false);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02de  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        final float f4;
        float measuredWidth;
        float f5;
        boolean z2;
        float f6;
        boolean z3;
        TextPaint textPaint;
        super.onLayout(z, i, i2, i3, i4);
        boolean z4 = this.a0;
        float f7 = 0.5f;
        o16 o16Var = this.e;
        if (!z4 && !this.U && (this.d || o16Var == null || !this.I || this.K)) {
            if (this.Q) {
                if (this.V || this.W) {
                    return;
                }
                o16Var.setAlpha(1.0f);
                o16Var.setScaleX(1.0f);
                o16Var.setScaleY(1.0f);
                return;
            }
            if (!this.K) {
                if (o16Var != null) {
                    o16Var.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 << 1)) * 0.5f) + gl.L(14.0f)) - (o16Var.getMeasuredWidth() / 2.0f);
            if (this.d) {
                o16Var.setAlpha(1.0f);
                o16Var.setScaleX(1.0f);
                o16Var.setScaleY(1.0f);
            } else if (this.I) {
                this.d = true;
                o16Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else {
                o16Var.setAlpha(0.0f);
                o16Var.setScaleX(0.0f);
                o16Var.setScaleY(0.0f);
            }
            o16Var.setTranslationX(measuredWidth2);
            return;
        }
        int L = gl.L(14.0f);
        boolean z5 = this.U || this.a0;
        this.a0 = false;
        this.U = false;
        float translationX = z5 ? o16Var.getTranslationX() : 0.0f;
        float f8 = L;
        int i5 = L << 1;
        float max = (Math.max(this.n, (getMeasuredWidth() - i5) * this.y) + f8) - (o16Var.getMeasuredWidth() / 2.0f);
        if (this.R) {
            float f9 = o16Var.s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L) - o16Var.getMeasuredWidth(), f8);
            int i6 = this.n;
            if (i6 <= 0) {
                f4 = measuredWidth;
                f2 = f9;
                f3 = 0.0f;
            } else if (i6 >= getMeasuredWidth() - i5) {
                f = f9;
                f4 = measuredWidth;
                f2 = f;
                f3 = 1.0f;
            } else {
                f3 = Utilities.i((this.n - (measuredWidth - f8)) / o16Var.getMeasuredWidth(), 1.0f, 0.0f);
                f4 = measuredWidth;
                f2 = f9;
            }
        } else {
            if (max < f8) {
                f = 0.0f;
                f7 = 0.0f;
            } else {
                f8 = max;
                f = 0.5f;
            }
            if (f8 > (getMeasuredWidth() - L) - o16Var.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - L) - o16Var.getMeasuredWidth();
                f4 = measuredWidth;
                f2 = f;
                f3 = 1.0f;
            } else {
                f2 = f;
                f3 = f7;
                f4 = f8;
            }
        }
        final boolean z6 = this.V;
        final boolean z7 = this.W;
        if (!z6 && !z7) {
            o16Var.setAlpha(1.0f);
        }
        o16Var.setTranslationX(translationX);
        o16Var.setPivotX(o16Var.getMeasuredWidth() / 2.0f);
        o16Var.setPivotY(o16Var.getMeasuredHeight());
        if (!z5) {
            o16Var.setScaleX(0.0f);
            o16Var.setScaleY(0.0f);
            TextPaint textPaint2 = o16Var.c;
            ArrayList arrayList = o16Var.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = o16Var.E;
            if (!limitPreviewView.Q || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o16Var.f);
                int i7 = 0;
                int i8 = 0;
                boolean z8 = true;
                while (i7 < o16Var.f.length()) {
                    if (Character.isDigit(o16Var.f.charAt(i7))) {
                        n16 n16Var = new n16();
                        arrayList.add(n16Var);
                        f6 = f2;
                        n16Var.e = o16Var.d.getSecondaryHorizontal(i7);
                        n16Var.d = z8;
                        if (i8 >= 1) {
                            z8 = !z8;
                            i8 = 0;
                        }
                        i8++;
                        int charAt = o16Var.f.charAt(i7) - '0';
                        if (charAt == 0) {
                            charAt = 10;
                        }
                        z3 = z5;
                        int i9 = 1;
                        while (i9 <= charAt) {
                            int i10 = charAt;
                            TextPaint textPaint3 = textPaint2;
                            n16Var.b.add(new StaticLayout(String.valueOf(i9 == 10 ? 0 : i9), textPaint3, (int) o16Var.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i9++;
                            textPaint2 = textPaint3;
                            charAt = i10;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new lx2((byte) 1), i7, i7 + 1, 0);
                    } else {
                        f6 = f2;
                        z3 = z5;
                        textPaint = textPaint2;
                    }
                    i7++;
                    textPaint2 = textPaint;
                    f2 = f6;
                    z5 = z3;
                }
                f5 = f2;
                z2 = z5;
                o16Var.n = new StaticLayout(spannableStringBuilder, textPaint2, gl.L(12.0f) + ((int) o16Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o16Var.r = true;
                    n16 n16Var2 = (n16) arrayList.get(i11);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n16Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new l16(o16Var, n16Var2, (byte) 1));
                    n16Var2.f.addListener(new m16(o16Var, n16Var2, (byte) 0));
                    n16Var2.f.setInterpolator(s33.g);
                    n16Var2.f.setDuration(750L);
                    n16Var2.f.setStartDelay(((arrayList.size() - 1) - i11) * 60);
                    n16Var2.f.start();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.j0 = ofFloat2;
                final float f10 = this.n;
                if (z2) {
                    this.n = this.b0;
                }
                final boolean z9 = !this.k0;
                this.k0 = true;
                final float f11 = f5;
                final boolean z10 = z2;
                final float f12 = f3;
                final float f13 = translationX;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j16
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i12 = LimitPreviewView.p0;
                        LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                        o16 o16Var2 = limitPreviewView2.e;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float min = Math.min(1.0f, floatValue);
                        if (floatValue > 1.0f && z9) {
                            if (!limitPreviewView2.H) {
                                limitPreviewView2.H = true;
                                try {
                                    o16Var2.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                            o16Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.c0);
                        } else if (!limitPreviewView2.k0) {
                            o16Var2.setRotation(limitPreviewView2.c0);
                        }
                        if (valueAnimator == limitPreviewView2.j0) {
                            o16Var2.setTranslationX(gl.R1(f13, f4, min));
                            float R1 = gl.R1(f11, f12, min);
                            if (o16Var2.s != R1) {
                                o16Var2.s = R1;
                                o16Var2.w = true;
                                o16Var2.invalidate();
                            }
                            o16Var2.setPivotX(o16Var2.getMeasuredWidth() * R1);
                        }
                        float min2 = Math.min(1.0f, 2.0f * min);
                        if (z10) {
                            limitPreviewView2.n = (int) gl.R1(limitPreviewView2.b0, f10, min);
                            limitPreviewView2.J.invalidate();
                        } else {
                            o16Var2.setScaleX(min2);
                            o16Var2.setScaleY(min2);
                        }
                        if (z6) {
                            o16Var2.setScaleX(gl.R1(0.6f, 1.0f, floatValue));
                            o16Var2.setScaleY(gl.R1(0.6f, 1.0f, floatValue));
                            o16Var2.setAlpha(floatValue);
                        } else if (z7) {
                            float f14 = 1.0f - floatValue;
                            o16Var2.setScaleX(gl.R1(0.6f, 1.0f, f14));
                            o16Var2.setScaleY(gl.R1(0.6f, 1.0f, f14));
                            o16Var2.setAlpha(f14);
                        }
                    }
                });
                this.j0.addListener(new id4((byte) 10, this, z9));
                this.j0.setInterpolator(new OvershootInterpolator());
                if (this.a0) {
                    ValueAnimator valueAnimator = this.j0;
                    if (z7) {
                        valueAnimator.setInterpolator(s33.i);
                        this.j0.setDuration(320L);
                    } else if (z6) {
                        valueAnimator.setInterpolator(s33.h);
                        this.j0.setDuration(500L);
                    } else {
                        valueAnimator.setDuration(1000L);
                        this.j0.setStartDelay(200L);
                    }
                } else {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ni4(this, (byte) 16));
                    ofFloat3.setDuration(500L);
                    ofFloat3.start();
                    this.j0.setDuration(600L);
                }
                this.j0.start();
                this.d = true;
            }
        }
        f5 = f2;
        z2 = z5;
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j0 = ofFloat22;
        final float f102 = this.n;
        if (z2) {
        }
        final boolean z92 = !this.k0;
        this.k0 = true;
        final float f112 = f5;
        final boolean z102 = z2;
        final float f122 = f3;
        final float f132 = translationX;
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j16
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i12 = LimitPreviewView.p0;
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                o16 o16Var2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z92) {
                    if (!limitPreviewView2.H) {
                        limitPreviewView2.H = true;
                        try {
                            o16Var2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    o16Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.c0);
                } else if (!limitPreviewView2.k0) {
                    o16Var2.setRotation(limitPreviewView2.c0);
                }
                if (valueAnimator2 == limitPreviewView2.j0) {
                    o16Var2.setTranslationX(gl.R1(f132, f4, min));
                    float R1 = gl.R1(f112, f122, min);
                    if (o16Var2.s != R1) {
                        o16Var2.s = R1;
                        o16Var2.w = true;
                        o16Var2.invalidate();
                    }
                    o16Var2.setPivotX(o16Var2.getMeasuredWidth() * R1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z102) {
                    limitPreviewView2.n = (int) gl.R1(limitPreviewView2.b0, f102, min);
                    limitPreviewView2.J.invalidate();
                } else {
                    o16Var2.setScaleX(min2);
                    o16Var2.setScaleY(min2);
                }
                if (z6) {
                    o16Var2.setScaleX(gl.R1(0.6f, 1.0f, floatValue));
                    o16Var2.setScaleY(gl.R1(0.6f, 1.0f, floatValue));
                    o16Var2.setAlpha(floatValue);
                } else if (z7) {
                    float f14 = 1.0f - floatValue;
                    o16Var2.setScaleX(gl.R1(0.6f, 1.0f, f14));
                    o16Var2.setScaleY(gl.R1(0.6f, 1.0f, f14));
                    o16Var2.setAlpha(f14);
                }
            }
        });
        this.j0.addListener(new id4((byte) 10, this, z92));
        this.j0.setInterpolator(new OvershootInterpolator());
        if (this.a0) {
        }
        this.j0.start();
        this.d = true;
    }

    public void setBagePosition(float f) {
        this.y = moe.a(f, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(p16 p16Var) {
        this.f0 = p16Var;
    }

    public void setHideNegativeValues(boolean z) {
        this.i0 = z;
    }

    public void setIconScale(float f) {
        this.s = f;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.E = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.M = false;
        setRatingPaintColorKey(bkb.Ei);
        long j = tl_starsRating.current_level_stars;
        long j2 = tl_starsRating.stars;
        hn hnVar = this.O;
        hn hnVar2 = this.w;
        if (j2 <= 0) {
            this.a = 0.5f;
            hnVar.setText("");
            hnVar2.setText(k96.M0(2131744936, null));
            setRatingPaintColorKey(bkb.mk);
            this.M = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level - 1)));
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = moe.a((j2 - j) / (r12 - j), 0.0f, 1.0f);
                hnVar.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level)));
                hnVar2.setText(k96.a0(null, null, 2131744937, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) hnVar2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    public void setStaticGradinet(mh8 mh8Var) {
        this.F = mh8Var;
    }

    public void setStatus(int i, int i2, boolean z) {
        if (this.b == i) {
            z = false;
        }
        this.b = i;
        this.a = moe.a(i / i2, 0.0f, 1.0f);
        if (z) {
            this.a0 = true;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
        }
        hn hnVar = this.w;
        ((FrameLayout.LayoutParams) hnVar.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        hnVar.setText(String.valueOf(i2));
        j(i, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i) {
        hn hnVar = this.w;
        int i2 = this.r;
        o16 o16Var = this.e;
        if (i == 6) {
            if (o16Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new cm2(i2, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (y6c.h(y6c.t0).p() ? "4 GB" : "2 GB"));
                o16Var.f = spannableStringBuilder;
            }
            hnVar.setText("4 GB");
            return;
        }
        if (i == 11) {
            if (o16Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new cm2(i2, 0), 0, 1, 0);
                o16Var.f = spannableStringBuilder2;
            }
            hnVar.setText("");
        }
    }

    @Override // tjb
    public final void updateColors() {
        hn hnVar;
        hn hnVar2;
        wjb wjbVar = this.T;
        try {
            if (this.o0 && (hnVar2 = this.O) != null) {
                hnVar2.setTextColor(bkb.v0(bkb.F6, wjbVar));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            if (this.m0 && (hnVar = this.w) != null) {
                hnVar.setTextColor(bkb.v0(bkb.F6, wjbVar));
            }
            int i = this.n0;
            if (i >= 0) {
                this.L.setColor(bkb.v0(i, wjbVar));
                jo0 jo0Var = this.J;
                if (jo0Var != null) {
                    jo0Var.invalidate();
                }
                o16 o16Var = this.e;
                if (o16Var != null) {
                    o16Var.invalidate();
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, wjb wjbVar) {
        this(context, i, i2, i3, 0.5f, wjbVar);
    }
}
