// default package

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ag4 extends sc3 {
    public final /* synthetic */ ig4 F;

    public ag4(ig4 ig4Var) {
        this.F = ig4Var;
    }

    @Override // sc3
    public final void C(u69 u69Var, rc3 rc3Var) {
        super.C(u69Var, rc3Var);
        View view = u69Var.a;
        if (view instanceof gg4) {
            gg4 gg4Var = (gg4) view;
            if (gg4Var.x) {
                ValueAnimator valueAnimator = gg4Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    gg4Var.a.removeAllUpdateListeners();
                    gg4Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new zf4(gg4Var, (byte) 0));
                ofFloat.addListener(new kh2(gg4Var, (byte) 23));
                gg4Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // sc3, d69
    public final void f(u69 u69Var) {
        super.f(u69Var);
        View view = u69Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof gg4) {
            ((gg4) view).a();
        }
    }

    @Override // sc3, d69
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new et1(this, (byte) 29));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033c  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    @Override // sc3, jka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(u69 u69Var, az8 az8Var, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r4;
        boolean z;
        int i9;
        String str;
        int i10;
        boolean z2;
        float f;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i11;
        int i12;
        View view = u69Var.a;
        if (!(view instanceof gg4)) {
            return super.r(u69Var, az8Var, i, i2, i3, i4);
        }
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        R(u69Var);
        int i13 = i3 - translationX;
        int i14 = i4 - translationY;
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        gg4 gg4Var = (gg4) view;
        ig4 ig4Var = gg4Var.n0;
        TextPaint textPaint = ig4Var.b;
        TextPaint textPaint2 = ig4Var.c;
        int i15 = gg4Var.b.d;
        int i16 = gg4Var.J;
        if (i15 != i16) {
            gg4Var.I = true;
            gg4Var.K = i16;
            gg4Var.g0 = gg4Var.e0;
            gg4Var.h0 = gg4Var.f0;
            if (i16 <= 0 || i15 <= 0) {
                i5 = translationX;
                i6 = translationY;
                i7 = i13;
                z4 = true;
                z5 = false;
            } else {
                String valueOf = String.valueOf(i16);
                String valueOf2 = String.valueOf(gg4Var.b.d);
                if (valueOf.length() == valueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                    int i17 = 0;
                    while (i17 < valueOf.length()) {
                        int i18 = translationX;
                        if (valueOf.charAt(i17) == valueOf2.charAt(i17)) {
                            int i19 = i17 + 1;
                            i11 = translationY;
                            spannableStringBuilder.setSpan(new vy2((byte) 1), i17, i19, 0);
                            i12 = i13;
                            spannableStringBuilder2.setSpan(new vy2((byte) 1), i17, i19, 0);
                        } else {
                            i11 = translationY;
                            i12 = i13;
                            spannableStringBuilder3.setSpan(new vy2((byte) 1), i17, i17 + 1, 0);
                        }
                        i17++;
                        i13 = i12;
                        translationY = i11;
                        translationX = i18;
                    }
                    i5 = translationX;
                    i6 = translationY;
                    i7 = i13;
                    z5 = false;
                    int ceil = (int) Math.ceil(cmb.K0.measureText(valueOf));
                    TextPaint textPaint3 = ig4Var.c;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    gg4Var.M = new StaticLayout(spannableStringBuilder, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    gg4Var.N = new StaticLayout(spannableStringBuilder3, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    gg4Var.L = new StaticLayout(spannableStringBuilder2, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    z4 = true;
                } else {
                    i5 = translationX;
                    i6 = translationY;
                    i7 = i13;
                    z5 = false;
                    int ceil2 = (int) Math.ceil(cmb.K0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    z4 = true;
                    gg4Var.M = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    gg4Var.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(cmb.K0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z = z4;
            i8 = z4;
            r4 = z5;
        } else {
            i5 = translationX;
            i6 = translationY;
            i7 = i13;
            i8 = 1;
            r4 = 0;
            z = false;
        }
        int i20 = gg4Var.b.d;
        if (i20 > 0) {
            Object[] objArr = new Object[i8];
            objArr[r4] = Integer.valueOf(i20);
            str = String.format("%d", objArr);
            i9 = Math.max(gm.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + gm.L(10.0f);
        } else {
            i9 = r4;
            str = null;
        }
        int i21 = gg4Var.b.c;
        if (i9 != 0) {
            i10 = gm.L((str != null ? 1.0f : ig4Var.x) * 6.0f) + i9;
        } else {
            i10 = r4;
        }
        int i22 = i10 + i21;
        float measuredWidth = (gg4Var.getMeasuredWidth() - i22) / 2;
        float f2 = gg4Var.F;
        if (measuredWidth != f2) {
            gg4Var.H = i8;
            gg4Var.G = f2;
            z2 = i8;
        } else {
            z2 = z;
        }
        CharSequence charSequence3 = gg4Var.O;
        if (charSequence3 != null && !gg4Var.b.b.equals(charSequence3)) {
            if (gg4Var.O.length() > gg4Var.b.b.length()) {
                charSequence = gg4Var.O;
                charSequence2 = gg4Var.b.b;
                z3 = i8;
            } else {
                charSequence = gg4Var.b.b;
                charSequence2 = gg4Var.O;
                z3 = r4;
            }
            int t = gm.t(charSequence, charSequence2);
            if (t < 0) {
                CharSequence charSequence4 = gg4Var.b.b;
                int L = gm.L(400.0f);
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                f = 0.0f;
                StaticLayout staticLayout = new StaticLayout(charSequence4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                gg4Var.Q = staticLayout;
                if (gg4Var.m0) {
                    int i23 = gg4Var.b.g ? 26 : r4;
                    cn cnVar = gg4Var.P;
                    Layout[] layoutArr = new Layout[i8];
                    layoutArr[r4] = staticLayout;
                    gg4Var.P = gn.update(i23, gg4Var, cnVar, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(gg4Var.O, textPaint, gm.L(400.0f), alignment3, 1.0f, 0.0f, false);
                gg4Var.S = staticLayout2;
                if (gg4Var.m0) {
                    int i24 = gg4Var.b.g ? 26 : r4;
                    cn cnVar2 = gg4Var.R;
                    Layout[] layoutArr2 = new Layout[i8];
                    layoutArr2[r4] = staticLayout2;
                    gg4Var.R = gn.update(i24, gg4Var, cnVar2, layoutArr2);
                }
                gg4Var.U = null;
                gn.release(gg4Var, gg4Var.T);
                gg4Var.V = i8;
                gg4Var.b0 = 0.0f;
                gg4Var.d0 = gg4Var.c0;
                z2 = i8;
                if (i22 == gg4Var.i0 || gg4Var.getMeasuredWidth() != gg4Var.k0) {
                    gg4Var.a0 = i8;
                    gg4Var.j0 = gg4Var.i0;
                    z2 = i8;
                }
                if (z2) {
                    gg4Var.y = f;
                    gg4Var.x = i8;
                    ig4 ig4Var2 = this.F;
                    ig4Var2.G.invalidate();
                    ig4Var2.invalidate();
                }
                if (i7 != 0 && i14 == 0 && !z2) {
                    v(u69Var);
                    return r4;
                }
                boolean z6 = i8;
                this.r.add(new rc3(u69Var, i5, i6, i3, i4));
                return z6;
            }
            TextPaint textPaint4 = ig4Var.b;
            CharSequence m = gw3.m(charSequence, textPaint4.getFontMetricsInt(), r4, null, r4);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m);
            if (t != 0) {
                spannableStringBuilder5.setSpan(new vy2(i8), r4, t, r4);
            }
            if (charSequence2.length() + t != charSequence.length()) {
                spannableStringBuilder5.setSpan(new vy2(i8), charSequence2.length() + t, charSequence.length(), r4);
            }
            spannableStringBuilder4.setSpan(new vy2(i8), t, charSequence2.length() + t, r4);
            int L2 = gm.L(400.0f);
            Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout3 = new StaticLayout(spannableStringBuilder4, textPaint4, L2, alignment4, 1.0f, 0.0f, false);
            gg4Var.Q = staticLayout3;
            if (gg4Var.m0) {
                int i25 = gg4Var.b.g ? 26 : r4;
                cn cnVar3 = gg4Var.P;
                Layout[] layoutArr3 = new Layout[i8];
                layoutArr3[r4] = staticLayout3;
                gg4Var.P = gn.update(i25, gg4Var, cnVar3, layoutArr3);
            }
            StaticLayout staticLayout4 = new StaticLayout(spannableStringBuilder5, textPaint4, gm.L(400.0f), alignment4, 1.0f, 0.0f, false);
            gg4Var.U = staticLayout4;
            if (gg4Var.m0) {
                int i26 = gg4Var.b.g ? 26 : r4;
                cn cnVar4 = gg4Var.T;
                Layout[] layoutArr4 = new Layout[i8];
                layoutArr4[r4] = staticLayout4;
                gg4Var.T = gn.update(i26, gg4Var, cnVar4, layoutArr4);
            }
            gg4Var.V = i8;
            gg4Var.W = z3;
            gg4Var.b0 = t == 0 ? 0.0f : -gg4Var.U.getPrimaryHorizontal(t);
            gg4Var.d0 = gg4Var.c0;
            gg4Var.S = null;
            gn.release(gg4Var, gg4Var.R);
            z2 = i8;
        }
        f = 0.0f;
        if (i22 == gg4Var.i0) {
        }
        gg4Var.a0 = i8;
        gg4Var.j0 = gg4Var.i0;
        z2 = i8;
        if (z2) {
        }
        if (i7 != 0) {
        }
        boolean z62 = i8;
        this.r.add(new rc3(u69Var, i5, i6, i3, i4));
        return z62;
    }

    @Override // jka
    public final void x(u69 u69Var) {
        u69Var.a.setTranslationX(0.0f);
        View view = u69Var.a;
        if (view instanceof gg4) {
            ((gg4) view).a();
        }
    }
}
