package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ai implements org.telegram.ui.web.c0 {
    public ValueAnimator a;
    public final /* synthetic */ ki.s3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ui e;

    public ai(ui uiVar, ki.s3 s3Var, String str, long j3) {
        this.e = uiVar;
        this.b = s3Var;
        this.c = str;
        this.d = j3;
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ ki.v0 A() {
        return null;
    }

    @Override // org.telegram.ui.web.c0
    public final void b() {
        z();
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.c0
    public final boolean h() {
        ui uiVar = this.e;
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(uiVar.H3);
        long j3 = this.d;
        return d02.l(j3) || org.telegram.messenger.np.u1(uiVar.H3).Z6.contains(Long.valueOf(j3));
    }

    @Override // org.telegram.ui.web.c0
    public final void i(boolean z10) {
        org.telegram.messenger.g0.P3(this.e.V2.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.c0
    public final void j() {
        z();
    }

    @Override // org.telegram.ui.web.c0
    public final void k(boolean z10) {
        this.b.setNeedCloseConfirmation(z10);
    }

    @Override // org.telegram.ui.web.c0
    public final void m(int i7) {
        this.b.setCustomBackground(i7);
    }

    @Override // org.telegram.ui.web.c0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        ui uiVar = this.e;
        int i7 = uiVar.H3;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.s3 s3Var = this.b;
        org.telegram.ui.ml0 ml0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, uiVar.getContext(), null);
            t1Var.r(150L);
            di.y8.y(i7, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new j2(t1Var, 1), new rh(0, s3Var, str));
            org.telegram.messenger.g0.v1(s3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.np.u1(i7).f4(paymentForm.users, false);
            ml0Var = new org.telegram.ui.ml0(paymentForm, null, str, g2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ml0Var = new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ml0Var != null) {
            s3Var.K();
            org.telegram.messenger.g0.v1(s3Var);
            zb0 zb0Var = new zb0(g2Var.getParentActivity());
            zb0Var.show();
            ml0Var.a1 = new a3.h((Object) zb0Var, (Object) s3Var, str, 26);
            ml0Var.Z0 = uiVar.J0;
            zb0Var.d(ml0Var);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        ui uiVar = this.e;
        RadialProgressView radialProgressView = uiVar.A3;
        o6 o6Var = uiVar.C3;
        mi miVar = uiVar.w2;
        ki.s3 s3Var = this.b;
        if (miVar == s3Var) {
            if (s3Var.Q || this.c != null) {
                o6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = 1;
                int i12 = 0;
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new y5(j3, 1.4f, o6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    o6Var.setText(spannableStringBuilder);
                } else {
                    o6Var.setText(str);
                }
                o6Var.setTextColor(i10);
                o6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.v0.R0;
                o6Var.setBackground(org.telegram.ui.ActionBar.m6.i0(i7, i0.a.h(i7) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (uiVar.B3 != z10) {
                    uiVar.B3 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new x(this, 10));
                    this.a.addListener(new th(this, z10, i12));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (uiVar.z3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new th(this, z12, i11)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void s() {
        mi miVar = this.e.w2;
        ki.s3 s3Var = this.b;
        if (miVar == s3Var && !s3Var.K.c) {
            s3Var.K();
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.y0 y0Var = this.b.M;
        if (y0Var != null) {
            y0Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void u(int i7, final int i10, boolean z10) {
        ui uiVar = this.e;
        final int i11 = uiVar.E4.b;
        final ki.p1 p1Var = new ki.p1();
        p1Var.c(p1Var.a, uiVar.V1 ? i11 : 0, uiVar.J0);
        uiVar.V1 = z10;
        p1Var.c(p1Var.b, z10 ? i10 : 0, uiVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(nr.f);
        final ki.s3 s3Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.sh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i11, i10);
                ui uiVar2 = ai.this.e;
                uiVar2.l4 = f10;
                uiVar2.k4 = true;
                v7 v7Var = uiVar2.V2;
                if (v7Var != null) {
                    v7Var.updateColors();
                    v7Var.invalidate();
                }
                uiVar2.E4.a(f10);
                lh.f fVar = uiVar2.t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                s3Var.setCustomActionBarBackground(f10);
                uiVar2.w2.invalidate();
                uiVar2.p3.invalidate();
                p1Var.b(v7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.c0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ui uiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
            if (g2Var instanceof org.telegram.ui.bn) {
                ((org.telegram.ui.bn) g2Var).a0.setFieldText("@" + org.telegram.messenger.p10.o(user) + " " + str);
            }
            uiVar.a(true);
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
        org.telegram.ui.cx cxVar = new org.telegram.ui.cx(bundle);
        zb0 zb0Var = new zb0(uiVar.getContext());
        cxVar.E2 = new a1.d(this, user, str, zb0Var, 10);
        zb0Var.show();
        zb0Var.d(cxVar);
    }

    @Override // org.telegram.ui.web.c0
    public final void y(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.c0
    public final void z() {
        ui uiVar = this.e;
        if (uiVar.w2 != this.b) {
            return;
        }
        uiVar.A0(false);
        uiVar.getWindow().setSoftInputMode(48);
        uiVar.dismiss();
        org.telegram.messenger.g0.h3(new me(2), 150L);
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void d(TLRPC.Document document) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void e(String str) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void f(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void p(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void r(int i7) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final void x(int i7) {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void o(int i7, boolean z10) {
    }

    @Override // org.telegram.ui.web.c0
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
    }
}
