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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hk0;
import org.telegram.ui.uq0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class n3 extends Dialog {
    public static final /* synthetic */ int W = 0;
    public final RectF D;
    public final ri.b E;
    public final dh.c F;
    public Bitmap G;
    public i0.b H;
    public float I;
    public float J;
    public boolean K;
    public final h6.m L;
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
    public final org.telegram.ui.ActionBar.f2 a;
    public final gf0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final l3 h;
    public final m3 n;
    public final f6 r;
    public final a8 s;
    public final uq0 w;
    public final TextView x;
    public final Paint y;

    public n3(org.telegram.ui.ActionBar.f2 f2Var, gf0 gf0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(f2Var.getParentActivity(), R.style.TransparentDialog);
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.D = new RectF();
        ri.b bVar = new ri.b();
        this.E = bVar;
        this.H = i0.b.e;
        this.L = new h6.m(28);
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.a = f2Var;
        this.b = gf0Var;
        int i7 = 1;
        boolean z9 = user != null && user.id == p10.i(f2Var.getCurrentAccount()).e();
        this.e = z9;
        boolean z10 = (user == null || z9 || !((org.telegram.messenger.h0) qp.s1(f2Var.getCurrentAccount()).x7.j0.b).c) ? false : true;
        this.c = z10;
        this.d = (user == null || z9 || z10) ? false : true;
        gf0Var.getLocationOnScreen(new int[2]);
        rectF.set(gf0Var.w);
        rectF.offset(r12[0], r12[1]);
        org.telegram.messenger.g0.S(getWindow());
        l3 l3Var = new l3(this, getContext());
        this.h = l3Var;
        m3 m3Var = new m3(this, getContext());
        this.n = m3Var;
        m3Var.setAlpha(0.0f);
        l3Var.addView(m3Var, c8.ha.c(-1.0f, -1));
        l3Var.setClipChildren(false);
        l3Var.setClipToPadding(false);
        l3Var.setOnClickListener(new h3(this, r9));
        c3 c3Var = new c3(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(l3Var, c3Var);
        f6 f6Var = new f6(getContext());
        this.r = f6Var;
        f6Var.setDiamondOnCard(true);
        int currentAccount = f2Var.getCurrentAccount();
        String p10 = t10.p(user);
        Locale locale = Locale.ROOT;
        f6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            f6Var.setCardNumber(f6.d(cardVar.address.toUpperCase(locale)));
        }
        f6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = l0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            f6Var.O.c(m10, false, true);
        }
        f6Var.setCardOnClickListener(new hk0(18, this, f2Var));
        f6Var.setOnClickListener(new bi.l1(21));
        f6Var.setAlpha(0.0f);
        l3Var.addView(f6Var, c8.ha.c(-2.0f, -2));
        a8 a8Var = new a8(f2Var, f6Var, null, cardVar);
        this.s = a8Var;
        l3Var.addView(a8Var, c8.ha.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.F = cVar;
        cVar.h = new jh.k(l3Var);
        cVar.i = l3Var;
        uq0 uq0Var = new uq0(getContext());
        this.w = uq0Var;
        fh.g c10 = cVar.c(uq0Var, new gh.b(org.telegram.ui.ActionBar.l6.d6, f2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        uq0Var.setBackground(c10);
        c8.ka.b(uq0Var, 0.02f, 1.2f);
        fi.d dVar = new fi.d(getContext(), f2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = id.M0(z9 ? 2131743061 : z10 ? 2131743017 : 2131749276, null);
        if (z10) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            wp wpVar = new wp(R.drawable.mini_gram_24, 0);
            wpVar.c(org.telegram.messenger.g0.L(20.0f));
            wpVar.y = -1;
            append.setSpan(wpVar, 0, 1, 33);
            dVar.i(append, false, true);
        } else {
            dVar.i(M0, false, true);
        }
        dVar.setStateListAnimator(null);
        uq0Var.addView(dVar, c8.ha.e(-2, -1, 17));
        uq0Var.setContentDescription(M0);
        uq0Var.setOnClickListener(new i1(this, f2Var, cardVar, i7));
        uq0Var.setAlpha(0.0f);
        uq0Var.setVisibility(c() ? 0 : 8);
        l3Var.addView(uq0Var, c8.ha.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z9) {
            textView.setText(id.M0(2131743043, null));
        } else if (user != null) {
            String j3 = t10.j(user, true);
            textView.setText(fi.m3.b(new BigDecimal(l0.p(cardVar.balance, false)).signum() == 0 ? id.a0(null, null, 2131743045, j3) : id.a0(null, null, 2131743046, j3, l0.l("Grams", f6.e(cardVar.balance).toString(), 2131749507).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        l3Var.addView(textView, c8.ha.e(-2, -2, 49));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (f10 == 1.0f && this.T) {
            return;
        }
        if (f10 == 1.0f) {
            this.T = true;
        }
        this.K = f10 == 1.0f;
        f6 f6Var = this.r;
        f6Var.getClass();
        f6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.O = ofFloat;
        ofFloat.setDuration(f10 == 1.0f ? 650L : 380L);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new k3(this, 0));
        this.O.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 6));
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
        org.telegram.messenger.g0.h3(runnable);
    }

    public final boolean c() {
        return this.c || this.d || this.e;
    }

    public final void d() {
        boolean q10 = org.telegram.ui.ActionBar.l6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            l3 l3Var = this.h;
            if (l3Var.getWidth() > 0 && l3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.G.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) l3Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) l3Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.l6.r1(0.41f, q10 ? -1 : -16777216));
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
        this.w.setEnabled(false);
        if (!this.h.isAttachedToWindow() || this.I == 0.0f) {
            b();
        } else {
            a(0.0f);
        }
    }

    public final void e() {
        float f10;
        float interpolation = xq.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = xq.h.getInterpolation(max);
        if (this.K) {
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
        int[] iArr = this.V;
        float f11 = centerY - iArr[1];
        float f12 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f13 = width / 2.0f;
        float f14 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, f6Var.getLeft() + f13, f10);
        float T13 = org.telegram.messenger.g0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), f6Var.getTop() + f14, f10);
        float f15 = 1.0f - f10;
        float f16 = (-90.0f) * f15;
        double d2 = f16;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
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
        f6Var.setAlpha(this.I > 0.0f ? 1.0f : 0.0f);
        f6Var.setUseGyroscope(this.Q * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f11 * f23);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.I);
        this.s.setAlpha(interpolation2);
        uq0 uq0Var = this.w;
        uq0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f23);
        uq0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f23);
        uq0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        uq0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
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
        attributes.gravity = qs.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        l3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(l3Var, !org.telegram.ui.ActionBar.l6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.l6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            kk0.d(new d(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.h);
        }
    }
}
