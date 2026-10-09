package org.telegram.ui.Wallet;

import ai.qc;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ep0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.k H;
    public final l8 I;
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
    public final y9 T;
    public final TextView U;
    public final TextView V;
    public boolean W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public boolean b0;
    public final j9 c;
    public boolean c0;
    public final ImageView d;
    public final y9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable v;
    public final d9 w;
    public final Paint x;
    public final Path y;

    public x2(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = new j9((org.telegram.ui.ActionBar.e6) null);
        this.x = new Paint(1);
        this.y = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new l8();
        this.a = i10;
        this.b = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.a(46.0f, 13.0f, 12.0f, 0.0f, 15.0f, 46, 51));
        y9 y9Var = new y9(context);
        this.e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, w7.x5.a(46.0f, 13.0f, 12.0f, 0.0f, 15.0f, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.a(-1.0f, 71.0f, 0.0f, 20.0f, 0.0f, -1, 119));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, w7.x5.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setMaxWidth(AndroidUtilities.dp(120.0f));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView, w7.x5.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = h;
        h.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        h.setEllipsize(truncateAt);
        h.setIncludeFontPadding(false);
        h.setGravity(16);
        h.setTextSize(1, 13.0f);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout2, h, w7.x5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = h10;
        h10.setSingleLine(true);
        h10.setEllipsize(truncateAt);
        h10.setIncludeFontPadding(false);
        h10.setGravity(16);
        h10.setTextSize(1, 13.0f);
        linearLayout2.addView(h10, w7.x5.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.x5.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        y9 y9Var2 = new y9(context);
        this.T = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout3.addView(y9Var2, w7.x5.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, w7.x5.p(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.U = textView2;
        bi.k(14.0f, 1, textView2);
        TextView h11 = com.google.android.gms.internal.vision.e2.h(linearLayout4, textView2, w7.x5.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.V = h11;
        h11.setTextSize(1, 14.0f);
        linearLayout4.addView(h11, w7.x5.t(-1, -2, 55, 0, 0, 0, 0));
        d9 d9Var = new d9(context);
        this.w = d9Var;
        this.r = d9Var.a;
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_gram_small).mutate();
        this.s = mutate;
        mutate.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.wallet_nft).mutate();
        this.v = mutate2;
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        linearLayout.addView(d9Var, w7.x5.p(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(16.0f));
        setBackground(gradientDrawable);
        e();
    }

    private void setIconColor(d50 d50Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new t2(d50Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.i6.m1(this.F, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.b)));
        c();
        setElevation(AndroidUtilities.dp(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        d9 d9Var = this.w;
        d9Var.d = f7;
        if (f7 > 0.0f && d9Var.c == null) {
            c6 c6Var = new c6(40, d9Var.getContext(), false);
            d9Var.c = c6Var;
            c6Var.setContinuousRotation(300.0f);
            d9Var.addView(d9Var.c, w7.x5.d(40.0f, 40));
        }
        c6 c6Var2 = d9Var.c;
        if (c6Var2 != null && f7 == 0.0f) {
            c6Var2.setPaused(true);
            d9Var.removeView(d9Var.c);
            d9Var.c = null;
        }
        d9Var.a();
        d9Var.requestLayout();
        invalidate();
    }

    public final void b(float f7, boolean z10) {
        TL_wallet.walletTransaction wallettransaction;
        c6 pendingDiamond;
        float e7;
        float e10;
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
                        RectF a2 = w8.a(this, pendingDiamond);
                        float centerX = a2.centerX();
                        float centerY = a2.centerY();
                        l8 l8Var = this.I;
                        l8Var.getClass();
                        float f11 = AndroidUtilities.density;
                        for (int i11 = 0; i11 < 56; i11++) {
                            int i12 = i11 % 10;
                            if (i12 <= 6) {
                                e7 = l8Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e10 = l8Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                e7 = (l8Var.e(0.5f, 1.4f) * (l8Var.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e10 = l8Var.e(60.0f, 240.0f);
                            } else {
                                e7 = l8Var.e(0.0f, 6.2831855f);
                                e10 = l8Var.e(40.0f, 160.0f);
                            }
                            l8Var.a(centerX, centerY, e7, e10 * f11, l8Var.e(2.2f, 6.5f) * f11, l8Var.e(0.8f, 1.4f), 2.4f);
                        }
                        this.Q = !this.P && this.M;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
                    this.K = ofFloat;
                    ofFloat.setDuration(260L);
                    this.K.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.K.addUpdateListener(new s2(this, i10));
                    this.K.addListener(new ep0(this, 28));
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
        d9 d9Var = this.w;
        d9Var.e = f10;
        d9Var.a();
    }

    public final void d() {
        o1.k kVar = this.H;
        if (kVar != null) {
            kVar.c();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a2 = w8.a((ViewGroup) getRootView(), pendingDiamond);
            LaunchActivity.b0(a2.centerX(), a2.centerY(), 1.5f);
        }
        l8 l8Var = this.I;
        l8Var.c(canvas);
        if (l8Var.d()) {
            postInvalidateOnAnimation();
        }
        float f7 = this.F;
        if (f7 <= 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.J;
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        Paint paint = this.x;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.F <= 0.0f || !(view == this.e || view == this.d)) {
            return super.drawChild(canvas, view, j3);
        }
        int save = canvas.save();
        Path path = this.y;
        path.rewind();
        path.addCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(10.0f) * this.F, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.E.setColor(org.telegram.ui.ActionBar.i6.m1(this.F, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        int i12 = org.telegram.ui.ActionBar.i6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        this.w.a.setTextColor((!this.a0 || this.N) ? this.b0 ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, e6Var) : org.telegram.ui.ActionBar.i6.w0(i11, e6Var) : org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        this.S.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.a7, e6Var)));
        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        this.V.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
    }

    public final void f(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), (((float) Math.cos(radians)) * f10) + AndroidUtilities.dp(52.0f), (((float) Math.sin(radians)) * f10) + AndroidUtilities.dp(51.0f), this.x);
    }

    public final void g(boolean z10) {
        this.O = z10;
        d9 d9Var = this.w;
        d9Var.f = z10;
        d9Var.a();
        b((this.N || z10) ? 1.0f : 0.0f, !z10);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public c6 getPendingDiamond() {
        return this.w.c;
    }

    public final void h(TL_wallet.walletTransaction wallettransaction, w2 w2Var, boolean z10) {
        TLRPC.WebDocument webDocument;
        int i10 = v2.a;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        boolean z11 = wallettransaction2 != null && v2.a(wallettransaction2, wallettransaction);
        if (!z11) {
            this.O = false;
            this.P = false;
            this.Q = false;
            this.J = SystemClock.uptimeMillis();
            d();
            this.I.a.clear();
        }
        this.R = wallettransaction;
        boolean z12 = wallettransaction.pending;
        this.N = z12 && !wallettransaction.failed;
        boolean z13 = wallettransaction.incoming;
        this.M = (z13 || wallettransaction.key_change || wallettransaction.nft != null) ? false : true;
        this.a0 = z12 || wallettransaction.failed;
        this.b0 = z13;
        boolean z14 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        y9 y9Var = this.e;
        TextView textView2 = this.f;
        if (z14) {
            y9Var.setVisibility(8);
            setIconColor(d50.w);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? LocaleController.getString(R.string.WalletUnknown) : w2Var.a(wallettransaction.peer.address));
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z15 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            d50 d50Var = d50.c;
            if (z15) {
                TLRPC.User user = MessagesController.getInstance(this.a).getUser(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (user != null) {
                    y9Var.setVisibility(0);
                    j9 j9Var = this.c;
                    j9Var.r(user);
                    y9Var.e(user, j9Var);
                    textView2.setText(UserObject.getUserName(user));
                } else {
                    y9Var.setVisibility(8);
                    setIconColor(d50Var);
                    imageView.setImageResource(this.b0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(w2Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                y9Var.setVisibility(8);
                setIconColor(d50Var);
                if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUpCrypto));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUp));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                y9Var.setVisibility(8);
                setIconColor(d50Var);
                imageView.setImageResource(this.b0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? LocaleController.getString(R.string.WalletUnknown) : w2Var.a(wallettransaction.peer.address));
                } else {
                    textView2.setText(wallettransaction.peer.domain);
                }
            }
        }
        String str = wallettransaction.peer.address;
        boolean z16 = str != null && TextUtils.equals(textView2.getText(), w2Var.a(str)) && textView2.length() > 9;
        this.c0 = z16;
        textView2.setSingleLine(!z16);
        textView2.setEllipsize(this.c0 ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth(this.c0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : AndroidUtilities.dp(120.0f));
        textView2.getLayoutParams().height = this.c0 ? -2 : AndroidUtilities.dp(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(LocaleController.getString(R.string.WalletFailedTransfer));
        } else if (!wallettransaction.key_change && !(wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnramp)) {
            if (wallettransaction.nft != null) {
                textView.setText(LocaleController.getString(this.b0 ? R.string.WalletIncomingTransferNft : R.string.WalletOutgoingTransferNft));
            } else {
                textView.setText(LocaleController.getString(this.b0 ? R.string.WalletIncomingTransfer : R.string.WalletOutgoingTransfer));
            }
        }
        boolean z17 = wallettransaction.pending;
        TextView textView3 = this.n;
        if (z17) {
            textView3.setText(qc.a(textView3, LocaleController.getString(R.string.WalletSending)));
        } else {
            int i11 = wallettransaction.date;
            textView3.setText(i11 == 0 ? "" : LocaleController.formatShortDateTime(i11));
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        y9 y9Var2 = this.T;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, e6Var);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            fr frVar = new fr(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.m1(0.1f, w02)), mutate);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                y9Var2.h(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "46_46", frVar, wallettransaction.nft);
            } else {
                y9Var2.setImageDrawable(frVar);
            }
            this.U.setText(wallettransaction.nft.name);
            this.V.setText(LocaleController.getString(wallettransaction.nft.isPhoneNumber() ? R.string.WalletCollectibleNumber : wallettransaction.nft.isUsername() ? R.string.WalletCollectibleUsername : wallettransaction.nft.isGift() ? R.string.WalletCollectibleGift : R.string.WalletCollectible));
        } else {
            linearLayout.setVisibility(8);
            y9Var2.b();
        }
        long j3 = wallettransaction.amount;
        Drawable drawable = this.s;
        Drawable drawable2 = this.v;
        TextView textView4 = this.r;
        if (j3 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            if (this.b0) {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, e6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletIncomingCollectibleAmount));
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletOutgoingCollectibleAmount));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable, null);
            boolean z18 = this.b0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder o9 = k0.o(k0.n(abs, false), 0.78571427f);
            if (abs != 0 && z18) {
                o9.insert(0, (CharSequence) "+");
            } else if (abs != 0 && !z18) {
                o9.insert(0, (CharSequence) "–");
            }
            textView4.setText(o9);
        }
        int visibility = textView4.getVisibility();
        d9 d9Var = this.w;
        d9Var.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable = drawable2;
        }
        TextView textView5 = d9Var.a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        d9Var.b.setImageDrawable(drawable);
        d9Var.f = this.O;
        d9Var.a();
        b((this.N || this.O) ? 1.0f : 0.0f, z11);
        this.W = z10;
        e();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b((this.N || this.O) ? 1.0f : 0.0f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d();
        this.I.a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        d9 d9Var = this.w;
        d9Var.f = false;
        d9Var.a();
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
        paint.setColor(org.telegram.ui.ActionBar.i6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.i6.k0.getAlpha()));
        canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, getWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
