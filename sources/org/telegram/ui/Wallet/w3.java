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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class w3 extends Dialog {
    public static final /* synthetic */ int X = 0;
    public final RectF E;
    public final ui.b F;
    public final dh.c G;
    public Bitmap H;
    public i0.b I;
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
    public final org.telegram.ui.ActionBar.h2 a;
    public final sf0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final u3 h;
    public final v3 n;
    public final x6 r;
    public final r8 s;
    public final ih0 w;
    public final TextView x;
    public final Paint y;

    public w3(final org.telegram.ui.ActionBar.h2 h2Var, sf0 sf0Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(h2Var.getParentActivity(), R.style.TransparentDialog);
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.E = new RectF();
        ui.b bVar = new ui.b();
        this.F = bVar;
        this.I = i0.b.e;
        this.M = new h6.m(29);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.a = h2Var;
        this.b = sf0Var;
        final int i7 = 1;
        boolean z10 = user != null && user.id == j10.i(h2Var.getCurrentAccount()).e();
        this.e = z10;
        boolean z11 = (user == null || z10 || !((org.telegram.messenger.h0) mp.u1(h2Var.getCurrentAccount()).A7.p0.b).c) ? false : true;
        this.c = z11;
        this.d = (user == null || z10 || z11) ? false : true;
        sf0Var.getLocationOnScreen(new int[2]);
        rectF.set(sf0Var.w);
        rectF.offset(r12[0], r12[1]);
        org.telegram.messenger.g0.S(getWindow());
        u3 u3Var = new u3(this, getContext());
        this.h = u3Var;
        v3 v3Var = new v3(this, getContext());
        this.n = v3Var;
        v3Var.setAlpha(0.0f);
        u3Var.addView(v3Var, c8.ma.c(-1.0f, -1));
        u3Var.setClipChildren(false);
        u3Var.setClipToPadding(false);
        u3Var.setOnClickListener(new o3(this, r9));
        h3 h3Var = new h3(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(u3Var, h3Var);
        x6 x6Var = new x6(getContext());
        this.r = x6Var;
        x6Var.setDiamondOnCard(true);
        int currentAccount = h2Var.getCurrentAccount();
        String q10 = o10.q(user);
        Locale locale = Locale.ROOT;
        x6Var.setCardHolder(q10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            x6Var.setCardNumber(x6.d(cardVar.address.toUpperCase(locale)));
        }
        x6Var.j(currentAccount, cardVar.balance);
        CharSequence r10 = u0.D(currentAccount).r(cardVar.balance, false);
        if (!TextUtils.isEmpty(r10)) {
            x6Var.P.c(r10, false, true);
        }
        x6Var.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.s3
            public final /* synthetic */ w3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        w3 w3Var = this.b;
                        if (!w3Var.S) {
                            boolean z12 = w3Var.e;
                            org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                            if (!z12) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    n6.O0(w3Var.getContext(), h2Var2.getCurrentAccount(), cardVar2.address, false, !w3Var.c ? null : new p(w3Var, h2Var2, cardVar2, 10), h2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                n6.N0(h2Var2.getCurrentAccount(), w3Var.getContext(), h2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        w3 w3Var2 = this.b;
                        if (!w3Var2.S) {
                            boolean z13 = w3Var2.e;
                            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var;
                            if (z13) {
                                w3Var2.V = new t3(0, h2Var3);
                            } else if (w3Var2.d) {
                                w3Var2.V = new t3(1, h2Var3);
                            } else if (w3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    w3Var2.V = new r3(h2Var3, cardVar3, 1);
                                }
                            }
                            w3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        x6Var.setOnClickListener(new bi.o(26));
        x6Var.setAlpha(0.0f);
        u3Var.addView(x6Var, c8.ma.c(-2.0f, -2));
        r8 r8Var = new r8(h2Var, x6Var, null, cardVar);
        this.s = r8Var;
        u3Var.addView(r8Var, c8.ma.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(u3Var);
        cVar.i = u3Var;
        ih0 ih0Var = new ih0(getContext());
        this.w = ih0Var;
        fh.g c10 = cVar.c(ih0Var, new gh.b(org.telegram.ui.ActionBar.n6.d6, h2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        ih0Var.setBackground(c10);
        c8.ra.b(ih0Var, 0.02f, 1.2f);
        hi.d dVar = new hi.d(getContext(), h2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = gd.M0(z10 ? 2131742803 : z11 ? 2131742759 : 2131749084, null);
        if (z11) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            lq lqVar = new lq(R.drawable.mini_gram_24, 0);
            lqVar.c(org.telegram.messenger.g0.L(20.0f));
            lqVar.y = -1;
            append.setSpan(lqVar, 0, 1, 33);
            dVar.i(append, false, true);
        } else {
            dVar.i(M0, false, true);
        }
        dVar.setStateListAnimator(null);
        ih0Var.addView(dVar, c8.ma.e(-2, -1, 17));
        ih0Var.setContentDescription(M0);
        ih0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.s3
            public final /* synthetic */ w3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        w3 w3Var = this.b;
                        if (!w3Var.S) {
                            boolean z12 = w3Var.e;
                            org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                            if (!z12) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    n6.O0(w3Var.getContext(), h2Var2.getCurrentAccount(), cardVar2.address, false, !w3Var.c ? null : new p(w3Var, h2Var2, cardVar2, 10), h2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                n6.N0(h2Var2.getCurrentAccount(), w3Var.getContext(), h2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        w3 w3Var2 = this.b;
                        if (!w3Var2.S) {
                            boolean z13 = w3Var2.e;
                            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var;
                            if (z13) {
                                w3Var2.V = new t3(0, h2Var3);
                            } else if (w3Var2.d) {
                                w3Var2.V = new t3(1, h2Var3);
                            } else if (w3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    w3Var2.V = new r3(h2Var3, cardVar3, 1);
                                }
                            }
                            w3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        ih0Var.setAlpha(0.0f);
        ih0Var.setVisibility(c() ? 0 : 8);
        u3Var.addView(ih0Var, c8.ma.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(gd.M0(2131742785, null));
        } else if (user != null) {
            String k10 = o10.k(user, true);
            textView.setText(hi.m3.b(new BigDecimal(u0.u(cardVar.balance, false)).signum() == 0 ? gd.a0(null, null, 2131742787, k10) : gd.a0(null, null, 2131742788, k10, u0.q("Grams", x6.e(cardVar.balance).toString(), 2131749315).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        u3Var.addView(textView, c8.ma.e(-2, -2, 49));
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
        x6 x6Var = this.r;
        x6Var.getClass();
        x6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        ofFloat.setDuration(f10 == 1.0f ? 650L : 380L);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new p3(this, 1));
        this.P.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
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
        org.telegram.messenger.g0.g3(runnable);
    }

    public final boolean c() {
        return this.c || this.d || this.e;
    }

    public final void d() {
        boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
        Bitmap bitmap = this.H;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            u3 u3Var = this.h;
            if (u3Var.getWidth() > 0 && u3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) u3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) u3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.41f, q10 ? -1 : -16777216));
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
        float interpolation = lr.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = lr.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        x6 x6Var = this.r;
        float width = x6Var.getWidth();
        float height = x6Var.getHeight();
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
        float T12 = org.telegram.messenger.g0.T1(centerX, x6Var.getLeft() + f13, f10);
        float T13 = org.telegram.messenger.g0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), x6Var.getTop() + f14, f10);
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
        x6Var.setPivotX(T14);
        x6Var.setPivotY(T15);
        x6Var.setScaleX(T1);
        x6Var.setScaleY(T1);
        x6Var.setRotation(f16);
        x6Var.setRotationX(35.0f * f15);
        x6Var.setTranslationX((((cos * f21) - (sin * f22)) * T1) + ((T12 - x6Var.getLeft()) - T14));
        x6Var.setTranslationY(org.telegram.ui.Cells.c0.g(cos, f22, sin * f21, T1, (T13 - x6Var.getTop()) - T15));
        x6Var.setAlpha(this.J > 0.0f ? 1.0f : 0.0f);
        x6Var.setUseGyroscope(this.R * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f11 * f23);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.J);
        this.s.setAlpha(interpolation2);
        ih0 ih0Var = this.w;
        ih0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f23);
        ih0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f23);
        ih0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        ih0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        u3 u3Var = this.h;
        setContentView(u3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = ks.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        u3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.n3(u3Var, !org.telegram.ui.ActionBar.n6.I.q());
        org.telegram.messenger.g0.r3(window, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            wk0.d(new e(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.h);
        }
    }
}
