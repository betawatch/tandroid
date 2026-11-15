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
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g71;
import org.telegram.ui.t70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public r1.g I;
    public final r9 J;
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
    public final org.telegram.ui.Components.i9 U;
    public Drawable V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public boolean b0;
    public final org.telegram.ui.Components.t8 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final org.telegram.ui.Components.i9 e;
    public boolean e0;
    public final TextView f;
    public ShapeDrawable f0;
    public final TextView h;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable w;
    public final la x;
    public final Paint y;

    public v3(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new r9();
        this.a = i7;
        this.b = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.e = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(i9Var, c8.ja.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ja.d(-1, -1.0f, ns.E1, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, c8.ja.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.g0.L(120.0f));
        TextView f10 = i20.f(linearLayout2, textView, c8.ja.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f10;
        f10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        TextView f11 = i20.f(linearLayout2, f10, c8.ja.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = f11;
        f11.setSingleLine(true);
        f11.setEllipsize(truncateAt);
        f11.setIncludeFontPadding(false);
        f11.setGravity(16);
        f11.setTextSize(1, 13.0f);
        linearLayout2.addView(f11, c8.ja.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, c8.ja.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
        this.U = i9Var2;
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        linearLayout3.addView(i9Var2, c8.ja.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, c8.ja.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        i20.o(textView2, 1, 14.0f);
        TextView f12 = i20.f(linearLayout4, textView2, c8.ja.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.a0 = f12;
        f12.setTextSize(1, 14.0f);
        linearLayout4.addView(f12, c8.ja.t(-1, -2, 55, 0, 0, 0, 0));
        la laVar = new la(context);
        this.x = laVar;
        this.r = laVar.a;
        Drawable g10 = i5.c.g(context, R.drawable.wallet_gram_small);
        this.s = g10;
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        Drawable g11 = i5.c.g(context, R.drawable.wallet_nft);
        this.w = g11;
        g11.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        linearLayout.addView(laVar, c8.ja.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setIconColor(f30 f30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new r3(f30Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f10) {
        this.G = f10;
        this.F.setColor(org.telegram.ui.ActionBar.j6.r1(this.G, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.b)));
        c();
        setElevation(org.telegram.messenger.g0.L(8.0f) * f10);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f10 = 0.0f;
        }
        la laVar = this.x;
        laVar.d = f10;
        if (f10 > 0.0f && laVar.c == null) {
            w6 w6Var = new w6(40, laVar.getContext(), true);
            laVar.c = w6Var;
            w6Var.setContinuousRotation(300.0f);
            laVar.addView(laVar.c, c8.ja.c(40.0f, 40));
        }
        w6 w6Var2 = laVar.c;
        if (w6Var2 != null && f10 == 0.0f) {
            w6Var2.setPaused(true);
            laVar.removeView(laVar.c);
            laVar.c = null;
        }
        laVar.a();
        laVar.requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.a7));
    }

    public final void b(boolean z10, float f10) {
        TL_wallet.walletTransaction wallettransaction;
        w6 pendingDiamond;
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
                    int i7 = 0;
                    if (f10 == 0.0f && f11 > 0.0f && (wallettransaction = this.S) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a10 = da.a(pendingDiamond, this);
                        float centerX = a10.centerX();
                        float centerY = a10.centerY();
                        r9 r9Var = this.J;
                        r9Var.getClass();
                        float f12 = org.telegram.messenger.g0.p;
                        for (int i10 = 0; i10 < 56; i10++) {
                            int i11 = i10 % 10;
                            if (i11 <= 6) {
                                e10 = r9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e11 = r9Var.e(140.0f, 560.0f);
                            } else if (i11 <= 8) {
                                e10 = (r9Var.e(0.5f, 1.4f) * (r9Var.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e11 = r9Var.e(60.0f, 240.0f);
                            } else {
                                e10 = r9Var.e(0.0f, 6.2831855f);
                                e11 = r9Var.e(40.0f, 160.0f);
                            }
                            r9Var.a(centerX, centerY, e10, e11 * f12, r9Var.e(2.2f, 6.5f) * f12, r9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        this.R = !this.Q && this.N;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f10);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new q3(this, i7));
                    this.L.addListener(new g71(this, 5));
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
        la laVar = this.x;
        laVar.e = f11;
        laVar.a();
    }

    public final void d() {
        r1.g gVar = this.I;
        if (gVar != null) {
            gVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a10 = da.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a10.centerX(), a10.centerY(), 1.5f);
        }
        r9 r9Var = this.J;
        r9Var.c(canvas);
        if (r9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f10 = this.G;
        if (f10 <= 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.K;
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        Paint paint = this.y;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var));
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
        float f13 = org.telegram.ui.Cells.y0.f(width, 2.0f, getWidth(), f12, -width);
        float f14 = width / 2.0f;
        float f15 = f13 - f14;
        float f16 = f13 + f14;
        int i10 = 16777215 & w02;
        paint.setShader(new LinearGradient(f15, 0.0f, f16, 0.0f, new int[]{i10, w02, -7346433, i10}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
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
        if (this.G <= 0.0f || !(view == this.e || view == this.d)) {
            return super.drawChild(canvas, view, j3);
        }
        int save = canvas.save();
        Path path = this.E;
        path.rewind();
        path.addCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(10.0f) * this.G, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(Canvas canvas, float f10, float f11) {
        double radians = Math.toRadians(f10 - 90.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), (((float) Math.cos(radians)) * f11) + org.telegram.messenger.g0.L(52.0f), (((float) Math.sin(radians)) * f11) + org.telegram.messenger.g0.L(51.0f), this.y);
    }

    public final void f(boolean z10) {
        this.P = z10;
        la laVar = this.x;
        laVar.f = z10;
        laVar.a();
        b(!z10, (this.O || z10) ? 1.0f : 0.0f);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, u3 u3Var, boolean z10) {
        boolean z11;
        TLRPC.WebDocument webDocument;
        int i7 = t3.b;
        TL_wallet.walletTransaction wallettransaction2 = this.S;
        boolean z12 = wallettransaction2 != null && t3.i(wallettransaction2, wallettransaction);
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
        org.telegram.ui.Components.i9 i9Var = this.e;
        TextView textView2 = this.f;
        if (z15) {
            i9Var.setVisibility(8);
            setIconColor(f30.x);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(hd.M0(2131743081, null));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? hd.M0(2131742973, null) : u3Var.a(wallettransaction.peer.address));
            z11 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z16 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i10 = this.a;
            f30 f30Var = f30.n;
            z11 = true;
            org.telegram.ui.Components.t8 t8Var = this.c;
            f30 f30Var2 = f30.c;
            if (z16) {
                TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (a22 != null) {
                    i9Var.setVisibility(0);
                    t8Var.r(a22);
                    i9Var.f(a22, t8Var);
                    textView2.setText(q10.p(a22));
                } else {
                    i9Var.setVisibility(8);
                    if (!this.d0) {
                        f30Var2 = f30Var;
                    }
                    setIconColor(f30Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(u3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat M0 = np.s1(i10).M0(Long.valueOf(wallettransaction.peer.channel_id));
                if (M0 != null) {
                    i9Var.setVisibility(0);
                    t8Var.q(M0);
                    i9Var.f(M0, t8Var);
                    textView2.setText(M0.title);
                } else {
                    i9Var.setVisibility(8);
                    if (!this.d0) {
                        f30Var2 = f30Var;
                    }
                    setIconColor(f30Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(!TextUtils.isEmpty(wallettransaction.peer.domain) ? wallettransaction.peer.domain : u3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                i9Var.setVisibility(8);
                if (this.d0) {
                    f30Var2 = f30Var;
                }
                setIconColor(f30Var2);
                imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                textView2.setText(hd.M0(2131742985, null));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                i9Var.setVisibility(8);
                setIconColor(f30Var2);
                if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(hd.M0(2131742983, null));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(hd.M0(2131742984, null));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                i9Var.setVisibility(8);
                if (!this.d0) {
                    f30Var2 = f30Var;
                }
                setIconColor(f30Var2);
                imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? hd.M0(2131742973, null) : u3Var.a(wallettransaction.peer.address));
                } else {
                    textView2.setText(wallettransaction.peer.domain);
                }
            }
        }
        String str = wallettransaction.peer.address;
        boolean z17 = (str == null || !TextUtils.equals(textView2.getText(), u3Var.a(str)) || textView2.length() <= 9) ? false : z11;
        this.e0 = z17;
        textView2.setSingleLine(!z17);
        textView2.setEllipsize(this.e0 ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth(this.e0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : org.telegram.messenger.g0.L(120.0f));
        textView2.getLayoutParams().height = this.e0 ? -2 : org.telegram.messenger.g0.L(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(hd.M0(2131743122, null));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    textView.setText(hd.M0(this.d0 ? 2131743075 : 2131743074, null));
                } else if (wallettransaction.nft != null) {
                    textView.setText(hd.M0(this.d0 ? 2131743085 : 2131743056, null));
                } else {
                    textView.setText(hd.M0(this.d0 ? 2131743086 : 2131743057, null));
                }
            }
        }
        boolean z18 = wallettransaction.pending;
        TextView textView3 = this.n;
        if (z18) {
            textView3.setText(fi.o9.a(textView3, hd.M0(2131743014, null)));
        } else {
            int i11 = wallettransaction.date;
            textView3.setText(i11 == 0 ? "" : hd.Q(i11));
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.T;
        org.telegram.ui.Components.i9 i9Var2 = this.U;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i12 = org.telegram.ui.ActionBar.j6.y6;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
            if (this.V == null) {
                this.V = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            }
            Drawable drawable = this.V;
            org.telegram.ui.ActionBar.q6.x(this, drawable, i12, e6Var, PorterDuff.Mode.SRC_IN);
            this.f0 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i12);
            t70 t70Var = new t70(17);
            t70 t70Var2 = new t70(18);
            int i13 = K.a;
            float f10 = K.d;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.b;
            int P = org.telegram.ui.ActionBar.q6.P(i13, -1, 2, f10, e6Var2);
            t70Var2.f(P, this);
            org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(100, this);
            w10.c(i13, -1, 2, f10, e6Var2);
            w10.n = t70Var;
            w10.o = t70Var2;
            w10.m = false;
            w10.g = P;
            fq fqVar = new fq(this.f0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                i9Var2.j(gc.p(k20.c(webDocument2)), "46_46", fqVar, wallettransaction.nft);
            } else {
                i9Var2.setImageDrawable(fqVar);
            }
            this.W.setText(wallettransaction.nft.name);
            this.a0.setText(hd.M0(wallettransaction.nft.isPhoneNumber() ? 2131743173 : wallettransaction.nft.isUsername() ? 2131743171 : wallettransaction.nft.isGift() ? 2131743175 : 2131743176, null));
        } else {
            linearLayout.setVisibility(8);
            i9Var2.b();
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
            if (this.d0) {
                org.telegram.ui.ActionBar.q6.x(this, drawable3, org.telegram.ui.ActionBar.j6.lk, e6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(hd.M0(2131743087, null));
            } else {
                org.telegram.ui.ActionBar.q6.x(this, drawable3, org.telegram.ui.ActionBar.j6.z6, e6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(hd.M0(2131743058, null));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z19 = this.d0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder q10 = l0.q(l0.o(abs, false), 0.78571427f);
            if (abs != 0 && z19) {
                q10.insert(0, (CharSequence) "+");
            } else if (abs != 0 && !z19) {
                q10.insert(0, (CharSequence) "–");
            }
            textView4.setText(q10);
        }
        int visibility = textView4.getVisibility();
        la laVar = this.x;
        laVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = laVar.a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        laVar.b.setImageDrawable(drawable2);
        laVar.f = this.P;
        laVar.a();
        b(z12, (this.O || this.P) ? 1.0f : 0.0f);
        this.b0 = z10;
        updateColors();
        invalidate();
    }

    public w6 getPendingDiamond() {
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
        la laVar = this.x;
        laVar.f = false;
        laVar.a();
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
        paint.setColor(org.telegram.ui.ActionBar.j6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.G) * org.telegram.ui.ActionBar.j6.k0.getAlpha()));
        canvas.drawRect(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, getWidth() - (hd.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.F.setColor(org.telegram.ui.ActionBar.j6.r1(this.G, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        this.x.a.setTextColor((!this.c0 || this.O) ? this.d0 ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, e6Var) : org.telegram.ui.ActionBar.j6.w0(i10, e6Var) : org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, e6Var);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w02) {
                shapeDrawable.getPaint().setColor(w02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), w02));
        }
        this.W.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        this.a0.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
    }
}
