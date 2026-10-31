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
import org.telegram.messenger.b30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.u30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ns0;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Path D;
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.j H;
    public final t9 I;
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
    public final org.telegram.ui.Components.g9 T;
    public Drawable U;
    public final TextView V;
    public final TextView W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.p6 b;
    public boolean b0;
    public final org.telegram.ui.Components.r8 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final org.telegram.ui.Components.g9 e;
    public ShapeDrawable e0;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable w;
    public final na x;
    public final Paint y;

    public w3(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.y = new Paint(1);
        this.D = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new t9();
        this.a = i10;
        this.b = p6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        addView(g9Var, w7.b6.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.d(-1, -1.0f, zs.E1, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, w7.b6.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.i0.L(120.0f));
        TextView f7 = z20.f(linearLayout2, textView, w7.b6.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f7;
        f7.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f7.setEllipsize(truncateAt);
        f7.setIncludeFontPadding(false);
        f7.setGravity(16);
        f7.setTextSize(1, 13.0f);
        TextView f10 = z20.f(linearLayout2, f7, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = f10;
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        linearLayout2.addView(f10, w7.b6.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.b6.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
        this.T = g9Var2;
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(8.0f));
        linearLayout3.addView(g9Var2, w7.b6.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, w7.b6.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        z20.n(textView2, 1, 14.0f);
        TextView f11 = z20.f(linearLayout4, textView2, w7.b6.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.W = f11;
        f11.setTextSize(1, 14.0f);
        linearLayout4.addView(f11, w7.b6.t(-1, -2, 55, 0, 0, 0, 0));
        na naVar = new na(context);
        this.x = naVar;
        this.r = naVar.a;
        Drawable f12 = i0.a.f(context, R.drawable.wallet_gram_small);
        this.s = f12;
        f12.setBounds(0, 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        Drawable f13 = i0.a.f(context, R.drawable.wallet_nft);
        this.w = f13;
        f13.setBounds(0, 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        linearLayout.addView(naVar, w7.b6.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setIconColor(u30 u30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new s3(u30Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.t6.r1(this.F, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.b)));
        c();
        setElevation(org.telegram.messenger.i0.L(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        na naVar = this.x;
        naVar.d = f7;
        if (f7 > 0.0f && naVar.c == null) {
            a7 a7Var = new a7(40, naVar.getContext(), true);
            naVar.c = a7Var;
            a7Var.setContinuousRotation(300.0f);
            naVar.addView(naVar.c, w7.b6.c(40.0f, 40));
        }
        a7 a7Var2 = naVar.c;
        if (a7Var2 != null && f7 == 0.0f) {
            a7Var2.setPaused(true);
            naVar.removeView(naVar.c);
            naVar.c = null;
        }
        naVar.a();
        naVar.requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
    }

    public final void b(boolean z10, float f7) {
        TL_wallet.walletTransaction wallettransaction;
        a7 pendingDiamond;
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
                        RectF a2 = fa.a(pendingDiamond, this);
                        float centerX = a2.centerX();
                        float centerY = a2.centerY();
                        t9 t9Var = this.I;
                        t9Var.getClass();
                        float f11 = org.telegram.messenger.i0.p;
                        for (int i11 = 0; i11 < 56; i11++) {
                            int i12 = i11 % 10;
                            if (i12 <= 6) {
                                e = t9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e7 = t9Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                e = (t9Var.e(0.5f, 1.4f) * (t9Var.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e7 = t9Var.e(60.0f, 240.0f);
                            } else {
                                e = t9Var.e(0.0f, 6.2831855f);
                                e7 = t9Var.e(40.0f, 160.0f);
                            }
                            t9Var.a(centerX, centerY, e, e7 * f11, t9Var.e(2.2f, 6.5f) * f11, t9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        this.Q = !this.P && this.M;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
                    this.K = ofFloat;
                    ofFloat.setDuration(260L);
                    this.K.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.K.addUpdateListener(new r3(this, i10));
                    this.K.addListener(new ns0(this, 15));
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
        setTranslationY(org.telegram.messenger.i0.L(4.0f) * this.G);
        float f10 = this.G;
        na naVar = this.x;
        naVar.e = f10;
        naVar.a();
    }

    public final void d() {
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.d();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a7 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a2 = fa.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a2.centerX(), a2.centerY(), 1.5f);
        }
        t9 t9Var = this.I;
        t9Var.c(canvas);
        if (t9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f7 = this.F;
        if (f7 <= 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.J;
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        Paint paint = this.y;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
        float f10 = 255.0f * f7;
        paint.setAlpha(Math.round(f10));
        canvas.drawCircle(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), org.telegram.messenger.i0.L(8.0f) * f7, paint);
        paint.setColor(w02);
        paint.setAlpha(Math.round(f10));
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), org.telegram.messenger.i0.L(7.0f) * f7, paint);
        e(canvas, (uptimeMillis % 1000) * 0.36f, org.telegram.messenger.i0.L(4.6f) * f7);
        e(canvas, ((uptimeMillis % 6000) * 0.06f) + 120.0f, org.telegram.messenger.i0.L(3.2f) * f7);
        float f11 = (uptimeMillis % 1600) / 1600.0f;
        float width = getWidth() * 0.5f;
        float width2 = (((width * 2.0f) + getWidth()) * f11) + (-width);
        float f12 = width / 2.0f;
        float f13 = width2 - f12;
        float f14 = width2 + f12;
        int i11 = 16777215 & w02;
        paint.setShader(new LinearGradient(f13, 0.0f, f14, 0.0f, new int[]{i11, w02, -7346433, i11}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setAlpha(Math.round(f7 * 150.0f * ((float) Math.sin(f11 * 3.141592653589793d))));
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        canvas.drawRoundRect(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), getWidth() - org.telegram.messenger.i0.L(1.0f), getHeight() - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint);
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
        Path path = this.D;
        path.rewind();
        path.addCircle(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), org.telegram.messenger.i0.L(10.0f) * this.F, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(org.telegram.messenger.i0.L(52.0f), org.telegram.messenger.i0.L(51.0f), (((float) Math.cos(radians)) * f10) + org.telegram.messenger.i0.L(52.0f), (((float) Math.sin(radians)) * f10) + org.telegram.messenger.i0.L(51.0f), this.y);
    }

    public final void f(boolean z10) {
        this.O = z10;
        na naVar = this.x;
        naVar.f = z10;
        naVar.a();
        b(!z10, (this.N || z10) ? 1.0f : 0.0f);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, v3 v3Var, boolean z10) {
        boolean z11;
        TLRPC.WebDocument webDocument;
        int i10 = u3.b;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        boolean z12 = wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction);
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
        org.telegram.ui.Components.g9 g9Var = this.e;
        TextView textView2 = this.f;
        if (z15) {
            g9Var.setVisibility(8);
            setIconColor(u30.x);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(cd.L0(2131743107, null));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? cd.L0(2131742999, null) : v3Var.a(wallettransaction.peer.address));
            z11 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z16 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i11 = this.a;
            u30 u30Var = u30.n;
            z11 = true;
            org.telegram.ui.Components.r8 r8Var = this.c;
            u30 u30Var2 = u30.c;
            if (z16) {
                TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (Z1 != null) {
                    g9Var.setVisibility(0);
                    r8Var.r(Z1);
                    g9Var.e(Z1, r8Var);
                    textView2.setText(h20.p(Z1));
                } else {
                    g9Var.setVisibility(8);
                    if (!this.c0) {
                        u30Var2 = u30Var;
                    }
                    setIconColor(u30Var2);
                    imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(v3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(wallettransaction.peer.channel_id));
                if (L0 != null) {
                    g9Var.setVisibility(0);
                    r8Var.q(L0);
                    g9Var.e(L0, r8Var);
                    textView2.setText(L0.title);
                } else {
                    g9Var.setVisibility(8);
                    if (!this.c0) {
                        u30Var2 = u30Var;
                    }
                    setIconColor(u30Var2);
                    imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(!TextUtils.isEmpty(wallettransaction.peer.domain) ? wallettransaction.peer.domain : v3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                g9Var.setVisibility(8);
                if (this.c0) {
                    u30Var2 = u30Var;
                }
                setIconColor(u30Var2);
                imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                textView2.setText(cd.L0(2131743011, null));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                g9Var.setVisibility(8);
                setIconColor(u30Var2);
                if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(cd.L0(2131743009, null));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(cd.L0(2131743010, null));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                g9Var.setVisibility(8);
                if (!this.c0) {
                    u30Var2 = u30Var;
                }
                setIconColor(u30Var2);
                imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? cd.L0(2131742999, null) : v3Var.a(wallettransaction.peer.address));
                } else {
                    textView2.setText(wallettransaction.peer.domain);
                }
            }
        }
        String str = wallettransaction.peer.address;
        boolean z17 = (str == null || !TextUtils.equals(textView2.getText(), v3Var.a(str)) || textView2.length() <= 9) ? false : z11;
        this.d0 = z17;
        textView2.setSingleLine(!z17);
        textView2.setEllipsize(this.d0 ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth(this.d0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : org.telegram.messenger.i0.L(120.0f));
        textView2.getLayoutParams().height = this.d0 ? -2 : org.telegram.messenger.i0.L(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(cd.L0(2131743148, null));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    textView.setText(cd.L0(this.c0 ? 2131743101 : 2131743100, null));
                } else if (wallettransaction.nft != null) {
                    textView.setText(cd.L0(this.c0 ? 2131743111 : 2131743082, null));
                } else {
                    textView.setText(cd.L0(this.c0 ? 2131743112 : 2131743083, null));
                }
            }
        }
        boolean z18 = wallettransaction.pending;
        TextView textView3 = this.n;
        if (z18) {
            textView3.setText(th.u7.a(textView3, cd.L0(2131743040, null)));
        } else {
            int i12 = wallettransaction.date;
            textView3.setText(i12 == 0 ? "" : cd.Q(i12));
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        org.telegram.ui.Components.g9 g9Var2 = this.T;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i13 = org.telegram.ui.ActionBar.t6.y6;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
            if (this.U == null) {
                this.U = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            }
            Drawable drawable = this.U;
            org.telegram.ui.ActionBar.a7.y(this, drawable, i13, p6Var, PorterDuff.Mode.SRC_IN);
            this.e0 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(8.0f), org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.1f, i13);
            ra1 ra1Var = new ra1(z11 ? 1 : 0);
            ra1 ra1Var2 = new ra1(2);
            int i14 = L.a;
            float f7 = L.d;
            org.telegram.ui.ActionBar.p6 p6Var2 = this.b;
            int Q = org.telegram.ui.ActionBar.a7.Q(i14, -1, 2, f7, p6Var2);
            ra1Var2.d(Q, this);
            org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(100, this);
            x10.c(i14, -1, 2, f7, p6Var2);
            x10.n = ra1Var;
            x10.o = ra1Var2;
            x10.m = false;
            x10.g = Q;
            eq eqVar = new eq(this.e0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                g9Var2.j(ic.p(b30.c(webDocument2)), "46_46", eqVar, wallettransaction.nft);
            } else {
                g9Var2.setImageDrawable(eqVar);
            }
            this.V.setText(wallettransaction.nft.name);
            this.W.setText(cd.L0(wallettransaction.nft.isPhoneNumber() ? 2131743199 : wallettransaction.nft.isUsername() ? 2131743197 : wallettransaction.nft.isGift() ? 2131743201 : 2131743202, null));
        } else {
            linearLayout.setVisibility(8);
            g9Var2.b();
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
            if (this.c0) {
                org.telegram.ui.ActionBar.a7.y(this, drawable3, org.telegram.ui.ActionBar.t6.ik, p6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(cd.L0(2131743113, null));
            } else {
                org.telegram.ui.ActionBar.a7.y(this, drawable3, org.telegram.ui.ActionBar.t6.z6, p6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(cd.L0(2131743084, null));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z19 = this.c0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder q6 = k0.q(k0.o(abs, false), 0.78571427f);
            if (abs != 0 && z19) {
                q6.insert(0, (CharSequence) "+");
            } else if (abs != 0 && !z19) {
                q6.insert(0, (CharSequence) "–");
            }
            textView4.setText(q6);
        }
        int visibility = textView4.getVisibility();
        na naVar = this.x;
        naVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = naVar.a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        naVar.b.setImageDrawable(drawable2);
        naVar.f = this.O;
        naVar.a();
        b(z12, (this.N || this.O) ? 1.0f : 0.0f);
        this.a0 = z10;
        updateColors();
        invalidate();
    }

    public a7 getPendingDiamond() {
        return this.x.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(true, (this.N || this.O) ? 1.0f : 0.0f);
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
        na naVar = this.x;
        naVar.f = false;
        naVar.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.a0 || this.F >= 1.0f) {
            return;
        }
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.y;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.t6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.t6.k0.getAlpha()));
        canvas.drawRect(cd.X ? 0.0f : org.telegram.messenger.i0.L(71.0f), getHeight() - 1, getWidth() - (cd.X ? org.telegram.messenger.i0.L(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        this.E.setColor(org.telegram.ui.ActionBar.t6.r1(this.F, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        int i12 = org.telegram.ui.ActionBar.t6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        this.x.a.setTextColor((!this.b0 || this.N) ? this.c0 ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ik, p6Var) : org.telegram.ui.ActionBar.t6.w0(i11, p6Var) : org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, p6Var);
        LinearLayout linearLayout = this.S;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w02) {
                shapeDrawable.getPaint().setColor(w02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(10.0f), w02));
        }
        this.V.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.W.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
    }
}
