package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.ef0;
import org.telegram.ui.u10;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class x2 extends Dialog {
    public static final /* synthetic */ int R = 0;
    public Bitmap E;
    public i0.c F;
    public float G;
    public float H;
    public boolean I;
    public final u10 J;
    public final RectF K;
    public ValueAnimator L;
    public boolean M;
    public boolean N;
    public boolean O;
    public Runnable P;
    public final int[] Q;
    public final org.telegram.ui.ActionBar.n2 a;
    public final zh0 b;
    public final boolean c;
    public final boolean d;
    public final RectF e;
    public final w2 f;
    public final v5 h;
    public final w7 n;
    public final ci.i4 r;
    public final TextView s;
    public final Paint v;
    public final RectF w;
    public final gh.b x;
    public final bh.b y;

    public x2(org.telegram.ui.ActionBar.n2 n2Var, zh0 zh0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(n2Var.getParentActivity(), R.style.TransparentDialog);
        RectF rectF = new RectF();
        this.e = rectF;
        this.v = new Paint(3);
        this.w = new RectF();
        gh.b bVar = new gh.b();
        this.x = bVar;
        this.F = i0.c.e;
        this.J = new u10();
        this.K = new RectF();
        this.Q = new int[2];
        this.a = n2Var;
        this.b = zh0Var;
        int i10 = 1;
        boolean z10 = user != null && user.id == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId();
        this.d = z10;
        this.c = (user == null || z10) ? false : true;
        zh0Var.getLocationOnScreen(new int[2]);
        rectF.set(zh0Var.w);
        rectF.offset(r7[0], r7[1]);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        w2 w2Var = new w2(this, getContext());
        this.f = w2Var;
        w2Var.setClipChildren(false);
        w2Var.setClipToPadding(false);
        w2Var.setOnClickListener(new t2(this, r9));
        o2 o2Var = new o2(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(w2Var, o2Var);
        v5 v5Var = new v5(R.drawable.wallet_card_qr, 46, getContext(), false);
        this.h = v5Var;
        v5Var.setDiamondOnCard(true);
        int currentAccount = n2Var.getCurrentAccount();
        String userName = UserObject.getUserName(user);
        Locale locale = Locale.ROOT;
        v5Var.setCardHolder(userName.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            v5Var.setCardNumber(v5.e(cardVar.address.toUpperCase(locale)));
        }
        v5Var.l(currentAccount, cardVar.balance);
        CharSequence l4 = m0.w(currentAccount).l(cardVar.balance, false);
        if (!TextUtils.isEmpty(l4)) {
            v5Var.S.c(l4, false, true);
        }
        v5Var.setCardOnClickListener(new ef0(23, this, n2Var));
        v5Var.setOnClickListener(new ah.f(24));
        v5Var.setAlpha(0.0f);
        w2Var.addView(v5Var, w7.z5.d(-2.0f, -2));
        w7 w7Var = new w7(n2Var, v5Var, null, cardVar);
        this.n = w7Var;
        w2Var.addView(w7Var, w7.z5.d(-1.0f, -1));
        bh.b bVar2 = new bh.b(bVar);
        this.y = bVar2;
        bVar2.f = new ih.j(w2Var);
        bVar2.g = w2Var;
        ci.i4 i4Var = new ci.i4(getContext());
        this.r = i4Var;
        dh.d c10 = bVar2.c(i4Var, new eh.b(org.telegram.ui.ActionBar.h6.d6, n2Var.getResourceProvider()), false);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(22.0f));
        i4Var.setBackground(c10);
        w7.b6.b(i4Var, 0.02f, 1.2f);
        ei.d dVar = new ei.d(getContext(), n2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence string = LocaleController.getString(z10 ? R.string.WalletOpenMyMoney : R.string.WalletSendMoney);
        if (z10) {
            dVar.g(string, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(string);
            yq yqVar = new yq(R.drawable.mini_gram_24, 0);
            yqVar.setSize(AndroidUtilities.dp(20.0f));
            yqVar.setOverrideColor(-1);
            append.setSpan(yqVar, 0, 1, 33);
            dVar.g(append, false, true);
        }
        dVar.setStateListAnimator(null);
        i4Var.addView(dVar, w7.z5.e(-2, -1, 17));
        i4Var.setContentDescription(string);
        i4Var.setOnClickListener(new n1(this, n2Var, cardVar, i10));
        i4Var.setAlpha(0.0f);
        i4Var.setVisibility(c() ? 0 : 8);
        w2Var.addView(i4Var, w7.z5.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.s = textView;
        textView.setText(LocaleController.getString(R.string.WalletPublicBalanceNote));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.41f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, n2Var.getResourceProvider())));
        textView.setAlpha(0.0f);
        textView.setVisibility(z10 ? 0 : 8);
        w2Var.addView(textView, w7.z5.e(-2, -2, 49));
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (f7 == 1.0f && this.O) {
            return;
        }
        if (f7 == 1.0f) {
            this.O = true;
        }
        int i10 = 0;
        this.I = f7 == 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f7);
        this.L = ofFloat;
        ofFloat.setDuration(f7 == 1.0f ? 650L : 380L);
        this.L.setInterpolator(new LinearInterpolator());
        this.L.addUpdateListener(new u2(this, i10));
        this.L.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 6));
        this.L.start();
    }

    public final void b() {
        if (this.N) {
            return;
        }
        this.N = true;
        this.b.setEjectProgress(0.0f);
        super.dismiss();
        this.n.p();
        this.x.a(null);
        this.E = null;
        if (this.P == null || this.a.getParentActivity() == null) {
            return;
        }
        Runnable runnable = this.P;
        this.P = null;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final boolean c() {
        return this.c || this.d;
    }

    public final void d() {
        float f7;
        float interpolation = bs.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.G / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.G - 0.3f) / 0.7f));
        float interpolation2 = bs.h.getInterpolation(max);
        if (this.I) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f7 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f7 = interpolation2;
        }
        v5 v5Var = this.h;
        float width = v5Var.getWidth();
        float height = v5Var.getHeight();
        RectF rectF = this.e;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float lerp = AndroidUtilities.lerp(max2, 1.0f, f7);
        float centerY = rectF.centerY();
        int[] iArr = this.Q;
        float f10 = centerY - iArr[1];
        float f11 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f12 = width / 2.0f;
        float f13 = height / 2.0f;
        float lerp2 = AndroidUtilities.lerp(centerX, v5Var.getLeft() + f12, f7);
        float lerp3 = AndroidUtilities.lerp((f11 * interpolation) + (f10 - (f11 / 2.0f)), v5Var.getTop() + f13, f7);
        float f14 = 1.0f - f7;
        float f15 = (-90.0f) * f14;
        double d10 = f15;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f16 = centerX - lerp2;
        float f17 = f10 - lerp3;
        float f18 = (((sin * f17) + (cos * f16)) / lerp) + f12;
        float f19 = (((f17 * cos) + ((-sin) * f16)) / lerp) + f13;
        float lerp4 = AndroidUtilities.lerp(f18, f12, interpolation2);
        float lerp5 = AndroidUtilities.lerp(f19, f13, interpolation2);
        float f20 = lerp4 - f12;
        float f21 = lerp5 - f13;
        v5Var.setPivotX(lerp4);
        v5Var.setPivotY(lerp5);
        v5Var.setScaleX(lerp);
        v5Var.setScaleY(lerp);
        v5Var.setRotation(f15);
        v5Var.setRotationX(35.0f * f14);
        v5Var.setTranslationX((((cos * f20) - (sin * f21)) * lerp) + ((lerp2 - v5Var.getLeft()) - lerp4));
        v5Var.setTranslationY((((cos * f21) + (sin * f20)) * lerp) + ((lerp3 - v5Var.getTop()) - lerp5));
        v5Var.setAlpha(this.G > 0.0f ? 1.0f : 0.0f);
        v5Var.setUseGyroscope(interpolation2);
        float f22 = 1.0f - interpolation2;
        this.H = Math.max(0.0f, f10 * f22);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(interpolation2);
        ci.i4 i4Var = this.r;
        i4Var.setAlpha(interpolation2);
        TextView textView = this.s;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f22);
        i4Var.setTranslationY(AndroidUtilities.dp(16.0f) * f22);
        i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        this.f.invalidate();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.N || this.M) {
            return;
        }
        this.M = true;
        this.r.setEnabled(false);
        if (!this.f.isAttachedToWindow() || this.G == 0.0f) {
            b();
        } else {
            a(0.0f);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        w2 w2Var = this.f;
        setContentView(w2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        w2Var.setSystemUiVisibility(1792);
        AndroidUtilities.setLightNavigationBar(w2Var, !org.telegram.ui.ActionBar.h6.I.q());
        AndroidUtilities.setLightStatusBar(window, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            ym0.d(new d(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.f);
        }
    }
}
