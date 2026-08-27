package org.telegram.ui.Components.Premium;

import ag.a0;
import ag.b0;
import ag.c0;
import ag.d0;
import ag.i2;
import ag.u;
import ag.w;
import ag.x;
import ag.y;
import ag.z;
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
import h7.n;
import h7.z5;
import i0.a;
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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.zy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout {
    public static final /* synthetic */ int h0 = 0;
    public i2 A;
    public int B;
    public boolean C;
    public boolean D;
    public final w E;
    public boolean F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public final j6 J;
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
    public c0 a0;
    public int b;
    public final d0 b0;
    public int c;
    public final d0 c0;
    public boolean d;
    public boolean d0;
    public final b0 e;
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

    public LimitPreviewView(Context context, int i10, int i11, c6 c6Var, int i12) {
        this(context, i10, i11, i12, 0.5f, c6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(LimitPreviewView limitPreviewView, TL_stars.Tl_starsRating tl_starsRating) {
        b0 b0Var;
        Paint paint = limitPreviewView.G;
        b0 b0Var2 = limitPreviewView.e;
        c6 c6Var = limitPreviewView.O;
        j6 j6Var = limitPreviewView.v;
        j6 j6Var2 = limitPreviewView.J;
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
                j6Var2.setText("");
                j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(g6.v0(g6.wj, c6Var));
                limitPreviewView.H = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    b0Var = b0Var2;
                    limitPreviewView.a = n.a((r8 - j10) / (r11 - j10), 0.0f, 1.0f);
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(1.0f);
                    b0Var.setScaleX(0.6f);
                    b0Var.setScaleY(0.6f);
                    b0Var.setAlpha(0.0f);
                    limitPreviewView.P = true;
                    limitPreviewView.Q = true;
                    limitPreviewView.R = false;
                    limitPreviewView.T = limitPreviewView.n;
                    limitPreviewView.E.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    er erVar = er.h;
                    duration.setInterpolator(erVar).start();
                    j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar).start();
                    j6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
                    j6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            b0Var = b0Var2;
            limitPreviewView.setArrowX(1.0f);
            b0Var.setScaleX(0.6f);
            b0Var.setScaleY(0.6f);
            b0Var.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar2).start();
            j6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
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
        b0 b0Var;
        Paint paint = limitPreviewView.G;
        b0 b0Var2 = limitPreviewView.e;
        c6 c6Var = limitPreviewView.O;
        j6 j6Var = limitPreviewView.v;
        j6 j6Var2 = limitPreviewView.J;
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
                j6Var2.setText("");
                j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(g6.v0(g6.wj, c6Var));
                limitPreviewView.H = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j10 = tl_starsRating.current_level_stars;
                    b0Var = b0Var2;
                    limitPreviewView.a = n.a((r8 - j10) / (r10 - j10), 0.0f, 1.0f);
                    j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
                    limitPreviewView.setArrowX(0.0f);
                    b0Var.setScaleX(0.6f);
                    b0Var.setScaleY(0.6f);
                    b0Var.setAlpha(0.0f);
                    limitPreviewView.P = true;
                    limitPreviewView.Q = true;
                    limitPreviewView.R = false;
                    limitPreviewView.T = limitPreviewView.n;
                    limitPreviewView.E.requestLayout();
                    limitPreviewView.requestLayout();
                    ViewPropertyAnimator duration = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    er erVar = er.h;
                    duration.setInterpolator(erVar).start();
                    j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar).start();
                    j6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
                    j6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            b0Var = b0Var2;
            limitPreviewView.setArrowX(0.0f);
            b0Var.setScaleX(0.6f);
            b0Var.setScaleY(0.6f);
            b0Var.setAlpha(0.0f);
            limitPreviewView.P = true;
            limitPreviewView.Q = true;
            limitPreviewView.R = false;
            limitPreviewView.T = limitPreviewView.n;
            limitPreviewView.E.requestLayout();
            limitPreviewView.requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).start();
            j6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(erVar2).start();
            j6Var.setTextColor(!limitPreviewView.H ? -1 : g6.v0(g6.G6, c6Var));
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
        b0 b0Var = this.e;
        b0Var.setTranslationX(Utilities.clamp(max - (b0Var.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - r0) - b0Var.getMeasuredWidth(), dp));
        if (b0Var.s != f10) {
            b0Var.s = f10;
            b0Var.v = true;
            b0Var.invalidate();
        }
        b0Var.setPivotX(b0Var.getMeasuredWidth() * f10);
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
        w wVar = this.E;
        j6 j6Var = this.v;
        j6 j6Var2 = this.J;
        if (i11 == i12) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                j6Var2.setText("");
                j6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(g6.v0(g6.wj, c6Var));
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
                    wVar.requestLayout();
                    requestLayout();
                    j6Var.setTextColor(!this.H ? -1 : g6.v0(g6.G6, c6Var));
                    j6Var2.setTextColor(-1);
                    f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                    return;
                }
                this.a = 1.0f;
                j6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                j6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
            }
            z12 = true;
            this.P = z12;
            this.Q = false;
            this.R = false;
            this.T = this.n;
            wVar.requestLayout();
            requestLayout();
            j6Var.setTextColor(!this.H ? -1 : g6.v0(g6.G6, c6Var));
            j6Var2.setTextColor(-1);
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
            wVar.requestLayout();
            requestLayout();
            j6Var.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
            j6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(erVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: ag.v
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
            wVar.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = j6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).start();
            j6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(erVar2).start();
            j6Var.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
            j6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i14 = 1;
            Runnable runnable2 = new Runnable(this) { // from class: ag.v
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
        int i10;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.boosts;
        j6 j6Var = this.J;
        j6 j6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = n.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            j6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            j6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.K.setVisibility(8);
        j6Var2.setTextColor(g6.v0(g6.G6, this.O));
        j6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.L = true;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new cq(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? LocaleController.formatShortNumber(i11, null) : LocaleController.formatNumber(i11, ',')));
        spannableStringBuilder.setSpan(new vt(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        b0 b0Var = this.e;
        b0Var.f = spannableStringBuilder;
        b0Var.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void g(int i10, boolean z10) {
        cq cqVar;
        int i11;
        if (i10 < 0) {
            cqVar = new cq(R.drawable.warning_sign, 0);
        } else {
            cqVar = new cq(this.r, 0);
            float f10 = this.s;
            cqVar.setScale(f10, f10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(cqVar, 0, 1, 0);
        if (i10 >= 0 || !this.d0) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        }
        b0 b0Var = this.e;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder2 = b0Var.f;
            b0Var.f = spannableStringBuilder;
            TextPaint textPaint = b0Var.c;
            ArrayList arrayList = b0Var.h;
            if (b0Var.d != null) {
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(b0Var.f);
                int length = b0Var.f.length() - 1;
                int i12 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt == b0Var.f.charAt(length) || !Character.isDigit(b0Var.f.charAt(length))) {
                        i11 = length;
                    } else {
                        a0 a0Var = new a0();
                        arrayList.add(a0Var);
                        a0Var.e = b0Var.d.getSecondaryHorizontal(length);
                        a0Var.a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        int i13 = (int) b0Var.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + charAt, textPaint, i13, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = a0Var.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + b0Var.f.charAt(i11), textPaint, (int) b0Var.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new zy(false), i11, i11 + 1, 0);
                        i12++;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                b0Var.n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) b0Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    b0Var.r = true;
                    a0 a0Var2 = (a0) arrayList.get(i14);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    a0Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new y(b0Var, a0Var2, 0));
                    a0Var2.f.addListener(new z(b0Var, a0Var2, 1));
                    a0Var2.f.setInterpolator(er.g);
                    a0Var2.f.setDuration(250L);
                    a0Var2.f.setStartDelay(((arrayList.size() - 1) - i14) * 60);
                    a0Var2.f.start();
                }
            }
        } else {
            b0Var.f = spannableStringBuilder;
        }
        b0Var.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bc  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z13 = this.S;
        b0 b0Var = this.e;
        if (!z13 && !this.P && (this.d || b0Var == null || !this.D || this.F)) {
            if (this.L) {
                if (this.Q || this.R) {
                    return;
                }
                b0Var.setAlpha(1.0f);
                b0Var.setScaleX(1.0f);
                b0Var.setScaleY(1.0f);
                return;
            }
            if (!this.F) {
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    return;
                }
                return;
            }
            float measuredWidth2 = (((getMeasuredWidth() - (r0 * 2)) * 0.5f) + AndroidUtilities.dp(14.0f)) - (b0Var.getMeasuredWidth() / 2.0f);
            boolean z14 = this.d;
            if (!z14 && this.D) {
                this.d = true;
                b0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z14) {
                b0Var.setAlpha(1.0f);
                b0Var.setScaleX(1.0f);
                b0Var.setScaleY(1.0f);
            } else {
                b0Var.setAlpha(0.0f);
                b0Var.setScaleX(0.0f);
                b0Var.setScaleY(0.0f);
            }
            b0Var.setTranslationX(measuredWidth2);
            return;
        }
        int dp = AndroidUtilities.dp(14.0f);
        int i16 = 0;
        boolean z15 = this.P || this.S;
        this.S = false;
        this.P = false;
        float translationX = z15 ? b0Var.getTranslationX() : 0.0f;
        float f17 = dp;
        int i17 = dp * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i17) * this.x) + f17) - (b0Var.getMeasuredWidth() / 2.0f);
        if (this.M) {
            float f18 = b0Var.s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp) - b0Var.getMeasuredWidth(), f17);
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
                f13 = Utilities.clamp((this.n - (measuredWidth - f17)) / b0Var.getMeasuredWidth(), 1.0f, 0.0f);
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
            if (f17 > (getMeasuredWidth() - dp) - b0Var.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - dp) - b0Var.getMeasuredWidth();
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
            b0Var.setAlpha(1.0f);
        }
        b0Var.setTranslationX(translationX);
        b0Var.setPivotX(b0Var.getMeasuredWidth() / 2.0f);
        b0Var.setPivotY(b0Var.getMeasuredHeight());
        if (!z15) {
            b0Var.setScaleX(0.0f);
            b0Var.setScaleY(0.0f);
            TextPaint textPaint2 = b0Var.c;
            ArrayList arrayList = b0Var.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = b0Var.y;
            if (!limitPreviewView.L || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b0Var.f);
                int i19 = 0;
                boolean z18 = true;
                while (i19 < b0Var.f.length()) {
                    if (Character.isDigit(b0Var.f.charAt(i19))) {
                        a0 a0Var = new a0();
                        arrayList.add(a0Var);
                        f16 = f12;
                        a0Var.e = b0Var.d.getSecondaryHorizontal(i19);
                        a0Var.d = z18;
                        if (i16 >= 1) {
                            z18 = !z18;
                            i16 = 0;
                        }
                        i16++;
                        int charAt = b0Var.f.charAt(i19) - '0';
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
                            a0Var.b.add(new StaticLayout(a.k(i14, ""), textPaint2, (int) b0Var.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i15 + 1;
                            i20 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new zy(false), i19, i19 + 1, 0);
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
                b0Var.n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) b0Var.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    b0Var.r = true;
                    a0 a0Var2 = (a0) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    a0Var2.f = ofFloat;
                    ofFloat.addUpdateListener(new y(b0Var, a0Var2, 1));
                    a0Var2.f.addListener(new z(b0Var, a0Var2, 0));
                    a0Var2.f.setInterpolator(er.g);
                    a0Var2.f.setDuration(750L);
                    a0Var2.f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    a0Var2.f.start();
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
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.t
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                        b0 b0Var2 = limitPreviewView2.e;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float min = Math.min(1.0f, floatValue);
                        if (floatValue > 1.0f && z19) {
                            if (!limitPreviewView2.C) {
                                limitPreviewView2.C = true;
                                try {
                                    b0Var2.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                            b0Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.U);
                        } else if (!limitPreviewView2.f0) {
                            b0Var2.setRotation(limitPreviewView2.U);
                        }
                        if (valueAnimator == limitPreviewView2.e0) {
                            b0Var2.setTranslationX(AndroidUtilities.lerp(f21, f14, min));
                            float lerp = AndroidUtilities.lerp(f22, f20, min);
                            if (b0Var2.s != lerp) {
                                b0Var2.s = lerp;
                                b0Var2.v = true;
                                b0Var2.invalidate();
                            }
                            b0Var2.setPivotX(b0Var2.getMeasuredWidth() * lerp);
                        }
                        float min2 = Math.min(1.0f, 2.0f * min);
                        if (z20) {
                            limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.T, f19, min);
                            limitPreviewView2.E.invalidate();
                        } else {
                            b0Var2.setScaleX(min2);
                            b0Var2.setScaleY(min2);
                        }
                        if (z16) {
                            b0Var2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            b0Var2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                            b0Var2.setAlpha(floatValue);
                        } else if (z17) {
                            float f23 = 1.0f - floatValue;
                            b0Var2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                            b0Var2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                            b0Var2.setAlpha(f23);
                        }
                    }
                });
                this.e0.addListener(new x(0, this, z19));
                this.e0.setInterpolator(new OvershootInterpolator());
                if (!this.S) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new u(this, 0));
                    ofFloat3.setDuration(500L);
                    ofFloat3.start();
                    this.e0.setDuration(600L);
                } else if (z17) {
                    this.e0.setInterpolator(er.i);
                    this.e0.setDuration(320L);
                } else if (z16) {
                    this.e0.setInterpolator(er.h);
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
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                b0 b0Var2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z192) {
                    if (!limitPreviewView2.C) {
                        limitPreviewView2.C = true;
                        try {
                            b0Var2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    b0Var2.setRotation(((floatValue - 1.0f) * 60.0f) + limitPreviewView2.U);
                } else if (!limitPreviewView2.f0) {
                    b0Var2.setRotation(limitPreviewView2.U);
                }
                if (valueAnimator == limitPreviewView2.e0) {
                    b0Var2.setTranslationX(AndroidUtilities.lerp(f212, f14, min));
                    float lerp = AndroidUtilities.lerp(f222, f202, min);
                    if (b0Var2.s != lerp) {
                        b0Var2.s = lerp;
                        b0Var2.v = true;
                        b0Var2.invalidate();
                    }
                    b0Var2.setPivotX(b0Var2.getMeasuredWidth() * lerp);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z202) {
                    limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.T, f192, min);
                    limitPreviewView2.E.invalidate();
                } else {
                    b0Var2.setScaleX(min2);
                    b0Var2.setScaleY(min2);
                }
                if (z16) {
                    b0Var2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    b0Var2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                    b0Var2.setAlpha(floatValue);
                } else if (z17) {
                    float f23 = 1.0f - floatValue;
                    b0Var2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    b0Var2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f23));
                    b0Var2.setAlpha(f23);
                }
            }
        });
        this.e0.addListener(new x(0, this, z192));
        this.e0.setInterpolator(new OvershootInterpolator());
        if (!this.S) {
        }
        this.e0.start();
        this.d = true;
    }

    public void setBagePosition(float f10) {
        this.x = n.a(f10, 0.1f, 0.9f);
    }

    public void setDarkGradientProvider(c0 c0Var) {
        this.a0 = c0Var;
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
        int i10 = g6.Oh;
        c6 c6Var = this.O;
        int v02 = g6.v0(i10, c6Var);
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
            paint.setColor(g6.v0(g6.wj, c6Var));
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
        j6Var2.setTextColor(this.H ? -1 : g6.v0(g6.G6, c6Var));
        j6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.L = true;
        this.M = true;
        this.N = true;
    }

    public void setStaticGradinet(i2 i2Var) {
        this.A = i2Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.b == i10) {
            z10 = false;
        }
        this.b = i10;
        this.a = n.a(i10 / i11, 0.0f, 1.0f);
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
        j6Var.setText("" + i11);
        g(i10, false);
        this.L = true;
        this.M = true;
    }

    public void setType(int i10) {
        j6 j6Var = this.v;
        int i11 = this.r;
        b0 b0Var = this.e;
        if (i10 == 6) {
            if (b0Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new cq(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                b0Var.f = spannableStringBuilder;
            }
            j6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (b0Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new cq(i11, 0), 0, 1, 0);
                b0Var.f = spannableStringBuilder2;
            }
            j6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f10, c6 c6Var) {
        super(context);
        this.s = 1.0f;
        this.D = true;
        this.G = new Paint(1);
        this.W = true;
        this.O = c6Var;
        this.a = n.a(f10, 0.1f, 0.9f);
        this.r = i10;
        this.b = i11;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i10 != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            b0 b0Var = new b0(this, context);
            this.e = b0Var;
            g(i11, false);
            b0Var.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(b0Var, z5.o(-2, -2, 0.0f, 3));
        }
        d0 d0Var = new d0(this, context, true);
        this.b0 = d0Var;
        j6 j6Var = new j6(context, false, false, false);
        this.J = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setText(LocaleController.getString(R.string.LimitFree));
        j6Var.setGravity(16);
        int i13 = g6.G6;
        j6Var.setTextColor(g6.v0(i13, c6Var));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(g6.v0(i13, c6Var));
        if (LocaleController.isRTL) {
            d0Var.addView(j6Var, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var.addView(textView, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            d0Var.addView(j6Var, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var.addView(textView, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        d0 d0Var2 = new d0(this, context, false);
        this.c0 = d0Var2;
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
        j6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        j6Var2.setGravity(21);
        j6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            d0Var2.addView(textView2, z5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var2.addView(j6Var2, z5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            d0Var2.addView(textView2, z5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            d0Var2.addView(j6Var2, z5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        w wVar = new w(this, context, c6Var);
        this.E = wVar;
        wVar.addView(d0Var, z5.c(30.0f, -1));
        wVar.addView(d0Var2, z5.c(30.0f, -1));
        addView(wVar, z5.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
