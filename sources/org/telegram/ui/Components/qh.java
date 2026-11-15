package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qh implements org.telegram.ui.web.c0 {
    public ValueAnimator a;
    public final /* synthetic */ ki.y3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ki e;

    public qh(ki kiVar, ki.y3 y3Var, String str, long j3) {
        this.e = kiVar;
        this.b = y3Var;
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
        ki kiVar = this.e;
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(kiVar.H3);
        long j3 = this.d;
        return b02.j(j3) || org.telegram.messenger.np.s1(kiVar.H3).X6.contains(Long.valueOf(j3));
    }

    @Override // org.telegram.ui.web.c0
    public final void i(boolean z10) {
        org.telegram.messenger.g0.Q3(this.e.V2.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
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
        ki kiVar = this.e;
        int i7 = kiVar.H3;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.y3 y3Var = this.b;
        org.telegram.ui.kl0 kl0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, kiVar.getContext(), null);
            t1Var.r(150L);
            di.u8.y(i7, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new y1(t1Var, 1), new gh(0, y3Var, str));
            org.telegram.messenger.g0.v1(y3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.np.s1(i7).Y3(paymentForm.users, false);
            kl0Var = new org.telegram.ui.kl0(paymentForm, null, str, e2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            kl0Var = new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (kl0Var != null) {
            y3Var.K();
            org.telegram.messenger.g0.v1(y3Var);
            nb0 nb0Var = new nb0(e2Var.getParentActivity());
            nb0Var.show();
            kl0Var.a1 = new a3.h((Object) nb0Var, (Object) y3Var, str, 26);
            kl0Var.Z0 = kiVar.J0;
            nb0Var.c(kl0Var);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        ki kiVar = this.e;
        RadialProgressView radialProgressView = kiVar.A3;
        h6 h6Var = kiVar.C3;
        ci ciVar = kiVar.w2;
        ki.y3 y3Var = this.b;
        if (ciVar == y3Var) {
            if (y3Var.Q || this.c != null) {
                h6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = 1;
                int i12 = 0;
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new p5(j3, 1.4f, h6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    h6Var.setText(spannableStringBuilder);
                } else {
                    h6Var.setText(str);
                }
                h6Var.setTextColor(i10);
                h6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.v0.R0;
                h6Var.setBackground(org.telegram.ui.ActionBar.j6.i0(i7, i0.a.h(i7) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (kiVar.B3 != z10) {
                    kiVar.B3 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new c6(this, 9));
                    this.a.addListener(new jh(this, z10, i12));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (kiVar.z3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new jh(this, z12, i11)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void s() {
        ci ciVar = this.e.w2;
        ki.y3 y3Var = this.b;
        if (ciVar == y3Var && !y3Var.K.c) {
            y3Var.K();
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
        ki kiVar = this.e;
        final int i11 = kiVar.E4.b;
        final ki.u1 u1Var = new ki.u1();
        u1Var.c(u1Var.a, kiVar.V1 ? i11 : 0, kiVar.J0);
        kiVar.V1 = z10;
        u1Var.c(u1Var.b, z10 ? i10 : 0, kiVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(er.f);
        final ki.y3 y3Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i11, i10);
                ki kiVar2 = qh.this.e;
                kiVar2.l4 = f10;
                kiVar2.k4 = true;
                o7 o7Var = kiVar2.V2;
                if (o7Var != null) {
                    o7Var.updateColors();
                    o7Var.invalidate();
                }
                kiVar2.E4.a(f10);
                lh.f fVar = kiVar2.t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                y3Var.setCustomActionBarBackground(f10);
                kiVar2.w2.invalidate();
                kiVar2.p3.invalidate();
                u1Var.b(o7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.c0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ki kiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
            if (e2Var instanceof org.telegram.ui.an) {
                ((org.telegram.ui.an) e2Var).a0.setFieldText("@" + org.telegram.messenger.q10.n(user) + " " + str);
            }
            kiVar.a(true);
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
        org.telegram.ui.yw ywVar = new org.telegram.ui.yw(bundle);
        nb0 nb0Var = new nb0(kiVar.getContext());
        ywVar.E2 = new a1.d(this, user, str, nb0Var, 10);
        nb0Var.show();
        nb0Var.c(ywVar);
    }

    @Override // org.telegram.ui.web.c0
    public final void y(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.c0
    public final void z() {
        ki kiVar = this.e;
        if (kiVar.w2 != this.b) {
            return;
        }
        kiVar.A0(false);
        kiVar.getWindow().setSoftInputMode(48);
        kiVar.dismiss();
        org.telegram.messenger.g0.i3(new ih(0), 150L);
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
