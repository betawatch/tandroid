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
import android.os.PowerManager;
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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.mk;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public class x5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface p0;
    public static Typeface q0;
    public final Matrix E;
    public final Matrix F;
    public FrameLayout G;
    public FrameLayout H;
    public Bitmap I;
    public View.OnClickListener J;
    public final mk K;
    public final x10 L;
    public final Paint M;
    public float N;
    public final org.telegram.ui.Components.f6 O;
    public final View P;
    public final LinearLayout Q;
    public final v5 R;
    public final v5 S;
    public final FrameLayout.LayoutParams T;
    public String U;
    public int V;
    public final int W;
    public boolean a;
    public float a0;
    public float b;
    public float b0;
    public final Matrix c;
    public int c0;
    public final Matrix d;
    public m0 d0;
    public final Matrix e;
    public float[] e0;
    public final RectF f;
    public int f0;
    public int g0;
    public final RectF h;
    public float h0;
    public float i0;
    public final org.telegram.ui.Components.f6 j0;
    public final org.telegram.ui.Components.f6 k0;
    public final org.telegram.ui.Components.f6 l0;
    public float m0;
    public float n;
    public l6 n0;
    public boolean o0;
    public boolean r;
    public boolean s;
    public final boolean v;
    public float w;
    public float x;
    public final Matrix y;

    public x5(Context context, boolean z10) {
        this(R.drawable.wallet_card_qr, 46, context, z10);
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder f(long j10) {
        return m0.p(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(m0.o(j10, false))), 0.8f);
    }

    public static String g(String str) {
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

    public static Typeface h(Context context) {
        if (p0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                p0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                p0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        return p0;
    }

    public static void m(View view, Matrix matrix) {
        if (!(view.getParent() instanceof View)) {
            matrix.reset();
            return;
        }
        m((View) view.getParent(), matrix);
        matrix.preTranslate(view.getLeft() - r0.getScrollX(), view.getTop() - r0.getScrollY());
        matrix.preConcat(view.getMatrix());
    }

    public final float a() {
        float c10 = this.R.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.W) - 48.0f) * this.H.getWidth()) / 336.0f) - this.T.leftMargin) - AndroidUtilities.dp(8.0f));
        if (c10 > 0.0f) {
            return Math.min(1.0f, max / c10);
        }
        return 1.0f;
    }

    public final void b() {
        boolean z10 = this.s;
        int i10 = this.W;
        if (z10) {
            p5 p5Var = new p5(this.V, i10, getContext(), false);
            this.G = p5Var;
            this.H = p5Var.getFrontFace();
        } else {
            f6 f6Var = new f6(getContext(), this.V, i10);
            this.G = f6Var;
            this.H = f6Var.getFrontFace();
        }
        float[] fArr = this.e0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.w);
        setUseGyroscope(this.x);
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof f6) {
            ((f6) frameLayout).setDiamondAlpha(c());
        }
        this.G.setOnClickListener(this.J);
        addView(this.G, 0, w7.z5.d(-2.0f, -1));
        Bitmap bitmap = this.I;
        if (bitmap != null) {
            setEngravingBitmap(bitmap);
        }
    }

    public final float c() {
        return (1.0f - this.m0) * (1.0f - Math.max(0.0f, Math.min(1.0f, this.a0)));
    }

    public final void d(float f7, boolean z10, o2 o2Var, Runnable runnable) {
        if (z10) {
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), f7);
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), 0, f7);
            float dp = AndroidUtilities.dp(1.0f);
            float[] fArr = this.e0;
            o2Var.a(lerp, lerp2, dp, i0.a.f(f7, fArr != null ? i0.a.f(fArr[8], n7.m(fArr, -16611884, 0), n7.m(fArr, -16611884, 3)) : -16611884, 1493172224));
        } else {
            o2Var.a(f7 > 0.0f ? AndroidUtilities.dp(5.0f) : 0.0f, 0.0f, AndroidUtilities.dp(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        }
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        o2Var.a(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.o0 = true;
        runnable.run();
        this.o0 = false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            Object obj = objArr[0];
            m0 m0Var = this.d0;
            if (obj == m0Var) {
                n(m0Var);
            }
        }
    }

    public View getBalanceAnchor() {
        return this.P;
    }

    public LinearLayout getBalanceLayout() {
        return this.Q;
    }

    public org.telegram.ui.Components.q6 getBalanceView() {
        return this.R;
    }

    public TextView getCardHolderView() {
        return this.K;
    }

    public float getCardRotationX() {
        FrameLayout frameLayout = this.G;
        return frameLayout instanceof p5 ? ((p5) frameLayout).getCardRotationX() : ((f6) frameLayout).getCardRotationX();
    }

    public float getCardRotationY() {
        FrameLayout frameLayout = this.G;
        return frameLayout instanceof p5 ? ((p5) frameLayout).getCardRotationY() : ((f6) frameLayout).getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.H;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.H.indexOfChild(this.K);
        int indexOfChild2 = this.H.indexOfChild(this.Q);
        return indexOfChild < 0 ? indexOfChild2 < 0 ? this.H.getChildCount() : indexOfChild2 : indexOfChild2 < 0 ? indexOfChild : Math.min(indexOfChild, indexOfChild2);
    }

    public ArrayList<RectF> getStickerObstacles() {
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.H.getWidth() / 336.0f;
        float a2 = a();
        float c10 = this.R.getDrawable().c() * a2;
        float c11 = this.S.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.T;
        float f7 = layoutParams.leftMargin;
        float f10 = layoutParams.topMargin;
        float bottom = ((r3.getBottom() + r3.getTop()) / 2.0f) + f10;
        float height = (r3.getHeight() * a2) / 2.0f;
        arrayList.add(new RectF(f7, bottom - height, c10 + f7, bottom + height));
        mk mkVar = this.K;
        arrayList.add(new RectF(mkVar.getLeft(), mkVar.getTop(), mkVar.getLeft() + Math.min(mkVar.getWidth(), mkVar.getPaint().measureText(mkVar.getText().toString())), mkVar.getBottom()));
        arrayList.add(new RectF(this.H.getWidth() - (34.0f * width), 18.0f * width, this.H.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        j(path, this.H.getWidth(), this.H.getHeight());
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        arrayList.add(rectF);
        arrayList.add(new RectF(f7, r5.getTop() + f10, c11 + f7, f10 + r5.getBottom()));
        arrayList.add(this.a ? new RectF(this.h) : new RectF());
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.e0;
    }

    public org.telegram.ui.Components.q6 getUsdBalanceView() {
        return this.S;
    }

    public final boolean i(View view, Matrix matrix) {
        if (!isAttachedToWindow() || !view.isAttachedToWindow() || getRootView() != view.getRootView()) {
            return false;
        }
        View view2 = (View) this.H.getParent();
        FrameLayout frameLayout = this.G;
        boolean z10 = frameLayout instanceof p5;
        Matrix matrix2 = this.y;
        if (z10) {
            matrix2.set((Matrix) ((p5) frameLayout).b.b);
        } else {
            matrix2.set((Matrix) ((f6) frameLayout).n.b);
        }
        m(view2, matrix);
        matrix.preConcat(matrix2);
        matrix.preTranslate(this.H.getLeft() - view2.getScrollX(), this.H.getTop() - view2.getScrollY());
        matrix.preConcat(this.H.getMatrix());
        Matrix matrix3 = this.E;
        m(view, matrix3);
        Matrix matrix4 = this.F;
        if (!matrix3.invert(matrix4)) {
            return false;
        }
        matrix.postConcat(matrix4);
        return true;
    }

    public final void j(Path path, float f7, float f10) {
        float f11;
        float f12;
        float f13;
        path.rewind();
        if (this.s) {
            f11 = 0.36097562f;
            f12 = 0.5365854f;
            f13 = 0.03902439f;
        } else {
            f11 = 0.37044054f;
            f12 = 0.547121f;
            f13 = 0.03926231f;
        }
        float f14 = 336 - this.W;
        path.addRoundRect(((f14 - 48.0f) * f7) / 336.0f, f11 * f10, (f14 * f7) / 336.0f, f12 * f10, (8.0f * f7) / 336.0f, f13 * f10, Path.Direction.CW);
    }

    public final void k(float f7, float f10) {
        if (this.a0 == f7 && this.b0 == f10) {
            return;
        }
        this.a0 = f7;
        if (f7 == 0.0f) {
            this.r = false;
        }
        this.b0 = f10;
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof f6) {
            ((f6) frameLayout).setDiamondAlpha(c());
        }
        this.R.invalidate();
        this.S.invalidate();
    }

    public final void l(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new w5(this, R.drawable.wallet_gram_large), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) f(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new ki.y5(this, 4), length, spannableStringBuilder.length(), 33);
        this.R.setText(spannableStringBuilder);
        long round = Math.round(MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d);
        this.S.setText(BillingController.getInstance().formatCurrency(round, "USD", 2, round % 100 == 0));
    }

    public final void n(m0 m0Var) {
        if (m0Var == null) {
            return;
        }
        int i10 = m0Var.a;
        setCardHolder(UserObject.getUserName(UserConfig.getInstance(i10).getCurrentUser()).toUpperCase());
        if (m0Var.s() != null) {
            setCardNumber(e(m0Var.s().toUpperCase()));
        }
        if (m0Var.E()) {
            l(i10, m0Var.u());
        }
    }

    public final void o() {
        int[] iArr;
        if (this.n0 == null) {
            return;
        }
        float[] fArr = this.e0;
        int i10 = 0;
        float f7 = 1.0f;
        if (fArr == null) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        }
        float[] f10 = n7.f(fArr);
        float[] fArr2 = this.e0;
        if (fArr2 != null && fArr2.length > 8) {
            f7 = Math.max(0.0f, Math.min(1.0f, fArr2[8]));
        }
        l6 l6Var = this.n0;
        float lerp = AndroidUtilities.lerp(f10[30], f10[33], f7);
        float lerp2 = AndroidUtilities.lerp(f10[31], f10[34], f7);
        float lerp3 = AndroidUtilities.lerp(f10[32], f10[35], f7);
        if (l6Var.e != null && lerp == l6Var.f && lerp2 == l6Var.g && lerp3 == l6Var.h) {
            return;
        }
        l6Var.f = lerp;
        l6Var.g = lerp2;
        l6Var.h = lerp3;
        if (l6.k == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPremultiplied = false;
            options.inSampleSize = 2;
            Bitmap decodeResource = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.wallet_card_diamond_layers, options);
            int width = decodeResource.getWidth();
            l6.l = width;
            int[] iArr2 = new int[decodeResource.getHeight() * width];
            l6.k = iArr2;
            int i11 = l6.l;
            decodeResource.getPixels(iArr2, 0, i11, 0, 0, i11, decodeResource.getHeight());
            decodeResource.recycle();
            int[] iArr3 = new int[l6.k.length];
            int i12 = 0;
            while (true) {
                iArr = l6.k;
                if (i12 >= iArr.length) {
                    break;
                }
                iArr3[i12] = iArr[i12] & (-16777216);
                i12++;
            }
            int i13 = l6.l;
            Bitmap createBitmap = Bitmap.createBitmap(iArr3, i13, iArr.length / i13, Bitmap.Config.ARGB_8888);
            float f11 = l6.l / 28.0f;
            Paint paint = new Paint();
            BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
            paint.setMaskFilter(new BlurMaskFilter(5.0f * f11, blur));
            l6.m = createBitmap.extractAlpha(paint, l6.o);
            paint.setMaskFilter(new BlurMaskFilter(f11 * 1.5f, blur));
            l6.n = createBitmap.extractAlpha(paint, l6.p);
            createBitmap.recycle();
        }
        int[] iArr4 = new int[l6.k.length];
        while (true) {
            int[] iArr5 = l6.k;
            if (i10 >= iArr5.length) {
                int i14 = l6.l;
                l6Var.e = Bitmap.createBitmap(iArr4, i14, iArr5.length / i14, Bitmap.Config.ARGB_8888);
                l6Var.invalidateSelf();
                return;
            } else {
                float f12 = ((r6 >> 16) & 255) / 255.0f;
                float f13 = ((r6 >> 8) & 255) / 255.0f;
                iArr4[i10] = (iArr5[i10] & (-16777216)) | (l6.a((f13 * lerp) + f12) << 16) | (l6.a((f13 * lerp2) + f12) << 8) | l6.a((f13 * lerp3) + f12);
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
        if (this.d0 != null) {
            NotificationCenter.getInstance(this.c0).addObserver(this, NotificationCenter.walletUpdate);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.d0 != null) {
            NotificationCenter.getInstance(this.c0).removeObserver(this, NotificationCenter.walletUpdate);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.w = f7;
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof p5) {
            ((p5) frameLayout).setAdditionalTilt(f7);
        } else {
            ((f6) frameLayout).setAdditionalTilt(f7);
        }
    }

    public void setCardHolder(CharSequence charSequence) {
        this.K.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.V = i10;
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof p5) {
            ((p5) frameLayout).setCardIcon(i10);
        } else {
            ((f6) frameLayout).setCardIcon(i10);
        }
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.U)) {
            return;
        }
        this.U = str;
        Context context = getContext();
        Bitmap createBitmap = Bitmap.createBitmap(1640, MediaDataController.MAX_STYLE_RUNS_COUNT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(1527.738f, 500.2976f);
        canvas.rotate(90.0f);
        Paint paint = new Paint(193);
        paint.setColor(-1);
        paint.setTypeface(h(context));
        paint.setTextSize(47.345238f);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f7 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        String[] split = g(str).split("\\n");
        canvas.drawText(split[0], 0.0f, (-27.333332f) + f7, paint);
        if (split.length > 1) {
            canvas.drawText(split[1], 0.0f, f7 + 27.333332f, paint);
        }
        setEngravingBitmap(createBitmap);
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.J = onClickListener;
        this.G.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z10) {
        this.a = z10;
        if (!z10) {
            FrameLayout frameLayout = this.G;
            if (frameLayout instanceof f6) {
                ((f6) frameLayout).c(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.R.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.I = bitmap;
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof p5) {
            ((p5) frameLayout).setEngravingBitmap(bitmap);
        } else {
            ((f6) frameLayout).setEngravingBitmap(bitmap);
        }
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof f6) {
            ((f6) frameLayout).setOnFrontContentPresented(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f7) {
        this.G.setScaleX(f7);
        this.G.setScaleY(f7);
    }

    public void setStickerStyle(float[] fArr) {
        this.e0 = fArr;
        o();
        this.R.invalidate();
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof f6) {
            ((f6) frameLayout).setStickerStyle(fArr);
        } else {
            ((p5) frameLayout).setStickerStyle(fArr);
        }
        this.S.setTextColor(i0.a.f(fArr[8], n7.m(fArr, -7868417, 0), n7.m(fArr, -7868417, 3)));
        this.K.invalidate();
    }

    public void setUse2D(boolean z10) {
        boolean z11 = z10 | this.v;
        if (this.s == z11) {
            return;
        }
        int childCount = this.H.getChildCount();
        View[] viewArr = new View[childCount];
        ViewGroup.LayoutParams[] layoutParamsArr = new ViewGroup.LayoutParams[childCount];
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.H.getChildAt(i10);
            viewArr[i10] = childAt;
            layoutParamsArr[i10] = childAt.getLayoutParams();
        }
        this.H.removeAllViews();
        removeView(this.G);
        this.s = z11;
        b();
        for (int i11 = 0; i11 < childCount; i11++) {
            this.H.addView(viewArr[i11], layoutParamsArr[i11]);
        }
    }

    public void setUseGyroscope(float f7) {
        this.x = f7;
        FrameLayout frameLayout = this.G;
        if (frameLayout instanceof p5) {
            ((p5) frameLayout).setUseGyroscope(f7);
        } else {
            ((f6) frameLayout).setUseGyroscope(f7);
        }
    }

    public x5(int i10, int i11, Context context, boolean z10) {
        super(context);
        this.b = 1.0f;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new RectF();
        this.h = new RectF();
        this.x = 1.0f;
        this.y = new Matrix();
        this.E = new Matrix();
        this.F = new Matrix();
        this.M = new Paint(193);
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
                        this.b.L.invalidate();
                        break;
                    case 1:
                        x5 x5Var = this.b;
                        x5Var.R.invalidate();
                        x5Var.S.invalidate();
                        break;
                    case 2:
                        this.b.K.invalidate();
                        break;
                    default:
                        this.b.R.invalidate();
                        break;
                }
            }
        };
        bs bsVar = bs.h;
        this.O = new org.telegram.ui.Components.f6(runnable, 240L, bsVar, 0);
        this.c0 = UserConfig.selectedAccount;
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
                        this.b.L.invalidate();
                        break;
                    case 1:
                        x5 x5Var = this.b;
                        x5Var.R.invalidate();
                        x5Var.S.invalidate();
                        break;
                    case 2:
                        this.b.K.invalidate();
                        break;
                    default:
                        this.b.R.invalidate();
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
                        this.b.L.invalidate();
                        break;
                    case 1:
                        x5 x5Var = this.b;
                        x5Var.R.invalidate();
                        x5Var.S.invalidate();
                        break;
                    case 2:
                        this.b.K.invalidate();
                        break;
                    default:
                        this.b.R.invalidate();
                        break;
                }
            }
        }, 240L, bsVar, 0);
        final int i15 = 3;
        this.l0 = new org.telegram.ui.Components.f6(new Runnable(this) { // from class: org.telegram.ui.Wallet.t5
            public final /* synthetic */ x5 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.b.L.invalidate();
                        break;
                    case 1:
                        x5 x5Var = this.b;
                        x5Var.R.invalidate();
                        x5Var.S.invalidate();
                        break;
                    case 2:
                        this.b.K.invalidate();
                        break;
                    default:
                        this.b.R.invalidate();
                        break;
                }
            }
        }, 240L, bsVar, 0);
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean z11 = (powerManager != null && powerManager.isPowerSaveMode()) || LiteMode.isPowerSaverApplied() || SharedConfig.getDevicePerformanceClass() == 0;
        this.v = z11;
        this.s = z10 || z11;
        this.V = i10;
        this.W = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        b();
        mk mkVar = new mk(this, context, 6);
        this.K = mkVar;
        if (q0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                q0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                q0 = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        mkVar.setTypeface(q0);
        mkVar.setTextColor(-1);
        mkVar.setTextSize(1, 13.0f);
        mkVar.setShadowLayer(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), -16611884);
        mkVar.setEllipsize(TextUtils.TruncateAt.END);
        mkVar.setMaxLines(1);
        mkVar.setSingleLine();
        this.H.addView(mkVar, w7.z5.a(-2.0f, 24.0f, 0.0f, 64.0f, 17.2f, -1, 83));
        x10 x10Var = new x10(this, context, 11);
        this.L = x10Var;
        this.H.addView(x10Var, w7.z5.d(-1.0f, -1));
        View view = new View(context);
        this.P = view;
        this.H.addView(view, w7.z5.a(1.0f, 24.0f, 0.0f, 0.0f, 0.0f, 1, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams a2 = w7.z5.a(-2.0f, 24.0f, 71.0f, 24.0f, 0.0f, -1, 51);
        this.T = a2;
        this.H.addView(linearLayout, a2);
        v5 v5Var = new v5(this, context, 0);
        this.R = v5Var;
        v5Var.getDrawable().M = AndroidUtilities.dp(4096.0f);
        v5Var.c.m(0.35f, 320L, 3.5f, bsVar);
        v5Var.setScaleProperty(0.6f);
        v5Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        v5Var.setTextSize(AndroidUtilities.dp(23.0f));
        v5Var.setTextColor(-1);
        v5Var.setIgnoreRTL(true);
        linearLayout.addView(v5Var, w7.z5.n(-1, 28));
        v5 v5Var2 = new v5(this, context, 1);
        this.S = v5Var2;
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
