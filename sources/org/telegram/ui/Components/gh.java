package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gh implements org.telegram.ui.web.d0 {
    public ValueAnimator a;
    public final /* synthetic */ xh.i3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ bi e;

    public gh(bi biVar, xh.i3 i3Var, String str, long j10) {
        this.e = biVar;
        this.b = i3Var;
        this.c = str;
        this.d = j10;
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ xh.s0 A() {
        return null;
    }

    @Override // org.telegram.ui.web.d0
    public final void b() {
        z();
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.d0
    public final boolean h() {
        bi biVar = this.e;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(biVar.D3);
        long j10 = this.d;
        return b02.j(j10) || org.telegram.messenger.vp.r1(biVar.D3).X6.contains(Long.valueOf(j10));
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z10) {
        org.telegram.messenger.i0.Q3(this.e.R2.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.d0
    public final void j() {
        z();
    }

    @Override // org.telegram.ui.web.d0
    public final void k(boolean z10) {
        this.b.setNeedCloseConfirmation(z10);
    }

    @Override // org.telegram.ui.web.d0
    public final void m(int i10) {
        this.b.setCustomBackground(i10);
    }

    @Override // org.telegram.ui.web.d0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        bi biVar = this.e;
        int i10 = biVar.D3;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        xh.i3 i3Var = this.b;
        org.telegram.ui.sm0 sm0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, biVar.getContext(), null);
            x1Var.r(150L);
            rh.e6.y(i10, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(x1Var, 1), new vg(2, i3Var, str));
            org.telegram.messenger.i0.v1(i3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.vp.r1(i10).V3(paymentForm.users, false);
            sm0Var = new org.telegram.ui.sm0(paymentForm, null, str, k2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            sm0Var = new org.telegram.ui.sm0((TLRPC.PaymentReceipt) tLObject);
        }
        if (sm0Var != null) {
            i3Var.I();
            org.telegram.messenger.i0.v1(i3Var);
            fc0 fc0Var = new fc0(k2Var.getParentActivity());
            fc0Var.show();
            sm0Var.Z0 = new androidx.car.app.utils.a(fc0Var, i3Var, str, 17);
            sm0Var.Y0 = biVar.I0;
            fc0Var.c(sm0Var);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        bi biVar = this.e;
        RadialProgressView radialProgressView = biVar.w3;
        f6 f6Var = biVar.y3;
        uh uhVar = biVar.s2;
        xh.i3 i3Var = this.b;
        if (uhVar == i3Var) {
            if (i3Var.P || this.c != null) {
                f6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = 1;
                int i13 = 0;
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new o5(j10, 1.4f, f6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    f6Var.setText(spannableStringBuilder);
                } else {
                    f6Var.setText(str);
                }
                f6Var.setTextColor(i11);
                f6Var.setEmojiColor(i11);
                boolean z14 = org.telegram.ui.web.z0.Q0;
                f6Var.setBackground(org.telegram.ui.ActionBar.t6.i0(i10, i0.b.h(i10) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (biVar.x3 != z10) {
                    biVar.x3 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new a6(this, 9));
                    this.a.addListener(new zg(this, z10, i13));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i11);
                if (biVar.v3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new zg(this, z12, i12)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void s() {
        uh uhVar = this.e.s2;
        xh.i3 i3Var = this.b;
        if (uhVar == i3Var && !i3Var.J.c) {
            i3Var.I();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.b1 b1Var = this.b.L;
        if (b1Var != null) {
            b1Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void u(int i10, final int i11, boolean z10) {
        bi biVar = this.e;
        final int i12 = biVar.A4.b;
        final xh.m1 m1Var = new xh.m1();
        m1Var.c(m1Var.a, biVar.R1 ? i12 : 0, biVar.I0);
        biVar.R1 = z10;
        m1Var.c(m1Var.b, z10 ? i11 : 0, biVar.I0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(gr.f);
        final xh.i3 i3Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f7 = i0.b.f(floatValue, i12, i11);
                bi biVar2 = gh.this.e;
                biVar2.h4 = f7;
                biVar2.g4 = true;
                kg.g1 g1Var = biVar2.R2;
                if (g1Var != null) {
                    g1Var.updateColors();
                    g1Var.invalidate();
                }
                biVar2.A4.a(f7);
                bh.i iVar = biVar2.p3;
                if (iVar != null) {
                    iVar.invalidate();
                }
                i3Var.setCustomActionBarBackground(f7);
                biVar2.s2.invalidate();
                biVar2.l3.invalidate();
                m1Var.b(g1Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        bi biVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
            if (k2Var instanceof org.telegram.ui.un) {
                ((org.telegram.ui.un) k2Var).Z.setFieldText("@" + org.telegram.messenger.h20.n(user) + " " + str);
            }
            biVar.a(true);
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
        org.telegram.ui.ay ayVar = new org.telegram.ui.ay(bundle);
        fc0 fc0Var = new fc0(biVar.getContext());
        ayVar.C2 = new a1.d(this, user, str, fc0Var, 6);
        fc0Var.show();
        fc0Var.c(ayVar);
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        bi biVar = this.e;
        if (biVar.s2 != this.b) {
            return;
        }
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
        biVar.dismiss();
        org.telegram.messenger.i0.h3(new org.telegram.messenger.rz(15), 150L);
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i10) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
