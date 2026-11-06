package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.l00;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public class h6 extends FrameLayout implements ls {
    public static Typeface j0;
    public static Typeface k0;
    public final c6 D;
    public final FrameLayout E;
    public View.OnClickListener F;
    public final org.telegram.ui.ActionBar.m2 G;
    public final l00 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.Components.w5 K;
    public final View L;
    public final LinearLayout M;
    public final f6 N;
    public final f6 O;
    public final FrameLayout.LayoutParams P;
    public String Q;
    public int R;
    public final int S;
    public float T;
    public float U;
    public int V;
    public n0 W;
    public boolean a;
    public float[] a0;
    public float b;
    public int b0;
    public final Matrix c;
    public int c0;
    public final Matrix d;
    public float d0;
    public final Matrix e;
    public float e0;
    public final RectF f;
    public final org.telegram.ui.Components.w5 f0;
    public final org.telegram.ui.Components.w5 g0;
    public float h;
    public p6 h0;
    public boolean i0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    public h6(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static void a(final h6 h6Var, final Canvas canvas, float f10) {
        float width = h6Var.getFrontFace().getWidth();
        float height = h6Var.getFrontFace().getHeight();
        float f11 = width / 1640.0f;
        Paint paint = h6Var.I;
        Context context = h6Var.getContext();
        if (j0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                j0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                j0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(j0);
        paint.setTextSize(47.345238f * f11);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = h6Var.a0;
        paint.setColor(i0.a.f((fArr == null || fArr.length < 18) ? 0.0f : fArr[8], q7.b(0, fArr), q7.b(1, fArr)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f12 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f13 = f11 * 27.333332f;
        final String[] split = f(h6Var.Q).split("\\n");
        canvas.save();
        canvas.translate(f11 * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        h6Var.c(f10, new e3(h6Var, 2), new Runnable() { // from class: org.telegram.ui.Wallet.e6
            @Override // java.lang.Runnable
            public final void run() {
                h6 h6Var2 = h6.this;
                h6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f14 = f13;
                float f15 = f12;
                Paint paint2 = h6Var2.I;
                Canvas canvas2 = canvas;
                canvas2.drawText(str, 0.0f, (-f14) + f15, paint2);
                if (strArr.length > 1) {
                    canvas2.drawText(strArr[1], 0.0f, f14 + f15, paint2);
                }
            }
        });
        canvas.restore();
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 > 0 && i7 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i7));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder e(long j3) {
        return n0.q(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(n0.p(j3, false))), 0.8f);
    }

    public static String f(String str) {
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        int i7 = 0;
        while (i7 < split.length) {
            if (i7 > 0) {
                sb2.append(i7 == length ? '\n' : ' ');
            }
            sb2.append(split[i7]);
            i7++;
        }
        return sb2.toString();
    }

    public static void k(View view, Matrix matrix) {
        if (!(view.getParent() instanceof View)) {
            matrix.reset();
            return;
        }
        k((View) view.getParent(), matrix);
        matrix.preTranslate(view.getLeft() - r0.getScrollX(), view.getTop() - r0.getScrollY());
        matrix.preConcat(view.getMatrix());
    }

    public final float b() {
        float c10 = this.N.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.S) - 48.0f) * this.E.getWidth()) / 336.0f) - this.P.leftMargin) - org.telegram.messenger.g0.L(8.0f));
        if (c10 > 0.0f) {
            return Math.min(1.0f, max / c10);
        }
        return 1.0f;
    }

    public final void c(float f10, e3 e3Var, Runnable runnable) {
        e3Var.a(f10 > 0.0f ? org.telegram.messenger.g0.L(5.0f) : 0.0f, org.telegram.messenger.g0.L(1.0f), Color.argb((int) (89.0f * f10), 0, 0, 0));
        runnable.run();
        if (f10 <= 0.0f) {
            return;
        }
        e3Var.a(org.telegram.messenger.g0.N(1.5f), 0.0f, Color.argb((int) (f10 * 140.0f), 0, 0, 0));
        this.i0 = true;
        runnable.run();
        this.i0 = false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.a4) {
            Object obj = objArr[0];
            n0 n0Var = this.W;
            if (obj == n0Var) {
                l(n0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        View view2 = (View) ((View) this.E.getParent()).getParent();
        c6 c6Var = this.D;
        Matrix matrix2 = (Matrix) c6Var.e.d;
        Matrix matrix3 = this.w;
        matrix3.set(matrix2);
        v41 v41Var = c6Var.f;
        matrix3.preTranslate(v41Var.getLeft(), v41Var.getTop());
        k(view2, matrix);
        matrix.preConcat(matrix3);
        matrix.preTranslate(this.E.getLeft() - r0.getScrollX(), this.E.getTop() - r0.getScrollY());
        matrix.preConcat(this.E.getMatrix());
        Matrix matrix4 = this.x;
        k(view, matrix4);
        Matrix matrix5 = this.y;
        if (!matrix4.invert(matrix5)) {
            return false;
        }
        matrix.postConcat(matrix5);
        return true;
    }

    public View getBalanceAnchor() {
        return this.L;
    }

    public LinearLayout getBalanceLayout() {
        return this.M;
    }

    public org.telegram.ui.Components.j6 getBalanceView() {
        return this.N;
    }

    public TextView getCardHolderView() {
        return this.G;
    }

    public float getCardRotationX() {
        return this.D.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.D.getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.E;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.E.indexOfChild(this.G);
        int indexOfChild2 = this.E.indexOfChild(this.M);
        return indexOfChild < 0 ? indexOfChild2 < 0 ? this.E.getChildCount() : indexOfChild2 : indexOfChild2 < 0 ? indexOfChild : Math.min(indexOfChild, indexOfChild2);
    }

    public ArrayList<RectF> getStickerObstacles() {
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.E.getWidth() / 336.0f;
        float b10 = b();
        float c10 = this.N.getDrawable().c() * b10;
        float c11 = this.O.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.P;
        float f10 = layoutParams.leftMargin;
        float f11 = layoutParams.topMargin;
        float bottom = ((r3.getBottom() + r3.getTop()) / 2.0f) + f11;
        float height = (r3.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f10, bottom - height, c10 + f10, bottom + height));
        org.telegram.ui.ActionBar.m2 m2Var = this.G;
        arrayList.add(new RectF(m2Var.getLeft(), m2Var.getTop(), m2Var.getLeft() + Math.min(m2Var.getWidth(), m2Var.getPaint().measureText(m2Var.getText().toString())), m2Var.getBottom()));
        arrayList.add(new RectF(this.E.getWidth() - (34.0f * width), 18.0f * width, this.E.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.E.getWidth(), this.E.getHeight());
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        arrayList.add(rectF);
        arrayList.add(new RectF(f10, r5.getTop() + f11, c11 + f10, f11 + r5.getBottom()));
        arrayList.add(this.a ? new RectF(this.f) : new RectF());
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.a0;
    }

    public org.telegram.ui.Components.j6 getUsdBalanceView() {
        return this.O;
    }

    public final void h(Path path, float f10, float f11) {
        path.rewind();
        float f12 = 336 - this.S;
        path.addRoundRect(((f12 - 48.0f) * f10) / 336.0f, 0.36097562f * f11, (f12 * f10) / 336.0f, 0.5365854f * f11, (f10 * 8.0f) / 336.0f, 0.03902439f * f11, Path.Direction.CW);
    }

    public final void i(float f10, float f11) {
        if (this.T == f10 && this.U == f11) {
            return;
        }
        this.T = f10;
        if (f10 == 0.0f) {
            this.n = false;
        }
        this.U = f11;
        this.N.invalidate();
        this.O.invalidate();
    }

    public final void j(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new g6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j3));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) hd.M0(2131749515, null));
        spannableStringBuilder.setSpan(new li.w5(this, 5), length, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        long round = Math.round((j3 / 1.0E9d) * ((org.telegram.messenger.i0) qp.s1(i7).x7.l.b).a * 100.0d);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        boolean z9 = round % 100 == 0;
        i10.getClass();
        this.O.setText(org.telegram.messenger.r1.g("USD", 2, round, z9));
    }

    public final void l(n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        int i7 = n0Var.a;
        setCardHolder(t10.p(p10.i(i7).f()).toUpperCase());
        if (n0Var.t() != null) {
            setCardNumber(d(n0Var.t().toUpperCase()));
        }
        if (n0Var.G()) {
            j(i7, n0Var.v());
        }
    }

    public final void m() {
        int i7;
        float f10;
        if (this.h0 == null) {
            return;
        }
        float[] fArr = this.a0;
        char c10 = '\t';
        int i10 = 2;
        boolean z9 = true;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr == null) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        }
        float[] fArr2 = q7.c;
        float[] fArr3 = new float[42];
        int i11 = 0;
        while (true) {
            char c11 = c10;
            if (i11 >= i10) {
                break;
            }
            int i12 = i11 * 4;
            int i13 = i12 + 10;
            boolean z10 = z9;
            if (fArr.length < 18 || fArr[i13] < f11) {
                f10 = f11;
                System.arraycopy(q7.b, 0, fArr3, i11 * 12, 12);
                fArr3[i11 + 28] = 1.0f;
                System.arraycopy(fArr2, 0, fArr3, (i11 * 3) + 30, 3);
            } else {
                fArr3[i11 + 28] = 0.6f;
                int i14 = (int) fArr[i13];
                int i15 = i11 * 3;
                int i16 = i15 + 30;
                float f13 = ((i14 >> 16) & qs.e4) / 255.0f;
                f10 = f11;
                float f14 = ((i14 >> 8) & qs.e4) / 255.0f;
                float f15 = (i14 & qs.e4) / 255.0f;
                float min = Math.min(f13, Math.min(f14, f15));
                float max = Math.max(f13, Math.max(f14, f15)) - min;
                float f16 = (fArr2[i10] * 0.0722f) + (fArr2[z10 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                fArr3[i16] = com.google.android.recaptcha.internal.a.z(max > f10 ? (f13 - min) / max : f10, f16, min2, f16);
                fArr3[i15 + 31] = com.google.android.recaptcha.internal.a.z(max > f10 ? (f14 - min) / max : f10, f16, min2, f16);
                fArr3[i15 + 32] = com.google.android.recaptcha.internal.a.z(max > f10 ? (f15 - min) / max : f10, f16, min2, f16);
                int i17 = (int) fArr[i13];
                int i18 = (int) fArr[i12 + 11];
                int n10 = q7.n(-16216082, i17, i18);
                int n11 = q7.n(-15291399, i17, i18);
                for (int i19 = 0; i19 < 3; i19++) {
                    int i20 = 16 - (i19 * 8);
                    float h = q7.h(n10, i20) * 0.73f;
                    float h7 = q7.h(n11, i20) * 0.73f;
                    int i21 = i11 * 12;
                    fArr3[i21 + i19] = (h + h7) / 2.0f;
                    fArr3[i21 + 3 + i19] = h;
                    fArr3[i21 + 6 + i19] = h7;
                    fArr3[i21 + 9 + i19] = h;
                }
            }
            i11++;
            c10 = c11;
            z9 = z10 ? 1 : 0;
            f11 = f10;
            i10 = 2;
        }
        boolean z11 = z9;
        float f17 = f11;
        int i22 = 0;
        for (int i23 = i10; i22 < i23; i23 = 2) {
            int i24 = i22 * 4;
            int f18 = (fArr.length < 18 || fArr[i24 + 10] < f17) ? i0.a.f(0.2f, -16611884, -16748084) : i0.a.f(0.2f, ((int) fArr[i24 + 12]) | (-16777216), ((int) fArr[i24 + 11]) | (-16777216));
            int i25 = i22 * 3;
            fArr3[i25 + 36] = ((f18 >> 16) & qs.e4) / 255.0f;
            fArr3[i25 + 37] = ((f18 >> 8) & qs.e4) / 255.0f;
            fArr3[i25 + 38] = (f18 & qs.e4) / 255.0f;
            i22++;
        }
        System.arraycopy(fArr, 6, fArr3, 24, 4);
        float[] fArr4 = this.a0;
        float max2 = (fArr4 == null || fArr4.length <= 8) ? 1.0f : Math.max(f17, Math.min(1.0f, fArr4[8]));
        p6 p6Var = this.h0;
        float T1 = org.telegram.messenger.g0.T1(fArr3[30], fArr3[33], max2);
        float T12 = org.telegram.messenger.g0.T1(fArr3[31], fArr3[34], max2);
        float T13 = org.telegram.messenger.g0.T1(fArr3[32], fArr3[35], max2);
        p6Var.getClass();
        float[] fArr5 = p6.j;
        float[] a10 = p6.a(T1, T12, T13);
        float f19 = a10[0];
        float f20 = a10[z11 ? 1 : 0];
        float f21 = a10[2];
        if (f19 == p6Var.e && f20 == p6Var.f && f21 == p6Var.g) {
            return;
        }
        p6Var.e = f19;
        p6Var.f = f20;
        p6Var.g = f21;
        if (p6.k == null) {
            p6.k = p6.a(0.0f, 0.47809f, 1.0f);
        }
        float[] fArr6 = p6.k;
        double sqrt = (fArr6[0] - fArr6[z11 ? 1 : 0]) / Math.sqrt(2.0d);
        double sqrt2 = ((fArr6[0] + fArr6[z11 ? 1 : 0]) - (fArr6[2] * 2.0f)) / Math.sqrt(6.0d);
        double sqrt3 = (f19 - f20) / Math.sqrt(2.0d);
        double sqrt4 = ((f19 + f20) - (f21 * 2.0f)) / Math.sqrt(6.0d);
        double IEEEremainder = Math.IEEEremainder(Math.atan2(sqrt4, sqrt3) - Math.atan2(sqrt2, sqrt), 6.283185307179586d);
        double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(sqrt3, sqrt4) / Math.hypot(sqrt, sqrt2));
        double cos = Math.cos(IEEEremainder);
        double sin = Math.sin(IEEEremainder) / Math.sqrt(3.0d);
        double d = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
        double d2 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
        float[] fArr7 = new float[20];
        int i26 = 0;
        while (true) {
            i7 = 3;
            if (i26 >= 3) {
                break;
            }
            int i27 = 0;
            while (i27 < i7) {
                double d10 = i26 == i27 ? d : d2;
                if (i27 == (i26 + 1) % 3) {
                    d10 -= min3 * sin;
                } else if (i27 == (i26 + 2) % 3) {
                    d10 = (min3 * sin) + d10;
                }
                float f22 = f12;
                double d11 = d2;
                fArr7[(i26 * 5) + i27] = (float) d10;
                i27++;
                f12 = f22;
                d2 = d11;
                i7 = 3;
            }
            i26++;
        }
        float f23 = f12;
        int i28 = 0;
        while (i28 < i7) {
            float f24 = (fArr5[2] * fArr7[i28 + 10]) + (fArr5[z11 ? 1 : 0] * fArr7[i28 + 5]) + (fArr5[0] * fArr7[i28]);
            for (int i29 = 0; i29 < 3; i29++) {
                int i30 = (i29 * 5) + i28;
                fArr7[i30] = (fArr5[i28] - f24) + fArr7[i30];
            }
            i28++;
            i7 = 3;
        }
        fArr7[18] = f23;
        p6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
        p6Var.invalidateSelf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(org.telegram.messenger.g0.L(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.W != null) {
            qs.f(this.V).c(this, qs.a4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.W != null) {
            qs.f(this.V).n(this, qs.a4);
        }
    }

    public void setAdditionalTilt(float f10) {
        this.r = f10;
        this.D.setAdditionalTilt(f10);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public void setCardIcon(int i7) {
        this.R = i7;
        this.D.setCardIcon(i7);
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.Q)) {
            return;
        }
        this.Q = str;
        this.D.setHasCardNumber(true);
        this.H.invalidate();
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
        this.D.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z9) {
        this.a = z9;
        this.N.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f10) {
        this.D.setScaleX(f10);
        this.D.setScaleY(f10);
    }

    public void setStickerStyle(float[] fArr) {
        this.a0 = fArr;
        m();
        this.N.invalidate();
        this.H.invalidate();
        this.D.setStickerStyle(fArr);
        this.O.setTextColor(i0.a.f(fArr[8], q7.p(-7868417, 0, fArr), q7.p(-7868417, 3, fArr)));
        this.G.invalidate();
    }

    public void setUseGyroscope(float f10) {
        this.s = f10;
        this.D.setUseGyroscope(f10);
    }

    public h6(Context context, int i7, int i10) {
        super(context);
        this.b = 1.0f;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        new RectF();
        this.f = new RectF();
        this.s = 1.0f;
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Matrix();
        this.I = new Paint(qs.X2);
        final int i11 = 0;
        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Wallet.d6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.H.invalidate();
                        break;
                    case 1:
                        h6 h6Var = this.b;
                        h6Var.N.invalidate();
                        h6Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        };
        xq xqVar = xq.h;
        this.K = new org.telegram.ui.Components.w5(runnable, 240L, xqVar, 0);
        this.V = p10.s0;
        final int i12 = 1;
        this.f0 = new org.telegram.ui.Components.w5(new Runnable(this) { // from class: org.telegram.ui.Wallet.d6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.H.invalidate();
                        break;
                    case 1:
                        h6 h6Var = this.b;
                        h6Var.N.invalidate();
                        h6Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        }, 240L, xqVar, 0);
        final int i13 = 2;
        this.g0 = new org.telegram.ui.Components.w5(new Runnable(this) { // from class: org.telegram.ui.Wallet.d6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.H.invalidate();
                        break;
                    case 1:
                        h6 h6Var = this.b;
                        h6Var.N.invalidate();
                        h6Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        }, 240L, xqVar, 0);
        this.R = i7;
        this.S = i10;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        c6 c6Var = new c6(getContext(), this.R, i10);
        this.D = c6Var;
        this.E = c6Var.getFrontFace();
        float[] fArr = this.a0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.D.setOnClickListener(this.F);
        addView(this.D, 0, c8.ha.c(-2.0f, -1));
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(9, context, this);
        this.G = m2Var;
        if (k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                k0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        m2Var.setTypeface(k0);
        m2Var.setTextColor(-1);
        m2Var.setTextSize(1, 13.0f);
        m2Var.setEllipsize(TextUtils.TruncateAt.END);
        m2Var.setMaxLines(1);
        m2Var.setSingleLine();
        this.E.addView(m2Var, c8.ha.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        l00 l00Var = new l00(11, context, this);
        this.H = l00Var;
        this.E.addView(l00Var, c8.ha.c(-1.0f, -1));
        View view = new View(context);
        this.L = view;
        this.E.addView(view, c8.ha.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.P = d;
        this.E.addView(linearLayout, d);
        f6 f6Var = new f6(this, context, 0);
        this.N = f6Var;
        f6Var.getDrawable().M = org.telegram.messenger.g0.L(4096.0f);
        f6Var.c.m(0.35f, 320L, 3.5f, xqVar);
        f6Var.setScaleProperty(0.6f);
        f6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        f6Var.setTextSize(org.telegram.messenger.g0.L(23.0f));
        f6Var.setTextColor(-1);
        f6Var.setIgnoreRTL(true);
        linearLayout.addView(f6Var, c8.ha.o(-1, 28));
        f6 f6Var2 = new f6(this, context, 1);
        this.O = f6Var2;
        f6Var2.c.m(0.35f, 320L, 3.5f, xqVar);
        f6Var2.setScaleProperty(0.6f);
        f6Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        f6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        f6Var2.setTextColor(-7868417);
        f6Var2.setLayoutDirection(0);
        f6Var2.setTextDirection(3);
        f6Var2.setGravity(19);
        f6Var2.setIgnoreRTL(true);
        linearLayout.addView(f6Var2, c8.ha.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
