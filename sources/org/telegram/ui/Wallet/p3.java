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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.dg0;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 extends Dialog {
    public static final /* synthetic */ int W = 0;
    public final RectF D;
    public final hi.b E;
    public final tg.b F;
    public Bitmap G;
    public i0.c H;
    public float I;
    public float J;
    public boolean K;
    public final li.k L;
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
    public final org.telegram.ui.ActionBar.k2 a;
    public final ig0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final n3 h;
    public final o3 n;
    public final l6 r;
    public final h8 s;
    public final dg0 w;
    public final TextView x;
    public final Paint y;

    public p3(org.telegram.ui.ActionBar.k2 k2Var, ig0 ig0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(k2Var.getParentActivity(), R.style.TransparentDialog);
        int i10;
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.D = new RectF();
        hi.b bVar = new hi.b();
        this.E = bVar;
        this.H = i0.c.e;
        this.L = new li.k(23);
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.a = k2Var;
        this.b = ig0Var;
        int i11 = 1;
        boolean z10 = user != null && user.id == d20.i(k2Var.getCurrentAccount()).e();
        this.e = z10;
        boolean z11 = (user == null || z10 || !((org.telegram.messenger.j0) vp.r1(k2Var.getCurrentAccount()).y7.j0.b).c) ? false : true;
        this.c = z11;
        this.d = (user == null || z10 || z11) ? false : true;
        ig0Var.getLocationOnScreen(new int[2]);
        rectF.set(ig0Var.w);
        rectF.offset(r12[0], r12[1]);
        org.telegram.messenger.i0.S(getWindow());
        n3 n3Var = new n3(this, getContext());
        this.h = n3Var;
        o3 o3Var = new o3(this, getContext());
        this.n = o3Var;
        o3Var.setAlpha(0.0f);
        n3Var.addView(o3Var, w7.b6.c(-1.0f, -1));
        n3Var.setClipChildren(false);
        n3Var.setClipToPadding(false);
        n3Var.setOnClickListener(new i3(this, r9));
        d3 d3Var = new d3(this, 1);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(n3Var, d3Var);
        l6 l6Var = new l6(getContext());
        this.r = l6Var;
        l6Var.setDiamondOnCard(true);
        int currentAccount = k2Var.getCurrentAccount();
        String p5 = h20.p(user);
        Locale locale = Locale.ROOT;
        l6Var.setCardHolder(p5.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            l6Var.setCardNumber(l6.d(cardVar.address.toUpperCase(locale)));
        }
        l6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = k0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            l6Var.O.c(m10, false, true);
        }
        l6Var.setCardOnClickListener(new rv0(12, this, k2Var));
        l6Var.setOnClickListener(new bh.c(19));
        l6Var.setAlpha(0.0f);
        n3Var.addView(l6Var, w7.b6.c(-2.0f, -2));
        h8 h8Var = new h8(k2Var, l6Var, null, cardVar);
        this.s = h8Var;
        n3Var.addView(h8Var, w7.b6.c(-1.0f, -1));
        tg.b bVar2 = new tg.b(bVar);
        this.F = bVar2;
        bVar2.f = new zg.h(n3Var);
        bVar2.g = n3Var;
        dg0 dg0Var = new dg0(getContext());
        this.w = dg0Var;
        vg.f c10 = bVar2.c(dg0Var, new wg.b(org.telegram.ui.ActionBar.t6.d6, k2Var.getResourceProvider()), false);
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(22.0f));
        dg0Var.setBackground(c10);
        w7.e6.b(dg0Var, 0.02f, 1.2f);
        vh.d dVar = new vh.d(getContext(), k2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence L0 = cd.L0(z10 ? 2131743087 : z11 ? 2131743043 : 2131749285, null);
        if (z11) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(L0);
            dq dqVar = new dq(R.drawable.mini_gram_24, 0);
            dqVar.c(org.telegram.messenger.i0.L(20.0f));
            i10 = -1;
            dqVar.y = -1;
            append.setSpan(dqVar, 0, 1, 33);
            dVar.i(append, false, true);
        } else {
            dVar.i(L0, false, true);
            i10 = -1;
        }
        dVar.setStateListAnimator(null);
        dg0Var.addView(dVar, w7.b6.e(-2, i10, 17));
        dg0Var.setContentDescription(L0);
        dg0Var.setOnClickListener(new j1(this, k2Var, cardVar, i11));
        dg0Var.setAlpha(0.0f);
        dg0Var.setVisibility(c() ? 0 : 8);
        n3Var.addView(dg0Var, w7.b6.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.i0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(cd.L0(2131743069, null));
        } else if (user != null) {
            String j10 = h20.j(user, true);
            textView.setText(vh.p2.b(new BigDecimal(k0.p(cardVar.balance, false)).signum() == 0 ? cd.a0(null, null, 2131743071, j10) : cd.a0(null, null, 2131743072, j10, k0.l("Grams", l6.e(cardVar.balance).toString(), 2131749516).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        n3Var.addView(textView, w7.b6.e(-2, -2, 49));
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
        l6 l6Var = this.r;
        l6Var.getClass();
        l6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.O = ofFloat;
        ofFloat.setDuration(f7 == 1.0f ? 650L : 380L);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new m3(this, 0));
        this.O.addListener(new org.telegram.ui.ActionBar.v0(this, f7, 6));
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
        org.telegram.messenger.i0.g3(runnable);
    }

    public final boolean c() {
        return this.c || this.d || this.e;
    }

    public final void d() {
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            n3 n3Var = this.h;
            if (n3Var.getWidth() > 0 && n3Var.getHeight() > 0) {
                q6 = org.telegram.messenger.i0.B(this.G.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) n3Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) n3Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.41f, q6 ? -1 : -16777216));
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
        float f7;
        float interpolation = gr.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = gr.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f7 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f7 = interpolation2;
        }
        l6 l6Var = this.r;
        float width = l6Var.getWidth();
        float height = l6Var.getHeight();
        RectF rectF = this.f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.i0.T1(max2, 1.0f, f7);
        float centerY = rectF.centerY();
        int[] iArr = this.V;
        float f10 = centerY - iArr[1];
        float f11 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f12 = width / 2.0f;
        float f13 = height / 2.0f;
        float T12 = org.telegram.messenger.i0.T1(centerX, l6Var.getLeft() + f12, f7);
        float T13 = org.telegram.messenger.i0.T1((f11 * interpolation) + (f10 - (f11 / 2.0f)), l6Var.getTop() + f13, f7);
        float f14 = 1.0f - f7;
        float f15 = (-90.0f) * f14;
        double d10 = f15;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f16 = centerX - T12;
        float f17 = f10 - T13;
        float f18 = (((sin * f17) + (cos * f16)) / T1) + f12;
        float f19 = (((f17 * cos) + ((-sin) * f16)) / T1) + f13;
        float T14 = org.telegram.messenger.i0.T1(f18, f12, interpolation2);
        float T15 = org.telegram.messenger.i0.T1(f19, f13, interpolation2);
        float f20 = T14 - f12;
        float f21 = T15 - f13;
        l6Var.setPivotX(T14);
        l6Var.setPivotY(T15);
        l6Var.setScaleX(T1);
        l6Var.setScaleY(T1);
        l6Var.setRotation(f15);
        l6Var.setRotationX(35.0f * f14);
        l6Var.setTranslationX((((cos * f20) - (sin * f21)) * T1) + ((T12 - l6Var.getLeft()) - T14));
        l6Var.setTranslationY((((cos * f21) + (sin * f20)) * T1) + ((T13 - l6Var.getTop()) - T15));
        l6Var.setAlpha(this.I > 0.0f ? 1.0f : 0.0f);
        l6Var.setUseGyroscope(this.Q * interpolation2);
        float f22 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f10 * f22);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.I);
        this.s.setAlpha(interpolation2);
        dg0 dg0Var = this.w;
        dg0Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * f22);
        dg0Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f22);
        dg0Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, interpolation2));
        dg0Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, interpolation2));
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
        attributes.gravity = zs.E1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        n3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.i0.n3(n3Var, !org.telegram.ui.ActionBar.t6.I.q());
        org.telegram.messenger.i0.r3(window, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.i0.M1(getContext())) {
            nl0.d(new d(this, 6));
            super.show();
            WeakHashMap weakHashMap = r0.h0.a;
            r0.x.c(this.h);
        }
    }
}
