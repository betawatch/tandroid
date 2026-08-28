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
import bh.g;
import g7.e6;
import g7.n;
import j3.r0;
import java.util.ArrayList;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.xy;
import org.telegram.ui.n60;
import zf.p;
import zf.q;
import zf.r;
import zf.s;
import zf.t;
import zf.z0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout {
    public static final /* synthetic */ int h0 = 0;
    public z0 A;
    public int B;
    public boolean C;
    public boolean D;
    public final g E;
    public boolean F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public final j6 J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final b6 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public boolean V;
    public boolean W;
    public float a;
    public t a0;
    public int b;
    public final tf0 b0;
    public int c;
    public final tf0 c0;
    public boolean d;
    public boolean d0;
    public final s e;
    public ValueAnimator e0;
    public boolean f;
    public boolean f0;
    public Runnable g0;
    public float h;
    public int n;
    public final int r;
    public float s;
    public final j6 v;
    public final TextView w;
    public float x;
    public ViewGroup y;

    public LimitPreviewView(Context context, int i9, int i10, b6 b6Var, int i11) {
        this(context, i9, i10, i11, 0.5f, b6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar;
        Paint paint = limitPreviewView.G;
        s sVar2 = limitPreviewView.e;
        b6 b6Var = limitPreviewView.O;
        j6 j6Var = limitPreviewView.v;
        j6 j6Var2 = limitPreviewView.J;
        limitPreviewView.g0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.H = false;
            paint.setColor(f6.v0(f6.Oh, b6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                j6Var2.setText("");
                j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(f6.v0(f6.wj, b6Var));
                limitPreviewView.H = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    sVar = sVar2;
                    limitPreviewView.a = n.a((r8 - j10) / (r11 - j10), 0.0f, 1.0f);
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    sVar.setScaleX(0.6f);
                    sVar.setScaleY(0.6f);
                    sVar.setAlpha(0.0f);
                    limitPreviewView.P = true;
                    limitPreviewView.Q = true;
                    limitPreviewView.R = false;
                    limitPreviewView.T = limitPreviewView.n;
                    limitPreviewView.E.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    gr grVar = gr.h;
                    duration.setInterpolator(grVar).start();
                    j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar).start();
                    j6Var.setTextColor(!limitPreviewView.H ? -1 : f6.v0(f6.G6, b6Var));
                    j6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            sVar = sVar2;
            limitPreviewView.setArrowX(1.0f);
            sVar.setScaleX(0.6f);
            sVar.setScaleY(0.6f);
            sVar.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar2).start();
            j6Var.setTextColor(!limitPreviewView.H ? -1 : f6.v0(f6.G6, b6Var));
            j6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        s sVar;
        Paint paint = limitPreviewView.G;
        s sVar2 = limitPreviewView.e;
        b6 b6Var = limitPreviewView.O;
        j6 j6Var = limitPreviewView.v;
        j6 j6Var2 = limitPreviewView.J;
        limitPreviewView.g0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.H = false;
            paint.setColor(f6.v0(f6.Oh, b6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                j6Var2.setText("");
                j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(f6.v0(f6.wj, b6Var));
                limitPreviewView.H = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    sVar = sVar2;
                    limitPreviewView.a = n.a((r8 - j10) / (r10 - j10), 0.0f, 1.0f);
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(0.0f);
                    sVar.setScaleX(0.6f);
                    sVar.setScaleY(0.6f);
                    sVar.setAlpha(0.0f);
                    limitPreviewView.P = true;
                    limitPreviewView.Q = true;
                    limitPreviewView.R = false;
                    limitPreviewView.T = limitPreviewView.n;
                    limitPreviewView.E.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    gr grVar = gr.h;
                    duration.setInterpolator(grVar).start();
                    j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar).start();
                    j6Var.setTextColor(!limitPreviewView.H ? -1 : f6.v0(f6.G6, b6Var));
                    j6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            sVar = sVar2;
            limitPreviewView.setArrowX(0.0f);
            sVar.setScaleX(0.6f);
            sVar.setScaleY(0.6f);
            sVar.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(grVar2).start();
            j6Var.setTextColor(!limitPreviewView.H ? -1 : f6.v0(f6.G6, b6Var));
            j6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f10) {
        this.n = f10 >= 1.0f ? this.E.getMeasuredWidth() : 0;
        float dp = AndroidUtilities.dp(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 * 2)) * f10) + dp;
        s sVar = this.e;
        sVar.setTranslationX(Utilities.clamp(max - (sVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - sVar.getMeasuredWidth(), dp));
        if (sVar.s != f10) {
            sVar.s = f10;
            sVar.v = true;
            sVar.invalidate();
        }
        sVar.setPivotX(sVar.getMeasuredWidth() * f10);
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
        int i9 = f6.Oh;
        b6 b6Var = this.O;
        int v02 = f6.v0(i9, b6Var);
        Paint paint = this.G;
        paint.setColor(v02);
        this.H = false;
        int i10 = tl_starsRating.level;
        int i11 = tl_starsRating2.level;
        g gVar = this.E;
        j6 j6Var = this.v;
        j6 j6Var2 = this.J;
        if (i10 == i11) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                j6Var2.setText("");
                j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(f6.v0(f6.wj, b6Var));
                this.H = true;
            } else {
                if (tl_starsRating2.next_level_stars != 0) {
                    long j10 = tl_starsRating2.current_level_stars;
                    this.a = n.a((r12 - j10) / (r6 - j10), 0.0f, 1.0f);
                    z12 = true;
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                    this.P = z12;
                    this.Q = false;
                    this.R = false;
                    this.T = this.n;
                    gVar.requestLayout();
                    requestLayout();
                    j6Var.setTextColor(!this.H ? -1 : f6.v0(f6.G6, b6Var));
                    j6Var2.setTextColor(-1);
                    f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                    return;
                }
                this.a = 1.0f;
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i11 - 1)));
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
            }
            z12 = true;
            this.P = z12;
            this.Q = false;
            this.R = false;
            this.T = this.n;
            gVar.requestLayout();
            requestLayout();
            j6Var.setTextColor(!this.H ? -1 : f6.v0(f6.G6, b6Var));
            j6Var2.setTextColor(-1);
            f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i11 > i10) {
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
            gVar.requestLayout();
            requestLayout();
            j6Var.setTextColor(this.H ? -1 : f6.v0(f6.G6, b6Var));
            j6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(grVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i12 = 0;
            Runnable runnable = new Runnable(this) { // from class: zf.o
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
            this.g0 = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        if (i11 < i10) {
            paint.setColor(f6.v0(i9, b6Var));
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
            gVar.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            gr grVar2 = gr.h;
            duration2.setInterpolator(grVar2).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(grVar2).start();
            j6Var.setTextColor(this.H ? -1 : f6.v0(f6.G6, b6Var));
            j6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 1;
            Runnable runnable2 = new Runnable(this) { // from class: zf.o
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
            this.g0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.A == null) {
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

    public final void e(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        int i9;
        int i10 = tL_premium_boostsStatus.current_level_boosts;
        int i11 = tL_premium_boostsStatus.boosts;
        j6 j6Var = this.J;
        j6 j6Var2 = this.v;
        if ((i10 == i11 && z10) || (i9 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = n.a((i11 - i10) / (i9 - i10), 0.0f, 1.0f);
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.K.setVisibility(8);
        j6Var2.setTextColor(f6.v0(f6.G6, this.O));
        j6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.L = true;
    }

    public final void f(int i9, int i10) {
        if (i9 < 0) {
            g(i9, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new eq(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i9 > 1200 ? LocaleController.formatShortNumber(i9, null) : LocaleController.formatNumber(i9, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        spannableStringBuilder.setSpan(new wt(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.e;
        sVar.f = spannableStringBuilder;
        sVar.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void g(int i9, boolean z10) {
        eq eqVar;
        int i10;
        if (i9 < 0) {
            eqVar = new eq(R.drawable.warning_sign, 0);
        } else {
            eqVar = new eq(this.r, 0);
            float f10 = this.s;
            eqVar.setScale(f10, f10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(eqVar, 0, 1, 0);
        if (i9 >= 0 || !this.d0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i9, ','));
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
                int i11 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt == sVar.f.charAt(length) || !Character.isDigit(sVar.f.charAt(length))) {
                        i10 = length;
                    } else {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.e = sVar.d.getSecondaryHorizontal(length);
                        rVar.a = r62;
                        if (i11 >= r62) {
                            i11 = 0;
                        }
                        int i12 = (int) sVar.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i10 = length;
                        StaticLayout staticLayout = new StaticLayout("" + charAt, textPaint, i12, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f.charAt(i10), textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new xy(false), i10, i10 + 1, 0);
                        i11++;
                    }
                    length = i10 - 1;
                    r62 = 1;
                }
                sVar.n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sVar.r = true;
                    r rVar2 = (r) arrayList.get(i13);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 0));
                    rVar2.f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f.setInterpolator(gr.g);
                    rVar2.f.setDuration(250L);
                    rVar2.f.setStartDelay(((arrayList.size() - 1) - i13) * 60);
                    rVar2.f.start();
                }
            }
        } else {
            sVar.f = spannableStringBuilder;
        }
        sVar.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bd  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        final float f14;
        float measuredWidth;
        float f15;
        boolean z11;
        float f16;
        boolean z12;
        TextPaint textPaint;
        int i13;
        int i14;
        super.onLayout(z10, i9, i10, i11, i12);
        boolean z13 = this.S;
        s sVar = this.e;
        if (!z13 && !this.P && (this.d || sVar == null || !this.D || this.F)) {
            if (this.L) {
                if (this.Q || this.R) {
                    return;
                }
                sVar.setAlpha(1.0f);
                sVar.setScaleX(1.0f);
                sVar.setScaleY(1.0f);
                return;
            }
            if (!this.F) {
                if (sVar != null) {
                    sVar.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + AndroidUtilities.dp(14.0f)) - (sVar.getMeasuredWidth() / 2.0f);
            boolean z14 = this.d;
            if (!z14 && this.D) {
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
        int i15 = 0;
        boolean z15 = this.P || this.S;
        this.S = false;
        this.P = false;
        float translationX = z15 ? sVar.getTranslationX() : 0.0f;
        float f17 = dp;
        int i16 = dp * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i16) * this.x) + f17) - (sVar.getMeasuredWidth() / 2.0f);
        if (this.M) {
            float f18 = sVar.s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), f17);
            int i17 = this.n;
            if (i17 <= 0) {
                f14 = measuredWidth;
                f12 = f18;
                f13 = 0.0f;
            } else if (i17 >= getMeasuredWidth() - i16) {
                f10 = f18;
                f14 = measuredWidth;
                f12 = f10;
                f13 = 1.0f;
            } else {
                f13 = Utilities.clamp((this.n - (measuredWidth - f17)) / sVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            if (f17 > (getMeasuredWidth() - dp) - sVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - dp) - sVar.getMeasuredWidth();
                f14 = measuredWidth;
                f12 = f10;
                f13 = 1.0f;
            } else {
                f12 = f10;
                f13 = f11;
                f14 = f17;
            }
        }
        final boolean z16 = this.Q;
        final boolean z17 = this.R;
        if (!z16 && !z17) {
            sVar.setAlpha(1.0f);
        }
        sVar.setTranslationX(translationX);
        sVar.setPivotX(sVar.getMeasuredWidth() / 2.0f);
        sVar.setPivotY(sVar.getMeasuredHeight());
        if (!z15) {
            sVar.setScaleX(0.0f);
            sVar.setScaleY(0.0f);
            TextPaint textPaint2 = sVar.c;
            ArrayList arrayList = sVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = sVar.y;
            if (!limitPreviewView.L || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f);
                int i18 = 0;
                boolean z18 = true;
                while (i18 < sVar.f.length()) {
                    if (Character.isDigit(sVar.f.charAt(i18))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        f16 = f12;
                        rVar.e = sVar.d.getSecondaryHorizontal(i18);
                        rVar.d = z18;
                        if (i15 >= 1) {
                            z18 = !z18;
                            i15 = 0;
                        }
                        i15++;
                        int charAt = sVar.f.charAt(i18) - '0';
                        int i19 = charAt == 0 ? 10 : charAt;
                        z12 = z15;
                        int i20 = 1;
                        while (i20 <= i19) {
                            int i21 = i19;
                            if (i20 == 10) {
                                i14 = i20;
                                i13 = 0;
                            } else {
                                i13 = i20;
                                i14 = i13;
                            }
                            rVar.b.add(new StaticLayout(r0.l(i13, ""), textPaint2, (int) sVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i20 = i14 + 1;
                            i19 = i21;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new xy(false), i18, i18 + 1, 0);
                    } else {
                        f16 = f12;
                        z12 = z15;
                        textPaint = textPaint2;
                    }
                    i18++;
                    textPaint2 = textPaint;
                    f12 = f16;
                    z15 = z12;
                }
                f15 = f12;
                z11 = z15;
                sVar.n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    sVar.r = true;
                    r rVar2 = (r) arrayList.get(i22);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new p(sVar, rVar2, 1));
                    rVar2.f.addListener(new q(sVar, rVar2, 0));
                    rVar2.f.setInterpolator(gr.g);
                    rVar2.f.setDuration(750L);
                    rVar2.f.setStartDelay(((arrayList.size() - 1) - i22) * 60);
                    rVar2.f.start();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.e0 = ofFloat2;
                final float f19 = this.n;
                if (z11) {
                    this.n = this.T;
                }
                final boolean z19 = !this.f0;
                this.f0 = true;
                final float f20 = f13;
                final float f21 = translationX;
                final float f22 = f15;
                final boolean z20 = z11;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zf.n
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                        s sVar2 = limitPreviewView2.e;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float min = Math.min(1.0f, floatValue);
                        if (floatValue > 1.0f && z19) {
                            if (!limitPreviewView2.C) {
                                limitPreviewView2.C = true;
                                try {
                                    sVar2.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                            sVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.U);
                        } else if (!limitPreviewView2.f0) {
                            sVar2.setRotation(limitPreviewView2.U);
                        }
                        if (valueAnimator == limitPreviewView2.e0) {
                            sVar2.setTranslationX(AndroidUtilities.lerp(f21, f14, min));
                            float lerp = AndroidUtilities.lerp(f22, f20, min);
                            if (sVar2.s != lerp) {
                                sVar2.s = lerp;
                                sVar2.v = true;
                                sVar2.invalidate();
                            }
                            sVar2.setPivotX(sVar2.getMeasuredWidth() * lerp);
                        }
                        float min2 = Math.min(1.0f, 2.0f * min);
                        if (z20) {
                            limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.T, f19, min);
                            limitPreviewView2.E.invalidate();
                        } else {
                            sVar2.setScaleX(min2);
                            sVar2.setScaleY(min2);
                        }
                        if (z16) {
                            sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            sVar2.setAlpha(floatValue);
                        } else if (z17) {
                            float f23 = 1.0f - floatValue;
                            sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                            sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                            sVar2.setAlpha(f23);
                        }
                    }
                });
                this.e0.addListener(new n60(16, this, z19));
                this.e0.setInterpolator(new OvershootInterpolator());
                if (!this.S) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new g4(this, 25));
                    ofFloat3.setDuration(500L);
                    ofFloat3.start();
                    this.e0.setDuration(600L);
                } else if (z17) {
                    this.e0.setInterpolator(gr.i);
                    this.e0.setDuration(320L);
                } else if (z16) {
                    this.e0.setInterpolator(gr.h);
                    this.e0.setDuration(500L);
                } else {
                    this.e0.setDuration(1000L);
                    this.e0.setStartDelay(200L);
                }
                this.e0.start();
                this.d = true;
            }
        }
        f15 = f12;
        z11 = z15;
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e0 = ofFloat22;
        final float f192 = this.n;
        if (z11) {
        }
        final boolean z192 = !this.f0;
        this.f0 = true;
        final float f202 = f13;
        final float f212 = translationX;
        final float f222 = f15;
        final boolean z202 = z11;
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zf.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                s sVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z192) {
                    if (!limitPreviewView2.C) {
                        limitPreviewView2.C = true;
                        try {
                            sVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    sVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.U);
                } else if (!limitPreviewView2.f0) {
                    sVar2.setRotation(limitPreviewView2.U);
                }
                if (valueAnimator == limitPreviewView2.e0) {
                    sVar2.setTranslationX(AndroidUtilities.lerp(f212, f14, min));
                    float lerp = AndroidUtilities.lerp(f222, f202, min);
                    if (sVar2.s != lerp) {
                        sVar2.s = lerp;
                        sVar2.v = true;
                        sVar2.invalidate();
                    }
                    sVar2.setPivotX(sVar2.getMeasuredWidth() * lerp);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z202) {
                    limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.T, f192, min);
                    limitPreviewView2.E.invalidate();
                } else {
                    sVar2.setScaleX(min2);
                    sVar2.setScaleY(min2);
                }
                if (z16) {
                    sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    sVar2.setAlpha(floatValue);
                } else if (z17) {
                    float f23 = 1.0f - floatValue;
                    sVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    sVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    sVar2.setAlpha(f23);
                }
            }
        });
        this.e0.addListener(new n60(16, this, z192));
        this.e0.setInterpolator(new OvershootInterpolator());
        if (!this.S) {
        }
        this.e0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.x = n.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(t tVar) {
        this.a0 = tVar;
    }

    public void setHideNegativeValues(boolean z10) {
        this.d0 = z10;
    }

    public void setIconScale(float f10) {
        this.s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.H = false;
        int i9 = f6.Oh;
        b6 b6Var = this.O;
        int v02 = f6.v0(i9, b6Var);
        Paint paint = this.G;
        paint.setColor(v02);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        j6 j6Var = this.J;
        j6 j6Var2 = this.v;
        if (j11 <= 0) {
            this.a = 0.5f;
            j6Var.setText("");
            j6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(f6.v0(f6.wj, b6Var));
            this.H = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = n.a((j11 - j10) / (r14 - j10), 0.0f, 1.0f);
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.K.setVisibility(8);
        j6Var2.setTextColor(this.H ? -1 : f6.v0(f6.G6, b6Var));
        j6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    public void setStaticGradinet(z0 z0Var) {
        this.A = z0Var;
    }

    public void setStatus(int i9, int i10, boolean z10) {
        if (this.b == i9) {
            z10 = false;
        }
        this.b = i9;
        this.a = n.a(i9 / i10, 0.0f, 1.0f);
        if (z10) {
            this.S = true;
            this.T = this.n;
            this.E.requestLayout();
            requestLayout();
        }
        j6 j6Var = this.v;
        ((FrameLayout.LayoutParams) j6Var.getLayoutParams()).gravity = 5;
        this.w.setVisibility(8);
        this.K.setVisibility(8);
        this.J.setText("0");
        j6Var.setText("" + i10);
        g(i9, false);
        this.L = true;
        this.M = true;
    }

    public void setType(int i9) {
        j6 j6Var = this.v;
        int i10 = this.r;
        s sVar = this.e;
        if (i9 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new eq(i10, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                sVar.f = spannableStringBuilder;
            }
            j6Var.setText("4 GB");
            return;
        }
        if (i9 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new eq(i10, 0), 0, 1, 0);
                sVar.f = spannableStringBuilder2;
            }
            j6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i9, int i10, int i11, float f10, b6 b6Var) {
        super(context);
        this.s = 1.0f;
        this.D = true;
        this.G = new Paint(1);
        this.W = true;
        this.O = b6Var;
        this.a = n.a(f10, 0.1f, 0.9f);
        this.r = i9;
        this.b = i10;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i9 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            s sVar = new s(this, context);
            this.e = sVar;
            g(i10, false);
            sVar.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(sVar, e6.o(-2, -2, 0.0f, 3));
        }
        tf0 tf0Var = new tf0(this, context, true);
        this.b0 = tf0Var;
        j6 j6Var = new j6(context, false, false, false);
        this.J = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setText(LocaleController.getString(R.string.LimitFree));
        j6Var.setGravity(16);
        int i12 = f6.G6;
        j6Var.setTextColor(f6.v0(i12, b6Var));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i11)));
        textView.setGravity(16);
        textView.setTextColor(f6.v0(i12, b6Var));
        if (LocaleController.isRTL) {
            tf0Var.addView(j6Var, e6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var.addView(textView, e6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            tf0Var.addView(j6Var, e6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var.addView(textView, e6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        tf0 tf0Var2 = new tf0(this, context, false);
        this.c0 = tf0Var2;
        TextView textView2 = new TextView(context);
        this.K = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        j6 j6Var2 = new j6(context, false, false, false);
        this.v = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setText(String.format("%d", Integer.valueOf(i11)));
        j6Var2.setGravity(21);
        j6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            tf0Var2.addView(textView2, e6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var2.addView(j6Var2, e6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            tf0Var2.addView(textView2, e6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            tf0Var2.addView(j6Var2, e6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        g gVar = new g(this, context, b6Var);
        this.E = gVar;
        gVar.addView(tf0Var, e6.c(30.0f, -1));
        gVar.addView(tf0Var2, e6.c(30.0f, -1));
        addView(gVar, e6.p(-1, 30, 0.0f, 0, 14, i9 == 0 ? 0 : 12, 14, 0));
    }
}
