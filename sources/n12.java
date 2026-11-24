// default package

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n12 implements uv0 {
    public ValueAnimator a;
    public final /* synthetic */ e32 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ i22 e;

    public n12(i22 i22Var, e32 e32Var, String str, long j) {
        this.e = i22Var;
        this.b = e32Var;
        this.c = str;
        this.d = j;
    }

    @Override // uv0
    public final ws0 A() {
        return null;
    }

    @Override // uv0
    public final void b() {
        z();
    }

    @Override // uv0
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override // uv0
    public final boolean h() {
        int i = this.e.G3;
        hs6 d0 = hs6.d0(i);
        long j = this.d;
        return d0.l(j) || oc7.r1(i).S3.contains(Long.valueOf(j));
    }

    @Override // uv0
    public final void i(boolean z) {
        gm.L3(this.e.U2.getBackButton(), z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // uv0
    public final void j() {
        z();
    }

    @Override // uv0
    public final void k(boolean z) {
        this.b.setNeedCloseConfirmation(z);
    }

    @Override // uv0
    public final void m(int i) {
        this.b.setCustomBackground(i);
    }

    @Override // uv0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        i22 i22Var = this.e;
        int i = i22Var.G3;
        d dVar = i22Var.Z1;
        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        e32 e32Var = this.b;
        p pVar = null;
        if (z) {
            he heVar = new he(3, null, i22Var.getContext());
            heVar.q(150L);
            jva.v(i, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new td(heVar, (byte) 4), new qy1(e32Var, str, (byte) 3));
            gm.t1(e32Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            oc7.r1(i).d4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, dVar);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            e32Var.J();
            gm.t1(e32Var);
            ht7 ht7Var = new ht7(dVar.getParentActivity());
            ht7Var.show();
            pVar.a1 = new jf((Object) ht7Var, (Object) e32Var, (Object) str, (byte) 21);
            pVar.Z0 = i22Var.J0;
            ht7Var.c(pVar);
        }
    }

    @Override // uv0
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        float f;
        float f2;
        i22 i22Var = this.e;
        RadialProgressView radialProgressView = i22Var.z3;
        io ioVar = i22Var.B3;
        a22 a22Var = i22Var.v2;
        e32 e32Var = this.b;
        if (a22Var == e32Var) {
            if (e32Var.Q || this.c != null) {
                ioVar.setClickable(z2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                byte b = 1;
                byte b2 = 0;
                if (j != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new gn(j, 1.4f, ioVar.getPaint().getFontMetricsInt()), 0, 1, 33);
                    ioVar.setText(spannableStringBuilder);
                } else {
                    ioVar.setText(str);
                }
                ioVar.setTextColor(i2);
                ioVar.setEmojiColor(i2);
                boolean z5 = qw0.R0;
                ioVar.setBackground(cmb.g0(i, on2.h(i) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (i22Var.A3 != z) {
                    i22Var.A3 = z;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z) {
                        f2 = 0.0f;
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                        f2 = 1.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new et1(this, (byte) 2));
                    this.a.addListener(new g12(this, z, b2));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i2);
                if (i22Var.y3 != z3) {
                    radialProgressView.animate().cancel();
                    if (z3) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.1f).scaleY(z3 ? 1.0f : 0.1f).setDuration(250L).setListener(new g12(this, z3, b)).start();
                }
            }
        }
    }

    @Override // uv0
    public final void s() {
        a22 a22Var = this.e.v2;
        e32 e32Var = this.b;
        if (a22Var != e32Var || e32Var.K.c) {
            return;
        }
        e32Var.J();
    }

    @Override // uv0
    public final void t(boolean z) {
        a8 a8Var = this.b.M;
        if (a8Var != null) {
            a8Var.setVisibility(z ? 0 : 8);
        }
    }

    @Override // uv0
    public final void u(int i, final int i2, boolean z) {
        i22 i22Var = this.e;
        final int i3 = i22Var.D4.b;
        final rw0 rw0Var = new rw0();
        rw0Var.c(rw0Var.a, i22Var.U1 ? i3 : 0, i22Var.J0);
        i22Var.U1 = z;
        rw0Var.c(rw0Var.b, z ? i2 : 0, i22Var.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(d53.f);
        final e32 e32Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f12
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f = on2.f(floatValue, i3, i2);
                i22 i22Var2 = n12.this.e;
                i22Var2.k4 = f;
                i22Var2.j4 = true;
                x20 x20Var = i22Var2.U2;
                if (x20Var != null) {
                    x20Var.updateColors();
                    x20Var.invalidate();
                }
                i22Var2.D4.a(f);
                e02 e02Var = i22Var2.s3;
                if (e02Var != null) {
                    e02Var.invalidate();
                }
                e32Var.setCustomActionBarBackground(f);
                i22Var2.v2.invalidate();
                i22Var2.o3.invalidate();
                rw0Var.b(x20Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // uv0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        i22 i22Var = this.e;
        if (isEmpty) {
            d dVar = i22Var.Z1;
            if (dVar instanceof yv1) {
                ((yv1) dVar).a0.setFieldText("@" + m9c.p(user) + " " + str);
            }
            i22Var.a(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        nk3 nk3Var = new nk3(bundle);
        ht7 ht7Var = new ht7(i22Var.getContext());
        nk3Var.E2 = new lu((Object) this, (Object) user, (Object) ht7Var, str, (byte) 5);
        ht7Var.show();
        ht7Var.c(nk3Var);
    }

    @Override // uv0
    public final void y(boolean z) {
        this.b.setAllowSwipes(z);
    }

    @Override // uv0
    public final void z() {
        i22 i22Var = this.e;
        if (i22Var.v2 != this.b) {
            return;
        }
        i22Var.v0(false);
        i22Var.getWindow().setSoftInputMode(48);
        i22Var.dismiss();
        gm.d3(new jd((byte) 10), 150L);
    }

    @Override // uv0
    public final void a() {
    }

    @Override // uv0
    public final void c() {
    }

    @Override // uv0
    public final void d(TLRPC.Document document) {
    }

    @Override // uv0
    public final void e(String str) {
    }

    @Override // uv0
    public final void f(ArrayList arrayList) {
    }

    @Override // uv0
    public final void p(boolean z) {
    }

    @Override // uv0
    public final void r(int i) {
    }

    @Override // uv0
    public final void w(boolean z) {
    }

    @Override // uv0
    public final void x(int i) {
    }

    @Override // uv0
    public final void o(int i, boolean z) {
    }

    @Override // uv0
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }
}
