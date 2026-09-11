package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class c00 extends s4.j {
    public final /* synthetic */ k00 F;

    public c00(k00 k00Var) {
        this.F = k00Var;
    }

    @Override // s4.j
    public final void C(s4.c1 c1Var, s4.i iVar) {
        super.C(c1Var, iVar);
        View view = c1Var.a;
        if (view instanceof i00) {
            i00 i00Var = (i00) view;
            if (i00Var.w) {
                ValueAnimator valueAnimator = i00Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    i00Var.a.removeAllUpdateListeners();
                    i00Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b00(i00Var, 0));
                ofFloat.addListener(new j6(i00Var, 24));
                i00Var.a = ofFloat;
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
        if (view instanceof i00) {
            ((i00) view).a();
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
            ofFloat.addUpdateListener(new l6(this, 23));
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
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i19;
        View view = c1Var.a;
        if (!(view instanceof i00)) {
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
        i00 i00Var = (i00) view;
        k00 k00Var = i00Var.m0;
        TextPaint textPaint = k00Var.b;
        TextPaint textPaint2 = k00Var.c;
        int i22 = i00Var.b.d;
        int i23 = i00Var.I;
        if (i22 != i23) {
            i00Var.H = true;
            i00Var.J = i23;
            i00Var.f0 = i00Var.d0;
            i00Var.g0 = i00Var.e0;
            if (i23 <= 0 || i22 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i23);
                String valueOf2 = String.valueOf(i00Var.b.d);
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
                            spannableStringBuilder.setSpan(new lz(z19), i24, i26, 0);
                            spannableStringBuilder2.setSpan(new lz(z19), i24, i26, 0);
                        } else {
                            i19 = translationY;
                            spannableStringBuilder3.setSpan(new lz(false), i24, i24 + 1, 0);
                        }
                        i24++;
                        translationY = i19;
                        translationX = i25;
                    }
                    i14 = translationX;
                    i15 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    i00Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    i00Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    i00Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    i00Var.L = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    i00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
        int i27 = i00Var.b.d;
        if (i27 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r32] = Integer.valueOf(i27);
            str = String.format("%d", objArr);
            i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            str = null;
            i17 = 0;
        }
        int i28 = i00Var.b.c;
        if (i17 != 0) {
            i18 = AndroidUtilities.dp((str != null ? 1.0f : k00Var.w) * 6.0f) + i17;
        } else {
            i18 = 0;
        }
        int i29 = i18 + i28;
        float measuredWidth = (i00Var.getMeasuredWidth() - i29) / 2;
        float f7 = i00Var.E;
        if (measuredWidth != f7) {
            i00Var.G = i16;
            i00Var.F = f7;
            z11 = true;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = i00Var.N;
        if (charSequence3 == null || i00Var.b.b.equals(charSequence3)) {
            z12 = false;
        } else {
            if (i00Var.N.length() > i00Var.b.b.length()) {
                charSequence = i00Var.N;
                charSequence2 = i00Var.b.b;
                z14 = true;
            } else {
                charSequence = i00Var.b.b;
                charSequence2 = i00Var.N;
                z14 = false;
            }
            int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (charSequenceIndexOf >= 0) {
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                if (charSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new lz((boolean) r32), r32, charSequenceIndexOf, r32);
                }
                if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new lz((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new lz((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                int dp = AndroidUtilities.dp(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = false;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                i00Var.P = staticLayout;
                if (i00Var.l0) {
                    i00Var.O = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.O, staticLayout);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                i00Var.T = staticLayout2;
                if (i00Var.l0) {
                    z16 = true;
                    i00Var.S = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.S, staticLayout2);
                } else {
                    z16 = true;
                }
                i00Var.U = z16;
                i00Var.V = z20;
                i00Var.a0 = charSequenceIndexOf == 0 ? 0.0f : -i00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                i00Var.c0 = i00Var.b0;
                i00Var.R = null;
                z5.release(i00Var, i00Var.Q);
            } else {
                z12 = false;
                CharSequence charSequence4 = i00Var.b.b;
                int dp2 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                i00Var.P = staticLayout3;
                if (i00Var.l0) {
                    i00Var.O = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.O, staticLayout3);
                }
                StaticLayout staticLayout4 = new StaticLayout(i00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                i00Var.R = staticLayout4;
                if (i00Var.l0) {
                    z15 = true;
                    i00Var.Q = z5.update(i00Var.b.g ? 26 : 0, i00Var, i00Var.Q, staticLayout4);
                } else {
                    z15 = true;
                }
                i00Var.T = null;
                z5.release(i00Var, i00Var.S);
                i00Var.U = z15;
                i00Var.a0 = 0.0f;
                i00Var.c0 = i00Var.b0;
            }
            z11 = true;
        }
        if (i29 == i00Var.h0 && i00Var.getMeasuredWidth() == i00Var.j0) {
            z13 = true;
        } else {
            z13 = true;
            i00Var.W = true;
            i00Var.i0 = i00Var.h0;
            z11 = true;
        }
        if (z11) {
            i00Var.x = 0.0f;
            i00Var.w = z13;
            k00 k00Var2 = this.F;
            k00Var2.F.invalidate();
            k00Var2.invalidate();
        }
        if (i20 == 0 && i21 == 0 && !z11) {
            v(c1Var);
            return z12;
        }
        this.r.add(new s4.i(c1Var, i14, i15, i12, i13));
        return z13;
    }

    @Override // s4.f1
    public final void x(s4.c1 c1Var) {
        c1Var.a.setTranslationX(0.0f);
        View view = c1Var.a;
        if (view instanceof i00) {
            ((i00) view).a();
        }
    }
}
