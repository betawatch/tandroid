package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gh implements org.telegram.ui.web.d0 {
    public ValueAnimator a;
    public final /* synthetic */ ii.d4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ bi e;

    public gh(bi biVar, ii.d4 d4Var, String str, long j10) {
        this.e = biVar;
        this.b = d4Var;
        this.c = str;
        this.d = j10;
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ ii.w0 A() {
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
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(biVar.E3);
        long j10 = this.d;
        return b02.j(j10) || org.telegram.messenger.hp.s1(biVar.E3).W6.contains(Long.valueOf(j10));
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z10) {
        org.telegram.messenger.g0.R3(this.e.S2.getBackButton(), z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
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
    public final void m(int i3) {
        this.b.setCustomBackground(i3);
    }

    @Override // org.telegram.ui.web.d0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        bi biVar = this.e;
        int i3 = biVar.E3;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        boolean z10 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ii.d4 d4Var = this.b;
        org.telegram.ui.dl0 dl0Var = null;
        if (z10) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, biVar.getContext(), null);
            s1Var.r(150L);
            ci.e9.y(i3, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new z1(s1Var, 1), new mi.f(29, d4Var, str));
            org.telegram.messenger.g0.v1(d4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.hp.s1(i3).Y3(paymentForm.users, false);
            dl0Var = new org.telegram.ui.dl0(paymentForm, null, str, d2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            dl0Var = new org.telegram.ui.dl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (dl0Var != null) {
            d4Var.J();
            org.telegram.messenger.g0.v1(d4Var);
            hb0 hb0Var = new hb0(d2Var.getParentActivity());
            hb0Var.show();
            dl0Var.a1 = new aa.a(hb0Var, d4Var, str, 25);
            dl0Var.Z0 = biVar.J0;
            hb0Var.c(dl0Var);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13) {
        bi biVar = this.e;
        RadialProgressView radialProgressView = biVar.x3;
        h6 h6Var = biVar.z3;
        th thVar = biVar.t2;
        ii.d4 d4Var = this.b;
        if (thVar == d4Var) {
            if (d4Var.Q || this.c != null) {
                h6Var.setClickable(z11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = 1;
                int i12 = 0;
                if (j10 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new p5(j10, 1.4f, h6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    h6Var.setText(spannableStringBuilder);
                } else {
                    h6Var.setText(str);
                }
                h6Var.setTextColor(i10);
                h6Var.setEmojiColor(i10);
                boolean z14 = org.telegram.ui.web.w0.R0;
                h6Var.setBackground(org.telegram.ui.ActionBar.k6.i0(i3, i0.a.h(i3) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (biVar.y3 != z10) {
                    biVar.y3 = z10;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new c6(this, 9));
                    this.a.addListener(new zg(this, z10, i12));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (biVar.w3 != z12) {
                    radialProgressView.animate().cancel();
                    if (z12) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.1f).scaleY(z12 ? 1.0f : 0.1f).setDuration(250L).setListener(new zg(this, z12, i11)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void s() {
        th thVar = this.e.t2;
        ii.d4 d4Var = this.b;
        if (thVar == d4Var && !d4Var.K.c) {
            d4Var.J();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void t(boolean z10) {
        org.telegram.ui.ActionBar.y0 y0Var = this.b.M;
        if (y0Var != null) {
            y0Var.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void u(int i3, final int i10, boolean z10) {
        bi biVar = this.e;
        final int i11 = biVar.B4.b;
        final ii.u1 u1Var = new ii.u1();
        u1Var.c(u1Var.a, biVar.S1 ? i11 : 0, biVar.J0);
        biVar.S1 = z10;
        u1Var.c(u1Var.b, z10 ? i10 : 0, biVar.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(xq.f);
        final ii.d4 d4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.yg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i11, i10);
                bi biVar2 = gh.this.e;
                biVar2.i4 = f10;
                biVar2.h4 = true;
                p7 p7Var = biVar2.S2;
                if (p7Var != null) {
                    p7Var.updateColors();
                    p7Var.invalidate();
                }
                biVar2.B4.a(f10);
                mh.f fVar = biVar2.q3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                d4Var.setCustomActionBarBackground(f10);
                biVar2.t2.invalidate();
                biVar2.m3.invalidate();
                u1Var.b(p7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        bi biVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
            if (d2Var instanceof org.telegram.ui.wm) {
                ((org.telegram.ui.wm) d2Var).a0.setFieldText("@" + org.telegram.messenger.l10.n(user) + " " + str);
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
        org.telegram.ui.uw uwVar = new org.telegram.ui.uw(bundle);
        hb0 hb0Var = new hb0(biVar.getContext());
        uwVar.D2 = new a1.d(this, user, str, hb0Var, 9);
        hb0Var.show();
        hb0Var.c(uwVar);
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z10) {
        this.b.setAllowSwipes(z10);
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        bi biVar = this.e;
        if (biVar.t2 != this.b) {
            return;
        }
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
        biVar.dismiss();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.hc(28), 150L);
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
    public final /* synthetic */ void r(int i3) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i3) {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void o(int i3, boolean z10) {
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13, String str2) {
    }
}
