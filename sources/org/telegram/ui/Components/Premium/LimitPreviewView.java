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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class LimitPreviewView extends LinearLayout implements snb {
    public static final /* synthetic */ int p0 = 0;
    public ViewGroup E;
    public al8 F;
    public int G;
    public boolean H;
    public boolean I;
    public final jo0 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final in O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final vnb T;
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
    public final s36 e;
    public boolean e0;
    public boolean f;
    public t36 f0;
    public final gj3 g0;
    public float h;
    public final gj3 h0;
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
    public final in w;
    public final TextView x;
    public float y;

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, vnb vnbVar) {
        super(context);
        this.s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.e0 = true;
        this.n0 = -1;
        this.T = vnbVar;
        this.a = ete.a(f, 0.1f, 0.9f);
        this.r = i;
        this.b = i2;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, hl.L(16.0f), 0, 0);
            s36 s36Var = new s36(this, context);
            this.e = s36Var;
            j(i2, false);
            s36Var.setPadding(hl.L(19.0f), hl.L(6.0f), hl.L(19.0f), hl.L(14.0f));
            addView(s36Var, tre.p(-2, -2, 0.0f, 3));
        }
        gj3 gj3Var = new gj3(this, context, true);
        this.g0 = gj3Var;
        in inVar = new in(context, false, false, false);
        this.O = inVar;
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.o());
        inVar.setText(ob6.M0(2131748735, null));
        inVar.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(hl.o());
        textView.setText(String.format("%d", Integer.valueOf(i3)));
        textView.setGravity(16);
        yob.X(textView, aob.G6, vnbVar);
        if (ob6.a0) {
            gj3Var.addView(inVar, tre.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var.addView(textView, tre.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gj3Var.addView(inVar, tre.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var.addView(textView, tre.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        gj3 gj3Var2 = new gj3(this, context, false);
        this.h0 = gj3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131748733, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        in inVar2 = new in(context, false, false, false);
        this.w = inVar2;
        inVar2.setTextSize(hl.L(14.0f));
        inVar2.setTypeface(hl.o());
        inVar2.setText(String.format("%d", Integer.valueOf(i3)));
        inVar2.setGravity(21);
        setPremiumCountColor(true);
        if (ob6.a0) {
            gj3Var2.addView(textView2, tre.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var2.addView(inVar2, tre.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gj3Var2.addView(textView2, tre.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gj3Var2.addView(inVar2, tre.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        jo0 jo0Var = new jo0(this, context, vnbVar);
        this.J = jo0Var;
        jo0Var.addView(gj3Var, tre.c(30.0f, -1));
        jo0Var.addView(gj3Var2, tre.c(30.0f, -1));
        addView(jo0Var, tre.q(-1, 30, 0.0f, 0, 14, i != 0 ? 12 : 0, 14, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f) {
        this.n = f >= 1.0f ? this.J.getMeasuredWidth() : 0;
        float L = hl.L(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 << 1)) * f) + L;
        s36 s36Var = this.e;
        s36Var.setTranslationX(Utilities.i(max - (s36Var.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - s36Var.getMeasuredWidth(), L));
        if (s36Var.s != f) {
            s36Var.s = f;
            s36Var.w = true;
            s36Var.invalidate();
        }
        s36Var.setPivotX(s36Var.getMeasuredWidth() * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTextColor(boolean z) {
        this.o0 = !z;
        this.O.setTextColor(z ? -1 : aob.v0(aob.G6, this.T));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiumCountColor(boolean z) {
        this.m0 = !z;
        this.w.setTextColor(z ? -1 : aob.v0(aob.G6, this.T));
    }

    private void setRatingPaintColorKey(int i) {
        this.n0 = i;
        this.L.setColor(aob.v0(i, this.T));
    }

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z;
        hl.r(this.l0);
        this.l0 = null;
        int i = aob.Fi;
        setRatingPaintColorKey(i);
        this.M = false;
        int i2 = tl_starsRating.level;
        int i3 = tl_starsRating2.level;
        jo0 jo0Var = this.J;
        in inVar = this.w;
        in inVar2 = this.O;
        final byte b = 1;
        if (i2 == i3) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                inVar2.setText("");
                inVar.setText(ob6.M0(2131744830, null));
                setRatingPaintColorKey(aob.nk);
                this.M = true;
                z = false;
            } else {
                z = false;
                if (tl_starsRating2.next_level_stars == 0) {
                    this.a = 1.0f;
                    inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(i3 - 1)));
                    inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j = tl_starsRating2.current_level_stars;
                    this.a = ete.a((r10 - j) / (r5 - j), 0.0f, 1.0f);
                    inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating2.level)));
                    inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating2.level + 1)));
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
            ViewPropertyAnimator duration = inVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            inVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(k43Var).start();
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final byte b2 = 0;
            Runnable runnable = new Runnable(this) { // from class: o36
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
            hl.d3(runnable, 600L);
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
            ViewPropertyAnimator duration2 = inVar2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            k43 k43Var2 = k43.h;
            duration2.setInterpolator(k43Var2).start();
            inVar.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(k43Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) { // from class: o36
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
            hl.d3(runnable2, 600L);
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
            setRatingPaintColorKey(aob.Fi);
            long j = tl_starsRating.stars;
            in inVar = this.w;
            in inVar2 = this.O;
            if (j <= 0) {
                this.a = 0.0f;
                inVar2.setText("");
                inVar.setText(ob6.M0(2131744830, null));
                setRatingPaintColorKey(aob.nk);
                this.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j2 = tl_starsRating.current_level_stars;
                    z = false;
                    this.a = ete.a((j - j2) / (r14 - j2), 0.0f, 1.0f);
                    inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
                    inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level + 1)));
                    setArrowX(0.0f);
                    s36 s36Var = this.e;
                    s36Var.setScaleX(0.6f);
                    s36Var.setScaleY(0.6f);
                    s36Var.setAlpha(0.0f);
                    this.U = true;
                    this.V = true;
                    this.W = z;
                    this.b0 = this.n;
                    this.J.requestLayout();
                    requestLayout();
                    ViewPropertyAnimator duration = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    k43 k43Var = k43.h;
                    duration.setInterpolator(k43Var).start();
                    inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var).start();
                    setPremiumCountColor(this.M);
                    setDefaultTextColor(true);
                    i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                this.a = 1.0f;
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level - 1)));
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
            }
            z = false;
            setArrowX(0.0f);
            s36 s36Var2 = this.e;
            s36Var2.setScaleX(0.6f);
            s36Var2.setScaleY(0.6f);
            s36Var2.setAlpha(0.0f);
            this.U = true;
            this.V = true;
            this.W = z;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            k43 k43Var2 = k43.h;
            duration2.setInterpolator(k43Var2).start();
            inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var2).start();
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
            setRatingPaintColorKey(aob.Fi);
            long j = tl_starsRating.stars;
            in inVar = this.w;
            in inVar2 = this.O;
            if (j <= 0) {
                this.a = 0.5f;
                inVar2.setText("");
                inVar.setText(ob6.M0(2131744830, null));
                setRatingPaintColorKey(aob.nk);
                this.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j2 = tl_starsRating.current_level_stars;
                    z = false;
                    this.a = ete.a((j - j2) / (r14 - j2), 0.0f, 1.0f);
                    inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
                    inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level + 1)));
                    setArrowX(1.0f);
                    s36 s36Var = this.e;
                    s36Var.setScaleX(0.6f);
                    s36Var.setScaleY(0.6f);
                    s36Var.setAlpha(0.0f);
                    this.U = true;
                    this.V = true;
                    this.W = z;
                    this.b0 = this.n;
                    this.J.requestLayout();
                    requestLayout();
                    ViewPropertyAnimator duration = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    k43 k43Var = k43.h;
                    duration.setInterpolator(k43Var).start();
                    inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var).start();
                    setPremiumCountColor(this.M);
                    setDefaultTextColor(true);
                    i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                this.a = 1.0f;
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level - 1)));
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
            }
            z = false;
            setArrowX(1.0f);
            s36 s36Var2 = this.e;
            s36Var2.setScaleX(0.6f);
            s36Var2.setScaleY(0.6f);
            s36Var2.setAlpha(0.0f);
            this.U = true;
            this.V = true;
            this.W = z;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            k43 k43Var2 = k43.h;
            duration2.setInterpolator(k43Var2).start();
            inVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(k43Var2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            i((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public final void h(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.boosts;
        in inVar = this.O;
        in inVar2 = this.w;
        if ((i2 == i3 && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            inVar.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            inVar2.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = ete.a((i3 - i2) / (i - i2), 0.0f, 1.0f);
            inVar.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level)));
            inVar2.setText(ob6.a0("BoostsLevel", null, 2131753153, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) inVar2.getLayoutParams()).gravity = 5;
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new wm2(this.r, 0), 0, 1, 0);
        byte b = 2;
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i > 1200 ? ob6.S(null, i) : ob6.E(i, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i2 > 1200 ? ob6.S(null, i2) : ob6.E(i2, ',')));
        spannableStringBuilder.setSpan(new sk(b, jn7.z2, z), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s36 s36Var = this.e;
        s36Var.f = spannableStringBuilder;
        s36Var.requestLayout();
    }

    public final void j(int i, boolean z) {
        wm2 wm2Var;
        byte b = 0;
        if (i < 0) {
            wm2Var = new wm2(R.drawable.warning_sign, 0);
        } else {
            wm2Var = new wm2(this.r, 0);
            float f = this.s;
            wm2Var.I = f;
            wm2Var.J = f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b2 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(wm2Var, 0, 1, 0);
        if (i >= 0 || !this.i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) ob6.E(i, ','));
        }
        s36 s36Var = this.e;
        if (z) {
            SpannableStringBuilder spannableStringBuilder2 = s36Var.f;
            s36Var.f = spannableStringBuilder;
            TextPaint textPaint = s36Var.c;
            ArrayList arrayList = s36Var.h;
            if (s36Var.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(s36Var.f);
                int length = s36Var.f.length() - 1;
                int i2 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt != s36Var.f.charAt(length) && Character.isDigit(s36Var.f.charAt(length))) {
                        r36 r36Var = new r36();
                        arrayList.add(r36Var);
                        r36Var.e = s36Var.d.getSecondaryHorizontal(length);
                        r36Var.a = true;
                        if (i2 >= 1) {
                            i2 = 0;
                        }
                        int i3 = i2 + 1;
                        String valueOf = String.valueOf(charAt);
                        int i4 = (int) s36Var.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        StaticLayout staticLayout = new StaticLayout(valueOf, textPaint, i4, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = r36Var.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout(String.valueOf(s36Var.f.charAt(length)), textPaint, (int) s36Var.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new fy2(b2), length, length + 1, 0);
                        i2 = i3;
                    }
                    length--;
                }
                s36Var.n = new StaticLayout(spannableStringBuilder3, textPaint, hl.L(12.0f) + ((int) s36Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    s36Var.r = true;
                    r36 r36Var2 = (r36) arrayList.get(i5);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    r36Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new p36(s36Var, r36Var2, b));
                    r36Var2.f.addListener(new q36(s36Var, r36Var2, b2));
                    r36Var2.f.setInterpolator(k43.g);
                    r36Var2.f.setDuration(250L);
                    r36Var2.f.setStartDelay(((arrayList.size() - 1) - i5) * 60);
                    r36Var2.f.start();
                }
            }
        } else {
            s36Var.f = spannableStringBuilder;
        }
        s36Var.requestLayout();
    }

    public final void k(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(aob.Fi);
        this.a = hl.x1(j, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(ob6.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = ob6.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        in inVar = this.w;
        inVar.setText(H);
        ((FrameLayout.LayoutParams) inVar.getLayoutParams()).gravity = 5;
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
        s36 s36Var = this.e;
        if (!z4 && !this.U && (this.d || s36Var == null || !this.I || this.K)) {
            if (this.Q) {
                if (this.V || this.W) {
                    return;
                }
                s36Var.setAlpha(1.0f);
                s36Var.setScaleX(1.0f);
                s36Var.setScaleY(1.0f);
                return;
            }
            if (!this.K) {
                if (s36Var != null) {
                    s36Var.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 << 1)) * 0.5f) + hl.L(14.0f)) - (s36Var.getMeasuredWidth() / 2.0f);
            if (this.d) {
                s36Var.setAlpha(1.0f);
                s36Var.setScaleX(1.0f);
                s36Var.setScaleY(1.0f);
            } else if (this.I) {
                this.d = true;
                s36Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else {
                s36Var.setAlpha(0.0f);
                s36Var.setScaleX(0.0f);
                s36Var.setScaleY(0.0f);
            }
            s36Var.setTranslationX(measuredWidth2);
            return;
        }
        int L = hl.L(14.0f);
        boolean z5 = this.U || this.a0;
        this.a0 = false;
        this.U = false;
        float translationX = z5 ? s36Var.getTranslationX() : 0.0f;
        float f8 = L;
        int i5 = L << 1;
        float max = (Math.max(this.n, (getMeasuredWidth() - i5) * this.y) + f8) - (s36Var.getMeasuredWidth() / 2.0f);
        if (this.R) {
            float f9 = s36Var.s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L) - s36Var.getMeasuredWidth(), f8);
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
                f3 = Utilities.i((this.n - (measuredWidth - f8)) / s36Var.getMeasuredWidth(), 1.0f, 0.0f);
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
            if (f8 > (getMeasuredWidth() - L) - s36Var.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - L) - s36Var.getMeasuredWidth();
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
            s36Var.setAlpha(1.0f);
        }
        s36Var.setTranslationX(translationX);
        s36Var.setPivotX(s36Var.getMeasuredWidth() / 2.0f);
        s36Var.setPivotY(s36Var.getMeasuredHeight());
        if (!z5) {
            s36Var.setScaleX(0.0f);
            s36Var.setScaleY(0.0f);
            TextPaint textPaint2 = s36Var.c;
            ArrayList arrayList = s36Var.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = s36Var.E;
            if (!limitPreviewView.Q || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s36Var.f);
                int i7 = 0;
                int i8 = 0;
                boolean z8 = true;
                while (i7 < s36Var.f.length()) {
                    if (Character.isDigit(s36Var.f.charAt(i7))) {
                        r36 r36Var = new r36();
                        arrayList.add(r36Var);
                        f6 = f2;
                        r36Var.e = s36Var.d.getSecondaryHorizontal(i7);
                        r36Var.d = z8;
                        if (i8 >= 1) {
                            z8 = !z8;
                            i8 = 0;
                        }
                        i8++;
                        int charAt = s36Var.f.charAt(i7) - '0';
                        if (charAt == 0) {
                            charAt = 10;
                        }
                        z3 = z5;
                        int i9 = 1;
                        while (i9 <= charAt) {
                            int i10 = charAt;
                            TextPaint textPaint3 = textPaint2;
                            r36Var.b.add(new StaticLayout(String.valueOf(i9 == 10 ? 0 : i9), textPaint3, (int) s36Var.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i9++;
                            textPaint2 = textPaint3;
                            charAt = i10;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new fy2((byte) 1), i7, i7 + 1, 0);
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
                s36Var.n = new StaticLayout(spannableStringBuilder, textPaint2, hl.L(12.0f) + ((int) s36Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    s36Var.r = true;
                    r36 r36Var2 = (r36) arrayList.get(i11);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    r36Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new p36(s36Var, r36Var2, (byte) 1));
                    r36Var2.f.addListener(new q36(s36Var, r36Var2, (byte) 0));
                    r36Var2.f.setInterpolator(k43.g);
                    r36Var2.f.setDuration(750L);
                    r36Var2.f.setStartDelay(((arrayList.size() - 1) - i11) * 60);
                    r36Var2.f.start();
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
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n36
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i12 = LimitPreviewView.p0;
                        LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                        s36 s36Var2 = limitPreviewView2.e;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float min = Math.min(1.0f, floatValue);
                        if (floatValue > 1.0f && z9) {
                            if (!limitPreviewView2.H) {
                                limitPreviewView2.H = true;
                                try {
                                    s36Var2.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                            s36Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.c0);
                        } else if (!limitPreviewView2.k0) {
                            s36Var2.setRotation(limitPreviewView2.c0);
                        }
                        if (valueAnimator == limitPreviewView2.j0) {
                            s36Var2.setTranslationX(hl.R1(f13, f4, min));
                            float R1 = hl.R1(f11, f12, min);
                            if (s36Var2.s != R1) {
                                s36Var2.s = R1;
                                s36Var2.w = true;
                                s36Var2.invalidate();
                            }
                            s36Var2.setPivotX(s36Var2.getMeasuredWidth() * R1);
                        }
                        float min2 = Math.min(1.0f, 2.0f * min);
                        if (z10) {
                            limitPreviewView2.n = (int) hl.R1(limitPreviewView2.b0, f10, min);
                            limitPreviewView2.J.invalidate();
                        } else {
                            s36Var2.setScaleX(min2);
                            s36Var2.setScaleY(min2);
                        }
                        if (z6) {
                            s36Var2.setScaleX(hl.R1(0.6f, 1.0f, floatValue));
                            s36Var2.setScaleY(hl.R1(0.6f, 1.0f, floatValue));
                            s36Var2.setAlpha(floatValue);
                        } else if (z7) {
                            float f14 = 1.0f - floatValue;
                            s36Var2.setScaleX(hl.R1(0.6f, 1.0f, f14));
                            s36Var2.setScaleY(hl.R1(0.6f, 1.0f, f14));
                            s36Var2.setAlpha(f14);
                        }
                    }
                });
                this.j0.addListener(new gf4((byte) 10, this, z9));
                this.j0.setInterpolator(new OvershootInterpolator());
                if (this.a0) {
                    ValueAnimator valueAnimator = this.j0;
                    if (z7) {
                        valueAnimator.setInterpolator(k43.i);
                        this.j0.setDuration(320L);
                    } else if (z6) {
                        valueAnimator.setInterpolator(k43.h);
                        this.j0.setDuration(500L);
                    } else {
                        valueAnimator.setDuration(1000L);
                        this.j0.setStartDelay(200L);
                    }
                } else {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new ch4(this, (byte) 18));
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
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n36
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i12 = LimitPreviewView.p0;
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                s36 s36Var2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z92) {
                    if (!limitPreviewView2.H) {
                        limitPreviewView2.H = true;
                        try {
                            s36Var2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    s36Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.c0);
                } else if (!limitPreviewView2.k0) {
                    s36Var2.setRotation(limitPreviewView2.c0);
                }
                if (valueAnimator2 == limitPreviewView2.j0) {
                    s36Var2.setTranslationX(hl.R1(f132, f4, min));
                    float R1 = hl.R1(f112, f122, min);
                    if (s36Var2.s != R1) {
                        s36Var2.s = R1;
                        s36Var2.w = true;
                        s36Var2.invalidate();
                    }
                    s36Var2.setPivotX(s36Var2.getMeasuredWidth() * R1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z102) {
                    limitPreviewView2.n = (int) hl.R1(limitPreviewView2.b0, f102, min);
                    limitPreviewView2.J.invalidate();
                } else {
                    s36Var2.setScaleX(min2);
                    s36Var2.setScaleY(min2);
                }
                if (z6) {
                    s36Var2.setScaleX(hl.R1(0.6f, 1.0f, floatValue));
                    s36Var2.setScaleY(hl.R1(0.6f, 1.0f, floatValue));
                    s36Var2.setAlpha(floatValue);
                } else if (z7) {
                    float f14 = 1.0f - floatValue;
                    s36Var2.setScaleX(hl.R1(0.6f, 1.0f, f14));
                    s36Var2.setScaleY(hl.R1(0.6f, 1.0f, f14));
                    s36Var2.setAlpha(f14);
                }
            }
        });
        this.j0.addListener(new gf4((byte) 10, this, z92));
        this.j0.setInterpolator(new OvershootInterpolator());
        if (this.a0) {
        }
        this.j0.start();
        this.d = true;
    }

    public void setBagePosition(float f) {
        this.y = ete.a(f, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t36 t36Var) {
        this.f0 = t36Var;
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
        setRatingPaintColorKey(aob.Fi);
        long j = tl_starsRating.current_level_stars;
        long j2 = tl_starsRating.stars;
        in inVar = this.O;
        in inVar2 = this.w;
        if (j2 <= 0) {
            this.a = 0.5f;
            inVar.setText("");
            inVar2.setText(ob6.M0(2131744830, null));
            setRatingPaintColorKey(aob.nk);
            this.M = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level - 1)));
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = ete.a((j2 - j) / (r12 - j), 0.0f, 1.0f);
                inVar.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level)));
                inVar2.setText(ob6.a0(null, null, 2131744831, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) inVar2.getLayoutParams()).gravity = 5;
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

    public void setStaticGradinet(al8 al8Var) {
        this.F = al8Var;
    }

    public void setStatus(int i, int i2, boolean z) {
        if (this.b == i) {
            z = false;
        }
        this.b = i;
        this.a = ete.a(i / i2, 0.0f, 1.0f);
        if (z) {
            this.a0 = true;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
        }
        in inVar = this.w;
        ((FrameLayout.LayoutParams) inVar.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        inVar.setText(String.valueOf(i2));
        j(i, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i) {
        in inVar = this.w;
        int i2 = this.r;
        s36 s36Var = this.e;
        if (i == 6) {
            if (s36Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new wm2(i2, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (yac.h(yac.t0).p() ? "4 GB" : "2 GB"));
                s36Var.f = spannableStringBuilder;
            }
            inVar.setText("4 GB");
            return;
        }
        if (i == 11) {
            if (s36Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new wm2(i2, 0), 0, 1, 0);
                s36Var.f = spannableStringBuilder2;
            }
            inVar.setText("");
        }
    }

    @Override // snb
    public final void updateColors() {
        in inVar;
        in inVar2;
        vnb vnbVar = this.T;
        try {
            if (this.o0 && (inVar2 = this.O) != null) {
                inVar2.setTextColor(aob.v0(aob.G6, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            if (this.m0 && (inVar = this.w) != null) {
                inVar.setTextColor(aob.v0(aob.G6, vnbVar));
            }
            int i = this.n0;
            if (i >= 0) {
                this.L.setColor(aob.v0(i, vnbVar));
                jo0 jo0Var = this.J;
                if (jo0Var != null) {
                    jo0Var.invalidate();
                }
                s36 s36Var = this.e;
                if (s36Var != null) {
                    s36Var.invalidate();
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, vnb vnbVar) {
        this(context, i, i2, i3, 0.5f, vnbVar);
    }
}
