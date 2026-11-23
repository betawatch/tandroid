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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.x01;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public class x6 extends FrameLayout implements gs {
    public static Typeface k0;
    public static Typeface l0;
    public final s6 E;
    public final FrameLayout F;
    public View.OnClickListener G;
    public final org.telegram.ui.ActionBar.n2 H;
    public final uv I;
    public final Paint J;
    public float K;
    public final org.telegram.ui.Components.d6 L;
    public final View M;
    public final LinearLayout N;
    public final v6 O;
    public final v6 P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final int T;
    public float U;
    public float V;
    public int W;
    public boolean a;
    public u0 a0;
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
    public final org.telegram.ui.Components.d6 g0;
    public float h;
    public final org.telegram.ui.Components.d6 h0;
    public f7 i0;
    public boolean j0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    public x6(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static void a(final x6 x6Var, final Canvas canvas, float f10) {
        float width = x6Var.getFrontFace().getWidth();
        float height = x6Var.getFrontFace().getHeight();
        float f11 = width / 1640.0f;
        Paint paint = x6Var.J;
        Context context = x6Var.getContext();
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
        float[] fArr = x6Var.b0;
        paint.setColor(i0.a.f((fArr == null || fArr.length < 18) ? 0.0f : fArr[8], f8.b(0, fArr), f8.b(1, fArr)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f12 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f13 = f11 * 27.333332f;
        final String[] split = f(x6Var.R).split("\\n");
        canvas.save();
        canvas.translate(f11 * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        x6Var.c(f10, new h3(x6Var, 2), new Runnable() { // from class: org.telegram.ui.Wallet.u6
            @Override // java.lang.Runnable
            public final void run() {
                x6 x6Var2 = x6.this;
                x6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f14 = f13;
                float f15 = f12;
                Paint paint2 = x6Var2.J;
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
        return u0.v(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(u0.u(j3, false))), 0.8f);
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
        float c10 = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.F.getWidth()) / 336.0f) - this.Q.leftMargin) - org.telegram.messenger.g0.L(8.0f));
        if (c10 > 0.0f) {
            return Math.min(1.0f, max / c10);
        }
        return 1.0f;
    }

    public final void c(float f10, h3 h3Var, Runnable runnable) {
        h3Var.a(f10 > 0.0f ? org.telegram.messenger.g0.L(5.0f) : 0.0f, org.telegram.messenger.g0.L(1.0f), Color.argb((int) (89.0f * f10), 0, 0, 0));
        runnable.run();
        if (f10 <= 0.0f) {
            return;
        }
        h3Var.a(org.telegram.messenger.g0.N(1.5f), 0.0f, Color.argb((int) (f10 * 140.0f), 0, 0, 0));
        this.j0 = true;
        runnable.run();
        this.j0 = false;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.d4) {
            Object obj = objArr[0];
            u0 u0Var = this.a0;
            if (obj == u0Var) {
                l(u0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        View view2 = (View) ((View) this.F.getParent()).getParent();
        s6 s6Var = this.E;
        Matrix matrix2 = (Matrix) s6Var.e.d;
        Matrix matrix3 = this.w;
        matrix3.set(matrix2);
        x01 x01Var = s6Var.f;
        matrix3.preTranslate(x01Var.getLeft(), x01Var.getTop());
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

    public org.telegram.ui.Components.o6 getBalanceView() {
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
        float c10 = this.O.getDrawable().c() * b10;
        float c11 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f10 = layoutParams.leftMargin;
        float f11 = layoutParams.topMargin;
        float bottom = ((r3.getBottom() + r3.getTop()) / 2.0f) + f11;
        float height = (r3.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f10, bottom - height, c10 + f10, bottom + height));
        org.telegram.ui.ActionBar.n2 n2Var = this.H;
        arrayList.add(new RectF(n2Var.getLeft(), n2Var.getTop(), n2Var.getLeft() + Math.min(n2Var.getWidth(), n2Var.getPaint().measureText(n2Var.getText().toString())), n2Var.getBottom()));
        arrayList.add(new RectF(this.F.getWidth() - (34.0f * width), 18.0f * width, this.F.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.F.getWidth(), this.F.getHeight());
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        arrayList.add(rectF);
        arrayList.add(new RectF(f10, r5.getTop() + f11, c11 + f10, f11 + r5.getBottom()));
        arrayList.add(this.a ? new RectF(this.f) : new RectF());
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.b0;
    }

    public org.telegram.ui.Components.o6 getUsdBalanceView() {
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

    public final void j(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new w6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j3));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) hd.N0(2131749340, null));
        spannableStringBuilder.setSpan(new oi.w5(this, 5), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round((j3 / 1.0E9d) * ((org.telegram.messenger.i0) np.u1(i7).A7.l.b).a * 100.0d);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        boolean z10 = round % 100 == 0;
        i10.getClass();
        this.P.setText(org.telegram.messenger.r1.g("USD", 2, round, z10));
    }

    public final void l(u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        int i7 = u0Var.a;
        setCardHolder(p10.q(k10.i(i7).f()).toUpperCase());
        if (u0Var.y() != null) {
            setCardNumber(d(u0Var.y().toUpperCase()));
        }
        if (u0Var.N()) {
            j(i7, u0Var.A());
        }
    }

    public final void m() {
        int i7;
        float f10;
        if (this.i0 == null) {
            return;
        }
        float[] fArr = this.b0;
        char c10 = '\t';
        int i10 = 2;
        boolean z10 = true;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr == null) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        }
        float[] fArr2 = f8.c;
        float[] fArr3 = new float[42];
        int i11 = 0;
        while (true) {
            char c11 = c10;
            if (i11 >= i10) {
                break;
            }
            int i12 = i11 * 4;
            int i13 = i12 + 10;
            boolean z11 = z10;
            if (fArr.length < 18 || fArr[i13] < f11) {
                f10 = f11;
                System.arraycopy(f8.b, 0, fArr3, i11 * 12, 12);
                fArr3[i11 + 28] = 1.0f;
                System.arraycopy(fArr2, 0, fArr3, (i11 * 3) + 30, 3);
            } else {
                fArr3[i11 + 28] = 0.6f;
                int i14 = (int) fArr[i13];
                int i15 = i11 * 3;
                int i16 = i15 + 30;
                float f13 = ((i14 >> 16) & ls.e4) / 255.0f;
                f10 = f11;
                float f14 = ((i14 >> 8) & ls.e4) / 255.0f;
                float f15 = (i14 & ls.e4) / 255.0f;
                float min = Math.min(f13, Math.min(f14, f15));
                float max = Math.max(f13, Math.max(f14, f15)) - min;
                float f16 = (fArr2[i10] * 0.0722f) + (fArr2[z11 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                fArr3[i16] = com.google.android.gms.internal.vision.e2.z(max > f10 ? (f13 - min) / max : f10, f16, min2, f16);
                fArr3[i15 + 31] = com.google.android.gms.internal.vision.e2.z(max > f10 ? (f14 - min) / max : f10, f16, min2, f16);
                fArr3[i15 + 32] = com.google.android.gms.internal.vision.e2.z(max > f10 ? (f15 - min) / max : f10, f16, min2, f16);
                int i17 = (int) fArr[i13];
                int i18 = (int) fArr[i12 + 11];
                int n10 = f8.n(-16216082, i17, i18);
                int n11 = f8.n(-15291399, i17, i18);
                for (int i19 = 0; i19 < 3; i19++) {
                    int i20 = 16 - (i19 * 8);
                    float h = f8.h(n10, i20) * 0.73f;
                    float h7 = f8.h(n11, i20) * 0.73f;
                    int i21 = i11 * 12;
                    fArr3[i21 + i19] = (h + h7) / 2.0f;
                    fArr3[i21 + 3 + i19] = h;
                    fArr3[i21 + 6 + i19] = h7;
                    fArr3[i21 + 9 + i19] = h;
                }
            }
            i11++;
            c10 = c11;
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
            fArr3[i25 + 36] = ((f18 >> 16) & ls.e4) / 255.0f;
            fArr3[i25 + 37] = ((f18 >> 8) & ls.e4) / 255.0f;
            fArr3[i25 + 38] = (f18 & ls.e4) / 255.0f;
            i22++;
        }
        System.arraycopy(fArr, 6, fArr3, 24, 4);
        float[] fArr4 = this.b0;
        float max2 = (fArr4 == null || fArr4.length <= 8) ? 1.0f : Math.max(f17, Math.min(1.0f, fArr4[8]));
        f7 f7Var = this.i0;
        float T1 = org.telegram.messenger.g0.T1(fArr3[30], fArr3[33], max2);
        float T12 = org.telegram.messenger.g0.T1(fArr3[31], fArr3[34], max2);
        float T13 = org.telegram.messenger.g0.T1(fArr3[32], fArr3[35], max2);
        f7Var.getClass();
        float[] fArr5 = f7.j;
        float[] a10 = f7.a(T1, T12, T13);
        float f19 = a10[0];
        float f20 = a10[z12 ? 1 : 0];
        float f21 = a10[2];
        if (f19 == f7Var.e && f20 == f7Var.f && f21 == f7Var.g) {
            return;
        }
        f7Var.e = f19;
        f7Var.f = f20;
        f7Var.g = f21;
        if (f7.k == null) {
            f7.k = f7.a(0.0f, 0.47809f, 1.0f);
        }
        float[] fArr6 = f7.k;
        double sqrt = (fArr6[0] - fArr6[z12 ? 1 : 0]) / Math.sqrt(2.0d);
        double sqrt2 = ((fArr6[0] + fArr6[z12 ? 1 : 0]) - (fArr6[2] * 2.0f)) / Math.sqrt(6.0d);
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
            float f24 = (fArr5[2] * fArr7[i28 + 10]) + (fArr5[z12 ? 1 : 0] * fArr7[i28 + 5]) + (fArr5[0] * fArr7[i28]);
            for (int i29 = 0; i29 < 3; i29++) {
                int i30 = (i29 * 5) + i28;
                fArr7[i30] = (fArr5[i28] - f24) + fArr7[i30];
            }
            i28++;
            i7 = 3;
        }
        fArr7[18] = f23;
        f7Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
        f7Var.invalidateSelf();
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
            ls.f(this.W).c(this, ls.d4);
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
            ls.f(this.W).n(this, ls.d4);
        }
    }

    public void setAdditionalTilt(float f10) {
        this.r = f10;
        this.E.setAdditionalTilt(f10);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i7) {
        this.S = i7;
        this.E.setCardIcon(i7);
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
        this.P.setTextColor(i0.a.f(fArr[8], f8.p(-7868417, 0, fArr), f8.p(-7868417, 3, fArr)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f10) {
        this.s = f10;
        this.E.setUseGyroscope(f10);
    }

    public x6(Context context, int i7, int i10) {
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
        this.J = new Paint(ls.X2);
        final int i11 = 0;
        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Wallet.t6
            public final /* synthetic */ x6 b;

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
                        x6 x6Var = this.b;
                        x6Var.O.invalidate();
                        x6Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        };
        nr nrVar = nr.h;
        this.L = new org.telegram.ui.Components.d6(runnable, 240L, nrVar, 0);
        this.W = k10.t0;
        final int i12 = 1;
        this.g0 = new org.telegram.ui.Components.d6(new Runnable(this) { // from class: org.telegram.ui.Wallet.t6
            public final /* synthetic */ x6 b;

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
                        x6 x6Var = this.b;
                        x6Var.O.invalidate();
                        x6Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        }, 240L, nrVar, 0);
        final int i13 = 2;
        this.h0 = new org.telegram.ui.Components.d6(new Runnable(this) { // from class: org.telegram.ui.Wallet.t6
            public final /* synthetic */ x6 b;

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
                        x6 x6Var = this.b;
                        x6Var.O.invalidate();
                        x6Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        }, 240L, nrVar, 0);
        this.S = i7;
        this.T = i10;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        s6 s6Var = new s6(getContext(), this.S, i10);
        this.E = s6Var;
        this.F = s6Var.getFrontFace();
        float[] fArr = this.b0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.E.setOnClickListener(this.G);
        addView(this.E, 0, c8.ma.c(-2.0f, -1));
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(9, context, this);
        this.H = n2Var;
        if (l0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                l0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                l0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        n2Var.setTypeface(l0);
        n2Var.setTextColor(-1);
        n2Var.setTextSize(1, 13.0f);
        n2Var.setEllipsize(TextUtils.TruncateAt.END);
        n2Var.setMaxLines(1);
        n2Var.setSingleLine();
        this.F.addView(n2Var, c8.ma.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        uv uvVar = new uv(12, context, this);
        this.I = uvVar;
        this.F.addView(uvVar, c8.ma.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.F.addView(view, c8.ma.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.F.addView(linearLayout, d);
        v6 v6Var = new v6(this, context, 0);
        this.O = v6Var;
        v6Var.getDrawable().N = org.telegram.messenger.g0.L(4096.0f);
        v6Var.c.m(0.35f, 320L, 3.5f, nrVar);
        v6Var.setScaleProperty(0.6f);
        v6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        v6Var.setTextSize(org.telegram.messenger.g0.L(23.0f));
        v6Var.setTextColor(-1);
        v6Var.setIgnoreRTL(true);
        linearLayout.addView(v6Var, c8.ma.o(-1, 28));
        v6 v6Var2 = new v6(this, context, 1);
        this.P = v6Var2;
        v6Var2.c.m(0.35f, 320L, 3.5f, nrVar);
        v6Var2.setScaleProperty(0.6f);
        v6Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        v6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        v6Var2.setTextColor(-7868417);
        v6Var2.setLayoutDirection(0);
        v6Var2.setTextDirection(3);
        v6Var2.setGravity(19);
        v6Var2.setIgnoreRTL(true);
        linearLayout.addView(v6Var2, c8.ma.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
