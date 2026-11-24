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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class m0c extends FrameLayout implements vlb {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public zna I;
    public final trc J;
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
    public final bf0 U;
    public Drawable V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public final ylb b;
    public boolean b0;
    public final pc0 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final bf0 e;
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
    public final lsc x;
    public final Paint y;

    public m0c(int i, ylb ylbVar, Context context) {
        super(context);
        this.c = new pc0((ylb) null);
        this.y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new trc();
        this.a = i;
        this.b = ylbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        bf0 bf0Var = new bf0(context);
        this.e = bf0Var;
        bf0Var.setRoundRadius(gm.L(23.0f));
        addView(bf0Var, qoe.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, qoe.d(-1, -1.0f, nm7.D1, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, qoe.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.n1("fonts/rmedium.ttf"));
        textView.setMaxWidth(gm.L(120.0f));
        TextView m = wi8.m(linearLayout2, textView, qoe.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = m;
        m.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m.setEllipsize(truncateAt);
        m.setIncludeFontPadding(false);
        m.setGravity(16);
        m.setTextSize(1, 13.0f);
        TextView m2 = wi8.m(linearLayout2, m, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = m2;
        m2.setSingleLine(true);
        m2.setEllipsize(truncateAt);
        m2.setIncludeFontPadding(false);
        m2.setGravity(16);
        m2.setTextSize(1, 13.0f);
        linearLayout2.addView(m2, qoe.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, qoe.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        bf0 bf0Var2 = new bf0(context);
        this.U = bf0Var2;
        bf0Var2.setRoundRadius(gm.L(8.0f));
        linearLayout3.addView(bf0Var2, qoe.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, qoe.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        wi8.v(textView2, 1, 14.0f);
        TextView m3 = wi8.m(linearLayout4, textView2, qoe.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.a0 = m3;
        m3.setTextSize(1, 14.0f);
        linearLayout4.addView(m3, qoe.t(-1, -2, 55, 0, 0, 0, 0));
        lsc lscVar = new lsc(context);
        this.x = lscVar;
        this.r = lscVar.a;
        Drawable d = b10.d(context, R.drawable.wallet_gram_small);
        this.s = d;
        d.setBounds(0, 0, gm.L(16.0f), gm.L(16.0f));
        Drawable d2 = b10.d(context, R.drawable.wallet_nft);
        this.w = d2;
        d2.setBounds(0, 0, gm.L(16.0f), gm.L(16.0f));
        linearLayout.addView(lscVar, qoe.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(gm.L(16.0f));
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
                layoutParams2.topMargin = gm.L(z ? 4.0f : -2.0f);
                layoutParams2.bottomMargin = gm.L(z ? 2.0f : 8.0f);
                layoutParams.topMargin = gm.L(2.0f);
                layoutParams.bottomMargin = gm.L(10.0f);
            }
        }
    }

    private void setIconColor(ll5 ll5Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new h0c(ll5Var));
        this.d.setBackground(shapeDrawable);
    }

    private void setPendingProgress(float f) {
        this.G = f;
        this.F.setColor(cmb.p1(this.G, cmb.v0(cmb.c6, this.b)));
        c();
        setElevation(gm.L(8.0f) * f);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f = 0.0f;
        }
        lsc lscVar = this.x;
        lscVar.d = f;
        if (f > 0.0f && lscVar.c == null) {
            npc npcVar = new npc(40, lscVar.getContext(), true);
            lscVar.c = npcVar;
            npcVar.setContinuousRotation(300.0f);
            lscVar.addView(lscVar.c, qoe.c(40.0f, 40));
        }
        npc npcVar2 = lscVar.c;
        if (npcVar2 != null && f == 0.0f) {
            npcVar2.setPaused(true);
            lscVar.removeView(lscVar.c);
            lscVar.c = null;
        }
        lscVar.a();
        lscVar.requestLayout();
        invalidate();
    }

    public final CharSequence a(l0c l0cVar, String str) {
        int indexOf;
        String a = l0cVar.a(str);
        Typeface typeface = hoc.x;
        if (str != null && a != null && (indexOf = a.indexOf(8230)) > 0 && indexOf < a.length() - 1) {
            String substring = a.substring(0, indexOf);
            String substring2 = a.substring(indexOf + 1);
            int length = str.length();
            if (str.startsWith(substring) && str.endsWith(substring2)) {
                if (length >= substring2.length() + substring.length() + 4) {
                    String substring3 = str.substring(substring.length(), substring.length() + 2);
                    String substring4 = str.substring((length - substring2.length()) - 2, length - substring2.length());
                    SpannableString spannableString = new SpannableString(a);
                    spannableString.setSpan(new hoc(substring, substring3, substring4, substring2, this.b), 0, spannableString.length(), 33);
                    return spannableString;
                }
            }
        }
        return a;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Z6));
    }

    public final void b(boolean z, float f) {
        TL_wallet.walletTransaction wallettransaction;
        npc pendingDiamond;
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
                    if (f == 0.0f && f2 > 0.0f && (wallettransaction = this.S) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a = esc.a(pendingDiamond, this);
                        float centerX = a.centerX();
                        float centerY = a.centerY();
                        trc trcVar = this.J;
                        trcVar.getClass();
                        float f3 = gm.p;
                        for (int i = 0; i < 56; i++) {
                            int i2 = i % 10;
                            if (i2 <= 6) {
                                y = trcVar.y(-0.3f, 0.3f) + 3.1415927f;
                                y2 = trcVar.y(140.0f, 560.0f);
                            } else if (i2 <= 8) {
                                y = (trcVar.y(0.5f, 1.4f) * (((Random) trcVar.c).nextBoolean() ? 1 : -1)) + 3.1415927f;
                                y2 = trcVar.y(60.0f, 240.0f);
                            } else {
                                y = trcVar.y(0.0f, 6.2831855f);
                                y2 = trcVar.y(40.0f, 160.0f);
                            }
                            trcVar.k(centerX, centerY, y, y2 * f3, trcVar.y(2.2f, 6.5f) * f3, trcVar.y(0.8f, 1.4f), 2.4f);
                        }
                        this.R = !this.Q && this.N;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new oxb(this, (byte) 3));
                    this.L.addListener(new q7b(this, (byte) 11));
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
        setTranslationY(gm.L(4.0f) * this.H);
        float f2 = this.H;
        lsc lscVar = this.x;
        lscVar.e = f2;
        lscVar.a();
    }

    public final void d() {
        zna znaVar = this.I;
        if (znaVar != null) {
            znaVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        npc pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a = esc.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.a0(a.centerX(), a.centerY(), 1.5f);
        }
        trc trcVar = this.J;
        trcVar.p(canvas);
        if (trcVar.q()) {
            postInvalidateOnAnimation();
        }
        float f = this.G;
        if (f > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.K;
            int i = cmb.Ei;
            ylb ylbVar = this.b;
            int v0 = cmb.v0(i, ylbVar);
            Paint paint = this.y;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(cmb.v0(cmb.c6, ylbVar));
            float f2 = 255.0f * f;
            paint.setAlpha(Math.round(f2));
            canvas.drawCircle(gm.L(52.0f), gm.L(51.0f), gm.L(8.0f) * f, paint);
            paint.setColor(v0);
            paint.setAlpha(Math.round(f2));
            paint.setStrokeWidth(gm.L(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(gm.L(52.0f), gm.L(51.0f), gm.L(7.0f) * f, paint);
            e(canvas, (uptimeMillis % 1000) * 0.36f, gm.L(4.6f) * f);
            e(canvas, ((uptimeMillis % 6000) * 0.06f) + 120.0f, gm.L(3.2f) * f);
            float f3 = (uptimeMillis % 1600) / 1600.0f;
            float width = getWidth() * 0.5f;
            float g = aq1.g(width, 2.0f, getWidth(), f3, -width);
            float f4 = width / 2.0f;
            float f5 = g - f4;
            float f6 = g + f4;
            int i2 = 16777215 & v0;
            paint.setShader(new LinearGradient(f5, 0.0f, f6, 0.0f, new int[]{i2, v0, -7346433, i2}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAlpha(Math.round(f * 150.0f * ((float) Math.sin(f3 * 3.141592653589793d))));
            paint.setStrokeWidth(gm.L(1.5f));
            canvas.drawRoundRect(gm.L(1.0f), gm.L(1.0f), getWidth() - gm.L(1.0f), getHeight() - gm.L(1.0f), gm.L(16.0f), gm.L(16.0f), paint);
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
        path.addCircle(gm.L(52.0f), gm.L(51.0f), gm.L(10.0f) * this.G, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(Canvas canvas, float f, float f2) {
        double radians = Math.toRadians(f - 90.0f);
        canvas.drawLine(gm.L(52.0f), gm.L(51.0f), (((float) Math.cos(radians)) * f2) + gm.L(52.0f), (((float) Math.sin(radians)) * f2) + gm.L(51.0f), this.y);
    }

    public final void f(boolean z) {
        this.P = z;
        lsc lscVar = this.x;
        lscVar.f = z;
        lscVar.a();
        b(!z, (this.O || z) ? 1.0f : 0.0f);
    }

    public final /* synthetic */ void g(ValueAnimator valueAnimator) {
        setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public npc getPendingDiamond() {
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
    public final void h(TL_wallet.walletTransaction wallettransaction, l0c l0cVar, boolean z) {
        long j;
        TextView textView;
        String str;
        int i;
        boolean z2;
        TL_wallet.nftItem nftitem;
        boolean z3;
        long j2;
        TLRPC.WebDocument webDocument;
        int i2 = k0c.b;
        TL_wallet.walletTransaction wallettransaction2 = this.S;
        boolean z4 = wallettransaction2 != null && k0c.j(wallettransaction2, wallettransaction);
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
        gs7 c = gs7.c(wallettransaction);
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
        bf0 bf0Var = this.e;
        TextView textView3 = this.f;
        if (z8) {
            bf0Var.setVisibility(8);
            setIconColor(ll5.x);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView3.setText(jb6.M0(2131742763, null));
            textView2.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? jb6.M0(2131742636, null) : l0cVar.a(wallettransaction.peer.address));
            j = 0;
            textView = textView3;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            j = 0;
            boolean z9 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i3 = this.a;
            pc0 pc0Var = this.c;
            ll5 ll5Var = ll5.n;
            ll5 ll5Var2 = ll5.c;
            if (z9) {
                TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (W1 != null) {
                    bf0Var.setVisibility(0);
                    pc0Var.q(W1);
                    bf0Var.f(W1, pc0Var);
                    String r = m9c.r(W1);
                    textView = textView3;
                    textView.setText(r);
                } else {
                    textView = textView3;
                    bf0Var.setVisibility(8);
                    if (!this.d0) {
                        ll5Var2 = ll5Var;
                    }
                    setIconColor(ll5Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView.setText(a(l0cVar, wallettransaction.peer.address));
                }
            } else {
                textView = textView3;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                    TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(wallettransaction.peer.channel_id));
                    if (L0 != null) {
                        bf0Var.setVisibility(0);
                        pc0Var.p(L0);
                        bf0Var.f(L0, pc0Var);
                        textView.setText(L0.title);
                    } else {
                        bf0Var.setVisibility(8);
                        if (!this.d0) {
                            ll5Var2 = ll5Var;
                        }
                        setIconColor(ll5Var2);
                        imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                        boolean isEmpty = TextUtils.isEmpty(wallettransaction.peer.domain);
                        TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                        textView.setText(!isEmpty ? walletTransactionPeer2.domain : a(l0cVar, walletTransactionPeer2.address));
                    }
                } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                    bf0Var.setVisibility(8);
                    if (this.d0) {
                        ll5Var2 = ll5Var;
                    }
                    setIconColor(ll5Var2);
                    imageView.setImageResource(this.d0 ? R.drawable.wallet_transaction_in : R.drawable.wallet_transaction_out);
                    textView.setText(jb6.M0(2131742648, null));
                } else if (c != null) {
                    bf0Var.setVisibility(8);
                    if (c.c) {
                        ll5Var2 = ll5Var;
                    }
                    setIconColor(ll5Var2);
                    imageView.setImageResource(c.b);
                    textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? jb6.M0(2131742725, null) : a(l0cVar, wallettransaction.peer.address));
                } else if (walletTransactionPeer instanceof i0c) {
                    bf0Var.setVisibility(8);
                    setIconColor(ll5Var2);
                    imageView.setImageResource(R.drawable.wallet_transaction_out);
                    textView.setText(TextUtils.isEmpty(wallettransaction.peer.address) ? jb6.M0(2131742636, null) : a(l0cVar, wallettransaction.peer.address));
                } else {
                    int i4 = R.drawable.wallet_transaction_out;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                        TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                        bf0Var.setVisibility(8);
                        setIconColor(ll5Var2);
                        if ("walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) || "wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                            imageView.setImageResource(R.drawable.wallet_transaction_walt);
                            textView.setText(jb6.M0(2131742646, null));
                        } else {
                            imageView.setImageResource(R.drawable.wallet_transaction_topup);
                            textView.setText(jb6.M0(2131742647, null));
                        }
                        textView2.setText(l53.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
                    } else {
                        bf0Var.setVisibility(8);
                        if (!this.d0) {
                            ll5Var2 = ll5Var;
                        }
                        setIconColor(ll5Var2);
                        if (this.d0) {
                            i4 = R.drawable.wallet_transaction_in;
                        }
                        imageView.setImageResource(i4);
                        boolean isEmpty2 = TextUtils.isEmpty(wallettransaction.peer.domain);
                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = wallettransaction.peer;
                        if (isEmpty2) {
                            textView.setText(TextUtils.isEmpty(walletTransactionPeer3.address) ? jb6.M0(2131742636, null) : a(l0cVar, wallettransaction.peer.address));
                        } else {
                            textView.setText(walletTransactionPeer3.domain);
                        }
                    }
                }
            }
        }
        String str2 = wallettransaction.peer.address;
        CharSequence text = textView.getText();
        Typeface typeface = hoc.x;
        boolean z10 = (text instanceof Spanned) && ((hoc[]) ((Spanned) text).getSpans(0, text.length(), hoc.class)).length > 0;
        boolean z11 = !z10 && str2 != null && TextUtils.equals(textView.getText(), l0cVar.a(str2)) && textView.length() > 9;
        this.e0 = z11;
        textView.setSingleLine(!z11);
        textView.setEllipsize((this.e0 || z10) ? null : TextUtils.TruncateAt.MIDDLE);
        textView.setMaxWidth((this.e0 || z10) ? ConnectionsManager.DEFAULT_DATACENTER_ID : gm.L(120.0f));
        textView.getLayoutParams().height = (this.e0 || z10) ? -2 : gm.L(18.0f);
        textView.requestLayout();
        if (wallettransaction.failed) {
            textView2.setText(jb6.M0(2131742804, null));
        } else if (c == null) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer4 = wallettransaction.peer;
            if (walletTransactionPeer4 instanceof i0c) {
                textView2.setText(jb6.M0(2131749279, null));
            } else if (!wallettransaction.key_change && !(walletTransactionPeer4 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer4 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer4).own_profile) {
                    if (this.d0) {
                        i = 2131742757;
                        str = null;
                    } else {
                        str = null;
                        i = 2131742756;
                    }
                    textView2.setText(jb6.M0(i, str));
                } else {
                    str = null;
                    TL_wallet.nftItem nftitem2 = wallettransaction.nft;
                    boolean z12 = this.d0;
                    if (nftitem2 != null) {
                        textView2.setText(jb6.M0(z12 ? 2131742767 : 2131742719, null));
                    } else {
                        textView2.setText(jb6.M0(z12 ? 2131742768 : 2131742720, null));
                    }
                }
                z2 = wallettransaction.pending;
                TextView textView4 = this.n;
                if (z2) {
                    int i5 = wallettransaction.date;
                    textView4.setText(i5 == 0 ? "" : jb6.Q(i5));
                } else {
                    textView4.setText(r8c.a(textView4, jb6.M0(2131742677, str)));
                }
                nftitem = wallettransaction.nft;
                bf0 bf0Var2 = this.U;
                LinearLayout linearLayout = this.T;
                if (nftitem == null) {
                    linearLayout.setVisibility(0);
                    int i6 = cmb.x6;
                    ylb ylbVar = this.b;
                    int v0 = cmb.v0(i6, ylbVar);
                    Drawable drawable = this.V;
                    if (drawable == null) {
                        drawable = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                        this.V = drawable;
                    }
                    anb.x(this, drawable, i6, ylbVar, PorterDuff.Mode.SRC_IN);
                    this.f0 = cmb.b0(gm.L(8.0f), cmb.p1(0.1f, v0));
                    wmb K = anb.K(0.1f, i6);
                    rjb rjbVar = new rjb((byte) 5);
                    rjb rjbVar2 = new rjb((byte) 6);
                    int i7 = K.a;
                    float f = K.d;
                    ylb ylbVar2 = this.b;
                    int P = anb.P(i7, -1, 2, f, ylbVar2);
                    rjbVar2.e(P, this);
                    umb w = anb.w(100, this);
                    w.c(i7, -1, 2, f, ylbVar2);
                    w.n = rjbVar;
                    w.o = rjbVar2;
                    w.m = false;
                    w.g = P;
                    sn2 sn2Var = new sn2(this.f0, drawable);
                    TL_wallet.nftItem nftitem3 = wallettransaction.nft;
                    TLRPC.WebDocument webDocument2 = nftitem3.image_small;
                    if (webDocument2 == null && (webDocument = nftitem3.image) != null) {
                        webDocument2 = webDocument;
                    }
                    boolean z13 = nftitem3.gift instanceof TL_stars.TL_starGiftUnique;
                    if (z13) {
                        bf0Var2.b();
                        jsa jsaVar = new jsa(bf0Var2, wallettransaction.nft.gift, 40, 0.25f);
                        jsaVar.K = gm.L(8.0f);
                        bf0Var2.setImageDrawable(jsaVar);
                    } else if (webDocument2 != null) {
                        bf0Var2.m(gn5.p(vuc.c(webDocument2)), "46_46", sn2Var, wallettransaction.nft);
                    } else {
                        bf0Var2.setImageDrawable(sn2Var);
                    }
                    TL_wallet.nftItem nftitem4 = wallettransaction.nft;
                    String h = z13 ? fs7.h(nftitem4.gift) : nftitem4.name;
                    TextView textView5 = this.W;
                    textView5.setText(h);
                    textView5.setTypeface(this.g0 ? Typeface.DEFAULT : gm.o());
                    Typeface o = this.g0 ? gm.o() : Typeface.DEFAULT;
                    TextView textView6 = this.a0;
                    textView6.setTypeface(o);
                    if (this.g0) {
                        textView6.setText(c.b());
                    } else {
                        textView6.setText(jb6.M0(wallettransaction.nft.isPhoneNumber() ? 2131742856 : wallettransaction.nft.isUsername() ? 2131742854 : (z13 || wallettransaction.nft.isGift()) ? 2131742858 : 2131742859, null));
                    }
                } else {
                    linearLayout.setVisibility(8);
                    bf0Var2.b();
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
                        textView7.setText(jb6.M0(2131742769, null));
                    } else {
                        textView7.setText(jb6.M0(2131742721, null));
                    }
                }
                int visibility = textView7.getVisibility();
                lsc lscVar = this.x;
                lscVar.setVisibility(visibility);
                CharSequence text2 = textView7.getText();
                if (z3) {
                    drawable2 = drawable3;
                }
                TextView textView8 = lscVar.a;
                textView8.setText(text2);
                textView8.setCompoundDrawablesRelative(null, null, null, null);
                lscVar.b.setImageDrawable(drawable2);
                lscVar.f = this.P;
                lscVar.a();
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
        bf0 bf0Var22 = this.U;
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
        lsc lscVar2 = this.x;
        lscVar2.setVisibility(visibility2);
        CharSequence text22 = textView72.getText();
        if (z3) {
        }
        TextView textView82 = lscVar2.a;
        textView82.setText(text22);
        textView82.setCompoundDrawablesRelative(null, null, null, null);
        lscVar2.b.setImageDrawable(drawable22);
        lscVar2.f = this.P;
        lscVar2.a();
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
        lsc lscVar = this.x;
        lscVar.f = false;
        lscVar.a();
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
        paint.setColor(cmb.j0.getColor());
        paint.setAlpha(Math.round((1.0f - this.G) * cmb.j0.getAlpha()));
        canvas.drawRect(jb6.a0 ? 0.0f : gm.L(71.0f), getHeight() - 1, getWidth() - (jb6.a0 ? gm.L(71.0f) : 0), getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = this.h0;
        LinearLayout linearLayout = this.T;
        int i3 = 0;
        if (z && linearLayout.getVisibility() == 0) {
            lsc lscVar = this.x;
            if (lscVar.getVisibility() == 0) {
                lscVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31), 0);
                i3 = -(gm.L(8.0f) + lscVar.getMeasuredWidth());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != i3) {
            layoutParams.rightMargin = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // vlb
    public final void updateColors() {
        int i = cmb.c6;
        ylb ylbVar = this.b;
        this.F.setColor(cmb.p1(this.G, cmb.v0(i, ylbVar)));
        int i2 = cmb.F6;
        this.f.setTextColor(cmb.v0(i2, ylbVar));
        this.h.setTextColor(cmb.v0(i2, ylbVar));
        int i3 = cmb.y6;
        this.n.setTextColor(cmb.v0(i3, ylbVar));
        int v0 = (!this.c0 || this.O) ? this.d0 ? cmb.v0(cmb.kk, ylbVar) : cmb.v0(i2, ylbVar) : cmb.v0(i3, ylbVar);
        this.x.a.setTextColor(v0);
        this.w.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        int v02 = cmb.v0(cmb.Z6, ylbVar);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != v02) {
                shapeDrawable.getPaint().setColor(v02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(cmb.b0(gm.L(10.0f), v02));
        }
        this.W.setTextColor(cmb.v0(i2, ylbVar));
        if (!this.g0) {
            i2 = i3;
        }
        this.a0.setTextColor(cmb.v0(i2, ylbVar));
    }
}
