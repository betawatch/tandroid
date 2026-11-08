package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class zy extends v4.k {
    public final /* synthetic */ fz F;

    public zy(fz fzVar) {
        this.F = fzVar;
    }

    @Override // v4.k
    public final void C(v4.d1 d1Var, v4.j jVar) {
        super.C(d1Var, jVar);
        View view = d1Var.a;
        if (view instanceof dz) {
            dz dzVar = (dz) view;
            if (dzVar.x) {
                ValueAnimator valueAnimator = dzVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    dzVar.a.removeAllUpdateListeners();
                    dzVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yy(dzVar, 0));
                ofFloat.addListener(new z5(dzVar, 26));
                dzVar.a = ofFloat;
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
        if (view instanceof dz) {
            ((dz) view).a();
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
        if (!(view instanceof dz)) {
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
        dz dzVar = (dz) view;
        fz fzVar = dzVar.m0;
        TextPaint textPaint = fzVar.b;
        TextPaint textPaint2 = fzVar.c;
        int i21 = dzVar.b.d;
        int i22 = dzVar.I;
        if (i21 != i22) {
            dzVar.H = true;
            dzVar.J = i22;
            dzVar.f0 = dzVar.d0;
            dzVar.g0 = dzVar.e0;
            if (i22 <= 0 || i21 <= 0) {
                i13 = translationX;
                i14 = translationY;
                z15 = true;
                z16 = false;
            } else {
                String valueOf = String.valueOf(i22);
                String valueOf2 = String.valueOf(dzVar.b.d);
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
                            spannableStringBuilder.setSpan(new iy(z17), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new iy(z17), i23, i25, 0);
                        } else {
                            i18 = translationY;
                            spannableStringBuilder3.setSpan(new iy(false), i23, i23 + 1, 0);
                        }
                        i23++;
                        translationY = i18;
                        translationX = i24;
                    }
                    i13 = translationX;
                    i14 = translationY;
                    z16 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    TextPaint textPaint3 = fzVar.c;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    dzVar.L = new StaticLayout(spannableStringBuilder, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    dzVar.M = new StaticLayout(spannableStringBuilder3, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    dzVar.K = new StaticLayout(spannableStringBuilder2, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    z15 = true;
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z16 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    z15 = true;
                    dzVar.L = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    dzVar.K = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
        int i26 = dzVar.b.d;
        if (i26 > 0) {
            Object[] objArr = new Object[i15];
            objArr[r32] = Integer.valueOf(i26);
            str = String.format("%d", objArr);
            i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
        } else {
            i16 = r32;
            str = null;
        }
        int i27 = dzVar.b.c;
        if (i16 != 0) {
            i17 = org.telegram.messenger.g0.L((str != null ? 1.0f : fzVar.x) * 6.0f) + i16;
        } else {
            i17 = r32;
        }
        int i28 = i17 + i27;
        float measuredWidth = (dzVar.getMeasuredWidth() - i28) / 2;
        float f11 = dzVar.E;
        if (measuredWidth != f11) {
            dzVar.G = i15;
            dzVar.F = f11;
            z10 = i15;
        } else {
            z10 = z9;
        }
        CharSequence charSequence3 = dzVar.N;
        boolean z18 = z10;
        if (charSequence3 != null) {
            z18 = z10;
            if (!dzVar.b.b.equals(charSequence3)) {
                if (dzVar.N.length() > dzVar.b.b.length()) {
                    charSequence = dzVar.N;
                    charSequence2 = dzVar.b.b;
                    z14 = i15;
                } else {
                    charSequence = dzVar.b.b;
                    charSequence2 = dzVar.N;
                    z14 = r32;
                }
                int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
                if (t6 < 0) {
                    CharSequence charSequence4 = dzVar.b.b;
                    int L = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    z11 = r32;
                    f10 = 0.0f;
                    StaticLayout staticLayout = new StaticLayout(charSequence4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                    dzVar.P = staticLayout;
                    if (dzVar.l0) {
                        int i29 = dzVar.b.g ? 26 : z11 ? 1 : 0;
                        n5 n5Var = dzVar.O;
                        Layout[] layoutArr = new Layout[i15];
                        layoutArr[z11 ? 1 : 0] = staticLayout;
                        dzVar.O = r5.update(i29, dzVar, n5Var, layoutArr);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(dzVar.N, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                    dzVar.R = staticLayout2;
                    if (dzVar.l0) {
                        int i30 = dzVar.b.g ? 26 : z11 ? 1 : 0;
                        n5 n5Var2 = dzVar.Q;
                        Layout[] layoutArr2 = new Layout[i15];
                        layoutArr2[z11 ? 1 : 0] = staticLayout2;
                        dzVar.Q = r5.update(i30, dzVar, n5Var2, layoutArr2);
                    }
                    dzVar.T = null;
                    r5.release(dzVar, dzVar.S);
                    dzVar.U = i15;
                    dzVar.a0 = 0.0f;
                    dzVar.c0 = dzVar.b0;
                    z12 = i15;
                    if (i28 == dzVar.h0) {
                        z13 = z12;
                    }
                    dzVar.W = i15;
                    dzVar.i0 = dzVar.h0;
                    z13 = i15;
                    if (z13) {
                        dzVar.y = f10;
                        dzVar.x = i15;
                        fz fzVar2 = this.F;
                        fzVar2.F.invalidate();
                        fzVar2.invalidate();
                    }
                    if (i19 != 0 && i20 == 0 && !z13) {
                        v(d1Var);
                        return z11;
                    }
                    boolean z19 = i15;
                    this.r.add(new v4.j(d1Var, i13, i14, i11, i12));
                    return z19;
                }
                TextPaint textPaint4 = fzVar.b;
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint4.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t6 != 0) {
                    spannableStringBuilder5.setSpan(new iy((boolean) r32), r32, t6, r32);
                }
                if (charSequence2.length() + t6 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new iy((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new iy((boolean) r32), t6, charSequence2.length() + t6, r32);
                int L2 = org.telegram.messenger.g0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(spannableStringBuilder4, textPaint4, L2, alignment4, 1.0f, 0.0f, false);
                dzVar.P = staticLayout3;
                if (dzVar.l0) {
                    int i31 = dzVar.b.g ? 26 : r32;
                    n5 n5Var3 = dzVar.O;
                    Layout[] layoutArr3 = new Layout[i15];
                    layoutArr3[r32] = staticLayout3;
                    dzVar.O = r5.update(i31, dzVar, n5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(spannableStringBuilder5, textPaint4, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                dzVar.T = staticLayout4;
                if (dzVar.l0) {
                    int i32 = dzVar.b.g ? 26 : r32;
                    n5 n5Var4 = dzVar.S;
                    Layout[] layoutArr4 = new Layout[i15];
                    layoutArr4[r32] = staticLayout4;
                    dzVar.S = r5.update(i32, dzVar, n5Var4, layoutArr4);
                }
                dzVar.U = i15;
                dzVar.V = z14;
                dzVar.a0 = t6 == 0 ? 0.0f : -dzVar.T.getPrimaryHorizontal(t6);
                dzVar.c0 = dzVar.b0;
                dzVar.R = null;
                r5.release(dzVar, dzVar.Q);
                z18 = i15;
            }
        }
        z11 = r32;
        f10 = 0.0f;
        z12 = z18;
        if (i28 == dzVar.h0) {
        }
        dzVar.W = i15;
        dzVar.i0 = dzVar.h0;
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
        if (view instanceof dz) {
            ((dz) view).a();
        }
    }
}
