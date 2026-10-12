package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.PowerManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public class h5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface V;
    public static Typeface W;
    public FrameLayout E;
    public FrameLayout F;
    public Bitmap G;
    public View.OnClickListener H;
    public final TextView I;
    public final View J;
    public final LinearLayout K;
    public final f5 L;
    public final org.telegram.ui.Components.s6 M;
    public final FrameLayout.LayoutParams N;
    public String O;
    public int P;
    public final int Q;
    public float R;
    public float S;
    public int T;
    public j0 U;
    public boolean a;
    public float b;
    public final Matrix c;
    public final Matrix d;
    public final Matrix e;
    public final RectF f;
    public boolean h;
    public boolean n;
    public final boolean r;
    public float s;
    public float v;
    public final Matrix w;
    public final Matrix x;
    public final Matrix y;

    public h5(Context context, boolean z10) {
        this(R.drawable.wallet_card_qr, 45, context, z10);
    }

    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder c(long j10) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return j0.o(decimalFormat.format(BigDecimal.valueOf(j10, 9)), 0.8f);
    }

    public static String d(String str) {
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

    public static void f(View view, Matrix matrix) {
        if (!(view.getParent() instanceof View)) {
            matrix.reset();
            return;
        }
        f((View) view.getParent(), matrix);
        matrix.preTranslate(view.getLeft() - r0.getScrollX(), view.getTop() - r0.getScrollY());
        matrix.preConcat(view.getMatrix());
    }

    public final void a() {
        boolean z10 = this.n;
        int i10 = this.Q;
        if (z10) {
            c5 c5Var = new c5(this.P, i10, getContext(), false);
            this.E = c5Var;
            this.F = c5Var.getFrontFace();
        } else {
            p5 p5Var = new p5(getContext(), this.P, i10);
            this.E = p5Var;
            this.F = p5Var.getFrontFace();
        }
        setAdditionalTilt(this.s);
        setUseGyroscope(this.v);
        FrameLayout frameLayout = this.E;
        if (frameLayout instanceof p5) {
            ((p5) frameLayout).setDiamondAlpha(1.0f - this.R);
        }
        this.E.setOnClickListener(this.H);
        addView(this.E, 0, w7.a6.d(-2.0f, -1));
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            setEngravingBitmap(bitmap);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            Object obj = objArr[0];
            j0 j0Var = this.U;
            if (obj == j0Var) {
                g(j0Var);
            }
        }
    }

    public final void e(float f7, float f10) {
        if (this.R == f7 && this.S == f10) {
            return;
        }
        this.R = f7;
        if (f7 == 0.0f) {
            this.h = false;
        }
        this.S = f10;
        FrameLayout frameLayout = this.E;
        if (frameLayout instanceof p5) {
            ((p5) frameLayout).setDiamondAlpha(1.0f - f7);
        }
        this.L.invalidate();
    }

    public final void g(j0 j0Var) {
        if (j0Var == null) {
            return;
        }
        int i10 = j0Var.a;
        setCardHolder(UserObject.getUserName(UserConfig.getInstance(i10).getCurrentUser()).toUpperCase());
        if (j0Var.r() != null) {
            setCardNumber(b(j0Var.r().toUpperCase()));
        }
        if (j0Var.D()) {
            long t10 = j0Var.t();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString("GRAM");
            spannableString.setSpan(new br(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) c(t10));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
            this.L.setText(spannableStringBuilder);
            long round = Math.round(MessagesController.getInstance(i10).config.tonUsdRate.get() * (t10 / 1.0E9d) * 100.0d);
            this.M.setText(BillingController.getInstance().formatCurrency(round, "USD", 2, round % 100 == 0));
        }
    }

    public View getBalanceAnchor() {
        return this.J;
    }

    public LinearLayout getBalanceLayout() {
        return this.K;
    }

    public org.telegram.ui.Components.s6 getBalanceView() {
        return this.L;
    }

    public TextView getCardHolderView() {
        return this.I;
    }

    public float getCardRotationX() {
        FrameLayout frameLayout = this.E;
        return frameLayout instanceof c5 ? ((c5) frameLayout).getCardRotationX() : ((p5) frameLayout).getCardRotationX();
    }

    public float getCardRotationY() {
        FrameLayout frameLayout = this.E;
        return frameLayout instanceof c5 ? ((c5) frameLayout).getCardRotationY() : ((p5) frameLayout).getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.F;
    }

    public org.telegram.ui.Components.s6 getUsdBalanceView() {
        return this.M;
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
        if (this.U != null) {
            NotificationCenter.getInstance(this.T).addObserver(this, NotificationCenter.walletUpdate);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = getParent() instanceof View ? (View) getParent() : null;
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.U != null) {
            NotificationCenter.getInstance(this.T).removeObserver(this, NotificationCenter.walletUpdate);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.s = f7;
        FrameLayout frameLayout = this.E;
        if (frameLayout instanceof c5) {
            ((c5) frameLayout).setAdditionalTilt(f7);
        } else {
            ((p5) frameLayout).setAdditionalTilt(f7);
        }
    }

    public void setCardHolder(CharSequence charSequence) {
        this.I.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.P = i10;
        FrameLayout frameLayout = this.E;
        if (frameLayout instanceof c5) {
            ((c5) frameLayout).setCardIcon(i10);
        } else {
            ((p5) frameLayout).setCardIcon(i10);
        }
    }

    public void setCardNumber(String str) {
        if (str == null || str.equals(this.O)) {
            return;
        }
        this.O = str;
        Context context = getContext();
        Bitmap createBitmap = Bitmap.createBitmap(1640, MediaDataController.MAX_STYLE_RUNS_COUNT, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(4.8809524f, 4.8809524f);
        canvas.translate(313.0f, 102.5f);
        canvas.rotate(90.0f);
        canvas.scale(1.18f, 1.0f);
        Paint paint = new Paint(129);
        paint.setColor(-1);
        if (V == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                V = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 700").setWeight(700).build();
            } else {
                V = Typeface.create(AndroidUtilities.getTypeface("fonts/rmono_var.ttf"), 1);
            }
        }
        paint.setTypeface(V);
        paint.setTextSize(9.7f);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f7 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        String[] split = d(str).split("\\n");
        canvas.drawText(split[0], 0.0f, (-5.6f) + f7, paint);
        if (split.length > 1) {
            canvas.drawText(split[1], 0.0f, f7 + 5.6f, paint);
        }
        setEngravingBitmap(createBitmap);
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.H = onClickListener;
        this.E.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z10) {
        this.a = z10;
        if (!z10) {
            FrameLayout frameLayout = this.E;
            if (frameLayout instanceof p5) {
                ((p5) frameLayout).c(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.L.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.G = bitmap;
        FrameLayout frameLayout = this.E;
        if (frameLayout instanceof c5) {
            ((c5) frameLayout).setEngravingBitmap(bitmap);
        } else {
            ((p5) frameLayout).setEngravingBitmap(bitmap);
        }
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        FrameLayout frameLayout = this.E;
        if (frameLayout instanceof p5) {
            ((p5) frameLayout).setOnFrontContentPresented(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void setUse2D(boolean z10) {
        boolean z11 = z10 | this.r;
        if (this.n == z11) {
            return;
        }
        int childCount = this.F.getChildCount();
        View[] viewArr = new View[childCount];
        ViewGroup.LayoutParams[] layoutParamsArr = new ViewGroup.LayoutParams[childCount];
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.F.getChildAt(i10);
            viewArr[i10] = childAt;
            layoutParamsArr[i10] = childAt.getLayoutParams();
        }
        this.F.removeAllViews();
        removeView(this.E);
        this.n = z11;
        a();
        for (int i11 = 0; i11 < childCount; i11++) {
            this.F.addView(viewArr[i11], layoutParamsArr[i11]);
        }
    }

    public void setUseGyroscope(float f7) {
        this.v = f7;
        FrameLayout frameLayout = this.E;
        if (frameLayout instanceof c5) {
            ((c5) frameLayout).setUseGyroscope(f7);
        } else {
            ((p5) frameLayout).setUseGyroscope(f7);
        }
    }

    public h5(int i10, int i11, Context context, boolean z10) {
        super(context);
        this.b = 1.0f;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new RectF();
        this.v = 1.0f;
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Matrix();
        this.T = UserConfig.selectedAccount;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean z11 = powerManager != null && powerManager.isPowerSaveMode();
        this.r = z11;
        this.n = z10 || z11;
        this.P = i10;
        this.Q = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        a();
        TextView textView = new TextView(context);
        this.I = textView;
        if (W == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                W = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                W = AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            }
        }
        textView.setTypeface(W);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.6f);
        textView.setShadowLayer(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), -16611884);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setSingleLine();
        this.F.addView(textView, w7.a6.a(-2.0f, 24.0f, 16.6f, 64.0f, 16.6f, -1, 83));
        View view = new View(context);
        this.J = view;
        this.F.addView(view, w7.a6.a(1.0f, 24.0f, 0.0f, 0.0f, 0.0f, 1, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams a2 = w7.a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 19);
        this.N = a2;
        this.F.addView(linearLayout, a2);
        f5 f5Var = new f5(this, context, i11);
        this.L = f5Var;
        f5Var.getDrawable().M = AndroidUtilities.dp(4096.0f);
        es esVar = es.h;
        f5Var.c.m(0.35f, 320L, 3.5f, esVar);
        f5Var.setScaleProperty(0.6f);
        f5Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        f5Var.setTextSize(AndroidUtilities.dp(24.0f));
        f5Var.setTextColor(-1);
        f5Var.setIgnoreRTL(true);
        linearLayout.addView(f5Var, w7.a6.n(-1, 28));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true, true, true);
        this.M = s6Var;
        s6Var.c.m(0.35f, 320L, 3.5f, esVar);
        s6Var.setScaleProperty(0.6f);
        s6Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTextColor(-7868417);
        s6Var.setLayoutDirection(0);
        s6Var.setTextDirection(3);
        s6Var.setGravity(19);
        s6Var.setIgnoreRTL(true);
        linearLayout.addView(s6Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 16));
    }
}
