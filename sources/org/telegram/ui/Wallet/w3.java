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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jo0;
import org.telegram.ui.u81;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class w3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Path D;
    public final GradientDrawable E;
    public float F;
    public float G;
    public r1.g H;
    public final q9 I;
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
    public final org.telegram.ui.Components.k9 T;
    public Drawable U;
    public final TextView V;
    public final TextView W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.h6 b;
    public boolean b0;
    public final org.telegram.ui.Components.v8 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final org.telegram.ui.Components.k9 e;
    public ShapeDrawable e0;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable w;
    public final ka x;
    public final Paint y;

    public w3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.y = new Paint(1);
        this.D = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new q9();
        this.a = i7;
        this.b = h6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.e = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(k9Var, c8.ha.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.d(-1, -1.0f, qs.E1, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, c8.ha.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.g0.L(120.0f));
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout2, textView, c8.ha.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f10;
        f10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout2, f10, c8.ha.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = f11;
        f11.setSingleLine(true);
        f11.setEllipsize(truncateAt);
        f11.setIncludeFontPadding(false);
        f11.setGravity(16);
        f11.setTextSize(1, 13.0f);
        linearLayout2.addView(f11, c8.ha.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, c8.ha.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
        this.T = k9Var2;
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        linearLayout3.addView(k9Var2, c8.ha.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, c8.ha.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 14.0f);
        TextView f12 = org.telegram.messenger.camera.q.f(linearLayout4, textView2, c8.ha.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.W = f12;
        f12.setTextSize(1, 14.0f);
        linearLayout4.addView(f12, c8.ha.t(-1, -2, 55, 0, 0, 0, 0));
        ka kaVar = new ka(context);
        this.x = kaVar;
        this.r = kaVar.a;
        Drawable h = jg.g.h(context, R.drawable.wallet_gram_small);
        this.s = h;
        h.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        Drawable h7 = jg.g.h(context, R.drawable.wallet_nft);
        this.w = h7;
        h7.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        linearLayout.addView(kaVar, c8.ha.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setIconColor(c30 c30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new s3(c30Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f10) {
        this.F = f10;
        this.E.setColor(org.telegram.ui.ActionBar.m6.r1(this.F, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.b)));
        c();
        setElevation(org.telegram.messenger.g0.L(8.0f) * f10);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f10 = 0.0f;
        }
        ka kaVar = this.x;
        kaVar.d = f10;
        if (f10 > 0.0f && kaVar.c == null) {
            x6 x6Var = new x6(40, kaVar.getContext(), true);
            kaVar.c = x6Var;
            x6Var.setContinuousRotation(300.0f);
            kaVar.addView(kaVar.c, c8.ha.c(40.0f, 40));
        }
        x6 x6Var2 = kaVar.c;
        if (x6Var2 != null && f10 == 0.0f) {
            x6Var2.setPaused(true);
            kaVar.removeView(kaVar.c);
            kaVar.c = null;
        }
        kaVar.a();
        kaVar.requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
    }

    public final void b(boolean z9, float f10) {
        TL_wallet.walletTransaction wallettransaction;
        x6 pendingDiamond;
        float e10;
        float e11;
        if (z9 && this.K != null && this.L == f10) {
            return;
        }
        this.L = f10;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        if (!z9 || f10 != 0.0f || this.F <= 0.0f || isAttachedToWindow()) {
            if (z9) {
                float f11 = this.F;
                if (f11 != f10) {
                    int i7 = 0;
                    if (f10 == 0.0f && f11 > 0.0f && (wallettransaction = this.R) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a10 = ca.a(pendingDiamond, this);
                        float centerX = a10.centerX();
                        float centerY = a10.centerY();
                        q9 q9Var = this.I;
                        q9Var.getClass();
                        float f12 = org.telegram.messenger.g0.p;
                        for (int i10 = 0; i10 < 56; i10++) {
                            int i11 = i10 % 10;
                            if (i11 <= 6) {
                                e10 = q9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e11 = q9Var.e(140.0f, 560.0f);
                            } else if (i11 <= 8) {
                                e10 = (q9Var.e(0.5f, 1.4f) * (q9Var.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e11 = q9Var.e(60.0f, 240.0f);
                            } else {
                                e10 = q9Var.e(0.0f, 6.2831855f);
                                e11 = q9Var.e(40.0f, 160.0f);
                            }
                            q9Var.a(centerX, centerY, e10, e11 * f12, q9Var.e(2.2f, 6.5f) * f12, q9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        this.Q = !this.P && this.M;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
                    this.K = ofFloat;
                    ofFloat.setDuration(260L);
                    this.K.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.K.addUpdateListener(new r3(this, i7));
                    this.K.addListener(new u81(this, 4));
                    this.K.start();
                    return;
                }
            }
            setPendingProgress(f10);
        }
    }

    public final void c() {
        float f10 = (this.F * 0.035f) + 1.0f;
        setScaleX(((this.G * 0.012f) + 1.0f) * f10);
        setScaleY((1.0f - (this.G * 0.04f)) * f10);
        setTranslationY(org.telegram.messenger.g0.L(4.0f) * this.G);
        float f11 = this.G;
        ka kaVar = this.x;
        kaVar.e = f11;
        kaVar.a();
    }

    public final void d() {
        r1.g gVar = this.H;
        if (gVar != null) {
            gVar.d();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a10 = ca.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a10.centerX(), a10.centerY(), 1.5f);
        }
        q9 q9Var = this.I;
        q9Var.c(canvas);
        if (q9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f10 = this.F;
        if (f10 <= 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.J;
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        Paint paint = this.y;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.F <= 0.0f || !(view == this.e || view == this.d)) {
            return super.drawChild(canvas, view, j3);
        }
        int save = canvas.save();
        Path path = this.D;
        path.rewind();
        path.addCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(10.0f) * this.F, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(Canvas canvas, float f10, float f11) {
        double radians = Math.toRadians(f10 - 90.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), (((float) Math.cos(radians)) * f11) + org.telegram.messenger.g0.L(52.0f), (((float) Math.sin(radians)) * f11) + org.telegram.messenger.g0.L(51.0f), this.y);
    }

    public final void f(boolean z9) {
        this.O = z9;
        ka kaVar = this.x;
        kaVar.f = z9;
        kaVar.a();
        b(!z9, (this.N || z9) ? 1.0f : 0.0f);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, v3 v3Var, boolean z9) {
        boolean z10;
        TLRPC.WebDocument webDocument;
        int i7 = u3.b;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        boolean z11 = wallettransaction2 != null && u3.i(wallettransaction2, wallettransaction);
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
        this.b0 = z12 || wallettransaction.failed;
        this.c0 = z13;
        boolean z14 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.k9 k9Var = this.e;
        TextView textView2 = this.f;
        if (z14) {
            k9Var.setVisibility(8);
            setIconColor(c30.x);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(id.M0(2131743081, null));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? id.M0(2131742973, null) : v3Var.a(wallettransaction.peer.address));
            z10 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z15 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i10 = this.a;
            c30 c30Var = c30.n;
            z10 = true;
            org.telegram.ui.Components.v8 v8Var = this.c;
            c30 c30Var2 = c30.c;
            if (z15) {
                TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (a22 != null) {
                    k9Var.setVisibility(0);
                    v8Var.r(a22);
                    k9Var.e(a22, v8Var);
                    textView2.setText(t10.p(a22));
                } else {
                    k9Var.setVisibility(8);
                    if (!this.c0) {
                        c30Var2 = c30Var;
                    }
                    setIconColor(c30Var2);
                    imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(v3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(wallettransaction.peer.channel_id));
                if (M0 != null) {
                    k9Var.setVisibility(0);
                    v8Var.q(M0);
                    k9Var.e(M0, v8Var);
                    textView2.setText(M0.title);
                } else {
                    k9Var.setVisibility(8);
                    if (!this.c0) {
                        c30Var2 = c30Var;
                    }
                    setIconColor(c30Var2);
                    imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(!TextUtils.isEmpty(wallettransaction.peer.domain) ? wallettransaction.peer.domain : v3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                k9Var.setVisibility(8);
                if (this.c0) {
                    c30Var2 = c30Var;
                }
                setIconColor(c30Var2);
                imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                textView2.setText(id.M0(2131742985, null));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                k9Var.setVisibility(8);
                setIconColor(c30Var2);
                if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(id.M0(2131742983, null));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(id.M0(2131742984, null));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                k9Var.setVisibility(8);
                if (!this.c0) {
                    c30Var2 = c30Var;
                }
                setIconColor(c30Var2);
                imageView.setImageResource(this.c0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? id.M0(2131742973, null) : v3Var.a(wallettransaction.peer.address));
                } else {
                    textView2.setText(wallettransaction.peer.domain);
                }
            }
        }
        String str = wallettransaction.peer.address;
        boolean z16 = (str == null || !TextUtils.equals(textView2.getText(), v3Var.a(str)) || textView2.length() <= 9) ? false : z10;
        this.d0 = z16;
        textView2.setSingleLine(!z16);
        textView2.setEllipsize(this.d0 ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth(this.d0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : org.telegram.messenger.g0.L(120.0f));
        textView2.getLayoutParams().height = this.d0 ? -2 : org.telegram.messenger.g0.L(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(id.M0(2131743122, null));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    textView.setText(id.M0(this.c0 ? 2131743075 : 2131743074, null));
                } else if (wallettransaction.nft != null) {
                    textView.setText(id.M0(this.c0 ? 2131743085 : 2131743056, null));
                } else {
                    textView.setText(id.M0(this.c0 ? 2131743086 : 2131743057, null));
                }
            }
        }
        boolean z17 = wallettransaction.pending;
        TextView textView3 = this.n;
        if (z17) {
            textView3.setText(di.w9.a(textView3, id.M0(2131743014, null)));
        } else {
            int i11 = wallettransaction.date;
            textView3.setText(i11 == 0 ? "" : id.Q(i11));
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        org.telegram.ui.Components.k9 k9Var2 = this.T;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i12 = org.telegram.ui.ActionBar.m6.y6;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
            if (this.U == null) {
                this.U = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            }
            Drawable drawable = this.U;
            org.telegram.ui.ActionBar.t6.x(this, drawable, i12, h6Var, PorterDuff.Mode.SRC_IN);
            this.e0 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i12);
            jo0 jo0Var = new jo0(11);
            jo0 jo0Var2 = new jo0(12);
            int i13 = K.a;
            float f10 = K.d;
            org.telegram.ui.ActionBar.h6 h6Var2 = this.b;
            int P = org.telegram.ui.ActionBar.t6.P(i13, -1, 2, f10, h6Var2);
            jo0Var2.c(P, this);
            org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(100, this);
            w10.c(i13, -1, 2, f10, h6Var2);
            w10.n = jo0Var;
            w10.o = jo0Var2;
            w10.m = false;
            w10.g = P;
            xp xpVar = new xp(this.e0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                k9Var2.j(hc.p(m20.c(webDocument2)), "46_46", xpVar, wallettransaction.nft);
            } else {
                k9Var2.setImageDrawable(xpVar);
            }
            this.V.setText(wallettransaction.nft.name);
            this.W.setText(id.M0(wallettransaction.nft.isPhoneNumber() ? 2131743173 : wallettransaction.nft.isUsername() ? 2131743171 : wallettransaction.nft.isGift() ? 2131743175 : 2131743176, null));
        } else {
            linearLayout.setVisibility(8);
            k9Var2.b();
        }
        long j3 = wallettransaction.amount;
        Drawable drawable2 = this.s;
        Drawable drawable3 = this.w;
        TextView textView4 = this.r;
        if (j3 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.c0) {
                org.telegram.ui.ActionBar.t6.x(this, drawable3, org.telegram.ui.ActionBar.m6.ik, h6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(id.M0(2131743087, null));
            } else {
                org.telegram.ui.ActionBar.t6.x(this, drawable3, org.telegram.ui.ActionBar.m6.z6, h6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(id.M0(2131743058, null));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z18 = this.c0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder q10 = l0.q(l0.o(abs, false), 0.78571427f);
            if (abs != 0 && z18) {
                q10.insert(0, (CharSequence) "+");
            } else if (abs != 0 && !z18) {
                q10.insert(0, (CharSequence) "–");
            }
            textView4.setText(q10);
        }
        int visibility = textView4.getVisibility();
        ka kaVar = this.x;
        kaVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = kaVar.a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        kaVar.b.setImageDrawable(drawable2);
        kaVar.f = this.O;
        kaVar.a();
        b(z11, (this.N || this.O) ? 1.0f : 0.0f);
        this.a0 = z9;
        updateColors();
        invalidate();
    }

    public x6 getPendingDiamond() {
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
        ka kaVar = this.x;
        kaVar.f = false;
        kaVar.a();
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
        paint.setColor(org.telegram.ui.ActionBar.m6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.m6.k0.getAlpha()));
        canvas.drawRect(id.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, getWidth() - (id.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        this.E.setColor(org.telegram.ui.ActionBar.m6.r1(this.F, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        int i11 = org.telegram.ui.ActionBar.m6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        this.x.a.setTextColor((!this.b0 || this.N) ? this.c0 ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ik, h6Var) : org.telegram.ui.ActionBar.m6.w0(i10, h6Var) : org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, h6Var);
        LinearLayout linearLayout = this.S;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w02) {
                shapeDrawable.getPaint().setColor(w02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), w02));
        }
        this.V.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        this.W.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
    }
}
