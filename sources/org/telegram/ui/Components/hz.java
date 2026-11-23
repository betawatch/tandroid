package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hz extends v4.l {
    public final /* synthetic */ oz F;

    public hz(oz ozVar) {
        this.F = ozVar;
    }

    @Override // v4.l
    public final void C(v4.f1 f1Var, v4.k kVar) {
        super.C(f1Var, kVar);
        View view = f1Var.a;
        if (view instanceof mz) {
            mz mzVar = (mz) view;
            if (mzVar.x) {
                ValueAnimator valueAnimator = mzVar.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mzVar.a.removeAllUpdateListeners();
                    mzVar.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gz(mzVar, 0));
                ofFloat.addListener(new x(mzVar, 27));
                mzVar.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // v4.l, v4.n0
    public final void f(v4.f1 f1Var) {
        super.f(f1Var);
        View view = f1Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof mz) {
            ((mz) view).a();
        }
    }

    @Override // v4.l, v4.n0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new w(this, 25));
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
    @Override // v4.l, v4.h1
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
        if (!(view instanceof mz)) {
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
        mz mzVar = (mz) view;
        oz ozVar = mzVar.n0;
        TextPaint textPaint = ozVar.b;
        TextPaint textPaint2 = ozVar.c;
        int i21 = mzVar.b.d;
        int i22 = mzVar.J;
        if (i21 != i22) {
            mzVar.I = true;
            mzVar.K = i22;
            mzVar.g0 = mzVar.e0;
            mzVar.h0 = mzVar.f0;
            if (i22 <= 0 || i21 <= 0) {
                i13 = translationX;
                i14 = translationY;
                z17 = true;
                z18 = false;
            } else {
                String valueOf = String.valueOf(i22);
                String valueOf2 = String.valueOf(mzVar.b.d);
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
                            spannableStringBuilder.setSpan(new ry(z19), i23, i25, 0);
                            spannableStringBuilder2.setSpan(new ry(z19), i23, i25, 0);
                        } else {
                            i18 = translationY;
                            spannableStringBuilder3.setSpan(new ry(false), i23, i23 + 1, 0);
                        }
                        i23++;
                        translationY = i18;
                        translationX = i24;
                    }
                    i13 = translationX;
                    i14 = translationY;
                    z18 = false;
                    int ceil = (int) Math.ceil(org.telegram.ui.ActionBar.n6.L0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z17 = true;
                    mzVar.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    mzVar.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    mzVar.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i13 = translationX;
                    i14 = translationY;
                    z17 = true;
                    z18 = false;
                    int ceil2 = (int) Math.ceil(org.telegram.ui.ActionBar.n6.L0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    mzVar.M = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    mzVar.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(org.telegram.ui.ActionBar.n6.L0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
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
        int i26 = mzVar.b.d;
        if (i26 > 0) {
            Object[] objArr = new Object[i15];
            objArr[r32] = Integer.valueOf(i26);
            str = String.format("%d", objArr);
            i16 = Math.max(org.telegram.messenger.g0.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + org.telegram.messenger.g0.L(10.0f);
        } else {
            i16 = r32;
            str = null;
        }
        int i27 = mzVar.b.c;
        if (i16 != 0) {
            i17 = org.telegram.messenger.g0.L((str != null ? 1.0f : ozVar.x) * 6.0f) + i16;
        } else {
            i17 = r32;
        }
        int i28 = i17 + i27;
        float measuredWidth = (mzVar.getMeasuredWidth() - i28) / 2;
        float f10 = mzVar.F;
        if (measuredWidth != f10) {
            mzVar.H = i15;
            mzVar.G = f10;
            z11 = i15;
        } else {
            z11 = z10;
        }
        CharSequence charSequence3 = mzVar.O;
        if (charSequence3 == null || mzVar.b.b.equals(charSequence3)) {
            z12 = r32;
        } else {
            if (mzVar.O.length() > mzVar.b.b.length()) {
                charSequence = mzVar.O;
                charSequence2 = mzVar.b.b;
                z14 = i15;
            } else {
                charSequence = mzVar.b.b;
                charSequence2 = mzVar.O;
                z14 = r32;
            }
            int t6 = org.telegram.messenger.g0.t(charSequence, charSequence2);
            if (t6 >= 0) {
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint.getFontMetricsInt(), r32, null, r32);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m10);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m10);
                if (t6 != 0) {
                    spannableStringBuilder5.setSpan(new ry((boolean) r32), r32, t6, r32);
                }
                if (charSequence2.length() + t6 != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new ry((boolean) r32), charSequence2.length() + t6, charSequence.length(), r32);
                }
                spannableStringBuilder4.setSpan(new ry((boolean) r32), t6, charSequence2.length() + t6, r32);
                int L = org.telegram.messenger.g0.L(400.0f);
                boolean z20 = z14;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z12 = r32;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                mzVar.Q = staticLayout;
                if (mzVar.m0) {
                    int i29 = mzVar.b.g ? 26 : z12 ? 1 : 0;
                    t5 t5Var = mzVar.P;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[z12 ? 1 : 0] = staticLayout;
                    mzVar.P = x5.update(i29, mzVar, t5Var, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, org.telegram.messenger.g0.L(400.0f), alignment3, 1.0f, 0.0f, false);
                mzVar.U = staticLayout2;
                if (mzVar.m0) {
                    int i30 = mzVar.b.g ? 26 : z12 ? 1 : 0;
                    t5 t5Var2 = mzVar.T;
                    z16 = true;
                    Layout[] layoutArr2 = new Layout[1];
                    layoutArr2[z12 ? 1 : 0] = staticLayout2;
                    mzVar.T = x5.update(i30, mzVar, t5Var2, layoutArr2);
                } else {
                    z16 = true;
                }
                mzVar.V = z16;
                mzVar.W = z20;
                mzVar.b0 = t6 == 0 ? 0.0f : -mzVar.U.getPrimaryHorizontal(t6);
                mzVar.d0 = mzVar.c0;
                mzVar.S = null;
                x5.release(mzVar, mzVar.R);
            } else {
                z12 = r32;
                CharSequence charSequence4 = mzVar.b.b;
                int L2 = org.telegram.messenger.g0.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                mzVar.Q = staticLayout3;
                if (mzVar.m0) {
                    int i31 = mzVar.b.g ? 26 : z12 ? 1 : 0;
                    t5 t5Var3 = mzVar.P;
                    Layout[] layoutArr3 = new Layout[1];
                    layoutArr3[z12 ? 1 : 0] = staticLayout3;
                    mzVar.P = x5.update(i31, mzVar, t5Var3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(mzVar.O, textPaint, org.telegram.messenger.g0.L(400.0f), alignment4, 1.0f, 0.0f, false);
                mzVar.S = staticLayout4;
                if (mzVar.m0) {
                    int i32 = mzVar.b.g ? 26 : z12 ? 1 : 0;
                    t5 t5Var4 = mzVar.R;
                    z15 = true;
                    Layout[] layoutArr4 = new Layout[1];
                    layoutArr4[z12 ? 1 : 0] = staticLayout4;
                    mzVar.R = x5.update(i32, mzVar, t5Var4, layoutArr4);
                } else {
                    z15 = true;
                }
                mzVar.U = null;
                x5.release(mzVar, mzVar.T);
                mzVar.V = z15;
                mzVar.b0 = 0.0f;
                mzVar.d0 = mzVar.c0;
            }
            z11 = true;
        }
        if (i28 == mzVar.i0 && mzVar.getMeasuredWidth() == mzVar.k0) {
            z13 = true;
        } else {
            z13 = true;
            mzVar.a0 = true;
            mzVar.j0 = mzVar.i0;
            z11 = true;
        }
        if (z11) {
            mzVar.y = 0.0f;
            mzVar.x = z13;
            oz ozVar2 = this.F;
            ozVar2.G.invalidate();
            ozVar2.invalidate();
        }
        if (i19 == 0 && i20 == 0 && !z11) {
            v(f1Var);
            return z12;
        }
        this.r.add(new v4.k(f1Var, i13, i14, i11, i12));
        return z13;
    }

    @Override // v4.h1
    public final void x(v4.f1 f1Var) {
        f1Var.a.setTranslationX(0.0f);
        View view = f1Var.a;
        if (view instanceof mz) {
            ((mz) view).a();
        }
    }
}
