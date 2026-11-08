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
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fk0;
import org.telegram.ui.sq0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class o3 extends Dialog {
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
    public final ff0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final m3 h;
    public final n3 n;
    public final g6 r;
    public final b8 s;
    public final sq0 w;
    public final TextView x;
    public final Paint y;

    public o3(org.telegram.ui.ActionBar.f2 f2Var, ff0 ff0Var, TLRPC.User user, TL_wallet.card cardVar) {
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
        this.b = ff0Var;
        int i7 = 1;
        boolean z9 = user != null && user.id == p10.i(f2Var.getCurrentAccount()).e();
        this.e = z9;
        boolean z10 = (user == null || z9 || !((org.telegram.messenger.h0) qp.s1(f2Var.getCurrentAccount()).x7.j0.b).c) ? false : true;
        this.c = z10;
        this.d = (user == null || z9 || z10) ? false : true;
        ff0Var.getLocationOnScreen(new int[2]);
        rectF.set(ff0Var.w);
        rectF.offset(r12[0], r12[1]);
        org.telegram.messenger.g0.S(getWindow());
        m3 m3Var = new m3(this, getContext());
        this.h = m3Var;
        n3 n3Var = new n3(this, getContext());
        this.n = n3Var;
        n3Var.setAlpha(0.0f);
        m3Var.addView(n3Var, c8.ha.c(-1.0f, -1));
        m3Var.setClipChildren(false);
        m3Var.setClipToPadding(false);
        m3Var.setOnClickListener(new i3(this, r9));
        d3 d3Var = new d3(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(m3Var, d3Var);
        g6 g6Var = new g6(getContext());
        this.r = g6Var;
        g6Var.setDiamondOnCard(true);
        int currentAccount = f2Var.getCurrentAccount();
        String p10 = t10.p(user);
        Locale locale = Locale.ROOT;
        g6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            g6Var.setCardNumber(g6.d(cardVar.address.toUpperCase(locale)));
        }
        g6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = m0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            g6Var.O.c(m10, false, true);
        }
        g6Var.setCardOnClickListener(new fk0(18, this, f2Var));
        g6Var.setOnClickListener(new bi.l1(21));
        g6Var.setAlpha(0.0f);
        m3Var.addView(g6Var, c8.ha.c(-2.0f, -2));
        b8 b8Var = new b8(f2Var, g6Var, null, cardVar);
        this.s = b8Var;
        m3Var.addView(b8Var, c8.ha.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.F = cVar;
        cVar.h = new jh.k(m3Var);
        cVar.i = m3Var;
        sq0 sq0Var = new sq0(getContext());
        this.w = sq0Var;
        fh.g c10 = cVar.c(sq0Var, new gh.b(org.telegram.ui.ActionBar.k6.d6, f2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        sq0Var.setBackground(c10);
        c8.ka.b(sq0Var, 0.02f, 1.2f);
        fi.d dVar = new fi.d(getContext(), f2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = id.M0(z9 ? 2131743064 : z10 ? 2131743020 : 2131749277, null);
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
        sq0Var.addView(dVar, c8.ha.e(-2, -1, 17));
        sq0Var.setContentDescription(M0);
        sq0Var.setOnClickListener(new j1(this, f2Var, cardVar, i7));
        sq0Var.setAlpha(0.0f);
        sq0Var.setVisibility(c() ? 0 : 8);
        m3Var.addView(sq0Var, c8.ha.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z9) {
            textView.setText(id.M0(2131743046, null));
        } else if (user != null) {
            String j3 = t10.j(user, true);
            textView.setText(fi.m3.b(new BigDecimal(m0.p(cardVar.balance, false)).signum() == 0 ? id.a0(null, null, 2131743048, j3) : id.a0(null, null, 2131743049, j3, m0.l("Grams", g6.e(cardVar.balance).toString(), 2131749508).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        m3Var.addView(textView, c8.ha.e(-2, -2, 49));
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
        g6 g6Var = this.r;
        g6Var.getClass();
        g6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.O = ofFloat;
        ofFloat.setDuration(f10 == 1.0f ? 650L : 380L);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new l3(this, 0));
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
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            m3 m3Var = this.h;
            if (m3Var.getWidth() > 0 && m3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.G.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) m3Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) m3Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.41f, q10 ? -1 : -16777216));
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
        g6 g6Var = this.r;
        float width = g6Var.getWidth();
        float height = g6Var.getHeight();
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
        float T12 = org.telegram.messenger.g0.T1(centerX, g6Var.getLeft() + f13, f10);
        float T13 = org.telegram.messenger.g0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), g6Var.getTop() + f14, f10);
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
        g6Var.setPivotX(T14);
        g6Var.setPivotY(T15);
        g6Var.setScaleX(T1);
        g6Var.setScaleY(T1);
        g6Var.setRotation(f16);
        g6Var.setRotationX(35.0f * f15);
        g6Var.setTranslationX((((cos * f21) - (sin * f22)) * T1) + ((T12 - g6Var.getLeft()) - T14));
        g6Var.setTranslationY((((cos * f22) + (sin * f21)) * T1) + ((T13 - g6Var.getTop()) - T15));
        g6Var.setAlpha(this.I > 0.0f ? 1.0f : 0.0f);
        g6Var.setUseGyroscope(this.Q * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f11 * f23);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.I);
        this.s.setAlpha(interpolation2);
        sq0 sq0Var = this.w;
        sq0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f23);
        sq0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f23);
        sq0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        sq0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        m3 m3Var = this.h;
        setContentView(m3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = qs.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        m3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(m3Var, !org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            jk0.d(new d(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.h);
        }
    }
}
