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
import bi.m5;
import c8.ha;
import c8.j9;
import fi.r3;
import java.util.ArrayList;
import java.util.HashSet;
import jg.g;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.z40;
import ti.d;
import ug.o;
import ug.p;
import ug.q;
import ug.r;
import ug.s;
import ug.y0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout implements a6 {
    public static final /* synthetic */ int o0 = 0;
    public ViewGroup D;
    public y0 E;
    public int F;
    public boolean G;
    public boolean H;
    public final m5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final j6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final f6 S;
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
    public final r e;
    public s e0;
    public boolean f;
    public final r3 f0;
    public final r3 g0;
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
    public final j6 w;
    public final TextView x;
    public float y;

    public LimitPreviewView(int i7, int i10, int i11, Context context, f6 f6Var) {
        this(context, i7, i10, i11, 0.5f, f6Var);
    }

    public static void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z9;
        r rVar = limitPreviewView.e;
        j6 j6Var = limitPreviewView.w;
        j6 j6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            limitPreviewView.setRatingPaintColorKey(k6.Ci);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                j6Var2.setText("");
                j6Var.setText(hd.M0(2131745174, null));
                limitPreviewView.setRatingPaintColorKey(k6.kk);
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j3 = tl_starsRating.current_level_stars;
                    z9 = false;
                    limitPreviewView.a = j9.a((r7 - j3) / (r9 - j3), 0.0f, 1.0f);
                    j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    rVar.setScaleX(0.6f);
                    rVar.setScaleY(0.6f);
                    rVar.setAlpha(0.0f);
                    limitPreviewView.T = true;
                    limitPreviewView.U = true;
                    limitPreviewView.V = z9;
                    limitPreviewView.a0 = limitPreviewView.n;
                    limitPreviewView.I.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    xq xqVar = xq.h;
                    duration.setInterpolator(xqVar).start();
                    j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
                    limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                    limitPreviewView.setDefaultTextColor(true);
                    limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
            }
            z9 = false;
            limitPreviewView.setArrowX(1.0f);
            rVar.setScaleX(0.6f);
            rVar.setScaleY(0.6f);
            rVar.setAlpha(0.0f);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = z9;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
            limitPreviewView.setPremiumCountColor(limitPreviewView.L);
            limitPreviewView.setDefaultTextColor(true);
            limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public static void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z9;
        float f10;
        r rVar = limitPreviewView.e;
        j6 j6Var = limitPreviewView.w;
        j6 j6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            limitPreviewView.setRatingPaintColorKey(k6.Ci);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                j6Var2.setText("");
                j6Var.setText(hd.M0(2131745174, null));
                limitPreviewView.setRatingPaintColorKey(k6.kk);
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j3 = tl_starsRating.current_level_stars;
                    z9 = false;
                    limitPreviewView.a = j9.a((r7 - j3) / (r9 - j3), 0.0f, 1.0f);
                    j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level + 1)));
                    f10 = 0.0f;
                    limitPreviewView.setArrowX(f10);
                    rVar.setScaleX(0.6f);
                    rVar.setScaleY(0.6f);
                    rVar.setAlpha(f10);
                    limitPreviewView.T = true;
                    limitPreviewView.U = true;
                    limitPreviewView.V = z9;
                    limitPreviewView.a0 = limitPreviewView.n;
                    limitPreviewView.I.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    xq xqVar = xq.h;
                    duration.setInterpolator(xqVar).start();
                    j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar).start();
                    limitPreviewView.setPremiumCountColor(limitPreviewView.L);
                    limitPreviewView.setDefaultTextColor(true);
                    limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
            }
            z9 = false;
            f10 = 0.0f;
            limitPreviewView.setArrowX(f10);
            rVar.setScaleX(0.6f);
            rVar.setScaleY(0.6f);
            rVar.setAlpha(f10);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = z9;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(xqVar2).start();
            limitPreviewView.setPremiumCountColor(limitPreviewView.L);
            limitPreviewView.setDefaultTextColor(true);
            limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f10) {
        this.n = f10 >= 1.0f ? this.I.getMeasuredWidth() : 0;
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
    public void setDefaultTextColor(boolean z9) {
        this.n0 = !z9;
        this.N.setTextColor(z9 ? -1 : k6.w0(k6.G6, this.S));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiumCountColor(boolean z9) {
        this.l0 = !z9;
        this.w.setTextColor(z9 ? -1 : k6.w0(k6.G6, this.S));
    }

    private void setRatingPaintColorKey(int i7) {
        this.m0 = i7;
        this.K.setColor(k6.w0(i7, this.S));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.E == null) {
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
        boolean z9;
        g0.r(this.k0);
        this.k0 = null;
        int i7 = k6.Ci;
        setRatingPaintColorKey(i7);
        this.L = false;
        int i10 = tl_starsRating.level;
        int i11 = tl_starsRating2.level;
        m5 m5Var = this.I;
        j6 j6Var = this.w;
        j6 j6Var2 = this.N;
        final int i12 = 1;
        if (i10 == i11) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                j6Var2.setText("");
                j6Var.setText(hd.M0(2131745174, null));
                setRatingPaintColorKey(k6.kk);
                this.L = true;
                z9 = false;
            } else {
                z9 = false;
                if (tl_starsRating2.next_level_stars == 0) {
                    this.a = 1.0f;
                    j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(i11 - 1)));
                    j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j3 = tl_starsRating2.current_level_stars;
                    this.a = j9.a((r10 - j3) / (r5 - j3), 0.0f, 1.0f);
                    j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating2.level)));
                    j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.T = true;
            boolean z10 = z9;
            this.U = z10;
            this.V = z10;
            this.a0 = this.n;
            m5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i11 > i10) {
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.a = 1.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.a0 = this.n;
            m5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            ViewPropertyAnimator duration = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: ug.n
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
            this.k0 = runnable;
            g0.i3(runnable, 600L);
            return;
        }
        if (i11 < i10) {
            setRatingPaintColorKey(i7);
            this.L = false;
            if (tl_starsRating.stars <= 0) {
                this.L = true;
            }
            this.a = 0.0f;
            this.T = true;
            this.U = false;
            this.V = true;
            this.a0 = this.n;
            m5Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(xqVar2).start();
            setPremiumCountColor(this.L);
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) { // from class: ug.n
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
            this.k0 = runnable2;
            g0.i3(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z9) {
        int i7;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        j6 j6Var = this.N;
        j6 j6Var2 = this.w;
        if ((i10 == i11 && z9) || (i7 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            j6Var.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            j6Var2.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = j9.a((i11 - i10) / (i7 - i10), 0.0f, 1.0f);
            j6Var.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level)));
            j6Var2.setText(hd.a0("BoostsLevel", null, 2131753160, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(false);
        setDefaultTextColor(true);
        i(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void h(int i7, int i10) {
        if (i7 < 0) {
            i(i7, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new wp(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i7 > 1200 ? hd.S(null, i7) : hd.E(i7, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? hd.S(null, i10) : hd.E(i10, ',')));
        spannableStringBuilder.setSpan(new t(qs.A2, 2, false), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        r rVar = this.e;
        rVar.b(spannableStringBuilder, false);
        rVar.requestLayout();
    }

    public final void i(int i7, boolean z9) {
        wp wpVar;
        if (i7 < 0) {
            wpVar = new wp(R.drawable.warning_sign, 0);
        } else {
            wpVar = new wp(this.r, 0);
            float f10 = this.s;
            wpVar.H = f10;
            wpVar.I = f10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(wpVar, 0, 1, 0);
        if (i7 >= 0 || !this.h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) hd.E(i7, ','));
        }
        r rVar = this.e;
        rVar.b(spannableStringBuilder, z9);
        rVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j3, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.M = true;
        setRatingPaintColorKey(k6.Ci);
        this.a = g0.z1(j3, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.N.setText(hd.H(',', "Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String H = hd.H(',', "Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        j6 j6Var = this.w;
        j6Var.setText(H);
        ((FrameLayout.LayoutParams) j6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.x.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        i((int) j3, false);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        final float f14;
        float measuredWidth;
        float f15;
        boolean z10;
        int i13;
        float f16;
        boolean z11;
        TextPaint textPaint;
        int i14;
        int i15;
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z12 = this.W;
        r rVar = this.e;
        if (!z12 && !this.T && (this.d || rVar == null || !this.H || this.J)) {
            if (this.P) {
                if (this.U || this.V) {
                    return;
                }
                rVar.setAlpha(1.0f);
                rVar.setScaleX(1.0f);
                rVar.setScaleY(1.0f);
                return;
            }
            if (!this.J) {
                if (rVar != null) {
                    rVar.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + g0.L(14.0f)) - (rVar.getMeasuredWidth() / 2.0f);
            boolean z13 = this.d;
            if (!z13 && this.H) {
                this.d = true;
                rVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z13) {
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
        boolean z14 = this.T || this.W;
        this.W = false;
        this.T = false;
        float translationX = z14 ? rVar.getTranslationX() : 0.0f;
        float f17 = L;
        int i17 = L * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i17) * this.y) + f17) - (rVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
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
        final boolean z15 = this.U;
        final boolean z16 = this.V;
        if (!z15 && !z16) {
            rVar.setAlpha(1.0f);
        }
        rVar.setTranslationX(translationX);
        rVar.setPivotX(rVar.getMeasuredWidth() / 2.0f);
        rVar.setPivotY(rVar.getMeasuredHeight());
        if (z14) {
            f15 = f12;
            z10 = z14;
            i13 = 2;
        } else {
            rVar.setScaleX(0.0f);
            rVar.setScaleY(0.0f);
            TextPaint textPaint2 = rVar.c;
            ArrayList arrayList = rVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = rVar.D;
            if (limitPreviewView.P && limitPreviewView.b == 0) {
                f15 = f12;
                z10 = z14;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.f);
                int i19 = 0;
                boolean z17 = true;
                while (i19 < rVar.f.length()) {
                    if (Character.isDigit(rVar.f.charAt(i19))) {
                        q qVar = new q();
                        arrayList.add(qVar);
                        f16 = f12;
                        qVar.e = rVar.d.getSecondaryHorizontal(i19);
                        qVar.d = z17;
                        if (i16 >= 1) {
                            z17 = !z17;
                            i16 = 0;
                        }
                        i16++;
                        int charAt = rVar.f.charAt(i19) - '0';
                        int i20 = charAt == 0 ? 10 : charAt;
                        z11 = z14;
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
                            qVar.b.add(new StaticLayout(g.j(i14, ""), textPaint2, (int) rVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i15 + 1;
                            i20 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new hy(false), i19, i19 + 1, 0);
                    } else {
                        f16 = f12;
                        z11 = z14;
                        textPaint = textPaint2;
                    }
                    i19++;
                    textPaint2 = textPaint;
                    f12 = f16;
                    z14 = z11;
                }
                f15 = f12;
                z10 = z14;
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
        this.i0 = ofFloat2;
        final float f19 = this.n;
        if (z10) {
            this.n = this.a0;
        }
        final boolean z18 = !this.j0;
        this.j0 = true;
        final float f20 = f13;
        final float f21 = translationX;
        final float f22 = f15;
        final boolean z19 = z10;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ug.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                r rVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z18) {
                    if (!limitPreviewView2.G) {
                        limitPreviewView2.G = true;
                        try {
                            rVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    rVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.b0);
                } else if (!limitPreviewView2.j0) {
                    rVar2.setRotation(limitPreviewView2.b0);
                }
                if (valueAnimator == limitPreviewView2.i0) {
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
                if (z19) {
                    limitPreviewView2.n = (int) org.telegram.messenger.g0.T1(limitPreviewView2.a0, f19, min);
                    limitPreviewView2.I.invalidate();
                } else {
                    rVar2.setScaleX(min2);
                    rVar2.setScaleY(min2);
                }
                if (z15) {
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                    rVar2.setAlpha(floatValue);
                } else if (z16) {
                    float f23 = 1.0f - floatValue;
                    rVar2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f23));
                    rVar2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f23));
                    rVar2.setAlpha(f23);
                }
            }
        });
        this.i0.addListener(new z40(15, this, z18));
        this.i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new d(this, 1));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.i0.setDuration(600L);
        } else if (z16) {
            this.i0.setInterpolator(xq.i);
            this.i0.setDuration(320L);
        } else if (z15) {
            this.i0.setInterpolator(xq.h);
            this.i0.setDuration(500L);
        } else {
            this.i0.setDuration(1000L);
            this.i0.setStartDelay(200L);
        }
        this.i0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.y = j9.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(s sVar) {
        this.e0 = sVar;
    }

    public void setHideNegativeValues(boolean z9) {
        this.h0 = z9;
    }

    public void setIconScale(float f10) {
        this.s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.D = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.L = false;
        setRatingPaintColorKey(k6.Ci);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        j6 j6Var = this.N;
        j6 j6Var2 = this.w;
        if (j10 <= 0) {
            this.a = 0.5f;
            j6Var.setText("");
            j6Var2.setText(hd.M0(2131745174, null));
            setRatingPaintColorKey(k6.kk);
            this.L = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = j9.a((j10 - j3) / (r12 - j3), 0.0f, 1.0f);
                j6Var.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level)));
                j6Var2.setText(hd.a0(null, null, 2131745175, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
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

    public void setStaticGradinet(y0 y0Var) {
        this.E = y0Var;
    }

    public void setStatus(int i7, int i10, boolean z9) {
        if (this.b == i7) {
            z9 = false;
        }
        this.b = i7;
        this.a = j9.a(i7 / i10, 0.0f, 1.0f);
        if (z9) {
            this.W = true;
            this.a0 = this.n;
            this.I.requestLayout();
            requestLayout();
        }
        j6 j6Var = this.w;
        ((FrameLayout.LayoutParams) j6Var.getLayoutParams()).gravity = 5;
        this.x.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        j6Var.setText("" + i10);
        i(i7, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i7) {
        j6 j6Var = this.w;
        int i10 = this.r;
        r rVar = this.e;
        if (i7 == 6) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new wp(i10, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (p10.i(p10.s0).q() ? "4 GB" : "2 GB"));
                rVar.b(spannableStringBuilder, false);
            }
            j6Var.setText("4 GB");
            return;
        }
        if (i7 == 11) {
            if (rVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new wp(i10, 0), 0, 1, 0);
                rVar.b(spannableStringBuilder2, false);
            }
            j6Var.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        j6 j6Var;
        j6 j6Var2;
        f6 f6Var = this.S;
        try {
            if (this.n0 && (j6Var2 = this.N) != null) {
                j6Var2.setTextColor(k6.w0(k6.G6, f6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            if (this.l0 && (j6Var = this.w) != null) {
                j6Var.setTextColor(k6.w0(k6.G6, f6Var));
            }
            int i7 = this.m0;
            if (i7 >= 0) {
                this.K.setColor(k6.w0(i7, f6Var));
                m5 m5Var = this.I;
                if (m5Var != null) {
                    m5Var.invalidate();
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

    public LimitPreviewView(Context context, int i7, int i10, int i11, float f10, f6 f6Var) {
        super(context);
        this.s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.d0 = true;
        this.m0 = -1;
        this.S = f6Var;
        this.a = j9.a(f10, 0.1f, 0.9f);
        this.r = i7;
        this.b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i7 != 0) {
            setPadding(0, g0.L(16.0f), 0, 0);
            r rVar = new r(this, context);
            this.e = rVar;
            i(i10, false);
            rVar.setPadding(g0.L(19.0f), g0.L(6.0f), g0.L(19.0f), g0.L(14.0f));
            addView(rVar, ha.p(-2, -2, 0.0f, 3));
        }
        r3 r3Var = new r3(this, context, true);
        this.f0 = r3Var;
        j6 j6Var = new j6(context, false, false, false);
        this.N = j6Var;
        j6Var.setTextSize(g0.L(14.0f));
        j6Var.setTypeface(g0.o());
        j6Var.setText(hd.M0(2131748980, null));
        j6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTypeface(g0.o());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        r6.V(textView, k6.G6, f6Var);
        if (hd.a0) {
            r3Var.addView(j6Var, ha.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var.addView(textView, ha.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            r3Var.addView(j6Var, ha.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var.addView(textView, ha.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        r3 r3Var2 = new r3(this, context, false);
        this.g0 = r3Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(g0.o());
        textView2.setText(hd.M0(2131748978, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        j6 j6Var2 = new j6(context, false, false, false);
        this.w = j6Var2;
        j6Var2.setTextSize(g0.L(14.0f));
        j6Var2.setTypeface(g0.o());
        j6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        j6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (hd.a0) {
            r3Var2.addView(textView2, ha.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var2.addView(j6Var2, ha.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            r3Var2.addView(textView2, ha.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            r3Var2.addView(j6Var2, ha.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        m5 m5Var = new m5(this, context, f6Var);
        this.I = m5Var;
        m5Var.addView(r3Var, ha.c(30.0f, -1));
        m5Var.addView(r3Var2, ha.c(30.0f, -1));
        addView(m5Var, ha.q(-1, 30, 0.0f, 0, 14, i7 != 0 ? 12 : 0, 14, 0));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
