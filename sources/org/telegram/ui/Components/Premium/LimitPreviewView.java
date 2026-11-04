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
import b8.be;
import b8.mf;
import ci.t4;
import gi.q3;
import java.util.ArrayList;
import java.util.HashSet;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.t;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.u40;
import ug.f2;
import vg.o;
import vg.p;
import vg.q;
import vg.r;
import vg.s;
import vg.x0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout implements z5 {
    public static final /* synthetic */ int p0 = 0;
    public ViewGroup E;
    public x0 F;
    public int G;
    public boolean H;
    public boolean I;
    public final t4 J;
    public boolean K;
    public final Paint L;
    public boolean M;
    public boolean N;
    public final h6 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final e6 T;
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
    public final r e;
    public boolean e0;
    public boolean f;
    public s f0;
    public final q3 g0;
    public float h;
    public final q3 h0;
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
    public final h6 w;
    public final TextView x;
    public float y;

    public LimitPreviewView(int i3, int i10, int i11, Context context, e6 e6Var) {
        this(context, i3, i10, i11, 0.5f, e6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        r rVar = limitPreviewView.e;
        h6 h6Var = limitPreviewView.w;
        h6 h6Var2 = limitPreviewView.O;
        limitPreviewView.l0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.M = false;
            limitPreviewView.setRatingPaintColorKey(k6.Ci);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                h6Var2.setText("");
                h6Var.setText(bd.M0(2131745183, null));
                limitPreviewView.setRatingPaintColorKey(k6.kk);
                limitPreviewView.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    z10 = false;
                    limitPreviewView.a = be.a((r7 - j10) / (r9 - j10), 0.0f, 1.0f);
                    h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
                    h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    rVar.setScaleX(0.6f);
                    rVar.setScaleY(0.6f);
                    rVar.setAlpha(0.0f);
                    limitPreviewView.U = true;
                    limitPreviewView.V = true;
                    limitPreviewView.W = z10;
                    limitPreviewView.b0 = limitPreviewView.n;
                    limitPreviewView.J.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    xq xqVar = xq.h;
                    duration.setInterpolator(xqVar).start();
                    h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
                    limitPreviewView.setPremiumCountColor(limitPreviewView.M);
                    limitPreviewView.setDefaultTextColor(true);
                    limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
            }
            z10 = false;
            limitPreviewView.setArrowX(1.0f);
            rVar.setScaleX(0.6f);
            rVar.setScaleY(0.6f);
            rVar.setAlpha(0.0f);
            limitPreviewView.U = true;
            limitPreviewView.V = true;
            limitPreviewView.W = z10;
            limitPreviewView.b0 = limitPreviewView.n;
            limitPreviewView.J.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
            limitPreviewView.setPremiumCountColor(limitPreviewView.M);
            limitPreviewView.setDefaultTextColor(true);
            limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        float f10;
        r rVar = limitPreviewView.e;
        h6 h6Var = limitPreviewView.w;
        h6 h6Var2 = limitPreviewView.O;
        limitPreviewView.l0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.M = false;
            limitPreviewView.setRatingPaintColorKey(k6.Ci);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                h6Var2.setText("");
                h6Var.setText(bd.M0(2131745183, null));
                limitPreviewView.setRatingPaintColorKey(k6.kk);
                limitPreviewView.M = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    z10 = false;
                    limitPreviewView.a = be.a((r7 - j10) / (r9 - j10), 0.0f, 1.0f);
                    h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
                    h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level + 1)));
                    f10 = 0.0f;
                    limitPreviewView.setArrowX(f10);
                    rVar.setScaleX(0.6f);
                    rVar.setScaleY(0.6f);
                    rVar.setAlpha(f10);
                    limitPreviewView.U = true;
                    limitPreviewView.V = true;
                    limitPreviewView.W = z10;
                    limitPreviewView.b0 = limitPreviewView.n;
                    limitPreviewView.J.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    xq xqVar = xq.h;
                    duration.setInterpolator(xqVar).start();
                    h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
                    limitPreviewView.setPremiumCountColor(limitPreviewView.M);
                    limitPreviewView.setDefaultTextColor(true);
                    limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
            }
            z10 = false;
            f10 = 0.0f;
            limitPreviewView.setArrowX(f10);
            rVar.setScaleX(0.6f);
            rVar.setScaleY(0.6f);
            rVar.setAlpha(f10);
            limitPreviewView.U = true;
            limitPreviewView.V = true;
            limitPreviewView.W = z10;
            limitPreviewView.b0 = limitPreviewView.n;
            limitPreviewView.J.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            h6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
            limitPreviewView.setPremiumCountColor(limitPreviewView.M);
            limitPreviewView.setDefaultTextColor(true);
            limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f10) {
        this.n = f10 >= 1.0f ? this.J.getMeasuredWidth() : 0;
        float L = g0.L(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 * 2)) * f10) + L;
        r rVar = this.e;
        rVar.setTranslationX(Utilities.i(max - (rVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - rVar.getMeasuredWidth(), L));
        if (rVar.s != f10) {
            rVar.s = f10;
            rVar.w = true;
            rVar.invalidate();
        }
        rVar.setPivotX(rVar.getMeasuredWidth() * f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTextColor(boolean z10) {
        this.o0 = !z10;
        this.O.setTextColor(z10 ? -1 : k6.w0(k6.G6, this.T));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiumCountColor(boolean z10) {
        this.m0 = !z10;
        this.w.setTextColor(z10 ? -1 : k6.w0(k6.G6, this.T));
    }

    private void setRatingPaintColorKey(int i3) {
        this.n0 = i3;
        this.L.setColor(k6.w0(i3, this.T));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.F == null) {
            if (this.f) {
                float f10 = this.h + 0.016f;
                this.h = f10;
                if (f10 > 3.0f) {
                    this.f = false;
                }
            } else {
                float f11 = this.h - 0.016f;
                this.h = f11;
                if (f11 < 1.0f) {
                    this.f = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        g0.r(this.l0);
        this.l0 = null;
        int i3 = k6.Ci;
        setRatingPaintColorKey(i3);
        this.M = false;
        int i10 = tl_starsRating.level;
        int i11 = tl_starsRating2.level;
        t4 t4Var = this.J;
        h6 h6Var = this.w;
        h6 h6Var2 = this.O;
        final int i12 = 1;
        if (i10 == i11) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                h6Var2.setText("");
                h6Var.setText(bd.M0(2131745183, null));
                setRatingPaintColorKey(k6.kk);
                this.M = true;
                z10 = false;
            } else {
                z10 = false;
                if (tl_starsRating2.next_level_stars == 0) {
                    this.a = 1.0f;
                    h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(i11 - 1)));
                    h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j10 = tl_starsRating2.current_level_stars;
                    this.a = be.a((r10 - j10) / (r5 - j10), 0.0f, 1.0f);
                    h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating2.level)));
                    h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.U = true;
            boolean z11 = z10;
            this.V = z11;
            this.W = z11;
            this.b0 = this.n;
            t4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i11 > i10) {
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.a = 1.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.b0 = this.n;
            t4Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = h6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            h6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: vg.n
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
            this.l0 = runnable;
            g0.i3(runnable, 600L);
            return;
        }
        if (i11 < i10) {
            setRatingPaintColorKey(i3);
            this.M = false;
            if (tl_starsRating.stars <= 0) {
                this.M = true;
            }
            this.a = 0.0f;
            this.U = true;
            this.V = false;
            this.W = true;
            this.b0 = this.n;
            t4Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = h6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            h6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar2).start();
            setPremiumCountColor(this.M);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) { // from class: vg.n
                public final /* synthetic */ LimitPreviewView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            LimitPreviewView.b(this.b, tl_starsRating2);
                            break;
                        default:
                            LimitPreviewView.a(this.b, tl_starsRating2);
                            break;
                    }
                }
            };
            this.l0 = runnable2;
            g0.i3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i3;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        h6 h6Var = this.O;
        h6 h6Var2 = this.w;
        if ((i10 == i11 && z10) || (i3 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            h6Var.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            h6Var2.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = be.a((i11 - i10) / (i3 - i10), 0.0f, 1.0f);
            h6Var.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
            h6Var2.setText(bd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) h6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.Q = true;
    }

    public final void h(int i3, int i10) {
        if (i3 < 0) {
            i(i3, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new wp(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i3 > 1200 ? bd.S(null, i3) : bd.E(i3, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? bd.S(null, i10) : bd.E(i10, ',')));
        spannableStringBuilder.setSpan(new t(hs.A2, 2, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        r rVar = this.e;
        rVar.b(spannableStringBuilder, false);
        rVar.requestLayout();
    }

    public final void i(int i3, boolean z10) {
        wp wpVar;
        if (i3 < 0) {
            wpVar = new wp(R.drawable.warning_sign, 0);
        } else {
            wpVar = new wp(this.r, 0);
            float f10 = this.s;
            wpVar.I = f10;
            wpVar.J = f10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(wpVar, 0, 1, 0);
        if (i3 >= 0 || !this.i0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) bd.E(i3, ','));
        }
        r rVar = this.e;
        rVar.b(spannableStringBuilder, z10);
        rVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j10, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.N = true;
        setRatingPaintColorKey(k6.Ci);
        this.a = g0.z1(j10, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.O.setText(bd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = bd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        h6 h6Var = this.w;
        h6Var.setText(H);
        ((FrameLayout.LayoutParams) h6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        i((int) j10, false);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        final float f14;
        float measuredWidth;
        float f15;
        boolean z11;
        int i13;
        float f16;
        boolean z12;
        TextPaint textPaint;
        int i14;
        int i15;
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z13 = this.a0;
        r rVar = this.e;
        if (!z13 && !this.U && (this.d || rVar == null || !this.I || this.K)) {
            if (this.Q) {
                if (this.V || this.W) {
                    return;
                }
                rVar.setAlpha(1.0f);
                rVar.setScaleX(1.0f);
                rVar.setScaleY(1.0f);
                return;
            }
            if (!this.K) {
                if (rVar != null) {
                    rVar.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + g0.L(14.0f)) - (rVar.getMeasuredWidth() / 2.0f);
            boolean z14 = this.d;
            if (!z14 && this.I) {
                this.d = true;
                rVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z14) {
                rVar.setAlpha(1.0f);
                rVar.setScaleX(1.0f);
                rVar.setScaleY(1.0f);
            } else {
                rVar.setAlpha(0.0f);
                rVar.setScaleX(0.0f);
                rVar.setScaleY(0.0f);
            }
            rVar.setTranslationX(measuredWidth2);
            return;
        }
        int L = g0.L(14.0f);
        int i16 = 0;
        boolean z15 = this.U || this.a0;
        this.a0 = false;
        this.U = false;
        float translationX = z15 ? rVar.getTranslationX() : 0.0f;
        float f17 = L;
        int i17 = L * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i17) * this.y) + f17) - (rVar.getMeasuredWidth() / 2.0f);
        if (this.R) {
            float f18 = rVar.s;
            measuredWidth = Utilities.i(max, (getMeasuredWidth() - L) - rVar.getMeasuredWidth(), f17);
            int i18 = this.n;
            if (i18 <= 0) {
                f14 = measuredWidth;
                f12 = f18;
                f13 = 0.0f;
            } else if (i18 >= getMeasuredWidth() - i17) {
                f10 = f18;
                f14 = measuredWidth;
                f12 = f10;
                f13 = 1.0f;
            } else {
                f13 = Utilities.i((this.n - (measuredWidth - f17)) / rVar.getMeasuredWidth(), 1.0f, 0.0f);
                f14 = measuredWidth;
                f12 = f18;
            }
        } else {
            if (max < f17) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f17 = max;
                f10 = 0.5f;
                f11 = 0.5f;
            }
            if (f17 > (getMeasuredWidth() - L) - rVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - L) - rVar.getMeasuredWidth();
                f14 = measuredWidth;
                f12 = f10;
                f13 = 1.0f;
            } else {
                f12 = f10;
                f13 = f11;
                f14 = f17;
            }
        }
        final boolean z16 = this.V;
        final boolean z17 = this.W;
        if (!z16 && !z17) {
            rVar.setAlpha(1.0f);
        }
        rVar.setTranslationX(translationX);
        rVar.setPivotX(rVar.getMeasuredWidth() / 2.0f);
        rVar.setPivotY(rVar.getMeasuredHeight());
        if (z15) {
            f15 = f12;
            z11 = z15;
            i13 = 2;
        } else {
            rVar.setScaleX(0.0f);
            rVar.setScaleY(0.0f);
            TextPaint textPaint2 = rVar.c;
            ArrayList arrayList = rVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = rVar.E;
            if (limitPreviewView.Q && limitPreviewView.b == 0) {
                f15 = f12;
                z11 = z15;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.f);
                int i19 = 0;
                boolean z18 = true;
                while (i19 < rVar.f.length()) {
                    if (Character.isDigit(rVar.f.charAt(i19))) {
                        q qVar = new q();
                        arrayList.add(qVar);
                        f16 = f12;
                        qVar.e = rVar.d.getSecondaryHorizontal(i19);
                        qVar.d = z18;
                        if (i16 >= 1) {
                            z18 = !z18;
                            i16 = 0;
                        }
                        i16++;
                        int charAt = rVar.f.charAt(i19) - '0';
                        int i20 = charAt == 0 ? 10 : charAt;
                        z12 = z15;
                        int i21 = 1;
                        while (i21 <= i20) {
                            int i22 = i20;
                            if (i21 == 10) {
                                i15 = i21;
                                i14 = 0;
                            } else {
                                i14 = i21;
                                i15 = i14;
                            }
                            qVar.b.add(new StaticLayout(p1.i(i14, ""), textPaint2, (int) rVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i15 + 1;
                            i20 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new fy(false), i19, i19 + 1, 0);
                    } else {
                        f16 = f12;
                        z12 = z15;
                        textPaint = textPaint2;
                    }
                    i19++;
                    textPaint2 = textPaint;
                    f12 = f16;
                    z15 = z12;
                }
                f15 = f12;
                z11 = z15;
                rVar.n = new StaticLayout(spannableStringBuilder, textPaint2, g0.L(12.0f) + ((int) rVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    rVar.r = true;
                    q qVar2 = (q) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new o(rVar, qVar2, 1));
                    qVar2.f.addListener(new p(rVar, qVar2, 0));
                    qVar2.f.setInterpolator(xq.g);
                    qVar2.f.setDuration(750L);
                    qVar2.f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    qVar2.f.start();
                }
            }
            i13 = 2;
        }
        float[] fArr = new float[i13];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
        this.j0 = ofFloat2;
        final float f19 = this.n;
        if (z11) {
            this.n = this.b0;
        }
        final boolean z19 = !this.k0;
        this.k0 = true;
        final float f20 = f13;
        final float f21 = translationX;
        final float f22 = f15;
        final boolean z20 = z11;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vg.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                r rVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z19) {
                    if (!limitPreviewView2.H) {
                        limitPreviewView2.H = true;
                        try {
                            rVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    rVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.c0);
                } else if (!limitPreviewView2.k0) {
                    rVar2.setRotation(limitPreviewView2.c0);
                }
                if (valueAnimator == limitPreviewView2.j0) {
                    rVar2.setTranslationX(org.telegram.messenger.g0.T1(f21, f14, min));
                    float T1 = org.telegram.messenger.g0.T1(f22, f20, min);
                    if (rVar2.s != T1) {
                        rVar2.s = T1;
                        rVar2.w = true;
                        rVar2.invalidate();
                    }
                    rVar2.setPivotX(rVar2.getMeasuredWidth() * T1);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z20) {
                    limitPreviewView2.n = (int) org.telegram.messenger.g0.T1(limitPreviewView2.b0, f19, min);
                    limitPreviewView2.J.invalidate();
                } else {
                    rVar2.setScaleX(min2);
                    rVar2.setScaleY(min2);
                }
                if (z16) {
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f23 = 1.0f - floatValue;
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f23));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f23));
                    rVar2.setAlpha(f23);
                }
            }
        });
        this.j0.addListener(new u40(16, this, z19));
        this.j0.setInterpolator(new OvershootInterpolator());
        if (this.a0) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new f2(this, 1));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.j0.setDuration(600L);
        } else if (z17) {
            this.j0.setInterpolator(xq.i);
            this.j0.setDuration(320L);
        } else if (z16) {
            this.j0.setInterpolator(xq.h);
            this.j0.setDuration(500L);
        } else {
            this.j0.setDuration(1000L);
            this.j0.setStartDelay(200L);
        }
        this.j0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.y = be.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(s sVar) {
        this.f0 = sVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.i0 = z10;
    }

    public void setIconScale(float f10) {
        this.s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.E = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.M = false;
        setRatingPaintColorKey(k6.Ci);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        h6 h6Var = this.O;
        h6 h6Var2 = this.w;
        if (j11 <= 0) {
            this.a = 0.5f;
            h6Var.setText("");
            h6Var2.setText(bd.M0(2131745183, null));
            setRatingPaintColorKey(k6.kk);
            this.M = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level - 1)));
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = be.a((j11 - j10) / (r12 - j10), 0.0f, 1.0f);
                h6Var.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level)));
                h6Var2.setText(bd.a0(null, null, 2131745184, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) h6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        setPremiumCountColor(this.M);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    public void setStaticGradinet(x0 x0Var) {
        this.F = x0Var;
    }

    public void setStatus(int i3, int i10, boolean z10) {
        if (this.b == i3) {
            z10 = false;
        }
        this.b = i3;
        this.a = be.a(i3 / i10, 0.0f, 1.0f);
        if (z10) {
            this.a0 = true;
            this.b0 = this.n;
            this.J.requestLayout();
            requestLayout();
        }
        h6 h6Var = this.w;
        ((FrameLayout.LayoutParams) h6Var.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.P.setVisibility(8);
        this.O.setText("0");
        h6Var.setText("" + i10);
        i(i3, false);
        this.Q = true;
        this.R = true;
    }

    public void setType(int i3) {
        h6 h6Var = this.w;
        int i10 = this.r;
        r rVar = this.e;
        if (i3 == 6) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new wp(i10, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (h10.i(h10.t0).q() ? "4 GB" : "2 GB"));
                rVar.b(spannableStringBuilder, false);
            }
            h6Var.setText("4 GB");
            return;
        }
        if (i3 == 11) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new wp(i10, 0), 0, 1, 0);
                rVar.b(spannableStringBuilder2, false);
            }
            h6Var.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        h6 h6Var;
        h6 h6Var2;
        e6 e6Var = this.T;
        try {
            if (this.o0 && (h6Var2 = this.O) != null) {
                h6Var2.setTextColor(k6.w0(k6.G6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            if (this.m0 && (h6Var = this.w) != null) {
                h6Var.setTextColor(k6.w0(k6.G6, e6Var));
            }
            int i3 = this.n0;
            if (i3 >= 0) {
                this.L.setColor(k6.w0(i3, e6Var));
                t4 t4Var = this.J;
                if (t4Var != null) {
                    t4Var.invalidate();
                }
                r rVar = this.e;
                if (rVar != null) {
                    rVar.invalidate();
                }
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public LimitPreviewView(Context context, int i3, int i10, int i11, float f10, e6 e6Var) {
        super(context);
        this.s = 1.0f;
        this.I = true;
        this.L = new Paint(1);
        this.e0 = true;
        this.n0 = -1;
        this.T = e6Var;
        this.a = be.a(f10, 0.1f, 0.9f);
        this.r = i3;
        this.b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i3 != 0) {
            setPadding(0, g0.L(16.0f), 0, 0);
            r rVar = new r(this, context);
            this.e = rVar;
            i(i10, false);
            rVar.setPadding(g0.L(19.0f), g0.L(6.0f), g0.L(19.0f), g0.L(14.0f));
            addView(rVar, mf.p(-2, -2, 0.0f, 3));
        }
        q3 q3Var = new q3(this, context, true);
        this.g0 = q3Var;
        h6 h6Var = new h6(context, false, false, false);
        this.O = h6Var;
        h6Var.setTextSize(g0.L(14.0f));
        h6Var.setTypeface(g0.o());
        h6Var.setText(bd.M0(2131748989, null));
        h6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(g0.o());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        r6.V(textView, k6.G6, e6Var);
        if (bd.a0) {
            q3Var.addView(h6Var, mf.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var.addView(textView, mf.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            q3Var.addView(h6Var, mf.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var.addView(textView, mf.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        q3 q3Var2 = new q3(this, context, false);
        this.h0 = q3Var2;
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setTypeface(g0.o());
        textView2.setText(bd.M0(2131748987, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        h6 h6Var2 = new h6(context, false, false, false);
        this.w = h6Var2;
        h6Var2.setTextSize(g0.L(14.0f));
        h6Var2.setTypeface(g0.o());
        h6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        h6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (bd.a0) {
            q3Var2.addView(textView2, mf.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var2.addView(h6Var2, mf.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            q3Var2.addView(textView2, mf.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            q3Var2.addView(h6Var2, mf.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        t4 t4Var = new t4(this, context, e6Var);
        this.J = t4Var;
        t4Var.addView(q3Var, mf.c(30.0f, -1));
        t4Var.addView(q3Var2, mf.c(30.0f, -1));
        addView(t4Var, mf.q(-1, 30, 0.0f, 0, 14, i3 != 0 ? 12 : 0, 14, 0));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
