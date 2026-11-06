package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                ofFloat.addListener(new z5(czVar, 26));
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
            ofFloat.addUpdateListener(new e6(this, 23));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x032a, code lost:
    
        if (r1.getMeasuredWidth() != r1.j0) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0335  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    @Override // v4.k, v4.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        float f10;
        boolean z12;
        boolean z13;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z14;
        boolean z15;
        boolean z16;
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
                z15 = true;
                z16 = false;
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
                            boolean z17 = false;
                            i18 = translationY;
                            int i25 = i23 + 1;
                            spannableStringBuilder.setSpan(new hy(z17), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new hy(z17), i23, i25, 0);
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
                    z16 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    TextPaint textPaint3 = ezVar.c;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    czVar.L = new StaticLayout(spannableStringBuilder, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    czVar.M = new StaticLayout(spannableStringBuilder3, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    czVar.K = new StaticLayout(spannableStringBuilder2, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    z15 = true;
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z16 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    z15 = true;
                    czVar.L = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    czVar.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z9 = z15;
            i15 = z15;
            r32 = z16;
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
        float f11 = czVar.E;
        if (measuredWidth != f11) {
            czVar.G = i15;
            czVar.F = f11;
            z10 = i15;
        } else {
            z10 = z9;
        }
        CharSequence charSequence3 = czVar.N;
        boolean z18 = z10;
        if (charSequence3 != null) {
            z18 = z10;
            if (!czVar.b.b.equals(charSequence3)) {
                if (czVar.N.length() > czVar.b.b.length()) {
                    charSequence = czVar.N;
                    charSequence2 = czVar.b.b;
                    z14 = i15;
                } else {
                    charSequence = czVar.b.b;
                    charSequence2 = czVar.N;
                    z14 = r32;
                }
                int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t6 < 0) {
                    CharSequence charSequence4 = czVar.b.b;
                    int L = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z11 = r32;
                    f10 = 0.0f;
                    StaticLayout staticLayout = new StaticLayout(charSequence4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    czVar.P = staticLayout;
                    if (czVar.l0) {
                        int i29 = czVar.b.g ? 26 : z11 ? 1 : 0;
                        n5 n5Var = czVar.O;
                        Layout[] layoutArr = new Layout[i15];
                        layoutArr[z11 ? 1 : 0] = staticLayout;
                        czVar.O = r5.update(i29, czVar, n5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(czVar.N, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    czVar.R = staticLayout2;
                    if (czVar.l0) {
                        int i30 = czVar.b.g ? 26 : z11 ? 1 : 0;
                        n5 n5Var2 = czVar.Q;
                        Layout[] layoutArr2 = new Layout[i15];
                        layoutArr2[z11 ? 1 : 0] = staticLayout2;
                        czVar.Q = r5.update(i30, czVar, n5Var2, layoutArr2);
                    }
                    czVar.T = null;
                    r5.release(czVar, czVar.S);
                    czVar.U = i15;
                    czVar.a0 = 0.0f;
                    czVar.c0 = czVar.b0;
                    z12 = i15;
                    if (i28 == czVar.h0) {
                        z13 = z12;
                    }
                    czVar.W = i15;
                    czVar.i0 = czVar.h0;
                    z13 = i15;
                    if (z13) {
                        czVar.y = f10;
                        czVar.x = i15;
                        ez ezVar2 = this.F;
                        ezVar2.F.invalidate();
                        ezVar2.invalidate();
                    }
                    if (i19 != 0 && i20 == 0 && !z13) {
                        v(d1Var);
                        return z11;
                    }
                    boolean z19 = i15;
                    this.r.add(new v4.j(d1Var, i13, i14, i11, i12));
                    return z19;
                }
                TextPaint textPaint4 = ezVar.b;
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint4.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t6 != 0) {
                    spannableStringBuilder5.setSpan(new hy((boolean) r32), r32, t6, r32);
                }
                if (charSequence2.length() + t6 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new hy((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new hy((boolean) r32), t6, charSequence2.length() + t6, r32);
                int L2 = org.telegram.messenger.g0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(spannableStringBuilder4, textPaint4, L2, alignment4, 1.0f, 0.0f, false);
                czVar.P = staticLayout3;
                if (czVar.l0) {
                    int i31 = czVar.b.g ? 26 : r32;
                    n5 n5Var3 = czVar.O;
                    Layout[] layoutArr3 = new Layout[i15];
                    layoutArr3[r32] = staticLayout3;
                    czVar.O = r5.update(i31, czVar, n5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(spannableStringBuilder5, textPaint4, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                czVar.T = staticLayout4;
                if (czVar.l0) {
                    int i32 = czVar.b.g ? 26 : r32;
                    n5 n5Var4 = czVar.S;
                    Layout[] layoutArr4 = new Layout[i15];
                    layoutArr4[r32] = staticLayout4;
                    czVar.S = r5.update(i32, czVar, n5Var4, layoutArr4);
                }
                czVar.U = i15;
                czVar.V = z14;
                czVar.a0 = t6 == 0 ? 0.0f : -czVar.T.getPrimaryHorizontal(t6);
                czVar.c0 = czVar.b0;
                czVar.R = null;
                r5.release(czVar, czVar.Q);
                z18 = i15;
            }
        }
        z11 = r32;
        f10 = 0.0f;
        z12 = z18;
        if (i28 == czVar.h0) {
        }
        czVar.W = i15;
        czVar.i0 = czVar.h0;
        z13 = i15;
        if (z13) {
        }
        if (i19 != 0) {
        }
        boolean z192 = i15;
        this.r.add(new v4.j(d1Var, i13, i14, i11, i12));
        return z192;
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
