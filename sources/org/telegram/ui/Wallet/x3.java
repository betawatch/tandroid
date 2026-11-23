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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.gh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class x3 extends Dialog {
    public static final /* synthetic */ int X = 0;
    public final RectF E;
    public final ui.b F;
    public final dh.c G;
    public Bitmap H;
    public i0.b I;
    public float J;
    public float K;
    public boolean L;
    public final i61 M;
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
    public final org.telegram.ui.ActionBar.g2 a;
    public final tf0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final v3 h;
    public final w3 n;
    public final y6 r;
    public final s8 s;
    public final gh0 w;
    public final TextView x;
    public final Paint y;

    public x3(final org.telegram.ui.ActionBar.g2 g2Var, tf0 tf0Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(g2Var.getParentActivity(), R.style.TransparentDialog);
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.E = new RectF();
        ui.b bVar = new ui.b();
        this.F = bVar;
        this.I = i0.b.e;
        final int i7 = 1;
        this.M = new i61(1);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.a = g2Var;
        this.b = tf0Var;
        boolean z10 = user != null && user.id == i10.i(g2Var.getCurrentAccount()).e();
        this.e = z10;
        boolean z11 = (user == null || z10 || !((org.telegram.messenger.h0) mp.u1(g2Var.getCurrentAccount()).A7.p0.b).c) ? false : true;
        this.c = z11;
        this.d = (user == null || z10 || z11) ? false : true;
        tf0Var.getLocationOnScreen(new int[2]);
        rectF.set(tf0Var.w);
        rectF.offset(r12[0], r12[1]);
        org.telegram.messenger.g0.S(getWindow());
        v3 v3Var = new v3(this, getContext());
        this.h = v3Var;
        w3 w3Var = new w3(this, getContext());
        this.n = w3Var;
        w3Var.setAlpha(0.0f);
        v3Var.addView(w3Var, c8.na.c(-1.0f, -1));
        v3Var.setClipChildren(false);
        v3Var.setClipToPadding(false);
        v3Var.setOnClickListener(new p3(this, r9));
        i3 i3Var = new i3(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(v3Var, i3Var);
        y6 y6Var = new y6(getContext());
        this.r = y6Var;
        y6Var.setDiamondOnCard(true);
        int currentAccount = g2Var.getCurrentAccount();
        String q10 = n10.q(user);
        Locale locale = Locale.ROOT;
        y6Var.setCardHolder(q10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            y6Var.setCardNumber(y6.d(cardVar.address.toUpperCase(locale)));
        }
        y6Var.j(currentAccount, cardVar.balance);
        CharSequence r10 = v0.D(currentAccount).r(cardVar.balance, false);
        if (!TextUtils.isEmpty(r10)) {
            y6Var.P.c(r10, false, true);
        }
        y6Var.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t3
            public final /* synthetic */ x3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        x3 x3Var = this.b;
                        if (!x3Var.S) {
                            boolean z12 = x3Var.e;
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            if (!z12) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    o6.O0(x3Var.getContext(), g2Var2.getCurrentAccount(), cardVar2.address, false, !x3Var.c ? null : new p(x3Var, g2Var2, cardVar2, 10), g2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                o6.N0(g2Var2.getCurrentAccount(), x3Var.getContext(), g2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        x3 x3Var2 = this.b;
                        if (!x3Var2.S) {
                            boolean z13 = x3Var2.e;
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            if (z13) {
                                x3Var2.V = new u3(0, g2Var3);
                            } else if (x3Var2.d) {
                                x3Var2.V = new u3(1, g2Var3);
                            } else if (x3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    x3Var2.V = new s3(g2Var3, cardVar3, 1);
                                }
                            }
                            x3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        y6Var.setOnClickListener(new bi.o(26));
        y6Var.setAlpha(0.0f);
        v3Var.addView(y6Var, c8.na.c(-2.0f, -2));
        s8 s8Var = new s8(g2Var, y6Var, null, cardVar);
        this.s = s8Var;
        v3Var.addView(s8Var, c8.na.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(v3Var);
        cVar.i = v3Var;
        gh0 gh0Var = new gh0(getContext());
        this.w = gh0Var;
        fh.g c10 = cVar.c(gh0Var, new gh.b(org.telegram.ui.ActionBar.n6.d6, g2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        gh0Var.setBackground(c10);
        c8.sa.b(gh0Var, 0.02f, 1.2f);
        hi.e eVar = new hi.e(getContext(), g2Var.getResourceProvider(), true);
        eVar.setUseWrapContent(true);
        eVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        eVar.setRoundRadius(19);
        CharSequence N0 = gd.N0(z10 ? 2131742790 : z11 ? 2131742746 : 2131749083, null);
        if (z11) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(N0);
            kq kqVar = new kq(R.drawable.mini_gram_24, 0);
            kqVar.c(org.telegram.messenger.g0.L(20.0f));
            kqVar.y = -1;
            append.setSpan(kqVar, 0, 1, 33);
            eVar.i(append, false, true);
        } else {
            eVar.i(N0, false, true);
        }
        eVar.setStateListAnimator(null);
        gh0Var.addView(eVar, c8.na.e(-2, -1, 17));
        gh0Var.setContentDescription(N0);
        gh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.t3
            public final /* synthetic */ x3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        x3 x3Var = this.b;
                        if (!x3Var.S) {
                            boolean z12 = x3Var.e;
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            if (!z12) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    o6.O0(x3Var.getContext(), g2Var2.getCurrentAccount(), cardVar2.address, false, !x3Var.c ? null : new p(x3Var, g2Var2, cardVar2, 10), g2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                o6.N0(g2Var2.getCurrentAccount(), x3Var.getContext(), g2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        x3 x3Var2 = this.b;
                        if (!x3Var2.S) {
                            boolean z13 = x3Var2.e;
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            if (z13) {
                                x3Var2.V = new u3(0, g2Var3);
                            } else if (x3Var2.d) {
                                x3Var2.V = new u3(1, g2Var3);
                            } else if (x3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    x3Var2.V = new s3(g2Var3, cardVar3, 1);
                                }
                            }
                            x3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        gh0Var.setAlpha(0.0f);
        gh0Var.setVisibility(c() ? 0 : 8);
        v3Var.addView(gh0Var, c8.na.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(gd.N0(2131742772, null));
        } else if (user != null) {
            String k10 = n10.k(user, true);
            textView.setText(hi.u3.b(new BigDecimal(v0.u(cardVar.balance, false)).signum() == 0 ? gd.a0(null, null, 2131742774, k10) : gd.a0(null, null, 2131742775, k10, v0.q("Grams", y6.e(cardVar.balance).toString(), 2131749314).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        v3Var.addView(textView, c8.na.e(-2, -2, 49));
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
        y6 y6Var = this.r;
        y6Var.getClass();
        y6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        ofFloat.setDuration(f10 == 1.0f ? 650L : 380L);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new q3(this, 1));
        this.P.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 7));
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
            v3 v3Var = this.h;
            if (v3Var.getWidth() > 0 && v3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) v3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) v3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
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
        float interpolation = kr.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = kr.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        y6 y6Var = this.r;
        float width = y6Var.getWidth();
        float height = y6Var.getHeight();
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
        float T12 = org.telegram.messenger.g0.T1(centerX, y6Var.getLeft() + f13, f10);
        float T13 = org.telegram.messenger.g0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), y6Var.getTop() + f14, f10);
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
        y6Var.setPivotX(T14);
        y6Var.setPivotY(T15);
        y6Var.setScaleX(T1);
        y6Var.setScaleY(T1);
        y6Var.setRotation(f16);
        y6Var.setRotationX(35.0f * f15);
        y6Var.setTranslationX((((cos * f21) - (sin * f22)) * T1) + ((T12 - y6Var.getLeft()) - T14));
        y6Var.setTranslationY(org.telegram.ui.Cells.c0.g(cos, f22, sin * f21, T1, (T13 - y6Var.getTop()) - T15));
        y6Var.setAlpha(this.J > 0.0f ? 1.0f : 0.0f);
        y6Var.setUseGyroscope(this.R * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f11 * f23);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.J);
        this.s.setAlpha(interpolation2);
        gh0 gh0Var = this.w;
        gh0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f23);
        gh0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f23);
        gh0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        gh0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        v3 v3Var = this.h;
        setContentView(v3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = ks.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        v3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.n3(v3Var, !org.telegram.ui.ActionBar.n6.I.q());
        org.telegram.messenger.g0.r3(window, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            yk0.d(new e(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this.h);
        }
    }
}
