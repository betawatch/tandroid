package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vy extends u4.k {
    public final /* synthetic */ bz F;

    public vy(bz bzVar) {
        this.F = bzVar;
    }

    @Override // u4.k
    public final void C(u4.d1 d1Var, u4.j jVar) {
        super.C(d1Var, jVar);
        View view = d1Var.a;
        if (view instanceof zy) {
            zy zyVar = (zy) view;
            if (zyVar.x) {
                ValueAnimator valueAnimator = zyVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    zyVar.a.removeAllUpdateListeners();
                    zyVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new uy(zyVar, 0));
                ofFloat.addListener(new x5(zyVar, 26));
                zyVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // u4.k, u4.m0
    public final void f(u4.d1 d1Var) {
        super.f(d1Var);
        View view = d1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof zy) {
            ((zy) view).a();
        }
    }

    @Override // u4.k, u4.m0
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
    @Override // u4.k, u4.f1
    public final boolean r(u4.d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
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
        View view = d1Var.a;
        if (!(view instanceof zy)) {
            return super.r(d1Var, t0Var, i3, i10, i11, i12);
        }
        int translationX = i3 + ((int) view.getTranslationX());
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
        zy zyVar = (zy) view;
        bz bzVar = zyVar.n0;
        TextPaint textPaint = bzVar.b;
        TextPaint textPaint2 = bzVar.c;
        int i21 = zyVar.b.d;
        int i22 = zyVar.J;
        if (i21 != i22) {
            zyVar.I = true;
            zyVar.K = i22;
            zyVar.g0 = zyVar.e0;
            zyVar.h0 = zyVar.f0;
            if (i22 <= 0 || i21 <= 0) {
                i13 = translationX;
                i14 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i22);
                String valueOf2 = String.valueOf(zyVar.b.d);
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
                            spannableStringBuilder.setSpan(new fy(z19), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new fy(z19), i23, i25, 0);
                        } else {
                            i18 = translationY;
                            spannableStringBuilder3.setSpan(new fy(false), i23, i23 + 1, 0);
                        }
                        i23++;
                        translationY = i18;
                        translationX = i24;
                    }
                    i13 = translationX;
                    i14 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    zyVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    zyVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    zyVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    zyVar.M = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    zyVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
        int i26 = zyVar.b.d;
        if (i26 > 0) {
            Object[] objArr = new Object[i15];
            objArr[r32] = Integer.valueOf(i26);
            str = String.format("%d", objArr);
            i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
        } else {
            i16 = r32;
            str = null;
        }
        int i27 = zyVar.b.c;
        if (i16 != 0) {
            i17 = org.telegram.messenger.g0.L((str != null ? 1.0f : bzVar.x) * 6.0f) + i16;
        } else {
            i17 = r32;
        }
        int i28 = i17 + i27;
        float measuredWidth = (zyVar.getMeasuredWidth() - i28) / 2;
        float f10 = zyVar.F;
        if (measuredWidth != f10) {
            zyVar.H = i15;
            zyVar.G = f10;
            z11 = i15;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = zyVar.O;
        if (charSequence3 == null || zyVar.b.b.equals(charSequence3)) {
            z12 = r32;
        } else {
            if (zyVar.O.length() > zyVar.b.b.length()) {
                charSequence = zyVar.O;
                charSequence2 = zyVar.b.b;
                z14 = i15;
            } else {
                charSequence = zyVar.b.b;
                charSequence2 = zyVar.O;
                z14 = r32;
            }
            int t10 = org.telegram.messenger.g0.t(charSequence, charSequence2);
            if (t10 >= 0) {
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t10 != 0) {
                    spannableStringBuilder5.setSpan(new fy((boolean) r32), r32, t10, r32);
                }
                if (charSequence2.length() + t10 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new fy((boolean) r32), charSequence2.length() + t10, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new fy((boolean) r32), t10, charSequence2.length() + t10, r32);
                int L = org.telegram.messenger.g0.L(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = r32;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                zyVar.Q = staticLayout;
                if (zyVar.m0) {
                    int i29 = zyVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var = zyVar.P;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[z12 ? 1 : 0] = staticLayout;
                    zyVar.P = p5.update(i29, zyVar, l5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                zyVar.U = staticLayout2;
                if (zyVar.m0) {
                    int i30 = zyVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var2 = zyVar.T;
                    z16 = true;
                    Layout[] layoutArr2 = new Layout[1];
                    layoutArr2[z12 ? 1 : 0] = staticLayout2;
                    zyVar.T = p5.update(i30, zyVar, l5Var2, layoutArr2);
                } else {
                    z16 = true;
                }
                zyVar.V = z16;
                zyVar.W = z20;
                zyVar.b0 = t10 == 0 ? 0.0f : -zyVar.U.getPrimaryHorizontal(t10);
                zyVar.d0 = zyVar.c0;
                zyVar.S = null;
                p5.release(zyVar, zyVar.R);
            } else {
                z12 = r32;
                CharSequence charSequence4 = zyVar.b.b;
                int L2 = org.telegram.messenger.g0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                zyVar.Q = staticLayout3;
                if (zyVar.m0) {
                    int i31 = zyVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var3 = zyVar.P;
                    Layout[] layoutArr3 = new Layout[1];
                    layoutArr3[z12 ? 1 : 0] = staticLayout3;
                    zyVar.P = p5.update(i31, zyVar, l5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(zyVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                zyVar.S = staticLayout4;
                if (zyVar.m0) {
                    int i32 = zyVar.b.g ? 26 : z12 ? 1 : 0;
                    l5 l5Var4 = zyVar.R;
                    z15 = true;
                    Layout[] layoutArr4 = new Layout[1];
                    layoutArr4[z12 ? 1 : 0] = staticLayout4;
                    zyVar.R = p5.update(i32, zyVar, l5Var4, layoutArr4);
                } else {
                    z15 = true;
                }
                zyVar.U = null;
                p5.release(zyVar, zyVar.T);
                zyVar.V = z15;
                zyVar.b0 = 0.0f;
                zyVar.d0 = zyVar.c0;
            }
            z11 = true;
        }
        if (i28 == zyVar.i0 && zyVar.getMeasuredWidth() == zyVar.k0) {
            z13 = true;
        } else {
            z13 = true;
            zyVar.a0 = true;
            zyVar.j0 = zyVar.i0;
            z11 = true;
        }
        if (z11) {
            zyVar.y = 0.0f;
            zyVar.x = z13;
            bz bzVar2 = this.F;
            bzVar2.G.invalidate();
            bzVar2.invalidate();
        }
        if (i19 == 0 && i20 == 0 && !z11) {
            v(d1Var);
            return z12;
        }
        this.r.add(new u4.j(d1Var, i13, i14, i11, i12));
        return z13;
    }

    @Override // u4.f1
    public final void x(u4.d1 d1Var) {
        d1Var.a.setTranslationX(0.0f);
        View view = d1Var.a;
        if (view instanceof zy) {
            ((zy) view).a();
        }
    }
}
