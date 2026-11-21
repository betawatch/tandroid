package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class kz extends v4.k {
    public final /* synthetic */ rz F;

    public kz(rz rzVar) {
        this.F = rzVar;
    }

    @Override // v4.k
    public final void C(v4.f1 f1Var, v4.j jVar) {
        super.C(f1Var, jVar);
        View view = f1Var.a;
        if (view instanceof pz) {
            pz pzVar = (pz) view;
            if (pzVar.x) {
                ValueAnimator valueAnimator = pzVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    pzVar.a.removeAllUpdateListeners();
                    pzVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jz(pzVar, 0));
                ofFloat.addListener(new y(pzVar, 27));
                pzVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // v4.k, v4.n0
    public final void f(v4.f1 f1Var) {
        super.f(f1Var);
        View view = f1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof pz) {
            ((pz) view).a();
        }
    }

    @Override // v4.k, v4.n0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new x(this, 25));
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
    @Override // v4.k, v4.h1
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
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
        View view = f1Var.a;
        if (!(view instanceof pz)) {
            return super.r(f1Var, r0Var, i7, i10, i11, i12);
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(f1Var);
        int i19 = i11 - translationX;
        int i20 = i12 - translationY;
        if (i19 != 0) {
            view.setTranslationX(-i19);
        }
        if (i20 != 0) {
            view.setTranslationY(-i20);
        }
        pz pzVar = (pz) view;
        rz rzVar = pzVar.n0;
        TextPaint textPaint = rzVar.b;
        TextPaint textPaint2 = rzVar.c;
        int i21 = pzVar.b.d;
        int i22 = pzVar.J;
        if (i21 != i22) {
            pzVar.I = true;
            pzVar.K = i22;
            pzVar.g0 = pzVar.e0;
            pzVar.h0 = pzVar.f0;
            if (i22 <= 0 || i21 <= 0) {
                i13 = translationX;
                i14 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i22);
                String valueOf2 = String.valueOf(pzVar.b.d);
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
                            spannableStringBuilder.setSpan(new uy(z19), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new uy(z19), i23, i25, 0);
                        } else {
                            i18 = translationY;
                            spannableStringBuilder3.setSpan(new uy(false), i23, i23 + 1, 0);
                        }
                        i23++;
                        translationY = i18;
                        translationX = i24;
                    }
                    i13 = translationX;
                    i14 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    pzVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    pzVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    pzVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    pzVar.M = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    pzVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
        int i26 = pzVar.b.d;
        if (i26 > 0) {
            Object[] objArr = new Object[i15];
            objArr[r32] = Integer.valueOf(i26);
            str = String.format("%d", objArr);
            i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
        } else {
            i16 = r32;
            str = null;
        }
        int i27 = pzVar.b.c;
        if (i16 != 0) {
            i17 = org.telegram.messenger.g0.L((str != null ? 1.0f : rzVar.x) * 6.0f) + i16;
        } else {
            i17 = r32;
        }
        int i28 = i17 + i27;
        float measuredWidth = (pzVar.getMeasuredWidth() - i28) / 2;
        float f10 = pzVar.F;
        if (measuredWidth != f10) {
            pzVar.H = i15;
            pzVar.G = f10;
            z11 = i15;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = pzVar.O;
        if (charSequence3 == null || pzVar.b.b.equals(charSequence3)) {
            z12 = r32;
        } else {
            if (pzVar.O.length() > pzVar.b.b.length()) {
                charSequence = pzVar.O;
                charSequence2 = pzVar.b.b;
                z14 = i15;
            } else {
                charSequence = pzVar.b.b;
                charSequence2 = pzVar.O;
                z14 = r32;
            }
            int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
            if (t6 >= 0) {
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t6 != 0) {
                    spannableStringBuilder5.setSpan(new uy((boolean) r32), r32, t6, r32);
                }
                if (charSequence2.length() + t6 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new uy((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new uy((boolean) r32), t6, charSequence2.length() + t6, r32);
                int L = org.telegram.messenger.g0.L(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = r32;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                pzVar.Q = staticLayout;
                if (pzVar.m0) {
                    int i29 = pzVar.b.g ? 26 : z12 ? 1 : 0;
                    u5 u5Var = pzVar.P;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[z12 ? 1 : 0] = staticLayout;
                    pzVar.P = y5.update(i29, pzVar, u5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                pzVar.U = staticLayout2;
                if (pzVar.m0) {
                    int i30 = pzVar.b.g ? 26 : z12 ? 1 : 0;
                    u5 u5Var2 = pzVar.T;
                    z16 = true;
                    Layout[] layoutArr2 = new Layout[1];
                    layoutArr2[z12 ? 1 : 0] = staticLayout2;
                    pzVar.T = y5.update(i30, pzVar, u5Var2, layoutArr2);
                } else {
                    z16 = true;
                }
                pzVar.V = z16;
                pzVar.W = z20;
                pzVar.b0 = t6 == 0 ? 0.0f : -pzVar.U.getPrimaryHorizontal(t6);
                pzVar.d0 = pzVar.c0;
                pzVar.S = null;
                y5.release(pzVar, pzVar.R);
            } else {
                z12 = r32;
                CharSequence charSequence4 = pzVar.b.b;
                int L2 = org.telegram.messenger.g0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                pzVar.Q = staticLayout3;
                if (pzVar.m0) {
                    int i31 = pzVar.b.g ? 26 : z12 ? 1 : 0;
                    u5 u5Var3 = pzVar.P;
                    Layout[] layoutArr3 = new Layout[1];
                    layoutArr3[z12 ? 1 : 0] = staticLayout3;
                    pzVar.P = y5.update(i31, pzVar, u5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(pzVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                pzVar.S = staticLayout4;
                if (pzVar.m0) {
                    int i32 = pzVar.b.g ? 26 : z12 ? 1 : 0;
                    u5 u5Var4 = pzVar.R;
                    z15 = true;
                    Layout[] layoutArr4 = new Layout[1];
                    layoutArr4[z12 ? 1 : 0] = staticLayout4;
                    pzVar.R = y5.update(i32, pzVar, u5Var4, layoutArr4);
                } else {
                    z15 = true;
                }
                pzVar.U = null;
                y5.release(pzVar, pzVar.T);
                pzVar.V = z15;
                pzVar.b0 = 0.0f;
                pzVar.d0 = pzVar.c0;
            }
            z11 = true;
        }
        if (i28 == pzVar.i0 && pzVar.getMeasuredWidth() == pzVar.k0) {
            z13 = true;
        } else {
            z13 = true;
            pzVar.a0 = true;
            pzVar.j0 = pzVar.i0;
            z11 = true;
        }
        if (z11) {
            pzVar.y = 0.0f;
            pzVar.x = z13;
            rz rzVar2 = this.F;
            rzVar2.G.invalidate();
            rzVar2.invalidate();
        }
        if (i19 == 0 && i20 == 0 && !z11) {
            v(f1Var);
            return z12;
        }
        this.r.add(new v4.j(f1Var, i13, i14, i11, i12));
        return z13;
    }

    @Override // v4.h1
    public final void x(v4.f1 f1Var) {
        f1Var.a.setTranslationX(0.0f);
        View view = f1Var.a;
        if (view instanceof pz) {
            ((pz) view).a();
        }
    }
}
