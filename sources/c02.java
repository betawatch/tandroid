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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c02 implements ku0 {
    public ValueAnimator a;
    public final /* synthetic */ s12 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ x02 e;

    public c02(x02 x02Var, s12 s12Var, String str, long j) {
        this.e = x02Var;
        this.b = s12Var;
        this.c = str;
        this.d = j;
    }

    @Override // ku0
    public final or0 A() {
        return null;
    }

    @Override // ku0
    public final void b() {
        z();
    }

    @Override // ku0
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override // ku0
    public final boolean h() {
        int i = this.e.G3;
        hq6 d0 = hq6.d0(i);
        long j = this.d;
        return d0.l(j) || na7.q1(i).S3.contains(Long.valueOf(j));
    }

    @Override // ku0
    public final void i(boolean z) {
        gl.M3(this.e.U2.getBackButton(), z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // ku0
    public final void j() {
        z();
    }

    @Override // ku0
    public final void k(boolean z) {
        this.b.setNeedCloseConfirmation(z);
    }

    @Override // ku0
    public final void m(int i) {
        this.b.setCustomBackground(i);
    }

    @Override // ku0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        x02 x02Var = this.e;
        int i = x02Var.G3;
        d dVar = x02Var.Z1;
        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        s12 s12Var = this.b;
        p pVar = null;
        if (z) {
            hd hdVar = new hd(3, null, x02Var.getContext());
            hdVar.q(150L);
            gta.v(i, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new tc(hdVar, (byte) 4), new pz1(s12Var, str, (byte) 2));
            gl.t1(s12Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            na7.q1(i).a4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, dVar);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            s12Var.K();
            gl.t1(s12Var);
            gr7 gr7Var = new gr7(dVar.getParentActivity());
            gr7Var.show();
            pVar.a1 = new ie((Object) gr7Var, (Object) s12Var, (Object) str, (byte) 21);
            pVar.Z0 = x02Var.J0;
            gr7Var.c(pVar);
        }
    }

    @Override // ku0
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        float f;
        float f2;
        x02 x02Var = this.e;
        RadialProgressView radialProgressView = x02Var.z3;
        hn hnVar = x02Var.B3;
        p02 p02Var = x02Var.v2;
        s12 s12Var = this.b;
        if (p02Var == s12Var) {
            if (s12Var.Q || this.c != null) {
                hnVar.setClickable(z2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                byte b = 1;
                byte b2 = 0;
                if (j != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new gm(j, 1.4f, hnVar.getPaint().getFontMetricsInt()), 0, 1, 33);
                    hnVar.setText(spannableStringBuilder);
                } else {
                    hnVar.setText(str);
                }
                hnVar.setTextColor(i2);
                hnVar.setEmojiColor(i2);
                boolean z5 = hv0.R0;
                hnVar.setBackground(bkb.g0(i, bm2.h(i) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (x02Var.A3 != z) {
                    x02Var.A3 = z;
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
                    duration.addUpdateListener(new uz1(this, (byte) 0));
                    this.a.addListener(new vz1(this, z, b2));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i2);
                if (x02Var.y3 != z3) {
                    radialProgressView.animate().cancel();
                    if (z3) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.1f).scaleY(z3 ? 1.0f : 0.1f).setDuration(250L).setListener(new vz1(this, z3, b)).start();
                }
            }
        }
    }

    @Override // ku0
    public final void s() {
        p02 p02Var = this.e.v2;
        s12 s12Var = this.b;
        if (p02Var != s12Var || s12Var.K.c) {
            return;
        }
        s12Var.K();
    }

    @Override // ku0
    public final void t(boolean z) {
        a8 a8Var = this.b.M;
        if (a8Var != null) {
            a8Var.setVisibility(z ? 0 : 8);
        }
    }

    @Override // ku0
    public final void u(int i, final int i2, boolean z) {
        x02 x02Var = this.e;
        final int i3 = x02Var.D4.b;
        final iv0 iv0Var = new iv0();
        iv0Var.c(iv0Var.a, x02Var.U1 ? i3 : 0, x02Var.J0);
        x02Var.U1 = z;
        iv0Var.c(iv0Var.b, z ? i2 : 0, x02Var.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(s33.f);
        final s12 s12Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tz1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f = bm2.f(floatValue, i3, i2);
                x02 x02Var2 = c02.this.e;
                x02Var2.k4 = f;
                x02Var2.j4 = true;
                x10 x10Var = x02Var2.U2;
                if (x10Var != null) {
                    x10Var.updateColors();
                    x10Var.invalidate();
                }
                x02Var2.D4.a(f);
                ry1 ry1Var = x02Var2.s3;
                if (ry1Var != null) {
                    ry1Var.invalidate();
                }
                s12Var.setCustomActionBarBackground(f);
                x02Var2.v2.invalidate();
                x02Var2.o3.invalidate();
                iv0Var.b(x10Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // ku0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        x02 x02Var = this.e;
        if (isEmpty) {
            d dVar = x02Var.Z1;
            if (dVar instanceof mu1) {
                ((mu1) dVar).a0.setFieldText("@" + l7c.o(user) + " " + str);
            }
            x02Var.a(true);
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
        cj3 cj3Var = new cj3(bundle);
        gr7 gr7Var = new gr7(x02Var.getContext());
        cj3Var.E2 = new lt((Object) this, (Object) user, (Object) gr7Var, str, (byte) 5);
        gr7Var.show();
        gr7Var.c(cj3Var);
    }

    @Override // ku0
    public final void y(boolean z) {
        this.b.setAllowSwipes(z);
    }

    @Override // ku0
    public final void z() {
        x02 x02Var = this.e;
        if (x02Var.v2 != this.b) {
            return;
        }
        x02Var.v0(false);
        x02Var.getWindow().setSoftInputMode(48);
        x02Var.dismiss();
        gl.e3(new jc((byte) 10), 150L);
    }

    @Override // ku0
    public final void a() {
    }

    @Override // ku0
    public final void c() {
    }

    @Override // ku0
    public final void d(TLRPC.Document document) {
    }

    @Override // ku0
    public final void e(String str) {
    }

    @Override // ku0
    public final void f(ArrayList arrayList) {
    }

    @Override // ku0
    public final void p(boolean z) {
    }

    @Override // ku0
    public final void r(int i) {
    }

    @Override // ku0
    public final void w(boolean z) {
    }

    @Override // ku0
    public final void x(int i) {
    }

    @Override // ku0
    public final void o(int i, boolean z) {
    }

    @Override // ku0
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }
}
