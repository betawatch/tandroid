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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class LimitPreviewView extends LinearLayout implements vlb {
    public static final /* synthetic */ int p0 = 0;
    public ViewGroup E;
    public nj8 F;
    public int G;
    public boolean H;
    public boolean I;
    public final jp0 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final io O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final ylb T;
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
    public final o36 e;
    public boolean e0;
    public boolean f;
    public p36 f0;
    public final yj3 g0;
    public float h;
    public final yj3 h0;
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
    public final io w;
    public final TextView x;
    public float y;

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, ylb ylbVar) {
        super(context);
        this.s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.e0 = true;
        this.n0 = -1;
        this.T = ylbVar;
        this.a = pqe.a(f, 0.1f, 0.9f);
        this.r = i;
        this.b = i2;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, gm.L(16.0f), 0, 0);
            o36 o36Var = new o36(this, context);
            this.e = o36Var;
            j(i2, false);
            o36Var.setPadding(gm.L(19.0f), gm.L(6.0f), gm.L(19.0f), gm.L(14.0f));
            addView(o36Var, qoe.p(-2, -2, 0.0f, 3));
        }
        yj3 yj3Var = new yj3(this, context, true);
        this.g0 = yj3Var;
        io ioVar = new io(context, false, false, false);
        this.O = ioVar;
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setTypeface(gm.o());
        ioVar.setText(jb6.M0(2131748738, null));
        ioVar.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(gm.o());
        textView.setText(String.format("%d", Integer.valueOf(i3)));
        textView.setGravity(16);
        anb.X(textView, cmb.F6, ylbVar);
        if (jb6.a0) {
            yj3Var.addView(ioVar, qoe.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yj3Var.addView(textView, qoe.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yj3Var.addView(ioVar, qoe.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yj3Var.addView(textView, qoe.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        yj3 yj3Var2 = new yj3(this, context, false);
        this.h0 = yj3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(gm.o());
        textView2.setText(jb6.M0(2131748736, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        io ioVar2 = new io(context, false, false, false);
        this.w = ioVar2;
        ioVar2.setTextSize(gm.L(14.0f));
        ioVar2.setTypeface(gm.o());
        ioVar2.setText(String.format("%d", Integer.valueOf(i3)));
        ioVar2.setGravity(21);
        setPremiumCountColor(true);
        if (jb6.a0) {
            yj3Var2.addView(textView2, qoe.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yj3Var2.addView(ioVar2, qoe.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yj3Var2.addView(textView2, qoe.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yj3Var2.addView(ioVar2, qoe.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        jp0 jp0Var = new jp0(this, context, ylbVar);
        this.J = jp0Var;
        jp0Var.addView(yj3Var, qoe.c(30.0f, -1));
        jp0Var.addView(yj3Var2, qoe.c(30.0f, -1));
        addView(jp0Var, qoe.q(-1, 30, 0.0f, 0, 14, i != 0 ? 12 : 0, 14, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f) {
        this.n = f >= 1.0f ? this.J.getMeasuredWidth() : 0;
        float L = gm.L(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 << 1)) * f) + L;
        o36 o36Var = this.e;
        o36Var.setTranslationX(Utilities.i(max - (o36Var.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - o36Var.getMeasuredWidth(), L));
        if (o36Var.s != f) {
            o36Var.s = f;
            o36Var.w = true;
            o36Var.invalidate();
        }
        o36Var.setPivotX(o36Var.getMeasuredWidth() * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTextColor(boolean z) {
        this.o0 = !z;
        this.O.setTextColor(z ? -1 : cmb.v0(cmb.F6, this.T));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiumCountColor(boolean z) {
        this.m0 = !z;
        this.w.setTextColor(z ? -1 : cmb.v0(cmb.F6, this.T));
    }

    private void setRatingPaintColorKey(int i) {
        this.n0 = i;
        this.L.setColor(cmb.v0(i, this.T));
    }

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z;
        gm.r(this.l0);
        this.l0 = null;
        int i = cmb.Ei;
        setRatingPaintColorKey(i);
        this.M = false;
        int i2 = tl_starsRating.level;
        int i3 = tl_starsRating2.level;
        jp0 jp0Var = this.J;
        io ioVar = this.w;
        io ioVar2 = this.O;
        final byte b = 1;
        if (i2 == i3) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                ioVar2.setText("");
                ioVar.setText(jb6.M0(2131744862, null));
                setRatingPaintColorKey(cmb.mk);
                this.M = true;
                z = false;
            } else {
                z = false;
                if (tl_starsRating2.next_level_stars == 0) {
                    this.a = 1.0f;
                    ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(i3 - 1)));
                    ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j = tl_starsRating2.current_level_stars;
                    this.a = pqe.a((r10 - j) / (r5 - j), 0.0f, 1.0f);
                    ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating2.level)));
                    ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.U = true;
            boolean z2 = z;
            this.V = z2;
            this.W = z2;
            this.b0 = this.n;
            jp0Var.requestLayout();
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
            jp0Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = ioVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            ioVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(d53Var).start();
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final byte b2 = 0;
            Runnable runnable = new Runnable(this) { // from class: k36
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
            gm.d3(runnable, 600L);
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
            jp0Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = ioVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            d53 d53Var2 = d53.h;
            duration2.setInterpolator(d53Var2).start();
            ioVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(d53Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) { // from class: k36
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
            gm.d3(runnable2, 600L);
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
            setRatingPaintColorKey(cmb.Ei);
            long j = tl_starsRating.stars;
            io ioVar = this.w;
            io ioVar2 = this.O;
            if (j <= 0) {
                this.a = 0.0f;
                ioVar2.setText("");
                ioVar.setText(jb6.M0(2131744862, null));
                setRatingPaintColorKey(cmb.mk);
                this.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j2 = tl_starsRating.current_level_stars;
                    z = false;
                    this.a = pqe.a((j - j2) / (r14 - j2), 0.0f, 1.0f);
                    ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level)));
                    ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level + 1)));
                    setArrowX(0.0f);
                    o36 o36Var = this.e;
                    o36Var.setScaleX(0.6f);
                    o36Var.setScaleY(0.6f);
                    o36Var.setAlpha(0.0f);
                    this.U = true;
                    this.V = true;
                    this.W = z;
                    this.b0 = this.n;
                    this.J.requestLayout();
                    requestLayout();
                    ViewPropertyAnimator duration = ioVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    d53 d53Var = d53.h;
                    duration.setInterpolator(d53Var).start();
                    ioVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(d53Var).start();
                    setPremiumCountColor(this.M);
                    setDefaultTextColor(true);
                    i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                this.a = 1.0f;
                ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level - 1)));
                ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level)));
            }
            z = false;
            setArrowX(0.0f);
            o36 o36Var2 = this.e;
            o36Var2.setScaleX(0.6f);
            o36Var2.setScaleY(0.6f);
            o36Var2.setAlpha(0.0f);
            this.U = true;
            this.V = true;
            this.W = z;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = ioVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            d53 d53Var2 = d53.h;
            duration2.setInterpolator(d53Var2).start();
            ioVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(d53Var2).start();
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
            setRatingPaintColorKey(cmb.Ei);
            long j = tl_starsRating.stars;
            io ioVar = this.w;
            io ioVar2 = this.O;
            if (j <= 0) {
                this.a = 0.5f;
                ioVar2.setText("");
                ioVar.setText(jb6.M0(2131744862, null));
                setRatingPaintColorKey(cmb.mk);
                this.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j2 = tl_starsRating.current_level_stars;
                    z = false;
                    this.a = pqe.a((j - j2) / (r14 - j2), 0.0f, 1.0f);
                    ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level)));
                    ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level + 1)));
                    setArrowX(1.0f);
                    o36 o36Var = this.e;
                    o36Var.setScaleX(0.6f);
                    o36Var.setScaleY(0.6f);
                    o36Var.setAlpha(0.0f);
                    this.U = true;
                    this.V = true;
                    this.W = z;
                    this.b0 = this.n;
                    this.J.requestLayout();
                    requestLayout();
                    ViewPropertyAnimator duration = ioVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    d53 d53Var = d53.h;
                    duration.setInterpolator(d53Var).start();
                    ioVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(d53Var).start();
                    setPremiumCountColor(this.M);
                    setDefaultTextColor(true);
                    i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                this.a = 1.0f;
                ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level - 1)));
                ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level)));
            }
            z = false;
            setArrowX(1.0f);
            o36 o36Var2 = this.e;
            o36Var2.setScaleX(0.6f);
            o36Var2.setScaleY(0.6f);
            o36Var2.setAlpha(0.0f);
            this.U = true;
            this.V = true;
            this.W = z;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = ioVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            d53 d53Var2 = d53.h;
            duration2.setInterpolator(d53Var2).start();
            ioVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(d53Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public final void h(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.boosts;
        io ioVar = this.O;
        io ioVar2 = this.w;
        if ((i2 == i3 && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            ioVar.setText(jb6.a0("BoostsLevel", null, 2131753125, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            ioVar2.setText(jb6.a0("BoostsLevel", null, 2131753125, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = pqe.a((i3 - i2) / (i - i2), 0.0f, 1.0f);
            ioVar.setText(jb6.a0("BoostsLevel", null, 2131753125, Integer.valueOf(tL_premium_boostsStatus.level)));
            ioVar2.setText(jb6.a0("BoostsLevel", null, 2131753125, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) ioVar2.getLayoutParams()).gravity = 5;
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new pn2(this.r, 0), 0, 1, 0);
        byte b = 2;
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i > 1200 ? jb6.S(null, i) : jb6.E(i, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i2 > 1200 ? jb6.S(null, i2) : jb6.E(i2, ',')));
        spannableStringBuilder.setSpan(new rl(b, nm7.z2, z), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        o36 o36Var = this.e;
        o36Var.f = spannableStringBuilder;
        o36Var.requestLayout();
    }

    public final void j(int i, boolean z) {
        pn2 pn2Var;
        byte b = 0;
        if (i < 0) {
            pn2Var = new pn2(R.drawable.warning_sign, 0);
        } else {
            pn2Var = new pn2(this.r, 0);
            float f = this.s;
            pn2Var.I = f;
            pn2Var.J = f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b2 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(pn2Var, 0, 1, 0);
        if (i >= 0 || !this.i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) jb6.E(i, ','));
        }
        o36 o36Var = this.e;
        if (z) {
            SpannableStringBuilder spannableStringBuilder2 = o36Var.f;
            o36Var.f = spannableStringBuilder;
            TextPaint textPaint = o36Var.c;
            ArrayList arrayList = o36Var.h;
            if (o36Var.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(o36Var.f);
                int length = o36Var.f.length() - 1;
                int i2 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt != o36Var.f.charAt(length) && Character.isDigit(o36Var.f.charAt(length))) {
                        n36 n36Var = new n36();
                        arrayList.add(n36Var);
                        n36Var.e = o36Var.d.getSecondaryHorizontal(length);
                        n36Var.a = true;
                        if (i2 >= 1) {
                            i2 = 0;
                        }
                        int i3 = i2 + 1;
                        String valueOf = String.valueOf(charAt);
                        int i4 = (int) o36Var.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        StaticLayout staticLayout = new StaticLayout(valueOf, textPaint, i4, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = n36Var.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout(String.valueOf(o36Var.f.charAt(length)), textPaint, (int) o36Var.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new vy2(b2), length, length + 1, 0);
                        i2 = i3;
                    }
                    length--;
                }
                o36Var.n = new StaticLayout(spannableStringBuilder3, textPaint, gm.L(12.0f) + ((int) o36Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    o36Var.r = true;
                    n36 n36Var2 = (n36) arrayList.get(i5);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n36Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new l36(o36Var, n36Var2, b));
                    n36Var2.f.addListener(new m36(o36Var, n36Var2, b2));
                    n36Var2.f.setInterpolator(d53.g);
                    n36Var2.f.setDuration(250L);
                    n36Var2.f.setStartDelay(((arrayList.size() - 1) - i5) * 60);
                    n36Var2.f.start();
                }
            }
        } else {
            o36Var.f = spannableStringBuilder;
        }
        o36Var.requestLayout();
    }

    public final void k(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(cmb.Ei);
        this.a = gm.x1(j, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(jb6.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = jb6.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        io ioVar = this.w;
        ioVar.setText(H);
        ((FrameLayout.LayoutParams) ioVar.getLayoutParams()).gravity = 5;
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
        o36 o36Var = this.e;
        if (!z4 && !this.U && (this.d || o36Var == null || !this.I || this.K)) {
            if (this.Q) {
                if (this.V || this.W) {
                    return;
                }
                o36Var.setAlpha(1.0f);
                o36Var.setScaleX(1.0f);
                o36Var.setScaleY(1.0f);
                return;
            }
            if (!this.K) {
                if (o36Var != null) {
                    o36Var.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 << 1)) * 0.5f) + gm.L(14.0f)) - (o36Var.getMeasuredWidth() / 2.0f);
            if (this.d) {
                o36Var.setAlpha(1.0f);
                o36Var.setScaleX(1.0f);
                o36Var.setScaleY(1.0f);
            } else if (this.I) {
                this.d = true;
                o36Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else {
                o36Var.setAlpha(0.0f);
                o36Var.setScaleX(0.0f);
                o36Var.setScaleY(0.0f);
            }
            o36Var.setTranslationX(measuredWidth2);
            return;
        }
        int L = gm.L(14.0f);
        boolean z5 = this.U || this.a0;
        this.a0 = false;
        this.U = false;
        float translationX = z5 ? o36Var.getTranslationX() : 0.0f;
        float f8 = L;
        int i5 = L << 1;
        float max = (Math.max(this.n, (getMeasuredWidth() - i5) * this.y) + f8) - (o36Var.getMeasuredWidth() / 2.0f);
        if (this.R) {
            float f9 = o36Var.s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L) - o36Var.getMeasuredWidth(), f8);
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
                f3 = Utilities.i((this.n - (measuredWidth - f8)) / o36Var.getMeasuredWidth(), 1.0f, 0.0f);
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
            if (f8 > (getMeasuredWidth() - L) - o36Var.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - L) - o36Var.getMeasuredWidth();
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
            o36Var.setAlpha(1.0f);
        }
        o36Var.setTranslationX(translationX);
        o36Var.setPivotX(o36Var.getMeasuredWidth() / 2.0f);
        o36Var.setPivotY(o36Var.getMeasuredHeight());
        if (!z5) {
            o36Var.setScaleX(0.0f);
            o36Var.setScaleY(0.0f);
            TextPaint textPaint2 = o36Var.c;
            ArrayList arrayList = o36Var.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = o36Var.E;
            if (!limitPreviewView.Q || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(o36Var.f);
                int i7 = 0;
                int i8 = 0;
                boolean z8 = true;
                while (i7 < o36Var.f.length()) {
                    if (Character.isDigit(o36Var.f.charAt(i7))) {
                        n36 n36Var = new n36();
                        arrayList.add(n36Var);
                        f6 = f2;
                        n36Var.e = o36Var.d.getSecondaryHorizontal(i7);
                        n36Var.d = z8;
                        if (i8 >= 1) {
                            z8 = !z8;
                            i8 = 0;
                        }
                        i8++;
                        int charAt = o36Var.f.charAt(i7) - '0';
                        if (charAt == 0) {
                            charAt = 10;
                        }
                        z3 = z5;
                        int i9 = 1;
                        while (i9 <= charAt) {
                            int i10 = charAt;
                            TextPaint textPaint3 = textPaint2;
                            n36Var.b.add(new StaticLayout(String.valueOf(i9 == 10 ? 0 : i9), textPaint3, (int) o36Var.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i9++;
                            textPaint2 = textPaint3;
                            charAt = i10;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new vy2((byte) 1), i7, i7 + 1, 0);
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
                o36Var.n = new StaticLayout(spannableStringBuilder, textPaint2, gm.L(12.0f) + ((int) o36Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o36Var.r = true;
                    n36 n36Var2 = (n36) arrayList.get(i11);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n36Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new l36(o36Var, n36Var2, (byte) 1));
                    n36Var2.f.addListener(new m36(o36Var, n36Var2, (byte) 0));
                    n36Var2.f.setInterpolator(d53.g);
                    n36Var2.f.setDuration(750L);
                    n36Var2.f.setStartDelay(((arrayList.size() - 1) - i11) * 60);
                    n36Var2.f.start();
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
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j36
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i12 = LimitPreviewView.p0;
                        LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                        o36 o36Var2 = limitPreviewView2.e;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float min = Math.min(1.0f, floatValue);
                        if (floatValue > 1.0f && z9) {
                            if (!limitPreviewView2.H) {
                                limitPreviewView2.H = true;
                                try {
                                    o36Var2.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                            o36Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.c0);
                        } else if (!limitPreviewView2.k0) {
                            o36Var2.setRotation(limitPreviewView2.c0);
                        }
                        if (valueAnimator == limitPreviewView2.j0) {
                            o36Var2.setTranslationX(gm.R1(f13, f4, min));
                            float R1 = gm.R1(f11, f12, min);
                            if (o36Var2.s != R1) {
                                o36Var2.s = R1;
                                o36Var2.w = true;
                                o36Var2.invalidate();
                            }
                            o36Var2.setPivotX(o36Var2.getMeasuredWidth() * R1);
                        }
                        float min2 = Math.min(1.0f, 2.0f * min);
                        if (z10) {
                            limitPreviewView2.n = (int) gm.R1(limitPreviewView2.b0, f10, min);
                            limitPreviewView2.J.invalidate();
                        } else {
                            o36Var2.setScaleX(min2);
                            o36Var2.setScaleY(min2);
                        }
                        if (z6) {
                            o36Var2.setScaleX(gm.R1(0.6f, 1.0f, floatValue));
                            o36Var2.setScaleY(gm.R1(0.6f, 1.0f, floatValue));
                            o36Var2.setAlpha(floatValue);
                        } else if (z7) {
                            float f14 = 1.0f - floatValue;
                            o36Var2.setScaleX(gm.R1(0.6f, 1.0f, f14));
                            o36Var2.setScaleY(gm.R1(0.6f, 1.0f, f14));
                            o36Var2.setAlpha(f14);
                        }
                    }
                });
                this.j0.addListener(new jf4((byte) 10, this, z9));
                this.j0.setInterpolator(new OvershootInterpolator());
                if (this.a0) {
                    ValueAnimator valueAnimator = this.j0;
                    if (z7) {
                        valueAnimator.setInterpolator(d53.i);
                        this.j0.setDuration(320L);
                    } else if (z6) {
                        valueAnimator.setInterpolator(d53.h);
                        this.j0.setDuration(500L);
                    } else {
                        valueAnimator.setDuration(1000L);
                        this.j0.setStartDelay(200L);
                    }
                } else {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new fh4(this, (byte) 18));
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
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j36
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i12 = LimitPreviewView.p0;
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                o36 o36Var2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z92) {
                    if (!limitPreviewView2.H) {
                        limitPreviewView2.H = true;
                        try {
                            o36Var2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    o36Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.c0);
                } else if (!limitPreviewView2.k0) {
                    o36Var2.setRotation(limitPreviewView2.c0);
                }
                if (valueAnimator2 == limitPreviewView2.j0) {
                    o36Var2.setTranslationX(gm.R1(f132, f4, min));
                    float R1 = gm.R1(f112, f122, min);
                    if (o36Var2.s != R1) {
                        o36Var2.s = R1;
                        o36Var2.w = true;
                        o36Var2.invalidate();
                    }
                    o36Var2.setPivotX(o36Var2.getMeasuredWidth() * R1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z102) {
                    limitPreviewView2.n = (int) gm.R1(limitPreviewView2.b0, f102, min);
                    limitPreviewView2.J.invalidate();
                } else {
                    o36Var2.setScaleX(min2);
                    o36Var2.setScaleY(min2);
                }
                if (z6) {
                    o36Var2.setScaleX(gm.R1(0.6f, 1.0f, floatValue));
                    o36Var2.setScaleY(gm.R1(0.6f, 1.0f, floatValue));
                    o36Var2.setAlpha(floatValue);
                } else if (z7) {
                    float f14 = 1.0f - floatValue;
                    o36Var2.setScaleX(gm.R1(0.6f, 1.0f, f14));
                    o36Var2.setScaleY(gm.R1(0.6f, 1.0f, f14));
                    o36Var2.setAlpha(f14);
                }
            }
        });
        this.j0.addListener(new jf4((byte) 10, this, z92));
        this.j0.setInterpolator(new OvershootInterpolator());
        if (this.a0) {
        }
        this.j0.start();
        this.d = true;
    }

    public void setBagePosition(float f) {
        this.y = pqe.a(f, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(p36 p36Var) {
        this.f0 = p36Var;
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
        setRatingPaintColorKey(cmb.Ei);
        long j = tl_starsRating.current_level_stars;
        long j2 = tl_starsRating.stars;
        io ioVar = this.O;
        io ioVar2 = this.w;
        if (j2 <= 0) {
            this.a = 0.5f;
            ioVar.setText("");
            ioVar2.setText(jb6.M0(2131744862, null));
            setRatingPaintColorKey(cmb.mk);
            this.M = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level - 1)));
                ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = pqe.a((j2 - j) / (r12 - j), 0.0f, 1.0f);
                ioVar.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level)));
                ioVar2.setText(jb6.a0(null, null, 2131744863, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) ioVar2.getLayoutParams()).gravity = 5;
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

    public void setStaticGradinet(nj8 nj8Var) {
        this.F = nj8Var;
    }

    public void setStatus(int i, int i2, boolean z) {
        if (this.b == i) {
            z = false;
        }
        this.b = i;
        this.a = pqe.a(i / i2, 0.0f, 1.0f);
        if (z) {
            this.a0 = true;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
        }
        io ioVar = this.w;
        ((FrameLayout.LayoutParams) ioVar.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        ioVar.setText(String.valueOf(i2));
        j(i, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i) {
        io ioVar = this.w;
        int i2 = this.r;
        o36 o36Var = this.e;
        if (i == 6) {
            if (o36Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new pn2(i2, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (z8c.h(z8c.t0).p() ? "4 GB" : "2 GB"));
                o36Var.f = spannableStringBuilder;
            }
            ioVar.setText("4 GB");
            return;
        }
        if (i == 11) {
            if (o36Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new pn2(i2, 0), 0, 1, 0);
                o36Var.f = spannableStringBuilder2;
            }
            ioVar.setText("");
        }
    }

    @Override // vlb
    public final void updateColors() {
        io ioVar;
        io ioVar2;
        ylb ylbVar = this.T;
        try {
            if (this.o0 && (ioVar2 = this.O) != null) {
                ioVar2.setTextColor(cmb.v0(cmb.F6, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            if (this.m0 && (ioVar = this.w) != null) {
                ioVar.setTextColor(cmb.v0(cmb.F6, ylbVar));
            }
            int i = this.n0;
            if (i >= 0) {
                this.L.setColor(cmb.v0(i, ylbVar));
                jp0 jp0Var = this.J;
                if (jp0Var != null) {
                    jp0Var.invalidate();
                }
                o36 o36Var = this.e;
                if (o36Var != null) {
                    o36Var.invalidate();
                }
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, ylb ylbVar) {
        this(context, i, i2, i3, 0.5f, ylbVar);
    }
}
