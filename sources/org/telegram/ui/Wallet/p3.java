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
import org.telegram.ui.Components.wq;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class p3 extends Dialog {
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
    public final n3 h;
    public final o3 n;
    public final i6 r;
    public final d8 s;
    public final vq0 w;
    public final TextView x;
    public final Paint y;

    public p3(final org.telegram.ui.ActionBar.f2 f2Var, ff0 ff0Var, TLRPC.User user, final TL_wallet.card cardVar) {
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
        final int i7 = 1;
        boolean z9 = user != null && user.id == p10.i(f2Var.getCurrentAccount()).e();
        this.e = z9;
        boolean z10 = (user == null || z9 || !((org.telegram.messenger.h0) qp.s1(f2Var.getCurrentAccount()).x7.j0.b).c) ? false : true;
        this.c = z10;
        this.d = (user == null || z9 || z10) ? false : true;
        ff0Var.getLocationOnScreen(new int[2]);
        rectF.set(ff0Var.w);
        rectF.offset(r12[0], r12[1]);
        org.telegram.messenger.g0.S(getWindow());
        n3 n3Var = new n3(this, getContext());
        this.h = n3Var;
        o3 o3Var = new o3(this, getContext());
        this.n = o3Var;
        o3Var.setAlpha(0.0f);
        n3Var.addView(o3Var, c8.ha.c(-1.0f, -1));
        n3Var.setClipChildren(false);
        n3Var.setClipToPadding(false);
        n3Var.setOnClickListener(new h3(this, r9));
        c3 c3Var = new c3(this, 1);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(n3Var, c3Var);
        i6 i6Var = new i6(getContext());
        this.r = i6Var;
        i6Var.setDiamondOnCard(true);
        int currentAccount = f2Var.getCurrentAccount();
        String p10 = t10.p(user);
        Locale locale = Locale.ROOT;
        i6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            i6Var.setCardNumber(i6.d(cardVar.address.toUpperCase(locale)));
        }
        i6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = l0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            i6Var.O.c(m10, false, true);
        }
        i6Var.setCardOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.l3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        p3 p3Var = this.b;
                        if (!p3Var.R) {
                            boolean z11 = p3Var.e;
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            if (!z11) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    z5.K0(p3Var.getContext(), f2Var2.getCurrentAccount(), cardVar2.address, false, !p3Var.c ? null : new g(p3Var, f2Var2, cardVar2, 10), f2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                z5.J0(f2Var2.getCurrentAccount(), p3Var.getContext(), f2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        p3 p3Var2 = this.b;
                        if (!p3Var2.R) {
                            boolean z12 = p3Var2.e;
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            if (z12) {
                                p3Var2.U = new m3(0, f2Var3);
                            } else if (p3Var2.d) {
                                p3Var2.U = new m3(1, f2Var3);
                            } else if (p3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    p3Var2.U = new k3(f2Var3, cardVar3, 1);
                                }
                            }
                            p3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        i6Var.setOnClickListener(new bi.l1(21));
        i6Var.setAlpha(0.0f);
        n3Var.addView(i6Var, c8.ha.c(-2.0f, -2));
        d8 d8Var = new d8(f2Var, i6Var, null, cardVar);
        this.s = d8Var;
        n3Var.addView(d8Var, c8.ha.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.F = cVar;
        cVar.h = new jh.k(n3Var);
        cVar.i = n3Var;
        vq0 vq0Var = new vq0(getContext());
        this.w = vq0Var;
        fh.g c10 = cVar.c(vq0Var, new gh.b(org.telegram.ui.ActionBar.m6.d6, f2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        vq0Var.setBackground(c10);
        c8.ka.b(vq0Var, 0.02f, 1.2f);
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
        vq0Var.addView(dVar, c8.ha.e(-2, -1, 17));
        vq0Var.setContentDescription(M0);
        vq0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.l3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        p3 p3Var = this.b;
                        if (!p3Var.R) {
                            boolean z11 = p3Var.e;
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            if (!z11) {
                                TL_wallet.card cardVar2 = cardVar;
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    z5.K0(p3Var.getContext(), f2Var2.getCurrentAccount(), cardVar2.address, false, !p3Var.c ? null : new g(p3Var, f2Var2, cardVar2, 10), f2Var2.getResourceProvider());
                                    break;
                                }
                            } else {
                                z5.J0(f2Var2.getCurrentAccount(), p3Var.getContext(), f2Var2.getResourceProvider());
                                break;
                            }
                        }
                        break;
                    default:
                        p3 p3Var2 = this.b;
                        if (!p3Var2.R) {
                            boolean z12 = p3Var2.e;
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            if (z12) {
                                p3Var2.U = new m3(0, f2Var3);
                            } else if (p3Var2.d) {
                                p3Var2.U = new m3(1, f2Var3);
                            } else if (p3Var2.c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    p3Var2.U = new k3(f2Var3, cardVar3, 1);
                                }
                            }
                            p3Var2.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        vq0Var.setAlpha(0.0f);
        vq0Var.setVisibility(c() ? 0 : 8);
        n3Var.addView(vq0Var, c8.ha.e(-2, 60, 81));
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
            textView.setText(fi.m3.b(new BigDecimal(l0.p(cardVar.balance, false)).signum() == 0 ? id.a0(null, null, 2131743045, j3) : id.a0(null, null, 2131743046, j3, l0.l("Grams", i6.e(cardVar.balance).toString(), 2131749507).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        n3Var.addView(textView, c8.ha.e(-2, -2, 49));
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
        i6 i6Var = this.r;
        i6Var.getClass();
        i6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.O = ofFloat;
        ofFloat.setDuration(f10 == 1.0f ? 650L : 380L);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new i3(this, 1));
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
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            n3 n3Var = this.h;
            if (n3Var.getWidth() > 0 && n3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.G.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) n3Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) n3Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.41f, q10 ? -1 : -16777216));
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
        float interpolation = wq.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = wq.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        i6 i6Var = this.r;
        float width = i6Var.getWidth();
        float height = i6Var.getHeight();
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
        float T12 = org.telegram.messenger.g0.T1(centerX, i6Var.getLeft() + f13, f10);
        float T13 = org.telegram.messenger.g0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), i6Var.getTop() + f14, f10);
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
        i6Var.setPivotX(T14);
        i6Var.setPivotY(T15);
        i6Var.setScaleX(T1);
        i6Var.setScaleY(T1);
        i6Var.setRotation(f16);
        i6Var.setRotationX(35.0f * f15);
        i6Var.setTranslationX((((cos * f21) - (sin * f22)) * T1) + ((T12 - i6Var.getLeft()) - T14));
        i6Var.setTranslationY((((cos * f22) + (sin * f21)) * T1) + ((T13 - i6Var.getTop()) - T15));
        i6Var.setAlpha(this.I > 0.0f ? 1.0f : 0.0f);
        i6Var.setUseGyroscope(this.Q * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f11 * f23);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.I);
        this.s.setAlpha(interpolation2);
        vq0 vq0Var = this.w;
        vq0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f23);
        vq0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f23);
        vq0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        vq0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        n3 n3Var = this.h;
        setContentView(n3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = qs.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        n3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(n3Var, !org.telegram.ui.ActionBar.m6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.m6.I.q());
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
