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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
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
import org.telegram.messenger.fc;
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.n30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i71;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public r1.g I;
    public final ga J;
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
    public final org.telegram.ui.Components.p9 U;
    public Drawable V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public final org.telegram.ui.ActionBar.i6 b;
    public boolean b0;
    public final org.telegram.ui.Components.a9 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final org.telegram.ui.Components.p9 e;
    public boolean e0;
    public final TextView f;
    public ShapeDrawable f0;
    public boolean g0;
    public final TextView h;
    public boolean h0;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable w;
    public final ab x;
    public final Paint y;

    public g4(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.c = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new ga();
        this.a = i7;
        this.b = i6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.na.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.e = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(p9Var, c8.na.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.na.d(-1, -1.0f, ks.E1, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, c8.na.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.g0.L(120.0f));
        TextView f10 = m10.f(linearLayout2, textView, c8.na.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f10;
        f10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        TextView f11 = m10.f(linearLayout2, f10, c8.na.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = f11;
        f11.setSingleLine(true);
        f11.setEllipsize(truncateAt);
        f11.setIncludeFontPadding(false);
        f11.setGravity(16);
        f11.setTextSize(1, 13.0f);
        linearLayout2.addView(f11, c8.na.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, c8.na.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        this.U = p9Var2;
        p9Var2.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        linearLayout3.addView(p9Var2, c8.na.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, c8.na.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        m10.p(textView2, 1, 14.0f);
        TextView f12 = m10.f(linearLayout4, textView2, c8.na.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.a0 = f12;
        f12.setTextSize(1, 14.0f);
        linearLayout4.addView(f12, c8.na.t(-1, -2, 55, 0, 0, 0, 0));
        ab abVar = new ab(context);
        this.x = abVar;
        this.r = abVar.a;
        Drawable g10 = i5.c.g(context, R.drawable.wallet_gram_small);
        this.s = g10;
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        Drawable g11 = i5.c.g(context, R.drawable.wallet_nft);
        this.w = g11;
        g11.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        linearLayout.addView(abVar, c8.na.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setDateBelowNft(boolean z10) {
        View view = this.n;
        LinearLayout linearLayout = (LinearLayout) view.getParent();
        if (linearLayout != null) {
            int indexOfChild = linearLayout.indexOfChild(view);
            View view2 = this.T;
            if ((indexOfChild > linearLayout.indexOfChild(view2)) == z10) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
            linearLayout.removeView(view);
            linearLayout.addView(view, linearLayout.indexOfChild(view2) + (z10 ? 1 : 0), layoutParams);
            layoutParams2.topMargin = org.telegram.messenger.g0.L(z10 ? 4.0f : -2.0f);
            layoutParams2.bottomMargin = org.telegram.messenger.g0.L(z10 ? 2.0f : 8.0f);
            layoutParams.topMargin = org.telegram.messenger.g0.L(2.0f);
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(10.0f);
        }
    }

    private void setIconColor(n30 n30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new b4(n30Var));
        this.d.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingProgress(float f10) {
        this.G = f10;
        this.F.setColor(org.telegram.ui.ActionBar.n6.r1(this.G, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.b)));
        d();
        setElevation(org.telegram.messenger.g0.L(8.0f) * f10);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f10 = 0.0f;
        }
        ab abVar = this.x;
        abVar.d = f10;
        if (f10 > 0.0f && abVar.c == null) {
            n7 n7Var = new n7(40, abVar.getContext(), true);
            abVar.c = n7Var;
            n7Var.setContinuousRotation(300.0f);
            abVar.addView(abVar.c, c8.na.c(40.0f, 40));
        }
        n7 n7Var2 = abVar.c;
        if (n7Var2 != null && f10 == 0.0f) {
            n7Var2.setPaused(true);
            abVar.removeView(abVar.c);
            abVar.c = null;
        }
        abVar.a();
        abVar.requestLayout();
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.a7));
    }

    public final CharSequence b(f4 f4Var, String str) {
        int indexOf;
        String a10 = f4Var.a(str);
        Typeface typeface = p6.x;
        if (str != null && a10 != null && (indexOf = a10.indexOf(8230)) > 0 && indexOf < a10.length() - 1) {
            String substring = a10.substring(0, indexOf);
            String substring2 = a10.substring(indexOf + 1);
            int length = str.length();
            if (str.startsWith(substring) && str.endsWith(substring2)) {
                if (length >= substring2.length() + substring.length() + 4) {
                    String substring3 = str.substring(substring.length(), substring.length() + 2);
                    String substring4 = str.substring((length - substring2.length()) - 2, length - substring2.length());
                    SpannableString spannableString = new SpannableString(a10);
                    spannableString.setSpan(new p6(substring, substring3, substring4, substring2, this.b), 0, spannableString.length(), 33);
                    return spannableString;
                }
            }
        }
        return a10;
    }

    public final void c(boolean z10, float f10) {
        TL_wallet.walletTransaction wallettransaction;
        n7 pendingDiamond;
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
                        RectF a10 = sa.a(pendingDiamond, this);
                        float centerX = a10.centerX();
                        float centerY = a10.centerY();
                        ga gaVar = this.J;
                        gaVar.getClass();
                        float f12 = org.telegram.messenger.g0.p;
                        for (int i10 = 0; i10 < 56; i10++) {
                            int i11 = i10 % 10;
                            if (i11 <= 6) {
                                e10 = gaVar.e(-0.3f, 0.3f) + 3.1415927f;
                                e11 = gaVar.e(140.0f, 560.0f);
                            } else if (i11 <= 8) {
                                e10 = (gaVar.e(0.5f, 1.4f) * (gaVar.b.nextBoolean() ? 1 : -1)) + 3.1415927f;
                                e11 = gaVar.e(60.0f, 240.0f);
                            } else {
                                e10 = gaVar.e(0.0f, 6.2831855f);
                                e11 = gaVar.e(40.0f, 160.0f);
                            }
                            gaVar.a(centerX, centerY, e10, e11 * f12, gaVar.e(2.2f, 6.5f) * f12, gaVar.e(0.8f, 1.4f), 2.4f);
                        }
                        this.R = !this.Q && this.N;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f10);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new a4(this, i7));
                    this.L.addListener(new i71(this, 5));
                    this.L.start();
                    return;
                }
            }
            setPendingProgress(f10);
        }
    }

    public final void d() {
        float f10 = (this.G * 0.035f) + 1.0f;
        setScaleX(((this.H * 0.012f) + 1.0f) * f10);
        setScaleY((1.0f - (this.H * 0.04f)) * f10);
        setTranslationY(org.telegram.messenger.g0.L(4.0f) * this.H);
        float f11 = this.H;
        ab abVar = this.x;
        abVar.e = f11;
        abVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n7 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a10 = sa.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a10.centerX(), a10.centerY(), 1.5f);
        }
        ga gaVar = this.J;
        gaVar.c(canvas);
        if (gaVar.d()) {
            postInvalidateOnAnimation();
        }
        float f10 = this.G;
        if (f10 <= 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.K;
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        Paint paint = this.y;
        paint.setShader(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
        float f11 = 255.0f * f10;
        paint.setAlpha(Math.round(f11));
        canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(8.0f) * f10, paint);
        paint.setColor(w02);
        paint.setAlpha(Math.round(f11));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(7.0f) * f10, paint);
        f(canvas, (uptimeMillis % 1000) * 0.36f, org.telegram.messenger.g0.L(4.6f) * f10);
        f(canvas, ((uptimeMillis % 6000) * 0.06f) + 120.0f, org.telegram.messenger.g0.L(3.2f) * f10);
        float f12 = (uptimeMillis % 1600) / 1600.0f;
        float width = getWidth() * 0.5f;
        float g10 = org.telegram.ui.Cells.c0.g(width, 2.0f, getWidth(), f12, -width);
        float f13 = width / 2.0f;
        float f14 = g10 - f13;
        float f15 = g10 + f13;
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

    public final void e() {
        r1.g gVar = this.I;
        if (gVar != null) {
            gVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        d();
    }

    public final void f(Canvas canvas, float f10, float f11) {
        double radians = Math.toRadians(f10 - 90.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), (((float) Math.cos(radians)) * f11) + org.telegram.messenger.g0.L(52.0f), (((float) Math.sin(radians)) * f11) + org.telegram.messenger.g0.L(51.0f), this.y);
    }

    public final void g(boolean z10) {
        this.P = z10;
        ab abVar = this.x;
        abVar.f = z10;
        abVar.a();
        c(!z10, (this.O || z10) ? 1.0f : 0.0f);
    }

    public n7 getPendingDiamond() {
        return this.x.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_wallet.walletTransaction wallettransaction, f4 f4Var, boolean z10) {
        long j3;
        g3 g3Var;
        g3 g3Var2;
        String str;
        int i7;
        boolean z11;
        TL_wallet.nftItem nftitem;
        boolean z12;
        long j10;
        TLRPC.WebDocument webDocument;
        int i10 = e4.b;
        TL_wallet.walletTransaction wallettransaction2 = this.S;
        boolean z13 = wallettransaction2 != null && e4.j(wallettransaction2, wallettransaction);
        if (!z13) {
            this.P = false;
            this.Q = false;
            this.R = false;
            this.K = SystemClock.uptimeMillis();
            e();
            this.J.a.clear();
        }
        this.S = wallettransaction;
        boolean z14 = wallettransaction.pending;
        this.O = z14 && !wallettransaction.failed;
        boolean z15 = wallettransaction.incoming;
        this.N = (z15 || wallettransaction.key_change || wallettransaction.nft != null) ? false : true;
        this.c0 = z14 || wallettransaction.failed;
        this.d0 = z15;
        g3 c10 = g3.c(wallettransaction);
        if (c10 != null) {
            boolean z16 = (r9 = c10.d) != 0 ? false : false;
            this.d0 = z16;
            this.N = false;
        }
        this.g0 = (c10 == null || wallettransaction.failed) ? false : true;
        TextView textView = this.h;
        textView.setVisibility(0);
        boolean z17 = wallettransaction.key_change;
        ImageView imageView = this.d;
        org.telegram.ui.Components.p9 p9Var = this.e;
        TextView textView2 = this.f;
        if (z17) {
            p9Var.setVisibility(8);
            setIconColor(n30.x);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(gd.N0(2131742829, null));
            textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? gd.N0(2131742702, null) : f4Var.a(wallettransaction.peer.address));
            g3Var2 = c10;
            j3 = 0;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            j3 = 0;
            boolean z18 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i11 = this.a;
            org.telegram.ui.Components.a9 a9Var = this.c;
            n30 n30Var = n30.n;
            n30 n30Var2 = n30.c;
            if (z18) {
                g3Var = c10;
                TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (c22 != null) {
                    p9Var.setVisibility(0);
                    a9Var.r(c22);
                    p9Var.f(c22, a9Var);
                    textView2.setText(n10.q(c22));
                } else {
                    p9Var.setVisibility(8);
                    if (!this.d0) {
                        n30Var2 = n30Var;
                    }
                    setIconColor(n30Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(b(f4Var, wallettransaction.peer.address));
                }
            } else {
                g3Var = c10;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                    TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(wallettransaction.peer.channel_id));
                    if (O0 != null) {
                        p9Var.setVisibility(0);
                        a9Var.q(O0);
                        p9Var.f(O0, a9Var);
                        textView2.setText(O0.title);
                    } else {
                        p9Var.setVisibility(8);
                        if (!this.d0) {
                            n30Var2 = n30Var;
                        }
                        setIconColor(n30Var2);
                        imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                        textView2.setText(!TextUtils.isEmpty(wallettransaction.peer.domain) ? wallettransaction.peer.domain : b(f4Var, wallettransaction.peer.address));
                    }
                } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                    p9Var.setVisibility(8);
                    if (this.d0) {
                        n30Var2 = n30Var;
                    }
                    setIconColor(n30Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView2.setText(gd.N0(2131742714, null));
                } else if (g3Var != null) {
                    p9Var.setVisibility(8);
                    g3Var2 = g3Var;
                    if (g3Var2.c) {
                        n30Var2 = n30Var;
                    }
                    setIconColor(n30Var2);
                    imageView.setImageResource(g3Var2.b);
                    textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? gd.N0(2131742791, null) : b(f4Var, wallettransaction.peer.address));
                } else {
                    g3Var2 = g3Var;
                    if (walletTransactionPeer instanceof c4) {
                        p9Var.setVisibility(8);
                        setIconColor(n30Var2);
                        imageView.setImageResource(R.drawable.wallet_transaction_out);
                        textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? gd.N0(2131742702, null) : b(f4Var, wallettransaction.peer.address));
                    } else {
                        int i12 = R.drawable.wallet_transaction_out;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                            TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                            p9Var.setVisibility(8);
                            setIconColor(n30Var2);
                            if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                                imageView.setImageResource(R.drawable.wallet_transaction_walt);
                                textView2.setText(gd.N0(2131742712, null));
                            } else {
                                imageView.setImageResource(R.drawable.wallet_transaction_topup);
                                textView2.setText(gd.N0(2131742713, null));
                            }
                            textView.setText(g.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
                        } else {
                            p9Var.setVisibility(8);
                            if (!this.d0) {
                                n30Var2 = n30Var;
                            }
                            setIconColor(n30Var2);
                            if (this.d0) {
                                i12 = R.drawable.wallet_transaction_in;
                            }
                            imageView.setImageResource(i12);
                            if (TextUtils.isEmpty(wallettransaction.peer.domain)) {
                                textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? gd.N0(2131742702, null) : b(f4Var, wallettransaction.peer.address));
                            } else {
                                textView2.setText(wallettransaction.peer.domain);
                            }
                        }
                    }
                }
            }
            g3Var2 = g3Var;
        }
        String str2 = wallettransaction.peer.address;
        CharSequence text = textView2.getText();
        Typeface typeface = p6.x;
        boolean z19 = (text instanceof Spanned) && ((p6[]) ((Spanned) text).getSpans(0, text.length(), p6.class)).length > 0;
        boolean z20 = !z19 && str2 != null && TextUtils.equals(textView2.getText(), f4Var.a(str2)) && textView2.length() > 9;
        this.e0 = z20;
        textView2.setSingleLine(!z20);
        textView2.setEllipsize((this.e0 || z19) ? null : TextUtils.TruncateAt.MIDDLE);
        textView2.setMaxWidth((this.e0 || z19) ? ConnectionsManager.DEFAULT_DATACENTER_ID : org.telegram.messenger.g0.L(120.0f));
        textView2.getLayoutParams().height = (this.e0 || z19) ? -2 : org.telegram.messenger.g0.L(18.0f);
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(gd.N0(2131742870, null));
        } else if (g3Var2 == null) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (walletTransactionPeer2 instanceof c4) {
                textView.setText(gd.N0(2131749329, null));
            } else if (!wallettransaction.key_change && !(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    if (this.d0) {
                        i7 = 2131742823;
                        str = null;
                    } else {
                        str = null;
                        i7 = 2131742822;
                    }
                    textView.setText(gd.N0(i7, str));
                } else {
                    str = null;
                    if (wallettransaction.nft != null) {
                        textView.setText(gd.N0(this.d0 ? 2131742833 : 2131742785, null));
                    } else {
                        textView.setText(gd.N0(this.d0 ? 2131742834 : 2131742786, null));
                    }
                }
                z11 = wallettransaction.pending;
                TextView textView3 = this.n;
                if (z11) {
                    int i13 = wallettransaction.date;
                    textView3.setText(i13 == 0 ? "" : gd.Q(i13));
                } else {
                    textView3.setText(fi.l9.a(textView3, gd.N0(2131742743, str)));
                }
                nftitem = wallettransaction.nft;
                LinearLayout linearLayout = this.T;
                org.telegram.ui.Components.p9 p9Var2 = this.U;
                if (nftitem == null) {
                    linearLayout.setVisibility(0);
                    int i14 = org.telegram.ui.ActionBar.n6.y6;
                    org.telegram.ui.ActionBar.i6 i6Var = this.b;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i14, i6Var);
                    if (this.V == null) {
                        this.V = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                    }
                    Drawable drawable = this.V;
                    org.telegram.ui.ActionBar.u6.x(this, drawable, i14, i6Var, PorterDuff.Mode.SRC_IN);
                    this.f0 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
                    org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i14);
                    l60 l60Var = new l60(18);
                    l60 l60Var2 = new l60(19);
                    int i15 = K.a;
                    float f10 = K.d;
                    org.telegram.ui.ActionBar.i6 i6Var2 = this.b;
                    int P = org.telegram.ui.ActionBar.u6.P(i15, -1, 2, f10, i6Var2);
                    l60Var2.g(P, this);
                    org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(100, this);
                    w10.c(i15, -1, 2, f10, i6Var2);
                    w10.n = l60Var;
                    w10.o = l60Var2;
                    w10.m = false;
                    w10.g = P;
                    lq lqVar = new lq(this.f0, drawable);
                    TL_wallet.nftItem nftitem2 = wallettransaction.nft;
                    TLRPC.WebDocument webDocument2 = nftitem2.image_small;
                    if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                        webDocument2 = webDocument;
                    }
                    boolean z21 = nftitem2.gift instanceof TL_stars.TL_starGiftUnique;
                    if (z21) {
                        p9Var2.b();
                        di.q5 q5Var = new di.q5(p9Var2, wallettransaction.nft.gift, 40, 0.25f);
                        q5Var.K = org.telegram.messenger.g0.L(8.0f);
                        p9Var2.setImageDrawable(q5Var);
                    } else if (webDocument2 != null) {
                        p9Var2.j(fc.p(g20.c(webDocument2)), "46_46", lqVar, wallettransaction.nft);
                    } else {
                        p9Var2.setImageDrawable(lqVar);
                    }
                    TL_wallet.nftItem nftitem3 = wallettransaction.nft;
                    String h = z21 ? bi.a5.h(nftitem3.gift) : nftitem3.name;
                    TextView textView4 = this.W;
                    textView4.setText(h);
                    textView4.setTypeface(this.g0 ? Typeface.DEFAULT : org.telegram.messenger.g0.o());
                    Typeface o4 = this.g0 ? org.telegram.messenger.g0.o() : Typeface.DEFAULT;
                    TextView textView5 = this.a0;
                    textView5.setTypeface(o4);
                    if (this.g0) {
                        textView5.setText(g3Var2.b());
                    } else {
                        textView5.setText(gd.N0(wallettransaction.nft.isPhoneNumber() ? 2131742922 : wallettransaction.nft.isUsername() ? 2131742920 : (z21 || wallettransaction.nft.isGift()) ? 2131742924 : 2131742925, null));
                    }
                } else {
                    linearLayout.setVisibility(8);
                    p9Var2.b();
                }
                boolean z22 = g3Var2 == null && wallettransaction.nft != null;
                this.h0 = z22;
                setDateBelowNft(z22);
                z12 = g3Var2 != null ? wallettransaction.nft != null : g3Var2.d != 0;
                j10 = wallettransaction.amount;
                Drawable drawable2 = this.s;
                Drawable drawable3 = this.w;
                TextView textView6 = this.r;
                if (j10 != j3 && wallettransaction.key_change) {
                    textView6.setVisibility(8);
                } else if (g3Var2 == null && g3Var2.a == 9) {
                    textView6.setVisibility(8);
                } else if (z12) {
                    textView6.setVisibility(0);
                    textView6.setCompoundDrawablesRelative(null, null, drawable2, null);
                    boolean z23 = this.d0;
                    long abs = Math.abs(g3Var2 != null ? g3Var2.e : wallettransaction.amount);
                    SpannableStringBuilder v = v0.v(v0.t(abs, false), 0.78571427f);
                    if (abs != j3 && z23) {
                        v.insert(0, (CharSequence) "+");
                    } else if (abs != j3 && !z23) {
                        v.insert(0, (CharSequence) "–");
                    }
                    textView6.setText(v);
                } else {
                    textView6.setVisibility(0);
                    textView6.setCompoundDrawablesRelative(null, null, drawable3, null);
                    if (this.d0) {
                        textView6.setText(gd.N0(2131742835, null));
                    } else {
                        textView6.setText(gd.N0(2131742787, null));
                    }
                }
                int visibility = textView6.getVisibility();
                ab abVar = this.x;
                abVar.setVisibility(visibility);
                CharSequence text2 = textView6.getText();
                if (z12) {
                    drawable2 = drawable3;
                }
                TextView textView7 = abVar.a;
                textView7.setText(text2);
                textView7.setCompoundDrawablesRelative(null, null, null, null);
                abVar.b.setImageDrawable(drawable2);
                abVar.f = this.P;
                abVar.a();
                c(z13, (!this.O || this.P) ? 1.0f : 0.0f);
                this.b0 = z10;
                updateColors();
                invalidate();
            }
        } else if (wallettransaction.nft != null) {
            textView.setVisibility(8);
        } else {
            textView.setText(g3Var2.b());
        }
        str = null;
        z11 = wallettransaction.pending;
        TextView textView32 = this.n;
        if (z11) {
        }
        nftitem = wallettransaction.nft;
        LinearLayout linearLayout2 = this.T;
        org.telegram.ui.Components.p9 p9Var22 = this.U;
        if (nftitem == null) {
        }
        if (g3Var2 == null) {
        }
        this.h0 = z22;
        setDateBelowNft(z22);
        if (g3Var2 != null) {
        }
        j10 = wallettransaction.amount;
        Drawable drawable22 = this.s;
        Drawable drawable32 = this.w;
        TextView textView62 = this.r;
        if (j10 != j3) {
        }
        if (g3Var2 == null) {
        }
        if (z12) {
        }
        int visibility2 = textView62.getVisibility();
        ab abVar2 = this.x;
        abVar2.setVisibility(visibility2);
        CharSequence text22 = textView62.getText();
        if (z12) {
        }
        TextView textView72 = abVar2.a;
        textView72.setText(text22);
        textView72.setCompoundDrawablesRelative(null, null, null, null);
        abVar2.b.setImageDrawable(drawable22);
        abVar2.f = this.P;
        abVar2.a();
        c(z13, (!this.O || this.P) ? 1.0f : 0.0f);
        this.b0 = z10;
        updateColors();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(true, (this.O || this.P) ? 1.0f : 0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e();
        this.J.a.clear();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        this.P = false;
        ab abVar = this.x;
        abVar.f = false;
        abVar.a();
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
        paint.setColor(org.telegram.ui.ActionBar.n6.k0.getColor());
        paint.setAlpha(Math.round((1.0f - this.G) * org.telegram.ui.ActionBar.n6.k0.getAlpha()));
        canvas.drawRect(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(71.0f), getHeight() - 1, getWidth() - (gd.a0 ? org.telegram.messenger.g0.L(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.h0;
        LinearLayout linearLayout = this.T;
        int i11 = 0;
        if (z10 && linearLayout.getVisibility() == 0) {
            ab abVar = this.x;
            if (abVar.getVisibility() == 0) {
                abVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
                i11 = -(org.telegram.messenger.g0.L(8.0f) + abVar.getMeasuredWidth());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != i11) {
            layoutParams.rightMargin = i11;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        this.F.setColor(org.telegram.ui.ActionBar.n6.r1(this.G, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        this.f.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        int i11 = org.telegram.ui.ActionBar.n6.z6;
        this.n.setTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        int w02 = (!this.c0 || this.O) ? this.d0 ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lk, i6Var) : org.telegram.ui.ActionBar.n6.w0(i10, i6Var) : org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
        this.x.a.setTextColor(w02);
        this.w.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, i6Var);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w03) {
                shapeDrawable.getPaint().setColor(w03);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(10.0f), w03));
        }
        this.W.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        if (!this.g0) {
            i10 = i11;
        }
        this.a0.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
    }
}
