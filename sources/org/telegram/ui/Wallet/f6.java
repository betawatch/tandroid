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
import b8.mf;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class f6 extends FrameLayout implements cs {
    public static Typeface k0;
    public static Typeface l0;
    public final a6 E;
    public final FrameLayout F;
    public View.OnClickListener G;
    public final org.telegram.ui.ActionBar.k2 H;
    public final org.telegram.ui.Components.voip.r0 I;
    public final Paint J;
    public float K;
    public final org.telegram.ui.Components.u5 L;
    public final View M;
    public final LinearLayout N;
    public final d6 O;
    public final d6 P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final int T;
    public float U;
    public float V;
    public int W;
    public boolean a;
    public k0 a0;
    public float b;
    public float[] b0;
    public final Matrix c;
    public int c0;
    public final Matrix d;
    public int d0;
    public final Matrix e;
    public float e0;
    public final RectF f;
    public float f0;
    public final org.telegram.ui.Components.u5 g0;
    public float h;
    public final org.telegram.ui.Components.u5 h0;
    public n6 i0;
    public boolean j0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    public f6(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static void a(final f6 f6Var, final Canvas canvas, float f10) {
        float width = f6Var.getFrontFace().getWidth();
        float height = f6Var.getFrontFace().getHeight();
        float f11 = width / 1640.0f;
        Paint paint = f6Var.J;
        Context context = f6Var.getContext();
        if (k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                k0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(k0);
        paint.setTextSize(47.345238f * f11);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = f6Var.b0;
        paint.setColor(i0.a.f((fArr == null || fArr.length < 18) ? 0.0f : fArr[8], p7.b(0, fArr), p7.b(1, fArr)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f12 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f13 = f11 * 27.333332f;
        final String[] split = f(f6Var.R).split("\\n");
        canvas.save();
        canvas.translate(f11 * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        f6Var.c(f10, new c3(f6Var, 2), new Runnable() { // from class: org.telegram.ui.Wallet.c6
            @Override // java.lang.Runnable
            public final void run() {
                f6 f6Var2 = f6.this;
                f6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f14 = f13;
                float f15 = f12;
                Paint paint2 = f6Var2.J;
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
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 > 0 && i3 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i3));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder e(long j10) {
        return k0.q(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(k0.p(j10, false))), 0.8f);
    }

    public static String f(String str) {
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        int i3 = 0;
        while (i3 < split.length) {
            if (i3 > 0) {
                sb2.append(i3 == length ? '\n' : ' ');
            }
            sb2.append(split[i3]);
            i3++;
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
        float c2 = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.F.getWidth()) / 336.0f) - this.Q.leftMargin) - org.telegram.messenger.g0.L(8.0f));
        if (c2 > 0.0f) {
            return Math.min(1.0f, max / c2);
        }
        return 1.0f;
    }

    public final void c(float f10, c3 c3Var, Runnable runnable) {
        c3Var.a(f10 > 0.0f ? org.telegram.messenger.g0.L(5.0f) : 0.0f, org.telegram.messenger.g0.L(1.0f), Color.argb((int) (89.0f * f10), 0, 0, 0));
        runnable.run();
        if (f10 <= 0.0f) {
            return;
        }
        c3Var.a(org.telegram.messenger.g0.N(1.5f), 0.0f, Color.argb((int) (f10 * 140.0f), 0, 0, 0));
        this.j0 = true;
        runnable.run();
        this.j0 = false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.a4) {
            Object obj = objArr[0];
            k0 k0Var = this.a0;
            if (obj == k0Var) {
                l(k0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        View view2 = (View) ((View) this.F.getParent()).getParent();
        a6 a6Var = this.E;
        Matrix matrix2 = (Matrix) a6Var.e.d;
        Matrix matrix3 = this.w;
        matrix3.set(matrix2);
        ei.k1 k1Var = a6Var.f;
        matrix3.preTranslate(k1Var.getLeft(), k1Var.getTop());
        k(view2, matrix);
        matrix.preConcat(matrix3);
        matrix.preTranslate(this.F.getLeft() - r0.getScrollX(), this.F.getTop() - r0.getScrollY());
        matrix.preConcat(this.F.getMatrix());
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
        return this.M;
    }

    public LinearLayout getBalanceLayout() {
        return this.N;
    }

    public org.telegram.ui.Components.h6 getBalanceView() {
        return this.O;
    }

    public TextView getCardHolderView() {
        return this.H;
    }

    public float getCardRotationX() {
        return this.E.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.E.getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.F;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.F.indexOfChild(this.H);
        int indexOfChild2 = this.F.indexOfChild(this.N);
        return indexOfChild < 0 ? indexOfChild2 < 0 ? this.F.getChildCount() : indexOfChild2 : indexOfChild2 < 0 ? indexOfChild : Math.min(indexOfChild, indexOfChild2);
    }

    public ArrayList<RectF> getStickerObstacles() {
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.F.getWidth() / 336.0f;
        float b10 = b();
        float c2 = this.O.getDrawable().c() * b10;
        float c10 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f10 = layoutParams.leftMargin;
        float f11 = layoutParams.topMargin;
        float bottom = ((r3.getBottom() + r3.getTop()) / 2.0f) + f11;
        float height = (r3.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f10, bottom - height, c2 + f10, bottom + height));
        org.telegram.ui.ActionBar.k2 k2Var = this.H;
        arrayList.add(new RectF(k2Var.getLeft(), k2Var.getTop(), k2Var.getLeft() + Math.min(k2Var.getWidth(), k2Var.getPaint().measureText(k2Var.getText().toString())), k2Var.getBottom()));
        arrayList.add(new RectF(this.F.getWidth() - (34.0f * width), 18.0f * width, this.F.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.F.getWidth(), this.F.getHeight());
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        arrayList.add(rectF);
        arrayList.add(new RectF(f10, r5.getTop() + f11, c10 + f10, f11 + r5.getBottom()));
        arrayList.add(this.a ? new RectF(this.f) : new RectF());
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.b0;
    }

    public org.telegram.ui.Components.h6 getUsdBalanceView() {
        return this.P;
    }

    public final void h(Path path, float f10, float f11) {
        path.rewind();
        float f12 = 336 - this.T;
        path.addRoundRect(((f12 - 48.0f) * f10) / 336.0f, 0.36097562f * f11, (f12 * f10) / 336.0f, 0.5365854f * f11, (f10 * 8.0f) / 336.0f, 0.03902439f * f11, Path.Direction.CW);
    }

    public final void i(float f10, float f11) {
        if (this.U == f10 && this.V == f11) {
            return;
        }
        this.U = f10;
        if (f10 == 0.0f) {
            this.n = false;
        }
        this.V = f11;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i3, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new e6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
        spannableStringBuilder.setSpan(new mi.x5(this, 5), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round((j10 / 1.0E9d) * ((org.telegram.messenger.i0) hp.s1(i3).x7.l.b).a * 100.0d);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        boolean z10 = round % 100 == 0;
        i10.getClass();
        this.P.setText(org.telegram.messenger.r1.g("USD", 2, round, z10));
    }

    public final void l(k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        int i3 = k0Var.a;
        setCardHolder(l10.p(h10.i(i3).f()).toUpperCase());
        if (k0Var.t() != null) {
            setCardNumber(d(k0Var.t().toUpperCase()));
        }
        if (k0Var.G()) {
            j(i3, k0Var.v());
        }
    }

    public final void m() {
        int i3;
        float f10;
        if (this.i0 == null) {
            return;
        }
        float[] fArr = this.b0;
        char c2 = '\t';
        int i10 = 2;
        boolean z10 = true;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr == null) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        }
        float[] fArr2 = p7.c;
        float[] fArr3 = new float[42];
        int i11 = 0;
        while (true) {
            char c10 = c2;
            if (i11 >= i10) {
                break;
            }
            int i12 = i11 * 4;
            int i13 = i12 + 10;
            boolean z11 = z10;
            if (fArr.length < 18 || fArr[i13] < f11) {
                f10 = f11;
                System.arraycopy(p7.b, 0, fArr3, i11 * 12, 12);
                fArr3[i11 + 28] = 1.0f;
                System.arraycopy(fArr2, 0, fArr3, (i11 * 3) + 30, 3);
            } else {
                fArr3[i11 + 28] = 0.6f;
                int i14 = (int) fArr[i13];
                int i15 = i11 * 3;
                int i16 = i15 + 30;
                float f13 = ((i14 >> 16) & hs.e4) / 255.0f;
                f10 = f11;
                float f14 = ((i14 >> 8) & hs.e4) / 255.0f;
                float f15 = (i14 & hs.e4) / 255.0f;
                float min = Math.min(f13, Math.min(f14, f15));
                float max = Math.max(f13, Math.max(f14, f15)) - min;
                float f16 = (fArr2[i10] * 0.0722f) + (fArr2[z11 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                fArr3[i16] = com.google.android.recaptcha.internal.a.y(max > f10 ? (f13 - min) / max : f10, f16, min2, f16);
                fArr3[i15 + 31] = com.google.android.recaptcha.internal.a.y(max > f10 ? (f14 - min) / max : f10, f16, min2, f16);
                fArr3[i15 + 32] = com.google.android.recaptcha.internal.a.y(max > f10 ? (f15 - min) / max : f10, f16, min2, f16);
                int i17 = (int) fArr[i13];
                int i18 = (int) fArr[i12 + 11];
                int n4 = p7.n(-16216082, i17, i18);
                int n10 = p7.n(-15291399, i17, i18);
                for (int i19 = 0; i19 < 3; i19++) {
                    int i20 = 16 - (i19 * 8);
                    float h = p7.h(n4, i20) * 0.73f;
                    float h7 = p7.h(n10, i20) * 0.73f;
                    int i21 = i11 * 12;
                    fArr3[i21 + i19] = (h + h7) / 2.0f;
                    fArr3[i21 + 3 + i19] = h;
                    fArr3[i21 + 6 + i19] = h7;
                    fArr3[i21 + 9 + i19] = h;
                }
            }
            i11++;
            c2 = c10;
            z10 = z11 ? 1 : 0;
            f11 = f10;
            i10 = 2;
        }
        boolean z12 = z10;
        float f17 = f11;
        int i22 = 0;
        for (int i23 = i10; i22 < i23; i23 = 2) {
            int i24 = i22 * 4;
            int f18 = (fArr.length < 18 || fArr[i24 + 10] < f17) ? i0.a.f(0.2f, -16611884, -16748084) : i0.a.f(0.2f, ((int) fArr[i24 + 12]) | (-16777216), ((int) fArr[i24 + 11]) | (-16777216));
            int i25 = i22 * 3;
            fArr3[i25 + 36] = ((f18 >> 16) & hs.e4) / 255.0f;
            fArr3[i25 + 37] = ((f18 >> 8) & hs.e4) / 255.0f;
            fArr3[i25 + 38] = (f18 & hs.e4) / 255.0f;
            i22++;
        }
        System.arraycopy(fArr, 6, fArr3, 24, 4);
        float[] fArr4 = this.b0;
        float max2 = (fArr4 == null || fArr4.length <= 8) ? 1.0f : Math.max(f17, Math.min(1.0f, fArr4[8]));
        n6 n6Var = this.i0;
        float T1 = org.telegram.messenger.g0.T1(fArr3[30], fArr3[33], max2);
        float T12 = org.telegram.messenger.g0.T1(fArr3[31], fArr3[34], max2);
        float T13 = org.telegram.messenger.g0.T1(fArr3[32], fArr3[35], max2);
        n6Var.getClass();
        float[] fArr5 = n6.j;
        float[] a10 = n6.a(T1, T12, T13);
        float f19 = a10[0];
        float f20 = a10[z12 ? 1 : 0];
        float f21 = a10[2];
        if (f19 == n6Var.e && f20 == n6Var.f && f21 == n6Var.g) {
            return;
        }
        n6Var.e = f19;
        n6Var.f = f20;
        n6Var.g = f21;
        if (n6.k == null) {
            n6.k = n6.a(0.0f, 0.47809f, 1.0f);
        }
        float[] fArr6 = n6.k;
        double sqrt = (fArr6[0] - fArr6[z12 ? 1 : 0]) / Math.sqrt(2.0d);
        double sqrt2 = ((fArr6[0] + fArr6[z12 ? 1 : 0]) - (fArr6[2] * 2.0f)) / Math.sqrt(6.0d);
        double sqrt3 = (f19 - f20) / Math.sqrt(2.0d);
        double sqrt4 = ((f19 + f20) - (f21 * 2.0f)) / Math.sqrt(6.0d);
        double IEEEremainder = Math.IEEEremainder(Math.atan2(sqrt4, sqrt3) - Math.atan2(sqrt2, sqrt), 6.283185307179586d);
        double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(sqrt3, sqrt4) / Math.hypot(sqrt, sqrt2));
        double cos = Math.cos(IEEEremainder);
        double sin = Math.sin(IEEEremainder) / Math.sqrt(3.0d);
        double d = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
        double d10 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
        float[] fArr7 = new float[20];
        int i26 = 0;
        while (true) {
            i3 = 3;
            if (i26 >= 3) {
                break;
            }
            int i27 = 0;
            while (i27 < i3) {
                double d11 = i26 == i27 ? d : d10;
                if (i27 == (i26 + 1) % 3) {
                    d11 -= min3 * sin;
                } else if (i27 == (i26 + 2) % 3) {
                    d11 = (min3 * sin) + d11;
                }
                float f22 = f12;
                double d12 = d10;
                fArr7[(i26 * 5) + i27] = (float) d11;
                i27++;
                f12 = f22;
                d10 = d12;
                i3 = 3;
            }
            i26++;
        }
        float f23 = f12;
        int i28 = 0;
        while (i28 < i3) {
            float f24 = (fArr5[2] * fArr7[i28 + 10]) + (fArr5[z12 ? 1 : 0] * fArr7[i28 + 5]) + (fArr5[0] * fArr7[i28]);
            for (int i29 = 0; i29 < 3; i29++) {
                int i30 = (i29 * 5) + i28;
                fArr7[i30] = (fArr5[i28] - f24) + fArr7[i30];
            }
            i28++;
            i3 = 3;
        }
        fArr7[18] = f23;
        n6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
        n6Var.invalidateSelf();
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
        if (this.a0 != null) {
            hs.f(this.W).c(this, hs.a4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.a0 != null) {
            hs.f(this.W).n(this, hs.a4);
        }
    }

    public void setAdditionalTilt(float f10) {
        this.r = f10;
        this.E.setAdditionalTilt(f10);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i3) {
        this.S = i3;
        this.E.setCardIcon(i3);
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.R)) {
            return;
        }
        this.R = str;
        this.E.setHasCardNumber(true);
        this.I.invalidate();
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        this.E.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z10) {
        this.a = z10;
        this.O.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f10) {
        this.E.setScaleX(f10);
        this.E.setScaleY(f10);
    }

    public void setStickerStyle(float[] fArr) {
        this.b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.E.setStickerStyle(fArr);
        this.P.setTextColor(i0.a.f(fArr[8], p7.p(-7868417, 0, fArr), p7.p(-7868417, 3, fArr)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f10) {
        this.s = f10;
        this.E.setUseGyroscope(f10);
    }

    public f6(Context context, int i3, int i10) {
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
        this.J = new Paint(hs.X2);
        final int i11 = 0;
        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Wallet.b6
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.I.invalidate();
                        break;
                    case 1:
                        f6 f6Var = this.b;
                        f6Var.O.invalidate();
                        f6Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        };
        xq xqVar = xq.h;
        this.L = new org.telegram.ui.Components.u5(runnable, 240L, xqVar, 0);
        this.W = h10.t0;
        final int i12 = 1;
        this.g0 = new org.telegram.ui.Components.u5(new Runnable(this) { // from class: org.telegram.ui.Wallet.b6
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.I.invalidate();
                        break;
                    case 1:
                        f6 f6Var = this.b;
                        f6Var.O.invalidate();
                        f6Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        }, 240L, xqVar, 0);
        final int i13 = 2;
        this.h0 = new org.telegram.ui.Components.u5(new Runnable(this) { // from class: org.telegram.ui.Wallet.b6
            public final /* synthetic */ f6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.I.invalidate();
                        break;
                    case 1:
                        f6 f6Var = this.b;
                        f6Var.O.invalidate();
                        f6Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        }, 240L, xqVar, 0);
        this.S = i3;
        this.T = i10;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        a6 a6Var = new a6(getContext(), this.S, i10);
        this.E = a6Var;
        this.F = a6Var.getFrontFace();
        float[] fArr = this.b0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.E.setOnClickListener(this.G);
        addView(this.E, 0, mf.c(-2.0f, -1));
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(9, context, this);
        this.H = k2Var;
        if (l0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                l0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                l0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        k2Var.setTypeface(l0);
        k2Var.setTextColor(-1);
        k2Var.setTextSize(1, 13.0f);
        k2Var.setEllipsize(TextUtils.TruncateAt.END);
        k2Var.setMaxLines(1);
        k2Var.setSingleLine();
        this.F.addView(k2Var, mf.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(13, context, this);
        this.I = r0Var;
        this.F.addView(r0Var, mf.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.F.addView(view, mf.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = mf.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.F.addView(linearLayout, d);
        d6 d6Var = new d6(this, context, 0);
        this.O = d6Var;
        d6Var.getDrawable().M = org.telegram.messenger.g0.L(4096.0f);
        d6Var.c.m(0.35f, 320L, 3.5f, xqVar);
        d6Var.setScaleProperty(0.6f);
        d6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        d6Var.setTextSize(org.telegram.messenger.g0.L(23.0f));
        d6Var.setTextColor(-1);
        d6Var.setIgnoreRTL(true);
        linearLayout.addView(d6Var, mf.o(-1, 28));
        d6 d6Var2 = new d6(this, context, 1);
        this.P = d6Var2;
        d6Var2.c.m(0.35f, 320L, 3.5f, xqVar);
        d6Var2.setScaleProperty(0.6f);
        d6Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        d6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        d6Var2.setTextColor(-7868417);
        d6Var2.setLayoutDirection(0);
        d6Var2.setTextDirection(3);
        d6Var2.setGravity(19);
        d6Var2.setIgnoreRTL(true);
        linearLayout.addView(d6Var2, mf.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
