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
import i2.g;
import java.util.ArrayList;
import ki.a;
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
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.e50;
import org.telegram.ui.t5;
import sg.c1;
import sg.q;
import sg.r;
import sg.s;
import sg.t;
import w7.p;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class LimitPreviewView extends LinearLayout {
    public static final /* synthetic */ int l0 = 0;
    public c1 E;
    public int F;
    public boolean G;
    public boolean H;
    public final t5 I;
    public boolean J;
    public final Paint K;
    public boolean L;
    public boolean M;
    public final q6 N;
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
    public final s e;
    public t e0;
    public boolean f;
    public final ig0 f0;
    public final ig0 g0;
    public float h;
    public boolean h0;
    public ValueAnimator i0;
    public boolean j0;
    public Runnable k0;
    public int n;
    public final int r;
    public float s;
    public final q6 v;
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
        s sVar;
        Paint paint = limitPreviewView.K;
        s sVar2 = limitPreviewView.e;
        f6 f6Var = limitPreviewView.S;
        q6 q6Var = limitPreviewView.v;
        q6 q6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            paint.setColor(j6.v0(j6.Oh, f6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.5f;
                q6Var2.setText("");
                q6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(j6.v0(j6.wj, f6Var));
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j3 = tl_starsRating.current_level_stars;
                    sVar = sVar2;
                    limitPreviewView.a = p.a((r8 - j3) / (r11 - j3), 0.0f, 1.0f);
                    q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
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
                    ViewPropertyAnimator duration = q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    pr prVar = pr.h;
                    duration.setInterpolator(prVar).start();
                    q6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(prVar).start();
                    q6Var.setTextColor(!limitPreviewView.L ? -1 : j6.v0(j6.G6, f6Var));
                    q6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            sVar = sVar2;
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
            ViewPropertyAnimator duration2 = q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            pr prVar2 = pr.h;
            duration2.setInterpolator(prVar2).start();
            q6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(prVar2).start();
            q6Var.setTextColor(!limitPreviewView.L ? -1 : j6.v0(j6.G6, f6Var));
            q6Var2.setTextColor(-1);
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
        Paint paint = limitPreviewView.K;
        s sVar2 = limitPreviewView.e;
        f6 f6Var = limitPreviewView.S;
        q6 q6Var = limitPreviewView.v;
        q6 q6Var2 = limitPreviewView.N;
        limitPreviewView.k0 = null;
        if (limitPreviewView.isAttachedToWindow()) {
            ValueAnimator valueAnimator = limitPreviewView.i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            limitPreviewView.L = false;
            paint.setColor(j6.v0(j6.Oh, f6Var));
            if (tl_starsRating.stars <= 0) {
                limitPreviewView.a = 0.0f;
                q6Var2.setText("");
                q6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(j6.v0(j6.wj, f6Var));
                limitPreviewView.L = true;
            } else {
                if (tl_starsRating.next_level_stars != 0) {
                    long j3 = tl_starsRating.current_level_stars;
                    sVar = sVar2;
                    limitPreviewView.a = p.a((r8 - j3) / (r10 - j3), 0.0f, 1.0f);
                    q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                    q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
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
                    ViewPropertyAnimator duration = q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
                    pr prVar = pr.h;
                    duration.setInterpolator(prVar).start();
                    q6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(prVar).start();
                    q6Var.setTextColor(!limitPreviewView.L ? -1 : j6.v0(j6.G6, f6Var));
                    q6Var2.setTextColor(-1);
                    limitPreviewView.f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
                }
                limitPreviewView.a = 1.0f;
                q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            }
            sVar = sVar2;
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
            ViewPropertyAnimator duration2 = q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            pr prVar2 = pr.h;
            duration2.setInterpolator(prVar2).start();
            q6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(prVar2).start();
            q6Var.setTextColor(!limitPreviewView.L ? -1 : j6.v0(j6.G6, f6Var));
            q6Var2.setTextColor(-1);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z10;
        boolean z11;
        boolean z12;
        AndroidUtilities.cancelRunOnUIThread(this.k0);
        this.k0 = null;
        int i10 = j6.Oh;
        f6 f6Var = this.S;
        int v02 = j6.v0(i10, f6Var);
        Paint paint = this.K;
        paint.setColor(v02);
        this.L = false;
        int i11 = tl_starsRating.level;
        int i12 = tl_starsRating2.level;
        t5 t5Var = this.I;
        q6 q6Var = this.v;
        q6 q6Var2 = this.N;
        if (i11 == i12) {
            if (tl_starsRating2.stars <= 0) {
                this.a = 0.0f;
                q6Var2.setText("");
                q6Var.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(j6.v0(j6.wj, f6Var));
                this.L = true;
            } else {
                if (tl_starsRating2.next_level_stars != 0) {
                    long j3 = tl_starsRating2.current_level_stars;
                    this.a = p.a((r12 - j3) / (r6 - j3), 0.0f, 1.0f);
                    z12 = true;
                    q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
                    q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level + 1)));
                    this.T = z12;
                    this.U = false;
                    this.V = false;
                    this.a0 = this.n;
                    t5Var.requestLayout();
                    requestLayout();
                    q6Var.setTextColor(!this.L ? -1 : j6.v0(j6.G6, f6Var));
                    q6Var2.setTextColor(-1);
                    f((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                    return;
                }
                this.a = 1.0f;
                q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(i12 - 1)));
                q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating2.level)));
            }
            z12 = true;
            this.T = z12;
            this.U = false;
            this.V = false;
            this.a0 = this.n;
            t5Var.requestLayout();
            requestLayout();
            q6Var.setTextColor(!this.L ? -1 : j6.v0(j6.G6, f6Var));
            q6Var2.setTextColor(-1);
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
            q6Var.setTextColor(this.L ? -1 : j6.v0(j6.G6, f6Var));
            q6Var2.setTextColor(-1);
            ViewPropertyAnimator duration = q6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).start();
            q6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(prVar).start();
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i13 = 0;
            Runnable runnable = new Runnable(this) { // from class: sg.o
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
            paint.setColor(j6.v0(i10, f6Var));
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
            ViewPropertyAnimator duration2 = q6Var2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            pr prVar2 = pr.h;
            duration2.setInterpolator(prVar2).start();
            q6Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(prVar2).start();
            q6Var.setTextColor(this.L ? -1 : j6.v0(j6.G6, f6Var));
            q6Var2.setTextColor(-1);
            f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i14 = 1;
            Runnable runnable2 = new Runnable(this) { // from class: sg.o
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
        q6 q6Var = this.N;
        q6 q6Var2 = this.v;
        if ((i11 == i12 && z10) || (i10 = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.a = 1.0f;
            q6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            q6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.a = p.a((i12 - i11) / (i10 - i11), 0.0f, 1.0f);
            q6Var.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level)));
            q6Var2.setText(LocaleController.formatString("BoostsLevel", R.string.BoostsLevel, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) q6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        q6Var2.setTextColor(j6.v0(j6.G6, this.S));
        q6Var.setTextColor(-1);
        g(tL_premium_boostsStatus.boosts, false);
        this.P = true;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0) {
            g(i10, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new nq(this.r, 0), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i10 > 1200 ? LocaleController.formatShortNumber(i10, null) : LocaleController.formatNumber(i10, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i11 > 1200 ? LocaleController.formatShortNumber(i11, null) : LocaleController.formatNumber(i11, ',')));
        spannableStringBuilder.setSpan(new ju(170, 0), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        s sVar = this.e;
        sVar.f = spannableStringBuilder;
        sVar.requestLayout();
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void g(int i10, boolean z10) {
        nq nqVar;
        int i11;
        if (i10 < 0) {
            nqVar = new nq(R.drawable.warning_sign, 0);
        } else {
            nqVar = new nq(this.r, 0);
            float f7 = this.s;
            nqVar.setScale(f7, f7);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ?? r62 = 1;
        spannableStringBuilder.append((CharSequence) "d").setSpan(nqVar, 0, 1, 0);
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
                int i12 = 0;
                while (length >= 0) {
                    char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (charAt == sVar.f.charAt(length) || !Character.isDigit(sVar.f.charAt(length))) {
                        i11 = length;
                    } else {
                        r rVar = new r();
                        arrayList.add(rVar);
                        rVar.e = sVar.d.getSecondaryHorizontal(length);
                        rVar.a = r62;
                        if (i12 >= r62) {
                            i12 = 0;
                        }
                        int i13 = (int) sVar.e;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        i11 = length;
                        StaticLayout staticLayout = new StaticLayout("" + charAt, textPaint, i13, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = rVar.b;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + sVar.f.charAt(i11), textPaint, (int) sVar.e, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new lz(false), i11, i11 + 1, 0);
                        i12++;
                    }
                    length = i11 - 1;
                    r62 = 1;
                }
                sVar.n = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sVar.r = true;
                    r rVar2 = (r) arrayList.get(i14);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new sg.p(sVar, rVar2, 0));
                    rVar2.f.addListener(new q(sVar, rVar2, 1));
                    rVar2.f.setInterpolator(pr.g);
                    rVar2.f.setDuration(250L);
                    rVar2.f.setStartDelay(((arrayList.size() - 1) - i14) * 60);
                    rVar2.f.start();
                }
            }
        } else {
            sVar.f = spannableStringBuilder;
        }
        sVar.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bd  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
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
        int i16 = 0;
        boolean z15 = this.T || this.W;
        this.W = false;
        this.T = false;
        float translationX = z15 ? sVar.getTranslationX() : 0.0f;
        float f16 = dp;
        int i17 = dp * 2;
        float max = (Math.max(this.n, (getMeasuredWidth() - i17) * this.x) + f16) - (sVar.getMeasuredWidth() / 2.0f);
        if (this.Q) {
            float f17 = sVar.s;
            measuredWidth = Utilities.clamp(max, (getMeasuredWidth() - dp) - sVar.getMeasuredWidth(), f16);
            int i18 = this.n;
            if (i18 <= 0) {
                f13 = measuredWidth;
                f11 = f17;
                f12 = 0.0f;
            } else if (i18 >= getMeasuredWidth() - i17) {
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
        if (!z15) {
            sVar.setScaleX(0.0f);
            sVar.setScaleY(0.0f);
            TextPaint textPaint2 = sVar.c;
            ArrayList arrayList = sVar.h;
            arrayList.clear();
            LimitPreviewView limitPreviewView = sVar.y;
            if (!limitPreviewView.P || limitPreviewView.b != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f);
                int i19 = 0;
                boolean z18 = true;
                while (i19 < sVar.f.length()) {
                    if (Character.isDigit(sVar.f.charAt(i19))) {
                        r rVar = new r();
                        arrayList.add(rVar);
                        f15 = f11;
                        rVar.e = sVar.d.getSecondaryHorizontal(i19);
                        rVar.d = z18;
                        if (i16 >= 1) {
                            z18 = !z18;
                            i16 = 0;
                        }
                        i16++;
                        int charAt = sVar.f.charAt(i19) - '0';
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
                            rVar.b.add(new StaticLayout(g.i(i14, ""), textPaint2, (int) sVar.e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i21 = i15 + 1;
                            i20 = i22;
                        }
                        textPaint = textPaint2;
                        spannableStringBuilder.setSpan(new lz(false), i19, i19 + 1, 0);
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
                sVar.n = new StaticLayout(spannableStringBuilder, textPaint2, AndroidUtilities.dp(12.0f) + ((int) sVar.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    sVar.r = true;
                    r rVar2 = (r) arrayList.get(i23);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rVar2.f = ofFloat;
                    ofFloat.addUpdateListener(new sg.p(sVar, rVar2, 1));
                    rVar2.f.addListener(new q(sVar, rVar2, 0));
                    rVar2.f.setInterpolator(pr.g);
                    rVar2.f.setDuration(750L);
                    rVar2.f.setStartDelay(((arrayList.size() - 1) - i23) * 60);
                    rVar2.f.start();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
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
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.n
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
                int i24 = 16;
                this.i0.addListener(new e50(i24, this, z19));
                this.i0.setInterpolator(new OvershootInterpolator());
                if (!this.W) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new a(this, i24));
                    ofFloat3.setDuration(500L);
                    ofFloat3.start();
                    this.i0.setDuration(600L);
                } else if (z17) {
                    this.i0.setInterpolator(pr.i);
                    this.i0.setDuration(320L);
                } else if (z16) {
                    this.i0.setInterpolator(pr.h);
                    this.i0.setDuration(500L);
                } else {
                    this.i0.setDuration(1000L);
                    this.i0.setStartDelay(200L);
                }
                this.i0.start();
                this.d = true;
            }
        }
        f14 = f11;
        z11 = z15;
        ValueAnimator ofFloat22 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.i0 = ofFloat22;
        final float f182 = this.n;
        if (z11) {
        }
        final boolean z192 = !this.j0;
        this.j0 = true;
        final float f192 = f12;
        final float f202 = translationX;
        final float f212 = f14;
        final boolean z202 = z11;
        ofFloat22.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = LimitPreviewView.this;
                s sVar2 = limitPreviewView2.e;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float min = Math.min(1.0f, floatValue);
                if (floatValue > 1.0f && z192) {
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
                    sVar2.setTranslationX(AndroidUtilities.lerp(f202, f13, min));
                    float lerp = AndroidUtilities.lerp(f212, f192, min);
                    if (sVar2.s != lerp) {
                        sVar2.s = lerp;
                        sVar2.v = true;
                        sVar2.invalidate();
                    }
                    sVar2.setPivotX(sVar2.getMeasuredWidth() * lerp);
                }
                float min2 = Math.min(1.0f, 2.0f * min);
                if (z202) {
                    limitPreviewView2.n = (int) AndroidUtilities.lerp(limitPreviewView2.a0, f182, min);
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
        int i242 = 16;
        this.i0.addListener(new e50(i242, this, z192));
        this.i0.setInterpolator(new OvershootInterpolator());
        if (!this.W) {
        }
        this.i0.start();
        this.d = true;
    }

    public void setBagePosition(float f7) {
        this.x = p.a(f7, 0.1f, 0.9f);
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
        int i10 = j6.Oh;
        f6 f6Var = this.S;
        int v02 = j6.v0(i10, f6Var);
        Paint paint = this.K;
        paint.setColor(v02);
        long j3 = tl_starsRating.current_level_stars;
        long j10 = tl_starsRating.stars;
        q6 q6Var = this.N;
        q6 q6Var2 = this.v;
        if (j10 <= 0) {
            this.a = 0.5f;
            q6Var.setText("");
            q6Var2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(j6.v0(j6.wj, f6Var));
            this.L = true;
        } else {
            if (tl_starsRating.next_level_stars == 0) {
                this.a = 1.0f;
                q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level - 1)));
                q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.a = p.a((j10 - j3) / (r14 - j3), 0.0f, 1.0f);
                q6Var.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level)));
                q6Var2.setText(LocaleController.formatString(R.string.StarRatingLevel, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) q6Var2.getLayoutParams()).gravity = 5;
        setType(17);
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        q6Var2.setTextColor(this.L ? -1 : j6.v0(j6.G6, f6Var));
        q6Var.setTextColor(-1);
        f((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.P = true;
        this.Q = true;
        this.R = true;
    }

    public void setStaticGradinet(c1 c1Var) {
        this.E = c1Var;
    }

    public void setStatus(int i10, int i11, boolean z10) {
        if (this.b == i10) {
            z10 = false;
        }
        this.b = i10;
        this.a = p.a(i10 / i11, 0.0f, 1.0f);
        if (z10) {
            this.W = true;
            this.a0 = this.n;
            this.I.requestLayout();
            requestLayout();
        }
        q6 q6Var = this.v;
        ((FrameLayout.LayoutParams) q6Var.getLayoutParams()).gravity = 5;
        this.w.setVisibility(8);
        this.O.setVisibility(8);
        this.N.setText("0");
        q6Var.setText("" + i11);
        g(i10, false);
        this.P = true;
        this.Q = true;
    }

    public void setType(int i10) {
        q6 q6Var = this.v;
        int i11 = this.r;
        s sVar = this.e;
        if (i10 == 6) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new nq(i11, 0), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                sVar.f = spannableStringBuilder;
            }
            q6Var.setText("4 GB");
            return;
        }
        if (i10 == 11) {
            if (sVar != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new nq(i11, 0), 0, 1, 0);
                sVar.f = spannableStringBuilder2;
            }
            q6Var.setText("");
        }
    }

    public LimitPreviewView(Context context, int i10, int i11, int i12, float f7, f6 f6Var) {
        super(context);
        this.s = 1.0f;
        this.H = true;
        this.K = new Paint(1);
        this.d0 = true;
        this.S = f6Var;
        this.a = p.a(f7, 0.1f, 0.9f);
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
        ig0 ig0Var = new ig0(this, context, true);
        this.f0 = ig0Var;
        q6 q6Var = new q6(context, false, false, false);
        this.N = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setText(LocaleController.getString(R.string.LimitFree));
        q6Var.setGravity(16);
        int i13 = j6.G6;
        q6Var.setTextColor(j6.v0(i13, f6Var));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i12)));
        textView.setGravity(16);
        textView.setTextColor(j6.v0(i13, f6Var));
        if (LocaleController.isRTL) {
            ig0Var.addView(q6Var, x5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var.addView(textView, x5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            ig0Var.addView(q6Var, x5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var.addView(textView, x5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        ig0 ig0Var2 = new ig0(this, context, false);
        this.g0 = ig0Var2;
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        q6 q6Var2 = new q6(context, false, false, false);
        this.v = q6Var2;
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var2.setTypeface(AndroidUtilities.bold());
        q6Var2.setText(String.format("%d", Integer.valueOf(i12)));
        q6Var2.setGravity(21);
        q6Var2.setTextColor(-1);
        if (LocaleController.isRTL) {
            ig0Var2.addView(textView2, x5.d(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var2.addView(q6Var2, x5.d(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            ig0Var2.addView(textView2, x5.d(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            ig0Var2.addView(q6Var2, x5.d(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        t5 t5Var = new t5(this, context, f6Var);
        this.I = t5Var;
        t5Var.addView(ig0Var, x5.c(30.0f, -1));
        t5Var.addView(ig0Var2, x5.c(30.0f, -1));
        addView(t5Var, x5.p(-1, 30, 0.0f, 0, 14, i10 == 0 ? 0 : 12, 14, 0));
    }
}
