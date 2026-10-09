package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class s00 extends s4.j {
    public final /* synthetic */ a10 F;

    public s00(a10 a10Var) {
        this.F = a10Var;
    }

    @Override // s4.j
    public final void C(s4.d1 d1Var, s4.i iVar) {
        super.C(d1Var, iVar);
        View view = d1Var.a;
        if (view instanceof y00) {
            y00 y00Var = (y00) view;
            if (y00Var.w) {
                ValueAnimator valueAnimator = y00Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    y00Var.a.removeAllUpdateListeners();
                    y00Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r00(y00Var, 0));
                ofFloat.addListener(new t8(y00Var, 21));
                y00Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // s4.j, s4.n0
    public final void f(s4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof y00) {
            ((y00) view).a();
        }
    }

    @Override // s4.j, s4.n0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new m6(this, 24));
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
    @Override // s4.j, s4.g1
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        ?? r32;
        boolean z10;
        int i17;
        String str;
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
        View view = d1Var.a;
        if (!(view instanceof y00)) {
            return super.r(d1Var, q0Var, i10, i11, i12, i13);
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(d1Var);
        int i20 = i12 - translationX;
        int i21 = i13 - translationY;
        if (i20 != 0) {
            view.setTranslationX(-i20);
        }
        if (i21 != 0) {
            view.setTranslationY(-i21);
        }
        y00 y00Var = (y00) view;
        a10 a10Var = y00Var.m0;
        TextPaint textPaint = a10Var.b;
        TextPaint textPaint2 = a10Var.c;
        int i22 = y00Var.b.d;
        int i23 = y00Var.I;
        if (i22 != i23) {
            y00Var.H = true;
            y00Var.J = i23;
            y00Var.f0 = y00Var.d0;
            y00Var.g0 = y00Var.e0;
            if (i23 <= 0 || i22 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i23);
                String valueOf2 = String.valueOf(y00Var.b.d);
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
                            spannableStringBuilder.setSpan(new b00(z19), i24, i26, 0);
                            spannableStringBuilder2.setSpan(new b00(z19), i24, i26, 0);
                        } else {
                            i19 = translationY;
                            spannableStringBuilder3.setSpan(new b00(false), i24, i24 + 1, 0);
                        }
                        i24++;
                        translationY = i19;
                        translationX = i25;
                    }
                    i14 = translationX;
                    i15 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    y00Var.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    y00Var.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    y00Var.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    y00Var.L = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    y00Var.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.i6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z10 = z17;
            i16 = z17;
            r32 = z18;
        } else {
            i14 = translationX;
            i15 = translationY;
            i16 = 1;
            r32 = 0;
            z10 = false;
        }
        int i27 = y00Var.b.d;
        if (i27 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r32] = Integer.valueOf(i27);
            str = String.format("%d", objArr);
            i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            i17 = r32;
            str = null;
        }
        int i28 = y00Var.b.c;
        if (i17 != 0) {
            i18 = AndroidUtilities.dp((str != null ? 1.0f : a10Var.w) * 6.0f) + i17;
        } else {
            i18 = r32;
        }
        int i29 = i18 + i28;
        float measuredWidth = (y00Var.getMeasuredWidth() - i29) / 2;
        float f7 = y00Var.E;
        if (measuredWidth != f7) {
            y00Var.G = i16;
            y00Var.F = f7;
            z11 = i16;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = y00Var.N;
        if (charSequence3 == null || y00Var.b.b.equals(charSequence3)) {
            z12 = r32;
        } else {
            if (y00Var.N.length() > y00Var.b.b.length()) {
                charSequence = y00Var.N;
                charSequence2 = y00Var.b.b;
                z14 = i16;
            } else {
                charSequence = y00Var.b.b;
                charSequence2 = y00Var.N;
                z14 = r32;
            }
            int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (charSequenceIndexOf >= 0) {
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                if (charSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new b00((boolean) r32), r32, charSequenceIndexOf, r32);
                }
                if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new b00((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new b00((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                int dp = AndroidUtilities.dp(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = r32;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                y00Var.P = staticLayout;
                if (y00Var.l0) {
                    int i30 = y00Var.b.g ? 26 : z12 ? 1 : 0;
                    x5 x5Var = y00Var.O;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[z12 ? 1 : 0] = staticLayout;
                    y00Var.O = b6.update(i30, y00Var, x5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                y00Var.T = staticLayout2;
                if (y00Var.l0) {
                    int i31 = y00Var.b.g ? 26 : z12 ? 1 : 0;
                    x5 x5Var2 = y00Var.S;
                    z16 = true;
                    Layout[] layoutArr2 = new Layout[1];
                    layoutArr2[z12 ? 1 : 0] = staticLayout2;
                    y00Var.S = b6.update(i31, y00Var, x5Var2, layoutArr2);
                } else {
                    z16 = true;
                }
                y00Var.U = z16;
                y00Var.V = z20;
                y00Var.a0 = charSequenceIndexOf == 0 ? 0.0f : -y00Var.T.getPrimaryHorizontal(charSequenceIndexOf);
                y00Var.c0 = y00Var.b0;
                y00Var.R = null;
                b6.release(y00Var, y00Var.Q);
            } else {
                z12 = r32;
                CharSequence charSequence4 = y00Var.b.b;
                int dp2 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                y00Var.P = staticLayout3;
                if (y00Var.l0) {
                    int i32 = y00Var.b.g ? 26 : z12 ? 1 : 0;
                    x5 x5Var3 = y00Var.O;
                    Layout[] layoutArr3 = new Layout[1];
                    layoutArr3[z12 ? 1 : 0] = staticLayout3;
                    y00Var.O = b6.update(i32, y00Var, x5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(y00Var.N, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                y00Var.R = staticLayout4;
                if (y00Var.l0) {
                    int i33 = y00Var.b.g ? 26 : z12 ? 1 : 0;
                    x5 x5Var4 = y00Var.Q;
                    z15 = true;
                    Layout[] layoutArr4 = new Layout[1];
                    layoutArr4[z12 ? 1 : 0] = staticLayout4;
                    y00Var.Q = b6.update(i33, y00Var, x5Var4, layoutArr4);
                } else {
                    z15 = true;
                }
                y00Var.T = null;
                b6.release(y00Var, y00Var.S);
                y00Var.U = z15;
                y00Var.a0 = 0.0f;
                y00Var.c0 = y00Var.b0;
            }
            z11 = true;
        }
        if (i29 == y00Var.h0 && y00Var.getMeasuredWidth() == y00Var.j0) {
            z13 = true;
        } else {
            z13 = true;
            y00Var.W = true;
            y00Var.i0 = y00Var.h0;
            z11 = true;
        }
        if (z11) {
            y00Var.x = 0.0f;
            y00Var.w = z13;
            a10 a10Var2 = this.F;
            a10Var2.F.invalidate();
            a10Var2.invalidate();
        }
        if (i20 == 0 && i21 == 0 && !z11) {
            v(d1Var);
            return z12;
        }
        this.r.add(new s4.i(d1Var, i14, i15, i12, i13));
        return z13;
    }

    @Override // s4.g1
    public final void x(s4.d1 d1Var) {
        d1Var.a.setTranslationX(0.0f);
        View view = d1Var.a;
        if (view instanceof y00) {
            ((y00) view).a();
        }
    }
}
