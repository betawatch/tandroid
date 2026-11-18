package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class yh implements org.telegram.ui.web.c0 {
    public ValueAnimator a;
    public final /* synthetic */ ki.t3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ si e;

    public yh(si siVar, ki.t3 t3Var, String str, long j3) {
        this.e = siVar;
        this.b = t3Var;
        this.c = str;
        this.d = j3;
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ ki.w0 A() {
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
        si siVar = this.e;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(siVar.H3);
        long j3 = this.d;
        return d02.l(j3) || org.telegram.messenger.mp.u1(siVar.H3).Z6.contains(Long.valueOf(j3));
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
        si siVar = this.e;
        int i7 = siVar.H3;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.t3 t3Var = this.b;
        org.telegram.ui.ml0 ml0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, siVar.getContext(), null);
            u1Var.r(150L);
            di.x8.y(i7, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new i2(u1Var, 1), new ph(0, t3Var, str));
            org.telegram.messenger.g0.v1(t3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.mp.u1(i7).f4(paymentForm.users, false);
            ml0Var = new org.telegram.ui.ml0(paymentForm, null, str, h2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ml0Var = new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ml0Var != null) {
            t3Var.K();
            org.telegram.messenger.g0.v1(t3Var);
            yb0 yb0Var = new yb0(h2Var.getParentActivity());
            yb0Var.show();
            ml0Var.a1 = new a3.h((Object) yb0Var, (Object) t3Var, str, 26);
            ml0Var.Z0 = siVar.J0;
            yb0Var.d(ml0Var);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        si siVar = this.e;
        RadialProgressView radialProgressView = siVar.A3;
        n6 n6Var = siVar.C3;
        ki kiVar = siVar.w2;
        ki.t3 t3Var = this.b;
        if (kiVar == t3Var) {
            if (t3Var.Q || this.c != null) {
                n6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = 1;
                int i12 = 0;
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new x5(j3, 1.4f, n6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    n6Var.setText(spannableStringBuilder);
                } else {
                    n6Var.setText(str);
                }
                n6Var.setTextColor(i10);
                n6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.v0.R0;
                n6Var.setBackground(org.telegram.ui.ActionBar.n6.i0(i7, i0.a.h(i7) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (siVar.B3 != z10) {
                    siVar.B3 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new w(this, 10));
                    this.a.addListener(new rh(this, z10, i12));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (siVar.z3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new rh(this, z12, i11)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void s() {
        ki kiVar = this.e.w2;
        ki.t3 t3Var = this.b;
        if (kiVar == t3Var && !t3Var.K.c) {
            t3Var.K();
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.z0 z0Var = this.b.M;
        if (z0Var != null) {
            z0Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void u(int i7, final int i10, boolean z10) {
        si siVar = this.e;
        final int i11 = siVar.E4.b;
        final ki.q1 q1Var = new ki.q1();
        q1Var.c(q1Var.a, siVar.V1 ? i11 : 0, siVar.J0);
        siVar.V1 = z10;
        q1Var.c(q1Var.b, z10 ? i10 : 0, siVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(lr.f);
        final ki.t3 t3Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.qh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i11, i10);
                si siVar2 = yh.this.e;
                siVar2.l4 = f10;
                siVar2.k4 = true;
                v7 v7Var = siVar2.V2;
                if (v7Var != null) {
                    v7Var.updateColors();
                    v7Var.invalidate();
                }
                siVar2.E4.a(f10);
                lh.f fVar = siVar2.t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                t3Var.setCustomActionBarBackground(f10);
                siVar2.w2.invalidate();
                siVar2.p3.invalidate();
                q1Var.b(v7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.c0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        si siVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
            if (h2Var instanceof org.telegram.ui.bn) {
                ((org.telegram.ui.bn) h2Var).a0.setFieldText("@" + org.telegram.messenger.o10.o(user) + " " + str);
            }
            siVar.a(true);
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
        yb0 yb0Var = new yb0(siVar.getContext());
        cxVar.E2 = new a1.d(this, user, str, yb0Var, 10);
        yb0Var.show();
        yb0Var.d(cxVar);
    }

    @Override // org.telegram.ui.web.c0
    public final void y(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.c0
    public final void z() {
        si siVar = this.e;
        if (siVar.w2 != this.b) {
            return;
        }
        siVar.A0(false);
        siVar.getWindow().setSoftInputMode(48);
        siVar.dismiss();
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
