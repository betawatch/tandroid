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
import dg.o1;
import dg.s1;
import dg.w2;
import eg.q1;
import eg.t;
import eg.u;
import eg.v;
import eg.w;
import eg.x;
import eg.y;
import java.util.ArrayList;
import k7.b6;
import k7.n;
import kf.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout {
    public static final /* synthetic */ int i0 = 0;
    public q1 B;
    public int C;
    public boolean D;
    public boolean E;
    public final s1 F;
    public boolean G;
    public final Paint H;
    public boolean I;
    public boolean J;
    public final k6 K;
    public final TextView L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final f6 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public boolean W;
    public float a;
    public boolean a0;
    public int b;
    public x b0;
    public int c;
    public final y c0;
    public boolean d;
    public final y d0;
    public final w e;
    public boolean e0;
    public boolean f;
    public ValueAnimator f0;
    public boolean g0;
    public float h;
    public Runnable h0;
    public int n;
    public final int r;
    public float s;
    public final k6 v;
    public final TextView w;
    public float x;
    public ViewGroup y;

    public LimitPreviewView(Context context, int i10, int i11, f6 f6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, f6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        w wVar;
        Paint paint = limitPreviewView.H;
        w wVar2 = limitPreviewView.e;
        f6 f6Var = limitPreviewView.P;
        k6 k6Var = limitPreviewView.v;
        k6 k6Var2 = limitPreviewView.K;
        limitPreviewView.h0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.I = false;
            paint.setColor(j6.v0(j6.Oh, f6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                k6Var2.setText("");
                k6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(j6.v0(j6.wj, f6Var));
                limitPreviewView.I = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    wVar = wVar2;
                    limitPreviewView.a = n.a((r8 - j10) / (r11 - j10), 0.0f, 1.0f);
                    k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    wVar.setScaleX(0.6f);
                    wVar.setScaleY(0.6f);
                    wVar.setAlpha(0.0f);
                    limitPreviewView.Q = true;
                    limitPreviewView.R = true;
                    limitPreviewView.S = false;
                    limitPreviewView.U = limitPreviewView.n;
                    limitPreviewView.F.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = k6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    mr mrVar = mr.h;
                    duration.setInterpolator(mrVar).start();
                    k6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(mrVar).start();
                    k6Var.setTextColor(!limitPreviewView.I ? -1 : j6.v0(j6.G6, f6Var));
                    k6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            wVar = wVar2;
            limitPreviewView.setArrowX(1.0f);
            wVar.setScaleX(0.6f);
            wVar.setScaleY(0.6f);
            wVar.setAlpha(0.0f);
            limitPreviewView.Q = true;
            limitPreviewView.R = true;
            limitPreviewView.S = false;
            limitPreviewView.U = limitPreviewView.n;
            limitPreviewView.F.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = k6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            mr mrVar2 = mr.h;
            duration2.setInterpolator(mrVar2).start();
            k6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(mrVar2).start();
            k6Var.setTextColor(!limitPreviewView.I ? -1 : j6.v0(j6.G6, f6Var));
            k6Var2.setTextColor(-1);
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
        Paint paint = limitPreviewView.H;
        w wVar2 = limitPreviewView.e;
        f6 f6Var = limitPreviewView.P;
        k6 k6Var = limitPreviewView.v;
        k6 k6Var2 = limitPreviewView.K;
        limitPreviewView.h0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.I = false;
            paint.setColor(j6.v0(j6.Oh, f6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                k6Var2.setText("");
                k6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(j6.v0(j6.wj, f6Var));
                limitPreviewView.I = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    wVar = wVar2;
                    limitPreviewView.a = n.a((r8 - j10) / (r10 - j10), 0.0f, 1.0f);
                    k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(0.0f);
                    wVar.setScaleX(0.6f);
                    wVar.setScaleY(0.6f);
                    wVar.setAlpha(0.0f);
                    limitPreviewView.Q = true;
                    limitPreviewView.R = true;
                    limitPreviewView.S = false;
                    limitPreviewView.U = limitPreviewView.n;
                    limitPreviewView.F.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = k6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    mr mrVar = mr.h;
                    duration.setInterpolator(mrVar).start();
                    k6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(mrVar).start();
                    k6Var.setTextColor(!limitPreviewView.I ? -1 : j6.v0(j6.G6, f6Var));
                    k6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            wVar = wVar2;
            limitPreviewView.setArrowX(0.0f);
            wVar.setScaleX(0.6f);
            wVar.setScaleY(0.6f);
            wVar.setAlpha(0.0f);
            limitPreviewView.Q = true;
            limitPreviewView.R = true;
            limitPreviewView.S = false;
            limitPreviewView.U = limitPreviewView.n;
            limitPreviewView.F.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = k6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            mr mrVar2 = mr.h;
            duration2.setInterpolator(mrVar2).start();
            k6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(mrVar2).start();
            k6Var.setTextColor(!limitPreviewView.I ? -1 : j6.v0(j6.G6, f6Var));
            k6Var2.setTextColor(-1);
            limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.h) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f10) {
        this.n = f10 >= 1.0f ? this.F.getMeasuredWidth() : 0;
        float dp = AndroidUtilities.dp(14.0f);
        float max = Math.max(this.n, (getMeasuredWidth() - (r0 * 2)) * f10) + dp;
        w wVar = this.e;
        wVar.setTranslationX(Utilities.clamp(max - (wVar.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - wVar.getMeasuredWidth(), dp));
        if (wVar.s != f10) {
            wVar.s = f10;
            wVar.v = true;
            wVar.invalidate();
        }
        wVar.setPivotX(wVar.getMeasuredWidth() * f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z4;
        boolean z10;
        boolean z11;
        AndroidUtilities.cancelRunOnUIThread(this.h0);
        this.h0 = null;
        int i10 = j6.Oh;
        f6 f6Var = this.P;
        int v02 = j6.v0(i10, f6Var);
        Paint paint = this.H;
        paint.setColor(v02);
        this.I = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        s1 s1Var = this.F;
        k6 k6Var = this.v;
        k6 k6Var2 = this.K;
        if (i11 == i12) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                k6Var2.setText("");
                k6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(j6.v0(j6.wj, f6Var));
                this.I = true;
            } else {
                if (tl_starsRating2.next_level_stars != 0) {
                    long j10 = tl_starsRating2.current_level_stars;
                    this.a = n.a((r12 - j10) / (r6 - j10), 0.0f, 1.0f);
                    z11 = true;
                    k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                    this.Q = z11;
                    this.R = false;
                    this.S = false;
                    this.U = this.n;
                    s1Var.requestLayout();
                    requestLayout();
                    k6Var.setTextColor(!this.I ? -1 : j6.v0(j6.G6, f6Var));
                    k6Var2.setTextColor(-1);
                    f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                    return;
                }
                this.a = 1.0f;
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
            }
            z11 = true;
            this.Q = z11;
            this.R = false;
            this.S = false;
            this.U = this.n;
            s1Var.requestLayout();
            requestLayout();
            k6Var.setTextColor(!this.I ? -1 : j6.v0(j6.G6, f6Var));
            k6Var2.setTextColor(-1);
            f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i12 > i11) {
            if (tl_starsRating.stars <= 0) {
                z10 = true;
                this.I = true;
            } else {
                z10 = true;
            }
            this.a = 1.0f;
            this.Q = z10;
            this.R = false;
            this.S = z10;
            this.U = this.n;
            s1Var.requestLayout();
            requestLayout();
            k6Var.setTextColor(this.I ? -1 : j6.v0(j6.G6, f6Var));
            k6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = k6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            mr mrVar = mr.h;
            duration.setInterpolator(mrVar).start();
            k6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(mrVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: eg.s
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
            this.h0 = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        if (i12 < i11) {
            paint.setColor(j6.v0(i10, f6Var));
            this.I = false;
            if (tl_starsRating.stars <= 0) {
                z4 = true;
                this.I = true;
            } else {
                z4 = true;
            }
            this.a = 0.0f;
            this.Q = z4;
            this.R = false;
            this.S = z4;
            this.U = this.n;
            s1Var.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = k6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            mr mrVar2 = mr.h;
            duration2.setInterpolator(mrVar2).start();
            k6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(mrVar2).start();
            k6Var.setTextColor(this.I ? -1 : j6.v0(j6.G6, f6Var));
            k6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i14 = 1;
            Runnable runnable2 = new Runnable(this) { // from class: eg.s
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
            this.h0 = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.B == null) {
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

    public final void e(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z4) {
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        k6 k6Var = this.K;
        k6 k6Var2 = this.v;
        if ((i11 == i12 && z4) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            k6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            k6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = n.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            k6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            k6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) k6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.L.setVisibility(8);
        k6Var2.setTextColor(j6.v0(j6.G6, this.P));
        k6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.M = true;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new lq(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? LocaleController.formatShortNumber(i11, null) : LocaleController.formatNumber(i11, ',')));
        spannableStringBuilder.setSpan(new eu(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        w wVar = this.e;
        wVar.f = spannableStringBuilder;
        wVar.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void g(int i10, boolean z4) {
        lq lqVar;
        int i11;
        if (i10 < 0) {
            lqVar = new lq(R.drawable.warning_sign, 0);
        } else {
            lqVar = new lq(this.r, 0);
            float f10 = this.s;
            lqVar.setScale(f10, f10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(lqVar, 0, 1, 0);
        if (i10 >= 0 || !this.e0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        w wVar = this.e;
        if (z4) {
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
                        vVar.a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        int i13 = (int) wVar.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + charAt, textPaint, i13, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = vVar.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + wVar.f.charAt(i11), textPaint, (int) wVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new lz(false), i11, i11 + 1, 0);
                        i12++;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                wVar.n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) wVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    wVar.r = true;
                    v vVar2 = (v) arrayList.get(i14);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new t(wVar, vVar2, 0));
                    vVar2.f.addListener(new u(wVar, vVar2, 1));
                    vVar2.f.setInterpolator(mr.g);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        final float f14;
        float measuredWidth;
        float f15;
        boolean z10;
        float f16;
        boolean z11;
        TextPaint textPaint;
        int i14;
        int i15;
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z12 = this.T;
        w wVar = this.e;
        if (!z12 && !this.Q && (this.d || wVar == null || !this.E || this.G)) {
            if (this.M) {
                if (this.R || this.S) {
                    return;
                }
                wVar.setAlpha(1.0f);
                wVar.setScaleX(1.0f);
                wVar.setScaleY(1.0f);
                return;
            }
            if (!this.G) {
                if (wVar != null) {
                    wVar.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + AndroidUtilities.dp(14.0f)) - (wVar.getMeasuredWidth() / 2.0f);
            boolean z13 = this.d;
            if (!z13 && this.E) {
                this.d = true;
                wVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z13) {
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
        boolean z14 = this.Q || this.T;
        this.T = false;
        this.Q = false;
        float translationX = z14 ? wVar.getTranslationX() : 0.0f;
        float f17 = dp;
        int i17 = dp * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i17) * this.x) + f17) - (wVar.getMeasuredWidth() / 2.0f);
        if (this.N) {
            float f18 = wVar.s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp) - wVar.getMeasuredWidth(), f17);
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
                f13 = Utilities.clamp((this.n - (measuredWidth - f17)) / wVar.getMeasuredWidth(), 1.0f, 0.0f);
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
            if (f17 > (getMeasuredWidth() - dp) - wVar.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - dp) - wVar.getMeasuredWidth();
                f14 = measuredWidth;
                f12 = f10;
                f13 = 1.0f;
            } else {
                f12 = f10;
                f13 = f11;
                f14 = f17;
            }
        }
        final boolean z15 = this.R;
        final boolean z16 = this.S;
        if (!z15 && !z16) {
            wVar.setAlpha(1.0f);
        }
        wVar.setTranslationX(translationX);
        wVar.setPivotX(wVar.getMeasuredWidth() / 2.0f);
        wVar.setPivotY(wVar.getMeasuredHeight());
        if (!z14) {
            wVar.setScaleX(0.0f);
            wVar.setScaleY(0.0f);
            TextPaint textPaint2 = wVar.c;
            ArrayList arrayList = wVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = wVar.y;
            if (!limitPreviewView.M || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wVar.f);
                int i19 = 0;
                boolean z17 = true;
                while (i19 < wVar.f.length()) {
                    if (Character.isDigit(wVar.f.charAt(i19))) {
                        v vVar = new v();
                        arrayList.add(vVar);
                        f16 = f12;
                        vVar.e = wVar.d.getSecondaryHorizontal(i19);
                        vVar.d = z17;
                        if (i16 >= 1) {
                            z17 = !z17;
                            i16 = 0;
                        }
                        i16++;
                        int charAt = wVar.f.charAt(i19) - '0';
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
                            vVar.b.add(new StaticLayout(k0.j(i14, ""), textPaint2, (int) wVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i15 + 1;
                            i20 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new lz(false), i19, i19 + 1, 0);
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
                wVar.n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) wVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    wVar.r = true;
                    v vVar2 = (v) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new t(wVar, vVar2, 1));
                    vVar2.f.addListener(new u(wVar, vVar2, 0));
                    vVar2.f.setInterpolator(mr.g);
                    vVar2.f.setDuration(750L);
                    vVar2.f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    vVar2.f.start();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f0 = ofFloat2;
                final float f19 = this.n;
                if (z10) {
                    this.n = this.U;
                }
                final boolean z18 = !this.g0;
                this.g0 = true;
                final float f20 = f13;
                final float f21 = translationX;
                final float f22 = f15;
                final boolean z19 = z10;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eg.r
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                        w wVar2 = limitPreviewView2.e;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float min = Math.min(1.0f, floatValue);
                        if (floatValue > 1.0f && z18) {
                            if (!limitPreviewView2.D) {
                                limitPreviewView2.D = true;
                                try {
                                    wVar2.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                            wVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.V);
                        } else if (!limitPreviewView2.g0) {
                            wVar2.setRotation(limitPreviewView2.V);
                        }
                        if (valueAnimator == limitPreviewView2.f0) {
                            wVar2.setTranslationX(AndroidUtilities.lerp(f21, f14, min));
                            float lerp = AndroidUtilities.lerp(f22, f20, min);
                            if (wVar2.s != lerp) {
                                wVar2.s = lerp;
                                wVar2.v = true;
                                wVar2.invalidate();
                            }
                            wVar2.setPivotX(wVar2.getMeasuredWidth() * lerp);
                        }
                        float min2 = Math.min(1.0f, 2.0f * min);
                        if (z19) {
                            limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.U, f19, min);
                            limitPreviewView2.F.invalidate();
                        } else {
                            wVar2.setScaleX(min2);
                            wVar2.setScaleY(min2);
                        }
                        if (z15) {
                            wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            wVar2.setAlpha(floatValue);
                        } else if (z16) {
                            float f23 = 1.0f - floatValue;
                            wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                            wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                            wVar2.setAlpha(f23);
                        }
                    }
                });
                this.f0.addListener(new w2(1, this, z18));
                this.f0.setInterpolator(new OvershootInterpolator());
                if (!this.T) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new o1(this, 6));
                    ofFloat3.setDuration(500L);
                    ofFloat3.start();
                    this.f0.setDuration(600L);
                } else if (z16) {
                    this.f0.setInterpolator(mr.i);
                    this.f0.setDuration(320L);
                } else if (z15) {
                    this.f0.setInterpolator(mr.h);
                    this.f0.setDuration(500L);
                } else {
                    this.f0.setDuration(1000L);
                    this.f0.setStartDelay(200L);
                }
                this.f0.start();
                this.d = true;
            }
        }
        f15 = f12;
        z10 = z14;
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f0 = ofFloat22;
        final float f192 = this.n;
        if (z10) {
        }
        final boolean z182 = !this.g0;
        this.g0 = true;
        final float f202 = f13;
        final float f212 = translationX;
        final float f222 = f15;
        final boolean z192 = z10;
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eg.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                w wVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z182) {
                    if (!limitPreviewView2.D) {
                        limitPreviewView2.D = true;
                        try {
                            wVar2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    wVar2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.V);
                } else if (!limitPreviewView2.g0) {
                    wVar2.setRotation(limitPreviewView2.V);
                }
                if (valueAnimator == limitPreviewView2.f0) {
                    wVar2.setTranslationX(AndroidUtilities.lerp(f212, f14, min));
                    float lerp = AndroidUtilities.lerp(f222, f202, min);
                    if (wVar2.s != lerp) {
                        wVar2.s = lerp;
                        wVar2.v = true;
                        wVar2.invalidate();
                    }
                    wVar2.setPivotX(wVar2.getMeasuredWidth() * lerp);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z192) {
                    limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.U, f192, min);
                    limitPreviewView2.F.invalidate();
                } else {
                    wVar2.setScaleX(min2);
                    wVar2.setScaleY(min2);
                }
                if (z15) {
                    wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    wVar2.setAlpha(floatValue);
                } else if (z16) {
                    float f23 = 1.0f - floatValue;
                    wVar2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    wVar2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    wVar2.setAlpha(f23);
                }
            }
        });
        this.f0.addListener(new w2(1, this, z182));
        this.f0.setInterpolator(new OvershootInterpolator());
        if (!this.T) {
        }
        this.f0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.x = n.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(x xVar) {
        this.b0 = xVar;
    }

    public void setHideNegativeValues(boolean z4) {
        this.e0 = z4;
    }

    public void setIconScale(float f10) {
        this.s = f10;
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.y = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.I = false;
        int i10 = j6.Oh;
        f6 f6Var = this.P;
        int v02 = j6.v0(i10, f6Var);
        Paint paint = this.H;
        paint.setColor(v02);
        long j10 = tl_starsRating.current_level_stars;
        long j11 = tl_starsRating.stars;
        k6 k6Var = this.K;
        k6 k6Var2 = this.v;
        if (j11 <= 0) {
            this.a = 0.5f;
            k6Var.setText("");
            k6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(j6.v0(j6.wj, f6Var));
            this.I = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = n.a((j11 - j10) / (r14 - j10), 0.0f, 1.0f);
                k6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                k6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) k6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.L.setVisibility(8);
        k6Var2.setTextColor(this.I ? -1 : j6.v0(j6.G6, f6Var));
        k6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.M = true;
        this.N = true;
        this.O = true;
    }

    public void setStaticGradinet(q1 q1Var) {
        this.B = q1Var;
    }

    public void setStatus(int i10, int i11, boolean z4) {
        if (this.b == i10) {
            z4 = false;
        }
        this.b = i10;
        this.a = n.a(i10 / i11, 0.0f, 1.0f);
        if (z4) {
            this.T = true;
            this.U = this.n;
            this.F.requestLayout();
            requestLayout();
        }
        k6 k6Var = this.v;
        ((FrameLayout.LayoutParams) k6Var.getLayoutParams()).gravity = 5;
        this.w.setVisibility(8);
        this.L.setVisibility(8);
        this.K.setText("0");
        k6Var.setText("" + i11);
        g(i10, false);
        this.M = true;
        this.N = true;
    }

    public void setType(int i10) {
        k6 k6Var = this.v;
        int i11 = this.r;
        w wVar = this.e;
        if (i10 == 6) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new lq(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                wVar.f = spannableStringBuilder;
            }
            k6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (wVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new lq(i11, 0), 0, 1, 0);
                wVar.f = spannableStringBuilder2;
            }
            k6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f10, f6 f6Var) {
        super(context);
        this.s = 1.0f;
        this.E = true;
        this.H = new Paint(1);
        this.a0 = true;
        this.P = f6Var;
        this.a = n.a(f10, 0.1f, 0.9f);
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
            addView(wVar, b6.o(-2, -2, 0.0f, 3));
        }
        y yVar = new y(this, context, true);
        this.c0 = yVar;
        k6 k6Var = new k6(context, false, false, false);
        this.K = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setText(LocaleController.getString(R.string.LimitFree));
        k6Var.setGravity(16);
        int i13 = j6.G6;
        k6Var.setTextColor(j6.v0(i13, f6Var));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(j6.v0(i13, f6Var));
        if (LocaleController.isRTL) {
            yVar.addView(k6Var, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar.addView(k6Var, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar.addView(textView, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        y yVar2 = new y(this, context, false);
        this.d0 = yVar2;
        TextView textView2 = new TextView(context);
        this.L = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        k6 k6Var2 = new k6(context, false, false, false);
        this.v = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var2.setTypeface(AndroidUtilities.bold());
        k6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        k6Var2.setGravity(21);
        k6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            yVar2.addView(textView2, b6.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(k6Var2, b6.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            yVar2.addView(textView2, b6.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            yVar2.addView(k6Var2, b6.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        s1 s1Var = new s1(this, context, f6Var);
        this.F = s1Var;
        s1Var.addView(yVar, b6.c(30.0f, -1));
        s1Var.addView(yVar2, b6.c(30.0f, -1));
        addView(s1Var, b6.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
