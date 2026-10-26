package org.telegram.ui.Components.Premium;

import a8.ee;
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
import bi.j5;
import fi.e4;
import ic.a;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.zq;
import org.telegram.ui.q40;
import tg.a1;
import tg.p;
import tg.q;
import tg.r;
import tg.s;
import tg.t;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class LimitPreviewView extends LinearLayout implements p6 {
    public static final /* synthetic */ int o0 = 0;
    public a1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final j5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final s6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final u6 S;
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
    public final s e;
    public t e0;
    public boolean f;
    public final gh0 f0;
    public final gh0 g0;
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
    public final s6 v;
    public final TextView w;
    public float x;
    public ViewGroup y;

    public LimitPreviewView(Context context, int i10, int i11, u6 u6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, u6Var);
    }

    public static /* synthetic */ void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar = limitPreviewView.e;
        s6 s6Var = limitPreviewView.v;
        s6 s6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            limitPreviewView.setRatingPaintColorKey(y6.Oh);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                s6Var2.setText("");
                s6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                limitPreviewView.setRatingPaintColorKey(y6.wj);
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars == 0) {
                    limitPreviewView.a = 1.0f;
                    s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                    s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j10 = tl_starsRating.current_level_stars;
                    limitPreviewView.a = ee.a((r4 - j10) / (r12 - j10), 0.0f, 1.0f);
                    s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                }
            }
            limitPreviewView.setArrowX(1.0f);
            sVar.setScaleX(0.6f);
            sVar.setScaleY(0.6f);
            sVar.setAlpha(0.0f);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = false;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration = s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            s6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(dsVar).start();
            limitPreviewView.setPremiumCountColor(limitPreviewView.L);
            limitPreviewView.setDefaultTextColor(true);
            limitPreviewView.h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public static /* synthetic */ void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar = limitPreviewView.e;
        s6 s6Var = limitPreviewView.v;
        s6 s6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            limitPreviewView.setRatingPaintColorKey(y6.Oh);
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                s6Var2.setText("");
                s6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                limitPreviewView.setRatingPaintColorKey(y6.wj);
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars == 0) {
                    limitPreviewView.a = 1.0f;
                    s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                    s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j10 = tl_starsRating.current_level_stars;
                    limitPreviewView.a = ee.a((r4 - j10) / (r12 - j10), 0.0f, 1.0f);
                    s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                }
            }
            limitPreviewView.setArrowX(0.0f);
            sVar.setScaleX(0.6f);
            sVar.setScaleY(0.6f);
            sVar.setAlpha(0.0f);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = false;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration = s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            s6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(dsVar).start();
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
        float dp = AndroidUtilities.dp(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 * 2)) * f7) + dp;
        s sVar = this.e;
        sVar.setTranslationX(Utilities.clamp(max - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - sVar.getMeasuredWidth(), dp));
        if (sVar.s != f7) {
            sVar.s = f7;
            sVar.v = true;
            sVar.invalidate();
        }
        sVar.setPivotX(sVar.getMeasuredWidth() * f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTextColor(boolean z10) {
        this.n0 = !z10;
        this.N.setTextColor(z10 ? -1 : y6.w0(y6.G6, this.S));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiumCountColor(boolean z10) {
        this.l0 = !z10;
        this.v.setTextColor(z10 ? -1 : y6.w0(y6.G6, this.S));
    }

    private void setRatingPaintColorKey(int i10) {
        this.m0 = i10;
        this.K.setColor(y6.w0(i10, this.S));
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
        boolean z11;
        boolean z12;
        boolean z13;
        AndroidUtilities.cancelRunOnUIThread(this.k0);
        this.k0 = null;
        int i10 = y6.Oh;
        setRatingPaintColorKey(i10);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        j5 j5Var = this.I;
        s6 s6Var = this.v;
        s6 s6Var2 = this.N;
        if (i11 == i12) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                s6Var2.setText("");
                s6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                setRatingPaintColorKey(y6.wj);
                this.L = true;
                z12 = false;
            } else {
                z12 = false;
                if (tl_starsRating2.next_level_stars != 0) {
                    long j10 = tl_starsRating2.current_level_stars;
                    this.a = ee.a((r9 - j10) / (r4 - j10), 0.0f, 1.0f);
                    z13 = true;
                    s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                    this.T = z13;
                    boolean z14 = z12;
                    this.U = z14;
                    this.V = z14;
                    this.a0 = this.n;
                    j5Var.requestLayout();
                    requestLayout();
                    setPremiumCountColor(this.L);
                    setDefaultTextColor(z13);
                    h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                    return;
                }
                this.a = 1.0f;
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
            }
            z13 = true;
            this.T = z13;
            boolean z142 = z12;
            this.U = z142;
            this.V = z142;
            this.a0 = this.n;
            j5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(z13);
            h((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                z11 = true;
                this.L = true;
            } else {
                z11 = true;
            }
            this.a = 1.0f;
            this.T = z11;
            this.U = false;
            this.V = z11;
            this.a0 = this.n;
            j5Var.requestLayout();
            requestLayout();
            setPremiumCountColor(this.L);
            setDefaultTextColor(z11);
            ViewPropertyAnimator duration = s6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            s6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(dsVar).start();
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: tg.o
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
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        if (i12 < i11) {
            setRatingPaintColorKey(i10);
            this.L = false;
            if (tl_starsRating.stars <= 0) {
                z10 = true;
                this.L = true;
            } else {
                z10 = true;
            }
            this.a = 0.0f;
            this.T = z10;
            this.U = false;
            this.V = z10;
            this.a0 = this.n;
            j5Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = s6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            ds dsVar2 = ds.h;
            duration2.setInterpolator(dsVar2).start();
            s6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(dsVar2).start();
            setPremiumCountColor(this.L);
            final int i14 = 1;
            setDefaultTextColor(true);
            h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            Runnable runnable2 = new Runnable(this) { // from class: tg.o
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
            this.k0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    public final void g(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        s6 s6Var = this.N;
        s6 s6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            s6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            s6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = ee.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            s6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            s6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) s6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
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
        spannableStringBuilder.append((CharSequence) "d").setSpan(new zq(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? LocaleController.formatShortNumber(i11, null) : LocaleController.formatNumber(i11, ',')));
        spannableStringBuilder.setSpan(new tu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.e;
        sVar.f = spannableStringBuilder;
        sVar.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void i(int i10, boolean z10) {
        zq zqVar;
        int i11;
        int i12 = 0;
        if (i10 < 0) {
            zqVar = new zq(R.drawable.warning_sign, 0);
        } else {
            zqVar = new zq(this.r, 0);
            float f7 = this.s;
            zqVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r6 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(zqVar, 0, 1, 0);
        if (i10 >= 0 || !this.h0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        s sVar = this.e;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder2 = sVar.f;
            sVar.f = spannableStringBuilder;
            TextPaint textPaint = sVar.c;
            ArrayList arrayList = sVar.h;
            if (sVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sVar.f);
                int length = sVar.f.length() - 1;
                int i13 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt == sVar.f.charAt(length) || !Character.isDigit(sVar.f.charAt(length))) {
                        i11 = length;
                    } else {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.e = sVar.d.getSecondaryHorizontal(length);
                        rVar.a = r6;
                        if (i13 >= r6) {
                            i13 = i12;
                        }
                        int i14 = (int) sVar.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + charAt, textPaint, i14, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f.charAt(i11), textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new tz(0), i11, i11 + 1, 0);
                        i13++;
                    }
                    length = i11 - 1;
                    i12 = 0;
                    r6 = 1;
                }
                sVar.n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    sVar.r = true;
                    r rVar2 = (r) arrayList.get(i15);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f.setInterpolator(ds.g);
                    rVar2.f.setDuration(250L);
                    rVar2.f.setStartDelay(((arrayList.size() - 1) - i15) * 60);
                    rVar2.f.start();
                }
            }
        } else {
            sVar.f = spannableStringBuilder;
        }
        sVar.requestLayout();
    }

    public final void j(TL_stars.StarGiftUpgradePrice starGiftUpgradePrice, long j10, TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2) {
        this.M = true;
        setRatingPaintColorKey(y6.Oh);
        this.a = AndroidUtilities.ilerp(j10, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        this.N.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
        String formatPluralStringComma = LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars);
        s6 s6Var = this.v;
        s6Var.setText(formatPluralStringComma);
        ((FrameLayout.LayoutParams) s6Var.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
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
        s sVar = this.e;
        if (!z13 && !this.T && (this.d || sVar == null || !this.H || this.J)) {
            if (this.P) {
                if (this.U || this.V) {
                    return;
                }
                sVar.setAlpha(1.0f);
                sVar.setScaleX(1.0f);
                sVar.setScaleY(1.0f);
                return;
            }
            if (!this.J) {
                if (sVar != null) {
                    sVar.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + AndroidUtilities.dp(14.0f)) - (sVar.getMeasuredWidth() / 2.0f);
            boolean z14 = this.d;
            if (!z14 && this.H) {
                this.d = true;
                sVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z14) {
                sVar.setAlpha(1.0f);
                sVar.setScaleX(1.0f);
                sVar.setScaleY(1.0f);
            } else {
                sVar.setAlpha(0.0f);
                sVar.setScaleX(0.0f);
                sVar.setScaleY(0.0f);
            }
            sVar.setTranslationX(measuredWidth2);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        int i17 = 0;
        boolean z15 = this.T || this.W;
        this.W = false;
        this.T = false;
        float translationX = z15 ? sVar.getTranslationX() : 0.0f;
        float f16 = dp;
        int i18 = dp * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i18) * this.x) + f16) - (sVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f17 = sVar.s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), f16);
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
                f12 = Utilities.clamp((this.n - (measuredWidth - f16)) / sVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            if (f16 > (getMeasuredWidth() - dp) - sVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - dp) - sVar.getMeasuredWidth();
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
            sVar.setAlpha(1.0f);
        }
        sVar.setTranslationX(translationX);
        sVar.setPivotX(sVar.getMeasuredWidth() / 2.0f);
        sVar.setPivotY(sVar.getMeasuredHeight());
        if (z15) {
            f14 = f11;
            z11 = z15;
            i14 = 2;
        } else {
            sVar.setScaleX(0.0f);
            sVar.setScaleY(0.0f);
            TextPaint textPaint2 = sVar.c;
            ArrayList arrayList = sVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = sVar.y;
            if (limitPreviewView.P && limitPreviewView.b == 0) {
                f14 = f11;
                z11 = z15;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f);
                int i20 = 0;
                boolean z18 = true;
                while (i20 < sVar.f.length()) {
                    if (Character.isDigit(sVar.f.charAt(i20))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        f15 = f11;
                        rVar.e = sVar.d.getSecondaryHorizontal(i20);
                        rVar.d = z18;
                        if (i17 >= 1) {
                            z18 = !z18;
                            i17 = 0;
                        }
                        i17++;
                        int charAt = sVar.f.charAt(i20) - '0';
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
                            rVar.b.add(new StaticLayout(a.i(i15, ""), textPaint2, (int) sVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i22 = i16 + 1;
                            i21 = i23;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new tz(0), i20, i20 + 1, 0);
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
                sVar.n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    sVar.r = true;
                    r rVar2 = (r) arrayList.get(i24);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 1));
                    rVar2.f.addListener(new q(sVar, rVar2, 0));
                    rVar2.f.setInterpolator(ds.g);
                    rVar2.f.setDuration(750L);
                    rVar2.f.setStartDelay(((arrayList.size() - 1) - i24) * 60);
                    rVar2.f.start();
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
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tg.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                s sVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z19) {
                    if (!limitPreviewView2.G) {
                        limitPreviewView2.G = true;
                        try {
                            sVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    sVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.b0);
                } else if (!limitPreviewView2.j0) {
                    sVar2.setRotation(limitPreviewView2.b0);
                }
                if (valueAnimator == limitPreviewView2.i0) {
                    sVar2.setTranslationX(AndroidUtilities.lerp(f20, f13, min));
                    float lerp = AndroidUtilities.lerp(f21, f19, min);
                    if (sVar2.s != lerp) {
                        sVar2.s = lerp;
                        sVar2.v = true;
                        sVar2.invalidate();
                    }
                    sVar2.setPivotX(sVar2.getMeasuredWidth() * lerp);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z20) {
                    limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.a0, f18, min);
                    limitPreviewView2.I.invalidate();
                } else {
                    sVar2.setScaleX(min2);
                    sVar2.setScaleY(min2);
                }
                if (z16) {
                    sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    sVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f22 = 1.0f - floatValue;
                    sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f22));
                    sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f22));
                    sVar2.setAlpha(f22);
                }
            }
        });
        this.i0.addListener(new q40(16, this, z19));
        this.i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new e4(this, 25));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.i0.setDuration(600L);
        } else if (z17) {
            this.i0.setInterpolator(ds.i);
            this.i0.setDuration(320L);
        } else if (z16) {
            this.i0.setInterpolator(ds.h);
            this.i0.setDuration(500L);
        } else {
            this.i0.setDuration(1000L);
            this.i0.setStartDelay(200L);
        }
        this.i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.x = ee.a(f7, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.e0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.h0 = z10;
    }

    public void setIconScale(float f7) {
        this.s = f7;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.L = false;
        setRatingPaintColorKey(y6.Oh);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        s6 s6Var = this.N;
        s6 s6Var2 = this.v;
        if (j11 <= 0) {
            this.a = 0.5f;
            s6Var.setText("");
            s6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            setRatingPaintColorKey(y6.wj);
            this.L = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = ee.a((j11 - j10) / (r11 - j10), 0.0f, 1.0f);
                s6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                s6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) s6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        setPremiumCountColor(this.L);
        setDefaultTextColor(true);
        h((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(a1 a1Var) {
        this.E = a1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.b == i10) {
            z10 = false;
        }
        this.b = i10;
        this.a = ee.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.a0 = this.n;
            this.I.requestLayout();
            requestLayout();
        }
        s6 s6Var = this.v;
        ((FrameLayout.LayoutParams) s6Var.getLayoutParams()).gravity = 5;
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        s6Var.setText("" + i11);
        i(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        s6 s6Var = this.v;
        int i11 = this.r;
        s sVar = this.e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new zq(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                sVar.f = spannableStringBuilder;
            }
            s6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new zq(i11, 0), 0, 1, 0);
                sVar.f = spannableStringBuilder2;
            }
            s6Var.setText("");
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        s6 s6Var;
        s6 s6Var2;
        u6 u6Var = this.S;
        try {
            if (this.n0 && (s6Var2 = this.N) != null) {
                s6Var2.setTextColor(y6.w0(y6.G6, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            if (this.l0 && (s6Var = this.v) != null) {
                s6Var.setTextColor(y6.w0(y6.G6, u6Var));
            }
            int i10 = this.m0;
            if (i10 >= 0) {
                this.K.setColor(y6.w0(i10, u6Var));
                j5 j5Var = this.I;
                if (j5Var != null) {
                    j5Var.invalidate();
                }
                s sVar = this.e;
                if (sVar != null) {
                    sVar.invalidate();
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, u6 u6Var) {
        super(context);
        this.s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.d0 = true;
        this.m0 = -1;
        this.S = u6Var;
        this.a = ee.a(f7, 0.1f, 0.9f);
        this.r = i10;
        this.b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.e = sVar;
            i(i11, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, gb1.s(-2, -2, 0.0f, 3));
        }
        gh0 gh0Var = new gh0(this, context, true);
        this.f0 = gh0Var;
        s6 s6Var = new s6(context, false, false, false);
        this.N = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setText(LocaleController.getString(R.string.LimitFree));
        s6Var.setGravity(16);
        setDefaultTextColor(false);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        f7.V(textView, y6.G6, u6Var);
        if (LocaleController.isRTL) {
            gh0Var.addView(s6Var, gb1.h(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var.addView(textView, gb1.h(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gh0Var.addView(s6Var, gb1.h(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var.addView(textView, gb1.h(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        gh0 gh0Var2 = new gh0(this, context, false);
        this.g0 = gh0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        s6 s6Var2 = new s6(context, false, false, false);
        this.v = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        s6Var2.setGravity(21);
        setPremiumCountColor(true);
        if (LocaleController.isRTL) {
            gh0Var2.addView(textView2, gb1.h(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var2.addView(s6Var2, gb1.h(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            gh0Var2.addView(textView2, gb1.h(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            gh0Var2.addView(s6Var2, gb1.h(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        j5 j5Var = new j5(this, context, u6Var);
        this.I = j5Var;
        j5Var.addView(gh0Var, gb1.g(30.0f, -1));
        j5Var.addView(gh0Var2, gb1.g(30.0f, -1));
        addView(j5Var, gb1.t(-1, 30, 0.0f, 0, 14, i10 != 0 ? 12 : 0, 14, 0));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
