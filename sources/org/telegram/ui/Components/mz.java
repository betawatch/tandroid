package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mz extends s4.j {
    public final /* synthetic */ tz F;

    public mz(tz tzVar) {
        this.F = tzVar;
    }

    @Override // s4.j
    public final void C(s4.c1 c1Var, s4.i iVar) {
        super.C(c1Var, iVar);
        View view = c1Var.a;
        if (view instanceof rz) {
            rz rzVar = (rz) view;
            if (rzVar.x) {
                ValueAnimator valueAnimator = rzVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    rzVar.a.removeAllUpdateListeners();
                    rzVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lz(rzVar, 0));
                ofFloat.addListener(new w5(rzVar, 26));
                rzVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // s4.j, s4.l0
    public final void f(s4.c1 c1Var) {
        super.f(c1Var);
        View view = c1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof rz) {
            ((rz) view).a();
        }
    }

    @Override // s4.j, s4.l0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new a6(this, 23));
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
    public final boolean r(s4.c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
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
        View view = c1Var.a;
        if (!(view instanceof rz)) {
            return super.r(c1Var, gVar, i10, i11, i12, i13);
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
        rz rzVar = (rz) view;
        tz tzVar = rzVar.m0;
        TextPaint textPaint = tzVar.b;
        TextPaint textPaint2 = tzVar.c;
        int i22 = rzVar.b.d;
        int i23 = rzVar.I;
        if (i22 != i23) {
            rzVar.H = true;
            rzVar.J = i23;
            rzVar.f0 = rzVar.d0;
            rzVar.g0 = rzVar.e0;
            if (i23 <= 0 || i22 <= 0) {
                i14 = translationX;
                i15 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i23);
                String valueOf2 = String.valueOf(rzVar.b.d);
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
                            spannableStringBuilder.setSpan(new wy(z19), i24, i26, 0);
                            spannableStringBuilder2.setSpan(new wy(z19), i24, i26, 0);
                        } else {
                            i19 = translationY;
                            spannableStringBuilder3.setSpan(new wy(false), i24, i24 + 1, 0);
                        }
                        i24++;
                        translationY = i19;
                        translationX = i25;
                    }
                    i14 = translationX;
                    i15 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.t6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    rzVar.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    rzVar.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    rzVar.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i14 = translationX;
                    i15 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.t6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    rzVar.L = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    rzVar.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.t6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
        int i27 = rzVar.b.d;
        if (i27 > 0) {
            Object[] objArr = new Object[i16];
            objArr[r32] = Integer.valueOf(i27);
            str = String.format("%d", objArr);
            i17 = Math.max(org.telegram.messenger.i0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.i0.L(10.0f);
        } else {
            i17 = r32;
            str = null;
        }
        int i28 = rzVar.b.c;
        if (i17 != 0) {
            i18 = org.telegram.messenger.i0.L((str != null ? 1.0f : tzVar.x) * 6.0f) + i17;
        } else {
            i18 = r32;
        }
        int i29 = i18 + i28;
        float measuredWidth = (rzVar.getMeasuredWidth() - i29) / 2;
        float f7 = rzVar.E;
        if (measuredWidth != f7) {
            rzVar.G = i16;
            rzVar.F = f7;
            z11 = i16;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = rzVar.N;
        if (charSequence3 == null || rzVar.b.b.equals(charSequence3)) {
            z12 = r32;
        } else {
            if (rzVar.N.length() > rzVar.b.b.length()) {
                charSequence = rzVar.N;
                charSequence2 = rzVar.b.b;
                z14 = i16;
            } else {
                charSequence = rzVar.b.b;
                charSequence2 = rzVar.N;
                z14 = r32;
            }
            int t10 = org.telegram.messenger.i0.t(charSequence, charSequence2);
            if (t10 >= 0) {
                CharSequence m10 = org.telegram.messenger.k6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t10 != 0) {
                    spannableStringBuilder5.setSpan(new wy((boolean) r32), r32, t10, r32);
                }
                if (charSequence2.length() + t10 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new wy((boolean) r32), charSequence2.length() + t10, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new wy((boolean) r32), t10, charSequence2.length() + t10, r32);
                int L = org.telegram.messenger.i0.L(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = r32;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                rzVar.P = staticLayout;
                if (rzVar.l0) {
                    int i30 = rzVar.b.g ? 26 : z12 ? 1 : 0;
                    k5 k5Var = rzVar.O;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[z12 ? 1 : 0] = staticLayout;
                    rzVar.O = o5.update(i30, rzVar, k5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.i0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                rzVar.T = staticLayout2;
                if (rzVar.l0) {
                    int i31 = rzVar.b.g ? 26 : z12 ? 1 : 0;
                    k5 k5Var2 = rzVar.S;
                    z16 = true;
                    Layout[] layoutArr2 = new Layout[1];
                    layoutArr2[z12 ? 1 : 0] = staticLayout2;
                    rzVar.S = o5.update(i31, rzVar, k5Var2, layoutArr2);
                } else {
                    z16 = true;
                }
                rzVar.U = z16;
                rzVar.V = z20;
                rzVar.a0 = t10 == 0 ? 0.0f : -rzVar.T.getPrimaryHorizontal(t10);
                rzVar.c0 = rzVar.b0;
                rzVar.R = null;
                o5.release(rzVar, rzVar.Q);
            } else {
                z12 = r32;
                CharSequence charSequence4 = rzVar.b.b;
                int L2 = org.telegram.messenger.i0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                rzVar.P = staticLayout3;
                if (rzVar.l0) {
                    int i32 = rzVar.b.g ? 26 : z12 ? 1 : 0;
                    k5 k5Var3 = rzVar.O;
                    Layout[] layoutArr3 = new Layout[1];
                    layoutArr3[z12 ? 1 : 0] = staticLayout3;
                    rzVar.O = o5.update(i32, rzVar, k5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(rzVar.N, textPaint, org.telegram.messenger.i0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                rzVar.R = staticLayout4;
                if (rzVar.l0) {
                    int i33 = rzVar.b.g ? 26 : z12 ? 1 : 0;
                    k5 k5Var4 = rzVar.Q;
                    z15 = true;
                    Layout[] layoutArr4 = new Layout[1];
                    layoutArr4[z12 ? 1 : 0] = staticLayout4;
                    rzVar.Q = o5.update(i33, rzVar, k5Var4, layoutArr4);
                } else {
                    z15 = true;
                }
                rzVar.T = null;
                o5.release(rzVar, rzVar.S);
                rzVar.U = z15;
                rzVar.a0 = 0.0f;
                rzVar.c0 = rzVar.b0;
            }
            z11 = true;
        }
        if (i29 == rzVar.h0 && rzVar.getMeasuredWidth() == rzVar.j0) {
            z13 = true;
        } else {
            z13 = true;
            rzVar.W = true;
            rzVar.i0 = rzVar.h0;
            z11 = true;
        }
        if (z11) {
            rzVar.y = 0.0f;
            rzVar.x = z13;
            tz tzVar2 = this.F;
            tzVar2.F.invalidate();
            tzVar2.invalidate();
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
        if (view instanceof rz) {
            ((rz) view).a();
        }
    }
}
