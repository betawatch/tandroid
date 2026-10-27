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
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zq;
import org.telegram.ui.y10;
import org.telegram.ui.zd0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y2 extends Dialog {
    public static final /* synthetic */ int W = 0;
    public final hh.b E;
    public final ch.b F;
    public Bitmap G;
    public i0.b H;
    public float I;
    public float J;
    public boolean K;
    public final y10 L;
    public final RectF M;
    public final RectF N;
    public ValueAnimator O;
    public ValueAnimator P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Runnable U;
    public final int[] V;
    public final org.telegram.ui.ActionBar.r2 a;
    public final di0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final w2 h;
    public final x2 n;
    public final w5 r;
    public final t7 s;
    public final di.i4 v;
    public final TextView w;
    public final Paint x;
    public final RectF y;

    public y2(org.telegram.ui.ActionBar.r2 r2Var, di0 di0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(r2Var.getParentActivity(), R.style.TransparentDialog);
        RectF rectF = new RectF();
        this.f = rectF;
        this.x = new Paint(3);
        this.y = new RectF();
        hh.b bVar = new hh.b();
        this.E = bVar;
        this.H = i0.b.e;
        this.L = new y10();
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.a = r2Var;
        this.b = di0Var;
        int i10 = 1;
        boolean z10 = user != null && user.id == UserConfig.getInstance(r2Var.getCurrentAccount()).getClientUserId();
        this.e = z10;
        boolean z11 = (user == null || z10 || !MessagesController.getInstance(r2Var.getCurrentAccount()).config.walletAvailable.get()) ? false : true;
        this.c = z11;
        this.d = (user == null || z10 || z11) ? false : true;
        di0Var.getLocationOnScreen(new int[2]);
        rectF.set(di0Var.v);
        rectF.offset(r12[0], r12[1]);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        w2 w2Var = new w2(this, getContext());
        this.h = w2Var;
        x2 x2Var = new x2(this, getContext());
        this.n = x2Var;
        x2Var.setAlpha(0.0f);
        w2Var.addView(x2Var, kb1.g(-1.0f, -1));
        w2Var.setClipChildren(false);
        w2Var.setClipToPadding(false);
        w2Var.setOnClickListener(new s2(this, r9));
        n2 n2Var = new n2(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(w2Var, n2Var);
        w5 w5Var = new w5(getContext());
        this.r = w5Var;
        w5Var.setDiamondOnCard(true);
        int currentAccount = r2Var.getCurrentAccount();
        String userName = UserObject.getUserName(user);
        Locale locale = Locale.ROOT;
        w5Var.setCardHolder(userName.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            w5Var.setCardNumber(w5.d(cardVar.address.toUpperCase(locale)));
        }
        w5Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = l0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            w5Var.O.c(m10, false, true);
        }
        int i11 = 24;
        w5Var.setCardOnClickListener(new zd0(i11, this, r2Var));
        w5Var.setOnClickListener(new bh.f(i11));
        w5Var.setAlpha(0.0f);
        w2Var.addView(w5Var, kb1.g(-2.0f, -2));
        t7 t7Var = new t7(r2Var, w5Var, null, cardVar);
        this.s = t7Var;
        w2Var.addView(t7Var, kb1.g(-1.0f, -1));
        ch.b bVar2 = new ch.b(bVar);
        this.F = bVar2;
        bVar2.f = new jh.k(w2Var);
        bVar2.g = w2Var;
        di.i4 i4Var = new di.i4(getContext());
        this.v = i4Var;
        eh.d c10 = bVar2.c(i4Var, new fh.b(org.telegram.ui.ActionBar.y6.d6, r2Var.getResourceProvider()), false);
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(22.0f));
        i4Var.setBackground(c10);
        kb1.c(i4Var, 0.02f, 1.2f);
        fi.d dVar = new fi.d(getContext(), r2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence string = LocaleController.getString(z10 ? R.string.WalletOpenMyMoney : z11 ? R.string.WalletSendMoney : R.string.HowDoesItWork);
        if (z11) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(string);
            zq zqVar = new zq(R.drawable.mini_gram_24, 0);
            zqVar.setSize(AndroidUtilities.dp(20.0f));
            zqVar.setOverrideColor(-1);
            append.setSpan(zqVar, 0, 1, 33);
            dVar.i(append, false, true);
        } else {
            dVar.i(string, false, true);
        }
        dVar.setStateListAnimator(null);
        i4Var.addView(dVar, kb1.i(-2, -1, 17));
        i4Var.setContentDescription(string);
        i4Var.setOnClickListener(new m1(this, r2Var, cardVar, i10));
        i4Var.setAlpha(0.0f);
        i4Var.setVisibility(c() ? 0 : 8);
        w2Var.addView(i4Var, kb1.i(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.w = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.WalletPublicBalanceNote));
        } else if (user != null) {
            String firstName = UserObject.getFirstName(user);
            textView.setText(fi.v3.b(new BigDecimal(l0.p(cardVar.balance, false)).signum() == 0 ? LocaleController.formatString(R.string.WalletProfileOwnsNoGrams, firstName) : LocaleController.formatString(R.string.WalletProfileOwnsGrams, firstName, l0.l("Grams", w5.e(cardVar.balance).toString(), R.string.Grams_other).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        w2Var.addView(textView, kb1.i(-2, -2, 49));
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (f7 == 1.0f && this.T) {
            return;
        }
        if (f7 == 1.0f) {
            this.T = true;
        }
        this.K = f7 == 1.0f;
        w5 w5Var = this.r;
        w5Var.getClass();
        w5Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.O = ofFloat;
        ofFloat.setDuration(f7 == 1.0f ? 650L : 380L);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new v2(this, 0));
        this.O.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 7));
        this.O.start();
    }

    public final void b() {
        if (this.S) {
            return;
        }
        this.S = true;
        this.r.setLayerType(0, null);
        this.b.setEjectProgress(0.0f);
        super.dismiss();
        this.s.p();
        this.E.a(null);
        this.G = null;
        if (this.U == null || this.a.getParentActivity() == null) {
            return;
        }
        Runnable runnable = this.U;
        this.U = null;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final boolean c() {
        return this.c || this.d || this.e;
    }

    public final void d() {
        boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.w;
        if (bitmap != null && !bitmap.isRecycled()) {
            w2 w2Var = this.h;
            if (w2Var.getWidth() > 0 && w2Var.getHeight() > 0) {
                q5 = AndroidUtilities.computePerceivedBrightness(this.G.getPixel(Utilities.clamp((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) w2Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.clamp((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) w2Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.41f, q5 ? -1 : -16777216));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.S || this.R) {
            return;
        }
        this.R = true;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.v.setEnabled(false);
        if (!this.h.isAttachedToWindow() || this.I == 0.0f) {
            b();
        } else {
            a(0.0f);
        }
    }

    public final void e() {
        float f7;
        float interpolation = ds.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = ds.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f7 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f7 = interpolation2;
        }
        w5 w5Var = this.r;
        float width = w5Var.getWidth();
        float height = w5Var.getHeight();
        RectF rectF = this.f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float lerp = AndroidUtilities.lerp(max2, 1.0f, f7);
        float centerY = rectF.centerY();
        int[] iArr = this.V;
        float f10 = centerY - iArr[1];
        float f11 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f12 = width / 2.0f;
        float f13 = height / 2.0f;
        float lerp2 = AndroidUtilities.lerp(centerX, w5Var.getLeft() + f12, f7);
        float lerp3 = AndroidUtilities.lerp((f11 * interpolation) + (f10 - (f11 / 2.0f)), w5Var.getTop() + f13, f7);
        float f14 = 1.0f - f7;
        float f15 = (-90.0f) * f14;
        double d10 = f15;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f16 = centerX - lerp2;
        float f17 = f10 - lerp3;
        float f18 = (((sin * f17) + (cos * f16)) / lerp) + f12;
        float f19 = (((cos * f17) + ((-sin) * f16)) / lerp) + f13;
        float lerp4 = AndroidUtilities.lerp(f18, f12, interpolation2);
        float lerp5 = AndroidUtilities.lerp(f19, f13, interpolation2);
        float f20 = lerp4 - f12;
        float f21 = lerp5 - f13;
        w5Var.setPivotX(lerp4);
        w5Var.setPivotY(lerp5);
        w5Var.setScaleX(lerp);
        w5Var.setScaleY(lerp);
        w5Var.setRotation(f15);
        w5Var.setRotationX(35.0f * f14);
        w5Var.setTranslationX((((cos * f20) - (sin * f21)) * lerp) + ((lerp2 - w5Var.getLeft()) - lerp4));
        w5Var.setTranslationY(org.telegram.ui.d3.e(cos, f21, sin * f20, lerp, (lerp3 - w5Var.getTop()) - lerp5));
        w5Var.setAlpha(this.I > 0.0f ? 1.0f : 0.0f);
        w5Var.setUseGyroscope(this.Q * interpolation2);
        float f22 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f10 * f22);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.I);
        this.s.setAlpha(interpolation2);
        di.i4 i4Var = this.v;
        i4Var.setAlpha(interpolation2);
        TextView textView = this.w;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f22);
        i4Var.setTranslationY(AndroidUtilities.dp(16.0f) * f22);
        i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        w2 w2Var = this.h;
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
        AndroidUtilities.setLightNavigationBar(w2Var, !org.telegram.ui.ActionBar.y6.I.q());
        AndroidUtilities.setLightStatusBar(window, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            in0.d(new d(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.h);
        }
    }
}
