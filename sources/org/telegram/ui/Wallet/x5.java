package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs;
import org.telegram.ui.mk;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public class x5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface n0;
    public static Typeface o0;
    public final FrameLayout E;
    public Bitmap F;
    public View.OnClickListener G;
    public final mk H;
    public final x10 I;
    public final Paint J;
    public float K;
    public final org.telegram.ui.Components.f6 L;
    public final View M;
    public final LinearLayout N;
    public final v5 O;
    public final v5 P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final int T;
    public float U;
    public float V;
    public int W;
    public boolean a;
    public m0 a0;
    public float b;
    public float[] b0;
    public final Matrix c;
    public float[] c0;
    public final Matrix d;
    public float[] d0;
    public final Matrix e;
    public String e0;
    public final RectF f;
    public int f0;
    public int g0;
    public float h;
    public float h0;
    public float i0;
    public final org.telegram.ui.Components.f6 j0;
    public final org.telegram.ui.Components.f6 k0;
    public f6 l0;
    public boolean m0;
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

    public static String c(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder d(long j10) {
        return m0.p(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(m0.o(j10, false))), 0.8f);
    }

    public static String e(String str) {
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

    public static Typeface f(Context context) {
        if (n0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                n0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                n0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        return n0;
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

    public final float a() {
        float c10 = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.E.getWidth()) / 336.0f) - this.Q.leftMargin) - AndroidUtilities.dp(8.0f));
        if (c10 > 0.0f) {
            return Math.min(1.0f, max / c10);
        }
        return 1.0f;
    }

    public final void b(float f7, boolean z10, o2 o2Var, Runnable runnable) {
        if (z10) {
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), f7);
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), 0, f7);
            float dp = AndroidUtilities.dp(1.0f);
            float[] fArr = this.b0;
            o2Var.a(lerp, lerp2, dp, i0.a.f(f7, fArr != null ? i0.a.f(fArr[8], h7.q(fArr, -16611884, 0), h7.q(fArr, -16611884, 3)) : -16611884, 1493172224));
        } else {
            o2Var.a(f7 > 0.0f ? AndroidUtilities.dp(5.0f) : 0.0f, 0.0f, AndroidUtilities.dp(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        }
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        o2Var.a(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.m0 = true;
        runnable.run();
        this.m0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            Object obj = objArr[0];
            m0 m0Var = this.a0;
            if (obj == m0Var) {
                l(m0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        View view2 = (View) this.E.getParent();
        Matrix matrix2 = this.y.e.a;
        Matrix matrix3 = this.v;
        matrix3.set(matrix2);
        k(view2, matrix);
        matrix.preConcat(matrix3);
        matrix.preTranslate(this.E.getLeft() - view2.getScrollX(), this.E.getTop() - view2.getScrollY());
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
        return this.M;
    }

    public LinearLayout getBalanceLayout() {
        return this.N;
    }

    public org.telegram.ui.Components.q6 getBalanceView() {
        return this.O;
    }

    public TextView getCardHolderView() {
        return this.H;
    }

    public float getCardRotationX() {
        return this.y.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.y.getCardRotationY();
    }

    public String getDebugBackdropName() {
        return this.e0;
    }

    public FrameLayout getFrontFace() {
        return this.E;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.E.indexOfChild(this.H);
        int indexOfChild2 = this.E.indexOfChild(this.N);
        return indexOfChild < 0 ? indexOfChild2 < 0 ? this.E.getChildCount() : indexOfChild2 : indexOfChild2 < 0 ? indexOfChild : Math.min(indexOfChild, indexOfChild2);
    }

    public ArrayList<RectF> getStickerObstacles() {
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.E.getWidth() / 336.0f;
        float a2 = a();
        float c10 = this.O.getDrawable().c() * a2;
        float c11 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f7 = layoutParams.leftMargin;
        float f10 = layoutParams.topMargin;
        float bottom = ((r3.getBottom() + r3.getTop()) / 2.0f) + f10;
        float height = (r3.getHeight() * a2) / 2.0f;
        arrayList.add(new RectF(f7, bottom - height, c10 + f7, bottom + height));
        mk mkVar = this.H;
        arrayList.add(new RectF(mkVar.getLeft(), mkVar.getTop(), mkVar.getLeft() + Math.min(mkVar.getWidth(), mkVar.getPaint().measureText(mkVar.getText().toString())), mkVar.getBottom()));
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
        return this.b0;
    }

    public org.telegram.ui.Components.q6 getUsdBalanceView() {
        return this.P;
    }

    public final void h(Path path, float f7, float f10) {
        path.rewind();
        float f11 = 336 - this.T;
        path.addRoundRect(((f11 - 48.0f) * f7) / 336.0f, 0.36097562f * f10, (f11 * f7) / 336.0f, 0.5365854f * f10, (f7 * 8.0f) / 336.0f, 0.03902439f * f10, Path.Direction.CW);
    }

    public final void i(float f7, float f10) {
        if (this.U == f7 && this.V == f10) {
            return;
        }
        this.U = f7;
        if (f7 == 0.0f) {
            this.n = false;
        }
        this.V = f10;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new w5(this, R.drawable.wallet_gram_large), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) d(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new ki.y5(this, 4), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round(MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d);
        this.P.setText(BillingController.getInstance().formatCurrency(round, "USD", 2, round % 100 == 0));
    }

    public final void l(m0 m0Var) {
        if (m0Var == null) {
            return;
        }
        int i10 = m0Var.a;
        setCardHolder(UserObject.getUserName(UserConfig.getInstance(i10).getCurrentUser()).toUpperCase());
        if (m0Var.s() != null) {
            setCardNumber(c(m0Var.s().toUpperCase()));
        }
        if (m0Var.E()) {
            j(i10, m0Var.u());
        }
    }

    public final void m() {
        int[] iArr;
        boolean z10;
        float f7;
        if (this.l0 == null) {
            return;
        }
        float[] fArr = this.b0;
        char c10 = '\t';
        boolean z11 = true;
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (fArr == null) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        }
        float[] fArr2 = h7.c;
        float[] fArr3 = new float[42];
        int i11 = 0;
        for (int i12 = 2; i11 < i12; i12 = 2) {
            int i13 = i11 * 4;
            int i14 = i13 + 10;
            char c11 = c10;
            if (fArr.length < 18 || fArr[i14] < f10) {
                z10 = z11;
                f7 = f10;
                System.arraycopy(h7.b, 0, fArr3, i11 * 12, 12);
                fArr3[i11 + 28] = 1.0f;
                System.arraycopy(fArr2, 0, fArr3, (i11 * 3) + 30, 3);
            } else {
                fArr3[i11 + 28] = 0.6f;
                int i15 = (int) fArr[i14];
                int i16 = i11 * 3;
                int i17 = i16 + 30;
                z10 = z11;
                float f12 = ((i15 >> 16) & 255) / 255.0f;
                f7 = f10;
                float f13 = ((i15 >> 8) & 255) / 255.0f;
                float f14 = (i15 & 255) / 255.0f;
                float min = Math.min(f12, Math.min(f13, f14));
                float max = Math.max(f12, Math.max(f13, f14)) - min;
                float f15 = (fArr2[i12] * 0.0722f) + (fArr2[z10 ? 1 : 0] * 0.7152f) + (fArr2[0] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                fArr3[i17] = com.google.android.gms.internal.play_billing.k3.y(max > f7 ? (f12 - min) / max : f7, f15, min2, f15);
                fArr3[i16 + 31] = com.google.android.gms.internal.play_billing.k3.y(max > f7 ? (f13 - min) / max : f7, f15, min2, f15);
                fArr3[i16 + 32] = com.google.android.gms.internal.play_billing.k3.y(max > f7 ? (f14 - min) / max : f7, f15, min2, f15);
                int i18 = (int) fArr[i14];
                int i19 = (int) fArr[i13 + 11];
                int o10 = h7.o(-16216082, i18, i19);
                int o11 = h7.o(-15291399, i18, i19);
                for (int i20 = 0; i20 < 3; i20++) {
                    int i21 = 16 - (i20 * 8);
                    float i22 = h7.i(o10, i21) * 0.73f;
                    float i23 = h7.i(o11, i21) * 0.73f;
                    int i24 = i11 * 12;
                    fArr3[i24 + i20] = (i22 + i23) / 2.0f;
                    fArr3[i24 + 3 + i20] = i22;
                    fArr3[i24 + 6 + i20] = i23;
                    fArr3[i24 + 9 + i20] = i22;
                }
            }
            i11++;
            c10 = c11;
            z11 = z10;
            f10 = f7;
        }
        float f16 = f10;
        for (int i25 = 0; i25 < 2; i25++) {
            int i26 = i25 * 4;
            int f17 = (fArr.length < 18 || fArr[i26 + 10] < f16) ? i0.a.f(0.2f, -16611884, -16748084) : i0.a.f(0.2f, ((int) fArr[i26 + 12]) | (-16777216), (-16777216) | ((int) fArr[i26 + 11]));
            int i27 = i25 * 3;
            fArr3[i27 + 36] = ((f17 >> 16) & 255) / 255.0f;
            fArr3[i27 + 37] = ((f17 >> 8) & 255) / 255.0f;
            fArr3[i27 + 38] = (f17 & 255) / 255.0f;
        }
        System.arraycopy(fArr, 6, fArr3, 24, 4);
        float[] fArr4 = this.b0;
        if (fArr4 != null && fArr4.length > 8) {
            f11 = Math.max(f16, Math.min(1.0f, fArr4[8]));
        }
        f6 f6Var = this.l0;
        float lerp = AndroidUtilities.lerp(fArr3[30], fArr3[33], f11);
        float lerp2 = AndroidUtilities.lerp(fArr3[31], fArr3[34], f11);
        float lerp3 = AndroidUtilities.lerp(fArr3[32], fArr3[35], f11);
        f6Var.getClass();
        float max2 = Math.max(lerp, Math.max(lerp2, lerp3));
        float min3 = max2 - Math.min(lerp, Math.min(lerp2, lerp3));
        float f18 = 0.55f * max2;
        if (min3 > f18) {
            float f19 = f18 / min3;
            lerp = com.google.android.gms.internal.play_billing.k3.y(lerp, max2, f19, max2);
            lerp2 = com.google.android.gms.internal.play_billing.k3.y(lerp2, max2, f19, max2);
            lerp3 = com.google.android.gms.internal.play_billing.k3.y(lerp3, max2, f19, max2);
        }
        if (f6Var.e != null && lerp == f6Var.f && lerp2 == f6Var.g && lerp3 == f6Var.h) {
            return;
        }
        f6Var.f = lerp;
        f6Var.g = lerp2;
        f6Var.h = lerp3;
        if (f6.k == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPremultiplied = false;
            options.inSampleSize = 2;
            Bitmap decodeResource = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.wallet_card_diamond_layers, options);
            int width = decodeResource.getWidth();
            f6.l = width;
            int[] iArr2 = new int[decodeResource.getHeight() * width];
            f6.k = iArr2;
            int i28 = f6.l;
            decodeResource.getPixels(iArr2, 0, i28, 0, 0, i28, decodeResource.getHeight());
            decodeResource.recycle();
            int[] iArr3 = new int[f6.k.length];
            int i29 = 0;
            while (true) {
                iArr = f6.k;
                if (i29 >= iArr.length) {
                    break;
                }
                iArr3[i29] = iArr[i29] & (-16777216);
                i29++;
            }
            int i30 = f6.l;
            Bitmap createBitmap = Bitmap.createBitmap(iArr3, i30, iArr.length / i30, Bitmap.Config.ARGB_8888);
            float f20 = f6.l / 28.0f;
            Paint paint = new Paint();
            BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
            paint.setMaskFilter(new BlurMaskFilter(5.0f * f20, blur));
            f6.m = createBitmap.extractAlpha(paint, f6.o);
            paint.setMaskFilter(new BlurMaskFilter(f20 * 1.5f, blur));
            f6.n = createBitmap.extractAlpha(paint, f6.p);
            createBitmap.recycle();
        }
        int[] iArr4 = new int[f6.k.length];
        while (true) {
            int[] iArr5 = f6.k;
            if (i10 >= iArr5.length) {
                int i31 = f6.l;
                f6Var.e = Bitmap.createBitmap(iArr4, i31, iArr5.length / i31, Bitmap.Config.ARGB_8888);
                f6Var.invalidateSelf();
                return;
            } else {
                float f21 = ((r7 >> 16) & 255) / 255.0f;
                float f22 = ((r7 >> 8) & 255) / 255.0f;
                iArr4[i10] = (iArr5[i10] & (-16777216)) | (f6.a((f22 * lerp) + f21) << 16) | (f6.a((f22 * lerp2) + f21) << 8) | f6.a((f22 * lerp3) + f21);
                i10++;
            }
        }
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
        if (this.a0 != null) {
            NotificationCenter.getInstance(this.W).addObserver(this, NotificationCenter.walletUpdate);
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
            NotificationCenter.getInstance(this.W).removeObserver(this, NotificationCenter.walletUpdate);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.r = f7;
        this.y.setAdditionalTilt(f7);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.S = i10;
        this.y.setCardIcon(i10);
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.R)) {
            return;
        }
        this.R = str;
        Context context = getContext();
        Bitmap createBitmap = Bitmap.createBitmap(1640, MediaDataController.MAX_STYLE_RUNS_COUNT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(1527.738f, 500.2976f);
        canvas.rotate(90.0f);
        Paint paint = new Paint(193);
        paint.setColor(-1);
        paint.setTypeface(f(context));
        paint.setTextSize(47.345238f);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f7 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        String[] split = e(str).split("\\n");
        canvas.drawText(split[0], 0.0f, (-27.333332f) + f7, paint);
        if (split.length > 1) {
            canvas.drawText(split[1], 0.0f, f7 + 27.333332f, paint);
        }
        setEngravingBitmap(createBitmap);
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        this.y.setOnClickListener(onClickListener);
    }

    public void setDebugBackdrop(TLRPC.TL_shareThemeBackdropOption tL_shareThemeBackdropOption) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            this.e0 = tL_shareThemeBackdropOption == null ? null : tL_shareThemeBackdropOption.name;
            this.d0 = null;
            if (tL_shareThemeBackdropOption != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = new TL_stars.starGiftAttributeBackdrop();
                stargiftattributebackdrop.center_color = tL_shareThemeBackdropOption.center_color;
                stargiftattributebackdrop.edge_color = tL_shareThemeBackdropOption.edge_color;
                stargiftattributebackdrop.pattern_color = tL_shareThemeBackdropOption.pattern_color;
                stargiftattributebackdrop.text_color = tL_shareThemeBackdropOption.text_color;
                float[] j10 = h7.j(stargiftattributebackdrop);
                float[] fArr = new float[18];
                this.d0 = fArr;
                System.arraycopy(j10, 0, fArr, 0, 3);
                System.arraycopy(j10, 0, this.d0, 3, 3);
                float[] fArr2 = this.d0;
                fArr2[7] = 0.5f;
                fArr2[6] = 0.5f;
                fArr2[9] = 1.0f;
                fArr2[8] = 1.0f;
                h7.n(fArr2, 0, stargiftattributebackdrop);
                h7.n(this.d0, 1, stargiftattributebackdrop);
            }
            setStickerStyle(this.c0);
        }
    }

    public void setDiamondOnCard(boolean z10) {
        this.a = z10;
        this.O.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.F = bitmap;
        this.y.setEngravingBitmap(bitmap);
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
        this.c0 = fArr;
        float[] fArr2 = this.d0;
        if (fArr2 != null) {
            fArr = fArr2;
        }
        this.b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.y.setStickerStyle(fArr);
        this.P.setTextColor(i0.a.f(fArr[8], h7.q(fArr, -7868417, 0), h7.q(fArr, -7868417, 3)));
        this.H.invalidate();
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
        this.J = new Paint(193);
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
                        this.b.I.invalidate();
                        break;
                    case 1:
                        x5 x5Var = this.b;
                        x5Var.O.invalidate();
                        x5Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        };
        bs bsVar = bs.h;
        this.L = new org.telegram.ui.Components.f6(runnable, 240L, bsVar, 0);
        this.W = UserConfig.selectedAccount;
        final int i13 = 1;
        this.j0 = new org.telegram.ui.Components.f6(new Runnable(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ x5 b;

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
                        x5 x5Var = this.b;
                        x5Var.O.invalidate();
                        x5Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        }, 240L, bsVar, 0);
        final int i14 = 2;
        this.k0 = new org.telegram.ui.Components.f6(new Runnable(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.I.invalidate();
                        break;
                    case 1:
                        x5 x5Var = this.b;
                        x5Var.O.invalidate();
                        x5Var.P.invalidate();
                        break;
                    default:
                        this.b.H.invalidate();
                        break;
                }
            }
        }, 240L, bsVar, 0);
        this.S = i10;
        this.T = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        s5 s5Var = new s5(getContext(), this.S, i11);
        this.y = s5Var;
        this.E = s5Var.getFrontFace();
        if (this.b0 != null) {
            setStickerStyle(this.c0);
        }
        setAdditionalTilt(this.r);
        setUseGyroscope(this.s);
        this.y.setOnClickListener(this.G);
        addView(this.y, 0, w7.z5.c(-2.0f, -1));
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            setEngravingBitmap(bitmap);
        }
        mk mkVar = new mk(this, context, 6);
        this.H = mkVar;
        if (o0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                o0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                o0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        mkVar.setTypeface(o0);
        mkVar.setTextColor(-1);
        mkVar.setTextSize(1, 13.0f);
        mkVar.setShadowLayer(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), -16611884);
        mkVar.setEllipsize(TextUtils.TruncateAt.END);
        mkVar.setMaxLines(1);
        mkVar.setSingleLine();
        this.E.addView(mkVar, w7.z5.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        x10 x10Var = new x10(this, context, 11);
        this.I = x10Var;
        this.E.addView(x10Var, w7.z5.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.E.addView(view, w7.z5.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.E.addView(linearLayout, d);
        v5 v5Var = new v5(this, context, 0);
        this.O = v5Var;
        v5Var.getDrawable().M = AndroidUtilities.dp(4096.0f);
        v5Var.c.m(0.35f, 320L, 3.5f, bsVar);
        v5Var.setScaleProperty(0.6f);
        v5Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        v5Var.setTextSize(AndroidUtilities.dp(23.0f));
        v5Var.setTextColor(-1);
        v5Var.setIgnoreRTL(true);
        linearLayout.addView(v5Var, w7.z5.n(-1, 28));
        v5 v5Var2 = new v5(this, context, 1);
        this.P = v5Var2;
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
