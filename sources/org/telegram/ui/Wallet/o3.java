package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
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
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.eh0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class o3 extends Dialog {
    public static final /* synthetic */ int X = 0;
    public final RectF E;
    public final ui.b F;
    public final dh.c G;
    public Bitmap H;
    public i0.c I;
    public float J;
    public float K;
    public boolean L;
    public final h6.m M;
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
    public final org.telegram.ui.ActionBar.e2 a;
    public final if0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final m3 h;
    public final n3 n;
    public final h6 r;
    public final c8 s;
    public final eh0 w;
    public final TextView x;
    public final Paint y;

    public o3(final org.telegram.ui.ActionBar.e2 e2Var, if0 if0Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(e2Var.getParentActivity(), R.style.TransparentDialog);
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.E = new RectF();
        ui.b bVar = new ui.b();
        this.F = bVar;
        this.I = i0.c.e;
        this.M = new h6.m(29);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.a = e2Var;
        this.b = if0Var;
        final int i7 = 1;
        boolean z10 = user != null && user.id == m10.i(e2Var.getCurrentAccount()).e();
        this.e = z10;
        boolean z11 = (user == null || z10 || !((org.telegram.messenger.h0) np.s1(e2Var.getCurrentAccount()).y7.j0.b).c) ? false : true;
        this.c = z11;
        this.d = (user == null || z10 || z11) ? false : true;
        if0Var.getLocationOnScreen(new int[2]);
        rectF.set(if0Var.w);
        rectF.offset(r12[0], r12[1]);
        org.telegram.messenger.g0.S(getWindow());
        m3 m3Var = new m3(this, getContext());
        this.h = m3Var;
        n3 n3Var = new n3(this, getContext());
        this.n = n3Var;
        n3Var.setAlpha(0.0f);
        m3Var.addView(n3Var, c8.ja.c(-1.0f, -1));
        m3Var.setClipChildren(false);
        m3Var.setClipToPadding(false);
        m3Var.setOnClickListener(new g3(this, r9));
        b3 b3Var = new b3(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(m3Var, b3Var);
        h6 h6Var = new h6(getContext());
        this.r = h6Var;
        h6Var.setDiamondOnCard(true);
        int currentAccount = e2Var.getCurrentAccount();
        String p10 = q10.p(user);
        Locale locale = Locale.ROOT;
        h6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            h6Var.setCardNumber(h6.d(cardVar.address.toUpperCase(locale)));
        }
        h6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = l0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            h6Var.P.c(m10, false, true);
        }
        h6Var.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.k3
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        o3 o3Var = this.b;
                        if (!o3Var.S) {
                            boolean z12 = o3Var.e;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (!z12) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    y5.K0(o3Var.getContext(), e2Var2.getCurrentAccount(), cardVar2.address, false, !o3Var.c ? null : new g(o3Var, e2Var2, cardVar2, 10), e2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                y5.J0(e2Var2.getCurrentAccount(), o3Var.getContext(), e2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        o3 o3Var2 = this.b;
                        if (!o3Var2.S) {
                            boolean z13 = o3Var2.e;
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            if (z13) {
                                o3Var2.V = new l3(0, e2Var3);
                            } else if (o3Var2.d) {
                                o3Var2.V = new l3(1, e2Var3);
                            } else if (o3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    o3Var2.V = new j3(e2Var3, cardVar3, 1);
                                }
                            }
                            o3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        h6Var.setOnClickListener(new bi.o(24));
        h6Var.setAlpha(0.0f);
        m3Var.addView(h6Var, c8.ja.c(-2.0f, -2));
        c8 c8Var = new c8(e2Var, h6Var, null, cardVar);
        this.s = c8Var;
        m3Var.addView(c8Var, c8.ja.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(m3Var);
        cVar.i = m3Var;
        eh0 eh0Var = new eh0(getContext());
        this.w = eh0Var;
        fh.g c10 = cVar.c(eh0Var, new gh.b(org.telegram.ui.ActionBar.j6.d6, e2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        eh0Var.setBackground(c10);
        c8.na.b(eh0Var, 0.02f, 1.2f);
        hi.d dVar = new hi.d(getContext(), e2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = hd.M0(z10 ? 2131743061 : z11 ? 2131743017 : 2131749276, null);
        if (z11) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            eq eqVar = new eq(R.drawable.mini_gram_24, 0);
            eqVar.c(org.telegram.messenger.g0.L(20.0f));
            eqVar.y = -1;
            append.setSpan(eqVar, 0, 1, 33);
            dVar.i(append, false, true);
        } else {
            dVar.i(M0, false, true);
        }
        dVar.setStateListAnimator(null);
        eh0Var.addView(dVar, c8.ja.e(-2, -1, 17));
        eh0Var.setContentDescription(M0);
        eh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.k3
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        o3 o3Var = this.b;
                        if (!o3Var.S) {
                            boolean z12 = o3Var.e;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (!z12) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    y5.K0(o3Var.getContext(), e2Var2.getCurrentAccount(), cardVar2.address, false, !o3Var.c ? null : new g(o3Var, e2Var2, cardVar2, 10), e2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                y5.J0(e2Var2.getCurrentAccount(), o3Var.getContext(), e2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        o3 o3Var2 = this.b;
                        if (!o3Var2.S) {
                            boolean z13 = o3Var2.e;
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            if (z13) {
                                o3Var2.V = new l3(0, e2Var3);
                            } else if (o3Var2.d) {
                                o3Var2.V = new l3(1, e2Var3);
                            } else if (o3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    o3Var2.V = new j3(e2Var3, cardVar3, 1);
                                }
                            }
                            o3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        eh0Var.setAlpha(0.0f);
        eh0Var.setVisibility(c() ? 0 : 8);
        m3Var.addView(eh0Var, c8.ja.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(hd.M0(2131743043, null));
        } else if (user != null) {
            String j3 = q10.j(user, true);
            textView.setText(hi.l3.b(new BigDecimal(l0.p(cardVar.balance, false)).signum() == 0 ? hd.a0(null, null, 2131743045, j3) : hd.a0(null, null, 2131743046, j3, l0.l("Grams", h6.e(cardVar.balance).toString(), 2131749507).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        m3Var.addView(textView, c8.ja.e(-2, -2, 49));
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
        h6 h6Var = this.r;
        h6Var.getClass();
        h6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        ofFloat.setDuration(f10 == 1.0f ? 650L : 380L);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new h3(this, 1));
        this.P.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 6));
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
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        Bitmap bitmap = this.H;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            m3 m3Var = this.h;
            if (m3Var.getWidth() > 0 && m3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) m3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) m3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.41f, q10 ? -1 : -16777216));
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
        float interpolation = er.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = er.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        h6 h6Var = this.r;
        float width = h6Var.getWidth();
        float height = h6Var.getHeight();
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
        float T12 = org.telegram.messenger.g0.T1(centerX, h6Var.getLeft() + f13, f10);
        float T13 = org.telegram.messenger.g0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), h6Var.getTop() + f14, f10);
        float f15 = 1.0f - f10;
        float f16 = (-90.0f) * f15;
        double d2 = f16;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float f17 = centerX - T12;
        float f18 = f11 - T13;
        float f19 = (((sin * f18) + (cos * f17)) / T1) + f13;
        float f20 = (((cos * f18) + ((-sin) * f17)) / T1) + f14;
        float T14 = org.telegram.messenger.g0.T1(f19, f13, interpolation2);
        float T15 = org.telegram.messenger.g0.T1(f20, f14, interpolation2);
        float f21 = T14 - f13;
        float f22 = T15 - f14;
        h6Var.setPivotX(T14);
        h6Var.setPivotY(T15);
        h6Var.setScaleX(T1);
        h6Var.setScaleY(T1);
        h6Var.setRotation(f16);
        h6Var.setRotationX(35.0f * f15);
        h6Var.setTranslationX((((cos * f21) - (sin * f22)) * T1) + ((T12 - h6Var.getLeft()) - T14));
        h6Var.setTranslationY(org.telegram.ui.Cells.y0.f(cos, f22, sin * f21, T1, (T13 - h6Var.getTop()) - T15));
        h6Var.setAlpha(this.J > 0.0f ? 1.0f : 0.0f);
        h6Var.setUseGyroscope(this.R * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f11 * f23);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.J);
        this.s.setAlpha(interpolation2);
        eh0 eh0Var = this.w;
        eh0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f23);
        eh0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f23);
        eh0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        eh0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
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
        attributes.gravity = ns.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        m3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(m3Var, !org.telegram.ui.ActionBar.j6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            ok0.d(new d(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.h);
        }
    }
}
