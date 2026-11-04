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
import b8.mf;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e20;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i81;
import org.telegram.ui.u70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public q1.g I;
    public final o9 J;
    public long K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public TL_wallet.walletTransaction S;
    public final LinearLayout T;
    public final org.telegram.ui.Components.k9 U;
    public Drawable V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public boolean b0;
    public final org.telegram.ui.Components.u8 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final org.telegram.ui.Components.k9 e;
    public boolean e0;
    public final TextView f;
    public ShapeDrawable f0;
    public final TextView h;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable w;
    public final ia x;
    public final Paint y;

    public u3(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new o9();
        this.a = i3;
        this.b = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.e = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(k9Var, mf.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, mf.d(-1, -1.0f, hs.E1, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, mf.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.g0.L(120.0f));
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout2, textView, mf.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f10;
        f10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout2, f10, mf.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = f11;
        f11.setSingleLine(true);
        f11.setEllipsize(truncateAt);
        f11.setIncludeFontPadding(false);
        f11.setGravity(16);
        f11.setTextSize(1, 13.0f);
        linearLayout2.addView(f11, mf.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, mf.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
        this.U = k9Var2;
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        linearLayout3.addView(k9Var2, mf.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, mf.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 14.0f);
        TextView f12 = org.telegram.messenger.camera.q.f(linearLayout4, textView2, mf.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.a0 = f12;
        f12.setTextSize(1, 14.0f);
        linearLayout4.addView(f12, mf.t(-1, -2, 55, 0, 0, 0, 0));
        ia iaVar = new ia(context);
        this.x = iaVar;
        this.r = iaVar.a;
        Drawable g7 = k2.p1.g(context, R.drawable.wallet_gram_small);
        this.s = g7;
        g7.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        Drawable g10 = k2.p1.g(context, R.drawable.wallet_nft);
        this.w = g10;
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        linearLayout.addView(iaVar, mf.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setIconColor(y20 y20Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new q3(y20Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f10) {
        this.G = f10;
        this.F.setColor(org.telegram.ui.ActionBar.k6.r1(this.G, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.b)));
        c();
        setElevation(org.telegram.messenger.g0.L(8.0f) * f10);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f10 = 0.0f;
        }
        ia iaVar = this.x;
        iaVar.d = f10;
        if (f10 > 0.0f && iaVar.c == null) {
            u6 u6Var = new u6(40, iaVar.getContext(), true);
            iaVar.c = u6Var;
            u6Var.setContinuousRotation(300.0f);
            iaVar.addView(iaVar.c, mf.c(40.0f, 40));
        }
        u6 u6Var2 = iaVar.c;
        if (u6Var2 != null && f10 == 0.0f) {
            u6Var2.setPaused(true);
            iaVar.removeView(iaVar.c);
            iaVar.c = null;
        }
        iaVar.a();
        iaVar.requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
    }

    public final void b(boolean z10, float f10) {
        TL_wallet.walletTransaction wallettransaction;
        u6 pendingDiamond;
        float e10;
        float e11;
        if (z10 && this.L != null && this.M == f10) {
            return;
        }
        this.M = f10;
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        if (!z10 || f10 != 0.0f || this.G <= 0.0f || isAttachedToWindow()) {
            if (z10) {
                float f11 = this.G;
                if (f11 != f10) {
                    int i3 = 0;
                    if (f10 == 0.0f && f11 > 0.0f && (wallettransaction = this.S) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a10 = aa.a(pendingDiamond, this);
                        float centerX = a10.centerX();
                        float centerY = a10.centerY();
                        o9 o9Var = this.J;
                        o9Var.getClass();
                        float f12 = org.telegram.messenger.g0.p;
                        for (int i10 = 0; i10 < 56; i10++) {
                            int i11 = i10 % 10;
                            if (i11 <= 6) {
                                e10 = o9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e11 = o9Var.e(140.0f, 560.0f);
                            } else if (i11 <= 8) {
                                e10 = (o9Var.e(0.5f, 1.4f) * (o9Var.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e11 = o9Var.e(60.0f, 240.0f);
                            } else {
                                e10 = o9Var.e(0.0f, 6.2831855f);
                                e11 = o9Var.e(40.0f, 160.0f);
                            }
                            o9Var.a(centerX, centerY, e10, e11 * f12, o9Var.e(2.2f, 6.5f) * f12, o9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        this.R = !this.Q && this.N;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f10);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new p3(this, i3));
                    this.L.addListener(new i81(this, 4));
                    this.L.start();
                    return;
                }
            }
            setPendingProgress(f10);
        }
    }

    public final void c() {
        float f10 = (this.G * 0.035f) + 1.0f;
        setScaleX(((this.H * 0.012f) + 1.0f) * f10);
        setScaleY((1.0f - (this.H * 0.04f)) * f10);
        setTranslationY(org.telegram.messenger.g0.L(4.0f) * this.H);
        float f11 = this.H;
        ia iaVar = this.x;
        iaVar.e = f11;
        iaVar.a();
    }

    public final void d() {
        q1.g gVar = this.I;
        if (gVar != null) {
            gVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a10 = aa.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a10.centerX(), a10.centerY(), 1.5f);
        }
        o9 o9Var = this.J;
        o9Var.c(canvas);
        if (o9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f10 = this.G;
        if (f10 <= 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.K;
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        Paint paint = this.y;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
        float f11 = 255.0f * f10;
        paint.setAlpha(Math.round(f11));
        canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(8.0f) * f10, paint);
        paint.setColor(w02);
        paint.setAlpha(Math.round(f11));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(7.0f) * f10, paint);
        e(canvas, (uptimeMillis % 1000) * 0.36f, org.telegram.messenger.g0.L(4.6f) * f10);
        e(canvas, ((uptimeMillis % 6000) * 0.06f) + 120.0f, org.telegram.messenger.g0.L(3.2f) * f10);
        float f12 = (uptimeMillis % 1600) / 1600.0f;
        float width = getWidth() * 0.5f;
        float width2 = (((width * 2.0f) + getWidth()) * f12) + (-width);
        float f13 = width / 2.0f;
        float f14 = width2 - f13;
        float f15 = width2 + f13;
        int i10 = 16777215 & w02;
        paint.setShader(new LinearGradient(f14, 0.0f, f15, 0.0f, new int[]{i10, w02, -7346433, i10}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setAlpha(Math.round(f10 * 150.0f * ((float) Math.sin(f12 * 3.141592653589793d))));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        canvas.drawRoundRect(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getWidth() - org.telegram.messenger.g0.L(1.0f), getHeight() - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
        paint.setShader(null);
        if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.G <= 0.0f || !(view == this.e || view == this.d)) {
            return super.drawChild(canvas, view, j10);
        }
        int save = canvas.save();
        Path path = this.E;
        path.rewind();
        path.addCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(10.0f) * this.G, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(Canvas canvas, float f10, float f11) {
        double radians = Math.toRadians(f10 - 90.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), (((float) Math.cos(radians)) * f11) + org.telegram.messenger.g0.L(52.0f), (((float) Math.sin(radians)) * f11) + org.telegram.messenger.g0.L(51.0f), this.y);
    }

    public final void f(boolean z10) {
        this.P = z10;
        ia iaVar = this.x;
        iaVar.f = z10;
        iaVar.a();
        b(!z10, (this.O || z10) ? 1.0f : 0.0f);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, t3 t3Var, boolean z10) {
        boolean z11;
        TLRPC.WebDocument webDocument;
        int i3 = s3.b;
        TL_wallet.walletTransaction wallettransaction2 = this.S;
        boolean z12 = wallettransaction2 != null && s3.i(wallettransaction2, wallettransaction);
        if (!z12) {
            this.P = false;
            this.Q = false;
            this.R = false;
            this.K = SystemClock.uptimeMillis();
            d();
            this.J.a.clear();
        }
        this.S = wallettransaction;
        boolean z13 = wallettransaction.pending;
        this.O = z13 && !wallettransaction.failed;
        boolean z14 = wallettransaction.incoming;
        this.N = (z14 || wallettransaction.key_change || wallettransaction.nft != null) ? false : true;
        this.c0 = z13 || wallettransaction.failed;
        this.d0 = z14;
        boolean z15 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.k9 k9Var = this.e;
        TextView textView2 = this.f;
        if (z15) {
            k9Var.setVisibility(8);
            setIconColor(y20.x);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(bd.M0(2131743091, null));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? bd.M0(2131742983, null) : t3Var.a(wallettransaction.peer.address));
            z11 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z16 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i10 = this.a;
            y20 y20Var = y20.n;
            z11 = true;
            org.telegram.ui.Components.u8 u8Var = this.c;
            y20 y20Var2 = y20.c;
            if (z16) {
                TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (a22 != null) {
                    k9Var.setVisibility(0);
                    u8Var.r(a22);
                    k9Var.e(a22, u8Var);
                    textView2.setText(l10.p(a22));
                } else {
                    k9Var.setVisibility(8);
                    if (!this.d0) {
                        y20Var2 = y20Var;
                    }
                    setIconColor(y20Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(t3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(wallettransaction.peer.channel_id));
                if (M0 != null) {
                    k9Var.setVisibility(0);
                    u8Var.q(M0);
                    k9Var.e(M0, u8Var);
                    textView2.setText(M0.title);
                } else {
                    k9Var.setVisibility(8);
                    if (!this.d0) {
                        y20Var2 = y20Var;
                    }
                    setIconColor(y20Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(!TextUtils.isEmpty(wallettransaction.peer.domain) ? wallettransaction.peer.domain : t3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                k9Var.setVisibility(8);
                if (this.d0) {
                    y20Var2 = y20Var;
                }
                setIconColor(y20Var2);
                imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                textView2.setText(bd.M0(2131742995, null));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                k9Var.setVisibility(8);
                setIconColor(y20Var2);
                if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(bd.M0(2131742993, null));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(bd.M0(2131742994, null));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                k9Var.setVisibility(8);
                if (!this.d0) {
                    y20Var2 = y20Var;
                }
                setIconColor(y20Var2);
                imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? bd.M0(2131742983, null) : t3Var.a(wallettransaction.peer.address));
                } else {
                    textView2.setText(wallettransaction.peer.domain);
                }
            }
        }
        String str = wallettransaction.peer.address;
        boolean z17 = (str == null || !TextUtils.equals(textView2.getText(), t3Var.a(str)) || textView2.length() <= 9) ? false : z11;
        this.e0 = z17;
        textView2.setSingleLine(!z17);
        textView2.setEllipsize(this.e0 ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth(this.e0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : org.telegram.messenger.g0.L(120.0f));
        textView2.getLayoutParams().height = this.e0 ? -2 : org.telegram.messenger.g0.L(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(bd.M0(2131743132, null));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    textView.setText(bd.M0(this.d0 ? 2131743085 : 2131743084, null));
                } else if (wallettransaction.nft != null) {
                    textView.setText(bd.M0(this.d0 ? 2131743095 : 2131743066, null));
                } else {
                    textView.setText(bd.M0(this.d0 ? 2131743096 : 2131743067, null));
                }
            }
        }
        boolean z18 = wallettransaction.pending;
        TextView textView3 = this.n;
        if (z18) {
            textView3.setText(ei.x9.a(textView3, bd.M0(2131743024, null)));
        } else {
            int i11 = wallettransaction.date;
            textView3.setText(i11 == 0 ? "" : bd.Q(i11));
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.T;
        org.telegram.ui.Components.k9 k9Var2 = this.U;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i12 = org.telegram.ui.ActionBar.k6.y6;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
            if (this.V == null) {
                this.V = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            }
            Drawable drawable = this.V;
            org.telegram.ui.ActionBar.r6.y(this, drawable, i12, e6Var, PorterDuff.Mode.SRC_IN);
            this.f0 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i12);
            u70 u70Var = new u70(16);
            u70 u70Var2 = new u70(17);
            int i13 = L.a;
            float f10 = L.d;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.b;
            int Q = org.telegram.ui.ActionBar.r6.Q(i13, -1, 2, f10, e6Var2);
            u70Var2.f(Q, this);
            org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(100, this);
            x10.c(i13, -1, 2, f10, e6Var2);
            x10.n = u70Var;
            x10.o = u70Var2;
            x10.m = false;
            x10.g = Q;
            xp xpVar = new xp(this.f0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                k9Var2.j(ac.p(e20.c(webDocument2)), "46_46", xpVar, wallettransaction.nft);
            } else {
                k9Var2.setImageDrawable(xpVar);
            }
            this.W.setText(wallettransaction.nft.name);
            this.a0.setText(bd.M0(wallettransaction.nft.isPhoneNumber() ? 2131743183 : wallettransaction.nft.isUsername() ? 2131743181 : wallettransaction.nft.isGift() ? 2131743185 : 2131743186, null));
        } else {
            linearLayout.setVisibility(8);
            k9Var2.b();
        }
        long j10 = wallettransaction.amount;
        Drawable drawable2 = this.s;
        Drawable drawable3 = this.w;
        TextView textView4 = this.r;
        if (j10 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.d0) {
                org.telegram.ui.ActionBar.r6.y(this, drawable3, org.telegram.ui.ActionBar.k6.ik, e6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(bd.M0(2131743097, null));
            } else {
                org.telegram.ui.ActionBar.r6.y(this, drawable3, org.telegram.ui.ActionBar.k6.z6, e6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(bd.M0(2131743068, null));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z19 = this.d0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder q10 = k0.q(k0.o(abs, false), 0.78571427f);
            if (abs != 0 && z19) {
                q10.insert(0, (CharSequence) "+");
            } else if (abs != 0 && !z19) {
                q10.insert(0, (CharSequence) "–");
            }
            textView4.setText(q10);
        }
        int visibility = textView4.getVisibility();
        ia iaVar = this.x;
        iaVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = iaVar.a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        iaVar.b.setImageDrawable(drawable2);
        iaVar.f = this.P;
        iaVar.a();
        b(z12, (this.O || this.P) ? 1.0f : 0.0f);
        this.b0 = z10;
        updateColors();
        invalidate();
    }

    public u6 getPendingDiamond() {
        return this.x.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(true, (this.O || this.P) ? 1.0f : 0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d();
        this.J.a.clear();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        this.P = false;
        ia iaVar = this.x;
        iaVar.f = false;
        iaVar.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.b0 || this.G >= 1.0f) {
            return;
        }
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.y;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.k6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.G) * org.telegram.ui.ActionBar.k6.k0.getAlpha()));
        canvas.drawRect(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, getWidth() - (bd.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.F.setColor(org.telegram.ui.ActionBar.k6.r1(this.G, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        this.x.a.setTextColor((!this.c0 || this.O) ? this.d0 ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, e6Var) : org.telegram.ui.ActionBar.k6.w0(i10, e6Var) : org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, e6Var);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w02) {
                shapeDrawable.getPaint().setColor(w02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), w02));
        }
        this.W.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        this.a0.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
    }
}
