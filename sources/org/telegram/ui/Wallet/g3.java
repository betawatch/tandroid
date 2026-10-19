package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tf1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class g3 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.k H;
    public final k9 I;
    public long J;
    public ValueAnimator K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public TL_wallet.walletTransaction R;
    public final LinearLayout S;
    public final org.telegram.ui.Components.w9 T;
    public final TextView U;
    public final TextView V;
    public boolean W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.d6 b;
    public boolean b0;
    public final org.telegram.ui.Components.h9 c;
    public boolean c0;
    public final ImageView d;
    public final org.telegram.ui.Components.w9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable v;
    public final da w;
    public final Paint x;
    public final Path y;

    public g3(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.x = new Paint(1);
        this.y = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new k9();
        this.a = i10;
        this.b = d6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.z5.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, w7.z5.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setMaxWidth(AndroidUtilities.dp(120.0f));
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout2, textView, w7.z5.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = i11;
        i11.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        i11.setEllipsize(truncateAt);
        i11.setIncludeFontPadding(false);
        i11.setGravity(16);
        i11.setTextSize(1, 13.0f);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout2, i11, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = i12;
        i12.setSingleLine(true);
        i12.setEllipsize(truncateAt);
        i12.setIncludeFontPadding(false);
        i12.setGravity(16);
        i12.setTextSize(1, 13.0f);
        linearLayout2.addView(i12, w7.z5.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.z5.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        this.T = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout3.addView(w9Var2, w7.z5.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, w7.z5.p(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.U = textView2;
        kk.k(14.0f, 1, textView2);
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout4, textView2, w7.z5.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.V = i13;
        i13.setTextSize(1, 14.0f);
        linearLayout4.addView(i13, w7.z5.t(-1, -2, 55, 0, 0, 0, 0));
        da daVar = new da(context);
        this.w = daVar;
        this.r = daVar.a;
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_gram_small).mutate();
        this.s = mutate;
        mutate.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.wallet_nft).mutate();
        this.v = mutate2;
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        linearLayout.addView(daVar, w7.z5.p(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(16.0f));
        setBackground(gradientDrawable);
        d();
    }

    private void setIconColor(v40 v40Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new c3(v40Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.h6.m1(this.F, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, this.b)));
        c();
        setElevation(AndroidUtilities.dp(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        da daVar = this.w;
        daVar.d = f7;
        if (f7 > 0.0f && daVar.c == null) {
            m6 m6Var = new m6(40, daVar.getContext(), true);
            daVar.c = m6Var;
            m6Var.setContinuousRotation(300.0f);
            daVar.addView(daVar.c, w7.z5.c(40.0f, 40));
        }
        m6 m6Var2 = daVar.c;
        if (m6Var2 != null && f7 == 0.0f) {
            m6Var2.setPaused(true);
            daVar.removeView(daVar.c);
            daVar.c = null;
        }
        daVar.a();
        daVar.requestLayout();
        invalidate();
    }

    public final void b(float f7, boolean z10) {
        TL_wallet.walletTransaction wallettransaction;
        m6 pendingDiamond;
        float e;
        float e7;
        if (z10 && this.K != null && this.L == f7) {
            return;
        }
        this.L = f7;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        if (!z10 || f7 != 0.0f || this.F <= 0.0f || isAttachedToWindow()) {
            if (z10) {
                float f10 = this.F;
                if (f10 != f7) {
                    int i10 = 0;
                    if (f7 == 0.0f && f10 > 0.0f && (wallettransaction = this.R) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a2 = v9.a(this, pendingDiamond);
                        float centerX = a2.centerX();
                        float centerY = a2.centerY();
                        k9 k9Var = this.I;
                        k9Var.getClass();
                        float f11 = AndroidUtilities.density;
                        for (int i11 = 0; i11 < 56; i11++) {
                            int i12 = i11 % 10;
                            if (i12 <= 6) {
                                e = k9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e7 = k9Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                e = (k9Var.e(0.5f, 1.4f) * (k9Var.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e7 = k9Var.e(60.0f, 240.0f);
                            } else {
                                e = k9Var.e(0.0f, 6.2831855f);
                                e7 = k9Var.e(40.0f, 160.0f);
                            }
                            k9Var.a(centerX, centerY, e, e7 * f11, k9Var.e(2.2f, 6.5f) * f11, k9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        this.Q = !this.P && this.M;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
                    this.K = ofFloat;
                    ofFloat.setDuration(260L);
                    this.K.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.K.addUpdateListener(new b3(this, i10));
                    this.K.addListener(new tf1(this, 2));
                    this.K.start();
                    return;
                }
            }
            setPendingProgress(f7);
        }
    }

    public final void c() {
        float f7 = (this.F * 0.035f) + 1.0f;
        setScaleX(((this.G * 0.012f) + 1.0f) * f7);
        setScaleY((1.0f - (this.G * 0.04f)) * f7);
        setTranslationY(AndroidUtilities.dp(4.0f) * this.G);
        float f10 = this.G;
        da daVar = this.w;
        daVar.e = f10;
        daVar.a();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        org.telegram.ui.ActionBar.d6 d6Var = this.b;
        this.E.setColor(org.telegram.ui.ActionBar.h6.m1(this.F, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        this.w.a.setTextColor((!this.a0 || this.N) ? this.b0 ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, d6Var) : org.telegram.ui.ActionBar.h6.w0(i11, d6Var) : org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        this.S.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.a7, d6Var)));
        this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.V.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a2 = v9.a((ViewGroup) getRootView(), pendingDiamond);
            LaunchActivity.c0(a2.centerX(), a2.centerY(), 1.5f);
        }
        k9 k9Var = this.I;
        k9Var.c(canvas);
        if (k9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f7 = this.F;
        if (f7 <= 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.J;
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        org.telegram.ui.ActionBar.d6 d6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        Paint paint = this.x;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
        float f10 = 255.0f * f7;
        paint.setAlpha(Math.round(f10));
        canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(8.0f) * f7, paint);
        paint.setColor(w02);
        paint.setAlpha(Math.round(f10));
        paint.setStrokeWidth(AndroidUtilities.dp(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(7.0f) * f7, paint);
        f(canvas, (uptimeMillis % 1000) * 0.36f, AndroidUtilities.dp(4.6f) * f7);
        f(canvas, ((uptimeMillis % 6000) * 0.06f) + 120.0f, AndroidUtilities.dp(3.2f) * f7);
        float f11 = (uptimeMillis % 1600) / 1600.0f;
        float width = getWidth() * 0.5f;
        float width2 = (((width * 2.0f) + getWidth()) * f11) + (-width);
        float f12 = width / 2.0f;
        float f13 = width2 - f12;
        float f14 = width2 + f12;
        int i11 = 16777215 & w02;
        paint.setShader(new LinearGradient(f13, 0.0f, f14, 0.0f, new int[]{i11, w02, -7346433, i11}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setAlpha(Math.round(f7 * 150.0f * ((float) Math.sin(f11 * 3.141592653589793d))));
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        canvas.drawRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getWidth() - AndroidUtilities.dp(1.0f), getHeight() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        paint.setShader(null);
        if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.F <= 0.0f || !(view == this.e || view == this.d)) {
            return super.drawChild(canvas, view, j10);
        }
        int save = canvas.save();
        Path path = this.y;
        path.rewind();
        path.addCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(10.0f) * this.F, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e() {
        o1.k kVar = this.H;
        if (kVar != null) {
            kVar.c();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    public final void f(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), (((float) Math.cos(radians)) * f10) + AndroidUtilities.dp(52.0f), (((float) Math.sin(radians)) * f10) + AndroidUtilities.dp(51.0f), this.x);
    }

    public final void g(boolean z10) {
        this.O = z10;
        da daVar = this.w;
        daVar.f = z10;
        daVar.a();
        b((this.N || z10) ? 1.0f : 0.0f, !z10);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public m6 getPendingDiamond() {
        return this.w.c;
    }

    public final void h(TL_wallet.walletTransaction wallettransaction, f3 f3Var, boolean z10) {
        boolean z11;
        TLRPC.WebDocument webDocument;
        int i10 = e3.a;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        boolean z12 = wallettransaction2 != null && e3.a(wallettransaction2, wallettransaction);
        if (!z12) {
            this.O = false;
            this.P = false;
            this.Q = false;
            this.J = SystemClock.uptimeMillis();
            e();
            this.I.a.clear();
        }
        this.R = wallettransaction;
        boolean z13 = wallettransaction.pending;
        this.N = z13 && !wallettransaction.failed;
        boolean z14 = wallettransaction.incoming;
        this.M = (z14 || wallettransaction.key_change || wallettransaction.nft != null) ? false : true;
        this.a0 = z13 || wallettransaction.failed;
        this.b0 = z14;
        boolean z15 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.w9 w9Var = this.e;
        TextView textView2 = this.f;
        if (z15) {
            w9Var.setVisibility(8);
            setIconColor(v40.w);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? LocaleController.getString(R.string.WalletUnknown) : f3Var.a(wallettransaction.peer.address));
            z11 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z16 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i11 = this.a;
            v40 v40Var = v40.n;
            org.telegram.ui.Components.h9 h9Var = this.c;
            z11 = true;
            v40 v40Var2 = v40.c;
            if (z16) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (user != null) {
                    w9Var.setVisibility(0);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                    textView2.setText(UserObject.getUserName(user));
                } else {
                    w9Var.setVisibility(8);
                    if (this.b0) {
                        v40Var = v40Var2;
                    }
                    setIconColor(v40Var);
                    imageView.setImageResource(this.b0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(f3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(wallettransaction.peer.channel_id));
                if (chat != null) {
                    w9Var.setVisibility(0);
                    h9Var.k(i11, chat);
                    w9Var.e(chat, h9Var);
                    textView2.setText(chat.title);
                } else {
                    w9Var.setVisibility(8);
                    if (this.b0) {
                        v40Var = v40Var2;
                    }
                    setIconColor(v40Var);
                    imageView.setImageResource(this.b0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(!TextUtils.isEmpty(wallettransaction.peer.domain) ? wallettransaction.peer.domain : f3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                w9Var.setVisibility(8);
                if (!this.b0) {
                    v40Var = v40Var2;
                }
                setIconColor(v40Var);
                imageView.setImageResource(this.b0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                textView2.setText(LocaleController.getString(R.string.WalletTransactionTelegram));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                w9Var.setVisibility(8);
                setIconColor(v40Var2);
                if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUpCrypto));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUp));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                w9Var.setVisibility(8);
                if (this.b0) {
                    v40Var = v40Var2;
                }
                setIconColor(v40Var);
                imageView.setImageResource(this.b0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? LocaleController.getString(R.string.WalletUnknown) : f3Var.a(wallettransaction.peer.address));
                } else {
                    textView2.setText(wallettransaction.peer.domain);
                }
            }
        }
        String str = wallettransaction.peer.address;
        boolean z17 = (str == null || !TextUtils.equals(textView2.getText(), f3Var.a(str)) || textView2.length() <= 9) ? false : z11;
        this.c0 = z17;
        textView2.setSingleLine(!z17);
        textView2.setEllipsize(this.c0 ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth(this.c0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : AndroidUtilities.dp(120.0f));
        textView2.getLayoutParams().height = this.c0 ? -2 : AndroidUtilities.dp(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(LocaleController.getString(R.string.WalletFailedTransfer));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    textView.setText(LocaleController.getString(this.b0 ? R.string.WalletMovedFromProfile : R.string.WalletMovedToProfile));
                } else if (wallettransaction.nft != null) {
                    textView.setText(LocaleController.getString(this.b0 ? R.string.WalletIncomingTransferNft : R.string.WalletOutgoingTransferNft));
                } else {
                    textView.setText(LocaleController.getString(this.b0 ? R.string.WalletIncomingTransfer : R.string.WalletOutgoingTransfer));
                }
            }
        }
        boolean z18 = wallettransaction.pending;
        TextView textView3 = this.n;
        if (z18) {
            textView3.setText(ci.ga.a(textView3, LocaleController.getString(R.string.WalletSending)));
        } else {
            int i12 = wallettransaction.date;
            textView3.setText(i12 == 0 ? "" : LocaleController.formatShortDateTime(i12));
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        org.telegram.ui.Components.w9 w9Var2 = this.T;
        org.telegram.ui.ActionBar.d6 d6Var = this.b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.y6, d6Var);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            zq zqVar = new zq(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, w02)), mutate);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                w9Var2.h(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "46_46", zqVar, wallettransaction.nft);
            } else {
                w9Var2.setImageDrawable(zqVar);
            }
            this.U.setText(wallettransaction.nft.name);
            this.V.setText(LocaleController.getString(wallettransaction.nft.isPhoneNumber() ? R.string.WalletCollectibleNumber : wallettransaction.nft.isUsername() ? R.string.WalletCollectibleUsername : wallettransaction.nft.isGift() ? R.string.WalletCollectibleGift : R.string.WalletCollectible));
        } else {
            linearLayout.setVisibility(8);
            w9Var2.b();
        }
        long j10 = wallettransaction.amount;
        Drawable drawable = this.s;
        Drawable drawable2 = this.v;
        TextView textView4 = this.r;
        if (j10 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            if (this.b0) {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, d6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletIncomingCollectibleAmount));
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletOutgoingCollectibleAmount));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable, null);
            boolean z19 = this.b0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder p5 = m0.p(m0.n(abs, false), 0.78571427f);
            if (abs != 0 && z19) {
                p5.insert(0, (CharSequence) "+");
            } else if (abs != 0 && !z19) {
                p5.insert(0, (CharSequence) "–");
            }
            textView4.setText(p5);
        }
        int visibility = textView4.getVisibility();
        da daVar = this.w;
        daVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable = drawable2;
        }
        TextView textView5 = daVar.a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        daVar.b.setImageDrawable(drawable);
        daVar.f = this.O;
        daVar.a();
        b((this.N || this.O) ? 1.0f : 0.0f, z12);
        this.W = z10;
        d();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b((this.N || this.O) ? 1.0f : 0.0f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e();
        this.I.a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        da daVar = this.w;
        daVar.f = false;
        daVar.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.W || this.F >= 1.0f) {
            return;
        }
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.x;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.h6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.h6.k0.getAlpha()));
        canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, getWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
