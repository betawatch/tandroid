package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xz extends f2.l {
    public final /* synthetic */ f00 F;

    public xz(f00 f00Var) {
        this.F = f00Var;
    }

    @Override // f2.l
    public final void C(f2.n1 n1Var, f2.k kVar) {
        super.C(n1Var, kVar);
        View view = n1Var.a;
        if (view instanceof d00) {
            d00 d00Var = (d00) view;
            if (d00Var.w) {
                ValueAnimator valueAnimator = d00Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    d00Var.a.removeAllUpdateListeners();
                    d00Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wz(d00Var, 0));
                ofFloat.addListener(new org.telegram.ui.bm(d00Var, 29));
                d00Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // f2.l, f2.u0
    public final void f(f2.n1 n1Var) {
        super.f(n1Var);
        View view = n1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof d00) {
            ((d00) view).a();
        }
    }

    @Override // f2.l, f2.u0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new j6(this, 23));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    @Override // f2.l, f2.q1
    public final boolean r(f2.n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r32;
        boolean z10;
        String str;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i19;
        View view = n1Var.a;
        if (!(view instanceof d00)) {
            return super.r(n1Var, eVar, i10, i11, i12, i13);
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(n1Var);
        int i20 = i12 - translationX;
        int i21 = i13 - translationY;
        if (i20 != 0) {
            view.setTranslationX(-i20);
        }
        if (i21 != 0) {
            view.setTranslationY(-i21);
        }
        d00 d00Var = (d00) view;
        f00 f00Var = d00Var.i0;
        TextPaint textPaint = f00Var.b;
        TextPaint textPaint2 = f00Var.c;
        int i22 = d00Var.b.d;
        int i23 = d00Var.E;
        if (i22 != i23) {
            d00Var.D = true;
            d00Var.F = i23;
            d00Var.b0 = d00Var.W;
            d00Var.c0 = d00Var.a0;
            if (i23 <= 0 || i22 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i23);
                String valueOf2 = String.valueOf(d00Var.b.d);
                if (valueOf.length() == valueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                    int i24 = 0;
                    while (i24 < valueOf.length()) {
                        int i25 = translationX;
                        if (valueOf.charAt(i24) == valueOf2.charAt(i24)) {
                            boolean z19 = false;
                            i19 = translationY;
                            int i26 = i24 + 1;
                            spannableStringBuilder.setSpan(new gz(z19), i24, i26, 0);
                            spannableStringBuilder2.setSpan(new gz(z19), i24, i26, 0);
                        } else {
                            i19 = translationY;
                            spannableStringBuilder3.setSpan(new gz(false), i24, i24 + 1, 0);
                        }
                        i24++;
                        translationY = i19;
                        translationX = i25;
                    }
                    i14 = translationX;
                    i15 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    d00Var.H = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    d00Var.I = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    d00Var.G = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    d00Var.H = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    d00Var.G = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z10 = true;
            i16 = z17;
            r32 = z18;
        } else {
            i14 = translationX;
            i15 = translationY;
            i16 = 1;
            r32 = 0;
            z10 = false;
        }
        int i27 = d00Var.b.d;
        if (i27 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r32] = Integer.valueOf(i27);
            str = String.format("%d", objArr);
            i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            str = null;
            i17 = 0;
        }
        int i28 = d00Var.b.c;
        if (i17 != 0) {
            i18 = AndroidUtilities.dp((str != null ? 1.0f : f00Var.w) * 6.0f) + i17;
        } else {
            i18 = 0;
        }
        int i29 = i18 + i28;
        float measuredWidth = (d00Var.getMeasuredWidth() - i29) / 2;
        float f9 = d00Var.A;
        if (measuredWidth != f9) {
            d00Var.C = i16;
            d00Var.B = f9;
            z11 = true;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = d00Var.J;
        if (charSequence3 == null || d00Var.b.b.equals(charSequence3)) {
            z12 = false;
        } else {
            if (d00Var.J.length() > d00Var.b.b.length()) {
                charSequence = d00Var.J;
                charSequence2 = d00Var.b.b;
                z14 = true;
            } else {
                charSequence = d00Var.b.b;
                charSequence2 = d00Var.J;
                z14 = false;
            }
            int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (charSequenceIndexOf >= 0) {
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                if (charSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new gz((boolean) r32), r32, charSequenceIndexOf, r32);
                }
                if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new gz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new gz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                int dp = AndroidUtilities.dp(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = false;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                d00Var.L = staticLayout;
                if (d00Var.h0) {
                    d00Var.K = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.K, staticLayout);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                d00Var.P = staticLayout2;
                if (d00Var.h0) {
                    z16 = true;
                    d00Var.O = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.O, staticLayout2);
                } else {
                    z16 = true;
                }
                d00Var.Q = z16;
                d00Var.R = z20;
                d00Var.T = charSequenceIndexOf == 0 ? 0.0f : -d00Var.P.getPrimaryHorizontal(charSequenceIndexOf);
                d00Var.V = d00Var.U;
                d00Var.N = null;
                y5.release(d00Var, d00Var.M);
            } else {
                z12 = false;
                CharSequence charSequence4 = d00Var.b.b;
                int dp2 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                d00Var.L = staticLayout3;
                if (d00Var.h0) {
                    d00Var.K = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.K, staticLayout3);
                }
                StaticLayout staticLayout4 = new StaticLayout(d00Var.J, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                d00Var.N = staticLayout4;
                if (d00Var.h0) {
                    z15 = true;
                    d00Var.M = y5.update(d00Var.b.g ? 26 : 0, d00Var, d00Var.M, staticLayout4);
                } else {
                    z15 = true;
                }
                d00Var.P = null;
                y5.release(d00Var, d00Var.O);
                d00Var.Q = z15;
                d00Var.T = 0.0f;
                d00Var.V = d00Var.U;
            }
            z11 = true;
        }
        if (i29 == d00Var.d0 && d00Var.getMeasuredWidth() == d00Var.f0) {
            z13 = true;
        } else {
            z13 = true;
            d00Var.S = true;
            d00Var.e0 = d00Var.d0;
            z11 = true;
        }
        if (z11) {
            d00Var.x = 0.0f;
            d00Var.w = z13;
            f00 f00Var2 = this.F;
            f00Var2.B.invalidate();
            f00Var2.invalidate();
        }
        if (i20 == 0 && i21 == 0 && !z11) {
            v(n1Var);
            return z12;
        }
        this.r.add(new f2.k(n1Var, i14, i15, i12, i13));
        return z13;
    }

    @Override // f2.q1
    public final void x(f2.n1 n1Var) {
        n1Var.a.setTranslationX(0.0f);
        View view = n1Var.a;
        if (view instanceof d00) {
            ((d00) view).a();
        }
    }
}
