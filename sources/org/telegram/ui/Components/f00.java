package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class f00 extends s4.j {
    public final /* synthetic */ n00 F;

    public f00(n00 n00Var) {
        this.F = n00Var;
    }

    @Override // s4.j
    public final void C(s4.c1 c1Var, s4.i iVar) {
        super.C(c1Var, iVar);
        View view = c1Var.a;
        if (view instanceof l00) {
            l00 l00Var = (l00) view;
            if (l00Var.w) {
                ValueAnimator valueAnimator = l00Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    l00Var.a.removeAllUpdateListeners();
                    l00Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e00(l00Var, 0));
                ofFloat.addListener(new r8(l00Var, 21));
                l00Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // s4.j, s4.m0
    public final void f(s4.c1 c1Var) {
        super.f(c1Var);
        View view = c1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof l00) {
            ((l00) view).a();
        }
    }

    @Override // s4.j, s4.m0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new k6(this, 23));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    @Override // s4.j, s4.f1
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
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
        float f7;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z13;
        boolean z14;
        boolean z15;
        int i19;
        View view = c1Var.a;
        if (!(view instanceof l00)) {
            return super.r(c1Var, q0Var, i10, i11, i12, i13);
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(c1Var);
        int i20 = i12 - translationX;
        int i21 = i13 - translationY;
        if (i20 != 0) {
            view.setTranslationX(-i20);
        }
        if (i21 != 0) {
            view.setTranslationY(-i21);
        }
        l00 l00Var = (l00) view;
        n00 n00Var = l00Var.m0;
        TextPaint textPaint = n00Var.b;
        TextPaint textPaint2 = n00Var.c;
        int i22 = l00Var.b.d;
        int i23 = l00Var.I;
        if (i22 != i23) {
            l00Var.H = true;
            l00Var.J = i23;
            l00Var.f0 = l00Var.d0;
            l00Var.g0 = l00Var.e0;
            if (i23 <= 0 || i22 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z14 = true;
                z15 = false;
            } else {
                String valueOf = String.valueOf(i23);
                String valueOf2 = String.valueOf(l00Var.b.d);
                if (valueOf.length() == valueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                    int i24 = 0;
                    while (i24 < valueOf.length()) {
                        int i25 = translationX;
                        if (valueOf.charAt(i24) == valueOf2.charAt(i24)) {
                            boolean z16 = false;
                            i19 = translationY;
                            int i26 = i24 + 1;
                            spannableStringBuilder.setSpan(new oz(z16), i24, i26, 0);
                            spannableStringBuilder2.setSpan(new oz(z16), i24, i26, 0);
                        } else {
                            i19 = translationY;
                            spannableStringBuilder3.setSpan(new oz(false), i24, i24 + 1, 0);
                        }
                        i24++;
                        translationY = i19;
                        translationX = i25;
                    }
                    i14 = translationX;
                    i15 = translationY;
                    z15 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf));
                    TextPaint textPaint3 = n00Var.c;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    l00Var.L = new StaticLayout(spannableStringBuilder, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    l00Var.M = new StaticLayout(spannableStringBuilder3, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    l00Var.K = new StaticLayout(spannableStringBuilder2, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    z14 = true;
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z15 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    z14 = true;
                    l00Var.L = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    l00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z10 = true;
            i16 = z14;
            r32 = z15;
        } else {
            i14 = translationX;
            i15 = translationY;
            i16 = 1;
            r32 = 0;
            z10 = false;
        }
        int i27 = l00Var.b.d;
        if (i27 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r32] = Integer.valueOf(i27);
            str = String.format("%d", objArr);
            i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            str = null;
            i17 = 0;
        }
        int i28 = l00Var.b.c;
        if (i17 != 0) {
            i18 = AndroidUtilities.dp((str != null ? 1.0f : n00Var.w) * 6.0f) + i17;
        } else {
            i18 = 0;
        }
        int i29 = i18 + i28;
        float measuredWidth = (l00Var.getMeasuredWidth() - i29) / 2;
        float f10 = l00Var.E;
        if (measuredWidth != f10) {
            l00Var.G = i16;
            l00Var.F = f10;
            z11 = true;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = l00Var.N;
        if (charSequence3 == null || l00Var.b.b.equals(charSequence3)) {
            z12 = false;
            f7 = 0.0f;
        } else {
            if (l00Var.N.length() > l00Var.b.b.length()) {
                charSequence = l00Var.N;
                charSequence2 = l00Var.b.b;
                z13 = true;
            } else {
                charSequence = l00Var.b.b;
                charSequence2 = l00Var.N;
                z13 = false;
            }
            int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (charSequenceIndexOf >= 0) {
                TextPaint textPaint4 = n00Var.b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint4.getFontMetricsInt(), r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                if (charSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new oz((boolean) r32), r32, charSequenceIndexOf, r32);
                }
                if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new oz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new oz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                int dp = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint4, dp, alignment3, 1.0f, 0.0f, false);
                l00Var.P = staticLayout;
                if (l00Var.l0) {
                    int i30 = l00Var.b.g ? 26 : 0;
                    v5 v5Var = l00Var.O;
                    Layout[] layoutArr = new Layout[i16];
                    layoutArr[r32] = staticLayout;
                    l00Var.O = z5.update(i30, l00Var, v5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint4, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                l00Var.T = staticLayout2;
                if (l00Var.l0) {
                    int i31 = l00Var.b.g ? 26 : 0;
                    v5 v5Var2 = l00Var.S;
                    Layout[] layoutArr2 = new Layout[i16];
                    layoutArr2[r32] = staticLayout2;
                    l00Var.S = z5.update(i31, l00Var, v5Var2, layoutArr2);
                }
                l00Var.U = i16;
                l00Var.V = z13;
                l00Var.a0 = charSequenceIndexOf == 0 ? 0.0f : -l00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                l00Var.c0 = l00Var.b0;
                l00Var.R = null;
                z5.release(l00Var, l00Var.Q);
                z12 = false;
                f7 = 0.0f;
            } else {
                CharSequence charSequence4 = l00Var.b.b;
                int dp2 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                z12 = false;
                f7 = 0.0f;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                l00Var.P = staticLayout3;
                if (l00Var.l0) {
                    int i32 = l00Var.b.g ? 26 : 0;
                    v5 v5Var3 = l00Var.O;
                    Layout[] layoutArr3 = new Layout[i16];
                    layoutArr3[0] = staticLayout3;
                    l00Var.O = z5.update(i32, l00Var, v5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(l00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                l00Var.R = staticLayout4;
                if (l00Var.l0) {
                    int i33 = l00Var.b.g ? 26 : 0;
                    v5 v5Var4 = l00Var.Q;
                    Layout[] layoutArr4 = new Layout[i16];
                    layoutArr4[0] = staticLayout4;
                    l00Var.Q = z5.update(i33, l00Var, v5Var4, layoutArr4);
                }
                l00Var.T = null;
                z5.release(l00Var, l00Var.S);
                l00Var.U = i16;
                l00Var.a0 = 0.0f;
                l00Var.c0 = l00Var.b0;
            }
            z11 = true;
        }
        if (i29 != l00Var.h0 || l00Var.getMeasuredWidth() != l00Var.j0) {
            l00Var.W = i16;
            l00Var.i0 = l00Var.h0;
            z11 = true;
        }
        if (z11) {
            l00Var.x = f7;
            l00Var.w = i16;
            n00 n00Var2 = this.F;
            n00Var2.F.invalidate();
            n00Var2.invalidate();
        }
        if (i20 == 0 && i21 == 0 && !z11) {
            v(c1Var);
            return z12;
        }
        this.r.add(new s4.i(c1Var, i14, i15, i12, i13));
        return true;
    }

    @Override // s4.f1
    public final void x(s4.c1 c1Var) {
        c1Var.a.setTranslationX(0.0f);
        View view = c1Var.a;
        if (view instanceof l00) {
            ((l00) view).a();
        }
    }
}
