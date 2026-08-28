package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oz extends f2.n {
    public final /* synthetic */ vz F;

    public oz(vz vzVar) {
        this.F = vzVar;
    }

    @Override // f2.n
    public final void C(f2.q1 q1Var, f2.m mVar) {
        super.C(q1Var, mVar);
        View view = q1Var.a;
        if (view instanceof tz) {
            tz tzVar = (tz) view;
            if (tzVar.w) {
                ValueAnimator valueAnimator = tzVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    tzVar.a.removeAllUpdateListeners();
                    tzVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nz(tzVar, 0));
                ofFloat.addListener(new org.telegram.ui.xp(tzVar, 27));
                tzVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // f2.n, f2.w0
    public final void f(f2.q1 q1Var) {
        super.f(q1Var);
        View view = q1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof tz) {
            ((tz) view).a();
        }
    }

    @Override // f2.n, f2.w0
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
    @Override // f2.n, f2.t1
    public final boolean r(f2.q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ?? r32;
        boolean z10;
        String str;
        int i16;
        int i17;
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
        int i18;
        View view = q1Var.a;
        if (!(view instanceof tz)) {
            return super.r(q1Var, pVar, i9, i10, i11, i12);
        }
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(q1Var);
        int i19 = i11 - translationX;
        int i20 = i12 - translationY;
        if (i19 != 0) {
            view.setTranslationX(-i19);
        }
        if (i20 != 0) {
            view.setTranslationY(-i20);
        }
        tz tzVar = (tz) view;
        vz vzVar = tzVar.i0;
        TextPaint textPaint = vzVar.b;
        TextPaint textPaint2 = vzVar.c;
        int i21 = tzVar.b.d;
        int i22 = tzVar.E;
        if (i21 != i22) {
            tzVar.D = true;
            tzVar.F = i22;
            tzVar.b0 = tzVar.W;
            tzVar.c0 = tzVar.a0;
            if (i22 <= 0 || i21 <= 0) {
                i13 = translationX;
                i14 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i22);
                String valueOf2 = String.valueOf(tzVar.b.d);
                if (valueOf.length() == valueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                    int i23 = 0;
                    while (i23 < valueOf.length()) {
                        int i24 = translationX;
                        if (valueOf.charAt(i23) == valueOf2.charAt(i23)) {
                            boolean z19 = false;
                            i18 = translationY;
                            int i25 = i23 + 1;
                            spannableStringBuilder.setSpan(new xy(z19), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new xy(z19), i23, i25, 0);
                        } else {
                            i18 = translationY;
                            spannableStringBuilder3.setSpan(new xy(false), i23, i23 + 1, 0);
                        }
                        i23++;
                        translationY = i18;
                        translationX = i24;
                    }
                    i13 = translationX;
                    i14 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.f6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    tzVar.H = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    tzVar.I = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    tzVar.G = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.f6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    tzVar.H = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    tzVar.G = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.f6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z10 = true;
            i15 = z17;
            r32 = z18;
        } else {
            i13 = translationX;
            i14 = translationY;
            i15 = 1;
            r32 = 0;
            z10 = false;
        }
        int i26 = tzVar.b.d;
        if (i26 > 0) {
            Object[] objArr = new Object[i15];
            objArr[r32] = Integer.valueOf(i26);
            str = String.format("%d", objArr);
            i16 = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + AndroidUtilities.dp(10.0f);
        } else {
            str = null;
            i16 = 0;
        }
        int i27 = tzVar.b.c;
        if (i16 != 0) {
            i17 = AndroidUtilities.dp((str != null ? 1.0f : vzVar.w) * 6.0f) + i16;
        } else {
            i17 = 0;
        }
        int i28 = i17 + i27;
        float measuredWidth = (tzVar.getMeasuredWidth() - i28) / 2;
        float f10 = tzVar.A;
        if (measuredWidth != f10) {
            tzVar.C = i15;
            tzVar.B = f10;
            z11 = true;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = tzVar.J;
        if (charSequence3 == null || tzVar.b.b.equals(charSequence3)) {
            z12 = false;
        } else {
            if (tzVar.J.length() > tzVar.b.b.length()) {
                charSequence = tzVar.J;
                charSequence2 = tzVar.b.b;
                z14 = true;
            } else {
                charSequence = tzVar.b.b;
                charSequence2 = tzVar.J;
                z14 = false;
            }
            int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
            if (charSequenceIndexOf >= 0) {
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                if (charSequenceIndexOf != 0) {
                    spannableStringBuilder5.setSpan(new xy((boolean) r32), r32, charSequenceIndexOf, r32);
                }
                if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new xy((boolean) r32), charSequence2.length() + charSequenceIndexOf, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new xy((boolean) r32), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, r32);
                int dp = AndroidUtilities.dp(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = false;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, dp, alignment3, 1.0f, 0.0f, false);
                tzVar.L = staticLayout;
                if (tzVar.h0) {
                    tzVar.K = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.K, staticLayout);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                tzVar.P = staticLayout2;
                if (tzVar.h0) {
                    z16 = true;
                    tzVar.O = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.O, staticLayout2);
                } else {
                    z16 = true;
                }
                tzVar.Q = z16;
                tzVar.R = z20;
                tzVar.T = charSequenceIndexOf == 0 ? 0.0f : -tzVar.P.getPrimaryHorizontal(charSequenceIndexOf);
                tzVar.V = tzVar.U;
                tzVar.N = null;
                t5.release(tzVar, tzVar.M);
            } else {
                z12 = false;
                CharSequence charSequence4 = tzVar.b.b;
                int dp2 = AndroidUtilities.dp(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, dp2, alignment4, 1.0f, 0.0f, false);
                tzVar.L = staticLayout3;
                if (tzVar.h0) {
                    tzVar.K = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.K, staticLayout3);
                }
                StaticLayout staticLayout4 = new StaticLayout(tzVar.J, textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                tzVar.N = staticLayout4;
                if (tzVar.h0) {
                    z15 = true;
                    tzVar.M = t5.update(tzVar.b.g ? 26 : 0, tzVar, tzVar.M, staticLayout4);
                } else {
                    z15 = true;
                }
                tzVar.P = null;
                t5.release(tzVar, tzVar.O);
                tzVar.Q = z15;
                tzVar.T = 0.0f;
                tzVar.V = tzVar.U;
            }
            z11 = true;
        }
        if (i28 == tzVar.d0 && tzVar.getMeasuredWidth() == tzVar.f0) {
            z13 = true;
        } else {
            z13 = true;
            tzVar.S = true;
            tzVar.e0 = tzVar.d0;
            z11 = true;
        }
        if (z11) {
            tzVar.x = 0.0f;
            tzVar.w = z13;
            vz vzVar2 = this.F;
            vzVar2.B.invalidate();
            vzVar2.invalidate();
        }
        if (i19 == 0 && i20 == 0 && !z11) {
            v(q1Var);
            return z12;
        }
        this.r.add(new f2.m(q1Var, i13, i14, i11, i12));
        return z13;
    }

    @Override // f2.t1
    public final void x(f2.q1 q1Var) {
        q1Var.a.setTranslationX(0.0f);
        View view = q1Var.a;
        if (view instanceof tz) {
            ((tz) view).a();
        }
    }
}
