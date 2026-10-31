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
import bg.k;
import eg.m;
import i0.a;
import java.util.ArrayList;
import java.util.HashSet;
import jg.b1;
import kg.k1;
import kg.s;
import kg.t;
import kg.v;
import kg.w;
import kg.x;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wy;
import w7.b6;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout implements k6 {
    public static final /* synthetic */ int o0 = 0;
    public ViewGroup D;
    public k1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final b1 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final f6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final p6 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public float a;
    public int a0;
    public int b;
    public float b0;
    public int c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public final v e;
    public w e0;
    public boolean f;
    public final x f0;
    public final x g0;
    public float h;
    public boolean h0;
    public ValueAnimator i0;
    public boolean j0;
    public Runnable k0;
    public boolean l0;
    public int m0;
    public int n;
    public boolean n0;
    public final int r;
    public float s;
    public final f6 w;
    public final TextView x;
    public float y;

    public LimitPreviewView(int i10, int i11, int i12, Context context, p6 p6Var) {
        this(context, i10, i11, i12, 0.5f, p6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        v vVar = limitPreviewView.e;
        f6 f6Var = limitPreviewView.w;
        f6 f6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            limitPreviewView.setRatingPaintColorKey(t6.Ci);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                f6Var2.setText("");
                f6Var.setText(cd.L0(2131745191, null));
                limitPreviewView.setRatingPaintColorKey(t6.kk);
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    z10 = false;
                    limitPreviewView.a = u.a((r7 - j10) / (r9 - j10), 0.0f, 1.0f);
                    f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
                    f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    vVar.setScaleX(0.6f);
                    vVar.setScaleY(0.6f);
                    vVar.setAlpha(0.0f);
                    limitPreviewView.T = true;
                    limitPreviewView.U = true;
                    limitPreviewView.V = z10;
                    limitPreviewView.a0 = limitPreviewView.n;
                    limitPreviewView.I.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    gr grVar = gr.h;
                    duration.setInterpolator(grVar).start();
                    f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar).start();
                    limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                    limitPreviewView.setDefaultTextColor(true);
                    limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level - 1)));
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
            }
            z10 = false;
            limitPreviewView.setArrowX(1.0f);
            vVar.setScaleX(0.6f);
            vVar.setScaleY(0.6f);
            vVar.setAlpha(0.0f);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = z10;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).start();
            f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar2).start();
            limitPreviewView.setPremiumCountColor(limitPreviewView.L);
            limitPreviewView.setDefaultTextColor(true);
            limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        float f7;
        v vVar = limitPreviewView.e;
        f6 f6Var = limitPreviewView.w;
        f6 f6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            limitPreviewView.setRatingPaintColorKey(t6.Ci);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                f6Var2.setText("");
                f6Var.setText(cd.L0(2131745191, null));
                limitPreviewView.setRatingPaintColorKey(t6.kk);
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    z10 = false;
                    limitPreviewView.a = u.a((r7 - j10) / (r9 - j10), 0.0f, 1.0f);
                    f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
                    f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level + 1)));
                    f7 = 0.0f;
                    limitPreviewView.setArrowX(f7);
                    vVar.setScaleX(0.6f);
                    vVar.setScaleY(0.6f);
                    vVar.setAlpha(f7);
                    limitPreviewView.T = true;
                    limitPreviewView.U = true;
                    limitPreviewView.V = z10;
                    limitPreviewView.a0 = limitPreviewView.n;
                    limitPreviewView.I.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    gr grVar = gr.h;
                    duration.setInterpolator(grVar).start();
                    f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar).start();
                    limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                    limitPreviewView.setDefaultTextColor(true);
                    limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level - 1)));
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
            }
            z10 = false;
            f7 = 0.0f;
            limitPreviewView.setArrowX(f7);
            vVar.setScaleX(0.6f);
            vVar.setScaleY(0.6f);
            vVar.setAlpha(f7);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = z10;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).start();
            f6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar2).start();
            limitPreviewView.setPremiumCountColor(limitPreviewView.L);
            limitPreviewView.setDefaultTextColor(true);
            limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f7) {
        this.n = f7 >= 1.0f ? this.I.getMeasuredWidth() : 0;
        float L = i0.L(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 * 2)) * f7) + L;
        v vVar = this.e;
        vVar.setTranslationX(Utilities.i(max - (vVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - vVar.getMeasuredWidth(), L));
        if (vVar.s != f7) {
            vVar.s = f7;
            vVar.w = true;
            vVar.invalidate();
        }
        vVar.setPivotX(vVar.getMeasuredWidth() * f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTextColor(boolean z10) {
        this.n0 = !z10;
        this.N.setTextColor(z10 ? -1 : t6.w0(t6.G6, this.S));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiumCountColor(boolean z10) {
        this.l0 = !z10;
        this.w.setTextColor(z10 ? -1 : t6.w0(t6.G6, this.S));
    }

    private void setRatingPaintColorKey(int i10) {
        this.m0 = i10;
        this.K.setColor(t6.w0(i10, this.S));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
            if (this.f) {
                float f7 = this.h + 0.016f;
                this.h = f7;
                if (f7 > 3.0f) {
                    this.f = false;
                }
            } else {
                float f10 = this.h - 0.016f;
                this.h = f10;
                if (f10 < 1.0f) {
                    this.f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        i0.r(this.k0);
        this.k0 = null;
        int i10 = t6.Ci;
        setRatingPaintColorKey(i10);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        b1 b1Var = this.I;
        f6 f6Var = this.w;
        f6 f6Var2 = this.N;
        final int i13 = 1;
        if (i11 == i12) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                f6Var2.setText("");
                f6Var.setText(cd.L0(2131745191, null));
                setRatingPaintColorKey(t6.kk);
                this.L = true;
                z10 = false;
            } else {
                z10 = false;
                if (tl_starsRating2.next_level_stars == 0) {
                    this.a = 1.0f;
                    f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(i12 - 1)));
                    f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j10 = tl_starsRating2.current_level_stars;
                    this.a = u.a((r10 - j10) / (r5 - j10), 0.0f, 1.0f);
                    f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating2.level)));
                    f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.T = true;
            boolean z11 = z10;
            this.U = z11;
            this.V = z11;
            this.a0 = this.n;
            b1Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.a = 1.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.a0 = this.n;
            b1Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = f6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            f6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(grVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i14 = 0;
            Runnable runnable = new Runnable(this) { // from class: kg.r
                public final /* synthetic */ LimitPreviewView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            LimitPreviewView.b(this.b, tl_starsRating2);
                            break;
                        default:
                            LimitPreviewView.a(this.b, tl_starsRating2);
                            break;
                    }
                }
            };
            this.k0 = runnable;
            i0.h3(runnable, 600L);
            return;
        }
        if (i12 < i11) {
            setRatingPaintColorKey(i10);
            this.L = false;
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.a = 0.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.a0 = this.n;
            b1Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = f6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).start();
            f6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(grVar2).start();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) { // from class: kg.r
                public final /* synthetic */ LimitPreviewView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            LimitPreviewView.b(this.b, tl_starsRating2);
                            break;
                        default:
                            LimitPreviewView.a(this.b, tl_starsRating2);
                            break;
                    }
                }
            };
            this.k0 = runnable2;
            i0.h3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        f6 f6Var = this.N;
        f6 f6Var2 = this.w;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            f6Var.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            f6Var2.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = u.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            f6Var.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
            f6Var2.setText(cd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) f6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void h(int i10, int i11) {
        if (i10 < 0) {
            i(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new dq(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? cd.S(null, i10) : cd.E(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? cd.S(null, i11) : cd.E(i11, ',')));
        spannableStringBuilder.setSpan(new org.telegram.messenger.u(zs.A2, 2, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        v vVar = this.e;
        vVar.b(spannableStringBuilder, false);
        vVar.requestLayout();
    }

    public final void i(int i10, boolean z10) {
        dq dqVar;
        if (i10 < 0) {
            dqVar = new dq(R.drawable.warning_sign, 0);
        } else {
            dqVar = new dq(this.r, 0);
            float f7 = this.s;
            dqVar.H = f7;
            dqVar.I = f7;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(dqVar, 0, 1, 0);
        if (i10 >= 0 || !this.h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) cd.E(i10, ','));
        }
        v vVar = this.e;
        vVar.b(spannableStringBuilder, z10);
        vVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j10, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.M = true;
        setRatingPaintColorKey(t6.Ci);
        this.a = i0.z1(j10, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.N.setText(cd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = cd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        f6 f6Var = this.w;
        f6Var.setText(H);
        ((FrameLayout.LayoutParams) f6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        i((int) j10, false);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        float f11;
        float f12;
        final float f13;
        float measuredWidth;
        float f14;
        boolean z11;
        int i14;
        float f15;
        boolean z12;
        TextPaint textPaint;
        int i15;
        int i16;
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z13 = this.W;
        v vVar = this.e;
        if (!z13 && !this.T && (this.d || vVar == null || !this.H || this.J)) {
            if (this.P) {
                if (this.U || this.V) {
                    return;
                }
                vVar.setAlpha(1.0f);
                vVar.setScaleX(1.0f);
                vVar.setScaleY(1.0f);
                return;
            }
            if (!this.J) {
                if (vVar != null) {
                    vVar.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + i0.L(14.0f)) - (vVar.getMeasuredWidth() / 2.0f);
            boolean z14 = this.d;
            if (!z14 && this.H) {
                this.d = true;
                vVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z14) {
                vVar.setAlpha(1.0f);
                vVar.setScaleX(1.0f);
                vVar.setScaleY(1.0f);
            } else {
                vVar.setAlpha(0.0f);
                vVar.setScaleX(0.0f);
                vVar.setScaleY(0.0f);
            }
            vVar.setTranslationX(measuredWidth2);
            return;
        }
        int L = i0.L(14.0f);
        int i17 = 0;
        boolean z15 = this.T || this.W;
        this.W = false;
        this.T = false;
        float translationX = z15 ? vVar.getTranslationX() : 0.0f;
        float f16 = L;
        int i18 = L * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i18) * this.y) + f16) - (vVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f17 = vVar.s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L) - vVar.getMeasuredWidth(), f16);
            int i19 = this.n;
            if (i19 <= 0) {
                f13 = measuredWidth;
                f11 = f17;
                f12 = 0.0f;
            } else if (i19 >= getMeasuredWidth() - i18) {
                f7 = f17;
                f13 = measuredWidth;
                f11 = f7;
                f12 = 1.0f;
            } else {
                f12 = Utilities.i((this.n - (measuredWidth - f16)) / vVar.getMeasuredWidth(), 1.0f, 0.0f);
                f13 = measuredWidth;
                f11 = f17;
            }
        } else {
            if (max < f16) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f16 = max;
                f7 = 0.5f;
                f10 = 0.5f;
            }
            if (f16 > (getMeasuredWidth() - L) - vVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - L) - vVar.getMeasuredWidth();
                f13 = measuredWidth;
                f11 = f7;
                f12 = 1.0f;
            } else {
                f11 = f7;
                f12 = f10;
                f13 = f16;
            }
        }
        final boolean z16 = this.U;
        final boolean z17 = this.V;
        if (!z16 && !z17) {
            vVar.setAlpha(1.0f);
        }
        vVar.setTranslationX(translationX);
        vVar.setPivotX(vVar.getMeasuredWidth() / 2.0f);
        vVar.setPivotY(vVar.getMeasuredHeight());
        if (z15) {
            f14 = f11;
            z11 = z15;
            i14 = 2;
        } else {
            vVar.setScaleX(0.0f);
            vVar.setScaleY(0.0f);
            TextPaint textPaint2 = vVar.c;
            ArrayList arrayList = vVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = vVar.D;
            if (limitPreviewView.P && limitPreviewView.b == 0) {
                f14 = f11;
                z11 = z15;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vVar.f);
                int i20 = 0;
                boolean z18 = true;
                while (i20 < vVar.f.length()) {
                    if (Character.isDigit(vVar.f.charAt(i20))) {
                        kg.u uVar = new kg.u();
                        arrayList.add(uVar);
                        f15 = f11;
                        uVar.e = vVar.d.getSecondaryHorizontal(i20);
                        uVar.d = z18;
                        if (i17 >= 1) {
                            z18 = !z18;
                            i17 = 0;
                        }
                        i17++;
                        int charAt = vVar.f.charAt(i20) - '0';
                        int i21 = charAt == 0 ? 10 : charAt;
                        z12 = z15;
                        int i22 = 1;
                        while (i22 <= i21) {
                            int i23 = i21;
                            if (i22 == 10) {
                                i16 = i22;
                                i15 = 0;
                            } else {
                                i15 = i22;
                                i16 = i15;
                            }
                            uVar.b.add(new StaticLayout(a.i(i15, ""), textPaint2, (int) vVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i22 = i16 + 1;
                            i21 = i23;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new wy(false), i20, i20 + 1, 0);
                    } else {
                        f15 = f11;
                        z12 = z15;
                        textPaint = textPaint2;
                    }
                    i20++;
                    textPaint2 = textPaint;
                    f11 = f15;
                    z15 = z12;
                }
                f14 = f11;
                z11 = z15;
                vVar.n = new StaticLayout(spannableStringBuilder, textPaint2, i0.L(12.0f) + ((int) vVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    vVar.r = true;
                    kg.u uVar2 = (kg.u) arrayList.get(i24);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new s(vVar, uVar2, 1));
                    uVar2.f.addListener(new t(vVar, uVar2, 0));
                    uVar2.f.setInterpolator(gr.g);
                    uVar2.f.setDuration(750L);
                    uVar2.f.setStartDelay(((arrayList.size() - 1) - i24) * 60);
                    uVar2.f.start();
                }
            }
            i14 = 2;
        }
        float[] fArr = new float[i14];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
        this.i0 = ofFloat2;
        final float f18 = this.n;
        if (z11) {
            this.n = this.a0;
        }
        final boolean z19 = !this.j0;
        this.j0 = true;
        final float f19 = f12;
        final float f20 = translationX;
        final float f21 = f14;
        final boolean z20 = z11;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kg.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                v vVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z19) {
                    if (!limitPreviewView2.G) {
                        limitPreviewView2.G = true;
                        try {
                            vVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    vVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.b0);
                } else if (!limitPreviewView2.j0) {
                    vVar2.setRotation(limitPreviewView2.b0);
                }
                if (valueAnimator == limitPreviewView2.i0) {
                    vVar2.setTranslationX(org.telegram.messenger.i0.T1(f20, f13, min));
                    float T1 = org.telegram.messenger.i0.T1(f21, f19, min);
                    if (vVar2.s != T1) {
                        vVar2.s = T1;
                        vVar2.w = true;
                        vVar2.invalidate();
                    }
                    vVar2.setPivotX(vVar2.getMeasuredWidth() * T1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z20) {
                    limitPreviewView2.n = (int) org.telegram.messenger.i0.T1(limitPreviewView2.a0, f18, min);
                    limitPreviewView2.I.invalidate();
                } else {
                    vVar2.setScaleX(min2);
                    vVar2.setScaleY(min2);
                }
                if (z16) {
                    vVar2.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                    vVar2.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                    vVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f22 = 1.0f - floatValue;
                    vVar2.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f22));
                    vVar2.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f22));
                    vVar2.setAlpha(f22);
                }
            }
        });
        this.i0.addListener(new m(2, this, z19));
        this.i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new k(this, 9));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.i0.setDuration(600L);
        } else if (z17) {
            this.i0.setInterpolator(gr.i);
            this.i0.setDuration(320L);
        } else if (z16) {
            this.i0.setInterpolator(gr.h);
            this.i0.setDuration(500L);
        } else {
            this.i0.setDuration(1000L);
            this.i0.setStartDelay(200L);
        }
        this.i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.y = u.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(w wVar) {
        this.e0 = wVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.h0 = z10;
    }

    public void setIconScale(float f7) {
        this.s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.D = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.L = false;
        setRatingPaintColorKey(t6.Ci);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        f6 f6Var = this.N;
        f6 f6Var2 = this.w;
        if (j11 <= 0) {
            this.a = 0.5f;
            f6Var.setText("");
            f6Var2.setText(cd.L0(2131745191, null));
            setRatingPaintColorKey(t6.kk);
            this.L = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level - 1)));
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = u.a((j11 - j10) / (r12 - j10), 0.0f, 1.0f);
                f6Var.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level)));
                f6Var2.setText(cd.a0(null, null, 2131745192, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) f6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(k1 k1Var) {
        this.E = k1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.b == i10) {
            z10 = false;
        }
        this.b = i10;
        this.a = u.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.a0 = this.n;
            this.I.requestLayout();
            requestLayout();
        }
        f6 f6Var = this.w;
        ((FrameLayout.LayoutParams) f6Var.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        f6Var.setText("" + i11);
        i(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        f6 f6Var = this.w;
        int i11 = this.r;
        v vVar = this.e;
        if (i10 == 6) {
            if (vVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new dq(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (d20.i(d20.s0).q() ? "4 GB" : "2 GB"));
                vVar.b(spannableStringBuilder, false);
            }
            f6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (vVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new dq(i11, 0), 0, 1, 0);
                vVar.b(spannableStringBuilder2, false);
            }
            f6Var.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        f6 f6Var;
        f6 f6Var2;
        p6 p6Var = this.S;
        try {
            if (this.n0 && (f6Var2 = this.N) != null) {
                f6Var2.setTextColor(t6.w0(t6.G6, p6Var));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            if (this.l0 && (f6Var = this.w) != null) {
                f6Var.setTextColor(t6.w0(t6.G6, p6Var));
            }
            int i10 = this.m0;
            if (i10 >= 0) {
                this.K.setColor(t6.w0(i10, p6Var));
                b1 b1Var = this.I;
                if (b1Var != null) {
                    b1Var.invalidate();
                }
                v vVar = this.e;
                if (vVar != null) {
                    vVar.invalidate();
                }
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, p6 p6Var) {
        super(context);
        this.s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.d0 = true;
        this.m0 = -1;
        this.S = p6Var;
        this.a = u.a(f7, 0.1f, 0.9f);
        this.r = i10;
        this.b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, i0.L(16.0f), 0, 0);
            v vVar = new v(this, context);
            this.e = vVar;
            i(i11, false);
            vVar.setPadding(i0.L(19.0f), i0.L(6.0f), i0.L(19.0f), i0.L(14.0f));
            addView(vVar, b6.p(-2, -2, 0.0f, 3));
        }
        x xVar = new x(this, context, true);
        this.f0 = xVar;
        f6 f6Var = new f6(context, false, false, false);
        this.N = f6Var;
        f6Var.setTextSize(i0.L(14.0f));
        f6Var.setTypeface(i0.o());
        f6Var.setText(cd.L0(2131748991, null));
        f6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(i0.o());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        a7.V(textView, t6.G6, p6Var);
        if (cd.X) {
            xVar.addView(f6Var, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar.addView(textView, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            xVar.addView(f6Var, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar.addView(textView, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        x xVar2 = new x(this, context, false);
        this.g0 = xVar2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(i0.o());
        textView2.setText(cd.L0(2131748989, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        f6 f6Var2 = new f6(context, false, false, false);
        this.w = f6Var2;
        f6Var2.setTextSize(i0.L(14.0f));
        f6Var2.setTypeface(i0.o());
        f6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        f6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (cd.X) {
            xVar2.addView(textView2, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar2.addView(f6Var2, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            xVar2.addView(textView2, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            xVar2.addView(f6Var2, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        b1 b1Var = new b1(this, context, p6Var);
        this.I = b1Var;
        b1Var.addView(xVar, b6.c(30.0f, -1));
        b1Var.addView(xVar2, b6.c(30.0f, -1));
        addView(b1Var, b6.q(-1, 30, 0.0f, 0, 14, i10 != 0 ? 12 : 0, 14, 0));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
