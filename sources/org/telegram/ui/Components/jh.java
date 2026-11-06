package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jh implements org.telegram.ui.web.d0 {
    public ValueAnimator a;
    public final /* synthetic */ hi.c4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ di e;

    public jh(di diVar, hi.c4 c4Var, String str, long j3) {
        this.e = diVar;
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
        di diVar = this.e;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(diVar.D3);
        long j3 = this.d;
        return b02.j(j3) || org.telegram.messenger.qp.s1(diVar.D3).W6.contains(Long.valueOf(j3));
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z9) {
        org.telegram.messenger.g0.R3(this.e.R2.getBackButton(), z9 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
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
        di diVar = this.e;
        int i7 = diVar.D3;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z9 = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        hi.c4 c4Var = this.b;
        org.telegram.ui.hl0 hl0Var = null;
        if (z9) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, diVar.getContext(), null);
            u1Var.r(150L);
            bi.ea.y(i7, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new a2(u1Var, 1), new org.telegram.messenger.voip.k(25, c4Var, str));
            org.telegram.messenger.g0.v1(c4Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            org.telegram.messenger.qp.s1(i7).Y3(paymentForm.users, false);
            hl0Var = new org.telegram.ui.hl0(paymentForm, null, str, f2Var);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            hl0Var = new org.telegram.ui.hl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (hl0Var != null) {
            c4Var.J();
            org.telegram.messenger.g0.v1(c4Var);
            mb0 mb0Var = new mb0(f2Var.getParentActivity());
            mb0Var.show();
            hl0Var.Z0 = new a3.h((Object) mb0Var, (Object) c4Var, str, 25);
            hl0Var.Y0 = diVar.I0;
            mb0Var.c(hl0Var);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
        di diVar = this.e;
        RadialProgressView radialProgressView = diVar.w3;
        j6 j6Var = diVar.y3;
        vh vhVar = diVar.s2;
        hi.c4 c4Var = this.b;
        if (vhVar == c4Var) {
            if (c4Var.P || this.c != null) {
                j6Var.setClickable(z10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = 1;
                int i12 = 0;
                if (j3 != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new r5(j3, 1.4f, j6Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                    j6Var.setText(spannableStringBuilder);
                } else {
                    j6Var.setText(str);
                }
                j6Var.setTextColor(i10);
                j6Var.setEmojiColor(i10);
                boolean z13 = org.telegram.ui.web.x0.Q0;
                j6Var.setBackground(org.telegram.ui.ActionBar.k6.i0(i7, i0.a.h(i7) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (diVar.x3 != z9) {
                    diVar.x3 = z9;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new e6(this, 9));
                    this.a.addListener(new ch(this, z9, i12));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i10);
                if (diVar.v3 != z11) {
                    radialProgressView.animate().cancel();
                    if (z11) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).setDuration(250L).setListener(new ch(this, z11, i11)).start();
                }
            }
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void s() {
        vh vhVar = this.e.s2;
        hi.c4 c4Var = this.b;
        if (vhVar == c4Var && !c4Var.J.c) {
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
        di diVar = this.e;
        final int i11 = diVar.A4.b;
        final hi.t1 t1Var = new hi.t1();
        t1Var.c(t1Var.a, diVar.R1 ? i11 : 0, diVar.I0);
        diVar.R1 = z9;
        t1Var.c(t1Var.b, z9 ? i10 : 0, diVar.I0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(xq.f);
        final hi.c4 c4Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.bh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f10 = i0.a.f(floatValue, i11, i10);
                di diVar2 = jh.this.e;
                diVar2.h4 = f10;
                diVar2.g4 = true;
                r7 r7Var = diVar2.R2;
                if (r7Var != null) {
                    r7Var.updateColors();
                    r7Var.invalidate();
                }
                diVar2.A4.a(f10);
                lh.f fVar = diVar2.p3;
                if (fVar != null) {
                    fVar.invalidate();
                }
                c4Var.setCustomActionBarBackground(f10);
                diVar2.s2.invalidate();
                diVar2.l3.invalidate();
                t1Var.b(r7Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        di diVar = this.e;
        if (isEmpty) {
            org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
            if (f2Var instanceof org.telegram.ui.an) {
                ((org.telegram.ui.an) f2Var).Z.setFieldText("@" + org.telegram.messenger.t10.n(user) + " " + str);
            }
            diVar.a(true);
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
        org.telegram.ui.ww wwVar = new org.telegram.ui.ww(bundle);
        mb0 mb0Var = new mb0(diVar.getContext());
        wwVar.C2 = new a1.d(this, user, str, mb0Var, 10);
        mb0Var.show();
        mb0Var.c(wwVar);
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z9) {
        this.b.setAllowSwipes(z9);
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        di diVar = this.e;
        if (diVar.s2 != this.b) {
            return;
        }
        diVar.A0(false);
        diVar.getWindow().setSoftInputMode(48);
        diVar.dismiss();
        org.telegram.messenger.g0.i3(new org.telegram.messenger.pd(24), 150L);
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
