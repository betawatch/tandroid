// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class js8 extends Dialog {
    public final RectF E;
    public final hx4 F;
    public final kl0 G;
    public Bitmap H;
    public io5 I;
    public float J;
    public float K;
    public boolean L;
    public final xl3 M;
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
    public final d a;
    public final xo8 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final hs8 h;
    public final is8 n;
    public final smc r;
    public final koc s;
    public final a6 w;
    public final TextView x;
    public final Paint y;

    public js8(final d dVar, xo8 xo8Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(dVar.getParentActivity(), R.style.TransparentDialog);
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.E = new RectF();
        hx4 hx4Var = new hx4();
        this.F = hx4Var;
        this.I = io5.e;
        this.M = new xl3((byte) 7);
        this.N = new RectF();
        this.O = new RectF();
        byte b = 2;
        this.W = new int[2];
        this.a = dVar;
        this.b = xo8Var;
        final byte b2 = 1;
        boolean z = user != null && user.id == y6c.h(dVar.getCurrentAccount()).e();
        this.e = z;
        boolean z2 = (user == null || z || !na7.q1(dVar.getCurrentAccount()).k4.n0.f) ? false : true;
        this.c = z2;
        this.d = (user == null || z || z2) ? false : true;
        xo8Var.getLocationOnScreen(new int[2]);
        rectF.set(xo8Var.w);
        rectF.offset(r12[0], r12[1]);
        gl.S(getWindow());
        hs8 hs8Var = new hs8(this, getContext());
        this.h = hs8Var;
        is8 is8Var = new is8(this, getContext());
        this.n = is8Var;
        is8Var.setAlpha(0.0f);
        hs8Var.addView(is8Var, nme.c(-1.0f, -1));
        hs8Var.setClipChildren(false);
        hs8Var.setClipToPadding(false);
        hs8Var.setOnClickListener(new ik8(this, b));
        k88 k88Var = new k88((Object) this, (byte) 13);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(hs8Var, k88Var);
        smc smcVar = new smc(getContext());
        this.r = smcVar;
        smcVar.setDiamondOnCard(true);
        int currentAccount = dVar.getCurrentAccount();
        String r = l7c.r(user);
        Locale locale = Locale.ROOT;
        smcVar.setCardHolder(r.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            smcVar.setCardNumber(smc.d(cardVar.address.toUpperCase(locale)));
        }
        smcVar.j(currentAccount, cardVar.balance);
        CharSequence q = c.C(currentAccount).q(cardVar.balance, false);
        if (!TextUtils.isEmpty(q)) {
            smcVar.P.c(q, false, true);
        }
        smcVar.setCardOnClickListener(new View.OnClickListener(this) { // from class: fs8
            public final /* synthetic */ js8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = r4;
                TL_wallet.card cardVar2 = cardVar;
                d dVar2 = dVar;
                js8 js8Var = this.b;
                switch (b3) {
                    case 0:
                        if (!js8Var.S) {
                            if (!js8Var.e) {
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    hmc.M0(js8Var.getContext(), dVar2.getCurrentAccount(), cardVar2.address, false, !js8Var.c ? null : new gm8(js8Var, dVar2, cardVar2, (byte) 5), dVar2.getResourceProvider());
                                    break;
                                }
                            } else {
                                hmc.L0(dVar2.getCurrentAccount(), dVar2.getResourceProvider(), js8Var.getContext());
                                break;
                            }
                        }
                        break;
                    default:
                        if (!js8Var.S) {
                            if (js8Var.e) {
                                js8Var.V = new ro8(dVar2, (byte) 22);
                            } else if (js8Var.d) {
                                js8Var.V = new ro8(dVar2, (byte) 23);
                            } else if (js8Var.c && !TextUtils.isEmpty(cardVar2.address)) {
                                js8Var.V = new es8(dVar2, cardVar2, (byte) 1);
                            }
                            js8Var.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        smcVar.setOnClickListener(new x00(b2));
        smcVar.setAlpha(0.0f);
        hs8Var.addView(smcVar, nme.c(-2.0f, -2));
        koc kocVar = new koc(dVar, smcVar, null, cardVar);
        this.s = kocVar;
        hs8Var.addView(kocVar, nme.c(-1.0f, -1));
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.G = kl0Var;
        kl0Var.h = new zec(hs8Var);
        kl0Var.i = hs8Var;
        a6 a6Var = new a6(getContext());
        this.w = a6Var;
        il0 c = kl0Var.c(a6Var, new bl0(bkb.c6, dVar.getResourceProvider()), false);
        c.q(gl.L(8.0f));
        c.r(gl.L(22.0f));
        a6Var.setBackground(c);
        ote.b(a6Var, 0.02f, 1.2f);
        u41 u41Var = new u41(dVar.getResourceProvider(), getContext(), true);
        u41Var.setUseWrapContent(true);
        u41Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        u41Var.setRoundRadius(19);
        CharSequence M0 = k96.M0(z ? 2131742798 : z2 ? 2131742754 : 2131749084, null);
        if (z2) {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            cm2 cm2Var = new cm2(R.drawable.mini_gram_24, 0);
            cm2Var.c(gl.L(20.0f));
            cm2Var.y = -1;
            append.setSpan(cm2Var, 0, 1, 33);
            u41Var.i(append, false, true);
        } else {
            u41Var.i(M0, false, true);
        }
        u41Var.setStateListAnimator(null);
        a6Var.addView(u41Var, nme.e(-2, -1, 17));
        a6Var.setContentDescription(M0);
        a6Var.setOnClickListener(new View.OnClickListener(this) { // from class: fs8
            public final /* synthetic */ js8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                TL_wallet.card cardVar2 = cardVar;
                d dVar2 = dVar;
                js8 js8Var = this.b;
                switch (b3) {
                    case 0:
                        if (!js8Var.S) {
                            if (!js8Var.e) {
                                if (!TextUtils.isEmpty(cardVar2.address)) {
                                    hmc.M0(js8Var.getContext(), dVar2.getCurrentAccount(), cardVar2.address, false, !js8Var.c ? null : new gm8(js8Var, dVar2, cardVar2, (byte) 5), dVar2.getResourceProvider());
                                    break;
                                }
                            } else {
                                hmc.L0(dVar2.getCurrentAccount(), dVar2.getResourceProvider(), js8Var.getContext());
                                break;
                            }
                        }
                        break;
                    default:
                        if (!js8Var.S) {
                            if (js8Var.e) {
                                js8Var.V = new ro8(dVar2, (byte) 22);
                            } else if (js8Var.d) {
                                js8Var.V = new ro8(dVar2, (byte) 23);
                            } else if (js8Var.c && !TextUtils.isEmpty(cardVar2.address)) {
                                js8Var.V = new es8(dVar2, cardVar2, (byte) 1);
                            }
                            js8Var.dismiss();
                            break;
                        }
                        break;
                }
            }
        });
        a6Var.setAlpha(0.0f);
        a6Var.setVisibility(c() ? 0 : 8);
        hs8Var.addView(a6Var, nme.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setLineSpacing(gl.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z) {
            textView.setText(k96.M0(2131742780, null));
        } else if (user != null) {
            String k = l7c.k(user, true);
            textView.setText(je5.b(new BigDecimal(c.t(cardVar.balance, false)).signum() == 0 ? k96.a0(null, null, 2131742782, k) : k96.a0(null, null, 2131742783, k, c.p("Grams", smc.e(cardVar.balance).toString(), 2131749315).toString().replace(' ', (char) 160)), textView.getPaint()));
        }
        textView.setVisibility(user == null ? (byte) 8 : (byte) 0);
        hs8Var.addView(textView, nme.e(-2, -2, 49));
    }

    public final void a(float f) {
        boolean z;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (f != 1.0f) {
            z = false;
        } else {
            if (this.U) {
                return;
            }
            this.U = true;
            z = true;
        }
        this.L = z;
        smc smcVar = this.r;
        smcVar.getClass();
        smcVar.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        this.P = ofFloat;
        ofFloat.setDuration(f == 1.0f ? 650L : 380L);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new gs8(this, (byte) 0));
        this.P.addListener(new t7(this, f, (byte) 5));
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
        gl.c3(runnable);
    }

    public final boolean c() {
        return this.c || this.d || this.e;
    }

    public final void d() {
        boolean o = bkb.I.o();
        Bitmap bitmap = this.H;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            hs8 hs8Var = this.h;
            if (hs8Var.getWidth() > 0 && hs8Var.getHeight() > 0) {
                o = gl.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) hs8Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) hs8Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        textView.setTextColor(bkb.p1(0.41f, o ? -1 : -16777216));
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
        float f;
        float interpolation = s33.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = s33.h.getInterpolation(max);
        if (this.L) {
            double d = 6.614378f * max;
            f = 1.0f - (((1.1338935f * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f = interpolation2;
        }
        smc smcVar = this.r;
        float width = smcVar.getWidth();
        float height = smcVar.getHeight();
        RectF rectF = this.f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float R1 = gl.R1(max2, 1.0f, f);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f2 = centerY - iArr[1];
        float f3 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f4 = width / 2.0f;
        float f5 = height / 2.0f;
        float R12 = gl.R1(centerX, smcVar.getLeft() + f4, f);
        float R13 = gl.R1((f3 * interpolation) + (f2 - (f3 / 2.0f)), smcVar.getTop() + f5, f);
        float f6 = 1.0f - f;
        float f7 = (-90.0f) * f6;
        double d2 = f7;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float f8 = centerX - R12;
        float f9 = f2 - R13;
        float f10 = (((sin * f9) + (cos * f8)) / R1) + f4;
        float f11 = (((cos * f9) + ((-sin) * f8)) / R1) + f5;
        float R14 = gl.R1(f10, f4, interpolation2);
        float R15 = gl.R1(f11, f5, interpolation2);
        float f12 = R14 - f4;
        float f13 = R15 - f5;
        smcVar.setPivotX(R14);
        smcVar.setPivotY(R15);
        smcVar.setScaleX(R1);
        smcVar.setScaleY(R1);
        smcVar.setRotation(f7);
        smcVar.setRotationX(35.0f * f6);
        smcVar.setTranslationX((((cos * f12) - (sin * f13)) * R1) + ((R12 - smcVar.getLeft()) - R14));
        smcVar.setTranslationY(oo1.g(cos, f13, sin * f12, R1, (R13 - smcVar.getTop()) - R15));
        smcVar.setAlpha(this.J > 0.0f ? 1.0f : 0.0f);
        smcVar.setUseGyroscope(this.R * interpolation2);
        float f14 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f2 * f14);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.J);
        this.s.setAlpha(interpolation2);
        a6 a6Var = this.w;
        a6Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-gl.L(8.0f)) * f14);
        a6Var.setTranslationY(gl.L(16.0f) * f14);
        a6Var.setScaleX(gl.R1(0.8f, 1.0f, interpolation2));
        a6Var.setScaleY(gl.R1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        hs8 hs8Var = this.h;
        setContentView(hs8Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = kk7.D1;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        hs8Var.setSystemUiVisibility(1792);
        gl.j3(hs8Var, !bkb.I.o());
        gl.n3(window, !bkb.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gl.K1(getContext())) {
            tq9.d(new tf8(this, (byte) 5));
            super.show();
            WeakHashMap weakHashMap = jdc.a;
            zcc.c(this.h);
        }
    }
}
