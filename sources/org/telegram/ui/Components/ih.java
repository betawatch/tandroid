package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ih implements org.telegram.ui.web.d0 {
    public ValueAnimator a;
    public final /* synthetic */ hi.c4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ci e;

    public ih(ci ciVar, hi.c4 c4Var, String str, long j3) {
        this.e = ciVar;
        this.b = c4Var;
        this.c = str;
        this.d = j3;
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ hi.v0 A() {
        return null;
    }

    @Override // org.telegram.ui.web.d0
    public final void b() {
        z();
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ String g(boolean z9, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override // org.telegram.ui.web.d0
    public final boolean h() {
        ci ciVar = this.e;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ciVar.G3);
        long j3 = this.d;
        return b02.j(j3) || org.telegram.messenger.qp.s1(ciVar.G3).W6.contains(Long.valueOf(j3));
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z9) {
        org.telegram.messenger.g0.R3(this.e.U2.getBackButton(), z9 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.web.d0
    public final void j() {
        z();
    }

    @Override // org.telegram.ui.web.d0
    public final void k(boolean z9) {
        this.b.setNeedCloseConfirmation(z9);
    }

    @Override // org.telegram.ui.web.d0
    public final void m(int i7) {
        this.b.setCustomBackground(i7);
    }

    @Override // org.telegram.ui.web.d0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        ci ciVar = this.e;
        int i7 = ciVar.G3;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        boolean z9 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        hi.c4 c4Var = this.b;
        org.telegram.ui.kl0 kl0Var = null;
        if (z9) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ciVar.getContext(), null);
            u1Var.r(150L);
            bi.ea.y(i7, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new z1(u1Var, 1), new org.telegram.messenger.voip.k(25, c4Var, str));
            org.telegram.messenger.g0.v1(c4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.qp.s1(i7).Y3(paymentForm.users, false);
            kl0Var = new org.telegram.ui.kl0(paymentForm, null, str, f2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            kl0Var = new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (kl0Var != null) {
            c4Var.J();
            org.telegram.messenger.g0.v1(c4Var);
            mb0 mb0Var = new mb0(f2Var.getParentActivity());
            mb0Var.show();
            kl0Var.Z0 = new a3.h((Object) mb0Var, (Object) c4Var, str, 25);
            kl0Var.Y0 = ciVar.I0;
            mb0Var.c(kl0Var);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
        ci ciVar = this.e;
        RadialProgressView radialProgressView = ciVar.z3;
        i6 i6Var = ciVar.B3;
        uh uhVar = ciVar.v2;
        hi.c4 c4Var = this.b;
        if (uhVar == c4Var) {
            if (c4Var.P || this.c != null) {
                i6Var.setClickable(z10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = 1;
                int i12 = 0;
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new q5(j3, 1.4f, i6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    i6Var.setText(spannableStringBuilder);
                } else {
                    i6Var.setText(str);
                }
                i6Var.setTextColor(i10);
                i6Var.setEmojiColor(i10);
                boolean z13 = org.telegram.ui.web.x0.Q0;
                i6Var.setBackground(org.telegram.ui.ActionBar.m6.i0(i7, i0.a.h(i7) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (ciVar.A3 != z9) {
                    ciVar.A3 = z9;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new d6(this, 9));
                    this.a.addListener(new bh(this, z9, i12));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (ciVar.y3 != z11) {
                    radialProgressView.animate().cancel();
                    if (z11) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).setDuration(250L).setListener(new bh(this, z11, i11)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void s() {
        uh uhVar = this.e.v2;
        hi.c4 c4Var = this.b;
        if (uhVar == c4Var && !c4Var.J.c) {
            c4Var.J();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void t(boolean z9) {
        org.telegram.ui.ActionBar.z0 z0Var = this.b.L;
        if (z0Var != null) {
            z0Var.setVisibility(z9 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void u(int i7, final int i10, boolean z9) {
        ci ciVar = this.e;
        final int i11 = ciVar.D4.b;
        final hi.t1 t1Var = new hi.t1();
        t1Var.c(t1Var.a, ciVar.U1 ? i11 : 0, ciVar.I0);
        ciVar.U1 = z9;
        t1Var.c(t1Var.b, z9 ? i10 : 0, ciVar.I0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(wq.f);
        final hi.c4 c4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ah
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i11, i10);
                ci ciVar2 = ih.this.e;
                ciVar2.k4 = f10;
                ciVar2.j4 = true;
                q7 q7Var = ciVar2.U2;
                if (q7Var != null) {
                    q7Var.updateColors();
                    q7Var.invalidate();
                }
                ciVar2.D4.a(f10);
                lh.f fVar = ciVar2.s3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                c4Var.setCustomActionBarBackground(f10);
                ciVar2.v2.invalidate();
                ciVar2.o3.invalidate();
                t1Var.b(q7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ci ciVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
            if (f2Var instanceof org.telegram.ui.cn) {
                ((org.telegram.ui.cn) f2Var).Z.setFieldText("@" + org.telegram.messenger.t10.n(user) + " " + str);
            }
            ciVar.a(true);
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
        org.telegram.ui.zw zwVar = new org.telegram.ui.zw(bundle);
        mb0 mb0Var = new mb0(ciVar.getContext());
        zwVar.D2 = new a1.d(this, user, str, mb0Var, 10);
        mb0Var.show();
        mb0Var.c(zwVar);
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z9) {
        this.b.setAllowSwipes(z9);
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        ci ciVar = this.e;
        if (ciVar.v2 != this.b) {
            return;
        }
        ciVar.A0(false);
        ciVar.getWindow().setSoftInputMode(48);
        ciVar.dismiss();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.rc(26), 150L);
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
    public final /* synthetic */ void p(boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void r(int i7) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void w(boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i7) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void o(int i7, boolean z9) {
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12, String str2) {
    }
}
