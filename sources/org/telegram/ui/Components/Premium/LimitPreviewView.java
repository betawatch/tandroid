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
import bg.q1;
import bg.u1;
import bg.z2;
import cg.r1;
import cg.t;
import cg.u;
import cg.v;
import cg.w;
import cg.x;
import cg.y;
import i7.f6;
import j7.l1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout {
    public static final /* synthetic */ int h0 = 0;
    public r1 A;
    public int B;
    public boolean C;
    public boolean D;
    public final u1 E;
    public boolean F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public final o6 J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final c6 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public boolean W;
    public float a;
    public x a0;
    public int b;
    public final y b0;
    public int c;
    public final y c0;
    public boolean d;
    public boolean d0;
    public final w e;
    public ValueAnimator e0;
    public boolean f;
    public boolean f0;
    public Runnable g0;
    public float h;
    public int n;
    public final int r;
    public float s;
    public final o6 v;
    public final TextView w;
    public float x;
    public ViewGroup y;

    public LimitPreviewView(Context context, int i10, int i11, c6 c6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, c6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        w wVar;
        Paint paint = limitPreviewView.G;
        w wVar2 = limitPreviewView.e;
        c6 c6Var = limitPreviewView.O;
        o6 o6Var = limitPreviewView.v;
        o6 o6Var2 = limitPreviewView.J;
        limitPreviewView.g0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.H = false;
            paint.setColor(g6.v0(g6.Oh, c6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                o6Var2.setText("");
                o6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(g6.v0(g6.wj, c6Var));
                limitPreviewView.H = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    wVar = wVar2;
                    limitPreviewView.a = i7.w.a((r8 - j10) / (r11 - j10), 0.0f, 1.0f);
                    o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    wVar.setScaleX(0.6f);
                    wVar.setScaleY(0.6f);
                    wVar.setAlpha(0.0f);
                    limitPreviewView.P = true;
                    limitPreviewView.Q = true;
                    limitPreviewView.R = false;
                    limitPreviewView.T = limitPreviewView.n;
                    limitPreviewView.E.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    jr jrVar = jr.h;
                    duration.setInterpolator(jrVar).start();
                    o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(jrVar).start();
                    o6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
                    o6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            wVar = wVar2;
            limitPreviewView.setArrowX(1.0f);
            wVar.setScaleX(0.6f);
            wVar.setScaleY(0.6f);
            wVar.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            jr jrVar2 = jr.h;
            duration2.setInterpolator(jrVar2).start();
            o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(jrVar2).start();
            o6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
            o6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        w wVar;
        Paint paint = limitPreviewView.G;
        w wVar2 = limitPreviewView.e;
        c6 c6Var = limitPreviewView.O;
        o6 o6Var = limitPreviewView.v;
        o6 o6Var2 = limitPreviewView.J;
        limitPreviewView.g0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.H = false;
            paint.setColor(g6.v0(g6.Oh, c6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                o6Var2.setText("");
                o6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(g6.v0(g6.wj, c6Var));
                limitPreviewView.H = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    wVar = wVar2;
                    limitPreviewView.a = i7.w.a((r8 - j10) / (r10 - j10), 0.0f, 1.0f);
                    o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(0.0f);
                    wVar.setScaleX(0.6f);
                    wVar.setScaleY(0.6f);
                    wVar.setAlpha(0.0f);
                    limitPreviewView.P = true;
                    limitPreviewView.Q = true;
                    limitPreviewView.R = false;
                    limitPreviewView.T = limitPreviewView.n;
                    limitPreviewView.E.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    jr jrVar = jr.h;
                    duration.setInterpolator(jrVar).start();
                    o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(jrVar).start();
                    o6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
                    o6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            wVar = wVar2;
            limitPreviewView.setArrowX(0.0f);
            wVar.setScaleX(0.6f);
            wVar.setScaleY(0.6f);
            wVar.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            jr jrVar2 = jr.h;
            duration2.setInterpolator(jrVar2).start();
            o6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(jrVar2).start();
            o6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
            o6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f9) {
        this.n = f9 >= 1.0f ? this.E.getMeasuredWidth() : 0;
        float dp = AndroidUtilities.dp(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 * 2)) * f9) + dp;
        w wVar = this.e;
        wVar.setTranslationX(Utilities.clamp(max - (wVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - wVar.getMeasuredWidth(), dp));
        if (wVar.s != f9) {
            wVar.s = f9;
            wVar.v = true;
            wVar.invalidate();
        }
        wVar.setPivotX(wVar.getMeasuredWidth() * f9);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        boolean z11;
        boolean z12;
        AndroidUtilities.cancelRunOnUIThread(this.g0);
        this.g0 = null;
        int i10 = g6.Oh;
        c6 c6Var = this.O;
        int v02 = g6.v0(i10, c6Var);
        Paint paint = this.G;
        paint.setColor(v02);
        this.H = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        u1 u1Var = this.E;
        o6 o6Var = this.v;
        o6 o6Var2 = this.J;
        if (i11 == i12) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                o6Var2.setText("");
                o6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(g6.v0(g6.wj, c6Var));
                this.H = true;
            } else {
                if (tl_starsRating2.next_level_stars != 0) {
                    long j10 = tl_starsRating2.current_level_stars;
                    this.a = i7.w.a((r12 - j10) / (r6 - j10), 0.0f, 1.0f);
                    z12 = true;
                    o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                    this.P = z12;
                    this.Q = false;
                    this.R = false;
                    this.T = this.n;
                    u1Var.requestLayout();
                    requestLayout();
                    o6Var.setTextColor(!this.H ? -1 : g6.v0(g6.G6, c6Var));
                    o6Var2.setTextColor(-1);
                    f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                    return;
                }
                this.a = 1.0f;
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
            }
            z12 = true;
            this.P = z12;
            this.Q = false;
            this.R = false;
            this.T = this.n;
            u1Var.requestLayout();
            requestLayout();
            o6Var.setTextColor(!this.H ? -1 : g6.v0(g6.G6, c6Var));
            o6Var2.setTextColor(-1);
            f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                z11 = true;
                this.H = true;
            } else {
                z11 = true;
            }
            this.a = 1.0f;
            this.P = z11;
            this.Q = false;
            this.R = z11;
            this.T = this.n;
            u1Var.requestLayout();
            requestLayout();
            o6Var.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
            o6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = o6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).start();
            o6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(jrVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: cg.s
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
            this.g0 = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        if (i12 < i11) {
            paint.setColor(g6.v0(i10, c6Var));
            this.H = false;
            if (tl_starsRating.stars <= 0) {
                z10 = true;
                this.H = true;
            } else {
                z10 = true;
            }
            this.a = 0.0f;
            this.P = z10;
            this.Q = false;
            this.R = z10;
            this.T = this.n;
            u1Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = o6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            jr jrVar2 = jr.h;
            duration2.setInterpolator(jrVar2).start();
            o6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(jrVar2).start();
            o6Var.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
            o6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i14 = 1;
            Runnable runnable2 = new Runnable(this) { // from class: cg.s
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
            this.g0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.A == null) {
            if (this.f) {
                float f9 = this.h + 0.016f;
                this.h = f9;
                if (f9 > 3.0f) {
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
        o6 o6Var = this.J;
        o6 o6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = i7.w.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            o6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            o6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.K.setVisibility(8);
        o6Var2.setTextColor(g6.v0(g6.G6, this.O));
        o6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.L = true;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new iq(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? LocaleController.formatShortNumber(i11, null) : LocaleController.formatNumber(i11, ',')));
        spannableStringBuilder.setSpan(new cu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        w wVar = this.e;
        wVar.f = spannableStringBuilder;
        wVar.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void g(int i10, boolean z10) {
        iq iqVar;
        int i11;
        if (i10 < 0) {
            iqVar = new iq(R.drawable.warning_sign, 0);
        } else {
            iqVar = new iq(this.r, 0);
            float f9 = this.s;
            iqVar.setScale(f9, f9);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r6 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(iqVar, 0, 1, 0);
        if (i10 >= 0 || !this.d0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        w wVar = this.e;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder2 = wVar.f;
            wVar.f = spannableStringBuilder;
            TextPaint textPaint = wVar.c;
            ArrayList arrayList = wVar.h;
            if (wVar.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(wVar.f);
                int length = wVar.f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt == wVar.f.charAt(length) || !Character.isDigit(wVar.f.charAt(length))) {
                        i11 = length;
                    } else {
                        v vVar = new v();
                        arrayList.add(vVar);
                        vVar.e = wVar.d.getSecondaryHorizontal(length);
                        vVar.a = r6;
                        if (i12 >= r6) {
                            i12 = 0;
                        }
                        int i13 = (int) wVar.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + charAt, textPaint, i13, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = vVar.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + wVar.f.charAt(i11), textPaint, (int) wVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new gz(false), i11, i11 + 1, 0);
                        i12++;
                    }
                    length = i11 - 1;
                    r6 = 1;
                }
                wVar.n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) wVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    wVar.r = true;
                    v vVar2 = (v) arrayList.get(i14);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new t(wVar, vVar2, 0));
                    vVar2.f.addListener(new u(wVar, vVar2, 1));
                    vVar2.f.setInterpolator(jr.g);
                    vVar2.f.setDuration(250L);
                    vVar2.f.setStartDelay(((arrayList.size() - 1) - i14) * 60);
                    vVar2.f.start();
                }
            }
        } else {
            wVar.f = spannableStringBuilder;
        }
        wVar.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bd  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f9;
        float f10;
        float f11;
        float f12;
        final float f13;
        float measuredWidth;
        float f14;
        boolean z11;
        float f15;
        boolean z12;
        TextPaint textPaint;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z13 = this.S;
        w wVar = this.e;
        if (!z13 && !this.P && (this.d || wVar == null || !this.D || this.F)) {
            if (this.L) {
                if (this.Q || this.R) {
                    return;
                }
                wVar.setAlpha(1.0f);
                wVar.setScaleX(1.0f);
                wVar.setScaleY(1.0f);
                return;
            }
            if (!this.F) {
                if (wVar != null) {
                    wVar.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + AndroidUtilities.dp(14.0f)) - (wVar.getMeasuredWidth() / 2.0f);
            boolean z14 = this.d;
            if (!z14 && this.D) {
                this.d = true;
                wVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z14) {
                wVar.setAlpha(1.0f);
                wVar.setScaleX(1.0f);
                wVar.setScaleY(1.0f);
            } else {
                wVar.setAlpha(0.0f);
                wVar.setScaleX(0.0f);
                wVar.setScaleY(0.0f);
            }
            wVar.setTranslationX(measuredWidth2);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        int i16 = 0;
        boolean z15 = this.P || this.S;
        this.S = false;
        this.P = false;
        float translationX = z15 ? wVar.getTranslationX() : 0.0f;
        float f16 = dp;
        int i17 = dp * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i17) * this.x) + f16) - (wVar.getMeasuredWidth() / 2.0f);
        if (this.M) {
            float f17 = wVar.s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp) - wVar.getMeasuredWidth(), f16);
            int i18 = this.n;
            if (i18 <= 0) {
                f13 = measuredWidth;
                f11 = f17;
                f12 = 0.0f;
            } else if (i18 >= getMeasuredWidth() - i17) {
                f9 = f17;
                f13 = measuredWidth;
                f11 = f9;
                f12 = 1.0f;
            } else {
                f12 = Utilities.clamp((this.n - (measuredWidth - f16)) / wVar.getMeasuredWidth(), 1.0f, 0.0f);
                f13 = measuredWidth;
                f11 = f17;
            }
        } else {
            if (max < f16) {
                f9 = 0.0f;
                f10 = 0.0f;
            } else {
                f16 = max;
                f9 = 0.5f;
                f10 = 0.5f;
            }
            if (f16 > (getMeasuredWidth() - dp) - wVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - dp) - wVar.getMeasuredWidth();
                f13 = measuredWidth;
                f11 = f9;
                f12 = 1.0f;
            } else {
                f11 = f9;
                f12 = f10;
                f13 = f16;
            }
        }
        final boolean z16 = this.Q;
        final boolean z17 = this.R;
        if (!z16 && !z17) {
            wVar.setAlpha(1.0f);
        }
        wVar.setTranslationX(translationX);
        wVar.setPivotX(wVar.getMeasuredWidth() / 2.0f);
        wVar.setPivotY(wVar.getMeasuredHeight());
        if (!z15) {
            wVar.setScaleX(0.0f);
            wVar.setScaleY(0.0f);
            TextPaint textPaint2 = wVar.c;
            ArrayList arrayList = wVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = wVar.y;
            if (!limitPreviewView.L || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wVar.f);
                int i19 = 0;
                boolean z18 = true;
                while (i19 < wVar.f.length()) {
                    if (Character.isDigit(wVar.f.charAt(i19))) {
                        v vVar = new v();
                        arrayList.add(vVar);
                        f15 = f11;
                        vVar.e = wVar.d.getSecondaryHorizontal(i19);
                        vVar.d = z18;
                        if (i16 >= 1) {
                            z18 = !z18;
                            i16 = 0;
                        }
                        i16++;
                        int charAt = wVar.f.charAt(i19) - '0';
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
                            vVar.b.add(new StaticLayout(l1.k(i14, ""), textPaint2, (int) wVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i15 + 1;
                            i20 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new gz(false), i19, i19 + 1, 0);
                    } else {
                        f15 = f11;
                        z12 = z15;
                        textPaint = textPaint2;
                    }
                    i19++;
                    textPaint2 = textPaint;
                    f11 = f15;
                    z15 = z12;
                }
                f14 = f11;
                z11 = z15;
                wVar.n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) wVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    wVar.r = true;
                    v vVar2 = (v) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new t(wVar, vVar2, 1));
                    vVar2.f.addListener(new u(wVar, vVar2, 0));
                    vVar2.f.setInterpolator(jr.g);
                    vVar2.f.setDuration(750L);
                    vVar2.f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    vVar2.f.start();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.e0 = ofFloat2;
                final float f18 = this.n;
                if (z11) {
                    this.n = this.T;
                }
                final boolean z19 = !this.f0;
                this.f0 = true;
                final float f19 = f12;
                final float f20 = translationX;
                final float f21 = f14;
                final boolean z20 = z11;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cg.r
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                        w wVar2 = limitPreviewView2.e;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float min = Math.min(1.0f, floatValue);
                        if (floatValue > 1.0f && z19) {
                            if (!limitPreviewView2.C) {
                                limitPreviewView2.C = true;
                                try {
                                    wVar2.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                            wVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.U);
                        } else if (!limitPreviewView2.f0) {
                            wVar2.setRotation(limitPreviewView2.U);
                        }
                        if (valueAnimator == limitPreviewView2.e0) {
                            wVar2.setTranslationX(AndroidUtilities.lerp(f20, f13, min));
                            float lerp = AndroidUtilities.lerp(f21, f19, min);
                            if (wVar2.s != lerp) {
                                wVar2.s = lerp;
                                wVar2.v = true;
                                wVar2.invalidate();
                            }
                            wVar2.setPivotX(wVar2.getMeasuredWidth() * lerp);
                        }
                        float min2 = Math.min(1.0f, 2.0f * min);
                        if (z20) {
                            limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.T, f18, min);
                            limitPreviewView2.E.invalidate();
                        } else {
                            wVar2.setScaleX(min2);
                            wVar2.setScaleY(min2);
                        }
                        if (z16) {
                            wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            wVar2.setAlpha(floatValue);
                        } else if (z17) {
                            float f22 = 1.0f - floatValue;
                            wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f22));
                            wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f22));
                            wVar2.setAlpha(f22);
                        }
                    }
                });
                this.e0.addListener(new z2(1, this, z19));
                this.e0.setInterpolator(new OvershootInterpolator());
                if (!this.S) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new q1(this, 6));
                    ofFloat3.setDuration(500L);
                    ofFloat3.start();
                    this.e0.setDuration(600L);
                } else if (z17) {
                    this.e0.setInterpolator(jr.i);
                    this.e0.setDuration(320L);
                } else if (z16) {
                    this.e0.setInterpolator(jr.h);
                    this.e0.setDuration(500L);
                } else {
                    this.e0.setDuration(1000L);
                    this.e0.setStartDelay(200L);
                }
                this.e0.start();
                this.d = true;
            }
        }
        f14 = f11;
        z11 = z15;
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e0 = ofFloat22;
        final float f182 = this.n;
        if (z11) {
        }
        final boolean z192 = !this.f0;
        this.f0 = true;
        final float f192 = f12;
        final float f202 = translationX;
        final float f212 = f14;
        final boolean z202 = z11;
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cg.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                w wVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z192) {
                    if (!limitPreviewView2.C) {
                        limitPreviewView2.C = true;
                        try {
                            wVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    wVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.U);
                } else if (!limitPreviewView2.f0) {
                    wVar2.setRotation(limitPreviewView2.U);
                }
                if (valueAnimator == limitPreviewView2.e0) {
                    wVar2.setTranslationX(AndroidUtilities.lerp(f202, f13, min));
                    float lerp = AndroidUtilities.lerp(f212, f192, min);
                    if (wVar2.s != lerp) {
                        wVar2.s = lerp;
                        wVar2.v = true;
                        wVar2.invalidate();
                    }
                    wVar2.setPivotX(wVar2.getMeasuredWidth() * lerp);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z202) {
                    limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.T, f182, min);
                    limitPreviewView2.E.invalidate();
                } else {
                    wVar2.setScaleX(min2);
                    wVar2.setScaleY(min2);
                }
                if (z16) {
                    wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    wVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f22 = 1.0f - floatValue;
                    wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f22));
                    wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f22));
                    wVar2.setAlpha(f22);
                }
            }
        });
        this.e0.addListener(new z2(1, this, z192));
        this.e0.setInterpolator(new OvershootInterpolator());
        if (!this.S) {
        }
        this.e0.start();
        this.d = true;
    }

    public void setBagePosition(float f9) {
        this.x = i7.w.a(f9, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(x xVar) {
        this.a0 = xVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.d0 = z10;
    }

    public void setIconScale(float f9) {
        this.s = f9;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.H = false;
        int i10 = g6.Oh;
        c6 c6Var = this.O;
        int v02 = g6.v0(i10, c6Var);
        Paint paint = this.G;
        paint.setColor(v02);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        o6 o6Var = this.J;
        o6 o6Var2 = this.v;
        if (j11 <= 0) {
            this.a = 0.5f;
            o6Var.setText("");
            o6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(g6.v0(g6.wj, c6Var));
            this.H = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = i7.w.a((j11 - j10) / (r14 - j10), 0.0f, 1.0f);
                o6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                o6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) o6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.K.setVisibility(8);
        o6Var2.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
        o6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    public void setStaticGradinet(r1 r1Var) {
        this.A = r1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.b == i10) {
            z10 = false;
        }
        this.b = i10;
        this.a = i7.w.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.S = true;
            this.T = this.n;
            this.E.requestLayout();
            requestLayout();
        }
        o6 o6Var = this.v;
        ((FrameLayout.LayoutParams) o6Var.getLayoutParams()).gravity = 5;
        this.w.setVisibility(8);
        this.K.setVisibility(8);
        this.J.setText("0");
        o6Var.setText("" + i11);
        g(i10, false);
        this.L = true;
        this.M = true;
    }

    public void setType(int i10) {
        o6 o6Var = this.v;
        int i11 = this.r;
        w wVar = this.e;
        if (i10 == 6) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new iq(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                wVar.f = spannableStringBuilder;
            }
            o6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new iq(i11, 0), 0, 1, 0);
                wVar.f = spannableStringBuilder2;
            }
            o6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f9, c6 c6Var) {
        super(context);
        this.s = 1.0f;
        this.D = true;
        this.G = new Paint(1);
        this.W = true;
        this.O = c6Var;
        this.a = i7.w.a(f9, 0.1f, 0.9f);
        this.r = i10;
        this.b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            w wVar = new w(this, context);
            this.e = wVar;
            g(i11, false);
            wVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(wVar, f6.o(-2, -2, 0.0f, 3));
        }
        y yVar = new y(this, context, true);
        this.b0 = yVar;
        o6 o6Var = new o6(context, false, false, false);
        this.J = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setText(LocaleController.getString(R.string.LimitFree));
        o6Var.setGravity(16);
        int i13 = g6.G6;
        o6Var.setTextColor(g6.v0(i13, c6Var));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(g6.v0(i13, c6Var));
        if (LocaleController.isRTL) {
            yVar.addView(o6Var, f6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, f6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar.addView(o6Var, f6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, f6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        y yVar2 = new y(this, context, false);
        this.c0 = yVar2;
        TextView textView2 = new TextView(context);
        this.K = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        o6 o6Var2 = new o6(context, false, false, false);
        this.v = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        o6Var2.setGravity(21);
        o6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            yVar2.addView(textView2, f6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(o6Var2, f6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar2.addView(textView2, f6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(o6Var2, f6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        u1 u1Var = new u1(this, context, c6Var);
        this.E = u1Var;
        u1Var.addView(yVar, f6.c(30.0f, -1));
        u1Var.addView(yVar2, f6.c(30.0f, -1));
        addView(u1Var, f6.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
