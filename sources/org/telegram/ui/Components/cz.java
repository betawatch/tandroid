package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cz extends v4.k {
    public final /* synthetic */ iz F;

    public cz(iz izVar) {
        this.F = izVar;
    }

    @Override // v4.k
    public final void C(v4.e1 e1Var, v4.j jVar) {
        super.C(e1Var, jVar);
        View view = e1Var.a;
        if (view instanceof gz) {
            gz gzVar = (gz) view;
            if (gzVar.x) {
                ValueAnimator valueAnimator = gzVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    gzVar.a.removeAllUpdateListeners();
                    gzVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new bz(gzVar, 0));
                ofFloat.addListener(new x5(gzVar, 26));
                gzVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // v4.k, v4.m0
    public final void f(v4.e1 e1Var) {
        super.f(e1Var);
        View view = e1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof gz) {
            ((gz) view).a();
        }
    }

    @Override // v4.k, v4.m0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new c6(this, 23));
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
    @Override // v4.k, v4.g1
    public final boolean r(v4.e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ?? r32;
        boolean z10;
        int i16;
        String str;
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
        View view = e1Var.a;
        if (!(view instanceof gz)) {
            return super.r(e1Var, r0Var, i7, i10, i11, i12);
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(e1Var);
        int i19 = i11 - translationX;
        int i20 = i12 - translationY;
        if (i19 != 0) {
            view.setTranslationX(-i19);
        }
        if (i20 != 0) {
            view.setTranslationY(-i20);
        }
        gz gzVar = (gz) view;
        iz izVar = gzVar.n0;
        TextPaint textPaint = izVar.b;
        TextPaint textPaint2 = izVar.c;
        int i21 = gzVar.b.d;
        int i22 = gzVar.J;
        if (i21 != i22) {
            gzVar.I = true;
            gzVar.K = i22;
            gzVar.g0 = gzVar.e0;
            gzVar.h0 = gzVar.f0;
            if (i22 <= 0 || i21 <= 0) {
                i13 = translationX;
                i14 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i22);
                String valueOf2 = String.valueOf(gzVar.b.d);
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
                            spannableStringBuilder.setSpan(new my(z19), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new my(z19), i23, i25, 0);
                        } else {
                            i18 = translationY;
                            spannableStringBuilder3.setSpan(new my(false), i23, i23 + 1, 0);
                        }
                        i23++;
                        translationY = i18;
                        translationX = i24;
                    }
                    i13 = translationX;
                    i14 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    gzVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    gzVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    gzVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    gzVar.M = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    gzVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z10 = z17;
            i15 = z17;
            r32 = z18;
        } else {
            i13 = translationX;
            i14 = translationY;
            i15 = 1;
            r32 = 0;
            z10 = false;
        }
        int i26 = gzVar.b.d;
        if (i26 > 0) {
            Object[] objArr = new Object[i15];
            objArr[r32] = Integer.valueOf(i26);
            str = String.format("%d", objArr);
            i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
        } else {
            i16 = r32;
            str = null;
        }
        int i27 = gzVar.b.c;
        if (i16 != 0) {
            i17 = org.telegram.messenger.g0.L((str != null ? 1.0f : izVar.x) * 6.0f) + i16;
        } else {
            i17 = r32;
        }
        int i28 = i17 + i27;
        float measuredWidth = (gzVar.getMeasuredWidth() - i28) / 2;
        float f10 = gzVar.F;
        if (measuredWidth != f10) {
            gzVar.H = i15;
            gzVar.G = f10;
            z11 = i15;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = gzVar.O;
        if (charSequence3 == null || gzVar.b.b.equals(charSequence3)) {
            z12 = r32;
        } else {
            if (gzVar.O.length() > gzVar.b.b.length()) {
                charSequence = gzVar.O;
                charSequence2 = gzVar.b.b;
                z14 = i15;
            } else {
                charSequence = gzVar.b.b;
                charSequence2 = gzVar.O;
                z14 = r32;
            }
            int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
            if (t6 >= 0) {
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t6 != 0) {
                    spannableStringBuilder5.setSpan(new my((boolean) r32), r32, t6, r32);
                }
                if (charSequence2.length() + t6 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new my((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new my((boolean) r32), t6, charSequence2.length() + t6, r32);
                int L = org.telegram.messenger.g0.L(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = r32;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                gzVar.Q = staticLayout;
                if (gzVar.m0) {
                    int i29 = gzVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var = gzVar.P;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[z12 ? 1 : 0] = staticLayout;
                    gzVar.P = p5.update(i29, gzVar, l5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                gzVar.U = staticLayout2;
                if (gzVar.m0) {
                    int i30 = gzVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var2 = gzVar.T;
                    z16 = true;
                    Layout[] layoutArr2 = new Layout[1];
                    layoutArr2[z12 ? 1 : 0] = staticLayout2;
                    gzVar.T = p5.update(i30, gzVar, l5Var2, layoutArr2);
                } else {
                    z16 = true;
                }
                gzVar.V = z16;
                gzVar.W = z20;
                gzVar.b0 = t6 == 0 ? 0.0f : -gzVar.U.getPrimaryHorizontal(t6);
                gzVar.d0 = gzVar.c0;
                gzVar.S = null;
                p5.release(gzVar, gzVar.R);
            } else {
                z12 = r32;
                CharSequence charSequence4 = gzVar.b.b;
                int L2 = org.telegram.messenger.g0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                gzVar.Q = staticLayout3;
                if (gzVar.m0) {
                    int i31 = gzVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var3 = gzVar.P;
                    Layout[] layoutArr3 = new Layout[1];
                    layoutArr3[z12 ? 1 : 0] = staticLayout3;
                    gzVar.P = p5.update(i31, gzVar, l5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(gzVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                gzVar.S = staticLayout4;
                if (gzVar.m0) {
                    int i32 = gzVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var4 = gzVar.R;
                    z15 = true;
                    Layout[] layoutArr4 = new Layout[1];
                    layoutArr4[z12 ? 1 : 0] = staticLayout4;
                    gzVar.R = p5.update(i32, gzVar, l5Var4, layoutArr4);
                } else {
                    z15 = true;
                }
                gzVar.U = null;
                p5.release(gzVar, gzVar.T);
                gzVar.V = z15;
                gzVar.b0 = 0.0f;
                gzVar.d0 = gzVar.c0;
            }
            z11 = true;
        }
        if (i28 == gzVar.i0 && gzVar.getMeasuredWidth() == gzVar.k0) {
            z13 = true;
        } else {
            z13 = true;
            gzVar.a0 = true;
            gzVar.j0 = gzVar.i0;
            z11 = true;
        }
        if (z11) {
            gzVar.y = 0.0f;
            gzVar.x = z13;
            iz izVar2 = this.F;
            izVar2.G.invalidate();
            izVar2.invalidate();
        }
        if (i19 == 0 && i20 == 0 && !z11) {
            v(e1Var);
            return z12;
        }
        this.r.add(new v4.j(e1Var, i13, i14, i11, i12));
        return z13;
    }

    @Override // v4.g1
    public final void x(v4.e1 e1Var) {
        e1Var.a.setTranslationX(0.0f);
        View view = e1Var.a;
        if (view instanceof gz) {
            ((gz) view).a();
        }
    }
}
