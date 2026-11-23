package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zh implements org.telegram.ui.web.c0 {
    public ValueAnimator a;
    public final /* synthetic */ ki.t3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ti e;

    public zh(ti tiVar, ki.t3 t3Var, String str, long j3) {
        this.e = tiVar;
        this.b = t3Var;
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
        ti tiVar = this.e;
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(tiVar.H3);
        long j3 = this.d;
        return d02.l(j3) || org.telegram.messenger.mp.u1(tiVar.H3).Z6.contains(Long.valueOf(j3));
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
        ti tiVar = this.e;
        int i7 = tiVar.H3;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ki.t3 t3Var = this.b;
        org.telegram.ui.kl0 kl0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, tiVar.getContext(), null);
            t1Var.r(150L);
            di.y8.y(i7, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new i2(t1Var, 1), new ph(1, t3Var, str));
            org.telegram.messenger.g0.v1(t3Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.mp.u1(i7).f4(paymentForm.users, false);
            kl0Var = new org.telegram.ui.kl0(paymentForm, null, str, g2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            kl0Var = new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (kl0Var != null) {
            t3Var.J();
            org.telegram.messenger.g0.v1(t3Var);
            wb0 wb0Var = new wb0(g2Var.getParentActivity());
            wb0Var.show();
            kl0Var.a1 = new a3.h((Object) wb0Var, (Object) t3Var, str, 26);
            kl0Var.Z0 = tiVar.J0;
            wb0Var.d(kl0Var);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        ti tiVar = this.e;
        RadialProgressView radialProgressView = tiVar.A3;
        n6 n6Var = tiVar.C3;
        li liVar = tiVar.w2;
        ki.t3 t3Var = this.b;
        if (liVar == t3Var) {
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
                if (tiVar.B3 != z10) {
                    tiVar.B3 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new w(this, 10));
                    this.a.addListener(new sh(this, z10, i12));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (tiVar.z3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new sh(this, z12, i11)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void s() {
        li liVar = this.e.w2;
        ki.t3 t3Var = this.b;
        if (liVar == t3Var && !t3Var.K.c) {
            t3Var.J();
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
        ti tiVar = this.e;
        final int i11 = tiVar.E4.b;
        final ki.p1 p1Var = new ki.p1();
        p1Var.c(p1Var.a, tiVar.V1 ? i11 : 0, tiVar.J0);
        tiVar.V1 = z10;
        p1Var.c(p1Var.b, z10 ? i10 : 0, tiVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(kr.f);
        final ki.t3 t3Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i11, i10);
                ti tiVar2 = zh.this.e;
                tiVar2.l4 = f10;
                tiVar2.k4 = true;
                u7 u7Var = tiVar2.V2;
                if (u7Var != null) {
                    u7Var.updateColors();
                    u7Var.invalidate();
                }
                tiVar2.E4.a(f10);
                lh.f fVar = tiVar2.t3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                t3Var.setCustomActionBarBackground(f10);
                tiVar2.w2.invalidate();
                tiVar2.p3.invalidate();
                p1Var.b(u7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.c0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        ti tiVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
            if (g2Var instanceof org.telegram.ui.bn) {
                ((org.telegram.ui.bn) g2Var).a0.setFieldText("@" + org.telegram.messenger.n10.o(user) + " " + str);
            }
            tiVar.a(true);
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
        org.telegram.ui.bx bxVar = new org.telegram.ui.bx(bundle);
        wb0 wb0Var = new wb0(tiVar.getContext());
        bxVar.E2 = new a1.d(this, user, str, wb0Var, 10);
        wb0Var.show();
        wb0Var.d(bxVar);
    }

    @Override // org.telegram.ui.web.c0
    public final void y(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.c0
    public final void z() {
        ti tiVar = this.e;
        if (tiVar.w2 != this.b) {
            return;
        }
        tiVar.A0(false);
        tiVar.getWindow().setSoftInputMode(48);
        tiVar.dismiss();
        org.telegram.messenger.g0.h3(new ne(2), 150L);
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
