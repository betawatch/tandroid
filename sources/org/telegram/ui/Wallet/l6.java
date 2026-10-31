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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.do0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class l6 extends FrameLayout implements us {
    public static Typeface j0;
    public static Typeface k0;
    public final g6 D;
    public final FrameLayout E;
    public View.OnClickListener F;
    public final org.telegram.ui.ActionBar.q2 G;
    public final do0 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.Components.t5 K;
    public final View L;
    public final LinearLayout M;
    public final j6 N;
    public final j6 O;
    public final FrameLayout.LayoutParams P;
    public String Q;
    public int R;
    public final int S;
    public float T;
    public float U;
    public int V;
    public k0 W;
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
    public final org.telegram.ui.Components.t5 f0;
    public final org.telegram.ui.Components.t5 g0;
    public float h;
    public t6 h0;
    public boolean i0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    public l6(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static void a(final l6 l6Var, final Canvas canvas, float f7) {
        float width = l6Var.getFrontFace().getWidth();
        float height = l6Var.getFrontFace().getHeight();
        float f10 = width / 1640.0f;
        Paint paint = l6Var.I;
        Context context = l6Var.getContext();
        if (j0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                j0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                j0 = org.telegram.messenger.i0.o1("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(j0);
        paint.setTextSize(47.345238f * f10);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = l6Var.a0;
        paint.setColor(i0.b.f((fArr == null || fArr.length < 18) ? 0.0f : fArr[8], v7.b(0, fArr), v7.b(1, fArr)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f11 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f12 = f10 * 27.333332f;
        final String[] split = f(l6Var.Q).split("\\n");
        canvas.save();
        canvas.translate(f10 * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        l6Var.c(f7, new d3(l6Var, 2), new Runnable() { // from class: org.telegram.ui.Wallet.i6
            @Override // java.lang.Runnable
            public final void run() {
                l6 l6Var2 = l6.this;
                l6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f13 = f12;
                float f14 = f11;
                Paint paint2 = l6Var2.I;
                Canvas canvas2 = canvas;
                canvas2.drawText(str, 0.0f, (-f13) + f14, paint2);
                if (strArr.length > 1) {
                    canvas2.drawText(strArr[1], 0.0f, f13 + f14, paint2);
                }
            }
        });
        canvas.restore();
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
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
        int i10 = 0;
        while (i10 < split.length) {
            if (i10 > 0) {
                sb2.append(i10 == length ? '\n' : ' ');
            }
            sb2.append(split[i10]);
            i10++;
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
        float max = Math.max(0.0f, (((((336.0f - this.S) - 48.0f) * this.E.getWidth()) / 336.0f) - this.P.leftMargin) - org.telegram.messenger.i0.L(8.0f));
        if (c10 > 0.0f) {
            return Math.min(1.0f, max / c10);
        }
        return 1.0f;
    }

    public final void c(float f7, d3 d3Var, Runnable runnable) {
        d3Var.a(f7 > 0.0f ? org.telegram.messenger.i0.L(5.0f) : 0.0f, org.telegram.messenger.i0.L(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        d3Var.a(org.telegram.messenger.i0.N(1.5f), 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.i0 = true;
        runnable.run();
        this.i0 = false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.a4) {
            Object obj = objArr[0];
            k0 k0Var = this.W;
            if (obj == k0Var) {
                l(k0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        View view2 = (View) ((View) this.E.getParent()).getParent();
        g6 g6Var = this.D;
        Matrix matrix2 = (Matrix) g6Var.e.d;
        Matrix matrix3 = this.w;
        matrix3.set(matrix2);
        f6 f6Var = g6Var.f;
        matrix3.preTranslate(f6Var.getLeft(), f6Var.getTop());
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

    public org.telegram.ui.Components.f6 getBalanceView() {
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
        float f7 = layoutParams.leftMargin;
        float f10 = layoutParams.topMargin;
        float bottom = ((r3.getBottom() + r3.getTop()) / 2.0f) + f10;
        float height = (r3.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f7, bottom - height, c10 + f7, bottom + height));
        org.telegram.ui.ActionBar.q2 q2Var = this.G;
        arrayList.add(new RectF(q2Var.getLeft(), q2Var.getTop(), q2Var.getLeft() + Math.min(q2Var.getWidth(), q2Var.getPaint().measureText(q2Var.getText().toString())), q2Var.getBottom()));
        arrayList.add(new RectF(this.E.getWidth() - (34.0f * width), 18.0f * width, this.E.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.E.getWidth(), this.E.getHeight());
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        arrayList.add(rectF);
        arrayList.add(new RectF(f7, r5.getTop() + f10, c11 + f7, f10 + r5.getBottom()));
        arrayList.add(this.a ? new RectF(this.f) : new RectF());
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.a0;
    }

    public org.telegram.ui.Components.f6 getUsdBalanceView() {
        return this.O;
    }

    public final void h(Path path, float f7, float f10) {
        path.rewind();
        float f11 = 336 - this.S;
        path.addRoundRect(((f11 - 48.0f) * f7) / 336.0f, 0.36097562f * f10, (f11 * f7) / 336.0f, 0.5365854f * f10, (f7 * 8.0f) / 336.0f, 0.03902439f * f10, Path.Direction.CW);
    }

    public final void i(float f7, float f10) {
        if (this.T == f7 && this.U == f10) {
            return;
        }
        this.T = f7;
        if (f7 == 0.0f) {
            this.n = false;
        }
        this.U = f10;
        this.N.invalidate();
        this.O.invalidate();
    }

    public final void j(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new k6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cd.L0(2131749525, null));
        spannableStringBuilder.setSpan(new bi.m6(this, 5), length, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        long round = Math.round((j10 / 1.0E9d) * ((org.telegram.messenger.k0) vp.r1(i10).y7.l.b).a * 100.0d);
        org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
        boolean z10 = round % 100 == 0;
        i11.getClass();
        this.O.setText(org.telegram.messenger.u1.g("USD", 2, round, z10));
    }

    public final void l(k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        int i10 = k0Var.a;
        setCardHolder(h20.p(d20.i(i10).f()).toUpperCase());
        if (k0Var.t() != null) {
            setCardNumber(d(k0Var.t().toUpperCase()));
        }
        if (k0Var.G()) {
            j(i10, k0Var.v());
        }
    }

    public final void m() {
        int i10;
        float f7;
        if (this.h0 == null) {
            return;
        }
        float[] fArr = this.a0;
        char c10 = '\t';
        int i11 = 2;
        boolean z10 = true;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (fArr == null) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        }
        float[] fArr2 = v7.c;
        float[] fArr3 = new float[42];
        int i12 = 0;
        while (true) {
            char c11 = c10;
            if (i12 >= i11) {
                break;
            }
            int i13 = i12 * 4;
            int i14 = i13 + 10;
            boolean z11 = z10;
            if (fArr.length < 18 || fArr[i14] < f10) {
                f7 = f10;
                System.arraycopy(v7.b, 0, fArr3, i12 * 12, 12);
                fArr3[i12 + 28] = 1.0f;
                System.arraycopy(fArr2, 0, fArr3, (i12 * 3) + 30, 3);
            } else {
                fArr3[i12 + 28] = 0.6f;
                int i15 = (int) fArr[i14];
                int i16 = i12 * 3;
                int i17 = i16 + 30;
                float f12 = ((i15 >> 16) & zs.e4) / 255.0f;
                f7 = f10;
                float f13 = ((i15 >> 8) & zs.e4) / 255.0f;
                float f14 = (i15 & zs.e4) / 255.0f;
                float min = Math.min(f12, Math.min(f13, f14));
                float max = Math.max(f12, Math.max(f13, f14)) - min;
                float f15 = (fArr2[i11] * 0.0722f) + (fArr2[z11 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                fArr3[i17] = c3.i0.z(max > f7 ? (f12 - min) / max : f7, f15, min2, f15);
                fArr3[i16 + 31] = c3.i0.z(max > f7 ? (f13 - min) / max : f7, f15, min2, f15);
                fArr3[i16 + 32] = c3.i0.z(max > f7 ? (f14 - min) / max : f7, f15, min2, f15);
                int i18 = (int) fArr[i14];
                int i19 = (int) fArr[i13 + 11];
                int n10 = v7.n(-16216082, i18, i19);
                int n11 = v7.n(-15291399, i18, i19);
                for (int i20 = 0; i20 < 3; i20++) {
                    int i21 = 16 - (i20 * 8);
                    float h = v7.h(n10, i21) * 0.73f;
                    float h10 = v7.h(n11, i21) * 0.73f;
                    int i22 = i12 * 12;
                    fArr3[i22 + i20] = (h + h10) / 2.0f;
                    fArr3[i22 + 3 + i20] = h;
                    fArr3[i22 + 6 + i20] = h10;
                    fArr3[i22 + 9 + i20] = h;
                }
            }
            i12++;
            c10 = c11;
            z10 = z11 ? 1 : 0;
            f10 = f7;
            i11 = 2;
        }
        boolean z12 = z10;
        float f16 = f10;
        int i23 = 0;
        for (int i24 = i11; i23 < i24; i24 = 2) {
            int i25 = i23 * 4;
            int f17 = (fArr.length < 18 || fArr[i25 + 10] < f16) ? i0.b.f(0.2f, -16611884, -16748084) : i0.b.f(0.2f, ((int) fArr[i25 + 12]) | (-16777216), ((int) fArr[i25 + 11]) | (-16777216));
            int i26 = i23 * 3;
            fArr3[i26 + 36] = ((f17 >> 16) & zs.e4) / 255.0f;
            fArr3[i26 + 37] = ((f17 >> 8) & zs.e4) / 255.0f;
            fArr3[i26 + 38] = (f17 & zs.e4) / 255.0f;
            i23++;
        }
        System.arraycopy(fArr, 6, fArr3, 24, 4);
        float[] fArr4 = this.a0;
        float max2 = (fArr4 == null || fArr4.length <= 8) ? 1.0f : Math.max(f16, Math.min(1.0f, fArr4[8]));
        t6 t6Var = this.h0;
        float T1 = org.telegram.messenger.i0.T1(fArr3[30], fArr3[33], max2);
        float T12 = org.telegram.messenger.i0.T1(fArr3[31], fArr3[34], max2);
        float T13 = org.telegram.messenger.i0.T1(fArr3[32], fArr3[35], max2);
        t6Var.getClass();
        float[] fArr5 = t6.j;
        float[] a2 = t6.a(T1, T12, T13);
        float f18 = a2[0];
        float f19 = a2[z12 ? 1 : 0];
        float f20 = a2[2];
        if (f18 == t6Var.e && f19 == t6Var.f && f20 == t6Var.g) {
            return;
        }
        t6Var.e = f18;
        t6Var.f = f19;
        t6Var.g = f20;
        if (t6.k == null) {
            t6.k = t6.a(0.0f, 0.47809f, 1.0f);
        }
        float[] fArr6 = t6.k;
        double sqrt = (fArr6[0] - fArr6[z12 ? 1 : 0]) / Math.sqrt(2.0d);
        double sqrt2 = ((fArr6[0] + fArr6[z12 ? 1 : 0]) - (fArr6[2] * 2.0f)) / Math.sqrt(6.0d);
        double sqrt3 = (f18 - f19) / Math.sqrt(2.0d);
        double sqrt4 = ((f18 + f19) - (f20 * 2.0f)) / Math.sqrt(6.0d);
        double IEEEremainder = Math.IEEEremainder(Math.atan2(sqrt4, sqrt3) - Math.atan2(sqrt2, sqrt), 6.283185307179586d);
        double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(sqrt3, sqrt4) / Math.hypot(sqrt, sqrt2));
        double cos = Math.cos(IEEEremainder);
        double sin = Math.sin(IEEEremainder) / Math.sqrt(3.0d);
        double d = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
        double d10 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
        float[] fArr7 = new float[20];
        int i27 = 0;
        while (true) {
            i10 = 3;
            if (i27 >= 3) {
                break;
            }
            int i28 = 0;
            while (i28 < i10) {
                double d11 = i27 == i28 ? d : d10;
                if (i28 == (i27 + 1) % 3) {
                    d11 -= min3 * sin;
                } else if (i28 == (i27 + 2) % 3) {
                    d11 = (min3 * sin) + d11;
                }
                float f21 = f11;
                double d12 = d10;
                fArr7[(i27 * 5) + i28] = (float) d11;
                i28++;
                f11 = f21;
                d10 = d12;
                i10 = 3;
            }
            i27++;
        }
        float f22 = f11;
        int i29 = 0;
        while (i29 < i10) {
            float f23 = (fArr5[2] * fArr7[i29 + 10]) + (fArr5[z12 ? 1 : 0] * fArr7[i29 + 5]) + (fArr5[0] * fArr7[i29]);
            for (int i30 = 0; i30 < 3; i30++) {
                int i31 = (i30 * 5) + i29;
                fArr7[i31] = (fArr5[i29] - f23) + fArr7[i31];
            }
            i29++;
            i10 = 3;
        }
        fArr7[18] = f22;
        t6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
        t6Var.invalidateSelf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(org.telegram.messenger.i0.L(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.W != null) {
            zs.f(this.V).c(this, zs.a4);
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
            zs.f(this.V).n(this, zs.a4);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.r = f7;
        this.D.setAdditionalTilt(f7);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.R = i10;
        this.D.setCardIcon(i10);
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

    public void setDiamondOnCard(boolean z10) {
        this.a = z10;
        this.N.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f7) {
        this.D.setScaleX(f7);
        this.D.setScaleY(f7);
    }

    public void setStickerStyle(float[] fArr) {
        this.a0 = fArr;
        m();
        this.N.invalidate();
        this.H.invalidate();
        this.D.setStickerStyle(fArr);
        this.O.setTextColor(i0.b.f(fArr[8], v7.p(-7868417, 0, fArr), v7.p(-7868417, 3, fArr)));
        this.G.invalidate();
    }

    public void setUseGyroscope(float f7) {
        this.s = f7;
        this.D.setUseGyroscope(f7);
    }

    public l6(Context context, int i10, int i11) {
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
        this.I = new Paint(zs.X2);
        final int i12 = 0;
        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Wallet.h6
            public final /* synthetic */ l6 b;

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
                        l6 l6Var = this.b;
                        l6Var.N.invalidate();
                        l6Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        };
        gr grVar = gr.h;
        this.K = new org.telegram.ui.Components.t5(runnable, 240L, grVar, 0);
        this.V = d20.s0;
        final int i13 = 1;
        this.f0 = new org.telegram.ui.Components.t5(new Runnable(this) { // from class: org.telegram.ui.Wallet.h6
            public final /* synthetic */ l6 b;

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
                        l6 l6Var = this.b;
                        l6Var.N.invalidate();
                        l6Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        }, 240L, grVar, 0);
        final int i14 = 2;
        this.g0 = new org.telegram.ui.Components.t5(new Runnable(this) { // from class: org.telegram.ui.Wallet.h6
            public final /* synthetic */ l6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.H.invalidate();
                        break;
                    case 1:
                        l6 l6Var = this.b;
                        l6Var.N.invalidate();
                        l6Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        }, 240L, grVar, 0);
        this.R = i10;
        this.S = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        g6 g6Var = new g6(getContext(), this.R, i11);
        this.D = g6Var;
        this.E = g6Var.getFrontFace();
        float[] fArr = this.a0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.D.setOnClickListener(this.F);
        addView(this.D, 0, w7.b6.c(-2.0f, -1));
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 9);
        this.G = q2Var;
        if (k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                k0 = org.telegram.messenger.i0.o1("fonts/rmono.ttf");
            }
        }
        q2Var.setTypeface(k0);
        q2Var.setTextColor(-1);
        q2Var.setTextSize(1, 13.0f);
        q2Var.setEllipsize(TextUtils.TruncateAt.END);
        q2Var.setMaxLines(1);
        q2Var.setSingleLine();
        this.E.addView(q2Var, w7.b6.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        do0 do0Var = new do0(this, context, 7);
        this.H = do0Var;
        this.E.addView(do0Var, w7.b6.c(-1.0f, -1));
        View view = new View(context);
        this.L = view;
        this.E.addView(view, w7.b6.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.P = d;
        this.E.addView(linearLayout, d);
        j6 j6Var = new j6(this, context, 0);
        this.N = j6Var;
        j6Var.getDrawable().M = org.telegram.messenger.i0.L(4096.0f);
        j6Var.c.m(0.35f, 320L, 3.5f, grVar);
        j6Var.setScaleProperty(0.6f);
        j6Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        j6Var.setTextSize(org.telegram.messenger.i0.L(23.0f));
        j6Var.setTextColor(-1);
        j6Var.setIgnoreRTL(true);
        linearLayout.addView(j6Var, w7.b6.o(-1, 28));
        j6 j6Var2 = new j6(this, context, 1);
        this.O = j6Var2;
        j6Var2.c.m(0.35f, 320L, 3.5f, grVar);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        j6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        j6Var2.setTextColor(-7868417);
        j6Var2.setLayoutDirection(0);
        j6Var2.setTextDirection(3);
        j6Var2.setGravity(19);
        j6Var2.setIgnoreRTL(true);
        linearLayout.addView(j6Var2, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
