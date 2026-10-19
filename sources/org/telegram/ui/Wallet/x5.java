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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.kk;
import org.telegram.ui.v10;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public class x5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface j0;
    public static Typeface k0;
    public final FrameLayout E;
    public View.OnClickListener F;
    public final kk G;
    public final v10 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.Components.f6 K;
    public final View L;
    public final LinearLayout M;
    public final v5 N;
    public final v5 O;
    public final FrameLayout.LayoutParams P;
    public String Q;
    public int R;
    public final int S;
    public float T;
    public float U;
    public int V;
    public m0 W;
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
    public final org.telegram.ui.Components.f6 f0;
    public final org.telegram.ui.Components.f6 g0;
    public float h;
    public f6 h0;
    public boolean i0;
    public boolean n;
    public float r;
    public float s;
    public final Matrix v;
    public final Matrix w;
    public final Matrix x;
    public final s5 y;

    public x5(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static void a(final x5 x5Var, final Canvas canvas, float f7) {
        float width = x5Var.getFrontFace().getWidth();
        float height = x5Var.getFrontFace().getHeight();
        float f10 = width / 1640.0f;
        Paint paint = x5Var.I;
        Context context = x5Var.getContext();
        if (j0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                j0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                j0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        paint.setTypeface(j0);
        paint.setTextSize(47.345238f * f10);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = x5Var.a0;
        paint.setColor(i0.a.f((fArr == null || fArr.length < 18) ? 0.0f : fArr[8], h7.b(fArr, 0), h7.b(fArr, 1)));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f11 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f12 = f10 * 27.333332f;
        final String[] split = f(x5Var.Q).split("\\n");
        canvas.save();
        canvas.translate(f10 * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        x5Var.c(f7, new o2(x5Var, 2), new Runnable() { // from class: org.telegram.ui.Wallet.u5
            @Override // java.lang.Runnable
            public final void run() {
                x5 x5Var2 = x5.this;
                x5Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f13 = f12;
                float f14 = f11;
                Paint paint2 = x5Var2.I;
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
        return m0.p(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(m0.o(j10, false))), 0.8f);
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
        float max = Math.max(0.0f, (((((336.0f - this.S) - 48.0f) * this.E.getWidth()) / 336.0f) - this.P.leftMargin) - AndroidUtilities.dp(8.0f));
        if (c10 > 0.0f) {
            return Math.min(1.0f, max / c10);
        }
        return 1.0f;
    }

    public final void c(float f7, o2 o2Var, Runnable runnable) {
        o2Var.a(f7 > 0.0f ? AndroidUtilities.dp(5.0f) : 0.0f, AndroidUtilities.dp(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        o2Var.a(AndroidUtilities.dpf2(1.5f), 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.i0 = true;
        runnable.run();
        this.i0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            Object obj = objArr[0];
            m0 m0Var = this.W;
            if (obj == m0Var) {
                l(m0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        View view2 = (View) ((View) this.E.getParent()).getParent();
        s5 s5Var = this.y;
        Matrix matrix2 = (Matrix) s5Var.e.c;
        Matrix matrix3 = this.v;
        matrix3.set(matrix2);
        ci.m1 m1Var = s5Var.f;
        matrix3.preTranslate(m1Var.getLeft(), m1Var.getTop());
        k(view2, matrix);
        matrix.preConcat(matrix3);
        matrix.preTranslate(this.E.getLeft() - r0.getScrollX(), this.E.getTop() - r0.getScrollY());
        matrix.preConcat(this.E.getMatrix());
        Matrix matrix4 = this.w;
        k(view, matrix4);
        Matrix matrix5 = this.x;
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

    public org.telegram.ui.Components.q6 getBalanceView() {
        return this.N;
    }

    public TextView getCardHolderView() {
        return this.G;
    }

    public float getCardRotationX() {
        return this.y.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.y.getCardRotationY();
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
        kk kkVar = this.G;
        arrayList.add(new RectF(kkVar.getLeft(), kkVar.getTop(), kkVar.getLeft() + Math.min(kkVar.getWidth(), kkVar.getPaint().measureText(kkVar.getText().toString())), kkVar.getBottom()));
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

    public org.telegram.ui.Components.q6 getUsdBalanceView() {
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
        spannableString.setSpan(new w5(this, R.drawable.wallet_gram_large), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new ki.y5(this, 4), length, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        long round = Math.round(MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d);
        this.O.setText(BillingController.getInstance().formatCurrency(round, "USD", 2, round % 100 == 0));
    }

    public final void l(m0 m0Var) {
        if (m0Var == null) {
            return;
        }
        int i10 = m0Var.a;
        setCardHolder(UserObject.getUserName(UserConfig.getInstance(i10).getCurrentUser()).toUpperCase());
        if (m0Var.s() != null) {
            setCardNumber(d(m0Var.s().toUpperCase()));
        }
        if (m0Var.E()) {
            j(i10, m0Var.u());
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
        float[] fArr2 = h7.c;
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
                System.arraycopy(h7.b, 0, fArr3, i12 * 12, 12);
                fArr3[i12 + 28] = 1.0f;
                System.arraycopy(fArr2, 0, fArr3, (i12 * 3) + 30, 3);
            } else {
                fArr3[i12 + 28] = 0.6f;
                int i15 = (int) fArr[i14];
                int i16 = i12 * 3;
                int i17 = i16 + 30;
                float f12 = ((i15 >> 16) & 255) / 255.0f;
                f7 = f10;
                float f13 = ((i15 >> 8) & 255) / 255.0f;
                float f14 = (i15 & 255) / 255.0f;
                float min = Math.min(f12, Math.min(f13, f14));
                float max = Math.max(f12, Math.max(f13, f14)) - min;
                float f15 = (fArr2[i11] * 0.0722f) + (fArr2[z11 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                fArr3[i17] = com.google.android.gms.internal.play_billing.k3.y(max > f7 ? (f12 - min) / max : f7, f15, min2, f15);
                fArr3[i16 + 31] = com.google.android.gms.internal.play_billing.k3.y(max > f7 ? (f13 - min) / max : f7, f15, min2, f15);
                fArr3[i16 + 32] = com.google.android.gms.internal.play_billing.k3.y(max > f7 ? (f14 - min) / max : f7, f15, min2, f15);
                int i18 = (int) fArr[i14];
                int i19 = (int) fArr[i13 + 11];
                int n10 = h7.n(-16216082, i18, i19);
                int n11 = h7.n(-15291399, i18, i19);
                for (int i20 = 0; i20 < 3; i20++) {
                    int i21 = 16 - (i20 * 8);
                    float h = h7.h(n10, i21) * 0.73f;
                    float h10 = h7.h(n11, i21) * 0.73f;
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
            int f17 = (fArr.length < 18 || fArr[i25 + 10] < f16) ? i0.a.f(0.2f, -16611884, -16748084) : i0.a.f(0.2f, ((int) fArr[i25 + 12]) | (-16777216), ((int) fArr[i25 + 11]) | (-16777216));
            int i26 = i23 * 3;
            fArr3[i26 + 36] = ((f17 >> 16) & 255) / 255.0f;
            fArr3[i26 + 37] = ((f17 >> 8) & 255) / 255.0f;
            fArr3[i26 + 38] = (f17 & 255) / 255.0f;
            i23++;
        }
        System.arraycopy(fArr, 6, fArr3, 24, 4);
        float[] fArr4 = this.a0;
        float max2 = (fArr4 == null || fArr4.length <= 8) ? 1.0f : Math.max(f16, Math.min(1.0f, fArr4[8]));
        f6 f6Var = this.h0;
        float lerp = AndroidUtilities.lerp(fArr3[30], fArr3[33], max2);
        float lerp2 = AndroidUtilities.lerp(fArr3[31], fArr3[34], max2);
        float lerp3 = AndroidUtilities.lerp(fArr3[32], fArr3[35], max2);
        f6Var.getClass();
        float[] fArr5 = f6.j;
        float[] a2 = f6.a(lerp, lerp2, lerp3);
        float f18 = a2[0];
        float f19 = a2[z12 ? 1 : 0];
        float f20 = a2[2];
        if (f18 == f6Var.e && f19 == f6Var.f && f20 == f6Var.g) {
            return;
        }
        f6Var.e = f18;
        f6Var.f = f19;
        f6Var.g = f20;
        if (f6.k == null) {
            f6.k = f6.a(0.0f, 0.47809f, 1.0f);
        }
        float[] fArr6 = f6.k;
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
        f6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
        f6Var.invalidateSelf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(AndroidUtilities.dp(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.W != null) {
            NotificationCenter.getInstance(this.V).addObserver(this, NotificationCenter.walletUpdate);
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
            NotificationCenter.getInstance(this.V).removeObserver(this, NotificationCenter.walletUpdate);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.r = f7;
        this.y.setAdditionalTilt(f7);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.R = i10;
        this.y.setCardIcon(i10);
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.Q)) {
            return;
        }
        this.Q = str;
        this.y.setHasCardNumber(true);
        this.H.invalidate();
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
        this.y.setOnClickListener(onClickListener);
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
        this.y.setScaleX(f7);
        this.y.setScaleY(f7);
    }

    public void setStickerStyle(float[] fArr) {
        this.a0 = fArr;
        m();
        this.N.invalidate();
        this.H.invalidate();
        this.y.setStickerStyle(fArr);
        this.O.setTextColor(i0.a.f(fArr[8], h7.p(fArr, -7868417, 0), h7.p(fArr, -7868417, 3)));
        this.G.invalidate();
    }

    public void setUseGyroscope(float f7) {
        this.s = f7;
        this.y.setUseGyroscope(f7);
    }

    public x5(Context context, int i10, int i11) {
        super(context);
        this.b = 1.0f;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        new RectF();
        this.f = new RectF();
        this.s = 1.0f;
        this.v = new Matrix();
        this.w = new Matrix();
        this.x = new Matrix();
        this.I = new Paint(193);
        final int i12 = 0;
        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ x5 b;

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
                        x5 x5Var = this.b;
                        x5Var.N.invalidate();
                        x5Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        };
        bs bsVar = bs.h;
        this.K = new org.telegram.ui.Components.f6(runnable, 240L, bsVar, 0);
        this.V = UserConfig.selectedAccount;
        final int i13 = 1;
        this.f0 = new org.telegram.ui.Components.f6(new Runnable(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ x5 b;

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
                        x5 x5Var = this.b;
                        x5Var.N.invalidate();
                        x5Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        }, 240L, bsVar, 0);
        final int i14 = 2;
        this.g0 = new org.telegram.ui.Components.f6(new Runnable(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ x5 b;

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
                        x5 x5Var = this.b;
                        x5Var.N.invalidate();
                        x5Var.O.invalidate();
                        break;
                    default:
                        this.b.G.invalidate();
                        break;
                }
            }
        }, 240L, bsVar, 0);
        this.R = i10;
        this.S = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        s5 s5Var = new s5(getContext(), this.R, i11);
        this.y = s5Var;
        this.E = s5Var.getFrontFace();
        float[] fArr = this.a0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.y.setOnClickListener(this.F);
        addView(this.y, 0, w7.z5.c(-2.0f, -1));
        kk kkVar = new kk(this, context, 6);
        this.G = kkVar;
        if (k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                k0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        kkVar.setTypeface(k0);
        kkVar.setTextColor(-1);
        kkVar.setTextSize(1, 13.0f);
        kkVar.setEllipsize(TextUtils.TruncateAt.END);
        kkVar.setMaxLines(1);
        kkVar.setSingleLine();
        this.E.addView(kkVar, w7.z5.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        v10 v10Var = new v10(this, context, 11);
        this.H = v10Var;
        this.E.addView(v10Var, w7.z5.c(-1.0f, -1));
        View view = new View(context);
        this.L = view;
        this.E.addView(view, w7.z5.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.P = d;
        this.E.addView(linearLayout, d);
        v5 v5Var = new v5(this, context, 0);
        this.N = v5Var;
        v5Var.getDrawable().M = AndroidUtilities.dp(4096.0f);
        v5Var.c.m(0.35f, 320L, 3.5f, bsVar);
        v5Var.setScaleProperty(0.6f);
        v5Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        v5Var.setTextSize(AndroidUtilities.dp(23.0f));
        v5Var.setTextColor(-1);
        v5Var.setIgnoreRTL(true);
        linearLayout.addView(v5Var, w7.z5.n(-1, 28));
        v5 v5Var2 = new v5(this, context, 1);
        this.O = v5Var2;
        v5Var2.c.m(0.35f, 320L, 3.5f, bsVar);
        v5Var2.setScaleProperty(0.6f);
        v5Var2.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        v5Var2.setTextSize(AndroidUtilities.dp(14.0f));
        v5Var2.setTextColor(-7868417);
        v5Var2.setLayoutDirection(0);
        v5Var2.setTextDirection(3);
        v5Var2.setGravity(19);
        v5Var2.setIgnoreRTL(true);
        linearLayout.addView(v5Var2, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
