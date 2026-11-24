// default package

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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class lyb extends FrameLayout implements tjb {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public yla I;
    public final spc J;
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
    public final be0 U;
    public Drawable V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public final wjb b;
    public boolean b0;
    public final pb0 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final be0 e;
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
    public final jqc x;
    public final Paint y;

    public lyb(int i, wjb wjbVar, Context context) {
        super(context);
        this.c = new pb0((wjb) null);
        this.y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new spc();
        this.a = i;
        this.b = wjbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        be0 be0Var = new be0(context);
        this.e = be0Var;
        be0Var.setRoundRadius(gl.L(23.0f));
        addView(be0Var, nme.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, nme.d(-1, -1.0f, kk7.D1, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, nme.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.n1("fonts/rmedium.ttf"));
        textView.setMaxWidth(gl.L(120.0f));
        TextView m = ug8.m(linearLayout2, textView, nme.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = m;
        m.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m.setEllipsize(truncateAt);
        m.setIncludeFontPadding(false);
        m.setGravity(16);
        m.setTextSize(1, 13.0f);
        TextView m2 = ug8.m(linearLayout2, m, nme.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = m2;
        m2.setSingleLine(true);
        m2.setEllipsize(truncateAt);
        m2.setIncludeFontPadding(false);
        m2.setGravity(16);
        m2.setTextSize(1, 13.0f);
        linearLayout2.addView(m2, nme.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, nme.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        be0 be0Var2 = new be0(context);
        this.U = be0Var2;
        be0Var2.setRoundRadius(gl.L(8.0f));
        linearLayout3.addView(be0Var2, nme.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, nme.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        ug8.v(textView2, 1, 14.0f);
        TextView m3 = ug8.m(linearLayout4, textView2, nme.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.a0 = m3;
        m3.setTextSize(1, 14.0f);
        linearLayout4.addView(m3, nme.t(-1, -2, 55, 0, 0, 0, 0));
        jqc jqcVar = new jqc(context);
        this.x = jqcVar;
        this.r = jqcVar.a;
        Drawable d = b00.d(context, R.drawable.wallet_gram_small);
        this.s = d;
        d.setBounds(0, 0, gl.L(16.0f), gl.L(16.0f));
        Drawable d2 = b00.d(context, R.drawable.wallet_nft);
        this.w = d2;
        d2.setBounds(0, 0, gl.L(16.0f), gl.L(16.0f));
        linearLayout.addView(jqcVar, nme.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(gl.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setDateBelowNft(boolean z) {
        View view = this.n;
        LinearLayout linearLayout = (LinearLayout) view.getParent();
        if (linearLayout != null) {
            int indexOfChild = linearLayout.indexOfChild(view);
            View view2 = this.T;
            if ((indexOfChild > linearLayout.indexOfChild(view2)) != z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                linearLayout.removeView(view);
                linearLayout.addView(view, linearLayout.indexOfChild(view2) + (z ? 1 : 0), layoutParams);
                layoutParams2.topMargin = gl.L(z ? 4.0f : -2.0f);
                layoutParams2.bottomMargin = gl.L(z ? 2.0f : 8.0f);
                layoutParams.topMargin = gl.L(2.0f);
                layoutParams.bottomMargin = gl.L(10.0f);
            }
        }
    }

    private void setIconColor(mj5 mj5Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new gyb(mj5Var));
        this.d.setBackground(shapeDrawable);
    }

    private void setPendingProgress(float f) {
        this.G = f;
        this.F.setColor(bkb.p1(this.G, bkb.v0(bkb.c6, this.b)));
        c();
        setElevation(gl.L(8.0f) * f);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f = 0.0f;
        }
        jqc jqcVar = this.x;
        jqcVar.d = f;
        if (f > 0.0f && jqcVar.c == null) {
            lnc lncVar = new lnc(40, jqcVar.getContext(), true);
            jqcVar.c = lncVar;
            lncVar.setContinuousRotation(300.0f);
            jqcVar.addView(jqcVar.c, nme.c(40.0f, 40));
        }
        lnc lncVar2 = jqcVar.c;
        if (lncVar2 != null && f == 0.0f) {
            lncVar2.setPaused(true);
            jqcVar.removeView(jqcVar.c);
            jqcVar.c = null;
        }
        jqcVar.a();
        jqcVar.requestLayout();
        invalidate();
    }

    public final CharSequence a(kyb kybVar, String str) {
        int indexOf;
        String a = kybVar.a(str);
        Typeface typeface = imc.x;
        if (str != null && a != null && (indexOf = a.indexOf(8230)) > 0 && indexOf < a.length() - 1) {
            String substring = a.substring(0, indexOf);
            String substring2 = a.substring(indexOf + 1);
            int length = str.length();
            if (str.startsWith(substring) && str.endsWith(substring2)) {
                if (length >= substring2.length() + substring.length() + 4) {
                    String substring3 = str.substring(substring.length(), substring.length() + 2);
                    String substring4 = str.substring((length - substring2.length()) - 2, length - substring2.length());
                    SpannableString spannableString = new SpannableString(a);
                    spannableString.setSpan(new imc(substring, substring3, substring4, substring2, this.b), 0, spannableString.length(), 33);
                    return spannableString;
                }
            }
        }
        return a;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Z6));
    }

    public final void b(boolean z, float f) {
        TL_wallet.walletTransaction wallettransaction;
        lnc pendingDiamond;
        float y;
        float y2;
        if (z && this.L != null && this.M == f) {
            return;
        }
        this.M = f;
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        if (!z || f != 0.0f || this.G <= 0.0f || isAttachedToWindow()) {
            if (z) {
                float f2 = this.G;
                if (f2 != f) {
                    byte b = 1;
                    if (f == 0.0f && f2 > 0.0f && (wallettransaction = this.S) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a = cqc.a(pendingDiamond, this);
                        float centerX = a.centerX();
                        float centerY = a.centerY();
                        spc spcVar = this.J;
                        spcVar.getClass();
                        float f3 = gl.p;
                        for (int i = 0; i < 56; i++) {
                            int i2 = i % 10;
                            if (i2 <= 6) {
                                y = spcVar.y(-0.3f, 0.3f) + 3.1415927f;
                                y2 = spcVar.y(140.0f, 560.0f);
                            } else if (i2 <= 8) {
                                y = (spcVar.y(0.5f, 1.4f) * (((Random) spcVar.c).nextBoolean() ? 1 : -1)) + 3.1415927f;
                                y2 = spcVar.y(60.0f, 240.0f);
                            } else {
                                y = spcVar.y(0.0f, 6.2831855f);
                                y2 = spcVar.y(40.0f, 160.0f);
                            }
                            spcVar.j(centerX, centerY, y, y2 * f3, spcVar.y(2.2f, 6.5f) * f3, spcVar.y(0.8f, 1.4f), 2.4f);
                        }
                        this.R = !this.Q && this.N;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new uwb(this, b));
                    this.L.addListener(new iab(this, (byte) 9));
                    this.L.start();
                    return;
                }
            }
            setPendingProgress(f);
        }
    }

    public final void c() {
        float f = (this.G * 0.035f) + 1.0f;
        setScaleX(((this.H * 0.012f) + 1.0f) * f);
        setScaleY((1.0f - (this.H * 0.04f)) * f);
        setTranslationY(gl.L(4.0f) * this.H);
        float f2 = this.H;
        jqc jqcVar = this.x;
        jqcVar.e = f2;
        jqcVar.a();
    }

    public final void d() {
        yla ylaVar = this.I;
        if (ylaVar != null) {
            ylaVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lnc pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a = cqc.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.a0(a.centerX(), a.centerY(), 1.5f);
        }
        spc spcVar = this.J;
        spcVar.p(canvas);
        if (spcVar.q()) {
            postInvalidateOnAnimation();
        }
        float f = this.G;
        if (f > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.K;
            int i = bkb.Ei;
            wjb wjbVar = this.b;
            int v0 = bkb.v0(i, wjbVar);
            Paint paint = this.y;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(bkb.v0(bkb.c6, wjbVar));
            float f2 = 255.0f * f;
            paint.setAlpha(Math.round(f2));
            canvas.drawCircle(gl.L(52.0f), gl.L(51.0f), gl.L(8.0f) * f, paint);
            paint.setColor(v0);
            paint.setAlpha(Math.round(f2));
            paint.setStrokeWidth(gl.L(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(gl.L(52.0f), gl.L(51.0f), gl.L(7.0f) * f, paint);
            e(canvas, (uptimeMillis % 1000) * 0.36f, gl.L(4.6f) * f);
            e(canvas, ((uptimeMillis % 6000) * 0.06f) + 120.0f, gl.L(3.2f) * f);
            float f3 = (uptimeMillis % 1600) / 1600.0f;
            float width = getWidth() * 0.5f;
            float g = oo1.g(width, 2.0f, getWidth(), f3, -width);
            float f4 = width / 2.0f;
            float f5 = g - f4;
            float f6 = g + f4;
            int i2 = 16777215 & v0;
            paint.setShader(new LinearGradient(f5, 0.0f, f6, 0.0f, new int[]{i2, v0, -7346433, i2}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAlpha(Math.round(f * 150.0f * ((float) Math.sin(f3 * 3.141592653589793d))));
            paint.setStrokeWidth(gl.L(1.5f));
            canvas.drawRoundRect(gl.L(1.0f), gl.L(1.0f), getWidth() - gl.L(1.0f), getHeight() - gl.L(1.0f), gl.L(16.0f), gl.L(16.0f), paint);
            paint.setShader(null);
            if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.G <= 0.0f || !(view == this.e || view == this.d)) {
            return super.drawChild(canvas, view, j);
        }
        int save = canvas.save();
        Path path = this.E;
        path.rewind();
        path.addCircle(gl.L(52.0f), gl.L(51.0f), gl.L(10.0f) * this.G, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(Canvas canvas, float f, float f2) {
        double radians = Math.toRadians(f - 90.0f);
        canvas.drawLine(gl.L(52.0f), gl.L(51.0f), (((float) Math.cos(radians)) * f2) + gl.L(52.0f), (((float) Math.sin(radians)) * f2) + gl.L(51.0f), this.y);
    }

    public final void f(boolean z) {
        this.P = z;
        jqc jqcVar = this.x;
        jqcVar.f = z;
        jqcVar.a();
        b(!z, (this.O || z) ? 1.0f : 0.0f);
    }

    public final /* synthetic */ void g(ValueAnimator valueAnimator) {
        setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public lnc getPendingDiamond() {
        return this.x.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TL_wallet.walletTransaction wallettransaction, kyb kybVar, boolean z) {
        long j;
        TextView textView;
        String str;
        int i;
        boolean z2;
        TL_wallet.nftItem nftitem;
        boolean z3;
        long j2;
        TLRPC.WebDocument webDocument;
        int i2 = jyb.b;
        TL_wallet.walletTransaction wallettransaction2 = this.S;
        boolean z4 = wallettransaction2 != null && jyb.j(wallettransaction2, wallettransaction);
        if (!z4) {
            this.P = false;
            this.Q = false;
            this.R = false;
            this.K = SystemClock.uptimeMillis();
            d();
            ((ArrayList) this.J.b).clear();
        }
        this.S = wallettransaction;
        boolean z5 = wallettransaction.pending;
        this.O = z5 && !wallettransaction.failed;
        boolean z6 = wallettransaction.incoming;
        this.N = (z6 || wallettransaction.key_change || wallettransaction.nft != null) ? false : true;
        this.c0 = z5 || wallettransaction.failed;
        this.d0 = z6;
        dq7 c = dq7.c(wallettransaction);
        if (c != null) {
            boolean z7 = (r9 = c.d) != 0 ? false : false;
            this.d0 = z7;
            this.N = false;
        }
        this.g0 = (c == null || wallettransaction.failed) ? false : true;
        TextView textView2 = this.h;
        textView2.setVisibility(0);
        boolean z8 = wallettransaction.key_change;
        ImageView imageView = this.d;
        be0 be0Var = this.e;
        TextView textView3 = this.f;
        if (z8) {
            be0Var.setVisibility(8);
            setIconColor(mj5.x);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView3.setText(k96.M0(2131742837, null));
            textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? k96.M0(2131742710, null) : kybVar.a(wallettransaction.peer.address));
            j = 0;
            textView = textView3;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            j = 0;
            boolean z9 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i3 = this.a;
            pb0 pb0Var = this.c;
            mj5 mj5Var = mj5.n;
            mj5 mj5Var2 = mj5.c;
            if (z9) {
                TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (V1 != null) {
                    be0Var.setVisibility(0);
                    pb0Var.q(V1);
                    be0Var.f(V1, pb0Var);
                    String r = l7c.r(V1);
                    textView = textView3;
                    textView.setText(r);
                } else {
                    textView = textView3;
                    be0Var.setVisibility(8);
                    if (!this.d0) {
                        mj5Var2 = mj5Var;
                    }
                    setIconColor(mj5Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView.setText(a(kybVar, wallettransaction.peer.address));
                }
            } else {
                textView = textView3;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                    TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(wallettransaction.peer.channel_id));
                    if (K0 != null) {
                        be0Var.setVisibility(0);
                        pb0Var.p(K0);
                        be0Var.f(K0, pb0Var);
                        textView.setText(K0.title);
                    } else {
                        be0Var.setVisibility(8);
                        if (!this.d0) {
                            mj5Var2 = mj5Var;
                        }
                        setIconColor(mj5Var2);
                        imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                        boolean isEmpty = TextUtils.isEmpty(wallettransaction.peer.domain);
                        TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                        textView.setText(!isEmpty ? walletTransactionPeer2.domain : a(kybVar, walletTransactionPeer2.address));
                    }
                } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                    be0Var.setVisibility(8);
                    if (this.d0) {
                        mj5Var2 = mj5Var;
                    }
                    setIconColor(mj5Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView.setText(k96.M0(2131742722, null));
                } else if (c != null) {
                    be0Var.setVisibility(8);
                    if (c.c) {
                        mj5Var2 = mj5Var;
                    }
                    setIconColor(mj5Var2);
                    imageView.setImageResource(c.b);
                    textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? k96.M0(2131742799, null) : a(kybVar, wallettransaction.peer.address));
                } else if (walletTransactionPeer instanceof hyb) {
                    be0Var.setVisibility(8);
                    setIconColor(mj5Var2);
                    imageView.setImageResource(R.drawable.wallet_transaction_out);
                    textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? k96.M0(2131742710, null) : a(kybVar, wallettransaction.peer.address));
                } else {
                    int i4 = R.drawable.wallet_transaction_out;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                        TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                        be0Var.setVisibility(8);
                        setIconColor(mj5Var2);
                        if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                            imageView.setImageResource(R.drawable.wallet_transaction_walt);
                            textView.setText(k96.M0(2131742720, null));
                        } else {
                            imageView.setImageResource(R.drawable.wallet_transaction_topup);
                            textView.setText(k96.M0(2131742721, null));
                        }
                        textView2.setText(a43.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
                    } else {
                        be0Var.setVisibility(8);
                        if (!this.d0) {
                            mj5Var2 = mj5Var;
                        }
                        setIconColor(mj5Var2);
                        if (this.d0) {
                            i4 = R.drawable.wallet_transaction_in;
                        }
                        imageView.setImageResource(i4);
                        boolean isEmpty2 = TextUtils.isEmpty(wallettransaction.peer.domain);
                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = wallettransaction.peer;
                        if (isEmpty2) {
                            textView.setText(TextUtils.isEmpty(walletTransactionPeer3.address) ? k96.M0(2131742710, null) : a(kybVar, wallettransaction.peer.address));
                        } else {
                            textView.setText(walletTransactionPeer3.domain);
                        }
                    }
                }
            }
        }
        String str2 = wallettransaction.peer.address;
        CharSequence text = textView.getText();
        Typeface typeface = imc.x;
        boolean z10 = (text instanceof Spanned) && ((imc[]) ((Spanned) text).getSpans(0, text.length(), imc.class)).length > 0;
        boolean z11 = !z10 && str2 != null && TextUtils.equals(textView.getText(), kybVar.a(str2)) && textView.length() > 9;
        this.e0 = z11;
        textView.setSingleLine(!z11);
        textView.setEllipsize((this.e0 || z10) ? null : TextUtils.TruncateAt.MIDDLE);
        textView.setMaxWidth((this.e0 || z10) ? ConnectionsManager.DEFAULT_DATACENTER_ID : gl.L(120.0f));
        textView.getLayoutParams().height = (this.e0 || z10) ? -2 : gl.L(18.0f);
        textView.requestLayout();
        if (wallettransaction.failed) {
            textView2.setText(k96.M0(2131742878, null));
        } else if (c == null) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer4 = wallettransaction.peer;
            if (walletTransactionPeer4 instanceof hyb) {
                textView2.setText(k96.M0(2131749330, null));
            } else if (!wallettransaction.key_change && !(walletTransactionPeer4 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer4 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer4).own_profile) {
                    if (this.d0) {
                        i = 2131742831;
                        str = null;
                    } else {
                        str = null;
                        i = 2131742830;
                    }
                    textView2.setText(k96.M0(i, str));
                } else {
                    str = null;
                    TL_wallet.nftItem nftitem2 = wallettransaction.nft;
                    boolean z12 = this.d0;
                    if (nftitem2 != null) {
                        textView2.setText(k96.M0(z12 ? 2131742841 : 2131742793, null));
                    } else {
                        textView2.setText(k96.M0(z12 ? 2131742842 : 2131742794, null));
                    }
                }
                z2 = wallettransaction.pending;
                TextView textView4 = this.n;
                if (z2) {
                    int i5 = wallettransaction.date;
                    textView4.setText(i5 == 0 ? "" : k96.Q(i5));
                } else {
                    textView4.setText(q6c.a(textView4, k96.M0(2131742751, str)));
                }
                nftitem = wallettransaction.nft;
                be0 be0Var2 = this.U;
                LinearLayout linearLayout = this.T;
                if (nftitem == null) {
                    linearLayout.setVisibility(0);
                    int i6 = bkb.x6;
                    wjb wjbVar = this.b;
                    int v0 = bkb.v0(i6, wjbVar);
                    Drawable drawable = this.V;
                    if (drawable == null) {
                        drawable = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                        this.V = drawable;
                    }
                    zkb.x(this, drawable, i6, wjbVar, PorterDuff.Mode.SRC_IN);
                    this.f0 = bkb.b0(gl.L(8.0f), bkb.p1(0.1f, v0));
                    vkb K = zkb.K(0.1f, i6);
                    sdb sdbVar = new sdb((byte) 29);
                    fyb fybVar = new fyb((byte) 0);
                    int i7 = K.a;
                    float f = K.d;
                    wjb wjbVar2 = this.b;
                    int P = zkb.P(i7, -1, 2, f, wjbVar2);
                    fybVar.d(P, this);
                    tkb w = zkb.w(100, this);
                    w.c(i7, -1, 2, f, wjbVar2);
                    w.n = sdbVar;
                    w.o = fybVar;
                    w.m = false;
                    w.g = P;
                    fm2 fm2Var = new fm2(this.f0, drawable);
                    TL_wallet.nftItem nftitem3 = wallettransaction.nft;
                    TLRPC.WebDocument webDocument2 = nftitem3.image_small;
                    if (webDocument2 == null && (webDocument = nftitem3.image) != null) {
                        webDocument2 = webDocument;
                    }
                    boolean z13 = nftitem3.gift instanceof TL_stars.TL_starGiftUnique;
                    if (z13) {
                        be0Var2.b();
                        jqa jqaVar = new jqa(be0Var2, wallettransaction.nft.gift, 40, 0.25f);
                        jqaVar.K = gl.L(8.0f);
                        be0Var2.setImageDrawable(jqaVar);
                    } else if (webDocument2 != null) {
                        be0Var2.m(gl5.p(usc.c(webDocument2)), "46_46", fm2Var, wallettransaction.nft);
                    } else {
                        be0Var2.setImageDrawable(fm2Var);
                    }
                    TL_wallet.nftItem nftitem4 = wallettransaction.nft;
                    String h = z13 ? cq7.h(nftitem4.gift) : nftitem4.name;
                    TextView textView5 = this.W;
                    textView5.setText(h);
                    textView5.setTypeface(this.g0 ? Typeface.DEFAULT : gl.o());
                    Typeface o = this.g0 ? gl.o() : Typeface.DEFAULT;
                    TextView textView6 = this.a0;
                    textView6.setTypeface(o);
                    if (this.g0) {
                        textView6.setText(c.b());
                    } else {
                        textView6.setText(k96.M0(wallettransaction.nft.isPhoneNumber() ? 2131742930 : wallettransaction.nft.isUsername() ? 2131742928 : (z13 || wallettransaction.nft.isGift()) ? 2131742932 : 2131742933, null));
                    }
                } else {
                    linearLayout.setVisibility(8);
                    be0Var2.b();
                }
                boolean z14 = c == null && wallettransaction.nft != null;
                this.h0 = z14;
                setDateBelowNft(z14);
                z3 = c != null ? wallettransaction.nft != null : c.d != 0;
                j2 = wallettransaction.amount;
                Drawable drawable2 = this.s;
                Drawable drawable3 = this.w;
                TextView textView7 = this.r;
                if (j2 != j && wallettransaction.key_change) {
                    textView7.setVisibility(8);
                } else if (c == null && c.a == 9) {
                    textView7.setVisibility(8);
                } else if (z3) {
                    textView7.setVisibility(0);
                    textView7.setCompoundDrawablesRelative(null, null, drawable2, null);
                    boolean z15 = this.d0;
                    long abs = Math.abs(c != null ? c.e : wallettransaction.amount);
                    SpannableStringBuilder u = c.u(c.s(abs, false), 0.78571427f);
                    if (abs != j) {
                        if (z15) {
                            u.insert(0, (CharSequence) "+");
                        } else if (!z15) {
                            u.insert(0, (CharSequence) "–");
                        }
                    }
                    textView7.setText(u);
                } else {
                    textView7.setVisibility(0);
                    textView7.setCompoundDrawablesRelative(null, null, drawable3, null);
                    if (this.d0) {
                        textView7.setText(k96.M0(2131742843, null));
                    } else {
                        textView7.setText(k96.M0(2131742795, null));
                    }
                }
                int visibility = textView7.getVisibility();
                jqc jqcVar = this.x;
                jqcVar.setVisibility(visibility);
                CharSequence text2 = textView7.getText();
                if (z3) {
                    drawable2 = drawable3;
                }
                TextView textView8 = jqcVar.a;
                textView8.setText(text2);
                textView8.setCompoundDrawablesRelative(null, null, null, null);
                jqcVar.b.setImageDrawable(drawable2);
                jqcVar.f = this.P;
                jqcVar.a();
                b(z4, (!this.O || this.P) ? 1.0f : 0.0f);
                this.b0 = z;
                updateColors();
                invalidate();
            }
        } else if (wallettransaction.nft != null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(c.b());
        }
        str = null;
        z2 = wallettransaction.pending;
        TextView textView42 = this.n;
        if (z2) {
        }
        nftitem = wallettransaction.nft;
        be0 be0Var22 = this.U;
        LinearLayout linearLayout2 = this.T;
        if (nftitem == null) {
        }
        if (c == null) {
        }
        this.h0 = z14;
        setDateBelowNft(z14);
        if (c != null) {
        }
        j2 = wallettransaction.amount;
        Drawable drawable22 = this.s;
        Drawable drawable32 = this.w;
        TextView textView72 = this.r;
        if (j2 != j) {
        }
        if (c == null) {
        }
        if (z3) {
        }
        int visibility2 = textView72.getVisibility();
        jqc jqcVar2 = this.x;
        jqcVar2.setVisibility(visibility2);
        CharSequence text22 = textView72.getText();
        if (z3) {
        }
        TextView textView82 = jqcVar2.a;
        textView82.setText(text22);
        textView82.setCompoundDrawablesRelative(null, null, null, null);
        jqcVar2.b.setImageDrawable(drawable22);
        jqcVar2.f = this.P;
        jqcVar2.a();
        b(z4, (!this.O || this.P) ? 1.0f : 0.0f);
        this.b0 = z;
        updateColors();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(true, (this.O || this.P) ? 1.0f : 0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d();
        ((ArrayList) this.J.b).clear();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        this.P = false;
        jqc jqcVar = this.x;
        jqcVar.f = false;
        jqcVar.a();
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
        paint.setColor(bkb.j0.getColor());
        paint.setAlpha(Math.round((1.0f - this.G) * bkb.j0.getAlpha()));
        canvas.drawRect(k96.a0 ? 0.0f : gl.L(71.0f), getHeight() - 1, getWidth() - (k96.a0 ? gl.L(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = this.h0;
        LinearLayout linearLayout = this.T;
        int i3 = 0;
        if (z && linearLayout.getVisibility() == 0) {
            jqc jqcVar = this.x;
            if (jqcVar.getVisibility() == 0) {
                jqcVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31), 0);
                i3 = -(gl.L(8.0f) + jqcVar.getMeasuredWidth());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != i3) {
            layoutParams.rightMargin = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.c6;
        wjb wjbVar = this.b;
        this.F.setColor(bkb.p1(this.G, bkb.v0(i, wjbVar)));
        int i2 = bkb.F6;
        this.f.setTextColor(bkb.v0(i2, wjbVar));
        this.h.setTextColor(bkb.v0(i2, wjbVar));
        int i3 = bkb.y6;
        this.n.setTextColor(bkb.v0(i3, wjbVar));
        int v0 = (!this.c0 || this.O) ? this.d0 ? bkb.v0(bkb.kk, wjbVar) : bkb.v0(i2, wjbVar) : bkb.v0(i3, wjbVar);
        this.x.a.setTextColor(v0);
        this.w.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        int v02 = bkb.v0(bkb.Z6, wjbVar);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != v02) {
                shapeDrawable.getPaint().setColor(v02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(bkb.b0(gl.L(10.0f), v02));
        }
        this.W.setTextColor(bkb.v0(i2, wjbVar));
        if (!this.g0) {
            i2 = i3;
        }
        this.a0.setTextColor(bkb.v0(i2, wjbVar));
    }
}
