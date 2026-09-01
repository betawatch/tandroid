package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e00 extends f2.l {
    public final /* synthetic */ l00 F;

    public e00(l00 l00Var) {
        this.F = l00Var;
    }

    @Override // f2.l
    public final void C(f2.m1 m1Var, f2.k kVar) {
        super.C(m1Var, kVar);
        View view = m1Var.a;
        if (view instanceof j00) {
            j00 j00Var = (j00) view;
            if (j00Var.w) {
                ValueAnimator valueAnimator = j00Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    j00Var.a.removeAllUpdateListeners();
                    j00Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new d00(j00Var, 0));
                ofFloat.addListener(new a9(j00Var, 20));
                j00Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // f2.l, f2.u0
    public final void f(f2.m1 m1Var) {
        super.f(m1Var);
        View view = m1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof j00) {
            ((j00) view).a();
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
            ofFloat.addUpdateListener(new f6(this, 23));
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
    @Override // f2.l, f2.p1
    public final boolean r(f2.m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r32;
        boolean z4;
        String str;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i19;
        View view = m1Var.a;
        if (!(view instanceof j00)) {
            return super.r(m1Var, eVar, i10, i11, i12, i13);
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(m1Var);
        int i20 = i12 - translationX;
        int i21 = i13 - translationY;
        if (i20 != 0) {
            view.setTranslationX(-i20);
        }
        if (i21 != 0) {
            view.setTranslationY(-i21);
        }
        j00 j00Var = (j00) view;
        l00 l00Var = j00Var.j0;
        TextPaint textPaint = l00Var.b;
        TextPaint textPaint2 = l00Var.c;
        int i22 = j00Var.b.d;
        int i23 = j00Var.F;
        if (i22 != i23) {
            j00Var.E = true;
            j00Var.G = i23;
            j00Var.c0 = j00Var.a0;
            j00Var.d0 = j00Var.b0;
            if (i23 <= 0 || i22 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z16 = true;
                z17 = false;
            } else {
                String valueOf = String.valueOf(i23);
                String valueOf2 = String.valueOf(j00Var.b.d);
                if (valueOf.length() == valueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                    int i24 = 0;
                    while (i24 < valueOf.length()) {
                        int i25 = translationX;
                        if (valueOf.charAt(i24) == valueOf2.charAt(i24)) {
                            boolean z18 = false;
                            i19 = translationY;
                            int i26 = i24 + 1;
                            spannableStringBuilder.setSpan(new nz(z18), i24, i26, 0);
                            spannableStringBuilder2.setSpan(new nz(z18), i24, i26, 0);
                        } else {
                            i19 = translationY;
                            spannableStringBuilder3.setSpan(new nz(false), i24, i24 + 1, 0);
                        }
                        i24++;
                        translationY = i19;
                        translationX = i25;
                    }
                    i14 = translationX;
                    i15 = translationY;
                    z17 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z16 = true;
                    j00Var.I = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    j00Var.J = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    j00Var.H = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z16 = true;
                    z17 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    j00Var.I = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    j00Var.H = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z4 = true;
            i16 = z16;
            r32 = z17;
        } else {
            i14 = translationX;
            i15 = translationY;
            i16 = 1;
            r32 = 0;
            z4 = false;
        }
        int i27 = j00Var.b.d;
        if (i27 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r32] = Integer.valueOf(i27);
            str = String.format("%d", objArr);
            i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            str = null;
            i17 = 0;
        }
        int i28 = j00Var.b.c;
        if (i17 != 0) {
            i18 = AndroidUtilities.dp((str != null ? 1.0f : l00Var.w) * 6.0f) + i17;
        } else {
            i18 = 0;
        }
        int i29 = i18 + i28;
        float measuredWidth = (j00Var.getMeasuredWidth() - i29) / 2;
        float f10 = j00Var.B;
        if (measuredWidth != f10) {
            j00Var.D = i16;
            j00Var.C = f10;
            z10 = true;
        } else {
            z10 = z4;
        }
        CharSequence charSequence3 = j00Var.K;
        if (charSequence3 == null || j00Var.b.b.equals(charSequence3)) {
            z11 = false;
        } else {
            if (j00Var.K.length() > j00Var.b.b.length()) {
                charSequence = j00Var.K;
                charSequence2 = j00Var.b.b;
                z13 = true;
            } else {
                charSequence = j00Var.b.b;
                charSequence2 = j00Var.K;
                z13 = false;
            }
            int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (charSequenceIndexOf >= 0) {
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                if (charSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new nz((boolean) r32), r32, charSequenceIndexOf, r32);
                }
                if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new nz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new nz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                int dp = AndroidUtilities.dp(400.0f);
                boolean z19 = z13;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z11 = false;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                j00Var.M = staticLayout;
                if (j00Var.i0) {
                    j00Var.L = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.L, staticLayout);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                j00Var.Q = staticLayout2;
                if (j00Var.i0) {
                    z15 = true;
                    j00Var.P = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.P, staticLayout2);
                } else {
                    z15 = true;
                }
                j00Var.R = z15;
                j00Var.S = z19;
                j00Var.U = charSequenceIndexOf == 0 ? 0.0f : -j00Var.Q.getPrimaryHorizontal(charSequenceIndexOf);
                j00Var.W = j00Var.V;
                j00Var.O = null;
                u5.release(j00Var, j00Var.N);
            } else {
                z11 = false;
                CharSequence charSequence4 = j00Var.b.b;
                int dp2 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                j00Var.M = staticLayout3;
                if (j00Var.i0) {
                    j00Var.L = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.L, staticLayout3);
                }
                StaticLayout staticLayout4 = new StaticLayout(j00Var.K, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                j00Var.O = staticLayout4;
                if (j00Var.i0) {
                    z14 = true;
                    j00Var.N = u5.update(j00Var.b.g ? 26 : 0, j00Var, j00Var.N, staticLayout4);
                } else {
                    z14 = true;
                }
                j00Var.Q = null;
                u5.release(j00Var, j00Var.P);
                j00Var.R = z14;
                j00Var.U = 0.0f;
                j00Var.W = j00Var.V;
            }
            z10 = true;
        }
        if (i29 == j00Var.e0 && j00Var.getMeasuredWidth() == j00Var.g0) {
            z12 = true;
        } else {
            z12 = true;
            j00Var.T = true;
            j00Var.f0 = j00Var.e0;
            z10 = true;
        }
        if (z10) {
            j00Var.x = 0.0f;
            j00Var.w = z12;
            l00 l00Var2 = this.F;
            l00Var2.C.invalidate();
            l00Var2.invalidate();
        }
        if (i20 == 0 && i21 == 0 && !z10) {
            v(m1Var);
            return z11;
        }
        this.r.add(new f2.k(m1Var, i14, i15, i12, i13));
        return z12;
    }

    @Override // f2.p1
    public final void x(f2.m1 m1Var) {
        m1Var.a.setTranslationX(0.0f);
        View view = m1Var.a;
        if (view instanceof j00) {
            ((j00) view).a();
        }
    }
}
