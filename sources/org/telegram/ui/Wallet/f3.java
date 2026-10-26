package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
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
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.x40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.j H;
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
    public final org.telegram.ui.Components.y9 T;
    public Drawable U;
    public final TextView V;
    public final TextView W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.u6 b;
    public boolean b0;
    public final org.telegram.ui.Components.j9 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final org.telegram.ui.Components.y9 e;
    public ShapeDrawable e0;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable v;
    public final da w;
    public final Paint x;
    public final Path y;

    public f3(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.x = new Paint(1);
        this.y = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new k9();
        this.a = i10;
        this.b = u6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, gb1.h(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, gb1.h(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, gb1.h(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, gb1.p(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setMaxWidth(AndroidUtilities.dp(120.0f));
        TextView e = vh.e(linearLayout2, textView, gb1.o(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = e;
        e.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        e.setEllipsize(truncateAt);
        e.setIncludeFontPadding(false);
        e.setGravity(16);
        e.setTextSize(1, 13.0f);
        TextView e10 = vh.e(linearLayout2, e, gb1.o(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = e10;
        e10.setSingleLine(true);
        e10.setEllipsize(truncateAt);
        e10.setIncludeFontPadding(false);
        e10.setGravity(16);
        e10.setTextSize(1, 13.0f);
        linearLayout2.addView(e10, gb1.o(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, gb1.o(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        this.T = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout3.addView(y9Var2, gb1.x(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, gb1.t(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        vh.j(14.0f, 1, textView2);
        TextView e11 = vh.e(linearLayout4, textView2, gb1.x(-1, -2, 55, 0, 0, 0, 0), context);
        this.W = e11;
        e11.setTextSize(1, 14.0f);
        linearLayout4.addView(e11, gb1.x(-1, -2, 55, 0, 0, 0, 0));
        da daVar = new da(context);
        this.w = daVar;
        this.r = daVar.a;
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_gram_small).mutate();
        this.s = mutate;
        mutate.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.wallet_nft).mutate();
        this.v = mutate2;
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        linearLayout.addView(daVar, gb1.t(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setIconColor(x40 x40Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new b3(x40Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.y6.o1(this.F, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.b)));
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
            l6 l6Var = new l6(40, daVar.getContext(), true);
            daVar.c = l6Var;
            l6Var.setContinuousRotation(300.0f);
            daVar.addView(daVar.c, gb1.g(40.0f, 40));
        }
        l6 l6Var2 = daVar.c;
        if (l6Var2 != null && f7 == 0.0f) {
            l6Var2.setPaused(true);
            daVar.removeView(daVar.c);
            daVar.c = null;
        }
        daVar.a();
        daVar.requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a7));
    }

    public final void b(float f7, boolean z10) {
        TL_wallet.walletTransaction wallettransaction;
        l6 pendingDiamond;
        float e;
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
                                e10 = k9Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                e = (k9Var.e(0.5f, 1.4f) * (k9Var.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e10 = k9Var.e(60.0f, 240.0f);
                            } else {
                                e = k9Var.e(0.0f, 6.2831855f);
                                e10 = k9Var.e(40.0f, 160.0f);
                            }
                            k9Var.a(centerX, centerY, e, e10 * f11, k9Var.e(2.2f, 6.5f) * f11, k9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        this.Q = !this.P && this.M;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
                    this.K = ofFloat;
                    ofFloat.setDuration(260L);
                    this.K.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.K.addUpdateListener(new a3(this, i10));
                    this.K.addListener(new fc1(this, 5));
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

    public final void d() {
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.c();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l6 pendingDiamond;
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
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        Paint paint = this.x;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
        float f10 = 255.0f * f7;
        paint.setAlpha(Math.round(f10));
        canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(8.0f) * f7, paint);
        paint.setColor(w02);
        paint.setAlpha(Math.round(f10));
        paint.setStrokeWidth(AndroidUtilities.dp(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(7.0f) * f7, paint);
        e(canvas, (uptimeMillis % 1000) * 0.36f, AndroidUtilities.dp(4.6f) * f7);
        e(canvas, ((uptimeMillis % 6000) * 0.06f) + 120.0f, AndroidUtilities.dp(3.2f) * f7);
        float f11 = (uptimeMillis % 1600) / 1600.0f;
        float width = getWidth() * 0.5f;
        float e = org.telegram.ui.d3.e(width, 2.0f, getWidth(), f11, -width);
        float f12 = width / 2.0f;
        float f13 = e - f12;
        float f14 = e + f12;
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

    public final void e(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), (((float) Math.cos(radians)) * f10) + AndroidUtilities.dp(52.0f), (((float) Math.sin(radians)) * f10) + AndroidUtilities.dp(51.0f), this.x);
    }

    public final void f(boolean z10) {
        this.O = z10;
        da daVar = this.w;
        daVar.f = z10;
        daVar.a();
        b((this.N || z10) ? 1.0f : 0.0f, !z10);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, e3 e3Var, boolean z10) {
        boolean z11;
        TLRPC.WebDocument webDocument;
        int i10 = d3.a;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        boolean z12 = wallettransaction2 != null && d3.a(wallettransaction2, wallettransaction);
        if (!z12) {
            this.O = false;
            this.P = false;
            this.Q = false;
            this.J = SystemClock.uptimeMillis();
            d();
            this.I.a.clear();
        }
        this.R = wallettransaction;
        boolean z13 = wallettransaction.pending;
        this.N = z13 && !wallettransaction.failed;
        boolean z14 = wallettransaction.incoming;
        this.M = (z14 || wallettransaction.key_change || wallettransaction.nft != null) ? false : true;
        this.b0 = z13 || wallettransaction.failed;
        this.c0 = z14;
        boolean z15 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.y9 y9Var = this.e;
        TextView textView2 = this.f;
        if (z15) {
            y9Var.setVisibility(8);
            setIconColor(x40.w);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? LocaleController.getString(R.string.WalletUnknown) : e3Var.a(wallettransaction.peer.address));
            z11 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z16 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i11 = this.a;
            x40 x40Var = x40.n;
            org.telegram.ui.Components.j9 j9Var = this.c;
            z11 = true;
            x40 x40Var2 = x40.c;
            if (z16) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (user != null) {
                    y9Var.setVisibility(0);
                    j9Var.r(user);
                    y9Var.f(user, j9Var);
                    textView2.setText(UserObject.getUserName(user));
                } else {
                    y9Var.setVisibility(8);
                    if (this.c0) {
                        x40Var = x40Var2;
                    }
                    setIconColor(x40Var);
                    imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(e3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(wallettransaction.peer.channel_id));
                if (chat != null) {
                    y9Var.setVisibility(0);
                    j9Var.k(i11, chat);
                    y9Var.f(chat, j9Var);
                    textView2.setText(chat.title);
                } else {
                    y9Var.setVisibility(8);
                    if (this.c0) {
                        x40Var = x40Var2;
                    }
                    setIconColor(x40Var);
                    imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(!TextUtils.isEmpty(wallettransaction.peer.domain) ? wallettransaction.peer.domain : e3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                y9Var.setVisibility(8);
                if (!this.c0) {
                    x40Var = x40Var2;
                }
                setIconColor(x40Var);
                imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                textView2.setText(LocaleController.getString(R.string.WalletTransactionTelegram));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                y9Var.setVisibility(8);
                setIconColor(x40Var2);
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
                if (this.c0) {
                    x40Var = x40Var2;
                }
                setIconColor(x40Var);
                imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? LocaleController.getString(R.string.WalletUnknown) : e3Var.a(wallettransaction.peer.address));
                } else {
                    textView2.setText(wallettransaction.peer.domain);
                }
            }
        }
        String str = wallettransaction.peer.address;
        boolean z17 = (str == null || !TextUtils.equals(textView2.getText(), e3Var.a(str)) || textView2.length() <= 9) ? false : z11;
        this.d0 = z17;
        textView2.setSingleLine(!z17);
        textView2.setEllipsize(this.d0 ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth(this.d0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : AndroidUtilities.dp(120.0f));
        textView2.getLayoutParams().height = this.d0 ? -2 : AndroidUtilities.dp(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(LocaleController.getString(R.string.WalletFailedTransfer));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    textView.setText(LocaleController.getString(this.c0 ? R.string.WalletMovedFromProfile : R.string.WalletMovedToProfile));
                } else if (wallettransaction.nft != null) {
                    textView.setText(LocaleController.getString(this.c0 ? R.string.WalletIncomingTransferNft : R.string.WalletOutgoingTransferNft));
                } else {
                    textView.setText(LocaleController.getString(this.c0 ? R.string.WalletIncomingTransfer : R.string.WalletOutgoingTransfer));
                }
            }
        }
        boolean z18 = wallettransaction.pending;
        TextView textView3 = this.n;
        if (z18) {
            textView3.setText(di.ea.a(textView3, LocaleController.getString(R.string.WalletSending)));
        } else {
            int i12 = wallettransaction.date;
            textView3.setText(i12 == 0 ? "" : LocaleController.formatShortDateTime(i12));
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        org.telegram.ui.Components.y9 y9Var2 = this.T;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i13 = org.telegram.ui.ActionBar.y6.y6;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
            if (this.U == null) {
                this.U = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            }
            Drawable drawable = this.U;
            org.telegram.ui.ActionBar.f7.y(this, drawable, i13, u6Var, PorterDuff.Mode.SRC_IN);
            this.e0 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.y6.o1(0.1f, w02));
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i13);
            org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(27);
            org.telegram.ui.Components.voip.c1 c1Var2 = new org.telegram.ui.Components.voip.c1(28);
            int i14 = L.a;
            float f7 = L.d;
            org.telegram.ui.ActionBar.u6 u6Var2 = this.b;
            int Q = org.telegram.ui.ActionBar.f7.Q(i14, -1, 2, f7, u6Var2);
            c1Var2.d(Q, this);
            org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(100, this);
            x9.c(i14, -1, 2, f7, u6Var2);
            x9.n = c1Var;
            x9.o = c1Var2;
            x9.m = false;
            x9.g = Q;
            ar arVar = new ar(this.e0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                y9Var2.h(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "46_46", arVar, wallettransaction.nft);
            } else {
                y9Var2.setImageDrawable(arVar);
            }
            this.V.setText(wallettransaction.nft.name);
            this.W.setText(LocaleController.getString(wallettransaction.nft.isPhoneNumber() ? R.string.WalletCollectibleNumber : wallettransaction.nft.isUsername() ? R.string.WalletCollectibleUsername : wallettransaction.nft.isGift() ? R.string.WalletCollectibleGift : R.string.WalletCollectible));
        } else {
            linearLayout.setVisibility(8);
            y9Var2.b();
        }
        long j10 = wallettransaction.amount;
        Drawable drawable2 = this.s;
        Drawable drawable3 = this.v;
        TextView textView4 = this.r;
        if (j10 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.c0) {
                org.telegram.ui.ActionBar.f7.y(this, drawable3, org.telegram.ui.ActionBar.y6.uj, u6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(LocaleController.getString(R.string.WalletIncomingCollectibleAmount));
            } else {
                org.telegram.ui.ActionBar.f7.y(this, drawable3, org.telegram.ui.ActionBar.y6.z6, u6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(LocaleController.getString(R.string.WalletOutgoingCollectibleAmount));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z19 = this.c0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder p10 = l0.p(l0.n(abs, false), 0.78571427f);
            if (abs != 0 && z19) {
                p10.insert(0, (CharSequence) "+");
            } else if (abs != 0 && !z19) {
                p10.insert(0, (CharSequence) "–");
            }
            textView4.setText(p10);
        }
        int visibility = textView4.getVisibility();
        da daVar = this.w;
        daVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = daVar.a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        daVar.b.setImageDrawable(drawable2);
        daVar.f = this.O;
        daVar.a();
        b((this.N || this.O) ? 1.0f : 0.0f, z12);
        this.a0 = z10;
        updateColors();
        invalidate();
    }

    public l6 getPendingDiamond() {
        return this.w.c;
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
        da daVar = this.w;
        daVar.f = false;
        daVar.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.a0 || this.F >= 1.0f) {
            return;
        }
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.x;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.y6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.y6.k0.getAlpha()));
        canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, getWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        this.E.setColor(org.telegram.ui.ActionBar.y6.o1(this.F, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        int i12 = org.telegram.ui.ActionBar.y6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        this.w.a.setTextColor((!this.b0 || this.N) ? this.c0 ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.uj, u6Var) : org.telegram.ui.ActionBar.y6.w0(i11, u6Var) : org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, u6Var);
        LinearLayout linearLayout = this.S;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w02) {
                shapeDrawable.getPaint().setColor(w02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(10.0f), w02));
        }
        this.V.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        this.W.setTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
    }
}
