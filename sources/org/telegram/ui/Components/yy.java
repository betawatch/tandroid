package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yy extends v4.k {
    public final /* synthetic */ ez F;

    public yy(ez ezVar) {
        this.F = ezVar;
    }

    @Override // v4.k
    public final void C(v4.d1 d1Var, v4.j jVar) {
        super.C(d1Var, jVar);
        View view = d1Var.a;
        if (view instanceof cz) {
            cz czVar = (cz) view;
            if (czVar.x) {
                ValueAnimator valueAnimator = czVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    czVar.a.removeAllUpdateListeners();
                    czVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xy(czVar, 0));
                ofFloat.addListener(new y5(czVar, 26));
                czVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // v4.k, v4.l0
    public final void f(v4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof cz) {
            ((cz) view).a();
        }
    }

    @Override // v4.k, v4.l0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new d6(this, 23));
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
    @Override // v4.k, v4.f1
    public final boolean r(v4.d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ?? r32;
        boolean z9;
        int i16;
        String str;
        int i17;
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
        int i18;
        View view = d1Var.a;
        if (!(view instanceof cz)) {
            return super.r(d1Var, r0Var, i7, i10, i11, i12);
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(d1Var);
        int i19 = i11 - translationX;
        int i20 = i12 - translationY;
        if (i19 != 0) {
            view.setTranslationX(-i19);
        }
        if (i20 != 0) {
            view.setTranslationY(-i20);
        }
        cz czVar = (cz) view;
        ez ezVar = czVar.m0;
        TextPaint textPaint = ezVar.b;
        TextPaint textPaint2 = ezVar.c;
        int i21 = czVar.b.d;
        int i22 = czVar.I;
        if (i21 != i22) {
            czVar.H = true;
            czVar.J = i22;
            czVar.f0 = czVar.d0;
            czVar.g0 = czVar.e0;
            if (i22 <= 0 || i21 <= 0) {
                i13 = translationX;
                i14 = translationY;
                z16 = true;
                z17 = false;
            } else {
                String valueOf = String.valueOf(i22);
                String valueOf2 = String.valueOf(czVar.b.d);
                if (valueOf.length() == valueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                    int i23 = 0;
                    while (i23 < valueOf.length()) {
                        int i24 = translationX;
                        if (valueOf.charAt(i23) == valueOf2.charAt(i23)) {
                            boolean z18 = false;
                            i18 = translationY;
                            int i25 = i23 + 1;
                            spannableStringBuilder.setSpan(new hy(z18), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new hy(z18), i23, i25, 0);
                        } else {
                            i18 = translationY;
                            spannableStringBuilder3.setSpan(new hy(false), i23, i23 + 1, 0);
                        }
                        i23++;
                        translationY = i18;
                        translationX = i24;
                    }
                    i13 = translationX;
                    i14 = translationY;
                    z17 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z16 = true;
                    czVar.L = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    czVar.M = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    czVar.K = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z16 = true;
                    z17 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    czVar.L = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    czVar.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.m6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z9 = z16;
            i15 = z16;
            r32 = z17;
        } else {
            i13 = translationX;
            i14 = translationY;
            i15 = 1;
            r32 = 0;
            z9 = false;
        }
        int i26 = czVar.b.d;
        if (i26 > 0) {
            Object[] objArr = new Object[i15];
            objArr[r32] = Integer.valueOf(i26);
            str = String.format("%d", objArr);
            i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
        } else {
            i16 = r32;
            str = null;
        }
        int i27 = czVar.b.c;
        if (i16 != 0) {
            i17 = org.telegram.messenger.g0.L((str != null ? 1.0f : ezVar.x) * 6.0f) + i16;
        } else {
            i17 = r32;
        }
        int i28 = i17 + i27;
        float measuredWidth = (czVar.getMeasuredWidth() - i28) / 2;
        float f10 = czVar.E;
        if (measuredWidth != f10) {
            czVar.G = i15;
            czVar.F = f10;
            z10 = i15;
        } else {
            z10 = z9;
        }
        CharSequence charSequence3 = czVar.N;
        if (charSequence3 == null || czVar.b.b.equals(charSequence3)) {
            z11 = r32;
        } else {
            if (czVar.N.length() > czVar.b.b.length()) {
                charSequence = czVar.N;
                charSequence2 = czVar.b.b;
                z13 = i15;
            } else {
                charSequence = czVar.b.b;
                charSequence2 = czVar.N;
                z13 = r32;
            }
            int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
            if (t6 >= 0) {
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t6 != 0) {
                    spannableStringBuilder5.setSpan(new hy((boolean) r32), r32, t6, r32);
                }
                if (charSequence2.length() + t6 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new hy((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new hy((boolean) r32), t6, charSequence2.length() + t6, r32);
                int L = org.telegram.messenger.g0.L(400.0f);
                boolean z19 = z13;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z11 = r32;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                czVar.P = staticLayout;
                if (czVar.l0) {
                    int i29 = czVar.b.g ? 26 : z11 ? 1 : 0;
                    m5 m5Var = czVar.O;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[z11 ? 1 : 0] = staticLayout;
                    czVar.O = q5.update(i29, czVar, m5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                czVar.T = staticLayout2;
                if (czVar.l0) {
                    int i30 = czVar.b.g ? 26 : z11 ? 1 : 0;
                    m5 m5Var2 = czVar.S;
                    z15 = true;
                    Layout[] layoutArr2 = new Layout[1];
                    layoutArr2[z11 ? 1 : 0] = staticLayout2;
                    czVar.S = q5.update(i30, czVar, m5Var2, layoutArr2);
                } else {
                    z15 = true;
                }
                czVar.U = z15;
                czVar.V = z19;
                czVar.a0 = t6 == 0 ? 0.0f : -czVar.T.getPrimaryHorizontal(t6);
                czVar.c0 = czVar.b0;
                czVar.R = null;
                q5.release(czVar, czVar.Q);
            } else {
                z11 = r32;
                CharSequence charSequence4 = czVar.b.b;
                int L2 = org.telegram.messenger.g0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                czVar.P = staticLayout3;
                if (czVar.l0) {
                    int i31 = czVar.b.g ? 26 : z11 ? 1 : 0;
                    m5 m5Var3 = czVar.O;
                    Layout[] layoutArr3 = new Layout[1];
                    layoutArr3[z11 ? 1 : 0] = staticLayout3;
                    czVar.O = q5.update(i31, czVar, m5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(czVar.N, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                czVar.R = staticLayout4;
                if (czVar.l0) {
                    int i32 = czVar.b.g ? 26 : z11 ? 1 : 0;
                    m5 m5Var4 = czVar.Q;
                    z14 = true;
                    Layout[] layoutArr4 = new Layout[1];
                    layoutArr4[z11 ? 1 : 0] = staticLayout4;
                    czVar.Q = q5.update(i32, czVar, m5Var4, layoutArr4);
                } else {
                    z14 = true;
                }
                czVar.T = null;
                q5.release(czVar, czVar.S);
                czVar.U = z14;
                czVar.a0 = 0.0f;
                czVar.c0 = czVar.b0;
            }
            z10 = true;
        }
        if (i28 == czVar.h0 && czVar.getMeasuredWidth() == czVar.j0) {
            z12 = true;
        } else {
            z12 = true;
            czVar.W = true;
            czVar.i0 = czVar.h0;
            z10 = true;
        }
        if (z10) {
            czVar.y = 0.0f;
            czVar.x = z12;
            ez ezVar2 = this.F;
            ezVar2.F.invalidate();
            ezVar2.invalidate();
        }
        if (i19 == 0 && i20 == 0 && !z10) {
            v(d1Var);
            return z11;
        }
        this.r.add(new v4.j(d1Var, i13, i14, i11, i12));
        return z12;
    }

    @Override // v4.f1
    public final void x(v4.d1 d1Var) {
        d1Var.a.setTranslationX(0.0f);
        View view = d1Var.a;
        if (view instanceof cz) {
            ((cz) view).a();
        }
    }
}
