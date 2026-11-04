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
import b8.mf;
import b8.pf;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hb0;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n3 extends Dialog {
    public static final /* synthetic */ int X = 0;
    public final RectF E;
    public final si.b F;
    public final eh.c G;
    public Bitmap H;
    public i0.b I;
    public float J;
    public float K;
    public boolean L;
    public final k4.j M;
    public final RectF N;
    public final RectF O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.d2 a;
    public final hf0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final l3 h;
    public final m3 n;
    public final f6 r;
    public final b8 s;
    public final yg0 w;
    public final TextView x;
    public final Paint y;

    public n3(org.telegram.ui.ActionBar.d2 d2Var, hf0 hf0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(d2Var.getParentActivity(), R.style.TransparentDialog);
        int i3;
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.E = new RectF();
        si.b bVar = new si.b();
        this.F = bVar;
        this.I = i0.b.e;
        int i10 = 24;
        this.M = new k4.j(24);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.a = d2Var;
        this.b = hf0Var;
        int i11 = 1;
        boolean z10 = user != null && user.id == h10.i(d2Var.getCurrentAccount()).e();
        this.e = z10;
        boolean z11 = (user == null || z10 || !((org.telegram.messenger.h0) hp.s1(d2Var.getCurrentAccount()).x7.j0.b).c) ? false : true;
        this.c = z11;
        this.d = (user == null || z10 || z11) ? false : true;
        hf0Var.getLocationOnScreen(new int[2]);
        rectF.set(hf0Var.w);
        rectF.offset(r13[0], r13[1]);
        org.telegram.messenger.g0.S(getWindow());
        l3 l3Var = new l3(this, getContext());
        this.h = l3Var;
        m3 m3Var = new m3(this, getContext());
        this.n = m3Var;
        m3Var.setAlpha(0.0f);
        l3Var.addView(m3Var, mf.c(-1.0f, -1));
        l3Var.setClipChildren(false);
        l3Var.setClipToPadding(false);
        l3Var.setOnClickListener(new h3(this, r10));
        c3 c3Var = new c3(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(l3Var, c3Var);
        f6 f6Var = new f6(getContext());
        this.r = f6Var;
        f6Var.setDiamondOnCard(true);
        int currentAccount = d2Var.getCurrentAccount();
        String p10 = l10.p(user);
        Locale locale = Locale.ROOT;
        f6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            f6Var.setCardNumber(f6.d(cardVar.address.toUpperCase(locale)));
        }
        f6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = k0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            f6Var.P.c(m10, false, true);
        }
        f6Var.setCardOnClickListener(new hb0(i10, this, d2Var));
        f6Var.setOnClickListener(new ai.t(27));
        f6Var.setAlpha(0.0f);
        l3Var.addView(f6Var, mf.c(-2.0f, -2));
        b8 b8Var = new b8(d2Var, f6Var, null, cardVar);
        this.s = b8Var;
        l3Var.addView(b8Var, mf.c(-1.0f, -1));
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new kh.k(l3Var);
        cVar.i = l3Var;
        yg0 yg0Var = new yg0(getContext());
        this.w = yg0Var;
        gh.g c2 = cVar.c(yg0Var, new hh.b(org.telegram.ui.ActionBar.k6.d6, d2Var.getResourceProvider()), false);
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(22.0f));
        yg0Var.setBackground(c2);
        pf.b(yg0Var, 0.02f, 1.2f);
        gi.d dVar = new gi.d(getContext(), d2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = bd.M0(z10 ? 2131743071 : z11 ? 2131743027 : 2131749284, null);
        if (z11) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            wp wpVar = new wp(R.drawable.mini_gram_24, 0);
            wpVar.c(org.telegram.messenger.g0.L(20.0f));
            i3 = -1;
            wpVar.y = -1;
            append.setSpan(wpVar, 0, 1, 33);
            dVar.i(append, false, true);
        } else {
            dVar.i(M0, false, true);
            i3 = -1;
        }
        dVar.setStateListAnimator(null);
        yg0Var.addView(dVar, mf.e(-2, i3, 17));
        yg0Var.setContentDescription(M0);
        yg0Var.setOnClickListener(new h1(this, d2Var, cardVar, i11));
        yg0Var.setAlpha(0.0f);
        yg0Var.setVisibility(c() ? 0 : 8);
        l3Var.addView(yg0Var, mf.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(bd.M0(2131743053, null));
        } else if (user != null) {
            String j10 = l10.j(user, true);
            textView.setText(gi.l3.b(new BigDecimal(k0.p(cardVar.balance, false)).signum() == 0 ? bd.a0(null, null, 2131743055, j10) : bd.a0(null, null, 2131743056, j10, k0.l("Grams", f6.e(cardVar.balance).toString(), 2131749515).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        l3Var.addView(textView, mf.e(-2, -2, 49));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (f10 == 1.0f && this.U) {
            return;
        }
        if (f10 == 1.0f) {
            this.U = true;
        }
        this.L = f10 == 1.0f;
        f6 f6Var = this.r;
        f6Var.getClass();
        f6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        ofFloat.setDuration(f10 == 1.0f ? 650L : 380L);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new k3(this, 0));
        this.P.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 6));
        this.P.start();
    }

    public final void b() {
        if (this.T) {
            return;
        }
        this.T = true;
        this.r.setLayerType(0, null);
        this.b.setEjectProgress(0.0f);
        super.dismiss();
        this.s.p();
        this.F.a(null);
        this.H = null;
        if (this.V == null || this.a.getParentActivity() == null) {
            return;
        }
        Runnable runnable = this.V;
        this.V = null;
        org.telegram.messenger.g0.h3(runnable);
    }

    public final boolean c() {
        return this.c || this.d || this.e;
    }

    public final void d() {
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        Bitmap bitmap = this.H;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            l3 l3Var = this.h;
            if (l3Var.getWidth() > 0 && l3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) l3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) l3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.41f, q10 ? -1 : -16777216));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.T || this.S) {
            return;
        }
        this.S = true;
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.w.setEnabled(false);
        if (!this.h.isAttachedToWindow() || this.J == 0.0f) {
            b();
        } else {
            a(0.0f);
        }
    }

    public final void e() {
        float f10;
        float interpolation = xq.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = xq.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        f6 f6Var = this.r;
        float width = f6Var.getWidth();
        float height = f6Var.getHeight();
        RectF rectF = this.f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.g0.T1(max2, 1.0f, f10);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f11 = centerY - iArr[1];
        float f12 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f13 = width / 2.0f;
        float f14 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, f6Var.getLeft() + f13, f10);
        float T13 = org.telegram.messenger.g0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), f6Var.getTop() + f14, f10);
        float f15 = 1.0f - f10;
        float f16 = (-90.0f) * f15;
        double d10 = f16;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f17 = centerX - T12;
        float f18 = f11 - T13;
        float f19 = (((sin * f18) + (cos * f17)) / T1) + f13;
        float f20 = (((f18 * cos) + ((-sin) * f17)) / T1) + f14;
        float T14 = org.telegram.messenger.g0.T1(f19, f13, interpolation2);
        float T15 = org.telegram.messenger.g0.T1(f20, f14, interpolation2);
        float f21 = T14 - f13;
        float f22 = T15 - f14;
        f6Var.setPivotX(T14);
        f6Var.setPivotY(T15);
        f6Var.setScaleX(T1);
        f6Var.setScaleY(T1);
        f6Var.setRotation(f16);
        f6Var.setRotationX(35.0f * f15);
        f6Var.setTranslationX((((cos * f21) - (sin * f22)) * T1) + ((T12 - f6Var.getLeft()) - T14));
        f6Var.setTranslationY((((cos * f22) + (sin * f21)) * T1) + ((T13 - f6Var.getTop()) - T15));
        f6Var.setAlpha(this.J > 0.0f ? 1.0f : 0.0f);
        f6Var.setUseGyroscope(this.R * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f11 * f23);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.J);
        this.s.setAlpha(interpolation2);
        yg0 yg0Var = this.w;
        yg0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f23);
        yg0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f23);
        yg0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        yg0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        l3 l3Var = this.h;
        setContentView(l3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = hs.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        l3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(l3Var, !org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            nk0.d(new d(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.h);
        }
    }
}
