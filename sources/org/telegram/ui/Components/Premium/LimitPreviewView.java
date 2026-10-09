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
import hg.c;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.f70;
import org.telegram.ui.t5;
import rg.a1;
import rg.p;
import rg.q;
import rg.r;
import rg.s;
import rg.t;
import w7.o;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout {
    public static final /* synthetic */ int l0 = 0;
    public a1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final t5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final r6 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final e6 S;
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
    public final kh0 f0;
    public final kh0 g0;
    public float h;
    public boolean h0;
    public ValueAnimator i0;
    public boolean j0;
    public Runnable k0;
    public int n;
    public final int r;
    public float s;
    public final r6 v;
    public final TextView w;
    public float x;
    public ViewGroup y;

    public LimitPreviewView(Context context, int i10, int i11, e6 e6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, e6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        s sVar;
        Paint paint = limitPreviewView.K;
        s sVar2 = limitPreviewView.e;
        e6 e6Var = limitPreviewView.S;
        r6 r6Var = limitPreviewView.v;
        r6 r6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            paint.setColor(i6.w0(i6.Oh, e6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                r6Var2.setText("");
                r6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(i6.w0(i6.wj, e6Var));
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j3 = tl_starsRating.current_level_stars;
                    z10 = false;
                    sVar = sVar2;
                    limitPreviewView.a = o.a((r8 - j3) / (r10 - j3), 0.0f, 1.0f);
                    r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    sVar.setScaleX(0.6f);
                    sVar.setScaleY(0.6f);
                    sVar.setAlpha(0.0f);
                    limitPreviewView.T = true;
                    limitPreviewView.U = true;
                    limitPreviewView.V = z10;
                    limitPreviewView.a0 = limitPreviewView.n;
                    limitPreviewView.I.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    hs hsVar = hs.h;
                    duration.setInterpolator(hsVar).start();
                    r6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(hsVar).start();
                    r6Var.setTextColor(!limitPreviewView.L ? -1 : i6.w0(i6.G6, e6Var));
                    r6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            sVar = sVar2;
            z10 = false;
            limitPreviewView.setArrowX(1.0f);
            sVar.setScaleX(0.6f);
            sVar.setScaleY(0.6f);
            sVar.setAlpha(0.0f);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = z10;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            hs hsVar2 = hs.h;
            duration2.setInterpolator(hsVar2).start();
            r6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(hsVar2).start();
            r6Var.setTextColor(!limitPreviewView.L ? -1 : i6.w0(i6.G6, e6Var));
            r6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        s sVar;
        Paint paint = limitPreviewView.K;
        s sVar2 = limitPreviewView.e;
        e6 e6Var = limitPreviewView.S;
        r6 r6Var = limitPreviewView.v;
        r6 r6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            paint.setColor(i6.w0(i6.Oh, e6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                r6Var2.setText("");
                r6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(i6.w0(i6.wj, e6Var));
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j3 = tl_starsRating.current_level_stars;
                    z10 = false;
                    sVar = sVar2;
                    limitPreviewView.a = o.a((r8 - j3) / (r10 - j3), 0.0f, 1.0f);
                    r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(0.0f);
                    sVar.setScaleX(0.6f);
                    sVar.setScaleY(0.6f);
                    sVar.setAlpha(0.0f);
                    limitPreviewView.T = true;
                    limitPreviewView.U = true;
                    limitPreviewView.V = z10;
                    limitPreviewView.a0 = limitPreviewView.n;
                    limitPreviewView.I.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    hs hsVar = hs.h;
                    duration.setInterpolator(hsVar).start();
                    r6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(hsVar).start();
                    r6Var.setTextColor(!limitPreviewView.L ? -1 : i6.w0(i6.G6, e6Var));
                    r6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            sVar = sVar2;
            z10 = false;
            limitPreviewView.setArrowX(0.0f);
            sVar.setScaleX(0.6f);
            sVar.setScaleY(0.6f);
            sVar.setAlpha(0.0f);
            limitPreviewView.T = true;
            limitPreviewView.U = true;
            limitPreviewView.V = z10;
            limitPreviewView.a0 = limitPreviewView.n;
            limitPreviewView.I.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            hs hsVar2 = hs.h;
            duration2.setInterpolator(hsVar2).start();
            r6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(hsVar2).start();
            r6Var.setTextColor(!limitPreviewView.L ? -1 : i6.w0(i6.G6, e6Var));
            r6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
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

    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AndroidUtilities.cancelRunOnUIThread(this.k0);
        this.k0 = null;
        int i10 = i6.Oh;
        e6 e6Var = this.S;
        int w02 = i6.w0(i10, e6Var);
        Paint paint = this.K;
        paint.setColor(w02);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        t5 t5Var = this.I;
        r6 r6Var = this.v;
        r6 r6Var2 = this.N;
        if (i11 == i12) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                r6Var2.setText("");
                r6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(i6.w0(i6.wj, e6Var));
                this.L = true;
                z12 = false;
                z13 = true;
            } else {
                if (tl_starsRating2.next_level_stars == 0) {
                    this.a = 1.0f;
                    r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                    r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    z12 = false;
                    z13 = true;
                } else {
                    z12 = false;
                    long j3 = tl_starsRating2.current_level_stars;
                    this.a = o.a((r12 - j3) / (r6 - j3), 0.0f, 1.0f);
                    z13 = true;
                    r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                }
            }
            this.T = z13;
            boolean z14 = z12;
            this.U = z14;
            this.V = z14;
            this.a0 = this.n;
            t5Var.requestLayout();
            requestLayout();
            r6Var.setTextColor(this.L ? -1 : i6.w0(i6.G6, e6Var));
            r6Var2.setTextColor(-1);
            f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
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
            t5Var.requestLayout();
            requestLayout();
            r6Var.setTextColor(this.L ? -1 : i6.w0(i6.G6, e6Var));
            r6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = r6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            hs hsVar = hs.h;
            duration.setInterpolator(hsVar).start();
            r6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(hsVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: rg.o
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
            paint.setColor(i6.w0(i10, e6Var));
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
            t5Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = r6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            hs hsVar2 = hs.h;
            duration2.setInterpolator(hsVar2).start();
            r6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(hsVar2).start();
            r6Var.setTextColor(this.L ? -1 : i6.w0(i6.G6, e6Var));
            r6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i14 = 1;
            Runnable runnable2 = new Runnable(this) { // from class: rg.o
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

    public final void e(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        r6 r6Var = this.N;
        r6 r6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            r6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            r6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = o.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            r6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            r6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) r6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        r6Var2.setTextColor(i6.w0(i6.G6, this.S));
        r6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new er(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? LocaleController.formatShortNumber(i11, null) : LocaleController.formatNumber(i11, ',')));
        spannableStringBuilder.setSpan(new bv(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.e;
        sVar.f = spannableStringBuilder;
        sVar.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void g(int i10, boolean z10) {
        er erVar;
        int i11;
        int i12 = 0;
        if (i10 < 0) {
            erVar = new er(R.drawable.warning_sign, 0);
        } else {
            erVar = new er(this.r, 0);
            float f7 = this.s;
            erVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(erVar, 0, 1, 0);
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
                        rVar.a = r62;
                        if (i13 >= r62) {
                            i13 = i12;
                        }
                        int i14 = (int) sVar.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + charAt, textPaint, i14, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f.charAt(i11), textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new b00(false), i11, i11 + 1, 0);
                        i13++;
                    }
                    length = i11 - 1;
                    i12 = 0;
                    r62 = 1;
                }
                sVar.n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    sVar.r = true;
                    r rVar2 = (r) arrayList.get(i15);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f.setInterpolator(hs.g);
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
                            rVar.b.add(new StaticLayout(c.h(i15, ""), textPaint2, (int) sVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i22 = i16 + 1;
                            i21 = i23;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new b00(false), i20, i20 + 1, 0);
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
                    rVar2.f.setInterpolator(hs.g);
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
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rg.n
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
        this.i0.addListener(new f70(15, this, z19));
        this.i0.setInterpolator(new OvershootInterpolator());
        if (this.W) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new r0(this, 14));
            ofFloat3.setDuration(500L);
            ofFloat3.start();
            this.i0.setDuration(600L);
        } else if (z17) {
            this.i0.setInterpolator(hs.i);
            this.i0.setDuration(320L);
        } else if (z16) {
            this.i0.setInterpolator(hs.h);
            this.i0.setDuration(500L);
        } else {
            this.i0.setDuration(1000L);
            this.i0.setStartDelay(200L);
        }
        this.i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.x = o.a(f7, 0.1f, 0.9f);
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
        int i10 = i6.Oh;
        e6 e6Var = this.S;
        int w02 = i6.w0(i10, e6Var);
        Paint paint = this.K;
        paint.setColor(w02);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        r6 r6Var = this.N;
        r6 r6Var2 = this.v;
        if (j10 <= 0) {
            this.a = 0.5f;
            r6Var.setText("");
            r6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(i6.w0(i6.wj, e6Var));
            this.L = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = o.a((j10 - j3) / (r1 - j3), 0.0f, 1.0f);
                r6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                r6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) r6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        r6Var2.setTextColor(this.L ? -1 : i6.w0(i6.G6, e6Var));
        r6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
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
        this.a = o.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.a0 = this.n;
            this.I.requestLayout();
            requestLayout();
        }
        r6 r6Var = this.v;
        ((FrameLayout.LayoutParams) r6Var.getLayoutParams()).gravity = 5;
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        r6Var.setText("" + i11);
        g(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        r6 r6Var = this.v;
        int i11 = this.r;
        s sVar = this.e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new er(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                sVar.f = spannableStringBuilder;
            }
            r6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new er(i11, 0), 0, 1, 0);
                sVar.f = spannableStringBuilder2;
            }
            r6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, e6 e6Var) {
        super(context);
        this.s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.d0 = true;
        this.S = e6Var;
        this.a = o.a(f7, 0.1f, 0.9f);
        this.r = i10;
        this.b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.e = sVar;
            g(i11, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, x5.o(-2, -2, 0.0f, 3));
        }
        kh0 kh0Var = new kh0(this, context, true);
        this.f0 = kh0Var;
        r6 r6Var = new r6(context, false, false, false);
        this.N = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setText(LocaleController.getString(R.string.LimitFree));
        r6Var.setGravity(16);
        int i13 = i6.G6;
        r6Var.setTextColor(i6.w0(i13, e6Var));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(i6.w0(i13, e6Var));
        if (LocaleController.isRTL) {
            kh0Var.addView(r6Var, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 5));
            kh0Var.addView(textView, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 3));
        } else {
            kh0Var.addView(r6Var, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 3));
            kh0Var.addView(textView, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 5));
        }
        kh0 kh0Var2 = new kh0(this, context, false);
        this.g0 = kh0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        r6 r6Var2 = new r6(context, false, false, false);
        this.v = r6Var2;
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var2.setTypeface(AndroidUtilities.bold());
        r6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        r6Var2.setGravity(21);
        r6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            kh0Var2.addView(textView2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 5));
            kh0Var2.addView(r6Var2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 3));
        } else {
            kh0Var2.addView(textView2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 3));
            kh0Var2.addView(r6Var2, x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 5));
        }
        t5 t5Var = new t5(this, context, e6Var);
        this.I = t5Var;
        t5Var.addView(kh0Var, x5.d(30.0f, -1));
        t5Var.addView(kh0Var2, x5.d(30.0f, -1));
        addView(t5Var, x5.p(-1, 30, 0.0f, 0, 14, i10 != 0 ? 12 : 0, 14, 0));
    }
}
