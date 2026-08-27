package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qz extends f2.l {
    public final /* synthetic */ yz F;

    public qz(yz yzVar) {
        this.F = yzVar;
    }

    @Override // f2.l
    public final void C(f2.o1 o1Var, f2.k kVar) {
        super.C(o1Var, kVar);
        View view = o1Var.a;
        if (view instanceof wz) {
            wz wzVar = (wz) view;
            if (wzVar.w) {
                ValueAnimator valueAnimator = wzVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    wzVar.a.removeAllUpdateListeners();
                    wzVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new pz(wzVar, 0));
                ofFloat.addListener(new org.telegram.ui.am(wzVar, 29));
                wzVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // f2.l, f2.v0
    public final void f(f2.o1 o1Var) {
        super.f(o1Var);
        View view = o1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof wz) {
            ((wz) view).a();
        }
    }

    @Override // f2.l, f2.v0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new e6(this, 23));
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
    @Override // f2.l, f2.r1
    public final boolean r(f2.o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13) {
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
        View view = o1Var.a;
        if (!(view instanceof wz)) {
            return super.r(o1Var, pVar, i10, i11, i12, i13);
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(o1Var);
        int i20 = i12 - translationX;
        int i21 = i13 - translationY;
        if (i20 != 0) {
            view.setTranslationX(-i20);
        }
        if (i21 != 0) {
            view.setTranslationY(-i21);
        }
        wz wzVar = (wz) view;
        yz yzVar = wzVar.i0;
        TextPaint textPaint = yzVar.b;
        TextPaint textPaint2 = yzVar.c;
        int i22 = wzVar.b.d;
        int i23 = wzVar.E;
        if (i22 != i23) {
            wzVar.D = true;
            wzVar.F = i23;
            wzVar.b0 = wzVar.W;
            wzVar.c0 = wzVar.a0;
            if (i23 <= 0 || i22 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i23);
                String valueOf2 = String.valueOf(wzVar.b.d);
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
                            spannableStringBuilder.setSpan(new zy(z19), i24, i26, 0);
                            spannableStringBuilder2.setSpan(new zy(z19), i24, i26, 0);
                        } else {
                            i19 = translationY;
                            spannableStringBuilder3.setSpan(new zy(false), i24, i24 + 1, 0);
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
                    wzVar.H = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    wzVar.I = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    wzVar.G = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    wzVar.H = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    wzVar.G = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
        int i27 = wzVar.b.d;
        if (i27 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r32] = Integer.valueOf(i27);
            str = String.format("%d", objArr);
            i17 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            str = null;
            i17 = 0;
        }
        int i28 = wzVar.b.c;
        if (i17 != 0) {
            i18 = AndroidUtilities.dp((str != null ? 1.0f : yzVar.w) * 6.0f) + i17;
        } else {
            i18 = 0;
        }
        int i29 = i18 + i28;
        float measuredWidth = (wzVar.getMeasuredWidth() - i29) / 2;
        float f10 = wzVar.A;
        if (measuredWidth != f10) {
            wzVar.C = i16;
            wzVar.B = f10;
            z11 = true;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = wzVar.J;
        if (charSequence3 == null || wzVar.b.b.equals(charSequence3)) {
            z12 = false;
        } else {
            if (wzVar.J.length() > wzVar.b.b.length()) {
                charSequence = wzVar.J;
                charSequence2 = wzVar.b.b;
                z14 = true;
            } else {
                charSequence = wzVar.b.b;
                charSequence2 = wzVar.J;
                z14 = false;
            }
            int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (charSequenceIndexOf >= 0) {
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                if (charSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new zy((boolean) r32), r32, charSequenceIndexOf, r32);
                }
                if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new zy((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new zy((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                int dp = AndroidUtilities.dp(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = false;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                wzVar.L = staticLayout;
                if (wzVar.h0) {
                    wzVar.K = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.K, staticLayout);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                wzVar.P = staticLayout2;
                if (wzVar.h0) {
                    z16 = true;
                    wzVar.O = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.O, staticLayout2);
                } else {
                    z16 = true;
                }
                wzVar.Q = z16;
                wzVar.R = z20;
                wzVar.T = charSequenceIndexOf == 0 ? 0.0f : -wzVar.P.getPrimaryHorizontal(charSequenceIndexOf);
                wzVar.V = wzVar.U;
                wzVar.N = null;
                t5.release(wzVar, wzVar.M);
            } else {
                z12 = false;
                CharSequence charSequence4 = wzVar.b.b;
                int dp2 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                wzVar.L = staticLayout3;
                if (wzVar.h0) {
                    wzVar.K = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.K, staticLayout3);
                }
                StaticLayout staticLayout4 = new StaticLayout(wzVar.J, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                wzVar.N = staticLayout4;
                if (wzVar.h0) {
                    z15 = true;
                    wzVar.M = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.M, staticLayout4);
                } else {
                    z15 = true;
                }
                wzVar.P = null;
                t5.release(wzVar, wzVar.O);
                wzVar.Q = z15;
                wzVar.T = 0.0f;
                wzVar.V = wzVar.U;
            }
            z11 = true;
        }
        if (i29 == wzVar.d0 && wzVar.getMeasuredWidth() == wzVar.f0) {
            z13 = true;
        } else {
            z13 = true;
            wzVar.S = true;
            wzVar.e0 = wzVar.d0;
            z11 = true;
        }
        if (z11) {
            wzVar.x = 0.0f;
            wzVar.w = z13;
            yz yzVar2 = this.F;
            yzVar2.B.invalidate();
            yzVar2.invalidate();
        }
        if (i20 == 0 && i21 == 0 && !z11) {
            v(o1Var);
            return z12;
        }
        this.r.add(new f2.k(o1Var, i14, i15, i12, i13));
        return z13;
    }

    @Override // f2.r1
    public final void x(f2.o1 o1Var) {
        o1Var.a.setTranslationX(0.0f);
        View view = o1Var.a;
        if (view instanceof wz) {
            ((wz) view).a();
        }
    }
}
